
# Postcard

## Structure

`Postcard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in <a href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10" target="_blank">our guide to using html and merge variables</a>. Depending on your <a href="https://dashboard.lob.com/#/settings/account" target="_blank">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | [`SendDate`](../../doc/models/containers/send-date.md) | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | SendDate getSendDate() | setSendDate(SendDate sendDate) |
| `Size` | [`PostcardSizeEnum`](../../doc/models/postcard-size-enum.md) | Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6` | PostcardSizeEnum getSize() | setSize(PostcardSizeEnum size) |
| `To` | [`Address`](../../doc/models/containers/address.md) | Required | - | Address getTo() | setTo(Address to) |
| `Carrier` | `String` | Required, Constant | **Default**: `"USPS"` | String getCarrier() | setCarrier(String carrier) |
| `Thumbnails` | [`List<Thumbnail>`](../../doc/models/thumbnail.md) | Optional | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `ExpectedDeliveryDate` | `LocalDate` | Optional | A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`. | LocalDate getExpectedDeliveryDate() | setExpectedDeliveryDate(LocalDate expectedDeliveryDate) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `From` | [`AddressUs`](../../doc/models/address-us.md) | Optional | - | AddressUs getFrom() | setFrom(AddressUs from) |
| `Id` | `String` | Required | Unique identifier prefixed with `psc_`.<br>**Constraints**: *Pattern*: `^psc_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `FrontTemplateId` | `String` | Required | The unique ID of the HTML template used for the front of the postcard. Only filled out when the request contains a valid postcard template ID.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` | String getFrontTemplateId() | setFrontTemplateId(String frontTemplateId) |
| `BackTemplateId` | `String` | Required | The unique ID of the HTML template used for the back of the postcard. Only filled out when the request contains a valid postcard template ID.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` | String getBackTemplateId() | setBackTemplateId(String backTemplateId) |
| `FrontTemplateVersionId` | `String` | Optional | The unique ID of the specific version of the HTML template used for the front of the postcard. Only filled out when the request contains a valid postcard template ID.<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` | String getFrontTemplateVersionId() | setFrontTemplateVersionId(String frontTemplateVersionId) |
| `BackTemplateVersionId` | `String` | Optional | The unique ID of the specific version of the HTML template used for the back of the postcard. Only filled out when the request contains a valid postcard template ID.<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` | String getBackTemplateVersionId() | setBackTemplateVersionId(String backTemplateVersionId) |
| `TrackingEvents` | [`List<TrackingEventNormal>`](../../doc/models/tracking-event-normal.md) | Optional | An array of tracking_event objects ordered by ascending `time`. Will not be populated for postcards created in test mode. | List<TrackingEventNormal> getTrackingEvents() | setTrackingEvents(List<TrackingEventNormal> trackingEvents) |
| `Url` | `String` | Required | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.<br>**Constraints**: *Pattern*: `^https://lob-assets\.com/(letters\|postcards\|bank-accounts\|checks\|self-mailers\|cards)/[a-z]{3,4}_[a-z0-9]{15,16}(\.pdf\|_thumb_[a-z]+_[0-9]+\.png)\?(version=[a-z0-9-]*&)?expires=[0-9]{10}&signature=[a-zA-Z0-9-_]+$` | String getUrl() | setUrl(String url) |
| `CampaignId` | `String` | Optional | The unique ID of the associated campaign if the resource was generated from a campaign. | String getCampaignId() | setCampaignId(String campaignId) |
| `UseType` | [`PscUseTypeEnum`](../../doc/models/psc-use-type-enum.md) | Optional | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). | PscUseTypeEnum getUseType() | setUseType(PscUseTypeEnum useType) |
| `Fsc` | `Boolean` | Optional | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `4x6` or `A5` postcard sizes.<br>**Default**: `false` | Boolean getFsc() | setFsc(Boolean fsc) |
| `Status` | [`TheStatusOfThePostcardEnum`](../../doc/models/the-status-of-the-postcard-enum.md) | Optional | - | TheStatusOfThePostcardEnum getStatus() | setStatus(TheStatusOfThePostcardEnum status) |
| `FailureReason` | `String` | Optional | A string describing the reason for failure if the postcard failed to render. | String getFailureReason() | setFailureReason(String failureReason) |
| `Object` | [`Object10Enum`](../../doc/models/object-10-enum.md) | Optional | Value is resource type.<br>**Default**: `Object10Enum.POSTCARD` | Object10Enum getObject() | setObject(Object10Enum object) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "size": "4x6",
  "to": {
    "date_created": "2016-03-13T12:52:32.123Z",
    "date_modified": "2016-03-13T12:52:32.123Z",
    "object": "address",
    "id": "id4",
    "name": "name4",
    "company": "company4",
    "address_line1": "address_line18",
    "address_city": "address_city4",
    "address_state": "address_state6",
    "address_zip": "address_zip6",
    "deleted": false,
    "description": "description4",
    "phone": "phone4",
    "email": "email2",
    "address_line2": "address_line26"
  },
  "carrier": "USPS",
  "id": "id4",
  "front_template_id": "front_template_id4",
  "back_template_id": "back_template_id4",
  "url": "url8",
  "fsc": false,
  "object": "postcard",
  "description": "description4",
  "metadata": {
    "key0": "metadata1"
  },
  "merge_variables": {
    "key1": "val1",
    "key2": "val2"
  },
  "send_date": "2016-03-13T12:52:32.123Z"
}
```

