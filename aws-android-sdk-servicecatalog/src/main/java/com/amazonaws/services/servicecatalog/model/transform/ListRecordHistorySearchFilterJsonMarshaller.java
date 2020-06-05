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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ListRecordHistorySearchFilter
 */
class ListRecordHistorySearchFilterJsonMarshaller {

    public void marshall(ListRecordHistorySearchFilter listRecordHistorySearchFilter,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (listRecordHistorySearchFilter.getKey() != null) {
            String key = listRecordHistorySearchFilter.getKey();
            jsonWriter.name("Key");
            jsonWriter.value(key);
        }
        if (listRecordHistorySearchFilter.getValue() != null) {
            String value = listRecordHistorySearchFilter.getValue();
            jsonWriter.name("Value");
            jsonWriter.value(value);
        }
        jsonWriter.endObject();
    }

    private static ListRecordHistorySearchFilterJsonMarshaller instance;

    public static ListRecordHistorySearchFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ListRecordHistorySearchFilterJsonMarshaller();
        return instance;
    }
}
