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
 * JSON unmarshaller for response ListVolumesResult
 */
public class ListVolumesResultJsonUnmarshaller implements
        Unmarshaller<ListVolumesResult, JsonUnmarshallerContext> {

    public ListVolumesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListVolumesResult listVolumesResult = new ListVolumesResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("GatewayARN")) {
                listVolumesResult.setGatewayARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Marker")) {
                listVolumesResult.setMarker(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VolumeInfos")) {
                listVolumesResult.setVolumeInfos(new ListUnmarshaller<VolumeInfo>(
                        VolumeInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listVolumesResult;
    }

    private static ListVolumesResultJsonUnmarshaller instance;

    public static ListVolumesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListVolumesResultJsonUnmarshaller();
        return instance;
    }
}
