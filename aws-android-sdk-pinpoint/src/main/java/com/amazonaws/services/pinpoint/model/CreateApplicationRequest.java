/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Application Request.
 */
public class CreateApplicationRequest implements Serializable {
    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     */
    private String name;

    /**
     * The Tags for the app.
     */
    private java.util.Map<String, String> tags;

    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     *
     * @return The display name of the application. Used in the Amazon Pinpoint
     *         console.
     */
    public String getName() {
        return name;
    }

    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     *
     * @param name The display name of the application. Used in the Amazon
     *            Pinpoint console.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The display name of the application. Used in the Amazon
     *            Pinpoint console.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The Tags for the app.
     *
     * @return The Tags for the app.
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The Tags for the app.
     *
     * @param tags The Tags for the app.
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The Tags for the app.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags The Tags for the app.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * The Tags for the app.
     * <p>
     * The method adds a new key-value pair into tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into tags.
     * @param value The corresponding value of the entry to be added into tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest addtagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateApplicationRequest cleartagsEntries() {
        this.tags = null;
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
        if (getTags() != null)
            sb.append("tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
