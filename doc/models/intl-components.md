
# Intl Components

A nested object containing a breakdown of each component of an address.

## Structure

`IntlComponents`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PrimaryNumber` | `String` | Optional | The numeric or alphanumeric part of an address preceding the street name. Often the house, building, or PO Box number. | String getPrimaryNumber() | setPrimaryNumber(String primaryNumber) |
| `StreetName` | `String` | Optional | The name of the street. | String getStreetName() | setStreetName(String streetName) |
| `City` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getCity() | setCity(String city) |
| `State` | `String` | Optional | The <a href="https://en.wikipedia.org/wiki/ISO_3166-2" target="_blank">ISO 3166-2</a> two letter code for the state.<br>**Constraints**: *Maximum Length*: `2` | String getState() | setState(String state) |
| `PostalCode` | `String` | Optional | The postal code.<br>**Constraints**: *Maximum Length*: `12` | String getPostalCode() | setPostalCode(String postalCode) |

## Example (as JSON)

```json
{
  "primary_number": "primary_number0",
  "street_name": "street_name6",
  "city": "city0",
  "state": "state6",
  "postal_code": "postal_code2"
}
```

