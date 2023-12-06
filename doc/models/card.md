
# Card

## Structure

`Card`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required, Constant | Value is resource type.<br>**Default**: `"card"` | String getObject() | setObject(String object) |
| `Description` | `String` | Required | Description of the card.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Size` | [`Size1Enum`](../../doc/models/size-1-enum.md) | Optional | The size of the card<br>**Default**: `Size1Enum.ENUM_2125X3375` | Size1Enum getSize() | setSize(Size1Enum size) |
| `Id` | `String` | Required | Unique identifier prefixed with `card_`.<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Url` | `String` | Required | The signed link for the card.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getUrl() | setUrl(String url) |
| `AutoReorder` | `boolean` | Required | True if the cards should be auto-reordered.<br>**Default**: `false` | boolean getAutoReorder() | setAutoReorder(boolean autoReorder) |
| `ReorderQuantity` | `Integer` | Required | The number of cards to be reordered. | Integer getReorderQuantity() | setReorderQuantity(Integer reorderQuantity) |
| `RawUrl` | `String` | Required | The raw URL of the card.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getRawUrl() | setRawUrl(String rawUrl) |
| `FrontOriginalUrl` | `String` | Required | The original URL of the front template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getFrontOriginalUrl() | setFrontOriginalUrl(String frontOriginalUrl) |
| `BackOriginalUrl` | `String` | Required | The original URL of the back template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getBackOriginalUrl() | setBackOriginalUrl(String backOriginalUrl) |
| `Thumbnails` | [`List<Thumbnail>`](../../doc/models/thumbnail.md) | Required | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `AvailableQuantity` | `int` | Required | The available quantity of cards.<br>**Default**: `0` | int getAvailableQuantity() | setAvailableQuantity(int availableQuantity) |
| `PendingQuantity` | `int` | Required | The pending quantity of cards.<br>**Default**: `0` | int getPendingQuantity() | setPendingQuantity(int pendingQuantity) |
| `Status` | [`TheStatusOfTheCardEnum`](../../doc/models/the-status-of-the-card-enum.md) | Required | - | TheStatusOfTheCardEnum getStatus() | setStatus(TheStatusOfTheCardEnum status) |
| `Orientation` | [`OrientationEnum`](../../doc/models/orientation-enum.md) | Required | The orientation of the card.<br>**Default**: `OrientationEnum.HORIZONTAL` | OrientationEnum getOrientation() | setOrientation(OrientationEnum orientation) |
| `ThresholdAmount` | `int` | Required | The threshold amount of the card<br>**Default**: `0` | int getThresholdAmount() | setThresholdAmount(int thresholdAmount) |

## Example (as JSON)

```json
{
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "object": "card",
  "description": "description6",
  "size": "2.125x3.375",
  "id": "id6",
  "url": "url0",
  "auto_reorder": false,
  "reorder_quantity": 2,
  "raw_url": "raw_url8",
  "front_original_url": "front_original_url0",
  "back_original_url": "back_original_url2",
  "thumbnails": [
    {
      "small": "small8",
      "medium": "medium8",
      "large": "large6"
    }
  ],
  "available_quantity": 0,
  "pending_quantity": 0,
  "status": "processed",
  "orientation": "horizontal",
  "threshold_amount": 0,
  "deleted": false
}
```

