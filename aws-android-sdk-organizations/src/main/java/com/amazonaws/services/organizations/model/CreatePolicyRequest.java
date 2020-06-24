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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a policy of a specified type that you can attach to a root, an
 * organizational unit (OU), or an individual AWS account.
 * </p>
 * <p>
 * For more information about policies and their use, see <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies.html"
 * >Managing Organization Policies</a>.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class CreatePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The policy text content to add to the new policy. The text that you
     * supply must adhere to the rules of the policy type you specify in the
     * <code>Type</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String content;

    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String description;

    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String name;

    /**
     * <p>
     * The type of policy to create. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     * >BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     * >SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     */
    private String type;

    /**
     * <p>
     * The policy text content to add to the new policy. The text that you
     * supply must adhere to the rules of the policy type you specify in the
     * <code>Type</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The policy text content to add to the new policy. The text that
     *         you supply must adhere to the rules of the policy type you
     *         specify in the <code>Type</code> parameter.
     *         </p>
     */
    public String getContent() {
        return content;
    }

    /**
     * <p>
     * The policy text content to add to the new policy. The text that you
     * supply must adhere to the rules of the policy type you specify in the
     * <code>Type</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The policy text content to add to the new policy. The text
     *            that you supply must adhere to the rules of the policy type
     *            you specify in the <code>Type</code> parameter.
     *            </p>
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The policy text content to add to the new policy. The text that you
     * supply must adhere to the rules of the policy type you specify in the
     * <code>Type</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1000000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param content <p>
     *            The policy text content to add to the new policy. The text
     *            that you supply must adhere to the rules of the policy type
     *            you specify in the <code>Type</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         An optional description to assign to the policy.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param description <p>
     *            An optional description to assign to the policy.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description to assign to the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 512<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param description <p>
     *            An optional description to assign to the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         The friendly name to assign to the policy.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         that is used to validate this parameter is a string of any of the
     *         characters in the ASCII character range.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param name <p>
     *            The friendly name to assign to the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name to assign to the policy.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> that is
     * used to validate this parameter is a string of any of the characters in
     * the ASCII character range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param name <p>
     *            The friendly name to assign to the policy.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> that is used to validate this parameter is a
     *            string of any of the characters in the ASCII character range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     * >BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     * >SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @return <p>
     *         The type of policy to create. You can specify one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     *         >BACKUP_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     *         >SERVICE_CONTROL_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >TAG_POLICY</a>
     *         </p>
     *         </li>
     *         </ul>
     * @see PolicyType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     * >BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     * >SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The type of policy to create. You can specify one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     *            >BACKUP_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     *            >SERVICE_CONTROL_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *            >TAG_POLICY</a>
     *            </p>
     *            </li>
     *            </ul>
     * @see PolicyType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     * >BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     * >SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The type of policy to create. You can specify one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     *            >BACKUP_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     *            >SERVICE_CONTROL_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *            >TAG_POLICY</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public CreatePolicyRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     * >BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     * >SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The type of policy to create. You can specify one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     *            >BACKUP_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     *            >SERVICE_CONTROL_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *            >TAG_POLICY</a>
     *            </p>
     *            </li>
     *            </ul>
     * @see PolicyType
     */
    public void setType(PolicyType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of policy to create. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     * >BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     * >SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     * >TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SERVICE_CONTROL_POLICY, TAG_POLICY, BACKUP_POLICY
     *
     * @param type <p>
     *            The type of policy to create. You can specify one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html"
     *            >BACKUP_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html"
     *            >SERVICE_CONTROL_POLICY</a>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <a href=
     *            "http://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *            >TAG_POLICY</a>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PolicyType
     */
    public CreatePolicyRequest withType(PolicyType type) {
        this.type = type.toString();
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
        if (getContent() != null)
            sb.append("Content: " + getContent() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyRequest == false)
            return false;
        CreatePolicyRequest other = (CreatePolicyRequest) obj;

        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }
}