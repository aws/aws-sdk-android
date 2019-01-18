/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SchemaAttributeType
 */
class SchemaAttributeTypeJsonUnmarshaller implements
        Unmarshaller<SchemaAttributeType, JsonUnmarshallerContext> {

    public SchemaAttributeType unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SchemaAttributeType schemaAttributeType = new SchemaAttributeType();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Name")) {
                schemaAttributeType.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AttributeDataType")) {
                schemaAttributeType.setAttributeDataType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DeveloperOnlyAttribute")) {
                schemaAttributeType.setDeveloperOnlyAttribute(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Mutable")) {
                schemaAttributeType.setMutable(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Required")) {
                schemaAttributeType.setRequired(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("NumberAttributeConstraints")) {
                schemaAttributeType
                        .setNumberAttributeConstraints(NumberAttributeConstraintsTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("StringAttributeConstraints")) {
                schemaAttributeType
                        .setStringAttributeConstraints(StringAttributeConstraintsTypeJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return schemaAttributeType;
    }

    private static SchemaAttributeTypeJsonUnmarshaller instance;

    public static SchemaAttributeTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SchemaAttributeTypeJsonUnmarshaller();
        return instance;
    }
}
