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

package com.amazonaws.services.api.sagemaker.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for ListTrainingJobsRequest
 */
public class ListTrainingJobsRequestMarshaller implements
        Marshaller<Request<ListTrainingJobsRequest>, ListTrainingJobsRequest> {

    public Request<ListTrainingJobsRequest> marshall(ListTrainingJobsRequest listTrainingJobsRequest) {
        if (listTrainingJobsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListTrainingJobsRequest)");
        }

        Request<ListTrainingJobsRequest> request = new DefaultRequest<ListTrainingJobsRequest>(
                listTrainingJobsRequest, "AmazonSageMakerService");
        String target = "SageMaker.ListTrainingJobs";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (listTrainingJobsRequest.getNextToken() != null) {
                String nextToken = listTrainingJobsRequest.getNextToken();
                jsonWriter.name("NextToken");
                jsonWriter.value(nextToken);
            }
            if (listTrainingJobsRequest.getMaxResults() != null) {
                Integer maxResults = listTrainingJobsRequest.getMaxResults();
                jsonWriter.name("MaxResults");
                jsonWriter.value(maxResults);
            }
            if (listTrainingJobsRequest.getCreationTimeAfter() != null) {
                java.util.Date creationTimeAfter = listTrainingJobsRequest.getCreationTimeAfter();
                jsonWriter.name("CreationTimeAfter");
                jsonWriter.value(creationTimeAfter);
            }
            if (listTrainingJobsRequest.getCreationTimeBefore() != null) {
                java.util.Date creationTimeBefore = listTrainingJobsRequest.getCreationTimeBefore();
                jsonWriter.name("CreationTimeBefore");
                jsonWriter.value(creationTimeBefore);
            }
            if (listTrainingJobsRequest.getLastModifiedTimeAfter() != null) {
                java.util.Date lastModifiedTimeAfter = listTrainingJobsRequest
                        .getLastModifiedTimeAfter();
                jsonWriter.name("LastModifiedTimeAfter");
                jsonWriter.value(lastModifiedTimeAfter);
            }
            if (listTrainingJobsRequest.getLastModifiedTimeBefore() != null) {
                java.util.Date lastModifiedTimeBefore = listTrainingJobsRequest
                        .getLastModifiedTimeBefore();
                jsonWriter.name("LastModifiedTimeBefore");
                jsonWriter.value(lastModifiedTimeBefore);
            }
            if (listTrainingJobsRequest.getNameContains() != null) {
                String nameContains = listTrainingJobsRequest.getNameContains();
                jsonWriter.name("NameContains");
                jsonWriter.value(nameContains);
            }
            if (listTrainingJobsRequest.getStatusEquals() != null) {
                String statusEquals = listTrainingJobsRequest.getStatusEquals();
                jsonWriter.name("StatusEquals");
                jsonWriter.value(statusEquals);
            }
            if (listTrainingJobsRequest.getSortBy() != null) {
                String sortBy = listTrainingJobsRequest.getSortBy();
                jsonWriter.name("SortBy");
                jsonWriter.value(sortBy);
            }
            if (listTrainingJobsRequest.getSortOrder() != null) {
                String sortOrder = listTrainingJobsRequest.getSortOrder();
                jsonWriter.name("SortOrder");
                jsonWriter.value(sortOrder);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
