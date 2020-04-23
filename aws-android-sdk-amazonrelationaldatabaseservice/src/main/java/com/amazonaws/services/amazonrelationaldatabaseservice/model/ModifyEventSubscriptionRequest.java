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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies an existing RDS event notification subscription. You can't modify
 * the source identifiers using this call. To change source identifiers for a
 * subscription, use the <code>AddSourceIdentifierToSubscription</code> and
 * <code>RemoveSourceIdentifierFromSubscription</code> calls.
 * </p>
 * <p>
 * You can see a list of the event categories for a given SourceType in the <a
 * href
 * ="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
 * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
 * <b>DescribeEventCategories</b> action.
 * </p>
 */
public class ModifyEventSubscriptionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     */
    private String subscriptionName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     * </p>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The type of source that is generating the events. For example, if you
     * want to be notified of events generated by a DB instance, you would set
     * this parameter to db-instance. If this value isn't specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     */
    private java.util.List<String> eventCategories;

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     *
     * @return <p>
     *         The name of the RDS event notification subscription.
     *         </p>
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     *
     * @param subscriptionName <p>
     *            The name of the RDS event notification subscription.
     *            </p>
     */
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    /**
     * <p>
     * The name of the RDS event notification subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subscriptionName <p>
     *            The name of the RDS event notification subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SNS topic created for event
     *         notification. The ARN is created by Amazon SNS when you create a
     *         topic and subscribe to it.
     *         </p>
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     * </p>
     *
     * @param snsTopicArn <p>
     *            The Amazon Resource Name (ARN) of the SNS topic created for
     *            event notification. The ARN is created by Amazon SNS when you
     *            create a topic and subscribe to it.
     *            </p>
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snsTopicArn <p>
     *            The Amazon Resource Name (ARN) of the SNS topic created for
     *            event notification. The ARN is created by Amazon SNS when you
     *            create a topic and subscribe to it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEventSubscriptionRequest withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you
     * want to be notified of events generated by a DB instance, you would set
     * this parameter to db-instance. If this value isn't specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     * </p>
     *
     * @return <p>
     *         The type of source that is generating the events. For example, if
     *         you want to be notified of events generated by a DB instance, you
     *         would set this parameter to db-instance. If this value isn't
     *         specified, all events are returned.
     *         </p>
     *         <p>
     *         Valid values: db-instance | db-parameter-group |
     *         db-security-group | db-snapshot
     *         </p>
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you
     * want to be notified of events generated by a DB instance, you would set
     * this parameter to db-instance. If this value isn't specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     * </p>
     *
     * @param sourceType <p>
     *            The type of source that is generating the events. For example,
     *            if you want to be notified of events generated by a DB
     *            instance, you would set this parameter to db-instance. If this
     *            value isn't specified, all events are returned.
     *            </p>
     *            <p>
     *            Valid values: db-instance | db-parameter-group |
     *            db-security-group | db-snapshot
     *            </p>
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The type of source that is generating the events. For example, if you
     * want to be notified of events generated by a DB instance, you would set
     * this parameter to db-instance. If this value isn't specified, all events
     * are returned.
     * </p>
     * <p>
     * Valid values: db-instance | db-parameter-group | db-security-group |
     * db-snapshot
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceType <p>
     *            The type of source that is generating the events. For example,
     *            if you want to be notified of events generated by a DB
     *            instance, you would set this parameter to db-instance. If this
     *            value isn't specified, all events are returned.
     *            </p>
     *            <p>
     *            Valid values: db-instance | db-parameter-group |
     *            db-security-group | db-snapshot
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEventSubscriptionRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     *
     * @return <p>
     *         A list of event categories for a SourceType that you want to
     *         subscribe to. You can see a list of the categories for a given
     *         SourceType in the <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     *         >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using
     *         the <b>DescribeEventCategories</b> action.
     *         </p>
     */
    public java.util.List<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     *
     * @param eventCategories <p>
     *            A list of event categories for a SourceType that you want to
     *            subscribe to. You can see a list of the categories for a given
     *            SourceType in the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     *            >Events</a> topic in the <i>Amazon RDS User Guide</i> or by
     *            using the <b>DescribeEventCategories</b> action.
     *            </p>
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new java.util.ArrayList<String>(eventCategories);
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of event categories for a SourceType that you want to
     *            subscribe to. You can see a list of the categories for a given
     *            SourceType in the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     *            >Events</a> topic in the <i>Amazon RDS User Guide</i> or by
     *            using the <b>DescribeEventCategories</b> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEventSubscriptionRequest withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) {
            this.eventCategories = new java.util.ArrayList<String>(eventCategories.length);
        }
        for (String value : eventCategories) {
            this.eventCategories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     * >Events</a> topic in the <i>Amazon RDS User Guide</i> or by using the
     * <b>DescribeEventCategories</b> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventCategories <p>
     *            A list of event categories for a SourceType that you want to
     *            subscribe to. You can see a list of the categories for a given
     *            SourceType in the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"
     *            >Events</a> topic in the <i>Amazon RDS User Guide</i> or by
     *            using the <b>DescribeEventCategories</b> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEventSubscriptionRequest withEventCategories(
            java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to activate the subscription.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to activate the subscription.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     *
     * @param enabled <p>
     *            A value that indicates whether to activate the subscription.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * A value that indicates whether to activate the subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            A value that indicates whether to activate the subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyEventSubscriptionRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getSubscriptionName() != null)
            sb.append("SubscriptionName: " + getSubscriptionName() + ",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: " + getSnsTopicArn() + ",");
        if (getSourceType() != null)
            sb.append("SourceType: " + getSourceType() + ",");
        if (getEventCategories() != null)
            sb.append("EventCategories: " + getEventCategories() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode());
        hashCode = prime * hashCode
                + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode
                + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyEventSubscriptionRequest == false)
            return false;
        ModifyEventSubscriptionRequest other = (ModifyEventSubscriptionRequest) obj;

        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null)
            return false;
        if (other.getSubscriptionName() != null
                && other.getSubscriptionName().equals(this.getSubscriptionName()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null
                && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null
                && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null
                && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
