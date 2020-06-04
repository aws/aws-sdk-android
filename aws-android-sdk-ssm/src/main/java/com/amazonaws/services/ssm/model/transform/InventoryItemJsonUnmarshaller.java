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
 * JSON unmarshaller for POJO InventoryItem
 */
class InventoryItemJsonUnmarshaller implements Unmarshaller<InventoryItem, JsonUnmarshallerContext> {

    public InventoryItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        InventoryItem inventoryItem = new InventoryItem();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TypeName")) {
                inventoryItem.setTypeName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SchemaVersion")) {
                inventoryItem.setSchemaVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CaptureTime")) {
                inventoryItem.setCaptureTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ContentHash")) {
                inventoryItem.setContentHash(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Content")) {
                inventoryItem.setContent(new ListUnmarshaller<java.util.Map<String, String>>(
                        new MapUnmarshaller<String>(StringJsonUnmarshaller.getInstance()
                        )
                        )
                                .unmarshall(context));
            } else if (name.equals("Context")) {
                inventoryItem.setContext(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return inventoryItem;
    }

    private static InventoryItemJsonUnmarshaller instance;

    public static InventoryItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InventoryItemJsonUnmarshaller();
        return instance;
    }
}