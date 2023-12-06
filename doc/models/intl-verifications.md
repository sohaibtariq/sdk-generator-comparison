
# Intl Verifications

## Structure

`IntlVerifications`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Addresses` | [`List<IntlVerificationsAddresses>`](../../doc/models/containers/intl-verifications-addresses.md) | Required | This is List of a container for one-of cases. | List<IntlVerificationsAddresses> getAddresses() | setAddresses(List<IntlVerificationsAddresses> addresses) |
| `Errors` | `boolean` | Required | Indicates whether any errors occurred during the verification process. | boolean getErrors() | setErrors(boolean errors) |

## Example (as JSON)

```json
{
  "addresses": [
    {
      "recipient": "recipient0",
      "primary_line": "primary_line8",
      "secondary_line": "secondary_line4",
      "id": "id8",
      "last_line": "last_line8"
    },
    {
      "recipient": "recipient0",
      "primary_line": "primary_line8",
      "secondary_line": "secondary_line4",
      "id": "id8",
      "last_line": "last_line8"
    }
  ],
  "errors": false
}
```

