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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO StatusReport
 */
class StatusReportStaxMarshaller {

    public void marshall(StatusReport _statusReport, Request<?> request, String _prefix) {
        String prefix;
        if (_statusReport.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _statusReport.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_statusReport.getCheckedTime() != null) {
            prefix = _prefix + "CheckedTime";
            java.util.Date checkedTime = _statusReport.getCheckedTime();
            request.addParameter(prefix, StringUtils.fromDate(checkedTime));
        }
    }

    private static StatusReportStaxMarshaller instance;

    public static StatusReportStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StatusReportStaxMarshaller();
        return instance;
    }
}
