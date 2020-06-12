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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO NetworkInterface
 */
class NetworkInterfaceJsonUnmarshaller implements
        Unmarshaller<NetworkInterface, JsonUnmarshallerContext> {

    public NetworkInterface unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        NetworkInterface networkInterface = new NetworkInterface();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Ipv4Address")) {
                networkInterface.setIpv4Address(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MacAddress")) {
                networkInterface.setMacAddress(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Ipv6Address")) {
                networkInterface.setIpv6Address(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return networkInterface;
    }

    private static NetworkInterfaceJsonUnmarshaller instance;

    public static NetworkInterfaceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkInterfaceJsonUnmarshaller();
        return instance;
    }
}
