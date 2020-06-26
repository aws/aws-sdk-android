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
 * JSON marshaller for POJO TensorBoardOutputConfig
 */
class TensorBoardOutputConfigJsonMarshaller {

    public void marshall(TensorBoardOutputConfig tensorBoardOutputConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (tensorBoardOutputConfig.getLocalPath() != null) {
            String localPath = tensorBoardOutputConfig.getLocalPath();
            jsonWriter.name("LocalPath");
            jsonWriter.value(localPath);
        }
        if (tensorBoardOutputConfig.getS3OutputPath() != null) {
            String s3OutputPath = tensorBoardOutputConfig.getS3OutputPath();
            jsonWriter.name("S3OutputPath");
            jsonWriter.value(s3OutputPath);
        }
        jsonWriter.endObject();
    }

    private static TensorBoardOutputConfigJsonMarshaller instance;

    public static TensorBoardOutputConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TensorBoardOutputConfigJsonMarshaller();
        return instance;
    }
}
