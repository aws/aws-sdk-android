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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the input.
 * </p>
 */
public class Input implements Serializable {
    /**
     * <p>
     * Information about the configuration of an input.
     * </p>
     */
    private InputConfiguration inputConfiguration;

    /**
     * <p>
     * The definition of the input.
     * </p>
     */
    private InputDefinition inputDefinition;

    /**
     * <p>
     * Information about the configuration of an input.
     * </p>
     *
     * @return <p>
     *         Information about the configuration of an input.
     *         </p>
     */
    public InputConfiguration getInputConfiguration() {
        return inputConfiguration;
    }

    /**
     * <p>
     * Information about the configuration of an input.
     * </p>
     *
     * @param inputConfiguration <p>
     *            Information about the configuration of an input.
     *            </p>
     */
    public void setInputConfiguration(InputConfiguration inputConfiguration) {
        this.inputConfiguration = inputConfiguration;
    }

    /**
     * <p>
     * Information about the configuration of an input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputConfiguration <p>
     *            Information about the configuration of an input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withInputConfiguration(InputConfiguration inputConfiguration) {
        this.inputConfiguration = inputConfiguration;
        return this;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     *
     * @return <p>
     *         The definition of the input.
     *         </p>
     */
    public InputDefinition getInputDefinition() {
        return inputDefinition;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     *
     * @param inputDefinition <p>
     *            The definition of the input.
     *            </p>
     */
    public void setInputDefinition(InputDefinition inputDefinition) {
        this.inputDefinition = inputDefinition;
    }

    /**
     * <p>
     * The definition of the input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputDefinition <p>
     *            The definition of the input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Input withInputDefinition(InputDefinition inputDefinition) {
        this.inputDefinition = inputDefinition;
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
        if (getInputConfiguration() != null)
            sb.append("inputConfiguration: " + getInputConfiguration() + ",");
        if (getInputDefinition() != null)
            sb.append("inputDefinition: " + getInputDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInputConfiguration() == null) ? 0 : getInputConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getInputDefinition() == null) ? 0 : getInputDefinition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Input == false)
            return false;
        Input other = (Input) obj;

        if (other.getInputConfiguration() == null ^ this.getInputConfiguration() == null)
            return false;
        if (other.getInputConfiguration() != null
                && other.getInputConfiguration().equals(this.getInputConfiguration()) == false)
            return false;
        if (other.getInputDefinition() == null ^ this.getInputDefinition() == null)
            return false;
        if (other.getInputDefinition() != null
                && other.getInputDefinition().equals(this.getInputDefinition()) == false)
            return false;
        return true;
    }
}
