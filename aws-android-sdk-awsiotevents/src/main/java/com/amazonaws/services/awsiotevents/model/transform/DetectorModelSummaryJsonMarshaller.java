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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DetectorModelSummary
 */
class DetectorModelSummaryJsonMarshaller {

    public void marshall(DetectorModelSummary detectorModelSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (detectorModelSummary.getDetectorModelName() != null) {
            String detectorModelName = detectorModelSummary.getDetectorModelName();
            jsonWriter.name("detectorModelName");
            jsonWriter.value(detectorModelName);
        }
        if (detectorModelSummary.getDetectorModelDescription() != null) {
            String detectorModelDescription = detectorModelSummary.getDetectorModelDescription();
            jsonWriter.name("detectorModelDescription");
            jsonWriter.value(detectorModelDescription);
        }
        if (detectorModelSummary.getCreationTime() != null) {
            java.util.Date creationTime = detectorModelSummary.getCreationTime();
            jsonWriter.name("creationTime");
            jsonWriter.value(creationTime);
        }
        jsonWriter.endObject();
    }

    private static DetectorModelSummaryJsonMarshaller instance;

    public static DetectorModelSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DetectorModelSummaryJsonMarshaller();
        return instance;
    }
}
