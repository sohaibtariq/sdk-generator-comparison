
# Template

## Structure

`Template`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Id` | `String` | Required | Unique identifier prefixed with `tmpl_`. ID of a saved [HTML template](#section/HTML-Templates).<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Versions` | [`List<TemplateVersion>`](../../doc/models/template-version.md) | Required | An array of all non-deleted [version objects](#tag/Template-Versions) associated with the template. | List<TemplateVersion> getVersions() | setVersions(List<TemplateVersion> versions) |
| `PublishedVersion` | [`TemplateVersion`](../../doc/models/template-version.md) | Required | - | TemplateVersion getPublishedVersion() | setPublishedVersion(TemplateVersion publishedVersion) |
| `Object` | [`Object12Enum`](../../doc/models/object-12-enum.md) | Optional | Value is resource type.<br>**Default**: `Object12Enum.TEMPLATE` | Object12Enum getObject() | setObject(Object12Enum object) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |

## Example (as JSON)

```json
{
  "id": "id6",
  "versions": [
    {
      "html": "html0",
      "engine": "legacy",
      "date_created": "2016-03-13T12:52:32.123Z",
      "date_modified": "2016-03-13T12:52:32.123Z",
      "object": "version",
      "id": "id0",
      "description": "description0",
      "required_vars": [
        "required_vars3"
      ],
      "deleted": false,
      "suggest_json_editor": false
    }
  ],
  "published_version": {
    "html": "html4",
    "engine": "legacy",
    "date_created": "2016-03-13T12:52:32.123Z",
    "date_modified": "2016-03-13T12:52:32.123Z",
    "object": "version",
    "id": "id4",
    "description": "description4",
    "required_vars": [
      "required_vars7"
    ],
    "deleted": false,
    "suggest_json_editor": false
  },
  "object": "template",
  "description": "description4",
  "metadata": {
    "key0": "metadata7"
  },
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z"
}
```

