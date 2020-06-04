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
 * JSON unmarshaller for response CreateResourceDataSyncResult
 */
public class CreateResourceDataSyncResultJsonUnmarshaller implements
        Unmarshaller<CreateResourceDataSyncResult, JsonUnmarshallerContext> {

    public CreateResourceDataSyncResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        CreateResourceDataSyncResult createResourceDataSyncResult = new CreateResourceDataSyncResult();

        return createResourceDataSyncResult;
    }

    private static CreateResourceDataSyncResultJsonUnmarshaller instance;

    public static CreateResourceDataSyncResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateResourceDataSyncResultJsonUnmarshaller();
        return instance;
    }
}