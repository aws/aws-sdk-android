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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VolumeStatusAction
 */
class VolumeStatusActionJsonMarshaller {

    public void marshall(VolumeStatusAction volumeStatusAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (volumeStatusAction.getCode() != null) {
            String code = volumeStatusAction.getCode();
            jsonWriter.name("Code");
            jsonWriter.value(code);
        }
        if (volumeStatusAction.getDescription() != null) {
            String description = volumeStatusAction.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (volumeStatusAction.getEventId() != null) {
            String eventId = volumeStatusAction.getEventId();
            jsonWriter.name("EventId");
            jsonWriter.value(eventId);
        }
        if (volumeStatusAction.getEventType() != null) {
            String eventType = volumeStatusAction.getEventType();
            jsonWriter.name("EventType");
            jsonWriter.value(eventType);
        }
        jsonWriter.endObject();
    }

    private static VolumeStatusActionJsonMarshaller instance;

    public static VolumeStatusActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VolumeStatusActionJsonMarshaller();
        return instance;
    }
}
