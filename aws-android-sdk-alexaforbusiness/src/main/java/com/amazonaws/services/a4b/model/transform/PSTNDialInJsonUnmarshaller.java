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

package com.amazonaws.services.a4b.model.transform;

import com.amazonaws.services.a4b.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PSTNDialIn
 */
class PSTNDialInJsonUnmarshaller implements Unmarshaller<PSTNDialIn, JsonUnmarshallerContext> {

    public PSTNDialIn unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PSTNDialIn pSTNDialIn = new PSTNDialIn();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CountryCode")) {
                pSTNDialIn.setCountryCode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PhoneNumber")) {
                pSTNDialIn.setPhoneNumber(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OneClickIdDelay")) {
                pSTNDialIn.setOneClickIdDelay(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OneClickPinDelay")) {
                pSTNDialIn.setOneClickPinDelay(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return pSTNDialIn;
    }

    private static PSTNDialInJsonUnmarshaller instance;

    public static PSTNDialInJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PSTNDialInJsonUnmarshaller();
        return instance;
    }
}
