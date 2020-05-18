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

public class DescribeVpcEndpointConnectionsResult implements Serializable {
    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     */
    private java.util.List<VpcEndpointConnection> vpcEndpointConnections;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     *
     * @return <p>
     *         Information about one or more VPC endpoint connections.
     *         </p>
     */
    public java.util.List<VpcEndpointConnection> getVpcEndpointConnections() {
        return vpcEndpointConnections;
    }

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     *
     * @param vpcEndpointConnections <p>
     *            Information about one or more VPC endpoint connections.
     *            </p>
     */
    public void setVpcEndpointConnections(
            java.util.Collection<VpcEndpointConnection> vpcEndpointConnections) {
        if (vpcEndpointConnections == null) {
            this.vpcEndpointConnections = null;
            return;
        }

        this.vpcEndpointConnections = new java.util.ArrayList<VpcEndpointConnection>(
                vpcEndpointConnections);
    }

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointConnections <p>
     *            Information about one or more VPC endpoint connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionsResult withVpcEndpointConnections(
            VpcEndpointConnection... vpcEndpointConnections) {
        if (getVpcEndpointConnections() == null) {
            this.vpcEndpointConnections = new java.util.ArrayList<VpcEndpointConnection>(
                    vpcEndpointConnections.length);
        }
        for (VpcEndpointConnection value : vpcEndpointConnections) {
            this.vpcEndpointConnections.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more VPC endpoint connections.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointConnections <p>
     *            Information about one or more VPC endpoint connections.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionsResult withVpcEndpointConnections(
            java.util.Collection<VpcEndpointConnection> vpcEndpointConnections) {
        setVpcEndpointConnections(vpcEndpointConnections);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeVpcEndpointConnectionsResult withNextToken(String nextToken) {
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
        if (getVpcEndpointConnections() != null)
            sb.append("VpcEndpointConnections: " + getVpcEndpointConnections() + ",");
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
                + ((getVpcEndpointConnections() == null) ? 0 : getVpcEndpointConnections()
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

        if (obj instanceof DescribeVpcEndpointConnectionsResult == false)
            return false;
        DescribeVpcEndpointConnectionsResult other = (DescribeVpcEndpointConnectionsResult) obj;

        if (other.getVpcEndpointConnections() == null ^ this.getVpcEndpointConnections() == null)
            return false;
        if (other.getVpcEndpointConnections() != null
                && other.getVpcEndpointConnections().equals(this.getVpcEndpointConnections()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
