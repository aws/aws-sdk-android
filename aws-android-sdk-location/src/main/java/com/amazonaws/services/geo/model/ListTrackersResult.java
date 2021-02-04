/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.geo.model;

import java.io.Serializable;

public class ListTrackersResult implements Serializable {
    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker
     * name, description and timestamps for when the tracker was created and
     * last updated.
     * </p>
     */
    private java.util.List<ListTrackersResponseEntry> entries;

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker
     * name, description and timestamps for when the tracker was created and
     * last updated.
     * </p>
     *
     * @return <p>
     *         Contains tracker resources in your AWS account. Details include
     *         tracker name, description and timestamps for when the tracker was
     *         created and last updated.
     *         </p>
     */
    public java.util.List<ListTrackersResponseEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker
     * name, description and timestamps for when the tracker was created and
     * last updated.
     * </p>
     *
     * @param entries <p>
     *            Contains tracker resources in your AWS account. Details
     *            include tracker name, description and timestamps for when the
     *            tracker was created and last updated.
     *            </p>
     */
    public void setEntries(java.util.Collection<ListTrackersResponseEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<ListTrackersResponseEntry>(entries);
    }

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker
     * name, description and timestamps for when the tracker was created and
     * last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            Contains tracker resources in your AWS account. Details
     *            include tracker name, description and timestamps for when the
     *            tracker was created and last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrackersResult withEntries(ListTrackersResponseEntry... entries) {
        if (getEntries() == null) {
            this.entries = new java.util.ArrayList<ListTrackersResponseEntry>(entries.length);
        }
        for (ListTrackersResponseEntry value : entries) {
            this.entries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Contains tracker resources in your AWS account. Details include tracker
     * name, description and timestamps for when the tracker was created and
     * last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param entries <p>
     *            Contains tracker resources in your AWS account. Details
     *            include tracker name, description and timestamps for when the
     *            tracker was created and last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrackersResult withEntries(java.util.Collection<ListTrackersResponseEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         A pagination token indicating there are additional pages
     *         available. You can use the token in a following request to fetch
     *         the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token indicating there are additional pages
     *            available. You can use the token in a following request to
     *            fetch the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token indicating there are additional pages available. You
     * can use the token in a following request to fetch the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param nextToken <p>
     *            A pagination token indicating there are additional pages
     *            available. You can use the token in a following request to
     *            fetch the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrackersResult withNextToken(String nextToken) {
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
        if (getEntries() != null)
            sb.append("Entries: " + getEntries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrackersResult == false)
            return false;
        ListTrackersResult other = (ListTrackersResult) obj;

        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
