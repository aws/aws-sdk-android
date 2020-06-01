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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

public class ListWorkGroupsResult implements Serializable {
    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation
     * times, and states.
     * </p>
     */
    private java.util.List<WorkGroupSummary> workGroups;

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue
     * pagination if a previous request was truncated. To obtain the next set of
     * pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation
     * times, and states.
     * </p>
     *
     * @return <p>
     *         The list of workgroups, including their names, descriptions,
     *         creation times, and states.
     *         </p>
     */
    public java.util.List<WorkGroupSummary> getWorkGroups() {
        return workGroups;
    }

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation
     * times, and states.
     * </p>
     *
     * @param workGroups <p>
     *            The list of workgroups, including their names, descriptions,
     *            creation times, and states.
     *            </p>
     */
    public void setWorkGroups(java.util.Collection<WorkGroupSummary> workGroups) {
        if (workGroups == null) {
            this.workGroups = null;
            return;
        }

        this.workGroups = new java.util.ArrayList<WorkGroupSummary>(workGroups);
    }

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation
     * times, and states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workGroups <p>
     *            The list of workgroups, including their names, descriptions,
     *            creation times, and states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkGroupsResult withWorkGroups(WorkGroupSummary... workGroups) {
        if (getWorkGroups() == null) {
            this.workGroups = new java.util.ArrayList<WorkGroupSummary>(workGroups.length);
        }
        for (WorkGroupSummary value : workGroups) {
            this.workGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of workgroups, including their names, descriptions, creation
     * times, and states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param workGroups <p>
     *            The list of workgroups, including their names, descriptions,
     *            creation times, and states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkGroupsResult withWorkGroups(java.util.Collection<WorkGroupSummary> workGroups) {
        setWorkGroups(workGroups);
        return this;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue
     * pagination if a previous request was truncated. To obtain the next set of
     * pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A token generated by the Athena service that specifies where to
     *         continue pagination if a previous request was truncated. To
     *         obtain the next set of pages, pass in the <code>NextToken</code>
     *         from the response object of the previous page call.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue
     * pagination if a previous request was truncated. To obtain the next set of
     * pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token generated by the Athena service that specifies where
     *            to continue pagination if a previous request was truncated. To
     *            obtain the next set of pages, pass in the
     *            <code>NextToken</code> from the response object of the
     *            previous page call.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token generated by the Athena service that specifies where to continue
     * pagination if a previous request was truncated. To obtain the next set of
     * pages, pass in the <code>NextToken</code> from the response object of the
     * previous page call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token generated by the Athena service that specifies where
     *            to continue pagination if a previous request was truncated. To
     *            obtain the next set of pages, pass in the
     *            <code>NextToken</code> from the response object of the
     *            previous page call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListWorkGroupsResult withNextToken(String nextToken) {
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
        if (getWorkGroups() != null)
            sb.append("WorkGroups: " + getWorkGroups() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkGroups() == null) ? 0 : getWorkGroups().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListWorkGroupsResult == false)
            return false;
        ListWorkGroupsResult other = (ListWorkGroupsResult) obj;

        if (other.getWorkGroups() == null ^ this.getWorkGroups() == null)
            return false;
        if (other.getWorkGroups() != null
                && other.getWorkGroups().equals(this.getWorkGroups()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
