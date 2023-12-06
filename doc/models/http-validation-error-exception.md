
# HTTP Validation Error Exception

## Structure

`HTTPValidationErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Detail` | [`List<ValidationError>`](../../doc/models/validation-error.md) | Optional | - | List<ValidationError> getDetail() | setDetail(List<ValidationError> detail) |

## Example (as JSON)

```json
{
  "detail": [
    {
      "loc": [
        "String7",
        "String8",
        "String9"
      ],
      "msg": "msg2",
      "type": "type4"
    }
  ]
}
```

