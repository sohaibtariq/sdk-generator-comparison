/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;


public class LinksListRequest {
    /**
     * How many results to return.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public LinksListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * An integer that designates the offset at which to begin returning results. Defaults to 0.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;

    public LinksListRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * Request that the response include the total count by specifying `include=["total_count"]`.
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    public String[] include;

    public LinksListRequest withInclude(String[] include) {
        this.include = include;
        return this;
    }
    
    /**
     * Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=date_created")
    public java.util.Map<String, String> dateCreated;

    public LinksListRequest withDateCreated(java.util.Map<String, String> dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * Filter by metadata key-value pair`.
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    public java.util.Map<String, String> metadata;

    public LinksListRequest withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Filter the links generated for a particular campaign using its campaign id.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=campaign_id")
    public String campaignId;

    public LinksListRequest withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    
    /**
     * Retrieve the list of links that have been opened.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=clicked")
    public Boolean clicked;

    public LinksListRequest withClicked(Boolean clicked) {
        this.clicked = clicked;
        return this;
    }
    
    /**
     * Filter the links generated for a particular billing group id.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=billing_group_id")
    public String billingGroupId;

    public LinksListRequest withBillingGroupId(String billingGroupId) {
        this.billingGroupId = billingGroupId;
        return this;
    }
    
    public LinksListRequest(){}
}
