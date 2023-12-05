
# Components

A nested object containing a breakdown of each component of a reverse geocoded response.

## Structure

`Components`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ZipCode` | `String` | Required | The 5-digit ZIP code<br>**Constraints**: *Pattern*: `^\d{5}$` | String getZipCode() | setZipCode(String zipCode) |
| `ZipCodePlus4` | `String` | Required | **Constraints**: *Pattern*: `^\d{4}$` | String getZipCodePlus4() | setZipCodePlus4(String zipCodePlus4) |

## Example (as JSON)

```json
{
  "zip_code": "zip_code0",
  "zip_code_plus_4": "zip_code_plus_48"
}
```

