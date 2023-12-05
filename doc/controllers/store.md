# Store

Access to Petstore orders

Find out more about our store: [http://swagger.io](http://swagger.io)

```java
StoreController storeController = client.getStoreController();
```

## Class Name

`StoreController`

## Methods

* [Get Inventory](../../doc/controllers/store.md#get-inventory)
* [Place Order](../../doc/controllers/store.md#place-order)
* [Get Order by Id](../../doc/controllers/store.md#get-order-by-id)
* [Delete Order](../../doc/controllers/store.md#delete-order)


# Get Inventory

Returns a map of status codes to quantities

```java
CompletableFuture<Map<String, Integer>> getInventoryAsync()
```

## Response Type

`Map<String, Integer>`

## Example Usage

```java
storeController.getInventoryAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Place Order

Place a new order in the store

```java
CompletableFuture<Order> placeOrderAsync(
    final Order body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Order`](../../doc/models/order.md) | Body, Optional | body of order request |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
Order body = new Order.Builder()
    .id(10L)
    .petId(1234L)
    .quantity(7)
    .shipDate(DateTimeHelper.fromRfc8601DateTime("2023-12-08T18:04:28Z"))
    .status(OrderStatusEnum.PLACED)
    .complete(false)
    .build();

storeController.placeOrderAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 405 | Invalid input | `ApiException` |


# Get Order by Id

For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions.

```java
CompletableFuture<Order> getOrderByIdAsync(
    final long orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `long` | Template, Required | ID of order that needs to be fetched |

## Response Type

[`Order`](../../doc/models/order.md)

## Example Usage

```java
long orderId = 1234L;

storeController.getOrderByIdAsync(orderId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Order not found | `ApiException` |


# Delete Order

For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

```java
CompletableFuture<Void> deleteOrderAsync(
    final long orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `long` | Template, Required | ID of the order that needs to be deleted |

## Response Type

`void`

## Example Usage

```java
long orderId = 1234L;

storeController.deleteOrderAsync(orderId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Order not found | `ApiException` |

