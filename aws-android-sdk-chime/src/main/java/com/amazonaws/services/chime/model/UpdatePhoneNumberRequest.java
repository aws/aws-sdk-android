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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates phone number details, such as product type or calling name, for the
 * specified phone number ID. You can update one phone number detail at a time.
 * For example, you can update either the product type or the calling name in
 * one action.
 * </p>
 * <p>
 * For toll-free numbers, you must use the Amazon Chime Voice Connector product
 * type.
 * </p>
 * <p>
 * Updates to outbound calling names can take up to 72 hours to complete.
 * Pending updates to outbound calling names must be complete before you can
 * request another update.
 * </p>
 */
public class UpdatePhoneNumberRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The phone number ID.
     * </p>
     */
    private String phoneNumberId;

    /**
     * <p>
     * The product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     */
    private String productType;

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     */
    private String callingName;

    /**
     * <p>
     * The phone number ID.
     * </p>
     *
     * @return <p>
     *         The phone number ID.
     *         </p>
     */
    public String getPhoneNumberId() {
        return phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID.
     * </p>
     *
     * @param phoneNumberId <p>
     *            The phone number ID.
     *            </p>
     */
    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * The phone number ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberId <p>
     *            The phone number ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePhoneNumberRequest withPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @return <p>
     *         The product type.
     *         </p>
     * @see PhoneNumberProductType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public UpdatePhoneNumberRequest withProductType(String productType) {
        this.productType = productType;
        return this;
    }

    /**
     * <p>
     * The product type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The product type.
     *            </p>
     * @see PhoneNumberProductType
     */
    public void setProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
    }

    /**
     * <p>
     * The product type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BusinessCalling, VoiceConnector
     *
     * @param productType <p>
     *            The product type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PhoneNumberProductType
     */
    public UpdatePhoneNumberRequest withProductType(PhoneNumberProductType productType) {
        this.productType = productType.toString();
        return this;
    }

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @return <p>
     *         The outbound calling name associated with the phone number.
     *         </p>
     */
    public String getCallingName() {
        return callingName;
    }

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @param callingName <p>
     *            The outbound calling name associated with the phone number.
     *            </p>
     */
    public void setCallingName(String callingName) {
        this.callingName = callingName;
    }

    /**
     * <p>
     * The outbound calling name associated with the phone number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^$|^[a-zA-Z0-9 ]{2,15}$<br/>
     *
     * @param callingName <p>
     *            The outbound calling name associated with the phone number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePhoneNumberRequest withCallingName(String callingName) {
        this.callingName = callingName;
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: " + getPhoneNumberId() + ",");
        if (getProductType() != null)
            sb.append("ProductType: " + getProductType() + ",");
        if (getCallingName() != null)
            sb.append("CallingName: " + getCallingName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode
                + ((getProductType() == null) ? 0 : getProductType().hashCode());
        hashCode = prime * hashCode
                + ((getCallingName() == null) ? 0 : getCallingName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePhoneNumberRequest == false)
            return false;
        UpdatePhoneNumberRequest other = (UpdatePhoneNumberRequest) obj;

        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null
                && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getProductType() == null ^ this.getProductType() == null)
            return false;
        if (other.getProductType() != null
                && other.getProductType().equals(this.getProductType()) == false)
            return false;
        if (other.getCallingName() == null ^ this.getCallingName() == null)
            return false;
        if (other.getCallingName() != null
                && other.getCallingName().equals(this.getCallingName()) == false)
            return false;
        return true;
    }
}
