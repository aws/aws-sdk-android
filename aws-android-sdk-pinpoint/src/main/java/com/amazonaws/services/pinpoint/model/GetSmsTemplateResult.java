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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class GetSmsTemplateResult implements Serializable {
    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in text messages that are sent through the SMS
     * channel.
     * </p>
     */
    private SMSTemplateResponse sMSTemplateResponse;

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in text messages that are sent through the SMS
     * channel.
     * </p>
     *
     * @return <p>
     *         Provides information about the content and settings for a message
     *         template that can be used in text messages that are sent through
     *         the SMS channel.
     *         </p>
     */
    public SMSTemplateResponse getSMSTemplateResponse() {
        return sMSTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in text messages that are sent through the SMS
     * channel.
     * </p>
     *
     * @param sMSTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in text messages that are
     *            sent through the SMS channel.
     *            </p>
     */
    public void setSMSTemplateResponse(SMSTemplateResponse sMSTemplateResponse) {
        this.sMSTemplateResponse = sMSTemplateResponse;
    }

    /**
     * <p>
     * Provides information about the content and settings for a message
     * template that can be used in text messages that are sent through the SMS
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSTemplateResponse <p>
     *            Provides information about the content and settings for a
     *            message template that can be used in text messages that are
     *            sent through the SMS channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSmsTemplateResult withSMSTemplateResponse(SMSTemplateResponse sMSTemplateResponse) {
        this.sMSTemplateResponse = sMSTemplateResponse;
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
        if (getSMSTemplateResponse() != null)
            sb.append("SMSTemplateResponse: " + getSMSTemplateResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSMSTemplateResponse() == null) ? 0 : getSMSTemplateResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSmsTemplateResult == false)
            return false;
        GetSmsTemplateResult other = (GetSmsTemplateResult) obj;

        if (other.getSMSTemplateResponse() == null ^ this.getSMSTemplateResponse() == null)
            return false;
        if (other.getSMSTemplateResponse() != null
                && other.getSMSTemplateResponse().equals(this.getSMSTemplateResponse()) == false)
            return false;
        return true;
    }
}
