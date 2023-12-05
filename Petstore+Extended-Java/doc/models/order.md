
# Order

an order object for the story

## Structure

`Order`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | unique identifier for an order | Long getId() | setId(Long id) |
| `PetId` | `Long` | Optional | unique identifier for pet as part of an order | Long getPetId() | setPetId(Long petId) |
| `Quantity` | `Integer` | Optional | total number of pets in order | Integer getQuantity() | setQuantity(Integer quantity) |
| `ShipDate` | `LocalDateTime` | Optional | order date for pet | LocalDateTime getShipDate() | setShipDate(LocalDateTime shipDate) |
| `Status` | [`OrderStatusEnum`](../../doc/models/order-status-enum.md) | Optional | Order Status | OrderStatusEnum getStatus() | setStatus(OrderStatusEnum status) |
| `Complete` | `Boolean` | Optional | completion status for an order | Boolean getComplete() | setComplete(Boolean complete) |

## Example (as JSON)

```json
{
  "id": 10,
  "petId": 1234,
  "quantity": 7,
  "shipDate": "2023-12-08T18:04:28Z",
  "status": "placed",
  "complete": false
}
```

