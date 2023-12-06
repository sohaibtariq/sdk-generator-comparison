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
import java.util.List;
import java.util.Map;

/**
 * This is a model class for Campaign type.
 */
public class Campaign {
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;
    private Boolean deleted;
    private String object;
    private OptionalNullable<String> billingGroupId;
    private String name;
    private String description;
    private String scheduleType;
    private OptionalNullable<LocalDateTime> targetDeliveryDate;
    private OptionalNullable<LocalDateTime> sendDate;
    private OptionalNullable<Integer> cancelWindowCampaignMinutes;
    private Map<String, String> metadata;
    private CmpUseTypeEnum useType;
    private boolean autoCancelIfNcoa;
    private String id;
    private boolean isDraft;
    private List<Creative> creatives;
    private List<Upload> uploads;

    /**
     * Default constructor.
     */
    public Campaign() {
        object = "campaign";
        scheduleType = "immediate";
        isDraft = true;
    }

    /**
     * Initialization constructor.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  scheduleType  String value for scheduleType.
     * @param  useType  CmpUseTypeEnum value for useType.
     * @param  autoCancelIfNcoa  boolean value for autoCancelIfNcoa.
     * @param  id  String value for id.
     * @param  isDraft  boolean value for isDraft.
     * @param  creatives  List of Creative value for creatives.
     * @param  uploads  List of Upload value for uploads.
     * @param  deleted  Boolean value for deleted.
     * @param  billingGroupId  String value for billingGroupId.
     * @param  targetDeliveryDate  LocalDateTime value for targetDeliveryDate.
     * @param  sendDate  LocalDateTime value for sendDate.
     * @param  cancelWindowCampaignMinutes  Integer value for cancelWindowCampaignMinutes.
     * @param  metadata  Map of String, value for metadata.
     */
    public Campaign(
            LocalDateTime dateCreated,
            LocalDateTime dateModified,
            String object,
            String name,
            String description,
            String scheduleType,
            CmpUseTypeEnum useType,
            boolean autoCancelIfNcoa,
            String id,
            boolean isDraft,
            List<Creative> creatives,
            List<Upload> uploads,
            Boolean deleted,
            String billingGroupId,
            LocalDateTime targetDeliveryDate,
            LocalDateTime sendDate,
            Integer cancelWindowCampaignMinutes,
            Map<String, String> metadata) {
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.deleted = deleted;
        this.object = object;
        this.billingGroupId = OptionalNullable.of(billingGroupId);
        this.name = name;
        this.description = description;
        this.scheduleType = scheduleType;
        this.targetDeliveryDate = OptionalNullable.of(targetDeliveryDate);
        this.sendDate = OptionalNullable.of(sendDate);
        this.cancelWindowCampaignMinutes = OptionalNullable.of(cancelWindowCampaignMinutes);
        this.metadata = metadata;
        this.useType = useType;
        this.autoCancelIfNcoa = autoCancelIfNcoa;
        this.id = id;
        this.isDraft = isDraft;
        this.creatives = creatives;
        this.uploads = uploads;
    }

    /**
     * Initialization constructor.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  scheduleType  String value for scheduleType.
     * @param  useType  CmpUseTypeEnum value for useType.
     * @param  autoCancelIfNcoa  boolean value for autoCancelIfNcoa.
     * @param  id  String value for id.
     * @param  isDraft  boolean value for isDraft.
     * @param  creatives  List of Creative value for creatives.
     * @param  uploads  List of Upload value for uploads.
     * @param  deleted  Boolean value for deleted.
     * @param  billingGroupId  String value for billingGroupId.
     * @param  targetDeliveryDate  LocalDateTime value for targetDeliveryDate.
     * @param  sendDate  LocalDateTime value for sendDate.
     * @param  cancelWindowCampaignMinutes  Integer value for cancelWindowCampaignMinutes.
     * @param  metadata  Map of String, value for metadata.
     */

    protected Campaign(LocalDateTime dateCreated, LocalDateTime dateModified, String object,
            String name, String description, String scheduleType, CmpUseTypeEnum useType,
            boolean autoCancelIfNcoa, String id, boolean isDraft, List<Creative> creatives,
            List<Upload> uploads, Boolean deleted, OptionalNullable<String> billingGroupId,
            OptionalNullable<LocalDateTime> targetDeliveryDate,
            OptionalNullable<LocalDateTime> sendDate,
            OptionalNullable<Integer> cancelWindowCampaignMinutes, Map<String, String> metadata) {
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.deleted = deleted;
        this.object = object;
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
        this.id = id;
        this.isDraft = isDraft;
        this.creatives = creatives;
        this.uploads = uploads;
    }

    /**
     * Getter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_created")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    /**
     * Setter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @param dateCreated Value for LocalDateTime
     */
    @JsonSetter("date_created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Getter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_modified")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateModified() {
        return dateModified;
    }

    /**
     * Setter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @param dateModified Value for LocalDateTime
     */
    @JsonSetter("date_modified")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * Getter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @return Returns the Boolean
     */
    @JsonGetter("deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @param deleted Value for Boolean
     */
    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Getter for Object.
     * Value is resource type.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * Value is resource type.
     * @param object Value for String
     */
    @JsonSetter("object")
    private void setObject(String object) {
        this.object = object;
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
     * Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
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
     * @return Returns the boolean
     */
    @JsonGetter("auto_cancel_if_ncoa")
    public boolean getAutoCancelIfNcoa() {
        return autoCancelIfNcoa;
    }

    /**
     * Setter for AutoCancelIfNcoa.
     * Whether or not a mail piece should be automatically canceled and not sent if the address is
     * updated via NCOA.
     * @param autoCancelIfNcoa Value for boolean
     */
    @JsonSetter("auto_cancel_if_ncoa")
    public void setAutoCancelIfNcoa(boolean autoCancelIfNcoa) {
        this.autoCancelIfNcoa = autoCancelIfNcoa;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `cmp_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `cmp_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for IsDraft.
     * Whether or not the campaign is still a draft.
     * @return Returns the boolean
     */
    @JsonGetter("is_draft")
    public boolean getIsDraft() {
        return isDraft;
    }

    /**
     * Setter for IsDraft.
     * Whether or not the campaign is still a draft.
     * @param isDraft Value for boolean
     */
    @JsonSetter("is_draft")
    public void setIsDraft(boolean isDraft) {
        this.isDraft = isDraft;
    }

    /**
     * Getter for Creatives.
     * An array of creatives that have been associated with this campaign.
     * @return Returns the List of Creative
     */
    @JsonGetter("creatives")
    public List<Creative> getCreatives() {
        return creatives;
    }

    /**
     * Setter for Creatives.
     * An array of creatives that have been associated with this campaign.
     * @param creatives Value for List of Creative
     */
    @JsonSetter("creatives")
    public void setCreatives(List<Creative> creatives) {
        this.creatives = creatives;
    }

    /**
     * Getter for Uploads.
     * A single-element array containing the upload object that is assocated with this campaign.
     * @return Returns the List of Upload
     */
    @JsonGetter("uploads")
    public List<Upload> getUploads() {
        return uploads;
    }

    /**
     * Setter for Uploads.
     * A single-element array containing the upload object that is assocated with this campaign.
     * @param uploads Value for List of Upload
     */
    @JsonSetter("uploads")
    public void setUploads(List<Upload> uploads) {
        this.uploads = uploads;
    }

    /**
     * Converts this Campaign into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Campaign [" + "dateCreated=" + dateCreated + ", dateModified=" + dateModified
                + ", object=" + object + ", name=" + name + ", description=" + description
                + ", scheduleType=" + scheduleType + ", useType=" + useType + ", autoCancelIfNcoa="
                + autoCancelIfNcoa + ", id=" + id + ", isDraft=" + isDraft + ", creatives="
                + creatives + ", uploads=" + uploads + ", deleted=" + deleted + ", billingGroupId="
                + billingGroupId + ", targetDeliveryDate=" + targetDeliveryDate + ", sendDate="
                + sendDate + ", cancelWindowCampaignMinutes=" + cancelWindowCampaignMinutes
                + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link Campaign.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Campaign.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dateCreated, dateModified, object, name, description,
                scheduleType, useType, autoCancelIfNcoa, id, isDraft, creatives, uploads)
                .deleted(getDeleted())
                .metadata(getMetadata());
        builder.billingGroupId = internalGetBillingGroupId();
        builder.targetDeliveryDate = internalGetTargetDeliveryDate();
        builder.sendDate = internalGetSendDate();
        builder.cancelWindowCampaignMinutes = internalGetCancelWindowCampaignMinutes();
        return builder;
    }

    /**
     * Class to build instances of {@link Campaign}.
     */
    public static class Builder {
        private LocalDateTime dateCreated;
        private LocalDateTime dateModified;
        private String object = "campaign";
        private String name;
        private String description;
        private String scheduleType = "immediate";
        private CmpUseTypeEnum useType;
        private boolean autoCancelIfNcoa;
        private String id;
        private boolean isDraft = true;
        private List<Creative> creatives;
        private List<Upload> uploads;
        private Boolean deleted;
        private OptionalNullable<String> billingGroupId;
        private OptionalNullable<LocalDateTime> targetDeliveryDate;
        private OptionalNullable<LocalDateTime> sendDate;
        private OptionalNullable<Integer> cancelWindowCampaignMinutes;
        private Map<String, String> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @param  object  String value for object.
         * @param  name  String value for name.
         * @param  description  String value for description.
         * @param  scheduleType  String value for scheduleType.
         * @param  useType  CmpUseTypeEnum value for useType.
         * @param  autoCancelIfNcoa  boolean value for autoCancelIfNcoa.
         * @param  id  String value for id.
         * @param  isDraft  boolean value for isDraft.
         * @param  creatives  List of Creative value for creatives.
         * @param  uploads  List of Upload value for uploads.
         */
        public Builder(LocalDateTime dateCreated, LocalDateTime dateModified, String object,
                String name, String description, String scheduleType, CmpUseTypeEnum useType,
                boolean autoCancelIfNcoa, String id, boolean isDraft, List<Creative> creatives,
                List<Upload> uploads) {
            this.dateCreated = dateCreated;
            this.dateModified = dateModified;
            this.object = object;
            this.name = name;
            this.description = description;
            this.scheduleType = scheduleType;
            this.useType = useType;
            this.autoCancelIfNcoa = autoCancelIfNcoa;
            this.id = id;
            this.isDraft = isDraft;
            this.creatives = creatives;
            this.uploads = uploads;
        }

        /**
         * Setter for dateCreated.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @return Builder
         */
        public Builder dateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * Setter for dateModified.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @return Builder
         */
        public Builder dateModified(LocalDateTime dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
            return this;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for autoCancelIfNcoa.
         * @param  autoCancelIfNcoa  boolean value for autoCancelIfNcoa.
         * @return Builder
         */
        public Builder autoCancelIfNcoa(boolean autoCancelIfNcoa) {
            this.autoCancelIfNcoa = autoCancelIfNcoa;
            return this;
        }

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
         * Setter for isDraft.
         * @param  isDraft  boolean value for isDraft.
         * @return Builder
         */
        public Builder isDraft(boolean isDraft) {
            this.isDraft = isDraft;
            return this;
        }

        /**
         * Setter for creatives.
         * @param  creatives  List of Creative value for creatives.
         * @return Builder
         */
        public Builder creatives(List<Creative> creatives) {
            this.creatives = creatives;
            return this;
        }

        /**
         * Setter for uploads.
         * @param  uploads  List of Upload value for uploads.
         * @return Builder
         */
        public Builder uploads(List<Upload> uploads) {
            this.uploads = uploads;
            return this;
        }

        /**
         * Setter for deleted.
         * @param  deleted  Boolean value for deleted.
         * @return Builder
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
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
         * Builds a new {@link Campaign} object using the set fields.
         * @return {@link Campaign}
         */
        public Campaign build() {
            return new Campaign(dateCreated, dateModified, object, name, description, scheduleType,
                    useType, autoCancelIfNcoa, id, isDraft, creatives, uploads, deleted,
                    billingGroupId, targetDeliveryDate, sendDate, cancelWindowCampaignMinutes,
                    metadata);
        }
    }
}
