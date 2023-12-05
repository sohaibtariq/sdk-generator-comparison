
# Check Editable Props

## Structure

`CheckEditableProps`

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
| `To` | [`CheckEditablePropsTo`](../../doc/models/containers/check-editable-props-to.md) | Required | This is a container for one-of cases. | CheckEditablePropsTo getTo() | setTo(CheckEditablePropsTo to) |
| `From` | [`CheckEditablePropsFrom`](../../doc/models/containers/check-editable-props-from.md) | Required | This is a container for one-of cases. | CheckEditablePropsFrom getFrom() | setFrom(CheckEditablePropsFrom from) |
| `BankAccount` | `String` | Required | **Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` | String getBankAccount() | setBankAccount(String bankAccount) |
| `Amount` | `double` | Required | The payment amount to be sent in US dollars. Amounts will be rounded to two decimal places.<br>**Constraints**: `<= 999999.99` | double getAmount() | setAmount(double amount) |
| `Logo` | [`CheckEditablePropsLogo`](../../doc/models/containers/check-editable-props-logo.md) | Optional | This is a container for one-of cases. | CheckEditablePropsLogo getLogo() | setLogo(CheckEditablePropsLogo logo) |
| `CheckBottom` | [`CheckBottom`](../../doc/models/containers/check-bottom.md) | Optional | The artwork to use on the bottom of the check page.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 8.5"x11" at 300 DPI, while supplied HTML will be rendered and trimmed to fit on a 8.5"x11" page.<br>- The check bottom will always be printed in black & white.<br>- Must conform to <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/check_bottom_template.pdf" target="_blank">this template</a>.<br><br>Need more help? Consult our [HTML examples](#section/HTML-Examples). | CheckBottom getCheckBottom() | setCheckBottom(CheckBottom checkBottom) |
| `Attachment` | [`CheckEditablePropsAttachment`](../../doc/models/containers/check-editable-props-attachment.md) | Optional | This is a container for one-of cases. | CheckEditablePropsAttachment getAttachment() | setAttachment(CheckEditablePropsAttachment attachment) |
| `BillingGroupId` | `String` | Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href="#tag/Billing-Groups">Billing Group API</a> for more information. | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "use_type": "marketing",
  "to": "String9",
  "from": "String9",
  "bank_account": "bank_account8",
  "amount": 133.86,
  "description": "description4",
  "metadata": {
    "key0": "metadata1",
    "key1": "metadata0",
    "key2": "metadata9"
  },
  "merge_variables": {
    "key1": "val1",
    "key2": "val2"
  },
  "send_date": "2016-03-13T12:52:32.123Z"
}
```

