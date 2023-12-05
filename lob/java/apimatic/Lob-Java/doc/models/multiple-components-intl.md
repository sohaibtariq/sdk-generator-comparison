
# Multiple Components Intl

## Structure

`MultipleComponentsIntl`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Recipient` | `String` | Optional | The intended recipient, typically a person's or firm's name.<br>**Constraints**: *Maximum Length*: `500` | String getRecipient() | setRecipient(String recipient) |
| `PrimaryLine` | `String` | Required | The primary delivery line (usually the street address) of the address.<br>**Constraints**: *Maximum Length*: `200` | String getPrimaryLine() | setPrimaryLine(String primaryLine) |
| `SecondaryLine` | `String` | Optional | The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.<br>**Constraints**: *Maximum Length*: `500` | String getSecondaryLine() | setSecondaryLine(String secondaryLine) |
| `City` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getCity() | setCity(String city) |
| `State` | `String` | Optional | The name of the state. | String getState() | setState(String state) |
| `PostalCode` | `String` | Optional | The postal code.<br>**Constraints**: *Maximum Length*: `12` | String getPostalCode() | setPostalCode(String postalCode) |
| `Country` | [`CountryExtendedEnum`](../../doc/models/country-extended-enum.md) | Required | Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`, `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification API. Also does not accept `PS`, which is not currently supported. | CountryExtendedEnum getCountry() | setCountry(CountryExtendedEnum country) |

## Example (as JSON)

```json
{
  "recipient": "recipient0",
  "primary_line": "primary_line8",
  "secondary_line": "secondary_line4",
  "city": "city8",
  "state": "state4",
  "postal_code": "postal_code0",
  "country": "CG"
}
```

