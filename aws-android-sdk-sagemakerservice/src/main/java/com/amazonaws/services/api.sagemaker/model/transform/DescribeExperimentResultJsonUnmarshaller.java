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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeExperimentResult
 */
public class DescribeExperimentResultJsonUnmarshaller implements
        Unmarshaller<DescribeExperimentResult, JsonUnmarshallerContext> {

    public DescribeExperimentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeExperimentResult describeExperimentResult = new DescribeExperimentResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ExperimentName")) {
                describeExperimentResult.setExperimentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentArn")) {
                describeExperimentResult.setExperimentArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                describeExperimentResult.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Source")) {
                describeExperimentResult.setSource(ExperimentSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                describeExperimentResult.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeExperimentResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                describeExperimentResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeExperimentResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                describeExperimentResult.setLastModifiedBy(UserContextJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeExperimentResult;
    }

    private static DescribeExperimentResultJsonUnmarshaller instance;

    public static DescribeExperimentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeExperimentResultJsonUnmarshaller();
        return instance;
    }
}
