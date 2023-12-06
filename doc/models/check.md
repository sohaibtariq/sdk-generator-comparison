
# Check

## Structure

`Check`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in <a href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10" target="_blank">our guide to using html and merge variables</a>. Depending on your <a href="https://dashboard.lob.com/#/settings/account" target="_blank">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | [`SendDate`](../../doc/models/containers/send-date.md) | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | SendDate getSendDate() | setSendDate(SendDate sendDate) |
| `MailType` | [`MailType2Enum`](../../doc/models/mail-type-2-enum.md) | Optional | Checks must be sent `usps_first_class`<br>**Default**: `MailType2Enum.USPS_FIRST_CLASS` | MailType2Enum getMailType() | setMailType(MailType2Enum mailType) |
| `Memo` | `String` | Optional | Text to include on the memo line of the check.<br>**Constraints**: *Maximum Length*: `40` | String getMemo() | setMemo(String memo) |
| `CheckNumber` | `Integer` | Optional | An integer that designates the check number.<br>If `check_number` is not provided, checks created from a new `bank_account` will start at `10000` and increment with each check created with the `bank_account`.<br>A provided `check_number` overrides the defaults. Subsequent checks created with the same `bank_account` will increment from the provided check number.<br>**Constraints**: `>= 1`, `<= 500000000` | Integer getCheckNumber() | setCheckNumber(Integer checkNumber) |
| `Message` | `String` | Optional | Max of 400 characters to be included at the bottom of the check page.<br>**Constraints**: *Maximum Length*: `400` | String getMessage() | setMessage(String message) |
| `UseType` | [`ChkUseTypeEnum`](../../doc/models/chk-use-type-enum.md) | Required | TThe use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). | ChkUseTypeEnum getUseType() | setUseType(ChkUseTypeEnum useType) |
| `From` | [`AddressUs`](../../doc/models/address-us.md) | Optional | - | AddressUs getFrom() | setFrom(AddressUs from) |
| `Id` | `String` | Required | Unique identifier prefixed with `chk_`.<br>**Constraints**: *Pattern*: `^chk_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Amount` | `double` | Required | The payment amount to be sent in US dollars.<br>**Constraints**: `<= 999999.99`, *Multiple Of*: `0.01` | double getAmount() | setAmount(double amount) |
| `BankAccount` | [`BankAccount`](../../doc/models/bank-account.md) | Required | - | BankAccount getBankAccount() | setBankAccount(BankAccount bankAccount) |
| `CheckBottomTemplateId` | `String` | Optional | **Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` | String getCheckBottomTemplateId() | setCheckBottomTemplateId(String checkBottomTemplateId) |
| `AttachmentTemplateId` | `String` | Optional | **Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` | String getAttachmentTemplateId() | setAttachmentTemplateId(String attachmentTemplateId) |
| `CheckBottomTemplateVersionId` | `String` | Optional | **Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` | String getCheckBottomTemplateVersionId() | setCheckBottomTemplateVersionId(String checkBottomTemplateVersionId) |
| `AttachmentTemplateVersionId` | `String` | Optional | **Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` | String getAttachmentTemplateVersionId() | setAttachmentTemplateVersionId(String attachmentTemplateVersionId) |
| `Url` | `String` | Required | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated.<br>**Constraints**: *Pattern*: `^https://lob-assets\.com/(letters\|postcards\|bank-accounts\|checks\|self-mailers\|cards)/[a-z]{3,4}_[a-z0-9]{15,16}(\.pdf\|_thumb_[a-z]+_[0-9]+\.png)\?(version=[a-z0-9-]*&)?expires=[0-9]{10}&signature=[a-zA-Z0-9-_]+$` | String getUrl() | setUrl(String url) |
| `To` | [`ToAddressUsChk`](../../doc/models/to-address-us-chk.md) | Required | - | ToAddressUsChk getTo() | setTo(ToAddressUsChk to) |
| `Carrier` | `String` | Required, Constant | **Default**: `"USPS"` | String getCarrier() | setCarrier(String carrier) |
| `Thumbnails` | [`List<Thumbnail>`](../../doc/models/thumbnail.md) | Optional | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `ExpectedDeliveryDate` | `LocalDate` | Optional | A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`. | LocalDate getExpectedDeliveryDate() | setExpectedDeliveryDate(LocalDate expectedDeliveryDate) |
| `TrackingEvents` | [`List<TrackingEventNormal>`](../../doc/models/tracking-event-normal.md) | Optional | An array of tracking_event objects ordered by ascending `time`. Will not be populated for checks created in test mode. | List<TrackingEventNormal> getTrackingEvents() | setTrackingEvents(List<TrackingEventNormal> trackingEvents) |
| `Status` | [`TheStatusOfTheCheckEnum`](../../doc/models/the-status-of-the-check-enum.md) | Optional | - | TheStatusOfTheCheckEnum getStatus() | setStatus(TheStatusOfTheCheckEnum status) |
| `FailureReason` | `String` | Optional | A string describing the reason for failure if the check failed to render. | String getFailureReason() | setFailureReason(String failureReason) |
| `Object` | [`Object5Enum`](../../doc/models/object-5-enum.md) | Optional | Value is resource type.<br>**Default**: `Object5Enum.CHECK` | Object5Enum getObject() | setObject(Object5Enum object) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "use_type": "marketing",
  "id": "id2",
  "amount": 158.04,
  "bank_account": {
    "id": "bank_a",
    "signature_url": "https://lob-assets.com/bank-accounts/asd_asdfghjkqwertyui.pdf?expires=1234567890&signature=aksdf",
    "bank_name": "JPMORGAN CHASE BANK",
    "verified": true,
    "object": "bank_account",
    "description": "Test Bank Account",
    "routing_number": "322271627",
    "account_number": "123456789",
    "signatory": "Jane Doe",
    "account_type": "individual",
    "metadat": {
      "spiffy": "true"
    },
    "date_created": "2019-08-08T19:34:47.571Z",
    "date_modified": "2019-08-08T19:34:47.571Z",
    "check_template": "common",
    "fractional_routing_number": "fractional_routing_number6",
    "city": "city4",
    "state": "state0"
  },
  "url": "url6",
  "to": {
    "date_created": "2016-03-13T12:52:32.123Z",
    "date_modified": "2016-03-13T12:52:32.123Z",
    "object": "address",
    "id": "id6",
    "name": "name6",
    "company": "company6",
    "address_line1": "address_line10",
    "address_city": "address_city6",
    "address_state": "address_state8",
    "address_zip": "address_zip8",
    "deleted": false,
    "description": "description6",
    "phone": "phone4",
    "email": "email0",
    "address_line2": "address_line28"
  },
  "carrier": "USPS",
  "object": "check",
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "description": "description2",
  "metadata": {
    "key0": "metadata9",
    "key1": "metadata8",
    "key2": "metadata7"
  },
  "merge_variables": {
    "key1": "val1",
    "key2": "val2"
  },
  "send_date": "2016-03-13T12:52:32.123Z"
}
```

