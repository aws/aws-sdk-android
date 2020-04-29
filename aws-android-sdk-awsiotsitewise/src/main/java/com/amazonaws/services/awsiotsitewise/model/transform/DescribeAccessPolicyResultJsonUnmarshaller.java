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

package com.amazonaws.services.awsiotsitewise.model.transform;

import com.amazonaws.services.awsiotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeAccessPolicyResult
 */
public class DescribeAccessPolicyResultJsonUnmarshaller implements
        Unmarshaller<DescribeAccessPolicyResult, JsonUnmarshallerContext> {

    public DescribeAccessPolicyResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAccessPolicyResult describeAccessPolicyResult = new DescribeAccessPolicyResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("accessPolicyId")) {
                describeAccessPolicyResult.setAccessPolicyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessPolicyArn")) {
                describeAccessPolicyResult.setAccessPolicyArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessPolicyIdentity")) {
                describeAccessPolicyResult.setAccessPolicyIdentity(IdentityJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessPolicyResource")) {
                describeAccessPolicyResult.setAccessPolicyResource(ResourceJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessPolicyPermission")) {
                describeAccessPolicyResult.setAccessPolicyPermission(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessPolicyCreationDate")) {
                describeAccessPolicyResult.setAccessPolicyCreationDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("accessPolicyLastUpdateDate")) {
                describeAccessPolicyResult.setAccessPolicyLastUpdateDate(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeAccessPolicyResult;
    }

    private static DescribeAccessPolicyResultJsonUnmarshaller instance;

    public static DescribeAccessPolicyResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAccessPolicyResultJsonUnmarshaller();
        return instance;
    }
}
