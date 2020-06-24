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

import java.io.Serializable;

public class CreateOrganizationalUnitResult implements Serializable {
    /**
     * <p>
     * A structure that contains details about the newly created OU.
     * </p>
     */
    private OrganizationalUnit organizationalUnit;

    /**
     * <p>
     * A structure that contains details about the newly created OU.
     * </p>
     *
     * @return <p>
     *         A structure that contains details about the newly created OU.
     *         </p>
     */
    public OrganizationalUnit getOrganizationalUnit() {
        return organizationalUnit;
    }

    /**
     * <p>
     * A structure that contains details about the newly created OU.
     * </p>
     *
     * @param organizationalUnit <p>
     *            A structure that contains details about the newly created OU.
     *            </p>
     */
    public void setOrganizationalUnit(OrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    /**
     * <p>
     * A structure that contains details about the newly created OU.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationalUnit <p>
     *            A structure that contains details about the newly created OU.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateOrganizationalUnitResult withOrganizationalUnit(
            OrganizationalUnit organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
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
        if (getOrganizationalUnit() != null)
            sb.append("OrganizationalUnit: " + getOrganizationalUnit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganizationalUnit() == null) ? 0 : getOrganizationalUnit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateOrganizationalUnitResult == false)
            return false;
        CreateOrganizationalUnitResult other = (CreateOrganizationalUnitResult) obj;

        if (other.getOrganizationalUnit() == null ^ this.getOrganizationalUnit() == null)
            return false;
        if (other.getOrganizationalUnit() != null
                && other.getOrganizationalUnit().equals(this.getOrganizationalUnit()) == false)
            return false;
        return true;
    }
}