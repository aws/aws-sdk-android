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

package com.amazonaws.services.ssm.model.transform;

import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetMaintenanceWindowExecutionTaskResult
 */
public class GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller implements
        Unmarshaller<GetMaintenanceWindowExecutionTaskResult, JsonUnmarshallerContext> {

    public GetMaintenanceWindowExecutionTaskResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        GetMaintenanceWindowExecutionTaskResult getMaintenanceWindowExecutionTaskResult = new GetMaintenanceWindowExecutionTaskResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WindowExecutionId")) {
                getMaintenanceWindowExecutionTaskResult.setWindowExecutionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskExecutionId")) {
                getMaintenanceWindowExecutionTaskResult.setTaskExecutionId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskArn")) {
                getMaintenanceWindowExecutionTaskResult.setTaskArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ServiceRole")) {
                getMaintenanceWindowExecutionTaskResult.setServiceRole(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                getMaintenanceWindowExecutionTaskResult.setType(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TaskParameters")) {
                getMaintenanceWindowExecutionTaskResult
                        .setTaskParameters(new ListUnmarshaller<java.util.Map<String, MaintenanceWindowTaskParameterValueExpression>>(
                                new MapUnmarshaller<MaintenanceWindowTaskParameterValueExpression>(
                                        MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller
                                                .getInstance()
                                )
                        )
                                .unmarshall(context));
            } else if (name.equals("Priority")) {
                getMaintenanceWindowExecutionTaskResult.setPriority(IntegerJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxConcurrency")) {
                getMaintenanceWindowExecutionTaskResult.setMaxConcurrency(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaxErrors")) {
                getMaintenanceWindowExecutionTaskResult.setMaxErrors(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                getMaintenanceWindowExecutionTaskResult.setStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusDetails")) {
                getMaintenanceWindowExecutionTaskResult.setStatusDetails(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                getMaintenanceWindowExecutionTaskResult.setStartTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                getMaintenanceWindowExecutionTaskResult.setEndTime(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getMaintenanceWindowExecutionTaskResult;
    }

    private static GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller instance;

    public static GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMaintenanceWindowExecutionTaskResultJsonUnmarshaller();
        return instance;
    }
}