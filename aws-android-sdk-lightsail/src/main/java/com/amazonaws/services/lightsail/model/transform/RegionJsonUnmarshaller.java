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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Region
 */
class RegionJsonUnmarshaller implements Unmarshaller<Region, JsonUnmarshallerContext> {

    public Region unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Region region = new Region();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("continentCode")) {
                region.setContinentCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("description")) {
                region.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("displayName")) {
                region.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                region.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("availabilityZones")) {
                region.setAvailabilityZones(new ListUnmarshaller<AvailabilityZone>(
                        AvailabilityZoneJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("relationalDatabaseAvailabilityZones")) {
                region.setRelationalDatabaseAvailabilityZones(new ListUnmarshaller<AvailabilityZone>(
                        AvailabilityZoneJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return region;
    }

    private static RegionJsonUnmarshaller instance;

    public static RegionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegionJsonUnmarshaller();
        return instance;
    }
}
