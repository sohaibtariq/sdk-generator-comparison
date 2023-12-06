
# Reverse Geocode

## Structure

`ReverseGeocode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier prefixed with `us_reverse_geocode_`.<br>**Constraints**: *Pattern*: `^us_reverse_geocode_[a-zA-Z0-9_]+$` | String getId() | setId(String id) |
| `Addresses` | [`List<Addresses>`](../../doc/models/addresses.md) | Optional | list of addresses | List<Addresses> getAddresses() | setAddresses(List<Addresses> addresses) |
| `Object` | [`Object15Enum`](../../doc/models/object-15-enum.md) | Optional | Value is resource type.<br>**Default**: `Object15Enum.US_REVERSE_GEOCODE_LOOKUP` | Object15Enum getObject() | setObject(Object15Enum object) |

## Example (as JSON)

```json
{
  "object": "us_reverse_geocode_lookup",
  "id": "id2",
  "addresses": [
    {
      "components": {
        "zip_code": "zip_code0",
        "zip_code_plus_4": "zip_code_plus_48"
      },
      "location_analysis": {
        "latitude": 102.1,
        "longitude": 99.9,
        "distance": 58.56
      }
    }
  ]
}
```

