
# Buckslip

## Structure

`Buckslip`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required, Constant | Value is resource type.<br>**Default**: `"buckslip"` | String getObject() | setObject(String object) |
| `Description` | `String` | Required | Description of the buckslip.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Size` | [`SizeEnum`](../../doc/models/size-enum.md) | Optional | The size of the buckslip<br>**Default**: `SizeEnum.ENUM_875X375` | SizeEnum getSize() | setSize(SizeEnum size) |
| `Id` | `String` | Required | Unique identifier prefixed with `bck_`.<br>**Constraints**: *Pattern*: `^bck_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `AutoReorder` | `boolean` | Required | True if the buckslips should be auto-reordered.<br>**Default**: `false` | boolean getAutoReorder() | setAutoReorder(boolean autoReorder) |
| `ReorderQuantity` | `Integer` | Required | The number of buckslips to be reordered. | Integer getReorderQuantity() | setReorderQuantity(Integer reorderQuantity) |
| `ThresholdAmount` | `int` | Required | The threshold amount of the buckslip<br>**Default**: `0` | int getThresholdAmount() | setThresholdAmount(int thresholdAmount) |
| `Url` | `String` | Required | The signed link for the buckslip.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getUrl() | setUrl(String url) |
| `RawUrl` | `String` | Required | The raw URL of the buckslip.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getRawUrl() | setRawUrl(String rawUrl) |
| `FrontOriginalUrl` | `String` | Required | The original URL of the front template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getFrontOriginalUrl() | setFrontOriginalUrl(String frontOriginalUrl) |
| `BackOriginalUrl` | `String` | Required | The original URL of the back template.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2083` | String getBackOriginalUrl() | setBackOriginalUrl(String backOriginalUrl) |
| `Thumbnails` | [`List<Thumbnail>`](../../doc/models/thumbnail.md) | Required | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `AvailableQuantity` | `double` | Required | The available quantity of buckslips.<br>**Default**: `0d` | double getAvailableQuantity() | setAvailableQuantity(double availableQuantity) |
| `AllocatedQuantity` | `double` | Required | The allocated quantity of buckslips.<br>**Default**: `0d` | double getAllocatedQuantity() | setAllocatedQuantity(double allocatedQuantity) |
| `OnhandQuantity` | `double` | Required | The onhand quantity of buckslips.<br>**Default**: `0d` | double getOnhandQuantity() | setOnhandQuantity(double onhandQuantity) |
| `PendingQuantity` | `double` | Required | The pending quantity of buckslips.<br>**Default**: `0d` | double getPendingQuantity() | setPendingQuantity(double pendingQuantity) |
| `ProjectedQuantity` | `double` | Required | The sum of pending and onhand quantities of buckslips.<br>**Default**: `0d` | double getProjectedQuantity() | setProjectedQuantity(double projectedQuantity) |
| `BuckslipOrders` | [`List<BuckslipOrder>`](../../doc/models/buckslip-order.md) | Required | An array of buckslip orders that are associated with the buckslip.<br>**Constraints**: *Minimum Items*: `0` | List<BuckslipOrder> getBuckslipOrders() | setBuckslipOrders(List<BuckslipOrder> buckslipOrders) |
| `Stock` | [`TheStockOfTheBuckslipEnum`](../../doc/models/the-stock-of-the-buckslip-enum.md) | Required | - | TheStockOfTheBuckslipEnum getStock() | setStock(TheStockOfTheBuckslipEnum stock) |
| `Weight` | `String` | Required, Constant | **Default**: `"80#"` | String getWeight() | setWeight(String weight) |
| `Finish` | [`TheFinishOfTheBuckslipEnum`](../../doc/models/the-finish-of-the-buckslip-enum.md) | Required | - | TheFinishOfTheBuckslipEnum getFinish() | setFinish(TheFinishOfTheBuckslipEnum finish) |
| `Status` | [`TheStatusOfTheBuckslipEnum`](../../doc/models/the-status-of-the-buckslip-enum.md) | Required | - | TheStatusOfTheBuckslipEnum getStatus() | setStatus(TheStatusOfTheBuckslipEnum status) |

## Example (as JSON)

```json
{
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "object": "buckslip",
  "description": "description0",
  "size": "8.75x3.75",
  "id": "id0",
  "auto_reorder": false,
  "reorder_quantity": 254,
  "threshold_amount": 0,
  "url": "url4",
  "raw_url": "raw_url2",
  "front_original_url": "front_original_url6",
  "back_original_url": "back_original_url6",
  "thumbnails": [
    {
      "small": "small8",
      "medium": "medium8",
      "large": "large6"
    }
  ],
  "available_quantity": 0.0,
  "allocated_quantity": 0.0,
  "onhand_quantity": 0.0,
  "pending_quantity": 0.0,
  "projected_quantity": 0.0,
  "buckslip_orders": [
    {
      "date_created": "2016-03-13T12:52:32.123Z",
      "date_modified": "2016-03-13T12:52:32.123Z",
      "object": "object0",
      "quantity_ordered": 0.0,
      "unit_price": 0,
      "inventory": 0,
      "deleted": false,
      "id": "id2",
      "buckslip_id": "buckslip_id8",
      "status": "printing"
    }
  ],
  "stock": "text",
  "weight": "80#",
  "finish": "gloss",
  "status": "rendered",
  "deleted": false
}
```

