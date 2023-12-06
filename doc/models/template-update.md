
# Template Update

## Structure

`TemplateUpdate`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `PublishedVersion` | `String` | Optional | **Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` | String getPublishedVersion() | setPublishedVersion(String publishedVersion) |

## Example (as JSON)

```json
{
  "description": "description2",
  "published_version": "published_version8"
}
```

