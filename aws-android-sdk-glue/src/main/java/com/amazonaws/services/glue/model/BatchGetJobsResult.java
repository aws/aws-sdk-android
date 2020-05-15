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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class BatchGetJobsResult implements Serializable {
    /**
     * <p>
     * A list of job definitions.
     * </p>
     */
    private java.util.List<Job> jobs;

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     */
    private java.util.List<String> jobsNotFound;

    /**
     * <p>
     * A list of job definitions.
     * </p>
     *
     * @return <p>
     *         A list of job definitions.
     *         </p>
     */
    public java.util.List<Job> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * A list of job definitions.
     * </p>
     *
     * @param jobs <p>
     *            A list of job definitions.
     *            </p>
     */
    public void setJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<Job>(jobs);
    }

    /**
     * <p>
     * A list of job definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobs <p>
     *            A list of job definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetJobsResult withJobs(Job... jobs) {
        if (getJobs() == null) {
            this.jobs = new java.util.ArrayList<Job>(jobs.length);
        }
        for (Job value : jobs) {
            this.jobs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of job definitions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobs <p>
     *            A list of job definitions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetJobsResult withJobs(java.util.Collection<Job> jobs) {
        setJobs(jobs);
        return this;
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     *
     * @return <p>
     *         A list of names of jobs not found.
     *         </p>
     */
    public java.util.List<String> getJobsNotFound() {
        return jobsNotFound;
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     *
     * @param jobsNotFound <p>
     *            A list of names of jobs not found.
     *            </p>
     */
    public void setJobsNotFound(java.util.Collection<String> jobsNotFound) {
        if (jobsNotFound == null) {
            this.jobsNotFound = null;
            return;
        }

        this.jobsNotFound = new java.util.ArrayList<String>(jobsNotFound);
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobsNotFound <p>
     *            A list of names of jobs not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetJobsResult withJobsNotFound(String... jobsNotFound) {
        if (getJobsNotFound() == null) {
            this.jobsNotFound = new java.util.ArrayList<String>(jobsNotFound.length);
        }
        for (String value : jobsNotFound) {
            this.jobsNotFound.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of names of jobs not found.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jobsNotFound <p>
     *            A list of names of jobs not found.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetJobsResult withJobsNotFound(java.util.Collection<String> jobsNotFound) {
        setJobsNotFound(jobsNotFound);
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
        if (getJobs() != null)
            sb.append("Jobs: " + getJobs() + ",");
        if (getJobsNotFound() != null)
            sb.append("JobsNotFound: " + getJobsNotFound());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode());
        hashCode = prime * hashCode
                + ((getJobsNotFound() == null) ? 0 : getJobsNotFound().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetJobsResult == false)
            return false;
        BatchGetJobsResult other = (BatchGetJobsResult) obj;

        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false)
            return false;
        if (other.getJobsNotFound() == null ^ this.getJobsNotFound() == null)
            return false;
        if (other.getJobsNotFound() != null
                && other.getJobsNotFound().equals(this.getJobsNotFound()) == false)
            return false;
        return true;
    }
}
