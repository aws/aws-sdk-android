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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates a device with the specified network profile.
 * </p>
 */
public class AssociateDeviceWithNetworkProfileRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The device ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String deviceArn;

    /**
     * <p>
     * The ARN of the network profile to associate with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String networkProfileArn;

    /**
     * <p>
     * The device ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The device ARN.
     *         </p>
     */
    public String getDeviceArn() {
        return deviceArn;
    }

    /**
     * <p>
     * The device ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The device ARN.
     *            </p>
     */
    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The device ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param deviceArn <p>
     *            The device ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateDeviceWithNetworkProfileRequest withDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
        return this;
    }

    /**
     * <p>
     * The ARN of the network profile to associate with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the network profile to associate with a device.
     *         </p>
     */
    public String getNetworkProfileArn() {
        return networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile to associate with a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param networkProfileArn <p>
     *            The ARN of the network profile to associate with a device.
     *            </p>
     */
    public void setNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
    }

    /**
     * <p>
     * The ARN of the network profile to associate with a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param networkProfileArn <p>
     *            The ARN of the network profile to associate with a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateDeviceWithNetworkProfileRequest withNetworkProfileArn(String networkProfileArn) {
        this.networkProfileArn = networkProfileArn;
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: " + getDeviceArn() + ",");
        if (getNetworkProfileArn() != null)
            sb.append("NetworkProfileArn: " + getNetworkProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkProfileArn() == null) ? 0 : getNetworkProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateDeviceWithNetworkProfileRequest == false)
            return false;
        AssociateDeviceWithNetworkProfileRequest other = (AssociateDeviceWithNetworkProfileRequest) obj;

        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null
                && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getNetworkProfileArn() == null ^ this.getNetworkProfileArn() == null)
            return false;
        if (other.getNetworkProfileArn() != null
                && other.getNetworkProfileArn().equals(this.getNetworkProfileArn()) == false)
            return false;
        return true;
    }
}
