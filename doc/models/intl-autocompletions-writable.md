
# Intl Autocompletions Writable

## Structure

`IntlAutocompletionsWritable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressPrefix` | `String` | Required | Only accepts numbers and street names in an alphanumeric format. | String getAddressPrefix() | setAddressPrefix(String addressPrefix) |
| `City` | `String` | Optional | An optional city input used to filter suggestions. Case insensitive and does not match partial abbreviations. | String getCity() | setCity(String city) |
| `State` | `String` | Optional | An optional state input used to filter suggestions. Case insensitive and does not match partial abbreviations. | String getState() | setState(String state) |
| `ZipCode` | `String` | Optional | An optional Zip Code input used to filter suggestions. Matches partial entries. | String getZipCode() | setZipCode(String zipCode) |
| `Country` | [`CountryExtendedEnum`](../../doc/models/country-extended-enum.md) | Required | Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`, `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification API. Also does not accept `PS`, which is not currently supported. | CountryExtendedEnum getCountry() | setCountry(CountryExtendedEnum country) |
| `GeoIpSort` | `Boolean` | Optional | If `true`, sort suggestions by proximity to the IP set in the `X-Forwarded-For` header. | Boolean getGeoIpSort() | setGeoIpSort(Boolean geoIpSort) |

## Example (as JSON)

```json
{
  "address_prefix": "address_prefix4",
  "city": "city6",
  "state": "state2",
  "zip_code": "zip_code0",
  "country": "ET",
  "geo_ip_sort": false
}
```

