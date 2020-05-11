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
 * JSON request marshaller for ListRecommendationFeedbackRequest
 */
public class ListRecommendationFeedbackRequestMarshaller implements Marshaller<Request<ListRecommendationFeedbackRequest>, ListRecommendationFeedbackRequest> {

    public Request<ListRecommendationFeedbackRequest> marshall(ListRecommendationFeedbackRequest listRecommendationFeedbackRequest) {
        if (listRecommendationFeedbackRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(ListRecommendationFeedbackRequest)");
        }

        Request<ListRecommendationFeedbackRequest> request = new DefaultRequest<ListRecommendationFeedbackRequest>(listRecommendationFeedbackRequest, "AmazonCodeGuruReviewer");
        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/feedback/{CodeReviewArn}/RecommendationFeedback";
        if (listRecommendationFeedbackRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listRecommendationFeedbackRequest.getNextToken()));
        }
        if (listRecommendationFeedbackRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(listRecommendationFeedbackRequest.getMaxResults()));
        }
        uriResourcePath = uriResourcePath.replace("{CodeReviewArn}", (listRecommendationFeedbackRequest.getCodeReviewArn() == null) ? "" : StringUtils.fromString(listRecommendationFeedbackRequest.getCodeReviewArn()));
        if (listRecommendationFeedbackRequest.getUserIds() != null) {
            request.addParameter("UserIds", StringUtils.join(",", listRecommendationFeedbackRequest.getUserIds().toArray(new String[0])));
        }
        if (listRecommendationFeedbackRequest.getRecommendationIds() != null) {
            request.addParameter("RecommendationIds", StringUtils.join(",", listRecommendationFeedbackRequest.getRecommendationIds().toArray(new String[0])));
        }
        request.setResourcePath(uriResourcePath);
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
