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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UserSummary
 */
class UserSummaryJsonMarshaller {

    public void marshall(UserSummary userSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (userSummary.getId() != null) {
            String id = userSummary.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (userSummary.getArn() != null) {
            String arn = userSummary.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (userSummary.getUsername() != null) {
            String username = userSummary.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        jsonWriter.endObject();
    }

    private static UserSummaryJsonMarshaller instance;

    public static UserSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UserSummaryJsonMarshaller();
        return instance;
    }
}
