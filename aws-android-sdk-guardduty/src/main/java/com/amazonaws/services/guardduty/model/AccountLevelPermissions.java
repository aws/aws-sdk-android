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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the account level permissions on the S3 bucket.
 * </p>
 */
public class AccountLevelPermissions implements Serializable {
    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent
     * account.
     * </p>
     */
    private BlockPublicAccess blockPublicAccess;

    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent
     * account.
     * </p>
     *
     * @return <p>
     *         Describes the S3 Block Public Access settings of the bucket's
     *         parent account.
     *         </p>
     */
    public BlockPublicAccess getBlockPublicAccess() {
        return blockPublicAccess;
    }

    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent
     * account.
     * </p>
     *
     * @param blockPublicAccess <p>
     *            Describes the S3 Block Public Access settings of the bucket's
     *            parent account.
     *            </p>
     */
    public void setBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        this.blockPublicAccess = blockPublicAccess;
    }

    /**
     * <p>
     * Describes the S3 Block Public Access settings of the bucket's parent
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blockPublicAccess <p>
     *            Describes the S3 Block Public Access settings of the bucket's
     *            parent account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountLevelPermissions withBlockPublicAccess(BlockPublicAccess blockPublicAccess) {
        this.blockPublicAccess = blockPublicAccess;
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
        if (getBlockPublicAccess() != null)
            sb.append("BlockPublicAccess: " + getBlockPublicAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlockPublicAccess() == null) ? 0 : getBlockPublicAccess().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountLevelPermissions == false)
            return false;
        AccountLevelPermissions other = (AccountLevelPermissions) obj;

        if (other.getBlockPublicAccess() == null ^ this.getBlockPublicAccess() == null)
            return false;
        if (other.getBlockPublicAccess() != null
                && other.getBlockPublicAccess().equals(this.getBlockPublicAccess()) == false)
            return false;
        return true;
    }
}
