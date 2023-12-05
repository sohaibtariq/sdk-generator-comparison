
# Pet

A single Pet object

## Structure

`Pet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `long` | Required | a unique identifier for a Pet | long getId() | setId(long id) |
| `Name` | `String` | Required | the name lovingly given to the pet | String getName() | setName(String name) |
| `PetType` | [`PetPetTypeEnum`](../../doc/models/pet-pet-type-enum.md) | Optional | the type of pets allowed | PetPetTypeEnum getPetType() | setPetType(PetPetTypeEnum petType) |

## Example (as JSON)

```json
{
  "id": 123,
  "name": "Cody",
  "petType": "dog"
}
```

