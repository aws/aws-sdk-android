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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The kernel gateway app settings.
 * </p>
 */
public class KernelGatewayAppSettings implements Serializable {
    /**
     * <p>
     * The instance type and quantity.
     * </p>
     */
    private ResourceSpec defaultResourceSpec;

    /**
     * <p>
     * The instance type and quantity.
     * </p>
     *
     * @return <p>
     *         The instance type and quantity.
     *         </p>
     */
    public ResourceSpec getDefaultResourceSpec() {
        return defaultResourceSpec;
    }

    /**
     * <p>
     * The instance type and quantity.
     * </p>
     *
     * @param defaultResourceSpec <p>
     *            The instance type and quantity.
     *            </p>
     */
    public void setDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * <p>
     * The instance type and quantity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultResourceSpec <p>
     *            The instance type and quantity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KernelGatewayAppSettings withDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
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
        if (getDefaultResourceSpec() != null)
            sb.append("DefaultResourceSpec: " + getDefaultResourceSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDefaultResourceSpec() == null) ? 0 : getDefaultResourceSpec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KernelGatewayAppSettings == false)
            return false;
        KernelGatewayAppSettings other = (KernelGatewayAppSettings) obj;

        if (other.getDefaultResourceSpec() == null ^ this.getDefaultResourceSpec() == null)
            return false;
        if (other.getDefaultResourceSpec() != null
                && other.getDefaultResourceSpec().equals(this.getDefaultResourceSpec()) == false)
            return false;
        return true;
    }
}
