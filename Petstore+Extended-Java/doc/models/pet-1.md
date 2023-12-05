
# Pet 1

## Structure

`Pet1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Category` | [`Category`](../../doc/models/category.md) | Optional | details of a cateogry object | Category getCategory() | setCategory(Category category) |
| `PhotoUrls` | `List<String>` | Optional | collection of photo urls | List<String> getPhotoUrls() | setPhotoUrls(List<String> photoUrls) |
| `Tags` | [`List<Tag>`](../../doc/models/tag.md) | Optional | collection of pet tag objects | List<Tag> getTags() | setTags(List<Tag> tags) |
| `Status` | [`PetStatusEnum`](../../doc/models/pet-status-enum.md) | Optional | pet status in the store | PetStatusEnum getStatus() | setStatus(PetStatusEnum status) |

## Example (as JSON)

```json
{
  "id": 10,
  "name": "doggie",
  "category": {
    "id": 1,
    "name": "Dogs"
  },
  "photoUrls": [
    "https://www.example.com/image.jpeg"
  ],
  "tags": [
    {
      "id": 1234,
      "name": "Hugo"
    }
  ],
  "status": "pending"
}
```

