
# Address Fields Intl

## Structure

`AddressFieldsIntl`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Required | The primary number, street name, and directional information.<br>**Constraints**: *Maximum Length*: `200` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | An optional field containing any information which can't fit into line 1.<br>**Constraints**: *Maximum Length*: `200` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressCity` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Optional | **Constraints**: *Maximum Length*: `200` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Optional | Optional postal code.<br>**Constraints**: *Maximum Length*: `40` | String getAddressZip() | setAddressZip(String addressZip) |

## Example (as JSON)

```json
{
  "address_line1": "address_line18",
  "address_line2": "address_line20",
  "address_city": "address_city8",
  "address_state": "address_state0",
  "address_zip": "address_zip0"
}
```

