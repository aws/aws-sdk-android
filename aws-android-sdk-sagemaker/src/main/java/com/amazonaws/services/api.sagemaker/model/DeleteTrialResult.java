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

public class DeleteTrialResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial that is being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     */
    private String trialArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial that is being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the trial that is being
     *         deleted.
     *         </p>
     */
    public String getTrialArn() {
        return trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial that is being deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial that is being
     *            deleted.
     *            </p>
     */
    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial that is being deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:experiment-trial/.*
     * <br/>
     *
     * @param trialArn <p>
     *            The Amazon Resource Name (ARN) of the trial that is being
     *            deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteTrialResult withTrialArn(String trialArn) {
        this.trialArn = trialArn;
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
        if (getTrialArn() != null)
            sb.append("TrialArn: " + getTrialArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTrialResult == false)
            return false;
        DeleteTrialResult other = (DeleteTrialResult) obj;

        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        return true;
    }
}
