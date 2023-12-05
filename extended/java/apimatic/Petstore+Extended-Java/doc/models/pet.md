
# Pet

details of a pet

## Structure

`Pet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | unique identifier for a pet | Long getId() | setId(Long id) |
| `Name` | `String` | Required | name or label for a pet | String getName() | setName(String name) |
| `Category` | [`Category`](../../doc/models/category.md) | Optional | details of a cateogry object | Category getCategory() | setCategory(Category category) |
| `PhotoUrls` | `List<String>` | Required | collection of photo urls | List<String> getPhotoUrls() | setPhotoUrls(List<String> photoUrls) |
| `Tags` | [`List<Tag>`](../../doc/models/tag.md) | Optional | collection of pet tag objects | List<Tag> getTags() | setTags(List<Tag> tags) |
| `Status` | [`PetStatusEnum`](../../doc/models/pet-status-enum.md) | Optional | pet status in the store | PetStatusEnum getStatus() | setStatus(PetStatusEnum status) |

## Example (as JSON)

```json
{
  "name": "doggie",
  "category": {
    "id": 1,
    "name": "Dogs"
  },
  "photoUrls": [
    "http://www.example.com/photo.jpg"
  ],
  "tags": [
    {
      "id": 1,
      "name": "Pet"
    }
  ],
  "status": "pending",
  "id": 120
}
```

