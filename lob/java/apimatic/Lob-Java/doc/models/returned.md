
# Returned

Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative.

## Structure

`Returned`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `Size` | [`PostcardSizeEnum`](../../doc/models/postcard-size-enum.md) | Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6` | PostcardSizeEnum getSize() | setSize(PostcardSizeEnum size) |
| `FrontOriginalUrl` | `String` | Optional | The original URL of the `front` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getFrontOriginalUrl() | setFrontOriginalUrl(String frontOriginalUrl) |
| `BackOriginalUrl` | `String` | Optional | The original URL of the `back` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getBackOriginalUrl() | setBackOriginalUrl(String backOriginalUrl) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "size": "4x6",
  "front_original_url": "front_original_url4",
  "back_original_url": "back_original_url8"
}
```

