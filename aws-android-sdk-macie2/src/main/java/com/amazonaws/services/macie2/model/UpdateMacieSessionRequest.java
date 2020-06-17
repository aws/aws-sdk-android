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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Suspends or re-enables an Amazon Macie account, or updates the configuration
 * settings for a Macie account.
 * </p>
 */
public class UpdateMacieSessionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * Specifies how often to publish updates to policy findings for the
     * account. This includes publishing updates to AWS Security Hub and Amazon
     * EventBridge (formerly called Amazon CloudWatch Events).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     */
    private String findingPublishingFrequency;

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are:
     * ENABLED, resume all Amazon Macie activities for the account; and, PAUSED,
     * suspend all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     */
    private String status;

    /**
     * Specifies how often to publish updates to policy findings for the
     * account. This includes publishing updates to AWS Security Hub and Amazon
     * EventBridge (formerly called Amazon CloudWatch Events).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @return Specifies how often to publish updates to policy findings for the
     *         account. This includes publishing updates to AWS Security Hub and
     *         Amazon EventBridge (formerly called Amazon CloudWatch Events).
     * @see FindingPublishingFrequency
     */
    public String getFindingPublishingFrequency() {
        return findingPublishingFrequency;
    }

    /**
     * Specifies how often to publish updates to policy findings for the
     * account. This includes publishing updates to AWS Security Hub and Amazon
     * EventBridge (formerly called Amazon CloudWatch Events).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish updates
     *            to policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
    }

    /**
     * Specifies how often to publish updates to policy findings for the
     * account. This includes publishing updates to AWS Security Hub and Amazon
     * EventBridge (formerly called Amazon CloudWatch Events).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish updates
     *            to policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public UpdateMacieSessionRequest withFindingPublishingFrequency(
            String findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        return this;
    }

    /**
     * Specifies how often to publish updates to policy findings for the
     * account. This includes publishing updates to AWS Security Hub and Amazon
     * EventBridge (formerly called Amazon CloudWatch Events).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish updates
     *            to policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     * @see FindingPublishingFrequency
     */
    public void setFindingPublishingFrequency(FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
    }

    /**
     * Specifies how often to publish updates to policy findings for the
     * account. This includes publishing updates to AWS Security Hub and Amazon
     * EventBridge (formerly called Amazon CloudWatch Events).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS
     *
     * @param findingPublishingFrequency Specifies how often to publish updates
     *            to policy findings for the account. This includes publishing
     *            updates to AWS Security Hub and Amazon EventBridge (formerly
     *            called Amazon CloudWatch Events).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FindingPublishingFrequency
     */
    public UpdateMacieSessionRequest withFindingPublishingFrequency(
            FindingPublishingFrequency findingPublishingFrequency) {
        this.findingPublishingFrequency = findingPublishingFrequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are:
     * ENABLED, resume all Amazon Macie activities for the account; and, PAUSED,
     * suspend all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @return <p>
     *         Specifies whether to change the status of the account. Valid
     *         values are: ENABLED, resume all Amazon Macie activities for the
     *         account; and, PAUSED, suspend all Macie activities for the
     *         account.
     *         </p>
     * @see MacieStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are:
     * ENABLED, resume all Amazon Macie activities for the account; and, PAUSED,
     * suspend all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies whether to change the status of the account. Valid
     *            values are: ENABLED, resume all Amazon Macie activities for
     *            the account; and, PAUSED, suspend all Macie activities for the
     *            account.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are:
     * ENABLED, resume all Amazon Macie activities for the account; and, PAUSED,
     * suspend all Macie activities for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies whether to change the status of the account. Valid
     *            values are: ENABLED, resume all Amazon Macie activities for
     *            the account; and, PAUSED, suspend all Macie activities for the
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public UpdateMacieSessionRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are:
     * ENABLED, resume all Amazon Macie activities for the account; and, PAUSED,
     * suspend all Macie activities for the account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies whether to change the status of the account. Valid
     *            values are: ENABLED, resume all Amazon Macie activities for
     *            the account; and, PAUSED, suspend all Macie activities for the
     *            account.
     *            </p>
     * @see MacieStatus
     */
    public void setStatus(MacieStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies whether to change the status of the account. Valid values are:
     * ENABLED, resume all Amazon Macie activities for the account; and, PAUSED,
     * suspend all Macie activities for the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAUSED, ENABLED
     *
     * @param status <p>
     *            Specifies whether to change the status of the account. Valid
     *            values are: ENABLED, resume all Amazon Macie activities for
     *            the account; and, PAUSED, suspend all Macie activities for the
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MacieStatus
     */
    public UpdateMacieSessionRequest withStatus(MacieStatus status) {
        this.status = status.toString();
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
        if (getFindingPublishingFrequency() != null)
            sb.append("findingPublishingFrequency: " + getFindingPublishingFrequency() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFindingPublishingFrequency() == null) ? 0 : getFindingPublishingFrequency()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMacieSessionRequest == false)
            return false;
        UpdateMacieSessionRequest other = (UpdateMacieSessionRequest) obj;

        if (other.getFindingPublishingFrequency() == null
                ^ this.getFindingPublishingFrequency() == null)
            return false;
        if (other.getFindingPublishingFrequency() != null
                && other.getFindingPublishingFrequency().equals(
                        this.getFindingPublishingFrequency()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
