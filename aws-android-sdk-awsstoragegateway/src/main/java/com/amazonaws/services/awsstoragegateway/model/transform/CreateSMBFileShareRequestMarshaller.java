/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.awsstoragegateway.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for CreateSMBFileShareRequest
 */
public class CreateSMBFileShareRequestMarshaller implements
        Marshaller<Request<CreateSMBFileShareRequest>, CreateSMBFileShareRequest> {

    public Request<CreateSMBFileShareRequest> marshall(
            CreateSMBFileShareRequest createSMBFileShareRequest) {
        if (createSMBFileShareRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateSMBFileShareRequest)");
        }

        Request<CreateSMBFileShareRequest> request = new DefaultRequest<CreateSMBFileShareRequest>(
                createSMBFileShareRequest, "AWSStorageGateway");
        String target = "StorageGateway_20130630.CreateSMBFileShare";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (createSMBFileShareRequest.getClientToken() != null) {
                String clientToken = createSMBFileShareRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (createSMBFileShareRequest.getGatewayARN() != null) {
                String gatewayARN = createSMBFileShareRequest.getGatewayARN();
                jsonWriter.name("GatewayARN");
                jsonWriter.value(gatewayARN);
            }
            if (createSMBFileShareRequest.getKMSEncrypted() != null) {
                Boolean kMSEncrypted = createSMBFileShareRequest.getKMSEncrypted();
                jsonWriter.name("KMSEncrypted");
                jsonWriter.value(kMSEncrypted);
            }
            if (createSMBFileShareRequest.getKMSKey() != null) {
                String kMSKey = createSMBFileShareRequest.getKMSKey();
                jsonWriter.name("KMSKey");
                jsonWriter.value(kMSKey);
            }
            if (createSMBFileShareRequest.getRole() != null) {
                String role = createSMBFileShareRequest.getRole();
                jsonWriter.name("Role");
                jsonWriter.value(role);
            }
            if (createSMBFileShareRequest.getLocationARN() != null) {
                String locationARN = createSMBFileShareRequest.getLocationARN();
                jsonWriter.name("LocationARN");
                jsonWriter.value(locationARN);
            }
            if (createSMBFileShareRequest.getDefaultStorageClass() != null) {
                String defaultStorageClass = createSMBFileShareRequest.getDefaultStorageClass();
                jsonWriter.name("DefaultStorageClass");
                jsonWriter.value(defaultStorageClass);
            }
            if (createSMBFileShareRequest.getObjectACL() != null) {
                String objectACL = createSMBFileShareRequest.getObjectACL();
                jsonWriter.name("ObjectACL");
                jsonWriter.value(objectACL);
            }
            if (createSMBFileShareRequest.getReadOnly() != null) {
                Boolean readOnly = createSMBFileShareRequest.getReadOnly();
                jsonWriter.name("ReadOnly");
                jsonWriter.value(readOnly);
            }
            if (createSMBFileShareRequest.getGuessMIMETypeEnabled() != null) {
                Boolean guessMIMETypeEnabled = createSMBFileShareRequest.getGuessMIMETypeEnabled();
                jsonWriter.name("GuessMIMETypeEnabled");
                jsonWriter.value(guessMIMETypeEnabled);
            }
            if (createSMBFileShareRequest.getRequesterPays() != null) {
                Boolean requesterPays = createSMBFileShareRequest.getRequesterPays();
                jsonWriter.name("RequesterPays");
                jsonWriter.value(requesterPays);
            }
            if (createSMBFileShareRequest.getSMBACLEnabled() != null) {
                Boolean sMBACLEnabled = createSMBFileShareRequest.getSMBACLEnabled();
                jsonWriter.name("SMBACLEnabled");
                jsonWriter.value(sMBACLEnabled);
            }
            if (createSMBFileShareRequest.getAdminUserList() != null) {
                java.util.List<String> adminUserList = createSMBFileShareRequest.getAdminUserList();
                jsonWriter.name("AdminUserList");
                jsonWriter.beginArray();
                for (String adminUserListItem : adminUserList) {
                    if (adminUserListItem != null) {
                        jsonWriter.value(adminUserListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSMBFileShareRequest.getValidUserList() != null) {
                java.util.List<String> validUserList = createSMBFileShareRequest.getValidUserList();
                jsonWriter.name("ValidUserList");
                jsonWriter.beginArray();
                for (String validUserListItem : validUserList) {
                    if (validUserListItem != null) {
                        jsonWriter.value(validUserListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSMBFileShareRequest.getInvalidUserList() != null) {
                java.util.List<String> invalidUserList = createSMBFileShareRequest
                        .getInvalidUserList();
                jsonWriter.name("InvalidUserList");
                jsonWriter.beginArray();
                for (String invalidUserListItem : invalidUserList) {
                    if (invalidUserListItem != null) {
                        jsonWriter.value(invalidUserListItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (createSMBFileShareRequest.getAuditDestinationARN() != null) {
                String auditDestinationARN = createSMBFileShareRequest.getAuditDestinationARN();
                jsonWriter.name("AuditDestinationARN");
                jsonWriter.value(auditDestinationARN);
            }
            if (createSMBFileShareRequest.getAuthentication() != null) {
                String authentication = createSMBFileShareRequest.getAuthentication();
                jsonWriter.name("Authentication");
                jsonWriter.value(authentication);
            }
            if (createSMBFileShareRequest.getTags() != null) {
                java.util.List<Tag> tags = createSMBFileShareRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
