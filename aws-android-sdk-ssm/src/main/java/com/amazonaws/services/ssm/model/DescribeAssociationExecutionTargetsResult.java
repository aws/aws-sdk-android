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

public class DescribeAssociationExecutionTargetsResult implements Serializable {
    /**
     * <p>
     * Information about the execution.
     * </p>
     */
    private java.util.List<AssociationExecutionTarget> associationExecutionTargets;

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the execution.
     * </p>
     *
     * @return <p>
     *         Information about the execution.
     *         </p>
     */
    public java.util.List<AssociationExecutionTarget> getAssociationExecutionTargets() {
        return associationExecutionTargets;
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     *
     * @param associationExecutionTargets <p>
     *            Information about the execution.
     *            </p>
     */
    public void setAssociationExecutionTargets(
            java.util.Collection<AssociationExecutionTarget> associationExecutionTargets) {
        if (associationExecutionTargets == null) {
            this.associationExecutionTargets = null;
            return;
        }

        this.associationExecutionTargets = new java.util.ArrayList<AssociationExecutionTarget>(
                associationExecutionTargets);
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationExecutionTargets <p>
     *            Information about the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionTargetsResult withAssociationExecutionTargets(
            AssociationExecutionTarget... associationExecutionTargets) {
        if (getAssociationExecutionTargets() == null) {
            this.associationExecutionTargets = new java.util.ArrayList<AssociationExecutionTarget>(
                    associationExecutionTargets.length);
        }
        for (AssociationExecutionTarget value : associationExecutionTargets) {
            this.associationExecutionTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param associationExecutionTargets <p>
     *            Information about the execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionTargetsResult withAssociationExecutionTargets(
            java.util.Collection<AssociationExecutionTarget> associationExecutionTargets) {
        setAssociationExecutionTargets(associationExecutionTargets);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. Use this token to
     *         get the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. Use this token to get the
     * next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. Use this token
     *            to get the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAssociationExecutionTargetsResult withNextToken(String nextToken) {
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
        if (getAssociationExecutionTargets() != null)
            sb.append("AssociationExecutionTargets: " + getAssociationExecutionTargets() + ",");
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
                + ((getAssociationExecutionTargets() == null) ? 0
                        : getAssociationExecutionTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAssociationExecutionTargetsResult == false)
            return false;
        DescribeAssociationExecutionTargetsResult other = (DescribeAssociationExecutionTargetsResult) obj;

        if (other.getAssociationExecutionTargets() == null
                ^ this.getAssociationExecutionTargets() == null)
            return false;
        if (other.getAssociationExecutionTargets() != null
                && other.getAssociationExecutionTargets().equals(
                        this.getAssociationExecutionTargets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
