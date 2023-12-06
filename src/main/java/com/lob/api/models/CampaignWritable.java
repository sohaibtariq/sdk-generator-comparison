/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.DateTimeHelper;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is a model class for CampaignWritable type.
 */
public class CampaignWritable {
    private OptionalNullable<String> billingGroupId;
    private String name;
    private OptionalNullable<String> description;
    private String scheduleType;
    private OptionalNullable<LocalDateTime> targetDeliveryDate;
    private OptionalNullable<LocalDateTime> sendDate;
    private OptionalNullable<Integer> cancelWindowCampaignMinutes;
    private Map<String, String> metadata;
    private CmpUseTypeEnum useType;
    private Boolean autoCancelIfNcoa;

    /**
     * Default constructor.
     */
    public CampaignWritable() {
        scheduleType = "immediate";
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  scheduleType  String value for scheduleType.
     * @param  useType  CmpUseTypeEnum value for useType.
     * @param  billingGroupId  String value for billingGroupId.
     * @param  description  String value for description.
     * @param  targetDeliveryDate  LocalDateTime value for targetDeliveryDate.
     * @param  sendDate  LocalDateTime value for sendDate.
     * @param  cancelWindowCampaignMinutes  Integer value for cancelWindowCampaignMinutes.
     * @param  metadata  Map of String, value for metadata.
     * @param  autoCancelIfNcoa  Boolean value for autoCancelIfNcoa.
     */
    public CampaignWritable(
            String name,
            String scheduleType,
            CmpUseTypeEnum useType,
            String billingGroupId,
            String description,
            LocalDateTime targetDeliveryDate,
            LocalDateTime sendDate,
            Integer cancelWindowCampaignMinutes,
            Map<String, String> metadata,
            Boolean autoCancelIfNcoa) {
        this.billingGroupId = OptionalNullable.of(billingGroupId);
        this.name = name;
        this.description = OptionalNullable.of(description);
        this.scheduleType = scheduleType;
        this.targetDeliveryDate = OptionalNullable.of(targetDeliveryDate);
        this.sendDate = OptionalNullable.of(sendDate);
        this.cancelWindowCampaignMinutes = OptionalNullable.of(cancelWindowCampaignMinutes);
        this.metadata = metadata;
        this.useType = useType;
        this.autoCancelIfNcoa = autoCancelIfNcoa;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  scheduleType  String value for scheduleType.
     * @param  useType  CmpUseTypeEnum value for useType.
     * @param  billingGroupId  String value for billingGroupId.
     * @param  description  String value for description.
     * @param  targetDeliveryDate  LocalDateTime value for targetDeliveryDate.
     * @param  sendDate  LocalDateTime value for sendDate.
     * @param  cancelWindowCampaignMinutes  Integer value for cancelWindowCampaignMinutes.
     * @param  metadata  Map of String, value for metadata.
     * @param  autoCancelIfNcoa  Boolean value for autoCancelIfNcoa.
     */

    protected CampaignWritable(String name, String scheduleType, CmpUseTypeEnum useType,
            OptionalNullable<String> billingGroupId, OptionalNullable<String> description,
            OptionalNullable<LocalDateTime> targetDeliveryDate,
            OptionalNullable<LocalDateTime> sendDate,
            OptionalNullable<Integer> cancelWindowCampaignMinutes, Map<String, String> metadata,
            Boolean autoCancelIfNcoa) {
        this.billingGroupId = billingGroupId;
        this.name = name;
        this.description = description;
        this.scheduleType = scheduleType;
        this.targetDeliveryDate = targetDeliveryDate;
        this.sendDate = sendDate;
        this.cancelWindowCampaignMinutes = cancelWindowCampaignMinutes;
        this.metadata = metadata;
        this.useType = useType;
        this.autoCancelIfNcoa = autoCancelIfNcoa;
    }

    /**
     * Internal Getter for BillingGroupId.
     * Unique identifier prefixed with `bg_`.
     * @return Returns the Internal String
     */
    @JsonGetter("billing_group_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingGroupId() {
        return this.billingGroupId;
    }

    /**
     * Getter for BillingGroupId.
     * Unique identifier prefixed with `bg_`.
     * @return Returns the String
     */
    public String getBillingGroupId() {
        return OptionalNullable.getFrom(billingGroupId);
    }

    /**
     * Setter for BillingGroupId.
     * Unique identifier prefixed with `bg_`.
     * @param billingGroupId Value for String
     */
    @JsonSetter("billing_group_id")
    public void setBillingGroupId(String billingGroupId) {
        this.billingGroupId = OptionalNullable.of(billingGroupId);
    }

    /**
     * UnSetter for BillingGroupId.
     * Unique identifier prefixed with `bg_`.
     */
    public void unsetBillingGroupId() {
        billingGroupId = null;
    }

    /**
     * Getter for Name.
     * Name of the campaign.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the campaign.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for ScheduleType.
     * How the campaign should be scheduled. Only value available today is `immediate`.
     * @return Returns the String
     */
    @JsonGetter("schedule_type")
    public String getScheduleType() {
        return scheduleType;
    }

    /**
     * Setter for ScheduleType.
     * How the campaign should be scheduled. Only value available today is `immediate`.
     * @param scheduleType Value for String
     */
    @JsonSetter("schedule_type")
    private void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    /**
     * Internal Getter for TargetDeliveryDate.
     * If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail
     * pieces in this campaign.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("target_delivery_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetTargetDeliveryDate() {
        return this.targetDeliveryDate;
    }

    /**
     * Getter for TargetDeliveryDate.
     * If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail
     * pieces in this campaign.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getTargetDeliveryDate() {
        return OptionalNullable.getFrom(targetDeliveryDate);
    }

    /**
     * Setter for TargetDeliveryDate.
     * If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail
     * pieces in this campaign.
     * @param targetDeliveryDate Value for LocalDateTime
     */
    @JsonSetter("target_delivery_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTargetDeliveryDate(LocalDateTime targetDeliveryDate) {
        this.targetDeliveryDate = OptionalNullable.of(targetDeliveryDate);
    }

    /**
     * UnSetter for TargetDeliveryDate.
     * If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail
     * pieces in this campaign.
     */
    public void unsetTargetDeliveryDate() {
        targetDeliveryDate = null;
    }

    /**
     * Internal Getter for SendDate.
     * If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("send_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetSendDate() {
        return this.sendDate;
    }

    /**
     * Getter for SendDate.
     * If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getSendDate() {
        return OptionalNullable.getFrom(sendDate);
    }

    /**
     * Setter for SendDate.
     * If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign.
     * @param sendDate Value for LocalDateTime
     */
    @JsonSetter("send_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = OptionalNullable.of(sendDate);
    }

    /**
     * UnSetter for SendDate.
     * If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign.
     */
    public void unsetSendDate() {
        sendDate = null;
    }

    /**
     * Internal Getter for CancelWindowCampaignMinutes.
     * A window, in minutes, within which the campaign can be canceled.
     * @return Returns the Internal Integer
     */
    @JsonGetter("cancel_window_campaign_minutes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCancelWindowCampaignMinutes() {
        return this.cancelWindowCampaignMinutes;
    }

    /**
     * Getter for CancelWindowCampaignMinutes.
     * A window, in minutes, within which the campaign can be canceled.
     * @return Returns the Integer
     */
    public Integer getCancelWindowCampaignMinutes() {
        return OptionalNullable.getFrom(cancelWindowCampaignMinutes);
    }

    /**
     * Setter for CancelWindowCampaignMinutes.
     * A window, in minutes, within which the campaign can be canceled.
     * @param cancelWindowCampaignMinutes Value for Integer
     */
    @JsonSetter("cancel_window_campaign_minutes")
    public void setCancelWindowCampaignMinutes(Integer cancelWindowCampaignMinutes) {
        this.cancelWindowCampaignMinutes = OptionalNullable.of(cancelWindowCampaignMinutes);
    }

    /**
     * UnSetter for CancelWindowCampaignMinutes.
     * A window, in minutes, within which the campaign can be canceled.
     */
    public void unsetCancelWindowCampaignMinutes() {
        cancelWindowCampaignMinutes = null;
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
     * Getter for UseType.
     * The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type
     * is only allowed if an account default use_type is selected in Account Settings. For more
     * information on use_type, see our [Help Center
     * article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type).
     * @return Returns the CmpUseTypeEnum
     */
    @JsonGetter("use_type")
    public CmpUseTypeEnum getUseType() {
        return useType;
    }

    /**
     * Setter for UseType.
     * The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type
     * is only allowed if an account default use_type is selected in Account Settings. For more
     * information on use_type, see our [Help Center
     * article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type).
     * @param useType Value for CmpUseTypeEnum
     */
    @JsonSetter("use_type")
    public void setUseType(CmpUseTypeEnum useType) {
        this.useType = useType;
    }

    /**
     * Getter for AutoCancelIfNcoa.
     * Whether or not a mail piece should be automatically canceled and not sent if the address is
     * updated via NCOA.
     * @return Returns the Boolean
     */
    @JsonGetter("auto_cancel_if_ncoa")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoCancelIfNcoa() {
        return autoCancelIfNcoa;
    }

    /**
     * Setter for AutoCancelIfNcoa.
     * Whether or not a mail piece should be automatically canceled and not sent if the address is
     * updated via NCOA.
     * @param autoCancelIfNcoa Value for Boolean
     */
    @JsonSetter("auto_cancel_if_ncoa")
    public void setAutoCancelIfNcoa(Boolean autoCancelIfNcoa) {
        this.autoCancelIfNcoa = autoCancelIfNcoa;
    }

    /**
     * Converts this CampaignWritable into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CampaignWritable [" + "name=" + name + ", scheduleType=" + scheduleType
                + ", useType=" + useType + ", billingGroupId=" + billingGroupId + ", description="
                + description + ", targetDeliveryDate=" + targetDeliveryDate + ", sendDate="
                + sendDate + ", cancelWindowCampaignMinutes=" + cancelWindowCampaignMinutes
                + ", metadata=" + metadata + ", autoCancelIfNcoa=" + autoCancelIfNcoa + "]";
    }

    /**
     * Builds a new {@link CampaignWritable.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CampaignWritable.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, scheduleType, useType)
                .metadata(getMetadata())
                .autoCancelIfNcoa(getAutoCancelIfNcoa());
        builder.billingGroupId = internalGetBillingGroupId();
        builder.description = internalGetDescription();
        builder.targetDeliveryDate = internalGetTargetDeliveryDate();
        builder.sendDate = internalGetSendDate();
        builder.cancelWindowCampaignMinutes = internalGetCancelWindowCampaignMinutes();
        return builder;
    }

    /**
     * Class to build instances of {@link CampaignWritable}.
     */
    public static class Builder {
        private String name;
        private String scheduleType = "immediate";
        private CmpUseTypeEnum useType;
        private OptionalNullable<String> billingGroupId;
        private OptionalNullable<String> description;
        private OptionalNullable<LocalDateTime> targetDeliveryDate;
        private OptionalNullable<LocalDateTime> sendDate;
        private OptionalNullable<Integer> cancelWindowCampaignMinutes;
        private Map<String, String> metadata;
        private Boolean autoCancelIfNcoa;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  scheduleType  String value for scheduleType.
         * @param  useType  CmpUseTypeEnum value for useType.
         */
        public Builder(String name, String scheduleType, CmpUseTypeEnum useType) {
            this.name = name;
            this.scheduleType = scheduleType;
            this.useType = useType;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for scheduleType.
         * @param  scheduleType  String value for scheduleType.
         * @return Builder
         */
        public Builder scheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * Setter for useType.
         * @param  useType  CmpUseTypeEnum value for useType.
         * @return Builder
         */
        public Builder useType(CmpUseTypeEnum useType) {
            this.useType = useType;
            return this;
        }

        /**
         * Setter for billingGroupId.
         * @param  billingGroupId  String value for billingGroupId.
         * @return Builder
         */
        public Builder billingGroupId(String billingGroupId) {
            this.billingGroupId = OptionalNullable.of(billingGroupId);
            return this;
        }

        /**
         * UnSetter for billingGroupId.
         * @return Builder
         */
        public Builder unsetBillingGroupId() {
            billingGroupId = null;
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
         * Setter for targetDeliveryDate.
         * @param  targetDeliveryDate  LocalDateTime value for targetDeliveryDate.
         * @return Builder
         */
        public Builder targetDeliveryDate(LocalDateTime targetDeliveryDate) {
            this.targetDeliveryDate = OptionalNullable.of(targetDeliveryDate);
            return this;
        }

        /**
         * UnSetter for targetDeliveryDate.
         * @return Builder
         */
        public Builder unsetTargetDeliveryDate() {
            targetDeliveryDate = null;
            return this;
        }

        /**
         * Setter for sendDate.
         * @param  sendDate  LocalDateTime value for sendDate.
         * @return Builder
         */
        public Builder sendDate(LocalDateTime sendDate) {
            this.sendDate = OptionalNullable.of(sendDate);
            return this;
        }

        /**
         * UnSetter for sendDate.
         * @return Builder
         */
        public Builder unsetSendDate() {
            sendDate = null;
            return this;
        }

        /**
         * Setter for cancelWindowCampaignMinutes.
         * @param  cancelWindowCampaignMinutes  Integer value for cancelWindowCampaignMinutes.
         * @return Builder
         */
        public Builder cancelWindowCampaignMinutes(Integer cancelWindowCampaignMinutes) {
            this.cancelWindowCampaignMinutes = OptionalNullable.of(cancelWindowCampaignMinutes);
            return this;
        }

        /**
         * UnSetter for cancelWindowCampaignMinutes.
         * @return Builder
         */
        public Builder unsetCancelWindowCampaignMinutes() {
            cancelWindowCampaignMinutes = null;
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
         * Setter for autoCancelIfNcoa.
         * @param  autoCancelIfNcoa  Boolean value for autoCancelIfNcoa.
         * @return Builder
         */
        public Builder autoCancelIfNcoa(Boolean autoCancelIfNcoa) {
            this.autoCancelIfNcoa = autoCancelIfNcoa;
            return this;
        }

        /**
         * Builds a new {@link CampaignWritable} object using the set fields.
         * @return {@link CampaignWritable}
         */
        public CampaignWritable build() {
            return new CampaignWritable(name, scheduleType, useType, billingGroupId, description,
                    targetDeliveryDate, sendDate, cancelWindowCampaignMinutes, metadata,
                    autoCancelIfNcoa);
        }
    }
}
