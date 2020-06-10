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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetLoadBalancerMetricDataResult implements Serializable {
    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientTLSNegotiationErrorCount, HealthyHostCount,
     * UnhealthyHostCount, HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount
     */
    private String metricName;

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     */
    private java.util.List<MetricDatapoint> metricData;

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientTLSNegotiationErrorCount, HealthyHostCount,
     * UnhealthyHostCount, HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount
     *
     * @return <p>
     *         The name of the metric returned.
     *         </p>
     * @see LoadBalancerMetricName
     */
    public String getMetricName() {
        return metricName;
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientTLSNegotiationErrorCount, HealthyHostCount,
     * UnhealthyHostCount, HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount
     *
     * @param metricName <p>
     *            The name of the metric returned.
     *            </p>
     * @see LoadBalancerMetricName
     */
    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientTLSNegotiationErrorCount, HealthyHostCount,
     * UnhealthyHostCount, HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount
     *
     * @param metricName <p>
     *            The name of the metric returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerMetricName
     */
    public GetLoadBalancerMetricDataResult withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientTLSNegotiationErrorCount, HealthyHostCount,
     * UnhealthyHostCount, HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount
     *
     * @param metricName <p>
     *            The name of the metric returned.
     *            </p>
     * @see LoadBalancerMetricName
     */
    public void setMetricName(LoadBalancerMetricName metricName) {
        this.metricName = metricName.toString();
    }

    /**
     * <p>
     * The name of the metric returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientTLSNegotiationErrorCount, HealthyHostCount,
     * UnhealthyHostCount, HTTPCode_LB_4XX_Count, HTTPCode_LB_5XX_Count,
     * HTTPCode_Instance_2XX_Count, HTTPCode_Instance_3XX_Count,
     * HTTPCode_Instance_4XX_Count, HTTPCode_Instance_5XX_Count,
     * InstanceResponseTime, RejectedConnectionCount, RequestCount
     *
     * @param metricName <p>
     *            The name of the metric returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LoadBalancerMetricName
     */
    public GetLoadBalancerMetricDataResult withMetricName(LoadBalancerMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     *
     * @return <p>
     *         An array of objects that describe the metric data returned.
     *         </p>
     */
    public java.util.List<MetricDatapoint> getMetricData() {
        return metricData;
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     *
     * @param metricData <p>
     *            An array of objects that describe the metric data returned.
     *            </p>
     */
    public void setMetricData(java.util.Collection<MetricDatapoint> metricData) {
        if (metricData == null) {
            this.metricData = null;
            return;
        }

        this.metricData = new java.util.ArrayList<MetricDatapoint>(metricData);
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricData <p>
     *            An array of objects that describe the metric data returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLoadBalancerMetricDataResult withMetricData(MetricDatapoint... metricData) {
        if (getMetricData() == null) {
            this.metricData = new java.util.ArrayList<MetricDatapoint>(metricData.length);
        }
        for (MetricDatapoint value : metricData) {
            this.metricData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the metric data returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricData <p>
     *            An array of objects that describe the metric data returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLoadBalancerMetricDataResult withMetricData(
            java.util.Collection<MetricDatapoint> metricData) {
        setMetricData(metricData);
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
        if (getMetricName() != null)
            sb.append("metricName: " + getMetricName() + ",");
        if (getMetricData() != null)
            sb.append("metricData: " + getMetricData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getMetricData() == null) ? 0 : getMetricData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLoadBalancerMetricDataResult == false)
            return false;
        GetLoadBalancerMetricDataResult other = (GetLoadBalancerMetricDataResult) obj;

        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getMetricData() == null ^ this.getMetricData() == null)
            return false;
        if (other.getMetricData() != null
                && other.getMetricData().equals(this.getMetricData()) == false)
            return false;
        return true;
    }
}
