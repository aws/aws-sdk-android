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
 * Creates a patch baseline.
 * </p>
 * <note>
 * <p>
 * For information about valid key and value pairs in <code>PatchFilters</code>
 * for each supported operating system type, see <a href=
 * "http://docs.aws.amazon.com/systems-manager/latest/APIReference/API_PatchFilter.html"
 * >PatchFilter</a>.
 * </p>
 * </note>
 */
public class CreatePatchBaselineRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default
     * value is WINDOWS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     */
    private String operatingSystem;

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     */
    private String name;

    /**
     * <p>
     * A set of global filters used to include patches in the baseline.
     * </p>
     */
    private PatchFilterGroup globalFilters;

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     */
    private PatchRuleGroup approvalRules;

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private java.util.List<String> approvedPatches;

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an
     * approved patch is reported as missing, this is the severity of the
     * compliance violation. The default value is UNSPECIFIED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     */
    private String approvedPatchesComplianceLevel;

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     */
    private Boolean approvedPatchesEnableNonSecurity;

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     */
    private java.util.List<String> rejectedPatches;

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the
     * RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is
     * installed only if it is a dependency of another package. It is considered
     * compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that
     * include them as dependencies, are not installed under any circumstances.
     * If a package was installed before it was added to the Rejected patches
     * list, it is considered non-compliant with the patch baseline, and its
     * status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     */
    private String rejectedPatchesAction;

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String description;

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     */
    private java.util.List<PatchSource> sources;

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String clientToken;

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to
     * identify the severity level of patches it specifies and the operating
     * system family it applies to. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default
     * value is WINDOWS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @return <p>
     *         Defines the operating system the patch baseline applies to. The
     *         Default value is WINDOWS.
     *         </p>
     * @see OperatingSystem
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default
     * value is WINDOWS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Defines the operating system the patch baseline applies to.
     *            The Default value is WINDOWS.
     *            </p>
     * @see OperatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default
     * value is WINDOWS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Defines the operating system the patch baseline applies to.
     *            The Default value is WINDOWS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatingSystem
     */
    public CreatePatchBaselineRequest withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default
     * value is WINDOWS.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Defines the operating system the patch baseline applies to.
     *            The Default value is WINDOWS.
     *            </p>
     * @see OperatingSystem
     */
    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
    }

    /**
     * <p>
     * Defines the operating system the patch baseline applies to. The Default
     * value is WINDOWS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU,
     * REDHAT_ENTERPRISE_LINUX, SUSE, CENTOS, ORACLE_LINUX, DEBIAN
     *
     * @param operatingSystem <p>
     *            Defines the operating system the patch baseline applies to.
     *            The Default value is WINDOWS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OperatingSystem
     */
    public CreatePatchBaselineRequest withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @return <p>
     *         The name of the patch baseline.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the patch baseline.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,128}$<br/>
     *
     * @param name <p>
     *            The name of the patch baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A set of global filters used to include patches in the baseline.
     * </p>
     *
     * @return <p>
     *         A set of global filters used to include patches in the baseline.
     *         </p>
     */
    public PatchFilterGroup getGlobalFilters() {
        return globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to include patches in the baseline.
     * </p>
     *
     * @param globalFilters <p>
     *            A set of global filters used to include patches in the
     *            baseline.
     *            </p>
     */
    public void setGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
    }

    /**
     * <p>
     * A set of global filters used to include patches in the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalFilters <p>
     *            A set of global filters used to include patches in the
     *            baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
        return this;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     *
     * @return <p>
     *         A set of rules used to include patches in the baseline.
     *         </p>
     */
    public PatchRuleGroup getApprovalRules() {
        return approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     *
     * @param approvalRules <p>
     *            A set of rules used to include patches in the baseline.
     *            </p>
     */
    public void setApprovalRules(PatchRuleGroup approvalRules) {
        this.approvalRules = approvalRules;
    }

    /**
     * <p>
     * A set of rules used to include patches in the baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvalRules <p>
     *            A set of rules used to include patches in the baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withApprovalRules(PatchRuleGroup approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of explicitly approved patches for the baseline.
     *         </p>
     *         <p>
     *         For information about accepted formats for lists of approved
     *         patches and rejected patches, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *         >About package name formats for approved and rejected patch
     *         lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getApprovedPatches() {
        return approvedPatches;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @param approvedPatches <p>
     *            A list of explicitly approved patches for the baseline.
     *            </p>
     *            <p>
     *            For information about accepted formats for lists of approved
     *            patches and rejected patches, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *            >About package name formats for approved and rejected patch
     *            lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     */
    public void setApprovedPatches(java.util.Collection<String> approvedPatches) {
        if (approvedPatches == null) {
            this.approvedPatches = null;
            return;
        }

        this.approvedPatches = new java.util.ArrayList<String>(approvedPatches);
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvedPatches <p>
     *            A list of explicitly approved patches for the baseline.
     *            </p>
     *            <p>
     *            For information about accepted formats for lists of approved
     *            patches and rejected patches, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *            >About package name formats for approved and rejected patch
     *            lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withApprovedPatches(String... approvedPatches) {
        if (getApprovedPatches() == null) {
            this.approvedPatches = new java.util.ArrayList<String>(approvedPatches.length);
        }
        for (String value : approvedPatches) {
            this.approvedPatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly approved patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvedPatches <p>
     *            A list of explicitly approved patches for the baseline.
     *            </p>
     *            <p>
     *            For information about accepted formats for lists of approved
     *            patches and rejected patches, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *            >About package name formats for approved and rejected patch
     *            lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withApprovedPatches(
            java.util.Collection<String> approvedPatches) {
        setApprovedPatches(approvedPatches);
        return this;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an
     * approved patch is reported as missing, this is the severity of the
     * compliance violation. The default value is UNSPECIFIED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @return <p>
     *         Defines the compliance level for approved patches. This means
     *         that if an approved patch is reported as missing, this is the
     *         severity of the compliance violation. The default value is
     *         UNSPECIFIED.
     *         </p>
     * @see PatchComplianceLevel
     */
    public String getApprovedPatchesComplianceLevel() {
        return approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an
     * approved patch is reported as missing, this is the severity of the
     * compliance violation. The default value is UNSPECIFIED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            Defines the compliance level for approved patches. This means
     *            that if an approved patch is reported as missing, this is the
     *            severity of the compliance violation. The default value is
     *            UNSPECIFIED.
     *            </p>
     * @see PatchComplianceLevel
     */
    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an
     * approved patch is reported as missing, this is the severity of the
     * compliance violation. The default value is UNSPECIFIED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            Defines the compliance level for approved patches. This means
     *            that if an approved patch is reported as missing, this is the
     *            severity of the compliance violation. The default value is
     *            UNSPECIFIED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceLevel
     */
    public CreatePatchBaselineRequest withApprovedPatchesComplianceLevel(
            String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
        return this;
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an
     * approved patch is reported as missing, this is the severity of the
     * compliance violation. The default value is UNSPECIFIED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            Defines the compliance level for approved patches. This means
     *            that if an approved patch is reported as missing, this is the
     *            severity of the compliance violation. The default value is
     *            UNSPECIFIED.
     *            </p>
     * @see PatchComplianceLevel
     */
    public void setApprovedPatchesComplianceLevel(
            PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
    }

    /**
     * <p>
     * Defines the compliance level for approved patches. This means that if an
     * approved patch is reported as missing, this is the severity of the
     * compliance violation. The default value is UNSPECIFIED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL,
     * UNSPECIFIED
     *
     * @param approvedPatchesComplianceLevel <p>
     *            Defines the compliance level for approved patches. This means
     *            that if an approved patch is reported as missing, this is the
     *            severity of the compliance violation. The default value is
     *            UNSPECIFIED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchComplianceLevel
     */
    public CreatePatchBaselineRequest withApprovedPatchesComplianceLevel(
            PatchComplianceLevel approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     *
     * @return <p>
     *         Indicates whether the list of approved patches includes
     *         non-security updates that should be applied to the instances. The
     *         default value is 'false'. Applies to Linux instances only.
     *         </p>
     */
    public Boolean isApprovedPatchesEnableNonSecurity() {
        return approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     *
     * @return <p>
     *         Indicates whether the list of approved patches includes
     *         non-security updates that should be applied to the instances. The
     *         default value is 'false'. Applies to Linux instances only.
     *         </p>
     */
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     *
     * @param approvedPatchesEnableNonSecurity <p>
     *            Indicates whether the list of approved patches includes
     *            non-security updates that should be applied to the instances.
     *            The default value is 'false'. Applies to Linux instances only.
     *            </p>
     */
    public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
    }

    /**
     * <p>
     * Indicates whether the list of approved patches includes non-security
     * updates that should be applied to the instances. The default value is
     * 'false'. Applies to Linux instances only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param approvedPatchesEnableNonSecurity <p>
     *            Indicates whether the list of approved patches includes
     *            non-security updates that should be applied to the instances.
     *            The default value is 'false'. Applies to Linux instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withApprovedPatchesEnableNonSecurity(
            Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @return <p>
     *         A list of explicitly rejected patches for the baseline.
     *         </p>
     *         <p>
     *         For information about accepted formats for lists of approved
     *         patches and rejected patches, see <a href=
     *         "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *         >About package name formats for approved and rejected patch
     *         lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *         </p>
     */
    public java.util.List<String> getRejectedPatches() {
        return rejectedPatches;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     *
     * @param rejectedPatches <p>
     *            A list of explicitly rejected patches for the baseline.
     *            </p>
     *            <p>
     *            For information about accepted formats for lists of approved
     *            patches and rejected patches, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *            >About package name formats for approved and rejected patch
     *            lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     */
    public void setRejectedPatches(java.util.Collection<String> rejectedPatches) {
        if (rejectedPatches == null) {
            this.rejectedPatches = null;
            return;
        }

        this.rejectedPatches = new java.util.ArrayList<String>(rejectedPatches);
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectedPatches <p>
     *            A list of explicitly rejected patches for the baseline.
     *            </p>
     *            <p>
     *            For information about accepted formats for lists of approved
     *            patches and rejected patches, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *            >About package name formats for approved and rejected patch
     *            lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withRejectedPatches(String... rejectedPatches) {
        if (getRejectedPatches() == null) {
            this.rejectedPatches = new java.util.ArrayList<String>(rejectedPatches.length);
        }
        for (String value : rejectedPatches) {
            this.rejectedPatches.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of explicitly rejected patches for the baseline.
     * </p>
     * <p>
     * For information about accepted formats for lists of approved patches and
     * rejected patches, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     * >About package name formats for approved and rejected patch lists</a> in
     * the <i>AWS Systems Manager User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rejectedPatches <p>
     *            A list of explicitly rejected patches for the baseline.
     *            </p>
     *            <p>
     *            For information about accepted formats for lists of approved
     *            patches and rejected patches, see <a href=
     *            "https://docs.aws.amazon.com/systems-manager/latest/userguide/patch-manager-approved-rejected-package-name-formats.html"
     *            >About package name formats for approved and rejected patch
     *            lists</a> in the <i>AWS Systems Manager User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withRejectedPatches(
            java.util.Collection<String> rejectedPatches) {
        setRejectedPatches(rejectedPatches);
        return this;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the
     * RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is
     * installed only if it is a dependency of another package. It is considered
     * compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that
     * include them as dependencies, are not installed under any circumstances.
     * If a package was installed before it was added to the Rejected patches
     * list, it is considered non-compliant with the patch baseline, and its
     * status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @return <p>
     *         The action for Patch Manager to take on patches included in the
     *         RejectedPackages list.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches
     *         list is installed only if it is a dependency of another package.
     *         It is considered compliant with the patch baseline, and its
     *         status is reported as <i>InstalledOther</i>. This is the default
     *         action if no option is specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>BLOCK</b>: Packages in the RejectedPatches list, and packages
     *         that include them as dependencies, are not installed under any
     *         circumstances. If a package was installed before it was added to
     *         the Rejected patches list, it is considered non-compliant with
     *         the patch baseline, and its status is reported as
     *         <i>InstalledRejected</i>.
     *         </p>
     *         </li>
     *         </ul>
     * @see PatchAction
     */
    public String getRejectedPatchesAction() {
        return rejectedPatchesAction;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the
     * RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is
     * installed only if it is a dependency of another package. It is considered
     * compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that
     * include them as dependencies, are not installed under any circumstances.
     * If a package was installed before it was added to the Rejected patches
     * list, it is considered non-compliant with the patch baseline, and its
     * status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action for Patch Manager to take on patches included in
     *            the RejectedPackages list.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches
     *            list is installed only if it is a dependency of another
     *            package. It is considered compliant with the patch baseline,
     *            and its status is reported as <i>InstalledOther</i>. This is
     *            the default action if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>BLOCK</b>: Packages in the RejectedPatches list, and
     *            packages that include them as dependencies, are not installed
     *            under any circumstances. If a package was installed before it
     *            was added to the Rejected patches list, it is considered
     *            non-compliant with the patch baseline, and its status is
     *            reported as <i>InstalledRejected</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @see PatchAction
     */
    public void setRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the
     * RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is
     * installed only if it is a dependency of another package. It is considered
     * compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that
     * include them as dependencies, are not installed under any circumstances.
     * If a package was installed before it was added to the Rejected patches
     * list, it is considered non-compliant with the patch baseline, and its
     * status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action for Patch Manager to take on patches included in
     *            the RejectedPackages list.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches
     *            list is installed only if it is a dependency of another
     *            package. It is considered compliant with the patch baseline,
     *            and its status is reported as <i>InstalledOther</i>. This is
     *            the default action if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>BLOCK</b>: Packages in the RejectedPatches list, and
     *            packages that include them as dependencies, are not installed
     *            under any circumstances. If a package was installed before it
     *            was added to the Rejected patches list, it is considered
     *            non-compliant with the patch baseline, and its status is
     *            reported as <i>InstalledRejected</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchAction
     */
    public CreatePatchBaselineRequest withRejectedPatchesAction(String rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
        return this;
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the
     * RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is
     * installed only if it is a dependency of another package. It is considered
     * compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that
     * include them as dependencies, are not installed under any circumstances.
     * If a package was installed before it was added to the Rejected patches
     * list, it is considered non-compliant with the patch baseline, and its
     * status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action for Patch Manager to take on patches included in
     *            the RejectedPackages list.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches
     *            list is installed only if it is a dependency of another
     *            package. It is considered compliant with the patch baseline,
     *            and its status is reported as <i>InstalledOther</i>. This is
     *            the default action if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>BLOCK</b>: Packages in the RejectedPatches list, and
     *            packages that include them as dependencies, are not installed
     *            under any circumstances. If a package was installed before it
     *            was added to the Rejected patches list, it is considered
     *            non-compliant with the patch baseline, and its status is
     *            reported as <i>InstalledRejected</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @see PatchAction
     */
    public void setRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction.toString();
    }

    /**
     * <p>
     * The action for Patch Manager to take on patches included in the
     * RejectedPackages list.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches list is
     * installed only if it is a dependency of another package. It is considered
     * compliant with the patch baseline, and its status is reported as
     * <i>InstalledOther</i>. This is the default action if no option is
     * specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>BLOCK</b>: Packages in the RejectedPatches list, and packages that
     * include them as dependencies, are not installed under any circumstances.
     * If a package was installed before it was added to the Rejected patches
     * list, it is considered non-compliant with the patch baseline, and its
     * status is reported as <i>InstalledRejected</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALLOW_AS_DEPENDENCY, BLOCK
     *
     * @param rejectedPatchesAction <p>
     *            The action for Patch Manager to take on patches included in
     *            the RejectedPackages list.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>ALLOW_AS_DEPENDENCY</b>: A package in the Rejected patches
     *            list is installed only if it is a dependency of another
     *            package. It is considered compliant with the patch baseline,
     *            and its status is reported as <i>InstalledOther</i>. This is
     *            the default action if no option is specified.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>BLOCK</b>: Packages in the RejectedPatches list, and
     *            packages that include them as dependencies, are not installed
     *            under any circumstances. If a package was installed before it
     *            was added to the Rejected patches list, it is considered
     *            non-compliant with the patch baseline, and its status is
     *            reported as <i>InstalledRejected</i>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PatchAction
     */
    public CreatePatchBaselineRequest withRejectedPatchesAction(PatchAction rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction.toString();
        return this;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A description of the patch baseline.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the patch baseline.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the patch baseline.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param description <p>
     *            A description of the patch baseline.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     *
     * @return <p>
     *         Information about the patches to use to update the instances,
     *         including target operating systems and source repositories.
     *         Applies to Linux instances only.
     *         </p>
     */
    public java.util.List<PatchSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     *
     * @param sources <p>
     *            Information about the patches to use to update the instances,
     *            including target operating systems and source repositories.
     *            Applies to Linux instances only.
     *            </p>
     */
    public void setSources(java.util.Collection<PatchSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<PatchSource>(sources);
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources <p>
     *            Information about the patches to use to update the instances,
     *            including target operating systems and source repositories.
     *            Applies to Linux instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withSources(PatchSource... sources) {
        if (getSources() == null) {
            this.sources = new java.util.ArrayList<PatchSource>(sources.length);
        }
        for (PatchSource value : sources) {
            this.sources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the patches to use to update the instances, including
     * target operating systems and source repositories. Applies to Linux
     * instances only.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sources <p>
     *            Information about the patches to use to update the instances,
     *            including target operating systems and source repositories.
     *            Applies to Linux instances only.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withSources(java.util.Collection<PatchSource> sources) {
        setSources(sources);
        return this;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         User-provided idempotency token.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * User-provided idempotency token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param clientToken <p>
     *            User-provided idempotency token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to
     * identify the severity level of patches it specifies and the operating
     * system family it applies to. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @return <p>
     *         Optional metadata that you assign to a resource. Tags enable you
     *         to categorize a resource in different ways, such as by purpose,
     *         owner, or environment. For example, you might want to tag a patch
     *         baseline to identify the severity level of patches it specifies
     *         and the operating system family it applies to. In this case, you
     *         could specify the following key name/value pairs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key=PatchSeverity,Value=Critical</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key=OS,Value=Windows</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         To add tags to an existing patch baseline, use the
     *         <a>AddTagsToResource</a> action.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to
     * identify the severity level of patches it specifies and the operating
     * system family it applies to. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a patch baseline to identify the severity level of patches
     *            it specifies and the operating system family it applies to. In
     *            this case, you could specify the following key name/value
     *            pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=PatchSeverity,Value=Critical</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing patch baseline, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to
     * identify the severity level of patches it specifies and the operating
     * system family it applies to. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a patch baseline to identify the severity level of patches
     *            it specifies and the operating system family it applies to. In
     *            this case, you could specify the following key name/value
     *            pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=PatchSeverity,Value=Critical</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing patch baseline, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you assign to a resource. Tags enable you to
     * categorize a resource in different ways, such as by purpose, owner, or
     * environment. For example, you might want to tag a patch baseline to
     * identify the severity level of patches it specifies and the operating
     * system family it applies to. In this case, you could specify the
     * following key name/value pairs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key=PatchSeverity,Value=Critical</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key=OS,Value=Windows</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * To add tags to an existing patch baseline, use the
     * <a>AddTagsToResource</a> action.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Optional metadata that you assign to a resource. Tags enable
     *            you to categorize a resource in different ways, such as by
     *            purpose, owner, or environment. For example, you might want to
     *            tag a patch baseline to identify the severity level of patches
     *            it specifies and the operating system family it applies to. In
     *            this case, you could specify the following key name/value
     *            pairs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Key=PatchSeverity,Value=Critical</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Key=OS,Value=Windows</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <note>
     *            <p>
     *            To add tags to an existing patch baseline, use the
     *            <a>AddTagsToResource</a> action.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePatchBaselineRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: " + getOperatingSystem() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getGlobalFilters() != null)
            sb.append("GlobalFilters: " + getGlobalFilters() + ",");
        if (getApprovalRules() != null)
            sb.append("ApprovalRules: " + getApprovalRules() + ",");
        if (getApprovedPatches() != null)
            sb.append("ApprovedPatches: " + getApprovedPatches() + ",");
        if (getApprovedPatchesComplianceLevel() != null)
            sb.append("ApprovedPatchesComplianceLevel: " + getApprovedPatchesComplianceLevel()
                    + ",");
        if (getApprovedPatchesEnableNonSecurity() != null)
            sb.append("ApprovedPatchesEnableNonSecurity: " + getApprovedPatchesEnableNonSecurity()
                    + ",");
        if (getRejectedPatches() != null)
            sb.append("RejectedPatches: " + getRejectedPatches() + ",");
        if (getRejectedPatchesAction() != null)
            sb.append("RejectedPatchesAction: " + getRejectedPatchesAction() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSources() != null)
            sb.append("Sources: " + getSources() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalFilters() == null) ? 0 : getGlobalFilters().hashCode());
        hashCode = prime * hashCode
                + ((getApprovalRules() == null) ? 0 : getApprovalRules().hashCode());
        hashCode = prime * hashCode
                + ((getApprovedPatches() == null) ? 0 : getApprovedPatches().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovedPatchesComplianceLevel() == null) ? 0
                        : getApprovedPatchesComplianceLevel().hashCode());
        hashCode = prime
                * hashCode
                + ((getApprovedPatchesEnableNonSecurity() == null) ? 0
                        : getApprovedPatchesEnableNonSecurity().hashCode());
        hashCode = prime * hashCode
                + ((getRejectedPatches() == null) ? 0 : getRejectedPatches().hashCode());
        hashCode = prime
                * hashCode
                + ((getRejectedPatchesAction() == null) ? 0 : getRejectedPatchesAction().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePatchBaselineRequest == false)
            return false;
        CreatePatchBaselineRequest other = (CreatePatchBaselineRequest) obj;

        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null
                && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGlobalFilters() == null ^ this.getGlobalFilters() == null)
            return false;
        if (other.getGlobalFilters() != null
                && other.getGlobalFilters().equals(this.getGlobalFilters()) == false)
            return false;
        if (other.getApprovalRules() == null ^ this.getApprovalRules() == null)
            return false;
        if (other.getApprovalRules() != null
                && other.getApprovalRules().equals(this.getApprovalRules()) == false)
            return false;
        if (other.getApprovedPatches() == null ^ this.getApprovedPatches() == null)
            return false;
        if (other.getApprovedPatches() != null
                && other.getApprovedPatches().equals(this.getApprovedPatches()) == false)
            return false;
        if (other.getApprovedPatchesComplianceLevel() == null
                ^ this.getApprovedPatchesComplianceLevel() == null)
            return false;
        if (other.getApprovedPatchesComplianceLevel() != null
                && other.getApprovedPatchesComplianceLevel().equals(
                        this.getApprovedPatchesComplianceLevel()) == false)
            return false;
        if (other.getApprovedPatchesEnableNonSecurity() == null
                ^ this.getApprovedPatchesEnableNonSecurity() == null)
            return false;
        if (other.getApprovedPatchesEnableNonSecurity() != null
                && other.getApprovedPatchesEnableNonSecurity().equals(
                        this.getApprovedPatchesEnableNonSecurity()) == false)
            return false;
        if (other.getRejectedPatches() == null ^ this.getRejectedPatches() == null)
            return false;
        if (other.getRejectedPatches() != null
                && other.getRejectedPatches().equals(this.getRejectedPatches()) == false)
            return false;
        if (other.getRejectedPatchesAction() == null ^ this.getRejectedPatchesAction() == null)
            return false;
        if (other.getRejectedPatchesAction() != null
                && other.getRejectedPatchesAction().equals(this.getRejectedPatchesAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}