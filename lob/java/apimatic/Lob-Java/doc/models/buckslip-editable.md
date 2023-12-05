
# Buckslip Editable

## Structure

`BuckslipEditable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the buckslip.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Size` | [`SizeEnum`](../../doc/models/size-enum.md) | Optional | The size of the buckslip<br>**Default**: `SizeEnum.ENUM_875X375` | SizeEnum getSize() | setSize(SizeEnum size) |
| `Front` | [`BuckslipEditableFront`](../../doc/models/containers/buckslip-editable-front.md) | Required | This is a container for one-of cases. | BuckslipEditableFront getFront() | setFront(BuckslipEditableFront front) |
| `Back` | [`BuckslipEditableBack`](../../doc/models/containers/buckslip-editable-back.md) | Optional | This is a container for one-of cases. | BuckslipEditableBack getBack() | setBack(BuckslipEditableBack back) |

## Example (as JSON)

```json
{
  "size": "8.75x3.75",
  "front": "String9",
  "description": "description2",
  "back": "String5"
}
```

