
# Self Mailer Details Returned

Properties that the self mailers in your Creative should have. Check within in order to add a QR code to your creative.

## Structure

`SelfMailerDetailsReturned`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `Size` | [`SelfMailerSizeEnum`](../../doc/models/self-mailer-size-enum.md) | Optional | Specifies the size of the self mailer. The `17.75x9_trifold` size is in beta. Contact support@lob.com or your account contact to learn more.<br>**Default**: `SelfMailerSizeEnum.ENUM_6X18_BIFOLD` | SelfMailerSizeEnum getSize() | setSize(SelfMailerSizeEnum size) |
| `InsideOriginalUrl` | `String` | Optional | The original URL of the `inside` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getInsideOriginalUrl() | setInsideOriginalUrl(String insideOriginalUrl) |
| `OutsideOriginalUrl` | `String` | Optional | The original URL of the `outside` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getOutsideOriginalUrl() | setOutsideOriginalUrl(String outsideOriginalUrl) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "size": "6x18_bifold",
  "inside_original_url": "inside_original_url8",
  "outside_original_url": "outside_original_url0"
}
```

