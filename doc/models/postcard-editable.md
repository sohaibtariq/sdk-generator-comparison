
# Postcard Editable

## Structure

`PostcardEditable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `MergeVariables` | `Object` | Optional | You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: `{{variable_name}}`, pass in `{"variable_name": "Harry"}` to render `Harry`. `merge_variables` must be an object. Any type of value is accepted as long as the object is valid JSON; you can use `strings`, `numbers`, `booleans`, `arrays`, `objects`, or `null`. The max length of the object is 25,000 characters. If you call `JSON.stringify` on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: `!`, `"`, `#`, `%`, `&`, `'`, `(`, `)`, `*`, `+`, `,`, `/`, `;`, `<`, `=`, `>`, `@`, `[`, `\`, `]`, `^`, `````, `{`, `\|`, `}`, `~`. More instructions can be found in <a href="https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10" target="_blank">our guide to using html and merge variables</a>. Depending on your <a href="https://dashboard.lob.com/#/settings/account" target="_blank">Merge Variable strictness</a> setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string. | Object getMergeVariables() | setMergeVariables(Object mergeVariables) |
| `SendDate` | [`SendDate`](../../doc/models/containers/send-date.md) | Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. | SendDate getSendDate() | setSendDate(SendDate sendDate) |
| `Size` | [`PostcardSizeEnum`](../../doc/models/postcard-size-enum.md) | Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6` | PostcardSizeEnum getSize() | setSize(PostcardSizeEnum size) |
| `To` | [`PostcardEditableTo`](../../doc/models/containers/postcard-editable-to.md) | Required | This is a container for one-of cases. | PostcardEditableTo getTo() | setTo(PostcardEditableTo to) |
| `From` | [`PostcardEditableFrom`](../../doc/models/containers/postcard-editable-from.md) | Optional | This is a container for one-of cases. | PostcardEditableFrom getFrom() | setFrom(PostcardEditableFrom from) |
| `Front` | [`PscFront`](../../doc/models/containers/psc-front.md) | Required | The artwork to use as the front of your postcard.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 4.25"x6.25", 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the specified `size`.<br><br>See [here](#section/HTML-Examples) for HTML examples. | PscFront getFront() | setFront(PscFront front) |
| `Back` | [`PscBack`](../../doc/models/containers/psc-back.md) | Required | The artwork to use as the back of your postcard.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 4.25"x6.25", 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML will be rendered to the specified `size`.<br>- Be sure to leave room for address and postage information by following the templates provided here:<br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/4x6_postcard.pdf" target="_blank">4x6 template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x9_postcard.pdf" target="_blank">6x9 template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x11_postcard.pdf" target="_blank">6x11 template</a><br><br>See [here](#section/HTML-Examples) for HTML examples. | PscBack getBack() | setBack(PscBack back) |
| `BillingGroupId` | `String` | Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href="#tag/Billing-Groups">Billing Group API</a> for more information. | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |
| `QrCode` | [`QrCode`](../../doc/models/qr-code.md) | Optional | Customize and place a QR code on the creative at the required position. | QrCode getQrCode() | setQrCode(QrCode qrCode) |
| `UseType` | [`PscUseTypeEnum`](../../doc/models/psc-use-type-enum.md) | Required | The use type for each mailpiece. Can be one of marketing, operational, or null. Null use_type is only allowed if an account default use_type is selected in Account Settings. For more information on use_type, see our  [Help Center article](https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings/declaring-mail-use-type). | PscUseTypeEnum getUseType() | setUseType(PscUseTypeEnum useType) |
| `Fsc` | `Boolean` | Optional | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for `4x6` or `A5` postcard sizes.<br>**Default**: `false` | Boolean getFsc() | setFsc(Boolean fsc) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "size": "4x6",
  "to": "String3",
  "front": "String7",
  "back": "String9",
  "use_type": "marketing",
  "fsc": false,
  "description": "description6",
  "metadata": {
    "key0": "metadata9"
  },
  "merge_variables": {
    "key1": "val1",
    "key2": "val2"
  },
  "send_date": "2016-03-13T12:52:32.123Z"
}
```

