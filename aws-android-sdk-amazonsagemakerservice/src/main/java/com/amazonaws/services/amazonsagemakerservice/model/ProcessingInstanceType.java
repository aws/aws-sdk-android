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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Processing Instance Type
 */
public enum ProcessingInstanceType {

    MlT3Medium("ml.t3.medium"),
    MlT3Large("ml.t3.large"),
    MlT3Xlarge("ml.t3.xlarge"),
    MlT32xlarge("ml.t3.2xlarge"),
    MlM4Xlarge("ml.m4.xlarge"),
    MlM42xlarge("ml.m4.2xlarge"),
    MlM44xlarge("ml.m4.4xlarge"),
    MlM410xlarge("ml.m4.10xlarge"),
    MlM416xlarge("ml.m4.16xlarge"),
    MlC4Xlarge("ml.c4.xlarge"),
    MlC42xlarge("ml.c4.2xlarge"),
    MlC44xlarge("ml.c4.4xlarge"),
    MlC48xlarge("ml.c4.8xlarge"),
    MlP2Xlarge("ml.p2.xlarge"),
    MlP28xlarge("ml.p2.8xlarge"),
    MlP216xlarge("ml.p2.16xlarge"),
    MlP32xlarge("ml.p3.2xlarge"),
    MlP38xlarge("ml.p3.8xlarge"),
    MlP316xlarge("ml.p3.16xlarge"),
    MlC5Xlarge("ml.c5.xlarge"),
    MlC52xlarge("ml.c5.2xlarge"),
    MlC54xlarge("ml.c5.4xlarge"),
    MlC59xlarge("ml.c5.9xlarge"),
    MlC518xlarge("ml.c5.18xlarge"),
    MlM5Large("ml.m5.large"),
    MlM5Xlarge("ml.m5.xlarge"),
    MlM52xlarge("ml.m5.2xlarge"),
    MlM54xlarge("ml.m5.4xlarge"),
    MlM512xlarge("ml.m5.12xlarge"),
    MlM524xlarge("ml.m5.24xlarge"),
    MlR5Large("ml.r5.large"),
    MlR5Xlarge("ml.r5.xlarge"),
    MlR52xlarge("ml.r5.2xlarge"),
    MlR54xlarge("ml.r5.4xlarge"),
    MlR58xlarge("ml.r5.8xlarge"),
    MlR512xlarge("ml.r5.12xlarge"),
    MlR516xlarge("ml.r5.16xlarge"),
    MlR524xlarge("ml.r5.24xlarge");

    private String value;

    private ProcessingInstanceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    private static final Map<String, ProcessingInstanceType> enumMap;
    static {
        enumMap = new HashMap<String, ProcessingInstanceType>();
        enumMap.put("ml.t3.medium", MlT3Medium);
        enumMap.put("ml.t3.large", MlT3Large);
        enumMap.put("ml.t3.xlarge", MlT3Xlarge);
        enumMap.put("ml.t3.2xlarge", MlT32xlarge);
        enumMap.put("ml.m4.xlarge", MlM4Xlarge);
        enumMap.put("ml.m4.2xlarge", MlM42xlarge);
        enumMap.put("ml.m4.4xlarge", MlM44xlarge);
        enumMap.put("ml.m4.10xlarge", MlM410xlarge);
        enumMap.put("ml.m4.16xlarge", MlM416xlarge);
        enumMap.put("ml.c4.xlarge", MlC4Xlarge);
        enumMap.put("ml.c4.2xlarge", MlC42xlarge);
        enumMap.put("ml.c4.4xlarge", MlC44xlarge);
        enumMap.put("ml.c4.8xlarge", MlC48xlarge);
        enumMap.put("ml.p2.xlarge", MlP2Xlarge);
        enumMap.put("ml.p2.8xlarge", MlP28xlarge);
        enumMap.put("ml.p2.16xlarge", MlP216xlarge);
        enumMap.put("ml.p3.2xlarge", MlP32xlarge);
        enumMap.put("ml.p3.8xlarge", MlP38xlarge);
        enumMap.put("ml.p3.16xlarge", MlP316xlarge);
        enumMap.put("ml.c5.xlarge", MlC5Xlarge);
        enumMap.put("ml.c5.2xlarge", MlC52xlarge);
        enumMap.put("ml.c5.4xlarge", MlC54xlarge);
        enumMap.put("ml.c5.9xlarge", MlC59xlarge);
        enumMap.put("ml.c5.18xlarge", MlC518xlarge);
        enumMap.put("ml.m5.large", MlM5Large);
        enumMap.put("ml.m5.xlarge", MlM5Xlarge);
        enumMap.put("ml.m5.2xlarge", MlM52xlarge);
        enumMap.put("ml.m5.4xlarge", MlM54xlarge);
        enumMap.put("ml.m5.12xlarge", MlM512xlarge);
        enumMap.put("ml.m5.24xlarge", MlM524xlarge);
        enumMap.put("ml.r5.large", MlR5Large);
        enumMap.put("ml.r5.xlarge", MlR5Xlarge);
        enumMap.put("ml.r5.2xlarge", MlR52xlarge);
        enumMap.put("ml.r5.4xlarge", MlR54xlarge);
        enumMap.put("ml.r5.8xlarge", MlR58xlarge);
        enumMap.put("ml.r5.12xlarge", MlR512xlarge);
        enumMap.put("ml.r5.16xlarge", MlR516xlarge);
        enumMap.put("ml.r5.24xlarge", MlR524xlarge);
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value real value
     * @return ProcessingInstanceType corresponding to the value
     */
    public static ProcessingInstanceType fromValue(String value) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if (enumMap.containsKey(value)) {
            return enumMap.get(value);
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
