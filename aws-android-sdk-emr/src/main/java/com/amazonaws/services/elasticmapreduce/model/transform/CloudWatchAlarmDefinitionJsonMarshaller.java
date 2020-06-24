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

package com.amazonaws.services.elasticmapreduce.model.transform;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CloudWatchAlarmDefinition
 */
class CloudWatchAlarmDefinitionJsonMarshaller {

    public void marshall(CloudWatchAlarmDefinition cloudWatchAlarmDefinition,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (cloudWatchAlarmDefinition.getComparisonOperator() != null) {
            String comparisonOperator = cloudWatchAlarmDefinition.getComparisonOperator();
            jsonWriter.name("ComparisonOperator");
            jsonWriter.value(comparisonOperator);
        }
        if (cloudWatchAlarmDefinition.getEvaluationPeriods() != null) {
            Integer evaluationPeriods = cloudWatchAlarmDefinition.getEvaluationPeriods();
            jsonWriter.name("EvaluationPeriods");
            jsonWriter.value(evaluationPeriods);
        }
        if (cloudWatchAlarmDefinition.getMetricName() != null) {
            String metricName = cloudWatchAlarmDefinition.getMetricName();
            jsonWriter.name("MetricName");
            jsonWriter.value(metricName);
        }
        if (cloudWatchAlarmDefinition.getNamespace() != null) {
            String namespace = cloudWatchAlarmDefinition.getNamespace();
            jsonWriter.name("Namespace");
            jsonWriter.value(namespace);
        }
        if (cloudWatchAlarmDefinition.getPeriod() != null) {
            Integer period = cloudWatchAlarmDefinition.getPeriod();
            jsonWriter.name("Period");
            jsonWriter.value(period);
        }
        if (cloudWatchAlarmDefinition.getStatistic() != null) {
            String statistic = cloudWatchAlarmDefinition.getStatistic();
            jsonWriter.name("Statistic");
            jsonWriter.value(statistic);
        }
        if (cloudWatchAlarmDefinition.getThreshold() != null) {
            Double threshold = cloudWatchAlarmDefinition.getThreshold();
            jsonWriter.name("Threshold");
            jsonWriter.value(threshold);
        }
        if (cloudWatchAlarmDefinition.getUnit() != null) {
            String unit = cloudWatchAlarmDefinition.getUnit();
            jsonWriter.name("Unit");
            jsonWriter.value(unit);
        }
        if (cloudWatchAlarmDefinition.getDimensions() != null) {
            java.util.List<MetricDimension> dimensions = cloudWatchAlarmDefinition.getDimensions();
            jsonWriter.name("Dimensions");
            jsonWriter.beginArray();
            for (MetricDimension dimensionsItem : dimensions) {
                if (dimensionsItem != null) {
                    MetricDimensionJsonMarshaller.getInstance()
                            .marshall(dimensionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static CloudWatchAlarmDefinitionJsonMarshaller instance;

    public static CloudWatchAlarmDefinitionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchAlarmDefinitionJsonMarshaller();
        return instance;
    }
}
