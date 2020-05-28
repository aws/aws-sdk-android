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

package com.amazonaws.services.session.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the details of the committed transaction.
 * </p>
 */
public class CommitTransactionResult implements Serializable {
    /**
     * <p>
     * The transaction ID of the committed transaction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     */
    private String transactionId;

    /**
     * <p>
     * The commit digest of the committed transaction.
     * </p>
     */
    private java.nio.ByteBuffer commitDigest;

    /**
     * <p>
     * The transaction ID of the committed transaction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @return <p>
     *         The transaction ID of the committed transaction.
     *         </p>
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * <p>
     * The transaction ID of the committed transaction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param transactionId <p>
     *            The transaction ID of the committed transaction.
     *            </p>
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction ID of the committed transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>22 - 22<br/>
     * <b>Pattern: </b>^[A-Za-z-0-9]+$<br/>
     *
     * @param transactionId <p>
     *            The transaction ID of the committed transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommitTransactionResult withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * <p>
     * The commit digest of the committed transaction.
     * </p>
     *
     * @return <p>
     *         The commit digest of the committed transaction.
     *         </p>
     */
    public java.nio.ByteBuffer getCommitDigest() {
        return commitDigest;
    }

    /**
     * <p>
     * The commit digest of the committed transaction.
     * </p>
     *
     * @param commitDigest <p>
     *            The commit digest of the committed transaction.
     *            </p>
     */
    public void setCommitDigest(java.nio.ByteBuffer commitDigest) {
        this.commitDigest = commitDigest;
    }

    /**
     * <p>
     * The commit digest of the committed transaction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param commitDigest <p>
     *            The commit digest of the committed transaction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CommitTransactionResult withCommitDigest(java.nio.ByteBuffer commitDigest) {
        this.commitDigest = commitDigest;
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
        if (getTransactionId() != null)
            sb.append("TransactionId: " + getTransactionId() + ",");
        if (getCommitDigest() != null)
            sb.append("CommitDigest: " + getCommitDigest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode
                + ((getCommitDigest() == null) ? 0 : getCommitDigest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CommitTransactionResult == false)
            return false;
        CommitTransactionResult other = (CommitTransactionResult) obj;

        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null
                && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getCommitDigest() == null ^ this.getCommitDigest() == null)
            return false;
        if (other.getCommitDigest() != null
                && other.getCommitDigest().equals(this.getCommitDigest()) == false)
            return false;
        return true;
    }
}
