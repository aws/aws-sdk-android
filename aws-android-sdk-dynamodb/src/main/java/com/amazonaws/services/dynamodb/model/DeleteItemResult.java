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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <code>DeleteItem</code> operation.
 * </p>
 */
public class DeleteItemResult implements Serializable {
    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the item as it appeared before the <code>DeleteItem</code>
     * operation. This map appears in the response only if
     * <code>ReturnValues</code> was specified as <code>ALL_OLD</code> in the
     * request.
     * </p>
     */
    private java.util.Map<String, AttributeValue> attributes;

    /**
     * <p>
     * The capacity units consumed by the <code>DeleteItem</code> operation. The
     * data returned includes the total provisioned throughput consumed, along
     * with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Mode</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     */
    private ConsumedCapacity consumedCapacity;

    /**
     * <p>
     * Information about item collections, if any, that were affected by the
     * <code>DeleteItem</code> operation. <code>ItemCollectionMetrics</code> is
     * only returned if the <code>ReturnItemCollectionMetrics</code> parameter
     * was specified. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <code>ItemCollectionMetrics</code> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size,
     * in gigabytes. This value is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the local secondary indexes on that table. Use this estimate
     * to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     */
    private ItemCollectionMetrics itemCollectionMetrics;

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the item as it appeared before the <code>DeleteItem</code>
     * operation. This map appears in the response only if
     * <code>ReturnValues</code> was specified as <code>ALL_OLD</code> in the
     * request.
     * </p>
     *
     * @return <p>
     *         A map of attribute names to <code>AttributeValue</code> objects,
     *         representing the item as it appeared before the
     *         <code>DeleteItem</code> operation. This map appears in the
     *         response only if <code>ReturnValues</code> was specified as
     *         <code>ALL_OLD</code> in the request.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the item as it appeared before the <code>DeleteItem</code>
     * operation. This map appears in the response only if
     * <code>ReturnValues</code> was specified as <code>ALL_OLD</code> in the
     * request.
     * </p>
     *
     * @param attributes <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the item as it appeared before the
     *            <code>DeleteItem</code> operation. This map appears in the
     *            response only if <code>ReturnValues</code> was specified as
     *            <code>ALL_OLD</code> in the request.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, AttributeValue> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the item as it appeared before the <code>DeleteItem</code>
     * operation. This map appears in the response only if
     * <code>ReturnValues</code> was specified as <code>ALL_OLD</code> in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A map of attribute names to <code>AttributeValue</code>
     *            objects, representing the item as it appeared before the
     *            <code>DeleteItem</code> operation. This map appears in the
     *            response only if <code>ReturnValues</code> was specified as
     *            <code>ALL_OLD</code> in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteItemResult withAttributes(java.util.Map<String, AttributeValue> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A map of attribute names to <code>AttributeValue</code> objects,
     * representing the item as it appeared before the <code>DeleteItem</code>
     * operation. This map appears in the response only if
     * <code>ReturnValues</code> was specified as <code>ALL_OLD</code> in the
     * request.
     * </p>
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into
     *            Attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteItemResult addAttributesEntry(String key, AttributeValue value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public DeleteItemResult clearAttributesEntries() {
        this.attributes = null;
        return this;
    }

    /**
     * <p>
     * The capacity units consumed by the <code>DeleteItem</code> operation. The
     * data returned includes the total provisioned throughput consumed, along
     * with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Mode</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         The capacity units consumed by the <code>DeleteItem</code>
     *         operation. The data returned includes the total provisioned
     *         throughput consumed, along with statistics for the table and any
     *         indexes involved in the operation. <code>ConsumedCapacity</code>
     *         is only returned if the <code>ReturnConsumedCapacity</code>
     *         parameter was specified. For more information, see <a href=
     *         "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *         >Provisioned Mode</a> in the <i>Amazon DynamoDB Developer
     *         Guide</i>.
     *         </p>
     */
    public ConsumedCapacity getConsumedCapacity() {
        return consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by the <code>DeleteItem</code> operation. The
     * data returned includes the total provisioned throughput consumed, along
     * with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Mode</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by the <code>DeleteItem</code>
     *            operation. The data returned includes the total provisioned
     *            throughput consumed, along with statistics for the table and
     *            any indexes involved in the operation.
     *            <code>ConsumedCapacity</code> is only returned if the
     *            <code>ReturnConsumedCapacity</code> parameter was specified.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *            >Provisioned Mode</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     */
    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by the <code>DeleteItem</code> operation. The
     * data returned includes the total provisioned throughput consumed, along
     * with statistics for the table and any indexes involved in the operation.
     * <code>ConsumedCapacity</code> is only returned if the
     * <code>ReturnConsumedCapacity</code> parameter was specified. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     * >Provisioned Mode</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param consumedCapacity <p>
     *            The capacity units consumed by the <code>DeleteItem</code>
     *            operation. The data returned includes the total provisioned
     *            throughput consumed, along with statistics for the table and
     *            any indexes involved in the operation.
     *            <code>ConsumedCapacity</code> is only returned if the
     *            <code>ReturnConsumedCapacity</code> parameter was specified.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html"
     *            >Provisioned Mode</a> in the <i>Amazon DynamoDB Developer
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
        return this;
    }

    /**
     * <p>
     * Information about item collections, if any, that were affected by the
     * <code>DeleteItem</code> operation. <code>ItemCollectionMetrics</code> is
     * only returned if the <code>ReturnItemCollectionMetrics</code> parameter
     * was specified. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <code>ItemCollectionMetrics</code> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size,
     * in gigabytes. This value is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the local secondary indexes on that table. Use this estimate
     * to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Information about item collections, if any, that were affected by
     *         the <code>DeleteItem</code> operation.
     *         <code>ItemCollectionMetrics</code> is only returned if the
     *         <code>ReturnItemCollectionMetrics</code> parameter was specified.
     *         If the table does not have any local secondary indexes, this
     *         information is not returned in the response.
     *         </p>
     *         <p>
     *         Each <code>ItemCollectionMetrics</code> element consists of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ItemCollectionKey</code> - The partition key value of the
     *         item collection. This is the same as the partition key value of
     *         the item itself.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SizeEstimateRangeGB</code> - An estimate of item collection
     *         size, in gigabytes. This value is a two-element array containing
     *         a lower bound and an upper bound for the estimate. The estimate
     *         includes the size of all the items in the table, plus the size of
     *         all attributes projected into all of the local secondary indexes
     *         on that table. Use this estimate to measure whether a local
     *         secondary index is approaching its size limit.
     *         </p>
     *         <p>
     *         The estimate is subject to change over time; therefore, do not
     *         rely on the precision or accuracy of the estimate.
     *         </p>
     *         </li>
     *         </ul>
     */
    public ItemCollectionMetrics getItemCollectionMetrics() {
        return itemCollectionMetrics;
    }

    /**
     * <p>
     * Information about item collections, if any, that were affected by the
     * <code>DeleteItem</code> operation. <code>ItemCollectionMetrics</code> is
     * only returned if the <code>ReturnItemCollectionMetrics</code> parameter
     * was specified. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <code>ItemCollectionMetrics</code> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size,
     * in gigabytes. This value is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the local secondary indexes on that table. Use this estimate
     * to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     *
     * @param itemCollectionMetrics <p>
     *            Information about item collections, if any, that were affected
     *            by the <code>DeleteItem</code> operation.
     *            <code>ItemCollectionMetrics</code> is only returned if the
     *            <code>ReturnItemCollectionMetrics</code> parameter was
     *            specified. If the table does not have any local secondary
     *            indexes, this information is not returned in the response.
     *            </p>
     *            <p>
     *            Each <code>ItemCollectionMetrics</code> element consists of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ItemCollectionKey</code> - The partition key value of
     *            the item collection. This is the same as the partition key
     *            value of the item itself.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SizeEstimateRangeGB</code> - An estimate of item
     *            collection size, in gigabytes. This value is a two-element
     *            array containing a lower bound and an upper bound for the
     *            estimate. The estimate includes the size of all the items in
     *            the table, plus the size of all attributes projected into all
     *            of the local secondary indexes on that table. Use this
     *            estimate to measure whether a local secondary index is
     *            approaching its size limit.
     *            </p>
     *            <p>
     *            The estimate is subject to change over time; therefore, do not
     *            rely on the precision or accuracy of the estimate.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
    }

    /**
     * <p>
     * Information about item collections, if any, that were affected by the
     * <code>DeleteItem</code> operation. <code>ItemCollectionMetrics</code> is
     * only returned if the <code>ReturnItemCollectionMetrics</code> parameter
     * was specified. If the table does not have any local secondary indexes,
     * this information is not returned in the response.
     * </p>
     * <p>
     * Each <code>ItemCollectionMetrics</code> element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item
     * collection. This is the same as the partition key value of the item
     * itself.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size,
     * in gigabytes. This value is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the local secondary indexes on that table. Use this estimate
     * to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on
     * the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param itemCollectionMetrics <p>
     *            Information about item collections, if any, that were affected
     *            by the <code>DeleteItem</code> operation.
     *            <code>ItemCollectionMetrics</code> is only returned if the
     *            <code>ReturnItemCollectionMetrics</code> parameter was
     *            specified. If the table does not have any local secondary
     *            indexes, this information is not returned in the response.
     *            </p>
     *            <p>
     *            Each <code>ItemCollectionMetrics</code> element consists of:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ItemCollectionKey</code> - The partition key value of
     *            the item collection. This is the same as the partition key
     *            value of the item itself.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SizeEstimateRangeGB</code> - An estimate of item
     *            collection size, in gigabytes. This value is a two-element
     *            array containing a lower bound and an upper bound for the
     *            estimate. The estimate includes the size of all the items in
     *            the table, plus the size of all attributes projected into all
     *            of the local secondary indexes on that table. Use this
     *            estimate to measure whether a local secondary index is
     *            approaching its size limit.
     *            </p>
     *            <p>
     *            The estimate is subject to change over time; therefore, do not
     *            rely on the precision or accuracy of the estimate.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteItemResult withItemCollectionMetrics(ItemCollectionMetrics itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
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
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes() + ",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: " + getConsumedCapacity() + ",");
        if (getItemCollectionMetrics() != null)
            sb.append("ItemCollectionMetrics: " + getItemCollectionMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode());
        hashCode = prime
                * hashCode
                + ((getItemCollectionMetrics() == null) ? 0 : getItemCollectionMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteItemResult == false)
            return false;
        DeleteItemResult other = (DeleteItemResult) obj;

        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null
                && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        if (other.getItemCollectionMetrics() == null ^ this.getItemCollectionMetrics() == null)
            return false;
        if (other.getItemCollectionMetrics() != null
                && other.getItemCollectionMetrics().equals(this.getItemCollectionMetrics()) == false)
            return false;
        return true;
    }
}
