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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Disables GuardDuty administrator permissions for an AWS account within the
 * Organization.
 * </p>
 */
public class DisableOrganizationAdminAccountRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The AWS Account ID for the Organizations account to be disabled as a
     * GuardDuty delegated administrator.
     * </p>
     */
    private String adminAccountId;

    /**
     * <p>
     * The AWS Account ID for the Organizations account to be disabled as a
     * GuardDuty delegated administrator.
     * </p>
     *
     * @return <p>
     *         The AWS Account ID for the Organizations account to be disabled
     *         as a GuardDuty delegated administrator.
     *         </p>
     */
    public String getAdminAccountId() {
        return adminAccountId;
    }

    /**
     * <p>
     * The AWS Account ID for the Organizations account to be disabled as a
     * GuardDuty delegated administrator.
     * </p>
     *
     * @param adminAccountId <p>
     *            The AWS Account ID for the Organizations account to be
     *            disabled as a GuardDuty delegated administrator.
     *            </p>
     */
    public void setAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    /**
     * <p>
     * The AWS Account ID for the Organizations account to be disabled as a
     * GuardDuty delegated administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminAccountId <p>
     *            The AWS Account ID for the Organizations account to be
     *            disabled as a GuardDuty delegated administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisableOrganizationAdminAccountRequest withAdminAccountId(String adminAccountId) {
        this.adminAccountId = adminAccountId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAdminAccountId() != null)
            sb.append("AdminAccountId: " + getAdminAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdminAccountId() == null) ? 0 : getAdminAccountId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisableOrganizationAdminAccountRequest == false)
            return false;
        DisableOrganizationAdminAccountRequest other = (DisableOrganizationAdminAccountRequest) obj;

        if (other.getAdminAccountId() == null ^ this.getAdminAccountId() == null)
            return false;
        if (other.getAdminAccountId() != null
                && other.getAdminAccountId().equals(this.getAdminAccountId()) == false)
            return false;
        return true;
    }
}
