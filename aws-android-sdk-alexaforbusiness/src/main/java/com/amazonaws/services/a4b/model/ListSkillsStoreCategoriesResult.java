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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class ListSkillsStoreCategoriesResult implements Serializable {
    /**
     * <p>
     * The list of categories.
     * </p>
     */
    private java.util.List<Category> categoryList;

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of categories.
     * </p>
     *
     * @return <p>
     *         The list of categories.
     *         </p>
     */
    public java.util.List<Category> getCategoryList() {
        return categoryList;
    }

    /**
     * <p>
     * The list of categories.
     * </p>
     *
     * @param categoryList <p>
     *            The list of categories.
     *            </p>
     */
    public void setCategoryList(java.util.Collection<Category> categoryList) {
        if (categoryList == null) {
            this.categoryList = null;
            return;
        }

        this.categoryList = new java.util.ArrayList<Category>(categoryList);
    }

    /**
     * <p>
     * The list of categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoryList <p>
     *            The list of categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsStoreCategoriesResult withCategoryList(Category... categoryList) {
        if (getCategoryList() == null) {
            this.categoryList = new java.util.ArrayList<Category>(categoryList.length);
        }
        for (Category value : categoryList) {
            this.categoryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of categories.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categoryList <p>
     *            The list of categories.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsStoreCategoriesResult withCategoryList(
            java.util.Collection<Category> categoryList) {
        setCategoryList(categoryList);
        return this;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @return <p>
     *         The tokens used for pagination.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The tokens used for pagination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1100<br/>
     *
     * @param nextToken <p>
     *            The tokens used for pagination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSkillsStoreCategoriesResult withNextToken(String nextToken) {
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
        if (getCategoryList() != null)
            sb.append("CategoryList: " + getCategoryList() + ",");
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
                + ((getCategoryList() == null) ? 0 : getCategoryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSkillsStoreCategoriesResult == false)
            return false;
        ListSkillsStoreCategoriesResult other = (ListSkillsStoreCategoriesResult) obj;

        if (other.getCategoryList() == null ^ this.getCategoryList() == null)
            return false;
        if (other.getCategoryList() != null
                && other.getCategoryList().equals(this.getCategoryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
