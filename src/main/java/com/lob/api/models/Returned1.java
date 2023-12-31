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
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for Returned1 type.
 */
public class Returned1 {
    private MailTypeEnum mailType;
    private PostcardSizeEnum size;
    private String frontOriginalUrl;
    private String backOriginalUrl;
    private AddressPlacementEnum addressPlacement;
    private OptionalNullable<List<String>> buckslips;
    private OptionalNullable<List<String>> cards;
    private OptionalNullable<CustomEnvelopeReturned> customEnvelope;
    private Boolean color;
    private Boolean doubleSided;
    private OptionalNullable<ExtraServiceEnum> extraService;
    private String fileOriginalUrl;
    private String insideOriginalUrl;
    private String outsideOriginalUrl;

    /**
     * Default constructor.
     */
    public Returned1() {
        mailType = MailTypeEnum.USPS_FIRST_CLASS;
        size = PostcardSizeEnum.ENUM_4X6;
        addressPlacement = AddressPlacementEnum.TOP_FIRST_PAGE;
        doubleSided = true;
    }

    /**
     * Initialization constructor.
     * @param  mailType  MailTypeEnum value for mailType.
     * @param  size  PostcardSizeEnum value for size.
     * @param  frontOriginalUrl  String value for frontOriginalUrl.
     * @param  backOriginalUrl  String value for backOriginalUrl.
     * @param  addressPlacement  AddressPlacementEnum value for addressPlacement.
     * @param  buckslips  List of String value for buckslips.
     * @param  cards  List of String value for cards.
     * @param  customEnvelope  CustomEnvelopeReturned value for customEnvelope.
     * @param  color  Boolean value for color.
     * @param  doubleSided  Boolean value for doubleSided.
     * @param  extraService  ExtraServiceEnum value for extraService.
     * @param  fileOriginalUrl  String value for fileOriginalUrl.
     * @param  insideOriginalUrl  String value for insideOriginalUrl.
     * @param  outsideOriginalUrl  String value for outsideOriginalUrl.
     */
    public Returned1(
            MailTypeEnum mailType,
            PostcardSizeEnum size,
            String frontOriginalUrl,
            String backOriginalUrl,
            AddressPlacementEnum addressPlacement,
            List<String> buckslips,
            List<String> cards,
            CustomEnvelopeReturned customEnvelope,
            Boolean color,
            Boolean doubleSided,
            ExtraServiceEnum extraService,
            String fileOriginalUrl,
            String insideOriginalUrl,
            String outsideOriginalUrl) {
        this.mailType = mailType;
        this.size = size;
        this.frontOriginalUrl = frontOriginalUrl;
        this.backOriginalUrl = backOriginalUrl;
        this.addressPlacement = addressPlacement;
        this.buckslips = OptionalNullable.of(buckslips);
        this.cards = OptionalNullable.of(cards);
        this.customEnvelope = OptionalNullable.of(customEnvelope);
        this.color = color;
        this.doubleSided = doubleSided;
        this.extraService = OptionalNullable.of(extraService);
        this.fileOriginalUrl = fileOriginalUrl;
        this.insideOriginalUrl = insideOriginalUrl;
        this.outsideOriginalUrl = outsideOriginalUrl;
    }

    /**
     * Initialization constructor.
     * @param  mailType  MailTypeEnum value for mailType.
     * @param  size  PostcardSizeEnum value for size.
     * @param  frontOriginalUrl  String value for frontOriginalUrl.
     * @param  backOriginalUrl  String value for backOriginalUrl.
     * @param  addressPlacement  AddressPlacementEnum value for addressPlacement.
     * @param  buckslips  List of String value for buckslips.
     * @param  cards  List of String value for cards.
     * @param  customEnvelope  CustomEnvelopeReturned value for customEnvelope.
     * @param  color  Boolean value for color.
     * @param  doubleSided  Boolean value for doubleSided.
     * @param  extraService  ExtraServiceEnum value for extraService.
     * @param  fileOriginalUrl  String value for fileOriginalUrl.
     * @param  insideOriginalUrl  String value for insideOriginalUrl.
     * @param  outsideOriginalUrl  String value for outsideOriginalUrl.
     */

    protected Returned1(MailTypeEnum mailType, PostcardSizeEnum size, String frontOriginalUrl,
            String backOriginalUrl, AddressPlacementEnum addressPlacement,
            OptionalNullable<List<String>> buckslips, OptionalNullable<List<String>> cards,
            OptionalNullable<CustomEnvelopeReturned> customEnvelope, Boolean color,
            Boolean doubleSided, OptionalNullable<ExtraServiceEnum> extraService,
            String fileOriginalUrl, String insideOriginalUrl, String outsideOriginalUrl) {
        this.mailType = mailType;
        this.size = size;
        this.frontOriginalUrl = frontOriginalUrl;
        this.backOriginalUrl = backOriginalUrl;
        this.addressPlacement = addressPlacement;
        this.buckslips = buckslips;
        this.cards = cards;
        this.customEnvelope = customEnvelope;
        this.color = color;
        this.doubleSided = doubleSided;
        this.extraService = extraService;
        this.fileOriginalUrl = fileOriginalUrl;
        this.insideOriginalUrl = insideOriginalUrl;
        this.outsideOriginalUrl = outsideOriginalUrl;
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
     * Getter for FrontOriginalUrl.
     * The original URL of the `front` template.
     * @return Returns the String
     */
    @JsonGetter("front_original_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFrontOriginalUrl() {
        return frontOriginalUrl;
    }

    /**
     * Setter for FrontOriginalUrl.
     * The original URL of the `front` template.
     * @param frontOriginalUrl Value for String
     */
    @JsonSetter("front_original_url")
    public void setFrontOriginalUrl(String frontOriginalUrl) {
        this.frontOriginalUrl = frontOriginalUrl;
    }

    /**
     * Getter for BackOriginalUrl.
     * The original URL of the `back` template.
     * @return Returns the String
     */
    @JsonGetter("back_original_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBackOriginalUrl() {
        return backOriginalUrl;
    }

    /**
     * Setter for BackOriginalUrl.
     * The original URL of the `back` template.
     * @param backOriginalUrl Value for String
     */
    @JsonSetter("back_original_url")
    public void setBackOriginalUrl(String backOriginalUrl) {
        this.backOriginalUrl = backOriginalUrl;
    }

    /**
     * Getter for AddressPlacement.
     * Specifies the location of the address information that will show through the double-window
     * envelope. To see how this will impact your letter design, view our letter template. Some
     * values are exclusive to certain customers. Upgrade to the appropriate &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;
     * to gain access. * `top_first_page` - (default) print address information at the top of your
     * provided first page * `insert_blank_page` - insert a blank address page at the beginning of
     * your file (you will be charged for the extra page) * `bottom_first_page_center` -
     * **(exclusive, deprecation planned within a few months)** print address information at the
     * bottom center of your provided first page * `bottom_first_page` - **(exclusive)** print
     * address information at the bottom of your provided first page
     * @return Returns the AddressPlacementEnum
     */
    @JsonGetter("address_placement")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddressPlacementEnum getAddressPlacement() {
        return addressPlacement;
    }

    /**
     * Setter for AddressPlacement.
     * Specifies the location of the address information that will show through the double-window
     * envelope. To see how this will impact your letter design, view our letter template. Some
     * values are exclusive to certain customers. Upgrade to the appropriate &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;
     * to gain access. * `top_first_page` - (default) print address information at the top of your
     * provided first page * `insert_blank_page` - insert a blank address page at the beginning of
     * your file (you will be charged for the extra page) * `bottom_first_page_center` -
     * **(exclusive, deprecation planned within a few months)** print address information at the
     * bottom center of your provided first page * `bottom_first_page` - **(exclusive)** print
     * address information at the bottom of your provided first page
     * @param addressPlacement Value for AddressPlacementEnum
     */
    @JsonSetter("address_placement")
    public void setAddressPlacement(AddressPlacementEnum addressPlacement) {
        this.addressPlacement = addressPlacement;
    }

    /**
     * Internal Getter for Buckslips.
     * A single-element array containing an existing buckslip id in a string format. See
     * [buckslips](#tag/Buckslips) for more information.
     * @return Returns the Internal List of String
     */
    @JsonGetter("buckslips")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetBuckslips() {
        return this.buckslips;
    }

    /**
     * Getter for Buckslips.
     * A single-element array containing an existing buckslip id in a string format. See
     * [buckslips](#tag/Buckslips) for more information.
     * @return Returns the List of String
     */
    public List<String> getBuckslips() {
        return OptionalNullable.getFrom(buckslips);
    }

    /**
     * Setter for Buckslips.
     * A single-element array containing an existing buckslip id in a string format. See
     * [buckslips](#tag/Buckslips) for more information.
     * @param buckslips Value for List of String
     */
    @JsonSetter("buckslips")
    public void setBuckslips(List<String> buckslips) {
        this.buckslips = OptionalNullable.of(buckslips);
    }

    /**
     * UnSetter for Buckslips.
     * A single-element array containing an existing buckslip id in a string format. See
     * [buckslips](#tag/Buckslips) for more information.
     */
    public void unsetBuckslips() {
        buckslips = null;
    }

    /**
     * Internal Getter for Cards.
     * A single-element array containing an existing card id in a string format. See
     * [cards](#tag/Cards) for more information.
     * @return Returns the Internal List of String
     */
    @JsonGetter("cards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetCards() {
        return this.cards;
    }

    /**
     * Getter for Cards.
     * A single-element array containing an existing card id in a string format. See
     * [cards](#tag/Cards) for more information.
     * @return Returns the List of String
     */
    public List<String> getCards() {
        return OptionalNullable.getFrom(cards);
    }

    /**
     * Setter for Cards.
     * A single-element array containing an existing card id in a string format. See
     * [cards](#tag/Cards) for more information.
     * @param cards Value for List of String
     */
    @JsonSetter("cards")
    public void setCards(List<String> cards) {
        this.cards = OptionalNullable.of(cards);
    }

    /**
     * UnSetter for Cards.
     * A single-element array containing an existing card id in a string format. See
     * [cards](#tag/Cards) for more information.
     */
    public void unsetCards() {
        cards = null;
    }

    /**
     * Internal Getter for CustomEnvelope.
     * A nested custom envelope object containing more information about the custom envelope used or
     * `null` if a custom envelope was not used.
     * @return Returns the Internal CustomEnvelopeReturned
     */
    @JsonGetter("custom_envelope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CustomEnvelopeReturned> internalGetCustomEnvelope() {
        return this.customEnvelope;
    }

    /**
     * Getter for CustomEnvelope.
     * A nested custom envelope object containing more information about the custom envelope used or
     * `null` if a custom envelope was not used.
     * @return Returns the CustomEnvelopeReturned
     */
    public CustomEnvelopeReturned getCustomEnvelope() {
        return OptionalNullable.getFrom(customEnvelope);
    }

    /**
     * Setter for CustomEnvelope.
     * A nested custom envelope object containing more information about the custom envelope used or
     * `null` if a custom envelope was not used.
     * @param customEnvelope Value for CustomEnvelopeReturned
     */
    @JsonSetter("custom_envelope")
    public void setCustomEnvelope(CustomEnvelopeReturned customEnvelope) {
        this.customEnvelope = OptionalNullable.of(customEnvelope);
    }

    /**
     * UnSetter for CustomEnvelope.
     * A nested custom envelope object containing more information about the custom envelope used or
     * `null` if a custom envelope was not used.
     */
    public void unsetCustomEnvelope() {
        customEnvelope = null;
    }

    /**
     * Getter for Color.
     * Set this key to `true` if you would like to print in color. Set to `false` if you would like
     * to print in black and white.
     * @return Returns the Boolean
     */
    @JsonGetter("color")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getColor() {
        return color;
    }

    /**
     * Setter for Color.
     * Set this key to `true` if you would like to print in color. Set to `false` if you would like
     * to print in black and white.
     * @param color Value for Boolean
     */
    @JsonSetter("color")
    public void setColor(Boolean color) {
        this.color = color;
    }

    /**
     * Getter for DoubleSided.
     * Set this attribute to `true` for double sided printing, or `false` for for single sided
     * printing. Defaults to `true`.
     * @return Returns the Boolean
     */
    @JsonGetter("double_sided")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDoubleSided() {
        return doubleSided;
    }

    /**
     * Setter for DoubleSided.
     * Set this attribute to `true` for double sided printing, or `false` for for single sided
     * printing. Defaults to `true`.
     * @param doubleSided Value for Boolean
     */
    @JsonSetter("double_sided")
    public void setDoubleSided(Boolean doubleSided) {
        this.doubleSided = doubleSided;
    }

    /**
     * Internal Getter for ExtraService.
     * Add an extra service to your letter. Can only be non-`null` if `mail_type` isn't
     * `usps_standard`. See &lt;a href="https://www.lob.com/pricing/print-mail#compare"
     * target="_blank"&gt;pricing&lt;/a&gt; for extra costs incurred. * `certified` - track and confirm
     * delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages
     * double-sided) is added to the beginning of your letter for address and barcode information.
     * See here for templates: &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf"
     * target="_blank"&gt;#10 envelope&lt;/a&gt; and &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf"
     * target="_blank"&gt;flat envelope&lt;/a&gt; (used for letters over 6 pages single-sided or 12 pages
     * double-sided). You will not be charged for this extra sheet. * `certified_return_receipt` -
     * request an electronic copy of the recipient's signature to prove delivery of your certified
     * letter * `registered` - provides tracking and confirmation for international addresses
     * @return Returns the Internal ExtraServiceEnum
     */
    @JsonGetter("extra_service")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<ExtraServiceEnum> internalGetExtraService() {
        return this.extraService;
    }

    /**
     * Getter for ExtraService.
     * Add an extra service to your letter. Can only be non-`null` if `mail_type` isn't
     * `usps_standard`. See &lt;a href="https://www.lob.com/pricing/print-mail#compare"
     * target="_blank"&gt;pricing&lt;/a&gt; for extra costs incurred. * `certified` - track and confirm
     * delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages
     * double-sided) is added to the beginning of your letter for address and barcode information.
     * See here for templates: &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf"
     * target="_blank"&gt;#10 envelope&lt;/a&gt; and &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf"
     * target="_blank"&gt;flat envelope&lt;/a&gt; (used for letters over 6 pages single-sided or 12 pages
     * double-sided). You will not be charged for this extra sheet. * `certified_return_receipt` -
     * request an electronic copy of the recipient's signature to prove delivery of your certified
     * letter * `registered` - provides tracking and confirmation for international addresses
     * @return Returns the ExtraServiceEnum
     */
    public ExtraServiceEnum getExtraService() {
        return OptionalNullable.getFrom(extraService);
    }

    /**
     * Setter for ExtraService.
     * Add an extra service to your letter. Can only be non-`null` if `mail_type` isn't
     * `usps_standard`. See &lt;a href="https://www.lob.com/pricing/print-mail#compare"
     * target="_blank"&gt;pricing&lt;/a&gt; for extra costs incurred. * `certified` - track and confirm
     * delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages
     * double-sided) is added to the beginning of your letter for address and barcode information.
     * See here for templates: &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf"
     * target="_blank"&gt;#10 envelope&lt;/a&gt; and &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf"
     * target="_blank"&gt;flat envelope&lt;/a&gt; (used for letters over 6 pages single-sided or 12 pages
     * double-sided). You will not be charged for this extra sheet. * `certified_return_receipt` -
     * request an electronic copy of the recipient's signature to prove delivery of your certified
     * letter * `registered` - provides tracking and confirmation for international addresses
     * @param extraService Value for ExtraServiceEnum
     */
    @JsonSetter("extra_service")
    public void setExtraService(ExtraServiceEnum extraService) {
        this.extraService = OptionalNullable.of(extraService);
    }

    /**
     * UnSetter for ExtraService.
     * Add an extra service to your letter. Can only be non-`null` if `mail_type` isn't
     * `usps_standard`. See &lt;a href="https://www.lob.com/pricing/print-mail#compare"
     * target="_blank"&gt;pricing&lt;/a&gt; for extra costs incurred. * `certified` - track and confirm
     * delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages
     * double-sided) is added to the beginning of your letter for address and barcode information.
     * See here for templates: &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf"
     * target="_blank"&gt;#10 envelope&lt;/a&gt; and &lt;a
     * href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf"
     * target="_blank"&gt;flat envelope&lt;/a&gt; (used for letters over 6 pages single-sided or 12 pages
     * double-sided). You will not be charged for this extra sheet. * `certified_return_receipt` -
     * request an electronic copy of the recipient's signature to prove delivery of your certified
     * letter * `registered` - provides tracking and confirmation for international addresses
     */
    public void unsetExtraService() {
        extraService = null;
    }

    /**
     * Getter for FileOriginalUrl.
     * The original URL of the `file` template.
     * @return Returns the String
     */
    @JsonGetter("file_original_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFileOriginalUrl() {
        return fileOriginalUrl;
    }

    /**
     * Setter for FileOriginalUrl.
     * The original URL of the `file` template.
     * @param fileOriginalUrl Value for String
     */
    @JsonSetter("file_original_url")
    public void setFileOriginalUrl(String fileOriginalUrl) {
        this.fileOriginalUrl = fileOriginalUrl;
    }

    /**
     * Getter for InsideOriginalUrl.
     * The original URL of the `inside` template.
     * @return Returns the String
     */
    @JsonGetter("inside_original_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInsideOriginalUrl() {
        return insideOriginalUrl;
    }

    /**
     * Setter for InsideOriginalUrl.
     * The original URL of the `inside` template.
     * @param insideOriginalUrl Value for String
     */
    @JsonSetter("inside_original_url")
    public void setInsideOriginalUrl(String insideOriginalUrl) {
        this.insideOriginalUrl = insideOriginalUrl;
    }

    /**
     * Getter for OutsideOriginalUrl.
     * The original URL of the `outside` template.
     * @return Returns the String
     */
    @JsonGetter("outside_original_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOutsideOriginalUrl() {
        return outsideOriginalUrl;
    }

    /**
     * Setter for OutsideOriginalUrl.
     * The original URL of the `outside` template.
     * @param outsideOriginalUrl Value for String
     */
    @JsonSetter("outside_original_url")
    public void setOutsideOriginalUrl(String outsideOriginalUrl) {
        this.outsideOriginalUrl = outsideOriginalUrl;
    }

    /**
     * Converts this Returned1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Returned1 [" + "mailType=" + mailType + ", size=" + size + ", frontOriginalUrl="
                + frontOriginalUrl + ", backOriginalUrl=" + backOriginalUrl + ", addressPlacement="
                + addressPlacement + ", buckslips=" + buckslips + ", cards=" + cards
                + ", customEnvelope=" + customEnvelope + ", color=" + color + ", doubleSided="
                + doubleSided + ", extraService=" + extraService + ", fileOriginalUrl="
                + fileOriginalUrl + ", insideOriginalUrl=" + insideOriginalUrl
                + ", outsideOriginalUrl=" + outsideOriginalUrl + "]";
    }

    /**
     * Builds a new {@link Returned1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Returned1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mailType(getMailType())
                .size(getSize())
                .frontOriginalUrl(getFrontOriginalUrl())
                .backOriginalUrl(getBackOriginalUrl())
                .addressPlacement(getAddressPlacement())
                .color(getColor())
                .doubleSided(getDoubleSided())
                .fileOriginalUrl(getFileOriginalUrl())
                .insideOriginalUrl(getInsideOriginalUrl())
                .outsideOriginalUrl(getOutsideOriginalUrl());
        builder.buckslips = internalGetBuckslips();
        builder.cards = internalGetCards();
        builder.customEnvelope = internalGetCustomEnvelope();
        builder.extraService = internalGetExtraService();
        return builder;
    }

    /**
     * Class to build instances of {@link Returned1}.
     */
    public static class Builder {
        private MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;
        private PostcardSizeEnum size = PostcardSizeEnum.ENUM_4X6;
        private String frontOriginalUrl;
        private String backOriginalUrl;
        private AddressPlacementEnum addressPlacement = AddressPlacementEnum.TOP_FIRST_PAGE;
        private OptionalNullable<List<String>> buckslips;
        private OptionalNullable<List<String>> cards;
        private OptionalNullable<CustomEnvelopeReturned> customEnvelope;
        private Boolean color;
        private Boolean doubleSided = true;
        private OptionalNullable<ExtraServiceEnum> extraService;
        private String fileOriginalUrl;
        private String insideOriginalUrl;
        private String outsideOriginalUrl;



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
         * Setter for size.
         * @param  size  PostcardSizeEnum value for size.
         * @return Builder
         */
        public Builder size(PostcardSizeEnum size) {
            this.size = size;
            return this;
        }

        /**
         * Setter for frontOriginalUrl.
         * @param  frontOriginalUrl  String value for frontOriginalUrl.
         * @return Builder
         */
        public Builder frontOriginalUrl(String frontOriginalUrl) {
            this.frontOriginalUrl = frontOriginalUrl;
            return this;
        }

        /**
         * Setter for backOriginalUrl.
         * @param  backOriginalUrl  String value for backOriginalUrl.
         * @return Builder
         */
        public Builder backOriginalUrl(String backOriginalUrl) {
            this.backOriginalUrl = backOriginalUrl;
            return this;
        }

        /**
         * Setter for addressPlacement.
         * @param  addressPlacement  AddressPlacementEnum value for addressPlacement.
         * @return Builder
         */
        public Builder addressPlacement(AddressPlacementEnum addressPlacement) {
            this.addressPlacement = addressPlacement;
            return this;
        }

        /**
         * Setter for buckslips.
         * @param  buckslips  List of String value for buckslips.
         * @return Builder
         */
        public Builder buckslips(List<String> buckslips) {
            this.buckslips = OptionalNullable.of(buckslips);
            return this;
        }

        /**
         * UnSetter for buckslips.
         * @return Builder
         */
        public Builder unsetBuckslips() {
            buckslips = null;
            return this;
        }

        /**
         * Setter for cards.
         * @param  cards  List of String value for cards.
         * @return Builder
         */
        public Builder cards(List<String> cards) {
            this.cards = OptionalNullable.of(cards);
            return this;
        }

        /**
         * UnSetter for cards.
         * @return Builder
         */
        public Builder unsetCards() {
            cards = null;
            return this;
        }

        /**
         * Setter for customEnvelope.
         * @param  customEnvelope  CustomEnvelopeReturned value for customEnvelope.
         * @return Builder
         */
        public Builder customEnvelope(CustomEnvelopeReturned customEnvelope) {
            this.customEnvelope = OptionalNullable.of(customEnvelope);
            return this;
        }

        /**
         * UnSetter for customEnvelope.
         * @return Builder
         */
        public Builder unsetCustomEnvelope() {
            customEnvelope = null;
            return this;
        }

        /**
         * Setter for color.
         * @param  color  Boolean value for color.
         * @return Builder
         */
        public Builder color(Boolean color) {
            this.color = color;
            return this;
        }

        /**
         * Setter for doubleSided.
         * @param  doubleSided  Boolean value for doubleSided.
         * @return Builder
         */
        public Builder doubleSided(Boolean doubleSided) {
            this.doubleSided = doubleSided;
            return this;
        }

        /**
         * Setter for extraService.
         * @param  extraService  ExtraServiceEnum value for extraService.
         * @return Builder
         */
        public Builder extraService(ExtraServiceEnum extraService) {
            this.extraService = OptionalNullable.of(extraService);
            return this;
        }

        /**
         * UnSetter for extraService.
         * @return Builder
         */
        public Builder unsetExtraService() {
            extraService = null;
            return this;
        }

        /**
         * Setter for fileOriginalUrl.
         * @param  fileOriginalUrl  String value for fileOriginalUrl.
         * @return Builder
         */
        public Builder fileOriginalUrl(String fileOriginalUrl) {
            this.fileOriginalUrl = fileOriginalUrl;
            return this;
        }

        /**
         * Setter for insideOriginalUrl.
         * @param  insideOriginalUrl  String value for insideOriginalUrl.
         * @return Builder
         */
        public Builder insideOriginalUrl(String insideOriginalUrl) {
            this.insideOriginalUrl = insideOriginalUrl;
            return this;
        }

        /**
         * Setter for outsideOriginalUrl.
         * @param  outsideOriginalUrl  String value for outsideOriginalUrl.
         * @return Builder
         */
        public Builder outsideOriginalUrl(String outsideOriginalUrl) {
            this.outsideOriginalUrl = outsideOriginalUrl;
            return this;
        }

        /**
         * Builds a new {@link Returned1} object using the set fields.
         * @return {@link Returned1}
         */
        public Returned1 build() {
            return new Returned1(mailType, size, frontOriginalUrl, backOriginalUrl,
                    addressPlacement, buckslips, cards, customEnvelope, color, doubleSided,
                    extraService, fileOriginalUrl, insideOriginalUrl, outsideOriginalUrl);
        }
    }
}
