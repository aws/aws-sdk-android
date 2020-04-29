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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO GatewaySummary
 */
class GatewaySummaryJsonUnmarshaller implements
        Unmarshaller<GatewaySummary, JsonUnmarshallerContext> {

    public GatewaySummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        GatewaySummary gatewaySummary = new GatewaySummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("gatewayId")) {
                gatewaySummary.setGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gatewayName")) {
                gatewaySummary.setGatewayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gatewayCapabilitySummaries")) {
                gatewaySummary
                        .setGatewayCapabilitySummaries(new ListUnmarshaller<GatewayCapabilitySummary>(
                                GatewayCapabilitySummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("creationDate")) {
                gatewaySummary.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdateDate")) {
                gatewaySummary.setLastUpdateDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return gatewaySummary;
    }

    private static GatewaySummaryJsonUnmarshaller instance;

    public static GatewaySummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewaySummaryJsonUnmarshaller();
        return instance;
    }
}
