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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VTLDevice
 */
class VTLDeviceJsonUnmarshaller implements Unmarshaller<VTLDevice, JsonUnmarshallerContext> {

    public VTLDevice unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VTLDevice vTLDevice = new VTLDevice();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("VTLDeviceARN")) {
                vTLDevice.setVTLDeviceARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VTLDeviceType")) {
                vTLDevice.setVTLDeviceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VTLDeviceVendor")) {
                vTLDevice.setVTLDeviceVendor(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VTLDeviceProductIdentifier")) {
                vTLDevice.setVTLDeviceProductIdentifier(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeviceiSCSIAttributes")) {
                vTLDevice.setDeviceiSCSIAttributes(DeviceiSCSIAttributesJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vTLDevice;
    }

    private static VTLDeviceJsonUnmarshaller instance;

    public static VTLDeviceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VTLDeviceJsonUnmarshaller();
        return instance;
    }
}
