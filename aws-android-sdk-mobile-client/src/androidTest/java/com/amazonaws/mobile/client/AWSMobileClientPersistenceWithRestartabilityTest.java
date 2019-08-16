package com.amazonaws.mobile.client;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.mobile.client.results.SignInResult;
import com.amazonaws.mobile.client.results.SignInState;
import com.amazonaws.mobile.client.results.Token;
import com.amazonaws.mobile.client.results.Tokens;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider;
import com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProviderClient;
import com.amazonaws.services.cognitoidentityprovider.model.AdminConfirmSignUpRequest;
import com.amazonaws.services.cognitoidentityprovider.model.AdminDeleteUserRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ListUsersRequest;
import com.amazonaws.services.cognitoidentityprovider.model.ListUsersResult;
import com.amazonaws.services.cognitoidentityprovider.model.UserNotConfirmedException;
import com.amazonaws.services.cognitoidentityprovider.model.UserType;

import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(AndroidJUnit4.class)
public class AWSMobileClientPersistenceWithRestartabilityTest extends AWSMobileClientTestBase {
    private static final String TAG = AWSMobileClientPersistenceTest.class.getSimpleName();

    public static final String EMAIL = "somebody@email.com";
    public static final String USERNAME = "somebody";
    public static final String PASSWORD = "1234Password!";
    public static String IDENTITY_ID;

    static BasicAWSCredentials adminCreds;
    static AmazonCognitoIdentityProvider userpoolLL;

    static {
        try {
            adminCreds = new BasicAWSCredentials(getPackageConfigure().getString("create_cognito_user_access_key")
                    , getPackageConfigure().getString("create_cognito_user_secret_key"));
            IDENTITY_ID = getPackageConfigure().getString("identity_id");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Populated from awsconfiguration.json
    static Regions clientRegion = Regions.US_WEST_2;
    static String userPoolId;
    static String identityPoolId;

    Context appContext;
    AWSMobileClient auth;
    UserStateListener listener;
    String username;

    public static synchronized AmazonCognitoIdentityProvider getUserpoolLL() {
        if (userpoolLL == null) {
            userpoolLL = new AmazonCognitoIdentityProviderClient(adminCreds);
            userpoolLL.setRegion(Region.getRegion(clientRegion));
        }
        return userpoolLL;
    }

    public static void createUser(final AWSMobileClient auth,
                                  final String userpoolId,
                                  final String username,
                                  final String password,
                                  final String email) throws Exception {
        HashMap<String, String> userAttributes = new HashMap<String, String>();
        userAttributes.put("email", email);
        auth.signUp(username, password, userAttributes,null);

        AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
        adminConfirmSignUpRequest.withUsername(username).withUserPoolId(userpoolId);
        getUserpoolLL().adminConfirmSignUp(adminConfirmSignUpRequest);
    }

    public static void deleteAllUsers(final String userpoolId) {
        ListUsersResult listUsersResult;
        do {
            ListUsersRequest listUsersRequest = new ListUsersRequest()
                    .withUserPoolId(userpoolId)
                    .withLimit(60);
            listUsersResult = getUserpoolLL().listUsers(listUsersRequest);
            for (UserType user : listUsersResult.getUsers()) {
                if (USERNAME.equals(user.getUsername())
                        || "bimin".equals(user.getUsername())) {
                    // This user is saved to test the identity id permanence
                    continue;
                }
                boolean retryConfirmSignUp = false;
                do {
                    try {
                        Log.d(TAG, "deleteAllUsers: " + user.getUsername());
                        getUserpoolLL().adminDeleteUser(new AdminDeleteUserRequest().withUsername(user.getUsername()).withUserPoolId(userpoolId));
                    } catch (UserNotConfirmedException e) {
                        if (!retryConfirmSignUp) {
                            AdminConfirmSignUpRequest adminConfirmSignUpRequest = new AdminConfirmSignUpRequest();
                            adminConfirmSignUpRequest.withUsername(user.getUsername()).withUserPoolId(userpoolId);
                            getUserpoolLL().adminConfirmSignUp(adminConfirmSignUpRequest);
                            retryConfirmSignUp = true;
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e1) {
                                e1.printStackTrace();
                            }
                        } else {
                            retryConfirmSignUp = false;
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "deleteAllUsers: Some error trying to delete user", e);
                    }
                } while (retryConfirmSignUp);
            }
        } while (listUsersResult.getPaginationToken() != null);
    }

    @BeforeClass
    public static void beforeClass() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();

        final CountDownLatch latch = new CountDownLatch(1);
        AWSMobileClient.getInstance().initialize(appContext, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                latch.countDown();
            }

            @Override
            public void onError(Exception e) {
                latch.countDown();
            }
        });
        latch.await();

        final AWSConfiguration awsConfiguration = AWSMobileClient.getInstance().getConfiguration();

        JSONObject userPoolConfig = awsConfiguration.optJsonObject("CognitoUserPool");
        assertNotNull(userPoolConfig);
        clientRegion = Regions.fromName(userPoolConfig.getString("Region"));
        userPoolId = userPoolConfig.getString("PoolId");

        JSONObject identityPoolConfig =
                awsConfiguration.optJsonObject("CredentialsProvider").getJSONObject(
                        "CognitoIdentity").getJSONObject("Default");
        assertNotNull(identityPoolConfig);
        identityPoolId = identityPoolConfig.getString("PoolId");

        deleteAllUsers(userPoolId);
    }

    @Before
    public void before() throws Exception {
        appContext = InstrumentationRegistry.getTargetContext();
        auth = AWSMobileClient.getInstance();
        auth.signOut();

        username = "testUser" + System.currentTimeMillis() + new Random().nextInt();
        createUser(auth, userPoolId, username, PASSWORD, EMAIL);
    }

    @After
    public void after() {
        auth.removeUserStateListener(listener);
        auth.listeners.clear();
        auth.signOut();

        appContext.getSharedPreferences(AWSMobileClient.SHARED_PREFERENCES_KEY,
                Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
        deleteAllEncryptionKeys();
    }

    // When the encryption keys are lost and retrieval of
    // tokens from persistent store fails, calling getTokens()
    // will throw an exception and the UserStateListener will
    // be triggered the userState as SIGNED_OUT. Followed by a
    // SignIn operation, getTokens() will retrieve
    // the tokens successfully and trigger the userState as
    // SIGNED_IN.
    @Test
    public void testGetTokens() throws Exception {
        signInAndVerifySignIn();

        final CountDownLatch stateNotificationLatch = new CountDownLatch(1);
        final AtomicReference<UserStateDetails> userState = new AtomicReference<UserStateDetails>();
        listener = new UserStateListener() {
            @Override
            public void onUserStateChanged(UserStateDetails details) {
                userState.set(details);
                stateNotificationLatch.countDown();
            }
        };
        auth.addUserStateListener(listener);

        deleteAllEncryptionKeys();

        initializeAWSMobileClient();

        try {
            auth.getTokens();
        } catch (Exception ex) {
            assertEquals("getTokens does not support retrieving tokens while signed-out", ex.getMessage());
        }

        stateNotificationLatch.await(10, TimeUnit.SECONDS);
        assertEquals(UserState.SIGNED_OUT, userState.get().getUserState());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        Tokens tokens = auth.getTokens();
        verifyTokens(tokens);

        assertEquals(UserState.SIGNED_IN, userState.get().getUserState());
    }

    @Test
    public void testGetUserName() {
        signInAndVerifySignIn();
        assertNotNull(auth.getUsername());

        deleteAllEncryptionKeys();

        assertNull(auth.getUsername());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        assertNotNull(auth.getUsername());
    }

    @Test
    public void testGetUserAttributes() throws Exception {
        signInAndVerifySignIn();

        Map<String, String> userAttributes = auth.getUserAttributes();
        assertNotNull(userAttributes);
        assertEquals(getPackageConfigure().getString("email"),
                userAttributes.get("email"));

        deleteAllEncryptionKeys();

        initializeAWSMobileClient();

        try {
            auth.getUserAttributes();
        } catch (Exception ex) {
            assertEquals("Operation requires a signed-in state",
                    ex.getMessage());
        }

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }


        userAttributes = auth.getUserAttributes();
        assertNotNull(userAttributes);
        assertEquals(getPackageConfigure().getString("email"),
                userAttributes.get("email"));
    }

    @Test
    public void testIsSignedIn() {
        signInAndVerifySignIn();

        assertTrue(auth.isSignedIn());
        deleteAllEncryptionKeys();

        initializeAWSMobileClient();
        assertFalse(auth.isSignedIn());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        assertTrue(auth.isSignedIn());
    }

    @Test
    public void testGetCredentials() {
        signInAndVerifySignIn();

        AWSCredentials awsCredentialsBeforeEncryptionKeysAreLost = auth.getCredentials();
        assertNotNull(awsCredentialsBeforeEncryptionKeysAreLost);

        deleteAllEncryptionKeys();

        initializeAWSMobileClient();
        AWSCredentials awsCredentialsAfterEncryptionKeysAreLost = auth.getCredentials();
        assertNotNull(awsCredentialsAfterEncryptionKeysAreLost);

        assertEquals(awsCredentialsBeforeEncryptionKeysAreLost.getAWSAccessKeyId(),
                awsCredentialsAfterEncryptionKeysAreLost.getAWSAccessKeyId());
        assertEquals(awsCredentialsBeforeEncryptionKeysAreLost.getAWSSecretKey(),
                awsCredentialsAfterEncryptionKeysAreLost.getAWSSecretKey());
    }

    @Test
    public void testGetIdentityId() {
        signInAndVerifySignIn();

        String identityId = auth.getIdentityId();
        assertNotNull(identityId);
        deleteAllEncryptionKeys();

        initializeAWSMobileClient();
        assertNull(auth.getIdentityId());

        try {
            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertNotNull(signInResult);
            assertEquals(SignInState.DONE, signInResult.getSignInState());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }

        String identityIdAfterSecondSignIn = auth.getIdentityId();
        assertNotNull(identityIdAfterSecondSignIn);

        assertEquals(identityId, identityIdAfterSecondSignIn);
    }

    private void signInAndVerifySignIn() {
        try {
            final CountDownLatch stateNotificationLatch = new CountDownLatch(1);
            final AtomicReference<UserStateDetails> userState = new AtomicReference<UserStateDetails>();
            listener = new UserStateListener() {
                @Override
                public void onUserStateChanged(UserStateDetails details) {
                    userState.set(details);
                    auth.removeUserStateListener(listener);
                    stateNotificationLatch.countDown();
                }
            };
            auth.addUserStateListener(listener);

            final SignInResult signInResult = auth.signIn(username, PASSWORD, null);
            assertEquals("Cannot support MFA in tests", SignInState.DONE, signInResult.getSignInState());

            assertTrue("isSignedIn is true", auth.isSignedIn());

            assertEquals(username, auth.getUsername());

            // Check credentials are available
            final AWSCredentials credentials = auth.getCredentials();
            assertNotNull("Credentials are null", credentials);
            assertNotNull("Access key is null", credentials.getAWSAccessKeyId());
            assertNotNull("Secret key is null", credentials.getAWSSecretKey());

            Tokens tokens = auth.getTokens();
            assertNotNull(tokens);

            Token accessToken = tokens.getAccessToken();
            assertNotNull(accessToken);
            assertTrue("Access token should not be expired", accessToken.getExpiration().after(new Date()));
            Token idToken = tokens.getIdToken();
            assertNotNull(idToken);
            assertTrue("Id token should not be expired", idToken.getExpiration().after(new Date()));
            Token refreshToken = tokens.getRefreshToken();
            assertNotNull(refreshToken);

            // Check one attribute
            final Map<String, String> userAttributes = auth.getUserAttributes();
            assertEquals(getPackageConfigure().getString("email"), userAttributes.get("email"));
            stateNotificationLatch.await(5, TimeUnit.SECONDS);

            UserStateDetails userStateDetails = userState.get();
            assertEquals(userStateDetails.getUserState(), UserState.SIGNED_IN);
            Map<String, String> details = userStateDetails.getDetails();
            assertNotEquals(getPackageConfigure().getString("identity_id"), details.toString());
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }

    private void initializeAWSMobileClient() {
        // Expect the UserState to be SIGNED_OUT
        final CountDownLatch waitForAWSMobileClientToBeInitialized = new CountDownLatch(1);
        AWSMobileClient.getInstance().initialize(appContext, new Callback<UserStateDetails>() {
            @Override
            public void onResult(UserStateDetails result) {
                assertEquals(UserState.SIGNED_OUT,
                        result.getUserState());
                waitForAWSMobileClientToBeInitialized.countDown();
            }

            @Override
            public void onError(Exception e) {
                fail(e.getMessage());
                waitForAWSMobileClientToBeInitialized.countDown();
            }
        });

        try {
            waitForAWSMobileClientToBeInitialized.await();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
