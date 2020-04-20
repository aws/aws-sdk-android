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

package com.amazonaws.services.awscostexplorerservice.model.transform;

import com.amazonaws.services.awscostexplorerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO CostCategory
 */
class CostCategoryJsonUnmarshaller implements Unmarshaller<CostCategory, JsonUnmarshallerContext> {

    public CostCategory unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        CostCategory costCategory = new CostCategory();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CostCategoryArn")) {
                costCategory.setCostCategoryArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveStart")) {
                costCategory.setEffectiveStart(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EffectiveEnd")) {
                costCategory.setEffectiveEnd(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                costCategory.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RuleVersion")) {
                costCategory.setRuleVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Rules")) {
                costCategory.setRules(new ListUnmarshaller<CostCategoryRule>(
                        CostCategoryRuleJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return costCategory;
    }

    private static CostCategoryJsonUnmarshaller instance;

    public static CostCategoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CostCategoryJsonUnmarshaller();
        return instance;
    }
}
