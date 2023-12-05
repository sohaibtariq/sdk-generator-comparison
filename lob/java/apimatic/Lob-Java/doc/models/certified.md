
# Certified

## Structure

`Certified`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExtraService` | [`ExtraService1Enum`](../../doc/models/extra-service-1-enum.md) | Required | Add an extra service to your letter. See <a href="https://www.lob.com/pricing/print-mail#compare" target="_blank">pricing</a> for extra costs incurred.<br><br>* `certified` - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf" target="_blank">#10 envelope</a> and <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf" target="_blank">flat envelope</a> (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.<br>* `certified_return_receipt` - request an electronic copy of the recipient's signature to prove delivery of your certified letter | ExtraService1Enum getExtraService() | setExtraService(ExtraService1Enum extraService) |
| `TrackingNumber` | `String` | Optional | The tracking number will be here immediately upon creation.<br>Dummy tracking numbers are created in test mode. | String getTrackingNumber() | setTrackingNumber(String trackingNumber) |
| `TrackingEvents` | [`List<TrackingEventCertified>`](../../doc/models/tracking-event-certified.md) | Required | An array of certified tracking events ordered by ascending `time`. Not populated in test mode. | List<TrackingEventCertified> getTrackingEvents() | setTrackingEvents(List<TrackingEventCertified> trackingEvents) |
| `ReturnAddress` | [`ReturnAddress`](../../doc/models/containers/return-address.md) | Optional | Specifies the address the return envelope will be sent back to. This is an optional argument that is available if an account is signed up for the return envelope tracking beta, and has `return_envelope`, and `perforated_page` fields populated in the API request. | ReturnAddress getReturnAddress() | setReturnAddress(ReturnAddress returnAddress) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in <a href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10" target="_blank">our guide to using html and merge variables</a>. Depending on your <a href="https://dashboard.lob.com/#/settings/account" target="_blank">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | [`SendDate`](../../doc/models/containers/send-date.md) | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | SendDate getSendDate() | setSendDate(SendDate sendDate) |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `Color` | `boolean` | Required | Set this key to `true` if you would like to print in color. Set to `false` if you would like to print in black and white. | boolean getColor() | setColor(boolean color) |
| `DoubleSided` | `Boolean` | Optional | Set this attribute to `true` for double sided printing, or `false` for for single sided printing. Defaults to `true`.<br>**Default**: `true` | Boolean getDoubleSided() | setDoubleSided(Boolean doubleSided) |
| `AddressPlacement` | [`AddressPlacementEnum`](../../doc/models/address-placement-enum.md) | Optional | Specifies the location of the address information that will show through the double-window envelope. To see how this will impact your letter design, view our letter template.<br>Some values are exclusive to certain customers. Upgrade to the appropriate <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a> to gain access.<br><br>* `top_first_page` - (default) print address information at the top of your provided first page<br>* `insert_blank_page` - insert a blank address page at the beginning of your file (you will be charged for the extra page)<br>* `bottom_first_page_center` - **(exclusive, deprecation planned within a few months)** print address information at the bottom center of your provided first page<br>* `bottom_first_page` - **(exclusive)** print address information at the bottom of your provided first page<br>**Default**: `AddressPlacementEnum.TOP_FIRST_PAGE` | AddressPlacementEnum getAddressPlacement() | setAddressPlacement(AddressPlacementEnum addressPlacement) |
| `ReturnEnvelope` | [`ReturnEnvelopeReturned2`](../../doc/models/containers/return-envelope-returned-2.md) | Optional | - | ReturnEnvelopeReturned2 getReturnEnvelope() | setReturnEnvelope(ReturnEnvelopeReturned2 returnEnvelope) |
| `PerforatedPage` | `Integer` | Optional | Required if `return_envelope` is `true`. The number of the page that should be perforated for use with the return envelope. Must be greater than or equal to `1`. The blank page added by `address_placement=insert_blank_page` will be ignored when considering the perforated page number. To see how perforation will impact your letter design, view our <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_perf_template.pdf" target="_blank">perforation guide</a>. | Integer getPerforatedPage() | setPerforatedPage(Integer perforatedPage) |
| `CustomEnvelope` | [`CustomEnvelopeReturned`](../../doc/models/custom-envelope-returned.md) | Optional | A nested custom envelope object containing more information about the custom envelope used or `null` if a custom envelope was not used. | CustomEnvelopeReturned getCustomEnvelope() | setCustomEnvelope(CustomEnvelopeReturned customEnvelope) |
| `To` | [`Address`](../../doc/models/containers/address.md) | Required | - | Address getTo() | setTo(Address to) |
| `Carrier` | `String` | Required, Constant | **Default**: `"USPS"` | String getCarrier() | setCarrier(String carrier) |
| `Thumbnails` | [`List<Thumbnail>`](../../doc/models/thumbnail.md) | Optional | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `ExpectedDeliveryDate` | `LocalDate` | Optional | A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`. | LocalDate getExpectedDeliveryDate() | setExpectedDeliveryDate(LocalDate expectedDeliveryDate) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `From` | [`Address`](../../doc/models/containers/address.md) | Required | - | Address getFrom() | setFrom(Address from) |
| `Url` | `String` | Optional | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.<br>**Constraints**: *Pattern*: `^https://lob-assets\.com/(letters\|postcards\|bank-accounts\|checks\|self-mailers\|cards)/[a-z]{3,4}_[a-z0-9]{15,16}(\.pdf\|_thumb_[a-z]+_[0-9]+\.png)\?(version=[a-z0-9-]*&)?expires=[0-9]{10}&signature=[a-zA-Z0-9-_]+$` | String getUrl() | setUrl(String url) |
| `Id` | `String` | Required | Unique identifier prefixed with `ltr_`.<br>**Constraints**: *Pattern*: `^ltr_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `TemplateId` | `String` | Optional | **Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` | String getTemplateId() | setTemplateId(String templateId) |
| `TemplateVersionId` | `String` | Optional | **Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` | String getTemplateVersionId() | setTemplateVersionId(String templateVersionId) |
| `CampaignId` | `String` | Optional | The unique ID of the associated campaign if the resource was generated from a campaign. | String getCampaignId() | setCampaignId(String campaignId) |
| `UseType` | [`LtrUseTypeEnum`](../../doc/models/ltr-use-type-enum.md) | Required | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). | LtrUseTypeEnum getUseType() | setUseType(LtrUseTypeEnum useType) |
| `Fsc` | `Boolean` | Optional | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `A4` letter size.<br>**Default**: `false` | Boolean getFsc() | setFsc(Boolean fsc) |
| `Status` | [`TheStatusOfTheLetterEnum`](../../doc/models/the-status-of-the-letter-enum.md) | Optional | - | TheStatusOfTheLetterEnum getStatus() | setStatus(TheStatusOfTheLetterEnum status) |
| `FailureReason` | `String` | Optional | A string describing the reason for failure if the letter failed to render. | String getFailureReason() | setFailureReason(String failureReason) |
| `Object` | [`Object8Enum`](../../doc/models/object-8-enum.md) | Optional | Value is resource type.<br>**Default**: `Object8Enum.LETTER` | Object8Enum getObject() | setObject(Object8Enum object) |

## Example (as JSON)

```json
{
  "extra_service": "certified",
  "tracking_events": [
    {
      "id": "id8",
      "date_created": "2016-03-13T12:52:32.123Z",
      "date_modified": "2016-03-13T12:52:32.123Z",
      "object": "tracking_event",
      "type": "certified",
      "name": "Delivered",
      "time": "2016-03-13T12:52:32.123Z",
      "details": {
        "event": "pickup_available",
        "description": "description0",
        "notes": "notes0",
        "action_required": false
      },
      "location": "location2"
    }
  ],
  "mail_type": "usps_first_class",
  "color": false,
  "double_sided": true,
  "address_placement": "top_first_page",
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
  "from": {
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
  "id": "id0",
  "use_type": "marketing",
  "fsc": false,
  "object": "letter",
  "tracking_number": "tracking_number8",
  "return_address": "String5",
  "description": "description0",
  "metadata": {
    "key0": "metadata7"
  },
  "merge_variables": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

