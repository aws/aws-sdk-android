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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

public class CreateNotebookInstanceLifecycleConfigResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String notebookInstanceLifecycleConfigArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the lifecycle configuration.
     *         </p>
     */
    public String getNotebookInstanceLifecycleConfigArn() {
        return notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param notebookInstanceLifecycleConfigArn <p>
     *            The Amazon Resource Name (ARN) of the lifecycle configuration.
     *            </p>
     */
    public void setNotebookInstanceLifecycleConfigArn(String notebookInstanceLifecycleConfigArn) {
        this.notebookInstanceLifecycleConfigArn = notebookInstanceLifecycleConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the lifecycle configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param notebookInstanceLifecycleConfigArn <p>
     *            The Amazon Resource Name (ARN) of the lifecycle configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNotebookInstanceLifecycleConfigResult withNotebookInstanceLifecycleConfigArn(
            String notebookInstanceLifecycleConfigArn) {
        this.notebookInstanceLifecycleConfigArn = notebookInstanceLifecycleConfigArn;
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
        if (getNotebookInstanceLifecycleConfigArn() != null)
            sb.append("NotebookInstanceLifecycleConfigArn: "
                    + getNotebookInstanceLifecycleConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getNotebookInstanceLifecycleConfigArn() == null) ? 0
                        : getNotebookInstanceLifecycleConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNotebookInstanceLifecycleConfigResult == false)
            return false;
        CreateNotebookInstanceLifecycleConfigResult other = (CreateNotebookInstanceLifecycleConfigResult) obj;

        if (other.getNotebookInstanceLifecycleConfigArn() == null
                ^ this.getNotebookInstanceLifecycleConfigArn() == null)
            return false;
        if (other.getNotebookInstanceLifecycleConfigArn() != null
                && other.getNotebookInstanceLifecycleConfigArn().equals(
                        this.getNotebookInstanceLifecycleConfigArn()) == false)
            return false;
        return true;
    }
}
