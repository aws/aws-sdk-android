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
 * JSON marshaller for POJO ClassificationResultStatus
 */
class ClassificationResultStatusJsonMarshaller {

    public void marshall(ClassificationResultStatus classificationResultStatus,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (classificationResultStatus.getCode() != null) {
            String code = classificationResultStatus.getCode();
            jsonWriter.name("code");
            jsonWriter.value(code);
        }
        if (classificationResultStatus.getReason() != null) {
            String reason = classificationResultStatus.getReason();
            jsonWriter.name("reason");
            jsonWriter.value(reason);
        }
        jsonWriter.endObject();
    }

    private static ClassificationResultStatusJsonMarshaller instance;

    public static ClassificationResultStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassificationResultStatusJsonMarshaller();
        return instance;
    }
}
