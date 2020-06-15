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
 * Gets address the book details by the address book ARN.
 * </p>
 */
public class GetAddressBookRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the address book for which to request details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String addressBookArn;

    /**
     * <p>
     * The ARN of the address book for which to request details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the address book for which to request details.
     *         </p>
     */
    public String getAddressBookArn() {
        return addressBookArn;
    }

    /**
     * <p>
     * The ARN of the address book for which to request details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param addressBookArn <p>
     *            The ARN of the address book for which to request details.
     *            </p>
     */
    public void setAddressBookArn(String addressBookArn) {
        this.addressBookArn = addressBookArn;
    }

    /**
     * <p>
     * The ARN of the address book for which to request details.
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
     * @param addressBookArn <p>
     *            The ARN of the address book for which to request details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAddressBookRequest withAddressBookArn(String addressBookArn) {
        this.addressBookArn = addressBookArn;
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
        if (getAddressBookArn() != null)
            sb.append("AddressBookArn: " + getAddressBookArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAddressBookArn() == null) ? 0 : getAddressBookArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAddressBookRequest == false)
            return false;
        GetAddressBookRequest other = (GetAddressBookRequest) obj;

        if (other.getAddressBookArn() == null ^ this.getAddressBookArn() == null)
            return false;
        if (other.getAddressBookArn() != null
                && other.getAddressBookArn().equals(this.getAddressBookArn()) == false)
            return false;
        return true;
    }
}
