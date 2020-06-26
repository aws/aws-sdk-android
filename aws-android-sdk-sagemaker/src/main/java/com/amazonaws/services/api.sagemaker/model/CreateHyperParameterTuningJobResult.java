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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

public class CreateHyperParameterTuningJobResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker
     * assigns an ARN to a hyperparameter tuning job when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     */
    private String hyperParameterTuningJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker
     * assigns an ARN to a hyperparameter tuning job when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the tuning job. Amazon
     *         SageMaker assigns an ARN to a hyperparameter tuning job when you
     *         create it.
     *         </p>
     */
    public String getHyperParameterTuningJobArn() {
        return hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker
     * assigns an ARN to a hyperparameter tuning job when you create it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @param hyperParameterTuningJobArn <p>
     *            The Amazon Resource Name (ARN) of the tuning job. Amazon
     *            SageMaker assigns an ARN to a hyperparameter tuning job when
     *            you create it.
     *            </p>
     */
    public void setHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job. Amazon SageMaker
     * assigns an ARN to a hyperparameter tuning job when you create it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter
     * -tuning-job/.*<br/>
     *
     * @param hyperParameterTuningJobArn <p>
     *            The Amazon Resource Name (ARN) of the tuning job. Amazon
     *            SageMaker assigns an ARN to a hyperparameter tuning job when
     *            you create it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateHyperParameterTuningJobResult withHyperParameterTuningJobArn(
            String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
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
        if (getHyperParameterTuningJobArn() != null)
            sb.append("HyperParameterTuningJobArn: " + getHyperParameterTuningJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHyperParameterTuningJobArn() == null) ? 0 : getHyperParameterTuningJobArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateHyperParameterTuningJobResult == false)
            return false;
        CreateHyperParameterTuningJobResult other = (CreateHyperParameterTuningJobResult) obj;

        if (other.getHyperParameterTuningJobArn() == null
                ^ this.getHyperParameterTuningJobArn() == null)
            return false;
        if (other.getHyperParameterTuningJobArn() != null
                && other.getHyperParameterTuningJobArn().equals(
                        this.getHyperParameterTuningJobArn()) == false)
            return false;
        return true;
    }
}
