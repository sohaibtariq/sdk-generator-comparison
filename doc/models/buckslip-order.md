
# Buckslip Order

## Structure

`BuckslipOrder`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required | Value is resource type. | String getObject() | setObject(String object) |
| `Id` | `String` | Optional | Unique identifier prefixed with `bo_`.<br>**Constraints**: *Pattern*: `^bo_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `BuckslipId` | `String` | Optional | Unique identifier prefixed with `bck_`.<br>**Constraints**: *Pattern*: `^bck_[a-zA-Z0-9]+$` | String getBuckslipId() | setBuckslipId(String buckslipId) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | The status of the buckslip order. | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `QuantityOrdered` | `Double` | Optional | The quantity of buckslips ordered.<br>**Default**: `0d` | Double getQuantityOrdered() | setQuantityOrdered(Double quantityOrdered) |
| `UnitPrice` | `Double` | Optional | The unit price for the buckslip order.<br>**Default**: `0d` | Double getUnitPrice() | setUnitPrice(Double unitPrice) |
| `Inventory` | `Double` | Optional | The inventory of the buckslip order.<br>**Default**: `0d` | Double getInventory() | setInventory(Double inventory) |
| `CancelledReason` | `String` | Optional | The reason for cancellation. | String getCancelledReason() | setCancelledReason(String cancelledReason) |
| `AvailabilityDate` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getAvailabilityDate() | setAvailabilityDate(LocalDateTime availabilityDate) |
| `ExpectedAvailabilityDate` | `LocalDateTime` | Optional | The fixed deadline for the buckslips to be printed. | LocalDateTime getExpectedAvailabilityDate() | setExpectedAvailabilityDate(LocalDateTime expectedAvailabilityDate) |

## Example (as JSON)

```json
{
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "object": "object2",
  "quantity_ordered": 0.0,
  "unit_price": 0,
  "inventory": 0,
  "deleted": false,
  "id": "id0",
  "buckslip_id": "buckslip_id6",
  "status": "cancelled"
}
```

