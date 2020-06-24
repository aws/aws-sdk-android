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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO InstanceTypeSpecification
 */
class InstanceTypeSpecificationJsonUnmarshaller implements
        Unmarshaller<InstanceTypeSpecification, JsonUnmarshallerContext> {

    public InstanceTypeSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InstanceTypeSpecification instanceTypeSpecification = new InstanceTypeSpecification();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("InstanceType")) {
                instanceTypeSpecification.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("WeightedCapacity")) {
                instanceTypeSpecification.setWeightedCapacity(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BidPrice")) {
                instanceTypeSpecification.setBidPrice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BidPriceAsPercentageOfOnDemandPrice")) {
                instanceTypeSpecification
                        .setBidPriceAsPercentageOfOnDemandPrice(DoubleJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Configurations")) {
                instanceTypeSpecification.setConfigurations(new ListUnmarshaller<Configuration>(
                        ConfigurationJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EbsBlockDevices")) {
                instanceTypeSpecification.setEbsBlockDevices(new ListUnmarshaller<EbsBlockDevice>(
                        EbsBlockDeviceJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("EbsOptimized")) {
                instanceTypeSpecification.setEbsOptimized(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return instanceTypeSpecification;
    }

    private static InstanceTypeSpecificationJsonUnmarshaller instance;

    public static InstanceTypeSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceTypeSpecificationJsonUnmarshaller();
        return instance;
    }
}
