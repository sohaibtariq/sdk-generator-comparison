
# Creative Writable 2

## Structure

`CreativeWritable2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | `String` | Required, Constant | Mailpiece type for the creative<br>**Default**: `"self_mailer"` | String getResourceType() | setResourceType(String resourceType) |
| `CampaignId` | `String` | Required | Unique identifier prefixed with `cmp_`.<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` | String getCampaignId() | setCampaignId(String campaignId) |
| `Inside` | [`CrvInside`](../../doc/models/containers/crv-inside.md) | Required | The artwork to use as the inside of your self mailer creative.<br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 6.25"x18.25", 12.25"x9.25" or 11.25"x9.25" at 300 DPI, while supplied HTML template will be rendered to the specified `size`.<br>- Be sure to leave room for address and postage information by following the templates provided here:<br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/self_mailers/6x18_sfm_bifold_template.pdf" target="_blank">6x18 bifold template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/self_mailers/11x9_sfm_bifold_template.pdf" target="_blank">11x9 bifold template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/self_mailers/12x9_sfm_bifold_template.pdf" target="_blank">12x9 bifold template</a><br><br>See [here](#section/HTML-Examples) for HTML examples. | CrvInside getInside() | setInside(CrvInside inside) |
| `Outside` | [`CrvOutside`](../../doc/models/containers/crv-outside.md) | Required | The artwork to use as the outside of your self mailer creative.<br>Notes:<br><br>- HTML merge variables should not include delimiting whitespace.<br>- PDF, PNG, and JPGs must be sized at 6.25"x18.25", 12.25"x9.25" or 11.25"x9.25" at 300 DPI, while supplied HTML template will be rendered to the specified `size`.<br>- Be sure to leave room for address and postage information by following the templates provided here:<br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/self_mailers/6x18_sfm_bifold_template.pdf" target="_blank">6x18 bifold template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/self_mailers/11x9_sfm_bifold_template.pdf" target="_blank">11x9 bifold template</a><br>  - <a href="https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/self_mailers/12x9_sfm_bifold_template.pdf" target="_blank">12x9 bifold template</a><br><br>See [here](#section/HTML-Examples) for HTML examples. | CrvOutside getOutside() | setOutside(CrvOutside outside) |
| `Details` | [`SelfMailerDetailsWritable`](../../doc/models/self-mailer-details-writable.md) | Required | Properties that the self mailers in your Creative should have. Check within in order to add a QR code to your creative. | SelfMailerDetailsWritable getDetails() | setDetails(SelfMailerDetailsWritable details) |
| `From` | [`FromAttribute`](../../doc/models/containers/from-attribute.md) | Optional | Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | FromAttribute getFrom() | setFrom(FromAttribute from) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "resource_type": "self_mailer",
  "campaign_id": "campaign_id4",
  "inside": "String1",
  "outside": "String7",
  "details": {
    "mail_type": "usps_first_class",
    "size": "6x18_bifold",
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
  "from": "String9",
  "description": "description4",
  "metadata": {
    "key0": "metadata1",
    "key1": "metadata0",
    "key2": "metadata9"
  }
}
```

