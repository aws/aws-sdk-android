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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceDataSyncOrganizationalUnit
 */
class ResourceDataSyncOrganizationalUnitJsonMarshaller {

    public void marshall(ResourceDataSyncOrganizationalUnit resourceDataSyncOrganizationalUnit, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceDataSyncOrganizationalUnit.getOrganizationalUnitId() != null) {
            String organizationalUnitId = resourceDataSyncOrganizationalUnit.getOrganizationalUnitId();
            jsonWriter.name("OrganizationalUnitId");
            jsonWriter.value(organizationalUnitId);
        }
        jsonWriter.endObject();
    }

    private static ResourceDataSyncOrganizationalUnitJsonMarshaller instance;
    public static ResourceDataSyncOrganizationalUnitJsonMarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncOrganizationalUnitJsonMarshaller();
        return instance;
    }
}
