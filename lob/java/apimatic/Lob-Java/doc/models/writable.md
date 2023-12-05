
# Writable

Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative.

## Structure

`Writable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `Size` | [`PostcardSizeEnum`](../../doc/models/postcard-size-enum.md) | Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6` | PostcardSizeEnum getSize() | setSize(PostcardSizeEnum size) |
| `QrCode` | [`QrCodeCampaigns`](../../doc/models/qr-code-campaigns.md) | Optional | Customize and place a QR code on all the postcards, letters or self mailers in a campaign. Redirect URLs can either be unique for each recipient, or a single link can be used for the whole campaign. See `redirect_url` attribute below for more details. | QrCodeCampaigns getQrCode() | setQrCode(QrCodeCampaigns qrCode) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "size": "4x6",
  "qr_code": {
    "position": "position2",
    "top": "top8",
    "right": "right2",
    "left": "left2",
    "bottom": "bottom4",
    "redirect_url": "String9",
    "width": "width0"
  }
}
```

