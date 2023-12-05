
# Uploads Exports Response

## Structure

`UploadsExportsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Unique identifier prefixed with `ex_`.<br>**Constraints**: *Pattern*: `^ex_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the export was created | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the export was last modified | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `boolean` | Required | Returns as `true` if the resource has been successfully deleted. | boolean getDeleted() | setDeleted(boolean deleted) |
| `S3Url` | `String` | Required | The URL for the generated export file. | String getS3Url() | setS3Url(String s3Url) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Required | The state of the export file, which can be `in_progress`, `failed` or `succeeded`. | StateEnum getState() | setState(StateEnum state) |
| `Type` | [`Type1Enum`](../../doc/models/type-1-enum.md) | Required | The export file type, which can be `all`, `failures` or `successes`. | Type1Enum getType() | setType(Type1Enum type) |
| `UploadId` | `String` | Required | Unique identifier prefixed with `upl_`.<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` | String getUploadId() | setUploadId(String uploadId) |

## Example (as JSON)

```json
{
  "id": "id4",
  "dateCreated": "2016-03-13T12:52:32.123Z",
  "dateModified": "2016-03-13T12:52:32.123Z",
  "deleted": false,
  "s3Url": "s3Url4",
  "state": "succeeded",
  "type": "successes",
  "uploadId": "uploadId6"
}
```

