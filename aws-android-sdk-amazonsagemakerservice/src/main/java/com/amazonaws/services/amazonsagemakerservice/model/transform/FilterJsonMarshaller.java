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
 * JSON marshaller for POJO Filter
 */
class FilterJsonMarshaller {

    public void marshall(Filter filter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (filter.getName() != null) {
            String name = filter.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (filter.getOperator() != null) {
            String operator = filter.getOperator();
            jsonWriter.name("Operator");
            jsonWriter.value(operator);
        }
        if (filter.getValue() != null) {
            String value = filter.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static FilterJsonMarshaller instance;

    public static FilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FilterJsonMarshaller();
        return instance;
    }
}
