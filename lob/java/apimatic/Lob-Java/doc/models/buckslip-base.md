
# Buckslip Base

## Structure

`BuckslipBase`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the buckslip.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Size` | [`SizeEnum`](../../doc/models/size-enum.md) | Optional | The size of the buckslip<br>**Default**: `SizeEnum.ENUM_875X375` | SizeEnum getSize() | setSize(SizeEnum size) |

## Example (as JSON)

```json
{
  "size": "8.75x3.75",
  "description": "description4"
}
```

