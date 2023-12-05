/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Writable type.
 */
public class Writable {
    private MailTypeEnum mailType;
    private PostcardSizeEnum size;
    private QrCodeCampaigns qrCode;

    /**
     * Default constructor.
     */
    public Writable() {
        mailType = MailTypeEnum.USPS_FIRST_CLASS;
        size = PostcardSizeEnum.ENUM_4X6;
    }

    /**
     * Initialization constructor.
     * @param  mailType  MailTypeEnum value for mailType.
     * @param  size  PostcardSizeEnum value for size.
     * @param  qrCode  QrCodeCampaigns value for qrCode.
     */
    public Writable(
            MailTypeEnum mailType,
            PostcardSizeEnum size,
            QrCodeCampaigns qrCode) {
        this.mailType = mailType;
        this.size = size;
        this.qrCode = qrCode;
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
     * Getter for QrCode.
     * Customize and place a QR code on all the postcards, letters or self mailers in a campaign.
     * Redirect URLs can either be unique for each recipient, or a single link can be used for the
     * whole campaign. See `redirect_url` attribute below for more details.
     * @return Returns the QrCodeCampaigns
     */
    @JsonGetter("qr_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public QrCodeCampaigns getQrCode() {
        return qrCode;
    }

    /**
     * Setter for QrCode.
     * Customize and place a QR code on all the postcards, letters or self mailers in a campaign.
     * Redirect URLs can either be unique for each recipient, or a single link can be used for the
     * whole campaign. See `redirect_url` attribute below for more details.
     * @param qrCode Value for QrCodeCampaigns
     */
    @JsonSetter("qr_code")
    public void setQrCode(QrCodeCampaigns qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * Converts this Writable into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Writable [" + "mailType=" + mailType + ", size=" + size + ", qrCode=" + qrCode
                + "]";
    }

    /**
     * Builds a new {@link Writable.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Writable.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .mailType(getMailType())
                .size(getSize())
                .qrCode(getQrCode());
        return builder;
    }

    /**
     * Class to build instances of {@link Writable}.
     */
    public static class Builder {
        private MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;
        private PostcardSizeEnum size = PostcardSizeEnum.ENUM_4X6;
        private QrCodeCampaigns qrCode;



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
         * Setter for qrCode.
         * @param  qrCode  QrCodeCampaigns value for qrCode.
         * @return Builder
         */
        public Builder qrCode(QrCodeCampaigns qrCode) {
            this.qrCode = qrCode;
            return this;
        }

        /**
         * Builds a new {@link Writable} object using the set fields.
         * @return {@link Writable}
         */
        public Writable build() {
            return new Writable(mailType, size, qrCode);
        }
    }
}
