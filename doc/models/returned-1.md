
# Returned 1

Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative.

## Structure

`Returned1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Optional | A string designating the mail postage type:<br><br>* `usps_first_class` - (default)<br>* `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is<br>  less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6`<br>  postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` | MailTypeEnum getMailType() | setMailType(MailTypeEnum mailType) |
| `Size` | [`PostcardSizeEnum`](../../doc/models/postcard-size-enum.md) | Optional | Specifies the size of the postcard. Only `4x6` postcards can be sent to international destinations.<br>**Default**: `PostcardSizeEnum.ENUM_4X6` | PostcardSizeEnum getSize() | setSize(PostcardSizeEnum size) |
| `FrontOriginalUrl` | `String` | Optional | The original URL of the `front` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getFrontOriginalUrl() | setFrontOriginalUrl(String frontOriginalUrl) |
| `BackOriginalUrl` | `String` | Optional | The original URL of the `back` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getBackOriginalUrl() | setBackOriginalUrl(String backOriginalUrl) |
| `AddressPlacement` | [`AddressPlacementEnum`](../../doc/models/address-placement-enum.md) | Optional | Specifies the location of the address information that will show through the double-window envelope. To see how this will impact your letter design, view our letter template.<br>Some values are exclusive to certain customers. Upgrade to the appropriate <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a> to gain access.<br><br>* `top_first_page` - (default) print address information at the top of your provided first page<br>* `insert_blank_page` - insert a blank address page at the beginning of your file (you will be charged for the extra page)<br>* `bottom_first_page_center` - **(exclusive, deprecation planned within a few months)** print address information at the bottom center of your provided first page<br>* `bottom_first_page` - **(exclusive)** print address information at the bottom of your provided first page<br>**Default**: `AddressPlacementEnum.TOP_FIRST_PAGE` | AddressPlacementEnum getAddressPlacement() | setAddressPlacement(AddressPlacementEnum addressPlacement) |
| `Buckslips` | `List<String>` | Optional | A single-element array containing an existing buckslip id in a string format. See [buckslips](#tag/Buckslips) for more information.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1`, *Pattern*: `^bck_[a-zA-Z0-9]+$` | List<String> getBuckslips() | setBuckslips(List<String> buckslips) |
| `Cards` | `List<String>` | Optional | A single-element array containing an existing card id in a string format. See [cards](#tag/Cards) for more information.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1`, *Pattern*: `^card_[a-zA-Z0-9]+$` | List<String> getCards() | setCards(List<String> cards) |
| `CustomEnvelope` | [`CustomEnvelopeReturned`](../../doc/models/custom-envelope-returned.md) | Optional | A nested custom envelope object containing more information about the custom envelope used or `null` if a custom envelope was not used. | CustomEnvelopeReturned getCustomEnvelope() | setCustomEnvelope(CustomEnvelopeReturned customEnvelope) |
| `Color` | `Boolean` | Optional | Set this key to `true` if you would like to print in color. Set to `false` if you would like to print in black and white. | Boolean getColor() | setColor(Boolean color) |
| `DoubleSided` | `Boolean` | Optional | Set this attribute to `true` for double sided printing, or `false` for for single sided printing. Defaults to `true`.<br>**Default**: `true` | Boolean getDoubleSided() | setDoubleSided(Boolean doubleSided) |
| `ExtraService` | [`ExtraServiceEnum`](../../doc/models/extra-service-enum.md) | Optional | Add an extra service to your letter. Can only be non-`null` if `mail_type` isn't `usps_standard`. See <a href="https://www.lob.com/pricing/print-mail#compare" target="_blank">pricing</a> for extra costs incurred.<br><br>* `certified` - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf" target="_blank">#10 envelope</a> and <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf" target="_blank">flat envelope</a> (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.<br>* `certified_return_receipt` - request an electronic copy of the recipient's signature to prove delivery of your certified letter<br>* `registered` - provides tracking and confirmation for international addresses | ExtraServiceEnum getExtraService() | setExtraService(ExtraServiceEnum extraService) |
| `FileOriginalUrl` | `String` | Optional | The original URL of the `file` template. | String getFileOriginalUrl() | setFileOriginalUrl(String fileOriginalUrl) |
| `InsideOriginalUrl` | `String` | Optional | The original URL of the `inside` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getInsideOriginalUrl() | setInsideOriginalUrl(String insideOriginalUrl) |
| `OutsideOriginalUrl` | `String` | Optional | The original URL of the `outside` template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getOutsideOriginalUrl() | setOutsideOriginalUrl(String outsideOriginalUrl) |

## Example (as JSON)

```json
{
  "mail_type": "usps_first_class",
  "size": "4x6",
  "address_placement": "top_first_page",
  "double_sided": true,
  "front_original_url": "front_original_url8",
  "back_original_url": "back_original_url4"
}
```

