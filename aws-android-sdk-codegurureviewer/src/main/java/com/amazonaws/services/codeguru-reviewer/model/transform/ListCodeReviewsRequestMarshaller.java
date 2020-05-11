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
package com.amazonaws.services.codeguru-reviewer.model.transform;

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
import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;


/**
 * JSON request marshaller for ListCodeReviewsRequest
 */
public class ListCodeReviewsRequestMarshaller implements Marshaller<Request<ListCodeReviewsRequest>, ListCodeReviewsRequest> {

    public Request<ListCodeReviewsRequest> marshall(ListCodeReviewsRequest listCodeReviewsRequest) {
        if (listCodeReviewsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListCodeReviewsRequest)");
        }

        Request<ListCodeReviewsRequest> request = new DefaultRequest<ListCodeReviewsRequest>(listCodeReviewsRequest, "AmazonCodeGuruReviewer");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/codereviews";
        if (listCodeReviewsRequest.getProviderTypes() != null) {
            request.addParameter("ProviderTypes", StringUtils.join(",", listCodeReviewsRequest.getProviderTypes().toArray(new String[0])));
        }
        if (listCodeReviewsRequest.getStates() != null) {
            request.addParameter("States", StringUtils.join(",", listCodeReviewsRequest.getStates().toArray(new String[0])));
        }
        if (listCodeReviewsRequest.getRepositoryNames() != null) {
            request.addParameter("RepositoryNames", StringUtils.join(",", listCodeReviewsRequest.getRepositoryNames().toArray(new String[0])));
        }
        if (listCodeReviewsRequest.getType() != null) {
            request.addParameter("Type", StringUtils.fromString(listCodeReviewsRequest.getType()));
        }
        if (listCodeReviewsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listCodeReviewsRequest.getMaxResults()));
        }
        if (listCodeReviewsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listCodeReviewsRequest.getNextToken()));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
