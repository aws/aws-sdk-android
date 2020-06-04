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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a secondary private IPv4 address for a network interface.
 * </p>
 */
public class PrivateIpAddressSpecification implements Serializable {
    /**
     * <p>
     * Indicates whether the private IPv4 address is the primary private IPv4
     * address. Only one IPv4 address can be designated as primary.
     * </p>
     */
    private Boolean primary;

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     */
    private String privateIpAddress;

    /**
     * <p>
     * Indicates whether the private IPv4 address is the primary private IPv4
     * address. Only one IPv4 address can be designated as primary.
     * </p>
     *
     * @return <p>
     *         Indicates whether the private IPv4 address is the primary private
     *         IPv4 address. Only one IPv4 address can be designated as primary.
     *         </p>
     */
    public Boolean isPrimary() {
        return primary;
    }

    /**
     * <p>
     * Indicates whether the private IPv4 address is the primary private IPv4
     * address. Only one IPv4 address can be designated as primary.
     * </p>
     *
     * @return <p>
     *         Indicates whether the private IPv4 address is the primary private
     *         IPv4 address. Only one IPv4 address can be designated as primary.
     *         </p>
     */
    public Boolean getPrimary() {
        return primary;
    }

    /**
     * <p>
     * Indicates whether the private IPv4 address is the primary private IPv4
     * address. Only one IPv4 address can be designated as primary.
     * </p>
     *
     * @param primary <p>
     *            Indicates whether the private IPv4 address is the primary
     *            private IPv4 address. Only one IPv4 address can be designated
     *            as primary.
     *            </p>
     */
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    /**
     * <p>
     * Indicates whether the private IPv4 address is the primary private IPv4
     * address. Only one IPv4 address can be designated as primary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param primary <p>
     *            Indicates whether the private IPv4 address is the primary
     *            private IPv4 address. Only one IPv4 address can be designated
     *            as primary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrivateIpAddressSpecification withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     *
     * @return <p>
     *         The private IPv4 addresses.
     *         </p>
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     *
     * @param privateIpAddress <p>
     *            The private IPv4 addresses.
     *            </p>
     */
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IPv4 addresses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateIpAddress <p>
     *            The private IPv4 addresses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrivateIpAddressSpecification withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
        if (getPrimary() != null)
            sb.append("Primary: " + getPrimary() + ",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: " + getPrivateIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrimary() == null) ? 0 : getPrimary().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateIpAddressSpecification == false)
            return false;
        PrivateIpAddressSpecification other = (PrivateIpAddressSpecification) obj;

        if (other.getPrimary() == null ^ this.getPrimary() == null)
            return false;
        if (other.getPrimary() != null && other.getPrimary().equals(this.getPrimary()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null
                && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        return true;
    }
}
