/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;


public class SelfMailer {
    @JsonProperty("to")
    public Object to;

    public SelfMailer withTo(Object to) {
        this.to = to;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("carrier")
    public SelfMailerCarrier carrier;

    public SelfMailer withCarrier(SelfMailerCarrier carrier) {
        this.carrier = carrier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumbnails")
    public Thumbnail[] thumbnails;

    public SelfMailer withThumbnails(Thumbnail[] thumbnails) {
        this.thumbnails = thumbnails;
        return this;
    }
    
    /**
     * A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("expected_delivery_date")
    public LocalDate expectedDeliveryDate;

    public SelfMailer withExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_created")
    public OffsetDateTime dateCreated;

    public SelfMailer withDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_modified")
    public OffsetDateTime dateModified;

    public SelfMailer withDateModified(OffsetDateTime dateModified) {
        this.dateModified = dateModified;
        return this;
    }
    
    /**
     * Only returned if the resource has been successfully deleted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public Boolean deleted;

    public SelfMailer withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from")
    public Object from;

    public SelfMailer withFrom(Object from) {
        this.from = from;
        return this;
    }
    
    /**
     * Unique identifier prefixed with `sfm_`.
     */
    @JsonProperty("id")
    public String id;

    public SelfMailer withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The unique ID of the HTML template used for the outside of the self mailer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outside_template_id")
    public String outsideTemplateId;

    public SelfMailer withOutsideTemplateId(String outsideTemplateId) {
        this.outsideTemplateId = outsideTemplateId;
        return this;
    }
    
    /**
     * The unique ID of the HTML template used for the inside of the self mailer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inside_template_id")
    public String insideTemplateId;

    public SelfMailer withInsideTemplateId(String insideTemplateId) {
        this.insideTemplateId = insideTemplateId;
        return this;
    }
    
    /**
     * The unique ID of the specific version of the HTML template used for the outside of the self mailer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("outside_template_version_id")
    public String outsideTemplateVersionId;

    public SelfMailer withOutsideTemplateVersionId(String outsideTemplateVersionId) {
        this.outsideTemplateVersionId = outsideTemplateVersionId;
        return this;
    }
    
    /**
     * The unique ID of the specific version of the HTML template used for the inside of the self mailer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("inside_template_version_id")
    public String insideTemplateVersionId;

    public SelfMailer withInsideTemplateVersionId(String insideTemplateVersionId) {
        this.insideTemplateVersionId = insideTemplateVersionId;
        return this;
    }
    
    /**
     * Value is resource type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public SelfMailerObject object;

    public SelfMailer withObject(SelfMailerObject object) {
        this.object = object;
        return this;
    }
    
    /**
     * An array of certified tracking events ordered by ascending `time`. Not populated in test mode.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_events")
    public TrackingEventCertified[] trackingEvents;

    public SelfMailer withTrackingEvents(TrackingEventCertified[] trackingEvents) {
        this.trackingEvents = trackingEvents;
        return this;
    }
    
    /**
     * The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type).
     */
    @JsonProperty("use_type")
    public SfmUseType useType;

    public SelfMailer withUseType(SfmUseType useType) {
        this.useType = useType;
        return this;
    }
    
    /**
     * A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.
     */
    @JsonProperty("url")
    public String url;

    public SelfMailer withUrl(String url) {
        this.url = url;
        return this;
    }
    
    /**
     * This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `11x9_bifold` self-mailer size.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fsc")
    public Boolean fsc;

    public SelfMailer withFsc(Boolean fsc) {
        this.fsc = fsc;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public TheStatusOfTheSelfMailer status;

    public SelfMailer withStatus(TheStatusOfTheSelfMailer status) {
        this.status = status;
        return this;
    }
    
    /**
     * A string describing the reason for failure if the self mailer failed to render.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("failure_reason")
    public String failureReason;

    public SelfMailer withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }
    
    /**
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public SelfMailer withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public SelfMailer withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * A string designating the mail postage type:
     * * `usps_first_class` - (default)
     * * `usps_standard` - a &lt;a href="https://lob.com/pricing/print-mail#compare" target="_blank"&gt;cheaper option&lt;/a&gt; which is
     * less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`
     * postcards or for any postcards sent outside of the United States.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mail_type")
    public MailType mailType;

    public SelfMailer withMailType(MailType mailType) {
        this.mailType = mailType;
        return this;
    }
    
    /**
     * You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&amp;`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `@`, `[`, `\`, `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in &lt;a href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10" target="_blank"&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;Merge Variable strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("merge_variables")
    public MergeVariables mergeVariables;

    public SelfMailer withMergeVariables(MergeVariables mergeVariables) {
        this.mergeVariables = mergeVariables;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("send_date")
    public Object sendDate;

    public SelfMailer withSendDate(Object sendDate) {
        this.sendDate = sendDate;
        return this;
    }
    
    /**
     * Specifies the size of the self mailer. The `17.75x9_trifold` size is in beta. Contact support@lob.com or your account contact to learn more.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public SelfMailerSize size;

    public SelfMailer withSize(SelfMailerSize size) {
        this.size = size;
        return this;
    }
    
    public SelfMailer(@JsonProperty("to") Object to, @JsonProperty("id") String id, @JsonProperty("use_type") SfmUseType useType, @JsonProperty("url") String url) {
        this.to = to;
        this.id = id;
        this.useType = useType;
        this.url = url;
  }
}
