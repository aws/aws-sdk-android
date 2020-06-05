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

package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for PutIntegrationResponseRequest
 */
public class PutIntegrationResponseRequestMarshaller implements
        Marshaller<Request<PutIntegrationResponseRequest>, PutIntegrationResponseRequest> {

    public Request<PutIntegrationResponseRequest> marshall(
            PutIntegrationResponseRequest putIntegrationResponseRequest) {
        if (putIntegrationResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutIntegrationResponseRequest)");
        }

        Request<PutIntegrationResponseRequest> request = new DefaultRequest<PutIntegrationResponseRequest>(
                putIntegrationResponseRequest, "AmazonAPIGateway");
        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}";
        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putIntegrationResponseRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(putIntegrationResponseRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (putIntegrationResponseRequest.getResourceId() == null) ? "" : StringUtils
                        .fromString(putIntegrationResponseRequest.getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (putIntegrationResponseRequest.getHttpMethod() == null) ? "" : StringUtils
                        .fromString(putIntegrationResponseRequest.getHttpMethod()));
        uriResourcePath = uriResourcePath.replace(
                "{status_code}",
                (putIntegrationResponseRequest.getStatusCode() == null) ? "" : StringUtils
                        .fromString(putIntegrationResponseRequest.getStatusCode()));
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (putIntegrationResponseRequest.getSelectionPattern() != null) {
                String selectionPattern = putIntegrationResponseRequest.getSelectionPattern();
                jsonWriter.name("selectionPattern");
                jsonWriter.value(selectionPattern);
            }
            if (putIntegrationResponseRequest.getResponseParameters() != null) {
                java.util.Map<String, String> responseParameters = putIntegrationResponseRequest
                        .getResponseParameters();
                jsonWriter.name("responseParameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> responseParametersEntry : responseParameters
                        .entrySet()) {
                    String responseParametersValue = responseParametersEntry.getValue();
                    if (responseParametersValue != null) {
                        jsonWriter.name(responseParametersEntry.getKey());
                        jsonWriter.value(responseParametersValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putIntegrationResponseRequest.getResponseTemplates() != null) {
                java.util.Map<String, String> responseTemplates = putIntegrationResponseRequest
                        .getResponseTemplates();
                jsonWriter.name("responseTemplates");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> responseTemplatesEntry : responseTemplates
                        .entrySet()) {
                    String responseTemplatesValue = responseTemplatesEntry.getValue();
                    if (responseTemplatesValue != null) {
                        jsonWriter.name(responseTemplatesEntry.getKey());
                        jsonWriter.value(responseTemplatesValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (putIntegrationResponseRequest.getContentHandling() != null) {
                String contentHandling = putIntegrationResponseRequest.getContentHandling();
                jsonWriter.name("contentHandling");
                jsonWriter.value(contentHandling);
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
            request.addHeader("Content-Type", "application/x-amz-json-1.0");
        }

        return request;
    }
}
