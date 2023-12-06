# Card Orders

```java
CardOrdersController cardOrdersController = client.getCardOrdersController();
```

## Class Name

`CardOrdersController`

## Methods

* [Card Orders Retrieve](../../doc/controllers/card-orders.md#card-orders-retrieve)
* [Card Order Create](../../doc/controllers/card-orders.md#card-order-create)


# Card Orders Retrieve

Retrieves the card orders associated with the given card id.

```java
CompletableFuture<CardsOrdersResponse> cardOrdersRetrieveAsync(
    final String cardId,
    final Integer limit,
    final Integer offset)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | The ID of the card to which the card orders belong.<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `offset` | `Integer` | Query, Optional | An integer that designates the offset at which to begin returning results. Defaults to 0.<br>**Default**: `0` |

## Response Type

[`CardsOrdersResponse`](../../doc/models/cards-orders-response.md)

## Example Usage

```java
String cardId = "card_id4";
Integer limit = 10;
Integer offset = 0;

cardOrdersController.cardOrdersRetrieveAsync(cardId, limit, offset).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": [
    {
      "id": "co_e0f8a0562a06bea7f",
      "card_id": "card_6afffd19045076c",
      "status": "available",
      "inventory": 9500,
      "quantity_ordered": 10000,
      "unit_price": 0.75,
      "cancelled_reason": "No longer needed",
      "availability_date": "2021-10-12T21:41:48.326Z",
      "expected_availability_date": "2021-11-04T21:03:18.871Z",
      "date_created": "2021-10-07T21:03:18.871Z",
      "date_modified": "2021-10-16T01:00:30.144Z",
      "object": "card_order"
    }
  ],
  "object": "list",
  "next_url": null,
  "previous_url": null,
  "count": 1
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Card Order Create

Creates a new card order given information

```java
CompletableFuture<CardOrder> cardOrderCreateAsync(
    final String cardId,
    final int quantity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `cardId` | `String` | Template, Required | The ID of the card to which the card orders belong.<br>**Constraints**: *Pattern*: `^card_[a-zA-Z0-9]+$` |
| `quantity` | `int` | Form, Required | The quantity of cards in the order (minimum 10,000).<br>**Constraints**: `>= 10000`, `<= 10000000` |

## Response Type

[`CardOrder`](../../doc/models/card-order.md)

## Example Usage

```java
String cardId = "card_id4";
int quantity = 10000;

cardOrdersController.cardOrderCreateAsync(cardId, quantity).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "co_e0f8a0562a06bea7f",
  "card_id": "card_6afffd19045076c",
  "status": "available",
  "inventory": 9500,
  "quantity_ordered": 10000,
  "unit_price": 0.75,
  "cancelled_reason": "No longer needed",
  "availability_date": "2021-10-12T21:41:48.326Z",
  "expected_availability_date": "2021-11-04T21:03:18.871Z",
  "date_created": "2021-10-07T21:03:18.871Z",
  "date_modified": "2021-10-16T01:00:30.144Z",
  "object": "card_order"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

