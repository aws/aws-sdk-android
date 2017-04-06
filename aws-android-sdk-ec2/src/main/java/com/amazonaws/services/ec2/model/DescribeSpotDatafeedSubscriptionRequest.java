/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSpotDatafeedSubscriptionRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest) DescribeSpotDatafeedSubscription operation}.
 * <p>
 * Describes the data feed for Spot instances. For more information, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-data-feeds.html"> Spot Instance Data Feed </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotDatafeedSubscription(DescribeSpotDatafeedSubscriptionRequest)
 */
public class DescribeSpotDatafeedSubscriptionRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotDatafeedSubscriptionRequest> {

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotDatafeedSubscriptionRequest> getDryRunRequest() {
        Request<DescribeSpotDatafeedSubscriptionRequest> request = new DescribeSpotDatafeedSubscriptionRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotDatafeedSubscriptionRequest == false) return false;
        DescribeSpotDatafeedSubscriptionRequest other = (DescribeSpotDatafeedSubscriptionRequest)obj;
        
        return true;
    }
    
}
    