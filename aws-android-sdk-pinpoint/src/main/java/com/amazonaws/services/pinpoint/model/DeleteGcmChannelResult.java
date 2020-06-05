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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class DeleteGcmChannelResult implements Serializable {
    /**
     * <p>
     * Provides information about the status and settings of the GCM channel for
     * an application. The GCM channel enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service.
     * </p>
     */
    private GCMChannelResponse gCMChannelResponse;

    /**
     * <p>
     * Provides information about the status and settings of the GCM channel for
     * an application. The GCM channel enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service.
     * </p>
     *
     * @return <p>
     *         Provides information about the status and settings of the GCM
     *         channel for an application. The GCM channel enables Amazon
     *         Pinpoint to send push notifications through the Firebase Cloud
     *         Messaging (FCM), formerly Google Cloud Messaging (GCM), service.
     *         </p>
     */
    public GCMChannelResponse getGCMChannelResponse() {
        return gCMChannelResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of the GCM channel for
     * an application. The GCM channel enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service.
     * </p>
     *
     * @param gCMChannelResponse <p>
     *            Provides information about the status and settings of the GCM
     *            channel for an application. The GCM channel enables Amazon
     *            Pinpoint to send push notifications through the Firebase Cloud
     *            Messaging (FCM), formerly Google Cloud Messaging (GCM),
     *            service.
     *            </p>
     */
    public void setGCMChannelResponse(GCMChannelResponse gCMChannelResponse) {
        this.gCMChannelResponse = gCMChannelResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of the GCM channel for
     * an application. The GCM channel enables Amazon Pinpoint to send push
     * notifications through the Firebase Cloud Messaging (FCM), formerly Google
     * Cloud Messaging (GCM), service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCMChannelResponse <p>
     *            Provides information about the status and settings of the GCM
     *            channel for an application. The GCM channel enables Amazon
     *            Pinpoint to send push notifications through the Firebase Cloud
     *            Messaging (FCM), formerly Google Cloud Messaging (GCM),
     *            service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteGcmChannelResult withGCMChannelResponse(GCMChannelResponse gCMChannelResponse) {
        this.gCMChannelResponse = gCMChannelResponse;
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
        if (getGCMChannelResponse() != null)
            sb.append("GCMChannelResponse: " + getGCMChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGCMChannelResponse() == null) ? 0 : getGCMChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGcmChannelResult == false)
            return false;
        DeleteGcmChannelResult other = (DeleteGcmChannelResult) obj;

        if (other.getGCMChannelResponse() == null ^ this.getGCMChannelResponse() == null)
            return false;
        if (other.getGCMChannelResponse() != null
                && other.getGCMChannelResponse().equals(this.getGCMChannelResponse()) == false)
            return false;
        return true;
    }
}
