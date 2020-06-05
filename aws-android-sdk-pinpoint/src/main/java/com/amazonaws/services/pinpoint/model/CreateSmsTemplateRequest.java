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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a message template for messages that are sent through the SMS
 * channel.
 * </p>
 */
public class CreateSmsTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the content and settings for a message template that can be
     * used in text messages that are sent through the SMS channel.
     * </p>
     */
    private SMSTemplateRequest sMSTemplateRequest;

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * Specifies the content and settings for a message template that can be
     * used in text messages that are sent through the SMS channel.
     * </p>
     *
     * @return <p>
     *         Specifies the content and settings for a message template that
     *         can be used in text messages that are sent through the SMS
     *         channel.
     *         </p>
     */
    public SMSTemplateRequest getSMSTemplateRequest() {
        return sMSTemplateRequest;
    }

    /**
     * <p>
     * Specifies the content and settings for a message template that can be
     * used in text messages that are sent through the SMS channel.
     * </p>
     *
     * @param sMSTemplateRequest <p>
     *            Specifies the content and settings for a message template that
     *            can be used in text messages that are sent through the SMS
     *            channel.
     *            </p>
     */
    public void setSMSTemplateRequest(SMSTemplateRequest sMSTemplateRequest) {
        this.sMSTemplateRequest = sMSTemplateRequest;
    }

    /**
     * <p>
     * Specifies the content and settings for a message template that can be
     * used in text messages that are sent through the SMS channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSTemplateRequest <p>
     *            Specifies the content and settings for a message template that
     *            can be used in text messages that are sent through the SMS
     *            channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSmsTemplateRequest withSMSTemplateRequest(SMSTemplateRequest sMSTemplateRequest) {
        this.sMSTemplateRequest = sMSTemplateRequest;
        return this;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @return <p>
     *         The name of the message template. A template name must start with
     *         an alphanumeric character and can contain a maximum of 128
     *         characters. The characters can be alphanumeric characters,
     *         underscores (_), or hyphens (-). Template names are case
     *         sensitive.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSmsTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
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
        if (getSMSTemplateRequest() != null)
            sb.append("SMSTemplateRequest: " + getSMSTemplateRequest() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSMSTemplateRequest() == null) ? 0 : getSMSTemplateRequest().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSmsTemplateRequest == false)
            return false;
        CreateSmsTemplateRequest other = (CreateSmsTemplateRequest) obj;

        if (other.getSMSTemplateRequest() == null ^ this.getSMSTemplateRequest() == null)
            return false;
        if (other.getSMSTemplateRequest() != null
                && other.getSMSTemplateRequest().equals(this.getSMSTemplateRequest()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        return true;
    }
}
