
# Validation Error

## Structure

`ValidationError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Loc` | [`List<ValidationErrorLoc>`](../../doc/models/containers/validation-error-loc.md) | Required | This is List of a container for any-of cases. | List<ValidationErrorLoc> getLoc() | setLoc(List<ValidationErrorLoc> loc) |
| `Msg` | `String` | Required | - | String getMsg() | setMsg(String msg) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "loc": [
    "String9",
    "String0"
  ],
  "msg": "msg4",
  "type": "type8"
}
```

