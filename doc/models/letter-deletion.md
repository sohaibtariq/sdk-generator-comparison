
# Letter Deletion

Lob uses RESTful HTTP response codes to indicate success or failure of an API request. In general, 2xx indicates success, 4xx indicate an input error, and 5xx indicates an error on Lob's end.

## Structure

`LetterDeletion`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier prefixed with `ltr_`.<br>**Constraints**: *Pattern*: `^ltr_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |

## Example (as JSON)

```json
{
  "id": "id8",
  "deleted": false
}
```

