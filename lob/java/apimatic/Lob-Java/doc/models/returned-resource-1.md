
# Returned Resource 1

## Structure

`ReturnedResource1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceType` | `String` | Required, Constant | Mailpiece type for the creative<br>**Default**: `"letter"` | String getResourceType() | setResourceType(String resourceType) |
| `Details` | [`LetterDetailsReturned`](../../doc/models/letter-details-returned.md) | Required | Properties that the letters in your Creative should have. Check within in order to add a QR code to your creative. | LetterDetailsReturned getDetails() | setDetails(LetterDetailsReturned details) |
| `From` | [`FromAttribute`](../../doc/models/containers/from-attribute.md) | Required | Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. | FromAttribute getFrom() | setFrom(FromAttribute from) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "resource_type": "letter",
  "details": {
    "address_placement": "top_first_page",
    "double_sided": true,
    "mail_type": "usps_first_class",
    "buckslips": [
      "buckslips2",
      "buckslips3"
    ],
    "cards": [
      "cards7"
    ],
    "custom_envelope": {
      "id": "id0",
      "url": "url4",
      "object": "object2"
    },
    "color": false
  },
  "from": "String9",
  "description": "description4",
  "metadata": {
    "key0": "metadata9"
  }
}
```

