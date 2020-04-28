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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ResourceRecord
 */
class ResourceRecordStaxMarshaller {

    public void marshall(ResourceRecord _resourceRecord, Request<?> request, String _prefix) {
        String prefix;
        if (_resourceRecord.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _resourceRecord.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
    }

    private static ResourceRecordStaxMarshaller instance;

    public static ResourceRecordStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceRecordStaxMarshaller();
        return instance;
    }
}
