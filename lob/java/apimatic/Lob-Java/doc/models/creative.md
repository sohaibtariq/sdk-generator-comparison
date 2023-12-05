
# Creative

## Structure

`Creative`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `boolean` | Required | Only returned if the resource has been successfully deleted. | boolean getDeleted() | setDeleted(boolean deleted) |
| `Object` | `String` | Required, Constant | Value is resource type.<br>**Default**: `"creative"` | String getObject() | setObject(String object) |
| `ResourceType` | `String` | Required, Constant | Mailpiece type for the creative<br>**Default**: `"postcard"` | String getResourceType() | setResourceType(String resourceType) |
| `Details` | [`Returned1`](../../doc/models/returned-1.md) | Required | Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative. | Returned1 getDetails() | setDetails(Returned1 details) |
| `From` | [`CreativeFrom`](../../doc/models/containers/creative-from.md) | Required | This is a container for one-of cases. | CreativeFrom getFrom() | setFrom(CreativeFrom from) |
| `Description` | `String` | Required | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Required | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Id` | `String` | Required | Unique identifier prefixed with `crv_`.<br>**Constraints**: *Pattern*: `^crv_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `TemplatePreviewUrls` | `Object` | Required | Preview URLs associated with a creative's artwork asset(s) if the creative uses HTML templates as assets. An empty object will be returned if no `template_preview`s have been generated. | Object getTemplatePreviewUrls() | setTemplatePreviewUrls(Object templatePreviewUrls) |
| `TemplatePreviews` | `List<Object>` | Required | A list of template preview objects if the creative uses HTML template(s) as artwork asset(s). An empty array will be returned if no `template_preview`s have been generated for the creative. | List<Object> getTemplatePreviews() | setTemplatePreviews(List<Object> templatePreviews) |
| `Campaigns` | [`List<CampaignItem>`](../../doc/models/campaign-item.md) | Required | Array of campaigns associated with the creative ID | List<CampaignItem> getCampaigns() | setCampaigns(List<CampaignItem> campaigns) |

## Example (as JSON)

```json
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
    "key0": "metadata5",
    "key1": "metadata4"
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
    },
    {
      "key1": "val1",
      "key2": "val2"
    },
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
```

