
# Upload Export Error Exception

## Structure

`UploadExportErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | [`Code1Enum`](../../doc/models/code-1-enum.md) | Required | A conventional HTTP status code | Code1Enum getCode() | setCode(Code1Enum code) |
| `Message` | `String` | Required | A human-readable message with more details about the error | String getMessageField() | setMessageField(String messageField) |
| `Errors` | `List<String>` | Required | An array of pre-defined strings that identify an error | List<String> getErrors() | setErrors(List<String> errors) |

## Example (as JSON)

```json
{
  "code": 400,
  "message": "Invalid body, check 'errors' property for more info.",
  "errors": [
    "type must be a string"
  ]
}
```

