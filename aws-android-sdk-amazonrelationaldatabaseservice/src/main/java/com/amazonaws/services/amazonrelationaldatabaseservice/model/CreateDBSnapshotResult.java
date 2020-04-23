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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

public class CreateDBSnapshotResult implements Serializable {
    /**
     * <p>
     * Contains the details of an Amazon RDS DB snapshot.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSnapshots</code> action.
     * </p>
     */
    private DBSnapshot dBSnapshot;

    /**
     * <p>
     * Contains the details of an Amazon RDS DB snapshot.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSnapshots</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the details of an Amazon RDS DB snapshot.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBSnapshots</code> action.
     *         </p>
     */
    public DBSnapshot getDBSnapshot() {
        return dBSnapshot;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB snapshot.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSnapshots</code> action.
     * </p>
     *
     * @param dBSnapshot <p>
     *            Contains the details of an Amazon RDS DB snapshot.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBSnapshots</code> action.
     *            </p>
     */
    public void setDBSnapshot(DBSnapshot dBSnapshot) {
        this.dBSnapshot = dBSnapshot;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB snapshot.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSnapshots</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshot <p>
     *            Contains the details of an Amazon RDS DB snapshot.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBSnapshots</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBSnapshotResult withDBSnapshot(DBSnapshot dBSnapshot) {
        this.dBSnapshot = dBSnapshot;
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
        if (getDBSnapshot() != null)
            sb.append("DBSnapshot: " + getDBSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSnapshot() == null) ? 0 : getDBSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBSnapshotResult == false)
            return false;
        CreateDBSnapshotResult other = (CreateDBSnapshotResult) obj;

        if (other.getDBSnapshot() == null ^ this.getDBSnapshot() == null)
            return false;
        if (other.getDBSnapshot() != null
                && other.getDBSnapshot().equals(this.getDBSnapshot()) == false)
            return false;
        return true;
    }
}
