
# Self Mailer Editable

## Structure

`SelfMailerEditable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in <a href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10" target="_blank">our guide to using html and merge variables</a>. Depending on your <a href="https://dashboard.lob.com/#/settings/account" target="_blank">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | [`SendDate`](../../doc/models/containers/send-date.md) | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | SendDate getSendDate() | setSendDate(SendDate sendDate) |
| `Size` | [`SelfMailerSizeEnum`](../../doc/models/self-mailer-size-enum.md) | Optional | Specifies the size of the self mailer. The `17.75x9_trifold` size is in beta. Contact support@lob.com or your account contact to learn more.<br>**Default**: `SelfMailerSizeEnum.ENUM_6X18_BIFOLD` | SelfMailerSizeEnum getSize() | setSize(SelfMailerSizeEnum size) |
| `To` | [`SelfMailerEditableTo`](../../doc/models/containers/self-mailer-editable-to.md) | Required | This is a container for one-of cases. | SelfMailerEditableTo getTo() | setTo(SelfMailerEditableTo to) |
| `From` | [`SelfMailerEditableFrom`](../../doc/models/containers/self-mailer-editable-from.md) | Optional | This is a container for one-of cases. | SelfMailerEditableFrom getFrom() | setFrom(SelfMailerEditableFrom from) |
| `Inside` | [`SelfMailerEditableInside`](../../doc/models/containers/self-mailer-editable-inside.md) | Required | This is a container for one-of cases. | SelfMailerEditableInside getInside() | setInside(SelfMailerEditableInside inside) |
| `Outside` | [`SelfMailerEditableOutside`](../../doc/models/containers/self-mailer-editable-outside.md) | Required | This is a container for one-of cases. | SelfMailerEditableOutside getOutside() | setOutside(SelfMailerEditableOutside outside) |
| `BillingGroupId` | `String` | Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href="#tag/Billing-Groups">Billing Group API</a> for more information. | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |
| `QrCode` | [`QrCode`](../../doc/models/qr-code.md) | Optional | Customize and place a QR code on the creative at the required position. | QrCode getQrCode() | setQrCode(QrCode qrCode) |
| `UseType` | [`SfmUseTypeEnum`](../../doc/models/sfm-use-type-enum.md) | Required | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). | SfmUseTypeEnum getUseType() | setUseType(SfmUseTypeEnum useType) |
| `Fsc` | `Boolean` | Optional | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `11x9_bifold` self-mailer size.<br>**Default**: `false` | Boolean getFsc() | setFsc(Boolean fsc) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "size": "6x18_bifold",
  "to": "String7",
  "inside": "String7",
  "outside": "String3",
  "use_type": "marketing",
  "fsc": false,
  "description": "description0",
  "metadata": {
    "key0": "metadata7",
    "key1": "metadata6",
    "key2": "metadata5"
  },
  "merge_variables": {
    "key1": "val1",
    "key2": "val2"
  },
  "send_date": "2016-03-13T12:52:32.123Z"
}
```

