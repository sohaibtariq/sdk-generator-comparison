
# Card Editable

## Structure

`CardEditable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the card.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Size` | [`Size1Enum`](../../doc/models/size-1-enum.md) | Optional | The size of the card<br>**Default**: `Size1Enum.ENUM_2125X3375` | Size1Enum getSize() | setSize(Size1Enum size) |
| `Front` | [`CardEditableFront`](../../doc/models/containers/card-editable-front.md) | Required | This is a container for one-of cases. | CardEditableFront getFront() | setFront(CardEditableFront front) |
| `Back` | [`CardEditableBack`](../../doc/models/containers/card-editable-back.md) | Optional | This is a container for one-of cases. | CardEditableBack getBack() | setBack(CardEditableBack back) |

## Example (as JSON)

```json
{
  "size": "2.125x3.375",
  "front": "String9",
  "description": "description8",
  "back": "String7"
}
```

