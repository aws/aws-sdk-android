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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AttachmentInformation
 */
class AttachmentInformationJsonMarshaller {

    public void marshall(AttachmentInformation attachmentInformation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (attachmentInformation.getName() != null) {
            String name = attachmentInformation.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        jsonWriter.endObject();
    }

    private static AttachmentInformationJsonMarshaller instance;

    public static AttachmentInformationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AttachmentInformationJsonMarshaller();
        return instance;
    }
}