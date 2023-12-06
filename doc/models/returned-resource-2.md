
# Returned Resource 2

## Structure

`ReturnedResource2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | `String` | Required, Constant | Mailpiece type for the creative<br>**Default**: `"self_mailer"` | String getResourceType() | setResourceType(String resourceType) |
| `Details` | [`SelfMailerDetailsReturned`](../../doc/models/self-mailer-details-returned.md) | Required | Properties that the self mailers in your Creative should have. Check within in order to add a QR code to your creative. | SelfMailerDetailsReturned getDetails() | setDetails(SelfMailerDetailsReturned details) |
| `From` | [`FromAttribute`](../../doc/models/containers/from-attribute.md) | Optional | Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | FromAttribute getFrom() | setFrom(FromAttribute from) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "resource_type": "self_mailer",
  "details": {
    "mail_type": "usps_first_class",
    "size": "6x18_bifold",
    "inside_original_url": "inside_original_url2",
    "outside_original_url": "outside_original_url4"
  },
  "from": "String9",
  "description": "description4",
  "metadata": {
    "key0": "metadata1"
  }
}
```

