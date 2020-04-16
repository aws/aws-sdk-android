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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PropertyNameQuery
 */
class PropertyNameQueryJsonMarshaller {

    public void marshall(PropertyNameQuery propertyNameQuery, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (propertyNameQuery.getPropertyNameHint() != null) {
            String propertyNameHint = propertyNameQuery.getPropertyNameHint();
            jsonWriter.name("PropertyNameHint");
            jsonWriter.value(propertyNameHint);
        }
        jsonWriter.endObject();
    }

    private static PropertyNameQueryJsonMarshaller instance;

    public static PropertyNameQueryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PropertyNameQueryJsonMarshaller();
        return instance;
    }
}
