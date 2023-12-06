
# Location Analysis

A nested object containing a breakdown of the analysis of a reverse geocoded location.

## Structure

`LocationAnalysis`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Latitude` | `Double` | Required | A positive or negative decimal indicating the geographic latitude of the address, specifying the north-to-south position of a location. This should be used with `longitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`).<br>**Constraints**: `>= -90`, `<= 90` | Double getLatitude() | setLatitude(Double latitude) |
| `Longitude` | `Double` | Required | A positive or negative decimal indicating the geographic longitude of the address, specifying the north-to-south position of a location. This should be used with `latitude` to pinpoint locations on a map. Will not be returned for undeliverable addresses or military addresses (state is `AA`, `AE`, or `AP`).<br>**Constraints**: `>= -180`, `<= 180` | Double getLongitude() | setLongitude(Double longitude) |
| `Distance` | `double` | Required | The distance from the input location to this exact zip code in miles. | double getDistance() | setDistance(double distance) |

## Example (as JSON)

```json
{
  "latitude": 102.1,
  "longitude": 99.9,
  "distance": 58.56
}
```

