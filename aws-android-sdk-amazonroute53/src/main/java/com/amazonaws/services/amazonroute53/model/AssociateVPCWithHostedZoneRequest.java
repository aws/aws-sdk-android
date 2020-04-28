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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Associates an Amazon VPC with a private hosted zone.
 * </p>
 * <note>
 * <p>
 * To perform the association, the VPC and the private hosted zone must already
 * exist. Also, you can't convert a public hosted zone into a private hosted
 * zone.
 * </p>
 * </note>
 * <p>
 * If you want to associate a VPC that was created by one AWS account with a
 * private hosted zone that was created by a different account, do one of the
 * following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Use the AWS account that created the private hosted zone to submit a <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateVPCAssociationAuthorization.html"
 * >CreateVPCAssociationAuthorization</a> request. Then use the account that
 * created the VPC to submit an <code>AssociateVPCWithHostedZone</code> request.
 * </p>
 * </li>
 * <li>
 * <p>
 * If a subnet in the VPC was shared with another account, you can use the
 * account that the subnet was shared with to submit an
 * <code>AssociateVPCWithHostedZone</code> request. For more information about
 * sharing subnets, see <a
 * href="https://docs.aws.amazon.com/vpc/latest/userguide/vpc-sharing.html"
 * >Working with Shared VPCs</a>.
 * </p>
 * </li>
 * </ul>
 */
public class AssociateVPCWithHostedZoneRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon
     * VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * A complex type that contains information about the VPC that you want to
     * associate with a private hosted zone.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon
     * VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The ID of the private hosted zone that you want to associate an
     *         Amazon VPC with.
     *         </p>
     *         <p>
     *         Note that you can't associate a VPC with a hosted zone that
     *         doesn't have an existing VPC association.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon
     * VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the private hosted zone that you want to associate
     *            an Amazon VPC with.
     *            </p>
     *            <p>
     *            Note that you can't associate a VPC with a hosted zone that
     *            doesn't have an existing VPC association.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon
     * VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The ID of the private hosted zone that you want to associate
     *            an Amazon VPC with.
     *            </p>
     *            <p>
     *            Note that you can't associate a VPC with a hosted zone that
     *            doesn't have an existing VPC association.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVPCWithHostedZoneRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you want to
     * associate with a private hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains information about the VPC that you
     *         want to associate with a private hosted zone.
     *         </p>
     */
    public VPC getVPC() {
        return vPC;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you want to
     * associate with a private hosted zone.
     * </p>
     *
     * @param vPC <p>
     *            A complex type that contains information about the VPC that
     *            you want to associate with a private hosted zone.
     *            </p>
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you want to
     * associate with a private hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPC <p>
     *            A complex type that contains information about the VPC that
     *            you want to associate with a private hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVPCWithHostedZoneRequest withVPC(VPC vPC) {
        this.vPC = vPC;
        return this;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     *
     * @return <p>
     *         <i>Optional:</i> A comment about the association request.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     *
     * @param comment <p>
     *            <i>Optional:</i> A comment about the association request.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            <i>Optional:</i> A comment about the association request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociateVPCWithHostedZoneRequest withComment(String comment) {
        this.comment = comment;
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getVPC() != null)
            sb.append("VPC: " + getVPC() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateVPCWithHostedZoneRequest == false)
            return false;
        AssociateVPCWithHostedZoneRequest other = (AssociateVPCWithHostedZoneRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
