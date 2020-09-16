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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO StepExecutionFilter
 */
class StepExecutionFilterJsonMarshaller {

    public void marshall(StepExecutionFilter stepExecutionFilter, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (stepExecutionFilter.getKey() != null) {
            String key = stepExecutionFilter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (stepExecutionFilter.getValues() != null) {
            java.util.List<String> values = stepExecutionFilter.getValues();
            jsonWriter.name("Values");
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

    private static StepExecutionFilterJsonMarshaller instance;
    public static StepExecutionFilterJsonMarshaller getInstance() {
        if (instance == null) instance = new StepExecutionFilterJsonMarshaller();
        return instance;
    }
}
