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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response RunTaskResult
 */
public class RunTaskResultJsonUnmarshaller implements
        Unmarshaller<RunTaskResult, JsonUnmarshallerContext> {

    public RunTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RunTaskResult runTaskResult = new RunTaskResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("tasks")) {
                runTaskResult.setTasks(new ListUnmarshaller<Task>(TaskJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("failures")) {
                runTaskResult.setFailures(new ListUnmarshaller<Failure>(FailureJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return runTaskResult;
    }

    private static RunTaskResultJsonUnmarshaller instance;

    public static RunTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RunTaskResultJsonUnmarshaller();
        return instance;
    }
}
