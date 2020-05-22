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

package com.amazonaws.services.iotsitewise.model.transform;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProjectSummary
 */
class ProjectSummaryJsonMarshaller {

    public void marshall(ProjectSummary projectSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (projectSummary.getId() != null) {
            String id = projectSummary.getId();
            jsonWriter.name("id");
            jsonWriter.value(id);
        }
        if (projectSummary.getName() != null) {
            String name = projectSummary.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (projectSummary.getDescription() != null) {
            String description = projectSummary.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (projectSummary.getCreationDate() != null) {
            java.util.Date creationDate = projectSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        if (projectSummary.getLastUpdateDate() != null) {
            java.util.Date lastUpdateDate = projectSummary.getLastUpdateDate();
            jsonWriter.name("lastUpdateDate");
            jsonWriter.value(lastUpdateDate);
        }
        jsonWriter.endObject();
    }

    private static ProjectSummaryJsonMarshaller instance;

    public static ProjectSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProjectSummaryJsonMarshaller();
        return instance;
    }
}
