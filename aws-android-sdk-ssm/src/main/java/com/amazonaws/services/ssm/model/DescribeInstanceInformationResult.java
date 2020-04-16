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

public class DescribeInstanceInformationResult implements Serializable {
    /**
     * <p>
     * The instance information list.
     * </p>
     */
    private java.util.List<InstanceInformation> instanceInformationList;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The instance information list.
     * </p>
     *
     * @return <p>
     *         The instance information list.
     *         </p>
     */
    public java.util.List<InstanceInformation> getInstanceInformationList() {
        return instanceInformationList;
    }

    /**
     * <p>
     * The instance information list.
     * </p>
     *
     * @param instanceInformationList <p>
     *            The instance information list.
     *            </p>
     */
    public void setInstanceInformationList(
            java.util.Collection<InstanceInformation> instanceInformationList) {
        if (instanceInformationList == null) {
            this.instanceInformationList = null;
            return;
        }

        this.instanceInformationList = new java.util.ArrayList<InstanceInformation>(
                instanceInformationList);
    }

    /**
     * <p>
     * The instance information list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceInformationList <p>
     *            The instance information list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationResult withInstanceInformationList(
            InstanceInformation... instanceInformationList) {
        if (getInstanceInformationList() == null) {
            this.instanceInformationList = new java.util.ArrayList<InstanceInformation>(
                    instanceInformationList.length);
        }
        for (InstanceInformation value : instanceInformationList) {
            this.instanceInformationList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The instance information list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceInformationList <p>
     *            The instance information list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationResult withInstanceInformationList(
            java.util.Collection<InstanceInformation> instanceInformationList) {
        setInstanceInformationList(instanceInformationList);
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
    public DescribeInstanceInformationResult withNextToken(String nextToken) {
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
        if (getInstanceInformationList() != null)
            sb.append("InstanceInformationList: " + getInstanceInformationList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceInformationList() == null) ? 0 : getInstanceInformationList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceInformationResult == false)
            return false;
        DescribeInstanceInformationResult other = (DescribeInstanceInformationResult) obj;

        if (other.getInstanceInformationList() == null ^ this.getInstanceInformationList() == null)
            return false;
        if (other.getInstanceInformationList() != null
                && other.getInstanceInformationList().equals(this.getInstanceInformationList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
