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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets status of a specified health check.
 * </p>
 */
public class GetHealthCheckStatusRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID for the health check that you want the current status for. When
     * you created the health check, <code>CreateHealthCheck</code> returned the
     * ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * <note>
     * <p>
     * If you want to check the status of a calculated health check, you must
     * use the Amazon Route 53 console or the CloudWatch console. You can't use
     * <code>GetHealthCheckStatus</code> to get the status of a calculated
     * health check.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String healthCheckId;

    /**
     * <p>
     * The ID for the health check that you want the current status for. When
     * you created the health check, <code>CreateHealthCheck</code> returned the
     * ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * <note>
     * <p>
     * If you want to check the status of a calculated health check, you must
     * use the Amazon Route 53 console or the CloudWatch console. You can't use
     * <code>GetHealthCheckStatus</code> to get the status of a calculated
     * health check.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID for the health check that you want the current status for.
     *         When you created the health check, <code>CreateHealthCheck</code>
     *         returned the ID in the response, in the
     *         <code>HealthCheckId</code> element.
     *         </p>
     *         <note>
     *         <p>
     *         If you want to check the status of a calculated health check, you
     *         must use the Amazon Route 53 console or the CloudWatch console.
     *         You can't use <code>GetHealthCheckStatus</code> to get the status
     *         of a calculated health check.
     *         </p>
     *         </note>
     */
    public String getHealthCheckId() {
        return healthCheckId;
    }

    /**
     * <p>
     * The ID for the health check that you want the current status for. When
     * you created the health check, <code>CreateHealthCheck</code> returned the
     * ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * <note>
     * <p>
     * If you want to check the status of a calculated health check, you must
     * use the Amazon Route 53 console or the CloudWatch console. You can't use
     * <code>GetHealthCheckStatus</code> to get the status of a calculated
     * health check.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param healthCheckId <p>
     *            The ID for the health check that you want the current status
     *            for. When you created the health check,
     *            <code>CreateHealthCheck</code> returned the ID in the
     *            response, in the <code>HealthCheckId</code> element.
     *            </p>
     *            <note>
     *            <p>
     *            If you want to check the status of a calculated health check,
     *            you must use the Amazon Route 53 console or the CloudWatch
     *            console. You can't use <code>GetHealthCheckStatus</code> to
     *            get the status of a calculated health check.
     *            </p>
     *            </note>
     */
    public void setHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
    }

    /**
     * <p>
     * The ID for the health check that you want the current status for. When
     * you created the health check, <code>CreateHealthCheck</code> returned the
     * ID in the response, in the <code>HealthCheckId</code> element.
     * </p>
     * <note>
     * <p>
     * If you want to check the status of a calculated health check, you must
     * use the Amazon Route 53 console or the CloudWatch console. You can't use
     * <code>GetHealthCheckStatus</code> to get the status of a calculated
     * health check.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param healthCheckId <p>
     *            The ID for the health check that you want the current status
     *            for. When you created the health check,
     *            <code>CreateHealthCheck</code> returned the ID in the
     *            response, in the <code>HealthCheckId</code> element.
     *            </p>
     *            <note>
     *            <p>
     *            If you want to check the status of a calculated health check,
     *            you must use the Amazon Route 53 console or the CloudWatch
     *            console. You can't use <code>GetHealthCheckStatus</code> to
     *            get the status of a calculated health check.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetHealthCheckStatusRequest withHealthCheckId(String healthCheckId) {
        this.healthCheckId = healthCheckId;
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
        if (getHealthCheckId() != null)
            sb.append("HealthCheckId: " + getHealthCheckId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHealthCheckId() == null) ? 0 : getHealthCheckId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHealthCheckStatusRequest == false)
            return false;
        GetHealthCheckStatusRequest other = (GetHealthCheckStatusRequest) obj;

        if (other.getHealthCheckId() == null ^ this.getHealthCheckId() == null)
            return false;
        if (other.getHealthCheckId() != null
                && other.getHealthCheckId().equals(this.getHealthCheckId()) == false)
            return false;
        return true;
    }
}
