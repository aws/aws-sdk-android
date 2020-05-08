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

/**
 * <p>
 * Defines how the algorithm is used for a training job.
 * </p>
 */
public class TrainingSpecification implements Serializable {
    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * training algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String trainingImage;

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     */
    private String trainingImageDigest;

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that
     * define the supported hyperparameters. This is required if the algorithm
     * supports automatic model tuning.&gt;
     * </p>
     */
    private java.util.List<HyperParameterSpecification> supportedHyperParameters;

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     */
    private java.util.List<String> supportedTrainingInstanceTypes;

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to
     * false, buyers can't request more than one instance during training.
     * </p>
     */
    private Boolean supportsDistributedTraining;

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for
     * parsing metrics generated by the algorithm.
     * </p>
     */
    private java.util.List<MetricDefinition> metricDefinitions;

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the
     * input sources to be used by the algorithm.
     * </p>
     */
    private java.util.List<ChannelSpecification> trainingChannels;

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the
     * objective metric in a hyperparameter tuning job.
     * </p>
     */
    private java.util.List<HyperParameterTuningJobObjective> supportedTuningJobObjectiveMetrics;

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * training algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The Amazon ECR registry path of the Docker image that contains
     *         the training algorithm.
     *         </p>
     */
    public String getTrainingImage() {
        return trainingImage;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * training algorithm.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param trainingImage <p>
     *            The Amazon ECR registry path of the Docker image that contains
     *            the training algorithm.
     *            </p>
     */
    public void setTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
    }

    /**
     * <p>
     * The Amazon ECR registry path of the Docker image that contains the
     * training algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param trainingImage <p>
     *            The Amazon ECR registry path of the Docker image that contains
     *            the training algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withTrainingImage(String trainingImage) {
        this.trainingImage = trainingImage;
        return this;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     *
     * @return <p>
     *         An MD5 hash of the training algorithm that identifies the Docker
     *         image used for training.
     *         </p>
     */
    public String getTrainingImageDigest() {
        return trainingImageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     *
     * @param trainingImageDigest <p>
     *            An MD5 hash of the training algorithm that identifies the
     *            Docker image used for training.
     *            </p>
     */
    public void setTrainingImageDigest(String trainingImageDigest) {
        this.trainingImageDigest = trainingImageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image
     * used for training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 72<br/>
     * <b>Pattern: </b>^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$<br/>
     *
     * @param trainingImageDigest <p>
     *            An MD5 hash of the training algorithm that identifies the
     *            Docker image used for training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withTrainingImageDigest(String trainingImageDigest) {
        this.trainingImageDigest = trainingImageDigest;
        return this;
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that
     * define the supported hyperparameters. This is required if the algorithm
     * supports automatic model tuning.&gt;
     * </p>
     *
     * @return <p>
     *         A list of the <code>HyperParameterSpecification</code> objects,
     *         that define the supported hyperparameters. This is required if
     *         the algorithm supports automatic model tuning.&gt;
     *         </p>
     */
    public java.util.List<HyperParameterSpecification> getSupportedHyperParameters() {
        return supportedHyperParameters;
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that
     * define the supported hyperparameters. This is required if the algorithm
     * supports automatic model tuning.&gt;
     * </p>
     *
     * @param supportedHyperParameters <p>
     *            A list of the <code>HyperParameterSpecification</code>
     *            objects, that define the supported hyperparameters. This is
     *            required if the algorithm supports automatic model tuning.&gt;
     *            </p>
     */
    public void setSupportedHyperParameters(
            java.util.Collection<HyperParameterSpecification> supportedHyperParameters) {
        if (supportedHyperParameters == null) {
            this.supportedHyperParameters = null;
            return;
        }

        this.supportedHyperParameters = new java.util.ArrayList<HyperParameterSpecification>(
                supportedHyperParameters);
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that
     * define the supported hyperparameters. This is required if the algorithm
     * supports automatic model tuning.&gt;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedHyperParameters <p>
     *            A list of the <code>HyperParameterSpecification</code>
     *            objects, that define the supported hyperparameters. This is
     *            required if the algorithm supports automatic model tuning.&gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withSupportedHyperParameters(
            HyperParameterSpecification... supportedHyperParameters) {
        if (getSupportedHyperParameters() == null) {
            this.supportedHyperParameters = new java.util.ArrayList<HyperParameterSpecification>(
                    supportedHyperParameters.length);
        }
        for (HyperParameterSpecification value : supportedHyperParameters) {
            this.supportedHyperParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the <code>HyperParameterSpecification</code> objects, that
     * define the supported hyperparameters. This is required if the algorithm
     * supports automatic model tuning.&gt;
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedHyperParameters <p>
     *            A list of the <code>HyperParameterSpecification</code>
     *            objects, that define the supported hyperparameters. This is
     *            required if the algorithm supports automatic model tuning.&gt;
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withSupportedHyperParameters(
            java.util.Collection<HyperParameterSpecification> supportedHyperParameters) {
        setSupportedHyperParameters(supportedHyperParameters);
        return this;
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     *
     * @return <p>
     *         A list of the instance types that this algorithm can use for
     *         training.
     *         </p>
     */
    public java.util.List<String> getSupportedTrainingInstanceTypes() {
        return supportedTrainingInstanceTypes;
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     *
     * @param supportedTrainingInstanceTypes <p>
     *            A list of the instance types that this algorithm can use for
     *            training.
     *            </p>
     */
    public void setSupportedTrainingInstanceTypes(
            java.util.Collection<String> supportedTrainingInstanceTypes) {
        if (supportedTrainingInstanceTypes == null) {
            this.supportedTrainingInstanceTypes = null;
            return;
        }

        this.supportedTrainingInstanceTypes = new java.util.ArrayList<String>(
                supportedTrainingInstanceTypes);
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTrainingInstanceTypes <p>
     *            A list of the instance types that this algorithm can use for
     *            training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withSupportedTrainingInstanceTypes(
            String... supportedTrainingInstanceTypes) {
        if (getSupportedTrainingInstanceTypes() == null) {
            this.supportedTrainingInstanceTypes = new java.util.ArrayList<String>(
                    supportedTrainingInstanceTypes.length);
        }
        for (String value : supportedTrainingInstanceTypes) {
            this.supportedTrainingInstanceTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the instance types that this algorithm can use for training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTrainingInstanceTypes <p>
     *            A list of the instance types that this algorithm can use for
     *            training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withSupportedTrainingInstanceTypes(
            java.util.Collection<String> supportedTrainingInstanceTypes) {
        setSupportedTrainingInstanceTypes(supportedTrainingInstanceTypes);
        return this;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to
     * false, buyers can't request more than one instance during training.
     * </p>
     *
     * @return <p>
     *         Indicates whether the algorithm supports distributed training. If
     *         set to false, buyers can't request more than one instance during
     *         training.
     *         </p>
     */
    public Boolean isSupportsDistributedTraining() {
        return supportsDistributedTraining;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to
     * false, buyers can't request more than one instance during training.
     * </p>
     *
     * @return <p>
     *         Indicates whether the algorithm supports distributed training. If
     *         set to false, buyers can't request more than one instance during
     *         training.
     *         </p>
     */
    public Boolean getSupportsDistributedTraining() {
        return supportsDistributedTraining;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to
     * false, buyers can't request more than one instance during training.
     * </p>
     *
     * @param supportsDistributedTraining <p>
     *            Indicates whether the algorithm supports distributed training.
     *            If set to false, buyers can't request more than one instance
     *            during training.
     *            </p>
     */
    public void setSupportsDistributedTraining(Boolean supportsDistributedTraining) {
        this.supportsDistributedTraining = supportsDistributedTraining;
    }

    /**
     * <p>
     * Indicates whether the algorithm supports distributed training. If set to
     * false, buyers can't request more than one instance during training.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsDistributedTraining <p>
     *            Indicates whether the algorithm supports distributed training.
     *            If set to false, buyers can't request more than one instance
     *            during training.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withSupportsDistributedTraining(Boolean supportsDistributedTraining) {
        this.supportsDistributedTraining = supportsDistributedTraining;
        return this;
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for
     * parsing metrics generated by the algorithm.
     * </p>
     *
     * @return <p>
     *         A list of <code>MetricDefinition</code> objects, which are used
     *         for parsing metrics generated by the algorithm.
     *         </p>
     */
    public java.util.List<MetricDefinition> getMetricDefinitions() {
        return metricDefinitions;
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for
     * parsing metrics generated by the algorithm.
     * </p>
     *
     * @param metricDefinitions <p>
     *            A list of <code>MetricDefinition</code> objects, which are
     *            used for parsing metrics generated by the algorithm.
     *            </p>
     */
    public void setMetricDefinitions(java.util.Collection<MetricDefinition> metricDefinitions) {
        if (metricDefinitions == null) {
            this.metricDefinitions = null;
            return;
        }

        this.metricDefinitions = new java.util.ArrayList<MetricDefinition>(metricDefinitions);
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for
     * parsing metrics generated by the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDefinitions <p>
     *            A list of <code>MetricDefinition</code> objects, which are
     *            used for parsing metrics generated by the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withMetricDefinitions(MetricDefinition... metricDefinitions) {
        if (getMetricDefinitions() == null) {
            this.metricDefinitions = new java.util.ArrayList<MetricDefinition>(
                    metricDefinitions.length);
        }
        for (MetricDefinition value : metricDefinitions) {
            this.metricDefinitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>MetricDefinition</code> objects, which are used for
     * parsing metrics generated by the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricDefinitions <p>
     *            A list of <code>MetricDefinition</code> objects, which are
     *            used for parsing metrics generated by the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withMetricDefinitions(
            java.util.Collection<MetricDefinition> metricDefinitions) {
        setMetricDefinitions(metricDefinitions);
        return this;
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the
     * input sources to be used by the algorithm.
     * </p>
     *
     * @return <p>
     *         A list of <code>ChannelSpecification</code> objects, which
     *         specify the input sources to be used by the algorithm.
     *         </p>
     */
    public java.util.List<ChannelSpecification> getTrainingChannels() {
        return trainingChannels;
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the
     * input sources to be used by the algorithm.
     * </p>
     *
     * @param trainingChannels <p>
     *            A list of <code>ChannelSpecification</code> objects, which
     *            specify the input sources to be used by the algorithm.
     *            </p>
     */
    public void setTrainingChannels(java.util.Collection<ChannelSpecification> trainingChannels) {
        if (trainingChannels == null) {
            this.trainingChannels = null;
            return;
        }

        this.trainingChannels = new java.util.ArrayList<ChannelSpecification>(trainingChannels);
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the
     * input sources to be used by the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingChannels <p>
     *            A list of <code>ChannelSpecification</code> objects, which
     *            specify the input sources to be used by the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withTrainingChannels(ChannelSpecification... trainingChannels) {
        if (getTrainingChannels() == null) {
            this.trainingChannels = new java.util.ArrayList<ChannelSpecification>(
                    trainingChannels.length);
        }
        for (ChannelSpecification value : trainingChannels) {
            this.trainingChannels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ChannelSpecification</code> objects, which specify the
     * input sources to be used by the algorithm.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trainingChannels <p>
     *            A list of <code>ChannelSpecification</code> objects, which
     *            specify the input sources to be used by the algorithm.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withTrainingChannels(
            java.util.Collection<ChannelSpecification> trainingChannels) {
        setTrainingChannels(trainingChannels);
        return this;
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the
     * objective metric in a hyperparameter tuning job.
     * </p>
     *
     * @return <p>
     *         A list of the metrics that the algorithm emits that can be used
     *         as the objective metric in a hyperparameter tuning job.
     *         </p>
     */
    public java.util.List<HyperParameterTuningJobObjective> getSupportedTuningJobObjectiveMetrics() {
        return supportedTuningJobObjectiveMetrics;
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the
     * objective metric in a hyperparameter tuning job.
     * </p>
     *
     * @param supportedTuningJobObjectiveMetrics <p>
     *            A list of the metrics that the algorithm emits that can be
     *            used as the objective metric in a hyperparameter tuning job.
     *            </p>
     */
    public void setSupportedTuningJobObjectiveMetrics(
            java.util.Collection<HyperParameterTuningJobObjective> supportedTuningJobObjectiveMetrics) {
        if (supportedTuningJobObjectiveMetrics == null) {
            this.supportedTuningJobObjectiveMetrics = null;
            return;
        }

        this.supportedTuningJobObjectiveMetrics = new java.util.ArrayList<HyperParameterTuningJobObjective>(
                supportedTuningJobObjectiveMetrics);
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the
     * objective metric in a hyperparameter tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTuningJobObjectiveMetrics <p>
     *            A list of the metrics that the algorithm emits that can be
     *            used as the objective metric in a hyperparameter tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withSupportedTuningJobObjectiveMetrics(
            HyperParameterTuningJobObjective... supportedTuningJobObjectiveMetrics) {
        if (getSupportedTuningJobObjectiveMetrics() == null) {
            this.supportedTuningJobObjectiveMetrics = new java.util.ArrayList<HyperParameterTuningJobObjective>(
                    supportedTuningJobObjectiveMetrics.length);
        }
        for (HyperParameterTuningJobObjective value : supportedTuningJobObjectiveMetrics) {
            this.supportedTuningJobObjectiveMetrics.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the metrics that the algorithm emits that can be used as the
     * objective metric in a hyperparameter tuning job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedTuningJobObjectiveMetrics <p>
     *            A list of the metrics that the algorithm emits that can be
     *            used as the objective metric in a hyperparameter tuning job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingSpecification withSupportedTuningJobObjectiveMetrics(
            java.util.Collection<HyperParameterTuningJobObjective> supportedTuningJobObjectiveMetrics) {
        setSupportedTuningJobObjectiveMetrics(supportedTuningJobObjectiveMetrics);
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
        if (getTrainingImage() != null)
            sb.append("TrainingImage: " + getTrainingImage() + ",");
        if (getTrainingImageDigest() != null)
            sb.append("TrainingImageDigest: " + getTrainingImageDigest() + ",");
        if (getSupportedHyperParameters() != null)
            sb.append("SupportedHyperParameters: " + getSupportedHyperParameters() + ",");
        if (getSupportedTrainingInstanceTypes() != null)
            sb.append("SupportedTrainingInstanceTypes: " + getSupportedTrainingInstanceTypes()
                    + ",");
        if (getSupportsDistributedTraining() != null)
            sb.append("SupportsDistributedTraining: " + getSupportsDistributedTraining() + ",");
        if (getMetricDefinitions() != null)
            sb.append("MetricDefinitions: " + getMetricDefinitions() + ",");
        if (getTrainingChannels() != null)
            sb.append("TrainingChannels: " + getTrainingChannels() + ",");
        if (getSupportedTuningJobObjectiveMetrics() != null)
            sb.append("SupportedTuningJobObjectiveMetrics: "
                    + getSupportedTuningJobObjectiveMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrainingImage() == null) ? 0 : getTrainingImage().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingImageDigest() == null) ? 0 : getTrainingImageDigest().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedHyperParameters() == null) ? 0 : getSupportedHyperParameters()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedTrainingInstanceTypes() == null) ? 0
                        : getSupportedTrainingInstanceTypes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsDistributedTraining() == null) ? 0
                        : getSupportsDistributedTraining().hashCode());
        hashCode = prime * hashCode
                + ((getMetricDefinitions() == null) ? 0 : getMetricDefinitions().hashCode());
        hashCode = prime * hashCode
                + ((getTrainingChannels() == null) ? 0 : getTrainingChannels().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportedTuningJobObjectiveMetrics() == null) ? 0
                        : getSupportedTuningJobObjectiveMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingSpecification == false)
            return false;
        TrainingSpecification other = (TrainingSpecification) obj;

        if (other.getTrainingImage() == null ^ this.getTrainingImage() == null)
            return false;
        if (other.getTrainingImage() != null
                && other.getTrainingImage().equals(this.getTrainingImage()) == false)
            return false;
        if (other.getTrainingImageDigest() == null ^ this.getTrainingImageDigest() == null)
            return false;
        if (other.getTrainingImageDigest() != null
                && other.getTrainingImageDigest().equals(this.getTrainingImageDigest()) == false)
            return false;
        if (other.getSupportedHyperParameters() == null
                ^ this.getSupportedHyperParameters() == null)
            return false;
        if (other.getSupportedHyperParameters() != null
                && other.getSupportedHyperParameters().equals(this.getSupportedHyperParameters()) == false)
            return false;
        if (other.getSupportedTrainingInstanceTypes() == null
                ^ this.getSupportedTrainingInstanceTypes() == null)
            return false;
        if (other.getSupportedTrainingInstanceTypes() != null
                && other.getSupportedTrainingInstanceTypes().equals(
                        this.getSupportedTrainingInstanceTypes()) == false)
            return false;
        if (other.getSupportsDistributedTraining() == null
                ^ this.getSupportsDistributedTraining() == null)
            return false;
        if (other.getSupportsDistributedTraining() != null
                && other.getSupportsDistributedTraining().equals(
                        this.getSupportsDistributedTraining()) == false)
            return false;
        if (other.getMetricDefinitions() == null ^ this.getMetricDefinitions() == null)
            return false;
        if (other.getMetricDefinitions() != null
                && other.getMetricDefinitions().equals(this.getMetricDefinitions()) == false)
            return false;
        if (other.getTrainingChannels() == null ^ this.getTrainingChannels() == null)
            return false;
        if (other.getTrainingChannels() != null
                && other.getTrainingChannels().equals(this.getTrainingChannels()) == false)
            return false;
        if (other.getSupportedTuningJobObjectiveMetrics() == null
                ^ this.getSupportedTuningJobObjectiveMetrics() == null)
            return false;
        if (other.getSupportedTuningJobObjectiveMetrics() != null
                && other.getSupportedTuningJobObjectiveMetrics().equals(
                        this.getSupportedTuningJobObjectiveMetrics()) == false)
            return false;
        return true;
    }
}
