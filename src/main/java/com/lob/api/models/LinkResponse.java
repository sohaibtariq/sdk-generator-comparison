/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;

/**
 * This is a model class for LinkResponse type.
 */
public class LinkResponse {
    private String id;
    private String campaignId;
    private String domainId;
    private String resourceId;
    private String redirectLink;
    private String shortLink;
    private Map<String, String> metadataTag;
    private String billingGroupId;

    /**
     * Default constructor.
     */
    public LinkResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  campaignId  String value for campaignId.
     * @param  domainId  String value for domainId.
     * @param  resourceId  String value for resourceId.
     * @param  redirectLink  String value for redirectLink.
     * @param  shortLink  String value for shortLink.
     * @param  metadataTag  Map of String, value for metadataTag.
     * @param  billingGroupId  String value for billingGroupId.
     */
    public LinkResponse(
            String id,
            String campaignId,
            String domainId,
            String resourceId,
            String redirectLink,
            String shortLink,
            Map<String, String> metadataTag,
            String billingGroupId) {
        this.id = id;
        this.campaignId = campaignId;
        this.domainId = domainId;
        this.resourceId = resourceId;
        this.redirectLink = redirectLink;
        this.shortLink = shortLink;
        this.metadataTag = metadataTag;
        this.billingGroupId = billingGroupId;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `lnk_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `lnk_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for CampaignId.
     * Unique identifier prefixed with `cmp_`.
     * @return Returns the String
     */
    @JsonGetter("campaign_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Setter for CampaignId.
     * Unique identifier prefixed with `cmp_`.
     * @param campaignId Value for String
     */
    @JsonSetter("campaign_id")
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Getter for DomainId.
     * A unique identifier for the registered domain.
     * @return Returns the String
     */
    @JsonGetter("domain_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDomainId() {
        return domainId;
    }

    /**
     * Setter for DomainId.
     * A unique identifier for the registered domain.
     * @param domainId Value for String
     */
    @JsonSetter("domain_id")
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * Getter for ResourceId.
     * The unique ID of the associated resource where the link was used.
     * @return Returns the String
     */
    @JsonGetter("resource_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Setter for ResourceId.
     * The unique ID of the associated resource where the link was used.
     * @param resourceId Value for String
     */
    @JsonSetter("resource_id")
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Getter for RedirectLink.
     * The original target URL.
     * @return Returns the String
     */
    @JsonGetter("redirect_link")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRedirectLink() {
        return redirectLink;
    }

    /**
     * Setter for RedirectLink.
     * The original target URL.
     * @param redirectLink Value for String
     */
    @JsonSetter("redirect_link")
    public void setRedirectLink(String redirectLink) {
        this.redirectLink = redirectLink;
    }

    /**
     * Getter for ShortLink.
     * The shortened URL for the associated original URL.
     * @return Returns the String
     */
    @JsonGetter("short_link")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getShortLink() {
        return shortLink;
    }

    /**
     * Setter for ShortLink.
     * The shortened URL for the associated original URL.
     * @param shortLink Value for String
     */
    @JsonSetter("short_link")
    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    /**
     * Getter for MetadataTag.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata_tag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadataTag() {
        return metadataTag;
    }

    /**
     * Setter for MetadataTag.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @param metadataTag Value for Map of String, String
     */
    @JsonSetter("metadata_tag")
    public void setMetadataTag(Map<String, String> metadataTag) {
        this.metadataTag = metadataTag;
    }

    /**
     * Getter for BillingGroupId.
     * An optional string with the billing group ID to tag your usage with. Is used for billing
     * purposes. Requires special activation to use. See &lt;a href="#tag/Billing-Groups"&gt;Billing Group
     * API&lt;/a&gt; for more information.
     * @return Returns the String
     */
    @JsonGetter("billing_group_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingGroupId() {
        return billingGroupId;
    }

    /**
     * Setter for BillingGroupId.
     * An optional string with the billing group ID to tag your usage with. Is used for billing
     * purposes. Requires special activation to use. See &lt;a href="#tag/Billing-Groups"&gt;Billing Group
     * API&lt;/a&gt; for more information.
     * @param billingGroupId Value for String
     */
    @JsonSetter("billing_group_id")
    public void setBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
    }

    /**
     * Converts this LinkResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LinkResponse [" + "id=" + id + ", campaignId=" + campaignId + ", domainId="
                + domainId + ", resourceId=" + resourceId + ", redirectLink=" + redirectLink
                + ", shortLink=" + shortLink + ", metadataTag=" + metadataTag + ", billingGroupId="
                + billingGroupId + "]";
    }

    /**
     * Builds a new {@link LinkResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LinkResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .campaignId(getCampaignId())
                .domainId(getDomainId())
                .resourceId(getResourceId())
                .redirectLink(getRedirectLink())
                .shortLink(getShortLink())
                .metadataTag(getMetadataTag())
                .billingGroupId(getBillingGroupId());
        return builder;
    }

    /**
     * Class to build instances of {@link LinkResponse}.
     */
    public static class Builder {
        private String id;
        private String campaignId;
        private String domainId;
        private String resourceId;
        private String redirectLink;
        private String shortLink;
        private Map<String, String> metadataTag;
        private String billingGroupId;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for campaignId.
         * @param  campaignId  String value for campaignId.
         * @return Builder
         */
        public Builder campaignId(String campaignId) {
            this.campaignId = campaignId;
            return this;
        }

        /**
         * Setter for domainId.
         * @param  domainId  String value for domainId.
         * @return Builder
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * Setter for resourceId.
         * @param  resourceId  String value for resourceId.
         * @return Builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Setter for redirectLink.
         * @param  redirectLink  String value for redirectLink.
         * @return Builder
         */
        public Builder redirectLink(String redirectLink) {
            this.redirectLink = redirectLink;
            return this;
        }

        /**
         * Setter for shortLink.
         * @param  shortLink  String value for shortLink.
         * @return Builder
         */
        public Builder shortLink(String shortLink) {
            this.shortLink = shortLink;
            return this;
        }

        /**
         * Setter for metadataTag.
         * @param  metadataTag  Map of String, value for metadataTag.
         * @return Builder
         */
        public Builder metadataTag(Map<String, String> metadataTag) {
            this.metadataTag = metadataTag;
            return this;
        }

        /**
         * Setter for billingGroupId.
         * @param  billingGroupId  String value for billingGroupId.
         * @return Builder
         */
        public Builder billingGroupId(String billingGroupId) {
            this.billingGroupId = billingGroupId;
            return this;
        }

        /**
         * Builds a new {@link LinkResponse} object using the set fields.
         * @return {@link LinkResponse}
         */
        public LinkResponse build() {
            return new LinkResponse(id, campaignId, domainId, resourceId, redirectLink, shortLink,
                    metadataTag, billingGroupId);
        }
    }
}
