
# Us Autocompletions

## Structure

`UsAutocompletions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier prefixed with `us_auto_`.<br>**Constraints**: *Pattern*: `^us_auto_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Suggestions` | [`List<Suggestions>`](../../doc/models/suggestions.md) | Optional | An array of objects representing suggested addresses.<br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `10` | List<Suggestions> getSuggestions() | setSuggestions(List<Suggestions> suggestions) |
| `Object` | [`Object13Enum`](../../doc/models/object-13-enum.md) | Optional | Value is resource type.<br>**Default**: `Object13Enum.US_AUTOCOMPLETION` | Object13Enum getObject() | setObject(Object13Enum object) |

## Example (as JSON)

```json
{
  "object": "us_autocompletion",
  "id": "id2",
  "suggestions": [
    {
      "primary_line": "primary_line6",
      "city": "city4",
      "state": "state8",
      "zip_code": "zip_code0",
      "object": "us_autocompletion"
    },
    {
      "primary_line": "primary_line6",
      "city": "city4",
      "state": "state8",
      "zip_code": "zip_code0",
      "object": "us_autocompletion"
    }
  ]
}
```

