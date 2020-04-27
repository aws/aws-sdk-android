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

package com.amazonaws.services.awsdataexchange.model;

import java.io.Serializable;

/**
 * <p>
 * A revision is a container for one or more assets.
 * </p>
 */
public class RevisionEntry implements Serializable {
    /**
     * <p>
     * The ARN for the revision.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     */
    private String comment;

    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     */
    private String dataSetId;

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first
     * be finalized. Finalizing a revision tells AWS Data Exchange that your
     * changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange
     * console or the AWS Marketplace Catalog API, using the StartChangeSet AWS
     * Marketplace Catalog API action. When using the API, revisions are
     * uniquely identified by their ARN.
     * </p>
     */
    private Boolean finalized;

    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled
     * revision being viewed. This parameter is returned when a revision owner
     * is viewing the entitled copy of its owned revision.
     * </p>
     */
    private String sourceId;

    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ARN for the revision.
     * </p>
     *
     * @return <p>
     *         The ARN for the revision.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN for the revision.
     * </p>
     *
     * @param arn <p>
     *            The ARN for the revision.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The ARN for the revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @return <p>
     *         An optional comment about the revision.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param comment <p>
     *            An optional comment about the revision.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * An optional comment about the revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 16384<br/>
     *
     * @param comment <p>
     *            An optional comment about the revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the revision was created, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     *
     * @param createdAt <p>
     *            The date and time that the revision was created, in ISO 8601
     *            format.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the revision was created, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The date and time that the revision was created, in ISO 8601
     *            format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the data set associated with this
     *         revision.
     *         </p>
     */
    public String getDataSetId() {
        return dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            revision.
     *            </p>
     */
    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The unique identifier for the data set associated with this revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSetId <p>
     *            The unique identifier for the data set associated with this
     *            revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first
     * be finalized. Finalizing a revision tells AWS Data Exchange that your
     * changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange
     * console or the AWS Marketplace Catalog API, using the StartChangeSet AWS
     * Marketplace Catalog API action. When using the API, revisions are
     * uniquely identified by their ARN.
     * </p>
     *
     * @return <p>
     *         To publish a revision to a data set in a product, the revision
     *         must first be finalized. Finalizing a revision tells AWS Data
     *         Exchange that your changes to the assets in the revision are
     *         complete. After it's in this read-only state, you can publish the
     *         revision to your products.
     *         </p>
     *         <p>
     *         Finalized revisions can be published through the AWS Data
     *         Exchange console or the AWS Marketplace Catalog API, using the
     *         StartChangeSet AWS Marketplace Catalog API action. When using the
     *         API, revisions are uniquely identified by their ARN.
     *         </p>
     */
    public Boolean isFinalized() {
        return finalized;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first
     * be finalized. Finalizing a revision tells AWS Data Exchange that your
     * changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange
     * console or the AWS Marketplace Catalog API, using the StartChangeSet AWS
     * Marketplace Catalog API action. When using the API, revisions are
     * uniquely identified by their ARN.
     * </p>
     *
     * @return <p>
     *         To publish a revision to a data set in a product, the revision
     *         must first be finalized. Finalizing a revision tells AWS Data
     *         Exchange that your changes to the assets in the revision are
     *         complete. After it's in this read-only state, you can publish the
     *         revision to your products.
     *         </p>
     *         <p>
     *         Finalized revisions can be published through the AWS Data
     *         Exchange console or the AWS Marketplace Catalog API, using the
     *         StartChangeSet AWS Marketplace Catalog API action. When using the
     *         API, revisions are uniquely identified by their ARN.
     *         </p>
     */
    public Boolean getFinalized() {
        return finalized;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first
     * be finalized. Finalizing a revision tells AWS Data Exchange that your
     * changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange
     * console or the AWS Marketplace Catalog API, using the StartChangeSet AWS
     * Marketplace Catalog API action. When using the API, revisions are
     * uniquely identified by their ARN.
     * </p>
     *
     * @param finalized <p>
     *            To publish a revision to a data set in a product, the revision
     *            must first be finalized. Finalizing a revision tells AWS Data
     *            Exchange that your changes to the assets in the revision are
     *            complete. After it's in this read-only state, you can publish
     *            the revision to your products.
     *            </p>
     *            <p>
     *            Finalized revisions can be published through the AWS Data
     *            Exchange console or the AWS Marketplace Catalog API, using the
     *            StartChangeSet AWS Marketplace Catalog API action. When using
     *            the API, revisions are uniquely identified by their ARN.
     *            </p>
     */
    public void setFinalized(Boolean finalized) {
        this.finalized = finalized;
    }

    /**
     * <p>
     * To publish a revision to a data set in a product, the revision must first
     * be finalized. Finalizing a revision tells AWS Data Exchange that your
     * changes to the assets in the revision are complete. After it's in this
     * read-only state, you can publish the revision to your products.
     * </p>
     * <p>
     * Finalized revisions can be published through the AWS Data Exchange
     * console or the AWS Marketplace Catalog API, using the StartChangeSet AWS
     * Marketplace Catalog API action. When using the API, revisions are
     * uniquely identified by their ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param finalized <p>
     *            To publish a revision to a data set in a product, the revision
     *            must first be finalized. Finalizing a revision tells AWS Data
     *            Exchange that your changes to the assets in the revision are
     *            complete. After it's in this read-only state, you can publish
     *            the revision to your products.
     *            </p>
     *            <p>
     *            Finalized revisions can be published through the AWS Data
     *            Exchange console or the AWS Marketplace Catalog API, using the
     *            StartChangeSet AWS Marketplace Catalog API action. When using
     *            the API, revisions are uniquely identified by their ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withFinalized(Boolean finalized) {
        this.finalized = finalized;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the revision.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the revision.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled
     * revision being viewed. This parameter is returned when a revision owner
     * is viewing the entitled copy of its owned revision.
     * </p>
     *
     * @return <p>
     *         The revision ID of the owned revision corresponding to the
     *         entitled revision being viewed. This parameter is returned when a
     *         revision owner is viewing the entitled copy of its owned
     *         revision.
     *         </p>
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled
     * revision being viewed. This parameter is returned when a revision owner
     * is viewing the entitled copy of its owned revision.
     * </p>
     *
     * @param sourceId <p>
     *            The revision ID of the owned revision corresponding to the
     *            entitled revision being viewed. This parameter is returned
     *            when a revision owner is viewing the entitled copy of its
     *            owned revision.
     *            </p>
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The revision ID of the owned revision corresponding to the entitled
     * revision being viewed. This parameter is returned when a revision owner
     * is viewing the entitled copy of its owned revision.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceId <p>
     *            The revision ID of the owned revision corresponding to the
     *            entitled revision being viewed. This parameter is returned
     *            when a revision owner is viewing the entitled copy of its
     *            owned revision.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The date and time that the revision was last updated, in ISO 8601
     *         format.
     *         </p>
     */
    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     *
     * @param updatedAt <p>
     *            The date and time that the revision was last updated, in ISO
     *            8601 format.
     *            </p>
     */
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the revision was last updated, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedAt <p>
     *            The date and time that the revision was last updated, in ISO
     *            8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RevisionEntry withUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getDataSetId() != null)
            sb.append("DataSetId: " + getDataSetId() + ",");
        if (getFinalized() != null)
            sb.append("Finalized: " + getFinalized() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getSourceId() != null)
            sb.append("SourceId: " + getSourceId() + ",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: " + getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getFinalized() == null) ? 0 : getFinalized().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevisionEntry == false)
            return false;
        RevisionEntry other = (RevisionEntry) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null
                && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getFinalized() == null ^ this.getFinalized() == null)
            return false;
        if (other.getFinalized() != null
                && other.getFinalized().equals(this.getFinalized()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null
                && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }
}
