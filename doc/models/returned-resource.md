
# Returned Resource

## Structure

`ReturnedResource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | `String` | Required, Constant | Mailpiece type for the creative<br>**Default**: `"postcard"` | String getResourceType() | setResourceType(String resourceType) |
| `Details` | [`Returned`](../../doc/models/returned.md) | Required | Properties that the postcards in your Creative should have. Check within in order to add a QR code to your creative. | Returned getDetails() | setDetails(Returned details) |
| `From` | [`FromAttribute`](../../doc/models/containers/from-attribute.md) | Optional | Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | FromAttribute getFrom() | setFrom(FromAttribute from) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "resource_type": "postcard",
  "details": {
    "mail_type": "usps_first_class",
    "size": "4x6",
    "front_original_url": "front_original_url4",
    "back_original_url": "back_original_url6"
  },
  "from": "String7",
  "description": "description8",
  "metadata": {
    "key0": "metadata5"
  }
}
```

