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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class DescribeInstancePatchStatesResult implements Serializable {
    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     */
    private java.util.List<InstancePatchState> instancePatchStates;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     *
     * @return <p>
     *         The high-level patch state for the requested instances.
     *         </p>
     */
    public java.util.List<InstancePatchState> getInstancePatchStates() {
        return instancePatchStates;
    }

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     *
     * @param instancePatchStates <p>
     *            The high-level patch state for the requested instances.
     *            </p>
     */
    public void setInstancePatchStates(java.util.Collection<InstancePatchState> instancePatchStates) {
        if (instancePatchStates == null) {
            this.instancePatchStates = null;
            return;
        }

        this.instancePatchStates = new java.util.ArrayList<InstancePatchState>(instancePatchStates);
    }

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancePatchStates <p>
     *            The high-level patch state for the requested instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancePatchStatesResult withInstancePatchStates(
            InstancePatchState... instancePatchStates) {
        if (getInstancePatchStates() == null) {
            this.instancePatchStates = new java.util.ArrayList<InstancePatchState>(
                    instancePatchStates.length);
        }
        for (InstancePatchState value : instancePatchStates) {
            this.instancePatchStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The high-level patch state for the requested instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instancePatchStates <p>
     *            The high-level patch state for the requested instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancePatchStatesResult withInstancePatchStates(
            java.util.Collection<InstancePatchState> instancePatchStates) {
        setInstancePatchStates(instancePatchStates);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @return <p>
     *         The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use when requesting the next set of items. If
     *            there are no additional items to return, the string is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstancePatchStatesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getInstancePatchStates() != null)
            sb.append("InstancePatchStates: " + getInstancePatchStates() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstancePatchStates() == null) ? 0 : getInstancePatchStates().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstancePatchStatesResult == false)
            return false;
        DescribeInstancePatchStatesResult other = (DescribeInstancePatchStatesResult) obj;

        if (other.getInstancePatchStates() == null ^ this.getInstancePatchStates() == null)
            return false;
        if (other.getInstancePatchStates() != null
                && other.getInstancePatchStates().equals(this.getInstancePatchStates()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}