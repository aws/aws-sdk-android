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

public class ListTransformJobsResult implements Serializable {
    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     */
    private java.util.List<TransformJobSummary> transformJobSummaries;

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of transform jobs, use it in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>TransformJobSummary</code> objects.
     *         </p>
     */
    public java.util.List<TransformJobSummary> getTransformJobSummaries() {
        return transformJobSummaries;
    }

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     *
     * @param transformJobSummaries <p>
     *            An array of <code>TransformJobSummary</code> objects.
     *            </p>
     */
    public void setTransformJobSummaries(
            java.util.Collection<TransformJobSummary> transformJobSummaries) {
        if (transformJobSummaries == null) {
            this.transformJobSummaries = null;
            return;
        }

        this.transformJobSummaries = new java.util.ArrayList<TransformJobSummary>(
                transformJobSummaries);
    }

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformJobSummaries <p>
     *            An array of <code>TransformJobSummary</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsResult withTransformJobSummaries(
            TransformJobSummary... transformJobSummaries) {
        if (getTransformJobSummaries() == null) {
            this.transformJobSummaries = new java.util.ArrayList<TransformJobSummary>(
                    transformJobSummaries.length);
        }
        for (TransformJobSummary value : transformJobSummaries) {
            this.transformJobSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>TransformJobSummary</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transformJobSummaries <p>
     *            An array of <code>TransformJobSummary</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsResult withTransformJobSummaries(
            java.util.Collection<TransformJobSummary> transformJobSummaries) {
        setTransformJobSummaries(transformJobSummaries);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of transform jobs, use it in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         If the response is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of transform jobs, use it in the
     *         next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of transform jobs, use it in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of transform jobs, use it in
     *            the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, Amazon SageMaker returns this token. To
     * retrieve the next set of transform jobs, use it in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param nextToken <p>
     *            If the response is truncated, Amazon SageMaker returns this
     *            token. To retrieve the next set of transform jobs, use it in
     *            the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTransformJobsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTransformJobSummaries() != null)
            sb.append("TransformJobSummaries: " + getTransformJobSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransformJobSummaries() == null) ? 0 : getTransformJobSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTransformJobsResult == false)
            return false;
        ListTransformJobsResult other = (ListTransformJobsResult) obj;

        if (other.getTransformJobSummaries() == null ^ this.getTransformJobSummaries() == null)
            return false;
        if (other.getTransformJobSummaries() != null
                && other.getTransformJobSummaries().equals(this.getTransformJobSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
