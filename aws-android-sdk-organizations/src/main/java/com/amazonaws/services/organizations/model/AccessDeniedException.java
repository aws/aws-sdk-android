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

package com.amazonaws.services.organizations.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * You don't have permissions to perform the requested operation. The user or
 * role that is making the request must have at least one IAM permissions policy
 * attached that grants the required permissions. For more information, see <a
 * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
 * Management</a> in the <i>IAM User Guide.</i>
 * </p>
 */
public class AccessDeniedException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new AccessDeniedException with the specified error message.
     *
     * @param message Describes the error encountered.
     */
    public AccessDeniedException(String message) {
        super(message);
    }
}