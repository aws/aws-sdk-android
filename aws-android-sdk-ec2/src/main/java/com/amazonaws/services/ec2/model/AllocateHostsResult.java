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
 * Contains the output of AllocateHosts.
 * </p>
 */
public class AllocateHostsResult implements Serializable {
    /**
     * <p>
     * The ID of the allocated Dedicated Host. This is used to launch an
     * instance onto a specific host.
     * </p>
     */
    private java.util.List<String> hostIds;

    /**
     * <p>
     * The ID of the allocated Dedicated Host. This is used to launch an
     * instance onto a specific host.
     * </p>
     *
     * @return <p>
     *         The ID of the allocated Dedicated Host. This is used to launch an
     *         instance onto a specific host.
     *         </p>
     */
    public java.util.List<String> getHostIds() {
        return hostIds;
    }

    /**
     * <p>
     * The ID of the allocated Dedicated Host. This is used to launch an
     * instance onto a specific host.
     * </p>
     *
     * @param hostIds <p>
     *            The ID of the allocated Dedicated Host. This is used to launch
     *            an instance onto a specific host.
     *            </p>
     */
    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }

        this.hostIds = new java.util.ArrayList<String>(hostIds);
    }

    /**
     * <p>
     * The ID of the allocated Dedicated Host. This is used to launch an
     * instance onto a specific host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIds <p>
     *            The ID of the allocated Dedicated Host. This is used to launch
     *            an instance onto a specific host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsResult withHostIds(String... hostIds) {
        if (getHostIds() == null) {
            this.hostIds = new java.util.ArrayList<String>(hostIds.length);
        }
        for (String value : hostIds) {
            this.hostIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the allocated Dedicated Host. This is used to launch an
     * instance onto a specific host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostIds <p>
     *            The ID of the allocated Dedicated Host. This is used to launch
     *            an instance onto a specific host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AllocateHostsResult withHostIds(java.util.Collection<String> hostIds) {
        setHostIds(hostIds);
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
        if (getHostIds() != null)
            sb.append("HostIds: " + getHostIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllocateHostsResult == false)
            return false;
        AllocateHostsResult other = (AllocateHostsResult) obj;

        if (other.getHostIds() == null ^ this.getHostIds() == null)
            return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false)
            return false;
        return true;
    }
}
