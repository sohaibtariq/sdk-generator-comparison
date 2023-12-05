# Campaigns

The campaigns endpoint allows you to create and view campaigns that can be used to send multiple letters or postcards.
The API provides endpoints for creating campaigns, updating campaigns, retrieving individual campaigns, listing campaigns, and deleting
campaigns.

```java
CampaignsController campaignsController = client.getCampaignsController();
```

## Class Name

`CampaignsController`

## Methods

* [Campaigns List](../../doc/controllers/campaigns.md#campaigns-list)
* [Campaign Create](../../doc/controllers/campaigns.md#campaign-create)
* [Campaign Retrieve](../../doc/controllers/campaigns.md#campaign-retrieve)
* [Campaign Update](../../doc/controllers/campaigns.md#campaign-update)
* [Campaign Delete](../../doc/controllers/campaigns.md#campaign-delete)
* [Campaign Send](../../doc/controllers/campaigns.md#campaign-send)


# Campaigns List

Returns a list of your campaigns. The campaigns are returned sorted by creation date, with the most recently created campaigns appearing first.

```java
CompletableFuture<AllCampaigns> campaignsListAsync(
    final Integer limit,
    final List<String> include,
    final BeforeAfter beforeAfter)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |
| `beforeAfter` | [`BeforeAfter`](../../doc/models/before-after.md) | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |

## Response Type

[`AllCampaigns`](../../doc/models/all-campaigns.md)

## Example Usage

```java
Integer limit = 10;
campaignsController.campaignsListAsync(limit, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": [
    {
      "id": "cmp_e05ee61ff80764b",
      "billing_group_id": "bg_fe3079dcdd80e5ae",
      "name": "My Campaign",
      "description": "My Campaign's description",
      "schedule_type": "immediate",
      "send_date": null,
      "target_delivery_date": null,
      "cancel_window_campaign_minutes": 60,
      "metadata": {},
      "use_type": "marketing",
      "is_draft": true,
      "deleted": false,
      "creatives": [],
      "uploads": [],
      "auto_cancel_if_ncoa": false,
      "date_created": "2017-09-05T17:47:53.767Z",
      "date_modified": "2017-09-05T17:47:53.767Z",
      "object": "campaign"
    }
  ],
  "object": "list",
  "previous_url": null,
  "next_url": null,
  "count": 1
}
```


# Campaign Create

Creates a new campaign with the provided properties. See how to launch your first campaign [here](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).

```java
CompletableFuture<Campaign> campaignCreateAsync(
    final String name,
    final CmpScheduleTypeEnum scheduleType,
    final CmpUseTypeEnum useType,
    final XLangOutputEnum xLangOutput,
    final String billingGroupId,
    final String description,
    final LocalDateTime targetDeliveryDate,
    final LocalDateTime sendDate,
    final Integer cancelWindowCampaignMinutes,
    final Map<String, String> metadata,
    final Boolean autoCancelIfNcoa)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Form, Required | Name of the campaign. |
| `scheduleType` | [`CmpScheduleTypeEnum`](../../doc/models/cmp-schedule-type-enum.md) | Form, Required | How the campaign should be scheduled. Only value available today is `immediate`. |
| `useType` | [`CmpUseTypeEnum`](../../doc/models/cmp-use-type-enum.md) | Form, Required | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). |
| `xLangOutput` | [`XLangOutputEnum`](../../doc/models/x-lang-output-enum.md) | Header, Optional | * `native` - Translate response to the native language of the country in the request<br>* `match` - match the response to the language in the request<br><br>Default response is in English. |
| `billingGroupId` | `String` | Form, Optional | Unique identifier prefixed with `bg_`.<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `targetDeliveryDate` | `LocalDateTime` | Form, Optional | If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail pieces in this campaign. |
| `sendDate` | `LocalDateTime` | Form, Optional | If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign. |
| `cancelWindowCampaignMinutes` | `Integer` | Form, Optional | A window, in minutes, within which the campaign can be canceled. |
| `metadata` | `Map<String, String>` | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |
| `autoCancelIfNcoa` | `Boolean` | Form, Optional | Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA. |

## Response Type

[`Campaign`](../../doc/models/campaign.md)

## Example Usage

```java
String name = "My Demo Campaign";
CmpScheduleTypeEnum scheduleType = CmpScheduleTypeEnum.IMMEDIATE;
CmpUseTypeEnum useType = CmpUseTypeEnum.MARKETING;
String description = "My Campaign's description";

campaignsController.campaignCreateAsync(name, scheduleType, useType, null, null, description, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "cmp_e05ee61ff80764b",
  "billing_group_id": "bg_fe3079dcdd80e5ae",
  "name": "My Campaign",
  "description": "My Campaign's description",
  "schedule_type": "immediate",
  "cancel_window_campaign_minutes": 60,
  "metadata": {},
  "use_type": "marketing",
  "is_draft": true,
  "deleted": false,
  "creatives": [],
  "uploads": [],
  "auto_cancel_if_ncoa": false,
  "date_created": "2017-09-05T17:47:53.767Z",
  "date_modified": "2017-09-05T17:47:53.767Z",
  "object": "campaign"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Campaign Retrieve

Retrieves the details of an existing campaign. You need only supply the unique campaign identifier that was returned upon campaign creation.

```java
CompletableFuture<Campaign> campaignRetrieveAsync(
    final String cmpId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cmpId` | `String` | Template, Required | id of the campaign<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` |

## Response Type

[`Campaign`](../../doc/models/campaign.md)

## Example Usage

```java
String cmpId = "cmp_id0";

campaignsController.campaignRetrieveAsync(cmpId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "cmp_e05ee61ff80764b",
  "billing_group_id": "bg_fe3079dcdd80e5ae",
  "name": "My Campaign",
  "description": "My Campaign's description",
  "schedule_type": "immediate",
  "cancel_window_campaign_minutes": 60,
  "metadata": {},
  "use_type": "marketing",
  "is_draft": true,
  "deleted": false,
  "creatives": [],
  "uploads": [],
  "auto_cancel_if_ncoa": false,
  "date_created": "2017-09-05T17:47:53.767Z",
  "date_modified": "2017-09-05T17:47:53.767Z",
  "object": "campaign"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Campaign Update

Update the details of an existing campaign. You need only supply the unique identifier that was returned upon campaign creation.

```java
CompletableFuture<Campaign> campaignUpdateAsync(
    final String cmpId,
    final String name,
    final String description,
    final CmpScheduleTypeEnum scheduleType,
    final LocalDateTime targetDeliveryDate,
    final LocalDateTime sendDate,
    final Integer cancelWindowCampaignMinutes,
    final Map<String, String> metadata,
    final Boolean isDraft,
    final CmpUseTypeEnum useType,
    final Boolean autoCancelIfNcoa)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cmpId` | `String` | Template, Required | id of the campaign<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` |
| `name` | `String` | Form, Optional | - |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `scheduleType` | [`CmpScheduleTypeEnum`](../../doc/models/cmp-schedule-type-enum.md) | Form, Optional | How the campaign should be scheduled. Only value available today is `immediate`. |
| `targetDeliveryDate` | `LocalDateTime` | Form, Optional | If `schedule_type` is `target_delivery_date`, provide a targeted delivery date for mail pieces in this campaign. |
| `sendDate` | `LocalDateTime` | Form, Optional | If `schedule_type` is `scheduled_send_date`, provide a date to send this campaign. |
| `cancelWindowCampaignMinutes` | `Integer` | Form, Optional | A window, in minutes, within which the campaign can be canceled. |
| `metadata` | `Map<String, String>` | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |
| `isDraft` | `Boolean` | Form, Optional | Whether or not the campaign is still a draft. Can either be excluded or `false`. |
| `useType` | [`CmpUseTypeEnum`](../../doc/models/cmp-use-type-enum.md) | Form, Optional | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). |
| `autoCancelIfNcoa` | `Boolean` | Form, Optional | Whether or not a mail piece should be automatically canceled and not sent if the address is updated via NCOA. |

## Response Type

[`Campaign`](../../doc/models/campaign.md)

## Example Usage

```java
String cmpId = "cmp_id0";
String description = "Test campaign";

campaignsController.campaignUpdateAsync(cmpId, null, description, null, null, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "cmp_e05ee61ff80764b",
  "billing_group_id": "bg_fe3079dcdd80e5ae",
  "name": "My Campaign",
  "description": "My Campaign's description",
  "schedule_type": "immediate",
  "cancel_window_campaign_minutes": 60,
  "metadata": {},
  "use_type": "marketing",
  "is_draft": true,
  "deleted": false,
  "creatives": [],
  "uploads": [],
  "auto_cancel_if_ncoa": false,
  "date_created": "2017-09-05T17:47:53.767Z",
  "date_modified": "2017-09-05T17:47:53.767Z",
  "object": "campaign"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Campaign Delete

Delete an existing campaign. You need only supply the unique identifier that was returned upon campaign creation. Deleting a campaign also deletes any associated mail pieces that have been created but not sent. A campaign's `send_date` matches its associated mail pieces' `send_date`s.

```java
CompletableFuture<CampaignDeleted> campaignDeleteAsync(
    final String cmpId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cmpId` | `String` | Template, Required | id of the campaign<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` |

## Response Type

[`CampaignDeleted`](../../doc/models/campaign-deleted.md)

## Example Usage

```java
String cmpId = "cmp_id0";

campaignsController.campaignDeleteAsync(cmpId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "cmp_e05ee61ff80764b",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Campaign Send

Sends a campaign. You need only supply the unique campaign identifier that was returned upon campaign creation.

```java
CompletableFuture<Campaign> campaignSendAsync(
    final String cmpId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cmpId` | `String` | Template, Required | id of the campaign<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` |

## Response Type

[`Campaign`](../../doc/models/campaign.md)

## Example Usage

```java
String cmpId = "cmp_id0";

campaignsController.campaignSendAsync(cmpId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "cmp_e05ee61ff80764b",
  "billing_group_id": "bg_fe3079dcdd80e5ae",
  "name": "My Campaign",
  "description": "My Campaign's description",
  "schedule_type": "immediate",
  "cancel_window_campaign_minutes": 60,
  "metadata": {},
  "use_type": "marketing",
  "is_draft": true,
  "deleted": false,
  "creatives": [],
  "uploads": [],
  "auto_cancel_if_ncoa": false,
  "date_created": "2017-09-05T17:47:53.767Z",
  "date_modified": "2017-09-05T17:47:53.767Z",
  "object": "campaign"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

