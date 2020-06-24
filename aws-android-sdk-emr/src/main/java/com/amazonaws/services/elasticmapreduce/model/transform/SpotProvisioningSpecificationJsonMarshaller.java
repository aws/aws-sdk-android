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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SpotProvisioningSpecification
 */
class SpotProvisioningSpecificationJsonMarshaller {

    public void marshall(SpotProvisioningSpecification spotProvisioningSpecification,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (spotProvisioningSpecification.getTimeoutDurationMinutes() != null) {
            Integer timeoutDurationMinutes = spotProvisioningSpecification
                    .getTimeoutDurationMinutes();
            jsonWriter.name("TimeoutDurationMinutes");
            jsonWriter.value(timeoutDurationMinutes);
        }
        if (spotProvisioningSpecification.getTimeoutAction() != null) {
            String timeoutAction = spotProvisioningSpecification.getTimeoutAction();
            jsonWriter.name("TimeoutAction");
            jsonWriter.value(timeoutAction);
        }
        if (spotProvisioningSpecification.getBlockDurationMinutes() != null) {
            Integer blockDurationMinutes = spotProvisioningSpecification.getBlockDurationMinutes();
            jsonWriter.name("BlockDurationMinutes");
            jsonWriter.value(blockDurationMinutes);
        }
        if (spotProvisioningSpecification.getAllocationStrategy() != null) {
            String allocationStrategy = spotProvisioningSpecification.getAllocationStrategy();
            jsonWriter.name("AllocationStrategy");
            jsonWriter.value(allocationStrategy);
        }
        jsonWriter.endObject();
    }

    private static SpotProvisioningSpecificationJsonMarshaller instance;

    public static SpotProvisioningSpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SpotProvisioningSpecificationJsonMarshaller();
        return instance;
    }
}
