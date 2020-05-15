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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Retrieves metrics about specified crawlers.
 * </p>
 */
public class GetCrawlerMetricsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     */
    private java.util.List<String> crawlerNameList;

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     *
     * @return <p>
     *         A list of the names of crawlers about which to retrieve metrics.
     *         </p>
     */
    public java.util.List<String> getCrawlerNameList() {
        return crawlerNameList;
    }

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     *
     * @param crawlerNameList <p>
     *            A list of the names of crawlers about which to retrieve
     *            metrics.
     *            </p>
     */
    public void setCrawlerNameList(java.util.Collection<String> crawlerNameList) {
        if (crawlerNameList == null) {
            this.crawlerNameList = null;
            return;
        }

        this.crawlerNameList = new java.util.ArrayList<String>(crawlerNameList);
    }

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerNameList <p>
     *            A list of the names of crawlers about which to retrieve
     *            metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerMetricsRequest withCrawlerNameList(String... crawlerNameList) {
        if (getCrawlerNameList() == null) {
            this.crawlerNameList = new java.util.ArrayList<String>(crawlerNameList.length);
        }
        for (String value : crawlerNameList) {
            this.crawlerNameList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the names of crawlers about which to retrieve metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crawlerNameList <p>
     *            A list of the names of crawlers about which to retrieve
     *            metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerMetricsRequest withCrawlerNameList(java.util.Collection<String> crawlerNameList) {
        setCrawlerNameList(crawlerNameList);
        return this;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum size of a list to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum size of a list to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum size of a list to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum size of a list to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerMetricsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     *
     * @return <p>
     *         A continuation token, if this is a continuation call.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if this is a continuation call.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is a continuation call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if this is a continuation call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCrawlerMetricsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getCrawlerNameList() != null)
            sb.append("CrawlerNameList: " + getCrawlerNameList() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCrawlerNameList() == null) ? 0 : getCrawlerNameList().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCrawlerMetricsRequest == false)
            return false;
        GetCrawlerMetricsRequest other = (GetCrawlerMetricsRequest) obj;

        if (other.getCrawlerNameList() == null ^ this.getCrawlerNameList() == null)
            return false;
        if (other.getCrawlerNameList() != null
                && other.getCrawlerNameList().equals(this.getCrawlerNameList()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
