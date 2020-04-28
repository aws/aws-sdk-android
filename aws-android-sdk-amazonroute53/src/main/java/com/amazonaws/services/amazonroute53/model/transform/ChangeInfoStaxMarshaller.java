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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ChangeInfo
 */
class ChangeInfoStaxMarshaller {

    public void marshall(ChangeInfo _changeInfo, Request<?> request, String _prefix) {
        String prefix;
        if (_changeInfo.getId() != null) {
            prefix = _prefix + "Id";
            String id = _changeInfo.getId();
            request.addParameter(prefix, StringUtils.fromString(id));
        }
        if (_changeInfo.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _changeInfo.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_changeInfo.getSubmittedAt() != null) {
            prefix = _prefix + "SubmittedAt";
            java.util.Date submittedAt = _changeInfo.getSubmittedAt();
            request.addParameter(prefix, StringUtils.fromDate(submittedAt));
        }
        if (_changeInfo.getComment() != null) {
            prefix = _prefix + "Comment";
            String comment = _changeInfo.getComment();
            request.addParameter(prefix, StringUtils.fromString(comment));
        }
    }

    private static ChangeInfoStaxMarshaller instance;

    public static ChangeInfoStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ChangeInfoStaxMarshaller();
        return instance;
    }
}
