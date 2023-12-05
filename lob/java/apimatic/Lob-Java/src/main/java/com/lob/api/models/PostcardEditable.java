/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.models.containers.PostcardEditableFrom;
import com.lob.api.models.containers.PostcardEditableTo;
import com.lob.api.models.containers.PscBack;
import com.lob.api.models.containers.PscFront;
import com.lob.api.models.containers.SendDate;
import io.apimatic.core.types.OptionalNullable;
import java.util.Map;

/**
 * This is a model class for PostcardEditable type.
 */
public class PostcardEditable {
    private OptionalNullable<String> description;
    private Map<String, String> metadata;
    private MailTypeEnum mailType;
    private OptionalNullable<Object> mergeVariables;
    private SendDate sendDate;
    private PostcardSizeEnum size;
    private PostcardEditableTo to;
    private PostcardEditableFrom from;
    private PscFront front;
    private PscBack back;
    private String billingGroupId;
    private QrCode qrCode;
    private PscUseTypeEnum useType;
    private Boolean fsc;

    /**
     * Default constructor.
     */
    public PostcardEditable() {
        mailType = MailTypeEnum.USPS_FIRST_CLASS;
        size = PostcardSizeEnum.ENUM_4X6;
        fsc = false;
    }

    /**
     * Initialization constructor.
     * @param  to  PostcardEditableTo value for to.
     * @param  front  PscFront value for front.
     * @param  back  PscBack value for back.
     * @param  useType  PscUseTypeEnum value for useType.
     * @param  description  String value for description.
     * @param  metadata  Map of String, value for metadata.
     * @param  mailType  MailTypeEnum value for mailType.
     * @param  mergeVariables  Object value for mergeVariables.
     * @param  sendDate  SendDate value for sendDate.
     * @param  size  PostcardSizeEnum value for size.
     * @param  from  PostcardEditableFrom value for from.
     * @param  billingGroupId  String value for billingGroupId.
     * @param  qrCode  QrCode value for qrCode.
     * @param  fsc  Boolean value for fsc.
     */
    public PostcardEditable(
            PostcardEditableTo to,
            PscFront front,
            PscBack back,
            PscUseTypeEnum useType,
            String description,
            Map<String, String> metadata,
            MailTypeEnum mailType,
            Object mergeVariables,
            SendDate sendDate,
            PostcardSizeEnum size,
            PostcardEditableFrom from,
            String billingGroupId,
            QrCode qrCode,
            Boolean fsc) {
        this.description = OptionalNullable.of(description);
        this.metadata = metadata;
        this.mailType = mailType;
        this.mergeVariables = OptionalNullable.of(mergeVariables);
        this.sendDate = sendDate;
        this.size = size;
        this.to = to;
        this.from = from;
        this.front = front;
        this.back = back;
        this.billingGroupId = billingGroupId;
        this.qrCode = qrCode;
        this.useType = useType;
        this.fsc = fsc;
    }

    /**
     * Initialization constructor.
     * @param  to  PostcardEditableTo value for to.
     * @param  front  PscFront value for front.
     * @param  back  PscBack value for back.
     * @param  useType  PscUseTypeEnum value for useType.
     * @param  description  String value for description.
     * @param  metadata  Map of String, value for metadata.
     * @param  mailType  MailTypeEnum value for mailType.
     * @param  mergeVariables  Object value for mergeVariables.
     * @param  sendDate  SendDate value for sendDate.
     * @param  size  PostcardSizeEnum value for size.
     * @param  from  PostcardEditableFrom value for from.
     * @param  billingGroupId  String value for billingGroupId.
     * @param  qrCode  QrCode value for qrCode.
     * @param  fsc  Boolean value for fsc.
     */

    protected PostcardEditable(PostcardEditableTo to, PscFront front, PscBack back,
            PscUseTypeEnum useType, OptionalNullable<String> description,
            Map<String, String> metadata, MailTypeEnum mailType,
            OptionalNullable<Object> mergeVariables, SendDate sendDate, PostcardSizeEnum size,
            PostcardEditableFrom from, String billingGroupId, QrCode qrCode, Boolean fsc) {
        this.description = description;
        this.metadata = metadata;
        this.mailType = mailType;
        this.mergeVariables = mergeVariables;
        this.sendDate = sendDate;
        this.size = size;
        this.to = to;
        this.from = from;
        this.front = front;
        this.back = back;
        this.billingGroupId = billingGroupId;
        this.qrCode = qrCode;
        this.useType = useType;
        this.fsc = fsc;
    }

    /**
     * Internal Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for MailType.
     * A string designating the mail postage type: * `usps_first_class` - (default) *
     * `usps_standard` - a &lt;a href="https://lob.com/pricing/print-mail#compare"
     * target="_blank"&gt;cheaper option&lt;/a&gt; which is less predictable and takes longer to deliver.
     * `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the
     * United States.
     * @return Returns the MailTypeEnum
     */
    @JsonGetter("mail_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MailTypeEnum getMailType() {
        return mailType;
    }

    /**
     * Setter for MailType.
     * A string designating the mail postage type: * `usps_first_class` - (default) *
     * `usps_standard` - a &lt;a href="https://lob.com/pricing/print-mail#compare"
     * target="_blank"&gt;cheaper option&lt;/a&gt; which is less predictable and takes longer to deliver.
     * `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the
     * United States.
     * @param mailType Value for MailTypeEnum
     */
    @JsonSetter("mail_type")
    public void setMailType(MailTypeEnum mailType) {
        this.mailType = mailType;
    }

    /**
     * Internal Getter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&amp;`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `{@literal @}`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in &lt;a
     * href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10"
     * target="_blank"&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a
     * href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;Merge Variable
     * strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you
     * will either receive an error or the variable will render as an empty string.
     * @return Returns the Internal Object
     */
    @JsonGetter("merge_variables")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Object> internalGetMergeVariables() {
        return this.mergeVariables;
    }

    /**
     * Getter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&amp;`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `{@literal @}`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in &lt;a
     * href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10"
     * target="_blank"&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a
     * href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;Merge Variable
     * strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you
     * will either receive an error or the variable will render as an empty string.
     * @return Returns the Object
     */
    public Object getMergeVariables() {
        return OptionalNullable.getFrom(mergeVariables);
    }

    /**
     * Setter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&amp;`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `{@literal @}`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in &lt;a
     * href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10"
     * target="_blank"&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a
     * href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;Merge Variable
     * strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you
     * will either receive an error or the variable will render as an empty string.
     * @param mergeVariables Value for Object
     */
    @JsonSetter("merge_variables")
    public void setMergeVariables(Object mergeVariables) {
        this.mergeVariables = OptionalNullable.of(mergeVariables);
    }

    /**
     * UnSetter for MergeVariables.
     * You can input a merge variable payload object to your template to render dynamic content. For
     * example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name":
     * "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is
     * accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`,
     * `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you
     * call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your
     * variable names cannot contain any whitespace or any of the following special characters: `!`,
     * `"`, `#`, `%`, `&amp;`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `&lt;`, `=`, `&gt;`, `{@literal @}`, `[`, `\`,
     * `]`, `^`, `` ` ``, `{`, `|`, `}`, `~`. More instructions can be found in &lt;a
     * href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10"
     * target="_blank"&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a
     * href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;Merge Variable
     * strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you
     * will either receive an error or the variable will render as an empty string.
     */
    public void unsetMergeVariables() {
        mergeVariables = null;
    }

    /**
     * Getter for SendDate.
     * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180
     * days in the future to send the letter off for production. Setting a send date overrides the
     * default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until
     * the `send_date` has passed, the mailpiece can be canceled. If a date in the format
     * `2017-11-01` is passed, it will evaluate to midnight UTC of that date
     * (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A
     * `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a
     * time zone will be converted to UTC.
     * @return Returns the SendDate
     */
    @JsonGetter("send_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SendDate getSendDate() {
        return sendDate;
    }

    /**
     * Setter for SendDate.
     * A timestamp in ISO 8601 format which specifies a date after the current time and up to 180
     * days in the future to send the letter off for production. Setting a send date overrides the
     * default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until
     * the `send_date` has passed, the mailpiece can be canceled. If a date in the format
     * `2017-11-01` is passed, it will evaluate to midnight UTC of that date
     * (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A
     * `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a
     * time zone will be converted to UTC.
     * @param sendDate Value for SendDate
     */
    @JsonSetter("send_date")
    public void setSendDate(SendDate sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * Getter for Size.
     * Specifies the size of the postcard. Only `4x6` postcards can be sent to international
     * destinations.
     * @return Returns the PostcardSizeEnum
     */
    @JsonGetter("size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostcardSizeEnum getSize() {
        return size;
    }

    /**
     * Setter for Size.
     * Specifies the size of the postcard. Only `4x6` postcards can be sent to international
     * destinations.
     * @param size Value for PostcardSizeEnum
     */
    @JsonSetter("size")
    public void setSize(PostcardSizeEnum size) {
        this.size = size;
    }

    /**
     * Getter for To.
     * Must either be an address ID or an inline object with correct address parameters. If an
     * object is used, an address will be created, corrected, and standardized for free whenever
     * possible using our US Address Verification engine (if it is a US address), and returned back
     * with an ID. Depending on your &lt;a href="https://dashboard.lob.com/#/settings/editions"
     * target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;, US addresses may also be run through &lt;a
     * href="#tag/National-Change-of-Address"&gt;National Change of Address Linkage(NCOALink)&lt;/a&gt;.
     * Non-US addresses will be standardized into uppercase only. If a US address used does not meet
     * your account’s &lt;a href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;US Mail
     * strictness setting&lt;/a&gt;, the request will fail. &lt;a
     * href="https://help.lob.com/print-and-mail/all-about-addresses" target="_blank"&gt;Lob Guide:
     * Verification of Mailing Addresses&lt;/a&gt;
     * @return Returns the PostcardEditableTo
     */
    @JsonGetter("to")
    public PostcardEditableTo getTo() {
        return to;
    }

    /**
     * Setter for To.
     * Must either be an address ID or an inline object with correct address parameters. If an
     * object is used, an address will be created, corrected, and standardized for free whenever
     * possible using our US Address Verification engine (if it is a US address), and returned back
     * with an ID. Depending on your &lt;a href="https://dashboard.lob.com/#/settings/editions"
     * target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;, US addresses may also be run through &lt;a
     * href="#tag/National-Change-of-Address"&gt;National Change of Address Linkage(NCOALink)&lt;/a&gt;.
     * Non-US addresses will be standardized into uppercase only. If a US address used does not meet
     * your account’s &lt;a href="https://dashboard.lob.com/#/settings/account" target="_blank"&gt;US Mail
     * strictness setting&lt;/a&gt;, the request will fail. &lt;a
     * href="https://help.lob.com/print-and-mail/all-about-addresses" target="_blank"&gt;Lob Guide:
     * Verification of Mailing Addresses&lt;/a&gt;
     * @param to Value for PostcardEditableTo
     */
    @JsonSetter("to")
    public void setTo(PostcardEditableTo to) {
        this.to = to;
    }

    /**
     * Getter for From.
     * *Required* if `to` address is international. Must either be an address ID or an inline object
     * with correct address parameters. Must either be an address ID or an inline object with
     * correct address parameters. All addresses will be standardized into uppercase without being
     * modified by verification.
     * @return Returns the PostcardEditableFrom
     */
    @JsonGetter("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PostcardEditableFrom getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * *Required* if `to` address is international. Must either be an address ID or an inline object
     * with correct address parameters. Must either be an address ID or an inline object with
     * correct address parameters. All addresses will be standardized into uppercase without being
     * modified by verification.
     * @param from Value for PostcardEditableFrom
     */
    @JsonSetter("from")
    public void setFrom(PostcardEditableFrom from) {
        this.from = from;
    }

    /**
     * Getter for Front.
     * The artwork to use as the front of your postcard. Notes: - HTML merge variables should not
     * include delimiting whitespace. - PDF, PNG, and JPGs must be sized at 4.25"x6.25",
     * 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the
     * specified `size`. See [here](#section/HTML-Examples) for HTML examples.
     * @return Returns the PscFront
     */
    @JsonGetter("front")
    public PscFront getFront() {
        return front;
    }

    /**
     * Setter for Front.
     * The artwork to use as the front of your postcard. Notes: - HTML merge variables should not
     * include delimiting whitespace. - PDF, PNG, and JPGs must be sized at 4.25"x6.25",
     * 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the
     * specified `size`. See [here](#section/HTML-Examples) for HTML examples.
     * @param front Value for PscFront
     */
    @JsonSetter("front")
    public void setFront(PscFront front) {
        this.front = front;
    }

    /**
     * Getter for Back.
     * The artwork to use as the back of your postcard. Notes: - HTML merge variables should not
     * include delimiting whitespace. - PDF, PNG, and JPGs must be sized at 4.25"x6.25",
     * 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the
     * specified `size`. - Be sure to leave room for address and postage information by following
     * the templates provided here: - &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/4x6_postcard.pdf"
     * target="_blank"&gt;4x6 template&lt;/a&gt; - &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x9_postcard.pdf"
     * target="_blank"&gt;6x9 template&lt;/a&gt; - &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x11_postcard.pdf"
     * target="_blank"&gt;6x11 template&lt;/a&gt; See [here](#section/HTML-Examples) for HTML examples.
     * @return Returns the PscBack
     */
    @JsonGetter("back")
    public PscBack getBack() {
        return back;
    }

    /**
     * Setter for Back.
     * The artwork to use as the back of your postcard. Notes: - HTML merge variables should not
     * include delimiting whitespace. - PDF, PNG, and JPGs must be sized at 4.25"x6.25",
     * 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the
     * specified `size`. - Be sure to leave room for address and postage information by following
     * the templates provided here: - &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/4x6_postcard.pdf"
     * target="_blank"&gt;4x6 template&lt;/a&gt; - &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x9_postcard.pdf"
     * target="_blank"&gt;6x9 template&lt;/a&gt; - &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x11_postcard.pdf"
     * target="_blank"&gt;6x11 template&lt;/a&gt; See [here](#section/HTML-Examples) for HTML examples.
     * @param back Value for PscBack
     */
    @JsonSetter("back")
    public void setBack(PscBack back) {
        this.back = back;
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
     * Getter for QrCode.
     * Customize and place a QR code on the creative at the required position.
     * @return Returns the QrCode
     */
    @JsonGetter("qr_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public QrCode getQrCode() {
        return qrCode;
    }

    /**
     * Setter for QrCode.
     * Customize and place a QR code on the creative at the required position.
     * @param qrCode Value for QrCode
     */
    @JsonSetter("qr_code")
    public void setQrCode(QrCode qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * Getter for UseType.
     * The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type
     * is only allowed if an account default use_type is selected in Account Settings. For more
     * information on use_type, see our [Help Center
     * article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type).
     * @return Returns the PscUseTypeEnum
     */
    @JsonGetter("use_type")
    public PscUseTypeEnum getUseType() {
        return useType;
    }

    /**
     * Setter for UseType.
     * The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type
     * is only allowed if an account default use_type is selected in Account Settings. For more
     * information on use_type, see our [Help Center
     * article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type).
     * @param useType Value for PscUseTypeEnum
     */
    @JsonSetter("use_type")
    public void setUseType(PscUseTypeEnum useType) {
        this.useType = useType;
    }

    /**
     * Getter for Fsc.
     * This is in beta. Contact support{@literal @}lob.com or your account contact to learn more. Not available
     * for `4x6` or `A5` postcard sizes.
     * @return Returns the Boolean
     */
    @JsonGetter("fsc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFsc() {
        return fsc;
    }

    /**
     * Setter for Fsc.
     * This is in beta. Contact support{@literal @}lob.com or your account contact to learn more. Not available
     * for `4x6` or `A5` postcard sizes.
     * @param fsc Value for Boolean
     */
    @JsonSetter("fsc")
    public void setFsc(Boolean fsc) {
        this.fsc = fsc;
    }

    /**
     * Converts this PostcardEditable into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PostcardEditable [" + "to=" + to + ", front=" + front + ", back=" + back
                + ", useType=" + useType + ", description=" + description + ", metadata=" + metadata
                + ", mailType=" + mailType + ", mergeVariables=" + mergeVariables + ", sendDate="
                + sendDate + ", size=" + size + ", from=" + from + ", billingGroupId="
                + billingGroupId + ", qrCode=" + qrCode + ", fsc=" + fsc + "]";
    }

    /**
     * Builds a new {@link PostcardEditable.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PostcardEditable.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(to, front, back, useType)
                .metadata(getMetadata())
                .mailType(getMailType())
                .sendDate(getSendDate())
                .size(getSize())
                .from(getFrom())
                .billingGroupId(getBillingGroupId())
                .qrCode(getQrCode())
                .fsc(getFsc());
        builder.description = internalGetDescription();
        builder.mergeVariables = internalGetMergeVariables();
        return builder;
    }

    /**
     * Class to build instances of {@link PostcardEditable}.
     */
    public static class Builder {
        private PostcardEditableTo to;
        private PscFront front;
        private PscBack back;
        private PscUseTypeEnum useType;
        private OptionalNullable<String> description;
        private Map<String, String> metadata;
        private MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;
        private OptionalNullable<Object> mergeVariables;
        private SendDate sendDate;
        private PostcardSizeEnum size = PostcardSizeEnum.ENUM_4X6;
        private PostcardEditableFrom from;
        private String billingGroupId;
        private QrCode qrCode;
        private Boolean fsc = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  to  PostcardEditableTo value for to.
         * @param  front  PscFront value for front.
         * @param  back  PscBack value for back.
         * @param  useType  PscUseTypeEnum value for useType.
         */
        public Builder(PostcardEditableTo to, PscFront front, PscBack back,
                PscUseTypeEnum useType) {
            this.to = to;
            this.front = front;
            this.back = back;
            this.useType = useType;
        }

        /**
         * Setter for to.
         * @param  to  PostcardEditableTo value for to.
         * @return Builder
         */
        public Builder to(PostcardEditableTo to) {
            this.to = to;
            return this;
        }

        /**
         * Setter for front.
         * @param  front  PscFront value for front.
         * @return Builder
         */
        public Builder front(PscFront front) {
            this.front = front;
            return this;
        }

        /**
         * Setter for back.
         * @param  back  PscBack value for back.
         * @return Builder
         */
        public Builder back(PscBack back) {
            this.back = back;
            return this;
        }

        /**
         * Setter for useType.
         * @param  useType  PscUseTypeEnum value for useType.
         * @return Builder
         */
        public Builder useType(PscUseTypeEnum useType) {
            this.useType = useType;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for mailType.
         * @param  mailType  MailTypeEnum value for mailType.
         * @return Builder
         */
        public Builder mailType(MailTypeEnum mailType) {
            this.mailType = mailType;
            return this;
        }

        /**
         * Setter for mergeVariables.
         * @param  mergeVariables  Object value for mergeVariables.
         * @return Builder
         */
        public Builder mergeVariables(Object mergeVariables) {
            this.mergeVariables = OptionalNullable.of(mergeVariables);
            return this;
        }

        /**
         * UnSetter for mergeVariables.
         * @return Builder
         */
        public Builder unsetMergeVariables() {
            mergeVariables = null;
            return this;
        }

        /**
         * Setter for sendDate.
         * @param  sendDate  SendDate value for sendDate.
         * @return Builder
         */
        public Builder sendDate(SendDate sendDate) {
            this.sendDate = sendDate;
            return this;
        }

        /**
         * Setter for size.
         * @param  size  PostcardSizeEnum value for size.
         * @return Builder
         */
        public Builder size(PostcardSizeEnum size) {
            this.size = size;
            return this;
        }

        /**
         * Setter for from.
         * @param  from  PostcardEditableFrom value for from.
         * @return Builder
         */
        public Builder from(PostcardEditableFrom from) {
            this.from = from;
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
         * Setter for qrCode.
         * @param  qrCode  QrCode value for qrCode.
         * @return Builder
         */
        public Builder qrCode(QrCode qrCode) {
            this.qrCode = qrCode;
            return this;
        }

        /**
         * Setter for fsc.
         * @param  fsc  Boolean value for fsc.
         * @return Builder
         */
        public Builder fsc(Boolean fsc) {
            this.fsc = fsc;
            return this;
        }

        /**
         * Builds a new {@link PostcardEditable} object using the set fields.
         * @return {@link PostcardEditable}
         */
        public PostcardEditable build() {
            return new PostcardEditable(to, front, back, useType, description, metadata, mailType,
                    mergeVariables, sendDate, size, from, billingGroupId, qrCode, fsc);
        }
    }
}
