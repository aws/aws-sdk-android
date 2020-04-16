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

/**
 * <p>
 * Metadata includes information like the ARN of the last user and the date/time
 * the parameter was last used.
 * </p>
 */
public class ParameterMetadata implements Serializable {
    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String name;

    /**
     * <p>
     * The type of parameter. Valid parameter types include the following:
     * String, String list, Secure string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     */
    private String type;

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     */
    private String keyId;

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the
     * parameter.
     * </p>
     */
    private String lastModifiedUser;

    /**
     * <p>
     * Description of the parameter actions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * A parameter name can include only the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String allowedPattern;

    /**
     * <p>
     * The parameter version.
     * </p>
     */
    private Long version;

    /**
     * <p>
     * The parameter tier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     */
    private String tier;

    /**
     * <p>
     * A list of policies associated with a parameter.
     * </p>
     */
    private java.util.List<ParameterInlinePolicy> policies;

    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         The parameter name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>
     *            The parameter name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The parameter name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param name <p>
     *            The parameter name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of parameter. Valid parameter types include the following:
     * String, String list, Secure string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @return <p>
     *         The type of parameter. Valid parameter types include the
     *         following: String, String list, Secure string.
     *         </p>
     * @see ParameterType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of parameter. Valid parameter types include the following:
     * String, String list, Secure string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter. Valid parameter types include the
     *            following: String, String list, Secure string.
     *            </p>
     * @see ParameterType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of parameter. Valid parameter types include the following:
     * String, String list, Secure string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter. Valid parameter types include the
     *            following: String, String list, Secure string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterType
     */
    public ParameterMetadata withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of parameter. Valid parameter types include the following:
     * String, String list, Secure string.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter. Valid parameter types include the
     *            following: String, String list, Secure string.
     *            </p>
     * @see ParameterType
     */
    public void setType(ParameterType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of parameter. Valid parameter types include the following:
     * String, String list, Secure string.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>String, StringList, SecureString
     *
     * @param type <p>
     *            The type of parameter. Valid parameter types include the
     *            following: String, String list, Secure string.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterType
     */
    public ParameterMetadata withType(ParameterType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     *
     * @return <p>
     *         The ID of the query key used for this parameter.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     *
     * @param keyId <p>
     *            The ID of the query key used for this parameter.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The ID of the query key used for this parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^([a-zA-Z0-9:/_-]+)$<br/>
     *
     * @param keyId <p>
     *            The ID of the query key used for this parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     *
     * @return <p>
     *         Date the parameter was last changed or updated.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            Date the parameter was last changed or updated.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Date the parameter was last changed or updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            Date the parameter was last changed or updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the
     * parameter.
     * </p>
     *
     * @return <p>
     *         Amazon Resource Name (ARN) of the AWS user who last changed the
     *         parameter.
     *         </p>
     */
    public String getLastModifiedUser() {
        return lastModifiedUser;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the
     * parameter.
     * </p>
     *
     * @param lastModifiedUser <p>
     *            Amazon Resource Name (ARN) of the AWS user who last changed
     *            the parameter.
     *            </p>
     */
    public void setLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the AWS user who last changed the
     * parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedUser <p>
     *            Amazon Resource Name (ARN) of the AWS user who last changed
     *            the parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withLastModifiedUser(String lastModifiedUser) {
        this.lastModifiedUser = lastModifiedUser;
        return this;
    }

    /**
     * <p>
     * Description of the parameter actions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         Description of the parameter actions.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Description of the parameter actions.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            Description of the parameter actions.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the parameter actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description <p>
     *            Description of the parameter actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * A parameter name can include only the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return <p>
     *         A parameter name can include only the following letters and
     *         symbols.
     *         </p>
     *         <p>
     *         a-zA-Z0-9_.-
     *         </p>
     */
    public String getAllowedPattern() {
        return allowedPattern;
    }

    /**
     * <p>
     * A parameter name can include only the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param allowedPattern <p>
     *            A parameter name can include only the following letters and
     *            symbols.
     *            </p>
     *            <p>
     *            a-zA-Z0-9_.-
     *            </p>
     */
    public void setAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
    }

    /**
     * <p>
     * A parameter name can include only the following letters and symbols.
     * </p>
     * <p>
     * a-zA-Z0-9_.-
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param allowedPattern <p>
     *            A parameter name can include only the following letters and
     *            symbols.
     *            </p>
     *            <p>
     *            a-zA-Z0-9_.-
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withAllowedPattern(String allowedPattern) {
        this.allowedPattern = allowedPattern;
        return this;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     *
     * @return <p>
     *         The parameter version.
     *         </p>
     */
    public Long getVersion() {
        return version;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     *
     * @param version <p>
     *            The parameter version.
     *            </p>
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The parameter version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The parameter version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @return <p>
     *         The parameter tier.
     *         </p>
     * @see ParameterTier
     */
    public String getTier() {
        return tier;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier.
     *            </p>
     * @see ParameterTier
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterTier
     */
    public ParameterMetadata withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier.
     *            </p>
     * @see ParameterTier
     */
    public void setTier(ParameterTier tier) {
        this.tier = tier.toString();
    }

    /**
     * <p>
     * The parameter tier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Advanced, Intelligent-Tiering
     *
     * @param tier <p>
     *            The parameter tier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ParameterTier
     */
    public ParameterMetadata withTier(ParameterTier tier) {
        this.tier = tier.toString();
        return this;
    }

    /**
     * <p>
     * A list of policies associated with a parameter.
     * </p>
     *
     * @return <p>
     *         A list of policies associated with a parameter.
     *         </p>
     */
    public java.util.List<ParameterInlinePolicy> getPolicies() {
        return policies;
    }

    /**
     * <p>
     * A list of policies associated with a parameter.
     * </p>
     *
     * @param policies <p>
     *            A list of policies associated with a parameter.
     *            </p>
     */
    public void setPolicies(java.util.Collection<ParameterInlinePolicy> policies) {
        if (policies == null) {
            this.policies = null;
            return;
        }

        this.policies = new java.util.ArrayList<ParameterInlinePolicy>(policies);
    }

    /**
     * <p>
     * A list of policies associated with a parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            A list of policies associated with a parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withPolicies(ParameterInlinePolicy... policies) {
        if (getPolicies() == null) {
            this.policies = new java.util.ArrayList<ParameterInlinePolicy>(policies.length);
        }
        for (ParameterInlinePolicy value : policies) {
            this.policies.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of policies associated with a parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            A list of policies associated with a parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ParameterMetadata withPolicies(java.util.Collection<ParameterInlinePolicy> policies) {
        setPolicies(policies);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getLastModifiedUser() != null)
            sb.append("LastModifiedUser: " + getLastModifiedUser() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getAllowedPattern() != null)
            sb.append("AllowedPattern: " + getAllowedPattern() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedUser() == null) ? 0 : getLastModifiedUser().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getAllowedPattern() == null) ? 0 : getAllowedPattern().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParameterMetadata == false)
            return false;
        ParameterMetadata other = (ParameterMetadata) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedUser() == null ^ this.getLastModifiedUser() == null)
            return false;
        if (other.getLastModifiedUser() != null
                && other.getLastModifiedUser().equals(this.getLastModifiedUser()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAllowedPattern() == null ^ this.getAllowedPattern() == null)
            return false;
        if (other.getAllowedPattern() != null
                && other.getAllowedPattern().equals(this.getAllowedPattern()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        return true;
    }
}
