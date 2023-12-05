
# Campaign

## Structure

`Campaign`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required, Constant | Value is resource type.<br>**Default**: `"campaign"` | String getObject() | setObject(String object) |
| `BillingGroupId` | `String` | Optional | Unique identifier prefixed with `bg_`.<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |
| `Name` | `String` | Required | Name of the campaign. | String getName() | setName(String name) |
| `Description` | `String` | Required | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `ScheduleType` | `String` | Required, Constant | How the campaign should be scheduled. Only value available today is `immediate`.<br>**Default**: `"immediate"` | String getScheduleType() | setScheduleType(String scheduleType) |
| `TargetDeliveryDate` | `LocalDateTime` | Optional | If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail pieces in this campaign. | LocalDateTime getTargetDeliveryDate() | setTargetDeliveryDate(LocalDateTime targetDeliveryDate) |
| `SendDate` | `LocalDateTime` | Optional | If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign. | LocalDateTime getSendDate() | setSendDate(LocalDateTime sendDate) |
| `CancelWindowCampaignMinutes` | `Integer` | Optional | A window, in minutes, within which the campaign can be canceled. | Integer getCancelWindowCampaignMinutes() | setCancelWindowCampaignMinutes(Integer cancelWindowCampaignMinutes) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `UseType` | [`CmpUseTypeEnum`](../../doc/models/cmp-use-type-enum.md) | Required | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). | CmpUseTypeEnum getUseType() | setUseType(CmpUseTypeEnum useType) |
| `AutoCancelIfNcoa` | `boolean` | Required | Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA. | boolean getAutoCancelIfNcoa() | setAutoCancelIfNcoa(boolean autoCancelIfNcoa) |
| `Id` | `String` | Required | Unique identifier prefixed with `cmp_`.<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `IsDraft` | `boolean` | Required | Whether or not the campaign is still a draft.<br>**Default**: `true` | boolean getIsDraft() | setIsDraft(boolean isDraft) |
| `Creatives` | [`List<Creative>`](../../doc/models/creative.md) | Required | An array of creatives that have been associated with this campaign.<br>**Constraints**: *Minimum Items*: `0` | List<Creative> getCreatives() | setCreatives(List<Creative> creatives) |
| `Uploads` | [`List<Upload>`](../../doc/models/upload.md) | Required | A single-element array containing the upload object that is assocated with this campaign.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1` | List<Upload> getUploads() | setUploads(List<Upload> uploads) |

## Example (as JSON)

```json
{
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "object": "campaign",
  "name": "name8",
  "description": "description8",
  "schedule_type": "immediate",
  "use_type": "marketing",
  "auto_cancel_if_ncoa": false,
  "id": "id8",
  "is_draft": true,
  "creatives": [
    {
      "date_created": "2016-03-13T12:52:32.123Z",
      "date_modified": "2016-03-13T12:52:32.123Z",
      "deleted": false,
      "object": "creative",
      "resource_type": "postcard",
      "details": {
        "mail_type": "usps_first_class",
        "size": "4x6",
        "address_placement": "top_first_page",
        "double_sided": true,
        "front_original_url": "front_original_url4",
        "back_original_url": "back_original_url6"
      },
      "from": "String5",
      "description": "description8",
      "metadata": {
        "key0": "metadata5"
      },
      "id": "crv_2a3b096c409b32c",
      "template_preview_urls": {
        "key1": "val1",
        "key2": "val2"
      },
      "template_previews": [
        {
          "key1": "val1",
          "key2": "val2"
        }
      ],
      "campaigns": [
        {
          "id": "cmp_ed76e33e7ac4d0bd",
          "name": "My postman Campaign 2",
          "description": "Created via postman again",
          "schedule_type": "immediate",
          "send_date": "2016-03-13T12:52:32.123Z",
          "target_delivery_date": "2016-03-13T12:52:32.123Z",
          "cancel_window_campaign_minutes": 124,
          "metadata": {},
          "use_type": "marketing",
          "is_draft": true,
          "deleted": false,
          "creatives": [],
          "uploads": [],
          "auto_cancel_if_ncoa": false,
          "date_created": "2022-07-26T20:20:25.016Z",
          "date_modified": "2022-07-26T20:20:25.016Z",
          "object": "campaign",
          "billing_group_id": "billing_group_id8"
        }
      ]
    }
  ],
  "uploads": [
    {
      "campaignId": "campaignId8",
      "requiredAddressColumnMapping": {
        "name": "recipient_name",
        "address_line1": "primary_line",
        "address_city": "city",
        "address_state": "state",
        "address_zip": "zip_code"
      },
      "optionalAddressColumnMapping": {
        "address_line2": "secondary_line",
        "company": "company",
        "address_country": "country,"
      },
      "metadata": {
        "columns": [
          "recipient_name"
        ]
      },
      "mergeVariableColumnMapping": {
        "name": "recipient_name",
        "gift_code": "code"
      },
      "id": "id2",
      "accountId": "fa9ea650fc7b31a89f92",
      "mode": "test",
      "failuresUrl": "https://www.example.com",
      "originalFilename": "my_audience.csv",
      "state": "Draft",
      "totalMailpieces": 100,
      "failedMailpieces": 5,
      "validatedMailpieces": 95,
      "bytesProcessed": 17268,
      "dateCreated": "2016-03-13T12:52:32.123Z",
      "dateModified": "2016-03-13T12:52:32.123Z"
    }
  ],
  "deleted": false,
  "billing_group_id": "billing_group_id0",
  "target_delivery_date": "2016-03-13T12:52:32.123Z",
  "send_date": "2016-03-13T12:52:32.123Z",
  "cancel_window_campaign_minutes": 38
}
```

