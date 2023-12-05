
# Creative Writable

## Structure

`CreativeWritable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | `String` | Required, Constant | Mailpiece type for the creative<br>**Default**: `"postcard"` | String getResourceType() | setResourceType(String resourceType) |
| `CampaignId` | `String` | Required | Unique identifier prefixed with `cmp_`.<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` | String getCampaignId() | setCampaignId(String campaignId) |
| `Front` | [`CrvFront`](../../doc/models/containers/crv-front.md) | Required | The artwork to use as the front of your postcard.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 4.25"x6.25", 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML template will be rendered to the specified `size`.<br><br>See [here](#section/HTML-Examples) for HTML examples. | CrvFront getFront() | setFront(CrvFront front) |
| `Back` | [`CrvBack`](../../doc/models/containers/crv-back.md) | Required | The artwork to use as the back of your postcard creative.<br><br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 4.25"x6.25", 6.25"x9.25", or 6.25"x11.25" at 300 DPI, while supplied HTML template will be rendered to the specified `size`.<br>- Be sure to leave room for address and postage information by following the templates provided here:<br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/4x6_postcard.pdf" target="_blank">4x6 template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x9_postcard.pdf" target="_blank">6x9 template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/postcards/6x11_postcard.pdf" target="_blank">6x11 template</a><br><br>See [here](#section/HTML-Examples) for HTML examples. | CrvBack getBack() | setBack(CrvBack back) |
| `Details` | [`Writable`](../../doc/models/writable.md) | Required | Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative. | Writable getDetails() | setDetails(Writable details) |
| `From` | [`FromAttribute`](../../doc/models/containers/from-attribute.md) | Optional | Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | FromAttribute getFrom() | setFrom(FromAttribute from) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "resource_type": "postcard",
  "campaign_id": "campaign_id2",
  "front": "String3",
  "back": "String1",
  "details": {
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
  },
  "from": "String1",
  "description": "description2",
  "metadata": {
    "key0": "metadata1"
  }
}
```

