
# Error Exception

An error object

## Structure

`ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `int` | Required | An error code for understanding the error which occured | int getCode() | setCode(int code) |
| `Message` | `String` | Required | Error message that provides human readable details about the error. | String getMessageField() | setMessageField(String messageField) |

## Example (as JSON)

```json
{
  "code": 101010,
  "message": "Invalid pet type"
}
```

