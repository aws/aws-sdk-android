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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CloudWatchOutputConfig
 */
class CloudWatchOutputConfigJsonMarshaller {

    public void marshall(CloudWatchOutputConfig cloudWatchOutputConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cloudWatchOutputConfig.getCloudWatchLogGroupName() != null) {
            String cloudWatchLogGroupName = cloudWatchOutputConfig.getCloudWatchLogGroupName();
            jsonWriter.name("CloudWatchLogGroupName");
            jsonWriter.value(cloudWatchLogGroupName);
        }
        if (cloudWatchOutputConfig.getCloudWatchOutputEnabled() != null) {
            Boolean cloudWatchOutputEnabled = cloudWatchOutputConfig.getCloudWatchOutputEnabled();
            jsonWriter.name("CloudWatchOutputEnabled");
            jsonWriter.value(cloudWatchOutputEnabled);
        }
        jsonWriter.endObject();
    }

    private static CloudWatchOutputConfigJsonMarshaller instance;

    public static CloudWatchOutputConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchOutputConfigJsonMarshaller();
        return instance;
    }
}