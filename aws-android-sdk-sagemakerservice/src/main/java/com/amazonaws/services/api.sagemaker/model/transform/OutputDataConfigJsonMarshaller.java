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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputDataConfig
 */
class OutputDataConfigJsonMarshaller {

    public void marshall(OutputDataConfig outputDataConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (outputDataConfig.getKmsKeyId() != null) {
            String kmsKeyId = outputDataConfig.getKmsKeyId();
            jsonWriter.name("KmsKeyId");
            jsonWriter.value(kmsKeyId);
        }
        if (outputDataConfig.getS3OutputPath() != null) {
            String s3OutputPath = outputDataConfig.getS3OutputPath();
            jsonWriter.name("S3OutputPath");
            jsonWriter.value(s3OutputPath);
        }
        jsonWriter.endObject();
    }

    private static OutputDataConfigJsonMarshaller instance;

    public static OutputDataConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputDataConfigJsonMarshaller();
        return instance;
    }
}
