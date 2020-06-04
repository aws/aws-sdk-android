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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * <code>ServiceSetting</code> is an account-level setting for an AWS service.
 * This setting defines how a user interacts with or uses a service or a feature
 * of a service. For example, if an AWS service charges money to the account
 * based on feature or service usage, then the AWS service team might create a
 * default setting of "false". This means the user can't use this feature unless
 * they change the setting to "true" and intentionally opt in for a paid
 * feature.
 * </p>
 * <p>
 * Services map a <code>SettingId</code> object to a setting value. AWS services
 * teams define the default value for a <code>SettingId</code>. You can't create
 * a new <code>SettingId</code>, but you can overwrite the default value if you
 * have the <code>ssm:UpdateServiceSetting</code> permission for the setting.
 * Use the <a>GetServiceSetting</a> API action to view the current value. Use
 * the <a>UpdateServiceSetting</a> API action to change the default setting.
 * </p>
 * <p>
 * Reset the service setting for the account to the default value as provisioned
 * by the AWS service team.
 * </p>
 */
public class ResetServiceSettingRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. The
     * setting ID can be
     * <code>/ssm/parameter-store/default-parameter-tier</code>,
     * <code>/ssm/parameter-store/high-throughput-enabled</code>, or
     * <code>/ssm/managed-instance/activation-tier</code>. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     */
    private String settingId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. The
     * setting ID can be
     * <code>/ssm/parameter-store/default-parameter-tier</code>,
     * <code>/ssm/parameter-store/high-throughput-enabled</code>, or
     * <code>/ssm/managed-instance/activation-tier</code>. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the service setting to reset.
     *         The setting ID can be
     *         <code>/ssm/parameter-store/default-parameter-tier</code>,
     *         <code>/ssm/parameter-store/high-throughput-enabled</code>, or
     *         <code>/ssm/managed-instance/activation-tier</code>. For example,
     *         <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     *         .
     *         </p>
     */
    public String getSettingId() {
        return settingId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. The
     * setting ID can be
     * <code>/ssm/parameter-store/default-parameter-tier</code>,
     * <code>/ssm/parameter-store/high-throughput-enabled</code>, or
     * <code>/ssm/managed-instance/activation-tier</code>. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     * .
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param settingId <p>
     *            The Amazon Resource Name (ARN) of the service setting to
     *            reset. The setting ID can be
     *            <code>/ssm/parameter-store/default-parameter-tier</code>,
     *            <code>/ssm/parameter-store/high-throughput-enabled</code>, or
     *            <code>/ssm/managed-instance/activation-tier</code>. For
     *            example,
     *            <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     *            .
     *            </p>
     */
    public void setSettingId(String settingId) {
        this.settingId = settingId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service setting to reset. The
     * setting ID can be
     * <code>/ssm/parameter-store/default-parameter-tier</code>,
     * <code>/ssm/parameter-store/high-throughput-enabled</code>, or
     * <code>/ssm/managed-instance/activation-tier</code>. For example,
     * <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000<br/>
     *
     * @param settingId <p>
     *            The Amazon Resource Name (ARN) of the service setting to
     *            reset. The setting ID can be
     *            <code>/ssm/parameter-store/default-parameter-tier</code>,
     *            <code>/ssm/parameter-store/high-throughput-enabled</code>, or
     *            <code>/ssm/managed-instance/activation-tier</code>. For
     *            example,
     *            <code>arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResetServiceSettingRequest withSettingId(String settingId) {
        this.settingId = settingId;
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
        if (getSettingId() != null)
            sb.append("SettingId: " + getSettingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSettingId() == null) ? 0 : getSettingId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResetServiceSettingRequest == false)
            return false;
        ResetServiceSettingRequest other = (ResetServiceSettingRequest) obj;

        if (other.getSettingId() == null ^ this.getSettingId() == null)
            return false;
        if (other.getSettingId() != null
                && other.getSettingId().equals(this.getSettingId()) == false)
            return false;
        return true;
    }
}