/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BillingGroupsListResponseBody - Multiple items returned in order
 */

public class BillingGroupsListResponseBody {
    /**
     * Value is resource type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public String object;

    public BillingGroupsListResponseBody withObject(String object) {
        this.object = object;
        return this;
    }
    
    /**
     * Url of next page of items in list.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next_url")
    public String nextUrl;

    public BillingGroupsListResponseBody withNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
        return this;
    }
    
    /**
     * Url of previous page of items in list.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous_url")
    public String previousUrl;

    public BillingGroupsListResponseBody withPreviousUrl(String previousUrl) {
        this.previousUrl = previousUrl;
        return this;
    }
    
    /**
     * number of resources in a set
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    public Long count;

    public BillingGroupsListResponseBody withCount(Long count) {
        this.count = count;
        return this;
    }
    
    /**
     * Indicates the total number of records. Provided when the request specifies an "include" query parameter
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_count")
    public Long totalCount;

    public BillingGroupsListResponseBody withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    
    /**
     * list of billing_groups
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public org.openapis.openapi.models.shared.BillingGroup[] data;

    public BillingGroupsListResponseBody withData(org.openapis.openapi.models.shared.BillingGroup[] data) {
        this.data = data;
        return this;
    }
    
    public BillingGroupsListResponseBody(){}
}
