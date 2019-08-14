/**
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;

import java.security.Key;

/**
 * The interface that manages the generation
 * and retrieval of key used for encrypting
 * and decrypting data stored in SharedPreferences.
 */
interface KeyProvider {
    /**
     * Retrieves the key that is used for encrypting
     * and decrypting data.
     *
     * @param keyAlias The alias of the key held in AndroidKeyStore
     *                 if AndroidKeyStore is used for key generation.
     * @return the symmetric key that can be used to encrypt and
     *          decrypt data.
     */
    Key generateKey(final String keyAlias) throws KeyNotGeneratedException;

    Key retrieveKey(final String keyAlias) throws KeyNotFoundException;

    void deleteKey(final String keyAlias);
}
