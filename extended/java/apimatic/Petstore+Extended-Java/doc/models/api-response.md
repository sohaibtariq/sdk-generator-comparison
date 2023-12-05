
# Api Response

response for uploading pet image

## Structure

`ApiResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `Integer` | Optional | code response | Integer getCode() | setCode(Integer code) |
| `Type` | `String` | Optional | type of message | String getType() | setType(String type) |
| `Message` | `String` | Optional | message details | String getMessage() | setMessage(String message) |

## Example (as JSON)

```json
{
  "code": 41200,
  "type": "uploaded",
  "message": "successful uploaded"
}
```

