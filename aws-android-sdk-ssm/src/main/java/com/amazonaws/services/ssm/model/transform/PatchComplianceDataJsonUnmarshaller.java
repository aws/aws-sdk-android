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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PatchComplianceData
 */
class PatchComplianceDataJsonUnmarshaller implements
        Unmarshaller<PatchComplianceData, JsonUnmarshallerContext> {

    public PatchComplianceData unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PatchComplianceData patchComplianceData = new PatchComplianceData();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Title")) {
                patchComplianceData.setTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KBId")) {
                patchComplianceData.setKBId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Classification")) {
                patchComplianceData.setClassification(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Severity")) {
                patchComplianceData.setSeverity(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                patchComplianceData.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstalledTime")) {
                patchComplianceData.setInstalledTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return patchComplianceData;
    }

    private static PatchComplianceDataJsonUnmarshaller instance;

    public static PatchComplianceDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PatchComplianceDataJsonUnmarshaller();
        return instance;
    }
}