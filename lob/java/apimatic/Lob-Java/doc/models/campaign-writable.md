
# Campaign Writable

## Structure

`CampaignWritable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingGroupId` | `String` | Optional | Unique identifier prefixed with `bg_`.<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |
| `Name` | `String` | Required | Name of the campaign. | String getName() | setName(String name) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `ScheduleType` | `String` | Required, Constant | How the campaign should be scheduled. Only value available today is `immediate`.<br>**Default**: `"immediate"` | String getScheduleType() | setScheduleType(String scheduleType) |
| `TargetDeliveryDate` | `LocalDateTime` | Optional | If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail pieces in this campaign. | LocalDateTime getTargetDeliveryDate() | setTargetDeliveryDate(LocalDateTime targetDeliveryDate) |
| `SendDate` | `LocalDateTime` | Optional | If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign. | LocalDateTime getSendDate() | setSendDate(LocalDateTime sendDate) |
| `CancelWindowCampaignMinutes` | `Integer` | Optional | A window, in minutes, within which the campaign can be canceled. | Integer getCancelWindowCampaignMinutes() | setCancelWindowCampaignMinutes(Integer cancelWindowCampaignMinutes) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `UseType` | [`CmpUseTypeEnum`](../../doc/models/cmp-use-type-enum.md) | Required | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). | CmpUseTypeEnum getUseType() | setUseType(CmpUseTypeEnum useType) |
| `AutoCancelIfNcoa` | `Boolean` | Optional | Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA. | Boolean getAutoCancelIfNcoa() | setAutoCancelIfNcoa(Boolean autoCancelIfNcoa) |

## Example (as JSON)

```json
{
  "name": "name8",
  "schedule_type": "immediate",
  "use_type": "marketing",
  "billing_group_id": "billing_group_id0",
  "description": "description8",
  "target_delivery_date": "2016-03-13T12:52:32.123Z",
  "send_date": "2016-03-13T12:52:32.123Z",
  "cancel_window_campaign_minutes": 58
}
```

