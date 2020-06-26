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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class CreateUserProfileResult implements Serializable {
    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     */
    private String userProfileArn;

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     *
     * @return <p>
     *         The user profile Amazon Resource Name (ARN).
     *         </p>
     */
    public String getUserProfileArn() {
        return userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     *
     * @param userProfileArn <p>
     *            The user profile Amazon Resource Name (ARN).
     *            </p>
     */
    public void setUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:user-profile/.*<br/>
     *
     * @param userProfileArn <p>
     *            The user profile Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserProfileResult withUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
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
        if (getUserProfileArn() != null)
            sb.append("UserProfileArn: " + getUserProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserProfileArn() == null) ? 0 : getUserProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserProfileResult == false)
            return false;
        CreateUserProfileResult other = (CreateUserProfileResult) obj;

        if (other.getUserProfileArn() == null ^ this.getUserProfileArn() == null)
            return false;
        if (other.getUserProfileArn() != null
                && other.getUserProfileArn().equals(this.getUserProfileArn()) == false)
            return false;
        return true;
    }
}
