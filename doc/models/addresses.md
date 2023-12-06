
# Addresses

## Structure

`Addresses`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Components` | [`Components`](../../doc/models/components.md) | Optional | A nested object containing a breakdown of each component of a reverse geocoded response. | Components getComponents() | setComponents(Components components) |
| `LocationAnalysis` | [`LocationAnalysis`](../../doc/models/location-analysis.md) | Optional | A nested object containing a breakdown of the analysis of a reverse geocoded location. | LocationAnalysis getLocationAnalysis() | setLocationAnalysis(LocationAnalysis locationAnalysis) |

## Example (as JSON)

```json
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
```

