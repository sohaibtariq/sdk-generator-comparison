
# Custom Envelope Returned

A nested custom envelope object containing more information about the custom envelope used or `null` if a custom envelope was not used.

## Structure

`CustomEnvelopeReturned`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The unique identifier of the custom envelope used.<br>**Constraints**: *Maximum Length*: `40` | String getId() | setId(String id) |
| `Url` | `String` | Required | The url of the envelope asset used. | String getUrl() | setUrl(String url) |
| `Object` | `String` | Required, Constant | **Default**: `"envelope"` | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": "id6",
  "url": "url0",
  "object": "envelope"
}
```

