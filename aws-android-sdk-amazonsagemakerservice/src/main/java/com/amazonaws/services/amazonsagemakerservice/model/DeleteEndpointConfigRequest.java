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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes an endpoint configuration. The <code>DeleteEndpointConfig</code> API
 * deletes only the specified configuration. It does not delete endpoints
 * created using the configuration.
 * </p>
 */
public class DeleteEndpointConfigRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the endpoint configuration that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     */
    private String endpointConfigName;

    /**
     * <p>
     * The name of the endpoint configuration that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @return <p>
     *         The name of the endpoint configuration that you want to delete.
     *         </p>
     */
    public String getEndpointConfigName() {
        return endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration that you want to delete.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the endpoint configuration that you want to
     *            delete.
     *            </p>
     */
    public void setEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
    }

    /**
     * <p>
     * The name of the endpoint configuration that you want to delete.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9](-*[a-zA-Z0-9])*<br/>
     *
     * @param endpointConfigName <p>
     *            The name of the endpoint configuration that you want to
     *            delete.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteEndpointConfigRequest withEndpointConfigName(String endpointConfigName) {
        this.endpointConfigName = endpointConfigName;
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
        if (getEndpointConfigName() != null)
            sb.append("EndpointConfigName: " + getEndpointConfigName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpointConfigName() == null) ? 0 : getEndpointConfigName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEndpointConfigRequest == false)
            return false;
        DeleteEndpointConfigRequest other = (DeleteEndpointConfigRequest) obj;

        if (other.getEndpointConfigName() == null ^ this.getEndpointConfigName() == null)
            return false;
        if (other.getEndpointConfigName() != null
                && other.getEndpointConfigName().equals(this.getEndpointConfigName()) == false)
            return false;
        return true;
    }
}
