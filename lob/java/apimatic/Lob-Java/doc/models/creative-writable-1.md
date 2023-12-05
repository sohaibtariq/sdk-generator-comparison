
# Creative Writable 1

## Structure

`CreativeWritable1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | `String` | Required, Constant | Mailpiece type for the creative<br>**Default**: `"letter"` | String getResourceType() | setResourceType(String resourceType) |
| `CampaignId` | `String` | Required | Unique identifier prefixed with `cmp_`.<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` | String getCampaignId() | setCampaignId(String campaignId) |
| `Details` | [`LetterDetailsWritable`](../../doc/models/letter-details-writable.md) | Required | Properties that the letters in your Creative should have. Check within in order to add a QR code to your creative. | LetterDetailsWritable getDetails() | setDetails(LetterDetailsWritable details) |
| `File` | [`CrvFile`](../../doc/models/containers/crv-file.md) | Required | Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- All pages of a supplied PDF file must be sized at 8.5"x11", while supplied HTML will be rendered and trimmed to as many 8.5"x11" pages as necessary.<br>- For design specifications, please see our <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_template.pdf" target="_blank">PDF</a> and [HTML](#section/HTML-Examples) templates.<br>- If a `custom_envelope` is used, follow <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_custom_envelope.pdf" target="_blank">this template</a>.<br>- For domestic destinations, the file limit is 60 pages single-sided or 120 pages double-sided. For international destinations, the file limit is 6 pages single-sided or 12 pages double-sided. PDFs that surpass the file limit will error, while HTML that renders more pages than the file limit will be trimmed.<br>- Any letters over 6 pages single-sided or 12 pages double-sided will be placed in a <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_flat_template.pdf" target="_blank">flat envelope</a> instead of the standard double window envelope.<br><br>See <a href="https://lob.com/pricing/print-mail#compare" target="_blank">pricing</a> for extra costs incurred. | CrvFile getFile() | setFile(CrvFile file) |
| `From` | [`FromAttribute`](../../doc/models/containers/from-attribute.md) | Required | Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | FromAttribute getFrom() | setFrom(FromAttribute from) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "resource_type": "letter",
  "campaign_id": "campaign_id0",
  "details": {
    "address_placement": "top_first_page",
    "color": false,
    "double_sided": true,
    "mail_type": "usps_first_class",
    "add_on_types": [
      "cards"
    ],
    "buckslips": [
      "buckslips2",
      "buckslips3"
    ],
    "cards": [
      "cards7"
    ],
    "custom_envelope": "custom_envelope0"
  },
  "file": "String1",
  "from": "String3",
  "description": "description0",
  "metadata": {
    "key0": "metadata7"
  }
}
```

