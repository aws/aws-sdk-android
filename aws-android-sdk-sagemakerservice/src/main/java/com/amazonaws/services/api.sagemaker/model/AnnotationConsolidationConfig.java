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
 * Configures how labels are consolidated across human workers.
 * </p>
 */
public class AnnotationConsolidationConfig implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic
     * for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers
     * based on the Jaccard index of the boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of an image based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label image classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of an
     * image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a
     * multi-class classification and treats pixel annotations from workers as
     * "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of text based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label text classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of text
     * based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Named entity recognition</i> - Groups similar selections and
     * calculates aggregate boundaries, resolving to most-assigned label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box verification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of verification
     * judgement for bounding box labels based on annotations from individual
     * workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation verification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true class of
     * verification judgment for semantic segmentation labels based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box adjustment</i> - Finds the most similar boxes from
     * different workers based on the Jaccard index of the adjusted annotations.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation adjustment</i> - Treats each pixel in an image
     * as a multi-class classification and treats pixel adjusted annotations
     * from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String annotationConsolidationLambdaArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic
     * for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers
     * based on the Jaccard index of the boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of an image based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label image classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of an
     * image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a
     * multi-class classification and treats pixel annotations from workers as
     * "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of text based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label text classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of text
     * based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Named entity recognition</i> - Groups similar selections and
     * calculates aggregate boundaries, resolving to most-assigned label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box verification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of verification
     * judgement for bounding box labels based on annotations from individual
     * workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation verification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true class of
     * verification judgment for semantic segmentation labels based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box adjustment</i> - Finds the most similar boxes from
     * different workers based on the Jaccard index of the adjusted annotations.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation adjustment</i> - Treats each pixel in an image
     * as a multi-class classification and treats pixel adjusted annotations
     * from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a Lambda function implements
     *         the logic for annotation consolidation.
     *         </p>
     *         <p>
     *         For the built-in bounding box, image classification, semantic
     *         segmentation, and text classification task types, Amazon
     *         SageMaker Ground Truth provides the following Lambda functions:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>Bounding box</i> - Finds the most similar boxes from different
     *         workers based on the Jaccard index of the boxes.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-BoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-BoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Image classification</i> - Uses a variant of the Expectation
     *         Maximization approach to estimate the true class of an image
     *         based on annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Multi-label image classification</i> - Uses a variant of the
     *         Expectation Maximization approach to estimate the true classes of
     *         an image based on annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Semantic segmentation</i> - Treats each pixel in an image as a
     *         multi-class classification and treats pixel annotations from
     *         workers as "votes" for the correct label.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-SemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Text classification</i> - Uses a variant of the Expectation
     *         Maximization approach to estimate the true class of text based on
     *         annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClass</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClass</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Multi-label text classification</i> - Uses a variant of the
     *         Expectation Maximization approach to estimate the true classes of
     *         text based on annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClassMultiLabel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Named entity recognition</i> - Groups similar selections and
     *         calculates aggregate boundaries, resolving to most-assigned
     *         label.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-NamedEntityRecognition</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Bounding box verification</i> - Uses a variant of the
     *         Expectation Maximization approach to estimate the true class of
     *         verification judgement for bounding box labels based on
     *         annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Semantic segmentation verification</i> - Uses a variant of the
     *         Expectation Maximization approach to estimate the true class of
     *         verification judgment for semantic segmentation labels based on
     *         annotations from individual workers.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Bounding box adjustment</i> - Finds the most similar boxes
     *         from different workers based on the Jaccard index of the adjusted
     *         annotations.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentBoundingBox</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>Semantic segmentation adjustment</i> - Treats each pixel in an
     *         image as a multi-class classification and treats pixel adjusted
     *         annotations from workers as "votes" for the correct label.
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         <p>
     *         <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentSemanticSegmentation</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     *         >Annotation Consolidation</a>.
     *         </p>
     */
    public String getAnnotationConsolidationLambdaArn() {
        return annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic
     * for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers
     * based on the Jaccard index of the boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of an image based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label image classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of an
     * image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a
     * multi-class classification and treats pixel annotations from workers as
     * "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of text based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label text classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of text
     * based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Named entity recognition</i> - Groups similar selections and
     * calculates aggregate boundaries, resolving to most-assigned label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box verification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of verification
     * judgement for bounding box labels based on annotations from individual
     * workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation verification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true class of
     * verification judgment for semantic segmentation labels based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box adjustment</i> - Finds the most similar boxes from
     * different workers based on the Jaccard index of the adjusted annotations.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation adjustment</i> - Treats each pixel in an image
     * as a multi-class classification and treats pixel adjusted annotations
     * from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param annotationConsolidationLambdaArn <p>
     *            The Amazon Resource Name (ARN) of a Lambda function implements
     *            the logic for annotation consolidation.
     *            </p>
     *            <p>
     *            For the built-in bounding box, image classification, semantic
     *            segmentation, and text classification task types, Amazon
     *            SageMaker Ground Truth provides the following Lambda
     *            functions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Bounding box</i> - Finds the most similar boxes from
     *            different workers based on the Jaccard index of the boxes.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Image classification</i> - Uses a variant of the
     *            Expectation Maximization approach to estimate the true class
     *            of an image based on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Multi-label image classification</i> - Uses a variant of
     *            the Expectation Maximization approach to estimate the true
     *            classes of an image based on annotations from individual
     *            workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic segmentation</i> - Treats each pixel in an image
     *            as a multi-class classification and treats pixel annotations
     *            from workers as "votes" for the correct label.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Text classification</i> - Uses a variant of the Expectation
     *            Maximization approach to estimate the true class of text based
     *            on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Multi-label text classification</i> - Uses a variant of the
     *            Expectation Maximization approach to estimate the true classes
     *            of text based on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Named entity recognition</i> - Groups similar selections
     *            and calculates aggregate boundaries, resolving to
     *            most-assigned label.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Bounding box verification</i> - Uses a variant of the
     *            Expectation Maximization approach to estimate the true class
     *            of verification judgement for bounding box labels based on
     *            annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic segmentation verification</i> - Uses a variant of
     *            the Expectation Maximization approach to estimate the true
     *            class of verification judgment for semantic segmentation
     *            labels based on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Bounding box adjustment</i> - Finds the most similar boxes
     *            from different workers based on the Jaccard index of the
     *            adjusted annotations.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic segmentation adjustment</i> - Treats each pixel in
     *            an image as a multi-class classification and treats pixel
     *            adjusted annotations from workers as "votes" for the correct
     *            label.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     *            >Annotation Consolidation</a>.
     *            </p>
     */
    public void setAnnotationConsolidationLambdaArn(String annotationConsolidationLambdaArn) {
        this.annotationConsolidationLambdaArn = annotationConsolidationLambdaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Lambda function implements the logic
     * for annotation consolidation.
     * </p>
     * <p>
     * For the built-in bounding box, image classification, semantic
     * segmentation, and text classification task types, Amazon SageMaker Ground
     * Truth provides the following Lambda functions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>Bounding box</i> - Finds the most similar boxes from different workers
     * based on the Jaccard index of the boxes.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-BoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-BoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Image classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of an image based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label image classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of an
     * image based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation</i> - Treats each pixel in an image as a
     * multi-class classification and treats pixel annotations from workers as
     * "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-SemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-SemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Text classification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of text based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClass</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClass</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Multi-label text classification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true classes of text
     * based on annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClassMultiLabel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Named entity recognition</i> - Groups similar selections and
     * calculates aggregate boundaries, resolving to most-assigned label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-NamedEntityRecognition</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-NamedEntityRecognition</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box verification</i> - Uses a variant of the Expectation
     * Maximization approach to estimate the true class of verification
     * judgement for bounding box labels based on annotations from individual
     * workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation verification</i> - Uses a variant of the
     * Expectation Maximization approach to estimate the true class of
     * verification judgment for semantic segmentation labels based on
     * annotations from individual workers.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationSemanticSegmentation</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Bounding box adjustment</i> - Finds the most similar boxes from
     * different workers based on the Jaccard index of the adjusted annotations.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentBoundingBox</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>Semantic segmentation adjustment</i> - Treats each pixel in an image
     * as a multi-class classification and treats pixel adjusted annotations
     * from workers as "votes" for the correct label.
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * <p>
     * <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentSemanticSegmentation</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     * >Annotation Consolidation</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function
     * :[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param annotationConsolidationLambdaArn <p>
     *            The Amazon Resource Name (ARN) of a Lambda function implements
     *            the logic for annotation consolidation.
     *            </p>
     *            <p>
     *            For the built-in bounding box, image classification, semantic
     *            segmentation, and text classification task types, Amazon
     *            SageMaker Ground Truth provides the following Lambda
     *            functions:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <i>Bounding box</i> - Finds the most similar boxes from
     *            different workers based on the Jaccard index of the boxes.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-BoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-BoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Image classification</i> - Uses a variant of the
     *            Expectation Maximization approach to estimate the true class
     *            of an image based on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Multi-label image classification</i> - Uses a variant of
     *            the Expectation Maximization approach to estimate the true
     *            classes of an image based on annotations from individual
     *            workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-ImageMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic segmentation</i> - Treats each pixel in an image
     *            as a multi-class classification and treats pixel annotations
     *            from workers as "votes" for the correct label.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-SemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Text classification</i> - Uses a variant of the Expectation
     *            Maximization approach to estimate the true class of text based
     *            on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClass</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClass</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Multi-label text classification</i> - Uses a variant of the
     *            Expectation Maximization approach to estimate the true classes
     *            of text based on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-TextMultiClassMultiLabel</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Named entity recognition</i> - Groups similar selections
     *            and calculates aggregate boundaries, resolving to
     *            most-assigned label.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-NamedEntityRecognition</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Bounding box verification</i> - Uses a variant of the
     *            Expectation Maximization approach to estimate the true class
     *            of verification judgement for bounding box labels based on
     *            annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic segmentation verification</i> - Uses a variant of
     *            the Expectation Maximization approach to estimate the true
     *            class of verification judgment for semantic segmentation
     *            labels based on annotations from individual workers.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-VerificationSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Bounding box adjustment</i> - Finds the most similar boxes
     *            from different workers based on the Jaccard index of the
     *            adjusted annotations.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentBoundingBox</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <i>Semantic segmentation adjustment</i> - Treats each pixel in
     *            an image as a multi-class classification and treats pixel
     *            adjusted annotations from workers as "votes" for the correct
     *            label.
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-1:432418664414:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-east-2:266458841044:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:us-west-2:081040173940:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-1:568282634449:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-1:477331159723:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-2:454466003867:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-south-1:565803892007:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-central-1:203001061592:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-northeast-2:845288260483:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:eu-west-2:487402164563:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ap-southeast-1:377565633583:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            <p>
     *            <code>arn:aws:lambda:ca-central-1:918755190332:function:ACS-AdjustmentSemanticSegmentation</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-annotation-consolidation.html"
     *            >Annotation Consolidation</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AnnotationConsolidationConfig withAnnotationConsolidationLambdaArn(
            String annotationConsolidationLambdaArn) {
        this.annotationConsolidationLambdaArn = annotationConsolidationLambdaArn;
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
        if (getAnnotationConsolidationLambdaArn() != null)
            sb.append("AnnotationConsolidationLambdaArn: " + getAnnotationConsolidationLambdaArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAnnotationConsolidationLambdaArn() == null) ? 0
                        : getAnnotationConsolidationLambdaArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnnotationConsolidationConfig == false)
            return false;
        AnnotationConsolidationConfig other = (AnnotationConsolidationConfig) obj;

        if (other.getAnnotationConsolidationLambdaArn() == null
                ^ this.getAnnotationConsolidationLambdaArn() == null)
            return false;
        if (other.getAnnotationConsolidationLambdaArn() != null
                && other.getAnnotationConsolidationLambdaArn().equals(
                        this.getAnnotationConsolidationLambdaArn()) == false)
            return false;
        return true;
    }
}
