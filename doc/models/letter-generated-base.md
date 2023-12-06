
# Letter Generated Base

## Structure

`LetterGeneratedBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
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
  "id": "id4",
  "use_type": "marketing",
  "fsc": false,
  "object": "letter",
  "thumbnails": [
    {
      "small": "small8",
      "medium": "medium8",
      "large": "large6"
    },
    {
      "small": "small8",
      "medium": "medium8",
      "large": "large6"
    },
    {
      "small": "small8",
      "medium": "medium8",
      "large": "large6"
    }
  ],
  "expected_delivery_date": "2016-03-13",
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "deleted": false
}
```

