/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinkResponse {
    /**
     * Unique identifier prefixed with `lnk_`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public LinkResponse withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Unique identifier prefixed with `cmp_`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("campaign_id")
    public String campaignId;

    public LinkResponse withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    
    /**
     * A unique identifier for the registered domain.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("domain_id")
    public String domainId;

    public LinkResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    
    /**
     * The unique ID of the associated resource where the link was used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resource_id")
    public String resourceId;

    public LinkResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    
    /**
     * The original target URL.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirect_link")
    public String redirectLink;

    public LinkResponse withRedirectLink(String redirectLink) {
        this.redirectLink = redirectLink;
        return this;
    }
    
    /**
     * The shortened URL for the associated original URL.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("short_link")
    public String shortLink;

    public LinkResponse withShortLink(String shortLink) {
        this.shortLink = shortLink;
        return this;
    }
    
    /**
     * Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata_tag")
    public java.util.Map<String, String> metadataTag;

    public LinkResponse withMetadataTag(java.util.Map<String, String> metadataTag) {
        this.metadataTag = metadataTag;
        return this;
    }
    
    /**
     * An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See &lt;a href="#tag/Billing-Groups"&gt;Billing Group API&lt;/a&gt; for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("billing_group_id")
    public String billingGroupId;

    public LinkResponse withBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
        return this;
    }
    
    public LinkResponse(){}
}