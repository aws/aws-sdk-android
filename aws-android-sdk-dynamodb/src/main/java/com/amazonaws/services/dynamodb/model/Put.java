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
 * Represents a request to perform a <code>PutItem</code> operation.
 * </p>
 */
public class Put implements Serializable {
    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key
     * of the item to be written by <code>PutItem</code>. All of the table's
     * primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the
     * item that are part of an index key schema for the table, their types must
     * match the index key schema.
     * </p>
     */
    private java.util.Map<String, AttributeValue> item;

    /**
     * <p>
     * Name of the table in which to write the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to
     * succeed.
     * </p>
     */
    private String conditionExpression;

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     */
    private java.util.Map<String, String> expressionAttributeNames;

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     */
    private java.util.Map<String, AttributeValue> expressionAttributeValues;

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item
     * attributes if the <code>Put</code> condition fails. For
     * <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are:
     * NONE and ALL_OLD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_OLD, NONE
     */
    private String returnValuesOnConditionCheckFailure;

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key
     * of the item to be written by <code>PutItem</code>. All of the table's
     * primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the
     * item that are part of an index key schema for the table, their types must
     * match the index key schema.
     * </p>
     *
     * @return <p>
     *         A map of attribute name to attribute values, representing the
     *         primary key of the item to be written by <code>PutItem</code>.
     *         All of the table's primary key attributes must be specified, and
     *         their data types must match those of the table's key schema. If
     *         any attributes are present in the item that are part of an index
     *         key schema for the table, their types must match the index key
     *         schema.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getItem() {
        return item;
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key
     * of the item to be written by <code>PutItem</code>. All of the table's
     * primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the
     * item that are part of an index key schema for the table, their types must
     * match the index key schema.
     * </p>
     *
     * @param item <p>
     *            A map of attribute name to attribute values, representing the
     *            primary key of the item to be written by <code>PutItem</code>.
     *            All of the table's primary key attributes must be specified,
     *            and their data types must match those of the table's key
     *            schema. If any attributes are present in the item that are
     *            part of an index key schema for the table, their types must
     *            match the index key schema.
     *            </p>
     */
    public void setItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key
     * of the item to be written by <code>PutItem</code>. All of the table's
     * primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the
     * item that are part of an index key schema for the table, their types must
     * match the index key schema.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param item <p>
     *            A map of attribute name to attribute values, representing the
     *            primary key of the item to be written by <code>PutItem</code>.
     *            All of the table's primary key attributes must be specified,
     *            and their data types must match those of the table's key
     *            schema. If any attributes are present in the item that are
     *            part of an index key schema for the table, their types must
     *            match the index key schema.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put withItem(java.util.Map<String, AttributeValue> item) {
        this.item = item;
        return this;
    }

    /**
     * <p>
     * A map of attribute name to attribute values, representing the primary key
     * of the item to be written by <code>PutItem</code>. All of the table's
     * primary key attributes must be specified, and their data types must match
     * those of the table's key schema. If any attributes are present in the
     * item that are part of an index key schema for the table, their types must
     * match the index key schema.
     * </p>
     * <p>
     * The method adds a new key-value pair into Item parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Item.
     * @param value The corresponding value of the entry to be added into Item.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put addItemEntry(String key, AttributeValue value) {
        if (null == this.item) {
            this.item = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.item.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.item.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Item.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Put clearItemEntries() {
        this.item = null;
        return this;
    }

    /**
     * <p>
     * Name of the table in which to write the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Name of the table in which to write the item.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * Name of the table in which to write the item.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            Name of the table in which to write the item.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table in which to write the item.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            Name of the table in which to write the item.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to
     * succeed.
     * </p>
     *
     * @return <p>
     *         A condition that must be satisfied in order for a conditional
     *         update to succeed.
     *         </p>
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to
     * succeed.
     * </p>
     *
     * @param conditionExpression <p>
     *            A condition that must be satisfied in order for a conditional
     *            update to succeed.
     *            </p>
     */
    public void setConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
    }

    /**
     * <p>
     * A condition that must be satisfied in order for a conditional update to
     * succeed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conditionExpression <p>
     *            A condition that must be satisfied in order for a conditional
     *            update to succeed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put withConditionExpression(String conditionExpression) {
        this.conditionExpression = conditionExpression;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     *
     * @return <p>
     *         One or more substitution tokens for attribute names in an
     *         expression.
     *         </p>
     */
    public java.util.Map<String, String> getExpressionAttributeNames() {
        return expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     *
     * @param expressionAttributeNames <p>
     *            One or more substitution tokens for attribute names in an
     *            expression.
     *            </p>
     */
    public void setExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expressionAttributeNames <p>
     *            One or more substitution tokens for attribute names in an
     *            expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put withExpressionAttributeNames(java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
        return this;
    }

    /**
     * <p>
     * One or more substitution tokens for attribute names in an expression.
     * </p>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ExpressionAttributeNames.
     * @param value The corresponding value of the entry to be added into
     *            ExpressionAttributeNames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Put clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     *
     * @return <p>
     *         One or more values that can be substituted in an expression.
     *         </p>
     */
    public java.util.Map<String, AttributeValue> getExpressionAttributeValues() {
        return expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     *
     * @param expressionAttributeValues <p>
     *            One or more values that can be substituted in an expression.
     *            </p>
     */
    public void setExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expressionAttributeValues <p>
     *            One or more values that can be substituted in an expression.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put withExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
        return this;
    }

    /**
     * <p>
     * One or more values that can be substituted in an expression.
     * </p>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeValues
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ExpressionAttributeValues.
     * @param value The corresponding value of the entry to be added into
     *            ExpressionAttributeValues.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Put addExpressionAttributeValuesEntry(String key, AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public Put clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item
     * attributes if the <code>Put</code> condition fails. For
     * <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are:
     * NONE and ALL_OLD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_OLD, NONE
     *
     * @return <p>
     *         Use <code>ReturnValuesOnConditionCheckFailure</code> to get the
     *         item attributes if the <code>Put</code> condition fails. For
     *         <code>ReturnValuesOnConditionCheckFailure</code>, the valid
     *         values are: NONE and ALL_OLD.
     *         </p>
     * @see ReturnValuesOnConditionCheckFailure
     */
    public String getReturnValuesOnConditionCheckFailure() {
        return returnValuesOnConditionCheckFailure;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item
     * attributes if the <code>Put</code> condition fails. For
     * <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are:
     * NONE and ALL_OLD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_OLD, NONE
     *
     * @param returnValuesOnConditionCheckFailure <p>
     *            Use <code>ReturnValuesOnConditionCheckFailure</code> to get
     *            the item attributes if the <code>Put</code> condition fails.
     *            For <code>ReturnValuesOnConditionCheckFailure</code>, the
     *            valid values are: NONE and ALL_OLD.
     *            </p>
     * @see ReturnValuesOnConditionCheckFailure
     */
    public void setReturnValuesOnConditionCheckFailure(String returnValuesOnConditionCheckFailure) {
        this.returnValuesOnConditionCheckFailure = returnValuesOnConditionCheckFailure;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item
     * attributes if the <code>Put</code> condition fails. For
     * <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are:
     * NONE and ALL_OLD.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_OLD, NONE
     *
     * @param returnValuesOnConditionCheckFailure <p>
     *            Use <code>ReturnValuesOnConditionCheckFailure</code> to get
     *            the item attributes if the <code>Put</code> condition fails.
     *            For <code>ReturnValuesOnConditionCheckFailure</code>, the
     *            valid values are: NONE and ALL_OLD.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnValuesOnConditionCheckFailure
     */
    public Put withReturnValuesOnConditionCheckFailure(String returnValuesOnConditionCheckFailure) {
        this.returnValuesOnConditionCheckFailure = returnValuesOnConditionCheckFailure;
        return this;
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item
     * attributes if the <code>Put</code> condition fails. For
     * <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are:
     * NONE and ALL_OLD.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_OLD, NONE
     *
     * @param returnValuesOnConditionCheckFailure <p>
     *            Use <code>ReturnValuesOnConditionCheckFailure</code> to get
     *            the item attributes if the <code>Put</code> condition fails.
     *            For <code>ReturnValuesOnConditionCheckFailure</code>, the
     *            valid values are: NONE and ALL_OLD.
     *            </p>
     * @see ReturnValuesOnConditionCheckFailure
     */
    public void setReturnValuesOnConditionCheckFailure(
            ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure) {
        this.returnValuesOnConditionCheckFailure = returnValuesOnConditionCheckFailure.toString();
    }

    /**
     * <p>
     * Use <code>ReturnValuesOnConditionCheckFailure</code> to get the item
     * attributes if the <code>Put</code> condition fails. For
     * <code>ReturnValuesOnConditionCheckFailure</code>, the valid values are:
     * NONE and ALL_OLD.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL_OLD, NONE
     *
     * @param returnValuesOnConditionCheckFailure <p>
     *            Use <code>ReturnValuesOnConditionCheckFailure</code> to get
     *            the item attributes if the <code>Put</code> condition fails.
     *            For <code>ReturnValuesOnConditionCheckFailure</code>, the
     *            valid values are: NONE and ALL_OLD.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ReturnValuesOnConditionCheckFailure
     */
    public Put withReturnValuesOnConditionCheckFailure(
            ReturnValuesOnConditionCheckFailure returnValuesOnConditionCheckFailure) {
        this.returnValuesOnConditionCheckFailure = returnValuesOnConditionCheckFailure.toString();
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
        if (getItem() != null)
            sb.append("Item: " + getItem() + ",");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getConditionExpression() != null)
            sb.append("ConditionExpression: " + getConditionExpression() + ",");
        if (getExpressionAttributeNames() != null)
            sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() + ",");
        if (getExpressionAttributeValues() != null)
            sb.append("ExpressionAttributeValues: " + getExpressionAttributeValues() + ",");
        if (getReturnValuesOnConditionCheckFailure() != null)
            sb.append("ReturnValuesOnConditionCheckFailure: "
                    + getReturnValuesOnConditionCheckFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode
                + ((getConditionExpression() == null) ? 0 : getConditionExpression().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExpressionAttributeValues() == null) ? 0 : getExpressionAttributeValues()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getReturnValuesOnConditionCheckFailure() == null) ? 0
                        : getReturnValuesOnConditionCheckFailure().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Put == false)
            return false;
        Put other = (Put) obj;

        if (other.getItem() == null ^ this.getItem() == null)
            return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getConditionExpression() == null ^ this.getConditionExpression() == null)
            return false;
        if (other.getConditionExpression() != null
                && other.getConditionExpression().equals(this.getConditionExpression()) == false)
            return false;
        if (other.getExpressionAttributeNames() == null
                ^ this.getExpressionAttributeNames() == null)
            return false;
        if (other.getExpressionAttributeNames() != null
                && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false)
            return false;
        if (other.getExpressionAttributeValues() == null
                ^ this.getExpressionAttributeValues() == null)
            return false;
        if (other.getExpressionAttributeValues() != null
                && other.getExpressionAttributeValues().equals(this.getExpressionAttributeValues()) == false)
            return false;
        if (other.getReturnValuesOnConditionCheckFailure() == null
                ^ this.getReturnValuesOnConditionCheckFailure() == null)
            return false;
        if (other.getReturnValuesOnConditionCheckFailure() != null
                && other.getReturnValuesOnConditionCheckFailure().equals(
                        this.getReturnValuesOnConditionCheckFailure()) == false)
            return false;
        return true;
    }
}
