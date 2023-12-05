
# Billing Group

## Structure

`BillingGroup`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | Description of the billing group.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Name` | `String` | Optional | Name of the billing group.<br>**Constraints**: *Maximum Length*: `255` | String getName() | setName(String name) |
| `Id` | `String` | Optional | Unique identifier prefixed with `bg_`.<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Object` | [`ObjectTypeEnum`](../../doc/models/object-type-enum.md) | Optional | Value is resource type.<br>**Default**: `ObjectTypeEnum.BILLING_GROUP` | ObjectTypeEnum getObject() | setObject(ObjectTypeEnum object) |

## Example (as JSON)

```json
{
  "object": "billing_group",
  "description": "description0",
  "name": "name0",
  "id": "id0",
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z"
}
```

