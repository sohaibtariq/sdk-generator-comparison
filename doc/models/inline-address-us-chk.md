
# Inline Address Us Chk

## Structure

`InlineAddressUsChk`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Name` | `String` | Optional | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address.<br>**Constraints**: *Maximum Length*: `40` | String getName() | setName(String name) |
| `Company` | `String` | Optional | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address. This field can be used for any secondary recipient information which is not part of the actual mailing address (Company Name, Department, Attention Line, etc).<br>**Constraints**: *Maximum Length*: `40` | String getCompany() | setCompany(String company) |
| `AddressLine1` | `String` | Required | The primary number, street name, and directional information.<br>**Constraints**: *Maximum Length*: `50` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | An optional field for address unit information. Total string sum of this plus `address_line1` may not exceed 50 characters.<br>**Constraints**: *Maximum Length*: `50` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressCity` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Required | 2 letter state short-name code<br>**Constraints**: *Pattern*: `^[a-zA-Z]{2}$` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Required | Must follow the ZIP format of `12345` or ZIP+4 format of `12345-1234`.<br>**Constraints**: *Pattern*: `^\d{5}(-\d{4})?$` | String getAddressZip() | setAddressZip(String addressZip) |
| `Phone` | `String` | Optional | Must be no longer than 40 characters.<br>**Constraints**: *Maximum Length*: `40` | String getPhone() | setPhone(String phone) |
| `Email` | `String` | Optional | Must be no longer than 100 characters.<br>**Constraints**: *Maximum Length*: `100` | String getEmail() | setEmail(String email) |
| `AddressCountry` | [`AddressCountry2Enum`](../../doc/models/address-country-2-enum.md) | Optional | **Default**: `AddressCountry2Enum.US` | AddressCountry2Enum getAddressCountry() | setAddressCountry(AddressCountry2Enum addressCountry) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |

## Example (as JSON)

```json
{
  "address_line1": "address_line16",
  "address_city": "address_city2",
  "address_state": "address_state4",
  "address_zip": "address_zip4",
  "address_country": "US",
  "description": "description2",
  "name": "name2",
  "company": "company2",
  "address_line2": "address_line24",
  "phone": "phone8"
}
```

