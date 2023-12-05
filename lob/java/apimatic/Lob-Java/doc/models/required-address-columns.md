
# Required Address Columns

The mapping of column headers in your file to Lob-required fields for the resource created. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#required-columns-2" target="_blank">Campaign Audience Guide</a> for additional details.

## Structure

`RequiredAddressColumns`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The column header from the csv file that should be mapped to the required field `name` | String getName() | setName(String name) |
| `AddressLine1` | `String` | Required | The column header from the csv file that should be mapped to the required field `address_line1` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressCity` | `String` | Required | The column header from the csv file that should be mapped to the required field `address_city` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Required | The column header from the csv file that should be mapped to the required field `address_state` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Required | The column header from the csv file that should be mapped to the required field `address_zip` | String getAddressZip() | setAddressZip(String addressZip) |

## Example (as JSON)

```json
{
  "name": "recipient_name",
  "address_line1": "primary_line",
  "address_city": "city",
  "address_state": "state",
  "address_zip": "zip_code"
}
```

