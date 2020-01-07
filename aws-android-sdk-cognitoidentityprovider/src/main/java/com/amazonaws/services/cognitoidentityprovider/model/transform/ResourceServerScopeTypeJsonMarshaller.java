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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceServerScopeType
 */
class ResourceServerScopeTypeJsonMarshaller {

    public void marshall(ResourceServerScopeType resourceServerScopeType, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (resourceServerScopeType.getScopeName() != null) {
            String scopeName = resourceServerScopeType.getScopeName();
            jsonWriter.name("ScopeName");
            jsonWriter.value(scopeName);
        }
        if (resourceServerScopeType.getScopeDescription() != null) {
            String scopeDescription = resourceServerScopeType.getScopeDescription();
            jsonWriter.name("ScopeDescription");
            jsonWriter.value(scopeDescription);
        }
        jsonWriter.endObject();
    }

    private static ResourceServerScopeTypeJsonMarshaller instance;

    public static ResourceServerScopeTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceServerScopeTypeJsonMarshaller();
        return instance;
    }
}
