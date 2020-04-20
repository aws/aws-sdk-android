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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a Cost Category. Expenses from this month going forward will no
 * longer be categorized with this Cost Category.
 * </p>
 */
public class DeleteCostCategoryDefinitionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     */
    private String costCategoryArn;

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @return <p>
     *         The unique identifier for your Cost Category.
     *         </p>
     */
    public String getCostCategoryArn() {
        return costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @param costCategoryArn <p>
     *            The unique identifier for your Cost Category.
     *            </p>
     */
    public void setCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
    }

    /**
     * <p>
     * The unique identifier for your Cost Category.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[-a-z0-9]*:[a-z0-9]+:[-a-z0-9]*:[0-9]{12}:[-a-zA-Z0-9/:_]+
     * <br/>
     *
     * @param costCategoryArn <p>
     *            The unique identifier for your Cost Category.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCostCategoryDefinitionRequest withCostCategoryArn(String costCategoryArn) {
        this.costCategoryArn = costCategoryArn;
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
        if (getCostCategoryArn() != null)
            sb.append("CostCategoryArn: " + getCostCategoryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCostCategoryArn() == null) ? 0 : getCostCategoryArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCostCategoryDefinitionRequest == false)
            return false;
        DeleteCostCategoryDefinitionRequest other = (DeleteCostCategoryDefinitionRequest) obj;

        if (other.getCostCategoryArn() == null ^ this.getCostCategoryArn() == null)
            return false;
        if (other.getCostCategoryArn() != null
                && other.getCostCategoryArn().equals(this.getCostCategoryArn()) == false)
            return false;
        return true;
    }
}
