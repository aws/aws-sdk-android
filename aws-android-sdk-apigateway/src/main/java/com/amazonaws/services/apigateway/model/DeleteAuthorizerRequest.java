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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an existing <a>Authorizer</a> resource.
 * </p>
 * <div class="seeAlso"><a href=
 * "https://docs.aws.amazon.com/cli/latest/reference/apigateway/delete-authorizer.html"
 * >AWS CLI</a></div>
 */
public class DeleteAuthorizerRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;

    /**
     * <p>
     * [Required] The identifier of the <a>Authorizer</a> resource.
     * </p>
     */
    private String authorizerId;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @return <p>
     *         [Required] The string identifier of the associated
     *         <a>RestApi</a>.
     *         </p>
     */
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     */
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restApiId <p>
     *            [Required] The string identifier of the associated
     *            <a>RestApi</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAuthorizerRequest withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Authorizer</a> resource.
     * </p>
     *
     * @return <p>
     *         [Required] The identifier of the <a>Authorizer</a> resource.
     *         </p>
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Authorizer</a> resource.
     * </p>
     *
     * @param authorizerId <p>
     *            [Required] The identifier of the <a>Authorizer</a> resource.
     *            </p>
     */
    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * [Required] The identifier of the <a>Authorizer</a> resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authorizerId <p>
     *            [Required] The identifier of the <a>Authorizer</a> resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteAuthorizerRequest withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
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
        if (getRestApiId() != null)
            sb.append("restApiId: " + getRestApiId() + ",");
        if (getAuthorizerId() != null)
            sb.append("authorizerId: " + getAuthorizerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode
                + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAuthorizerRequest == false)
            return false;
        DeleteAuthorizerRequest other = (DeleteAuthorizerRequest) obj;

        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null
                && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        return true;
    }
}
