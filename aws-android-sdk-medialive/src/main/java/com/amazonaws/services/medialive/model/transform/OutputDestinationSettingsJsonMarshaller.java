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

package com.amazonaws.services.medialive.model.transform;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OutputDestinationSettings
 */
class OutputDestinationSettingsJsonMarshaller {

    public void marshall(OutputDestinationSettings outputDestinationSettings,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (outputDestinationSettings.getPasswordParam() != null) {
            String passwordParam = outputDestinationSettings.getPasswordParam();
            jsonWriter.name("PasswordParam");
            jsonWriter.value(passwordParam);
        }
        if (outputDestinationSettings.getStreamName() != null) {
            String streamName = outputDestinationSettings.getStreamName();
            jsonWriter.name("StreamName");
            jsonWriter.value(streamName);
        }
        if (outputDestinationSettings.getUrl() != null) {
            String url = outputDestinationSettings.getUrl();
            jsonWriter.name("Url");
            jsonWriter.value(url);
        }
        if (outputDestinationSettings.getUsername() != null) {
            String username = outputDestinationSettings.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        jsonWriter.endObject();
    }

    private static OutputDestinationSettingsJsonMarshaller instance;

    public static OutputDestinationSettingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OutputDestinationSettingsJsonMarshaller();
        return instance;
    }
}
