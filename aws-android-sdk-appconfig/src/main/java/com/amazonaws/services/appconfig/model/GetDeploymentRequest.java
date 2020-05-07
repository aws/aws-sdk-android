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

package com.amazonaws.services.appconfig.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieve information about a configuration deployment.
 * </p>
 */
public class GetDeploymentRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String applicationId;

    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     */
    private String environmentId;

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     */
    private Integer deploymentNumber;

    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The ID of the application that includes the deployment you want
     *         to get.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The ID of the application that includes the deployment you
     *            want to get.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application that includes the deployment you want to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param applicationId <p>
     *            The ID of the application that includes the deployment you
     *            want to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @return <p>
     *         The ID of the environment that includes the deployment you want
     *         to get.
     *         </p>
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param environmentId <p>
     *            The ID of the environment that includes the deployment you
     *            want to get.
     *            </p>
     */
    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment that includes the deployment you want to get.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-z0-9]{4,7}<br/>
     *
     * @param environmentId <p>
     *            The ID of the environment that includes the deployment you
     *            want to get.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     *
     * @return <p>
     *         The sequence number of the deployment.
     *         </p>
     */
    public Integer getDeploymentNumber() {
        return deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     *
     * @param deploymentNumber <p>
     *            The sequence number of the deployment.
     *            </p>
     */
    public void setDeploymentNumber(Integer deploymentNumber) {
        this.deploymentNumber = deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentNumber <p>
     *            The sequence number of the deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetDeploymentRequest withDeploymentNumber(Integer deploymentNumber) {
        this.deploymentNumber = deploymentNumber;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: " + getEnvironmentId() + ",");
        if (getDeploymentNumber() != null)
            sb.append("DeploymentNumber: " + getDeploymentNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentNumber() == null) ? 0 : getDeploymentNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDeploymentRequest == false)
            return false;
        GetDeploymentRequest other = (GetDeploymentRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null
                && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDeploymentNumber() == null ^ this.getDeploymentNumber() == null)
            return false;
        if (other.getDeploymentNumber() != null
                && other.getDeploymentNumber().equals(this.getDeploymentNumber()) == false)
            return false;
        return true;
    }
}