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

package com.amazonaws.services.ssm.model.transform;

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
import com.amazonaws.services.ssm.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for StartAutomationExecutionRequest
 */
public class StartAutomationExecutionRequestMarshaller implements
        Marshaller<Request<StartAutomationExecutionRequest>, StartAutomationExecutionRequest> {

    public Request<StartAutomationExecutionRequest> marshall(
            StartAutomationExecutionRequest startAutomationExecutionRequest) {
        if (startAutomationExecutionRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(StartAutomationExecutionRequest)");
        }

        Request<StartAutomationExecutionRequest> request = new DefaultRequest<StartAutomationExecutionRequest>(
                startAutomationExecutionRequest, "AmazonSimpleSystemsManager(SSM)");
        String target = "AmazonSSM.StartAutomationExecution";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (startAutomationExecutionRequest.getDocumentName() != null) {
                String documentName = startAutomationExecutionRequest.getDocumentName();
                jsonWriter.name("DocumentName");
                jsonWriter.value(documentName);
            }
            if (startAutomationExecutionRequest.getDocumentVersion() != null) {
                String documentVersion = startAutomationExecutionRequest.getDocumentVersion();
                jsonWriter.name("DocumentVersion");
                jsonWriter.value(documentVersion);
            }
            if (startAutomationExecutionRequest.getParameters() != null) {
                java.util.Map<String, java.util.List<String>> parameters = startAutomationExecutionRequest
                        .getParameters();
                jsonWriter.name("Parameters");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, java.util.List<String>> parametersEntry : parameters
                        .entrySet()) {
                    java.util.List<String> parametersValue = parametersEntry.getValue();
                    if (parametersValue != null) {
                        jsonWriter.name(parametersEntry.getKey());
                        jsonWriter.beginArray();
                        for (String parametersValueItem : parametersValue) {
                            if (parametersValueItem != null) {
                                jsonWriter.value(parametersValueItem);
                            }
                        }
                        jsonWriter.endArray();
                    }
                }
                jsonWriter.endObject();
            }
            if (startAutomationExecutionRequest.getClientToken() != null) {
                String clientToken = startAutomationExecutionRequest.getClientToken();
                jsonWriter.name("ClientToken");
                jsonWriter.value(clientToken);
            }
            if (startAutomationExecutionRequest.getMode() != null) {
                String mode = startAutomationExecutionRequest.getMode();
                jsonWriter.name("Mode");
                jsonWriter.value(mode);
            }
            if (startAutomationExecutionRequest.getTargetParameterName() != null) {
                String targetParameterName = startAutomationExecutionRequest
                        .getTargetParameterName();
                jsonWriter.name("TargetParameterName");
                jsonWriter.value(targetParameterName);
            }
            if (startAutomationExecutionRequest.getTargets() != null) {
                java.util.List<Target> targets = startAutomationExecutionRequest.getTargets();
                jsonWriter.name("Targets");
                jsonWriter.beginArray();
                for (Target targetsItem : targets) {
                    if (targetsItem != null) {
                        TargetJsonMarshaller.getInstance().marshall(targetsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startAutomationExecutionRequest.getTargetMaps() != null) {
                java.util.List<java.util.Map<String, java.util.List<String>>> targetMaps = startAutomationExecutionRequest
                        .getTargetMaps();
                jsonWriter.name("TargetMaps");
                jsonWriter.beginArray();
                for (java.util.Map<String, java.util.List<String>> targetMapsItem : targetMaps) {
                    if (targetMapsItem != null) {
                        jsonWriter.beginObject();
                        for (java.util.Map.Entry<String, java.util.List<String>> targetMapsItemEntry : targetMapsItem
                                .entrySet()) {
                            java.util.List<String> targetMapsItemValue = targetMapsItemEntry
                                    .getValue();
                            if (targetMapsItemValue != null) {
                                jsonWriter.name(targetMapsItemEntry.getKey());
                                jsonWriter.beginArray();
                                for (String targetMapsItemValueItem : targetMapsItemValue) {
                                    if (targetMapsItemValueItem != null) {
                                        jsonWriter.value(targetMapsItemValueItem);
                                    }
                                }
                                jsonWriter.endArray();
                            }
                        }
                        jsonWriter.endObject();
                    }
                }
                jsonWriter.endArray();
            }
            if (startAutomationExecutionRequest.getMaxConcurrency() != null) {
                String maxConcurrency = startAutomationExecutionRequest.getMaxConcurrency();
                jsonWriter.name("MaxConcurrency");
                jsonWriter.value(maxConcurrency);
            }
            if (startAutomationExecutionRequest.getMaxErrors() != null) {
                String maxErrors = startAutomationExecutionRequest.getMaxErrors();
                jsonWriter.name("MaxErrors");
                jsonWriter.value(maxErrors);
            }
            if (startAutomationExecutionRequest.getTargetLocations() != null) {
                java.util.List<TargetLocation> targetLocations = startAutomationExecutionRequest
                        .getTargetLocations();
                jsonWriter.name("TargetLocations");
                jsonWriter.beginArray();
                for (TargetLocation targetLocationsItem : targetLocations) {
                    if (targetLocationsItem != null) {
                        TargetLocationJsonMarshaller.getInstance().marshall(targetLocationsItem,
                                jsonWriter);
                    }
                }
                jsonWriter.endArray();
            }
            if (startAutomationExecutionRequest.getTags() != null) {
                java.util.List<Tag> tags = startAutomationExecutionRequest.getTags();
                jsonWriter.name("Tags");
                jsonWriter.beginArray();
                for (Tag tagsItem : tags) {
                    if (tagsItem != null) {
                        TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                    }
                }
                jsonWriter.endArray();
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