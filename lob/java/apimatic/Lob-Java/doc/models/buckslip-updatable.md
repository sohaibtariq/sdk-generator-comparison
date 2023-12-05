
# Buckslip Updatable

## Structure

`BuckslipUpdatable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the buckslip.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `AutoReorder` | `Boolean` | Optional | Allows for auto reordering | Boolean getAutoReorder() | setAutoReorder(Boolean autoReorder) |
| `ReorderQuantity` | `Double` | Optional | The quantity of items to be reordered (only required when auto_reorder is true).<br>**Constraints**: `>= 5000`, `<= 10000000` | Double getReorderQuantity() | setReorderQuantity(Double reorderQuantity) |

## Example (as JSON)

```json
{
  "description": "description0",
  "auto_reorder": false,
  "reorder_quantity": 114.28
}
```

