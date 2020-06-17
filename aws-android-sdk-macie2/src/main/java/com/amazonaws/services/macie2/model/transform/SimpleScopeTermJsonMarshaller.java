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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SimpleScopeTerm
 */
class SimpleScopeTermJsonMarshaller {

    public void marshall(SimpleScopeTerm simpleScopeTerm, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (simpleScopeTerm.getComparator() != null) {
            String comparator = simpleScopeTerm.getComparator();
            jsonWriter.name("comparator");
            jsonWriter.value(comparator);
        }
        if (simpleScopeTerm.getKey() != null) {
            String key = simpleScopeTerm.getKey();
            jsonWriter.name("key");
            jsonWriter.value(key);
        }
        if (simpleScopeTerm.getValues() != null) {
            java.util.List<String> values = simpleScopeTerm.getValues();
            jsonWriter.name("values");
            jsonWriter.beginArray();
            for (String valuesItem : values) {
                if (valuesItem != null) {
                    jsonWriter.value(valuesItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SimpleScopeTermJsonMarshaller instance;

    public static SimpleScopeTermJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SimpleScopeTermJsonMarshaller();
        return instance;
    }
}
