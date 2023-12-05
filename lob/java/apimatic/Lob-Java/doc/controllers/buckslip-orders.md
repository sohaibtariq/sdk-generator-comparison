# Buckslip Orders

```java
BuckslipOrdersController buckslipOrdersController = client.getBuckslipOrdersController();
```

## Class Name

`BuckslipOrdersController`

## Methods

* [Buckslip Orders Retrieve](../../doc/controllers/buckslip-orders.md#buckslip-orders-retrieve)
* [Buckslip Order Create](../../doc/controllers/buckslip-orders.md#buckslip-order-create)


# Buckslip Orders Retrieve

Retrieves the buckslip orders associated with the given buckslip id.

```java
CompletableFuture<BuckslipsOrdersResponse> buckslipOrdersRetrieveAsync(
    final String buckslipId,
    final Integer limit,
    final Integer offset)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `buckslipId` | `String` | Template, Required | The ID of the buckslip to which the buckslip orders belong.<br>**Constraints**: *Pattern*: `^bck_[a-zA-Z0-9]+$` |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `offset` | `Integer` | Query, Optional | An integer that designates the offset at which to begin returning results. Defaults to 0.<br>**Default**: `0` |

## Response Type

[`BuckslipsOrdersResponse`](../../doc/models/buckslips-orders-response.md)

## Example Usage

```java
String buckslipId = "buckslip_id6";
Integer limit = 10;
Integer offset = 0;

buckslipOrdersController.buckslipOrdersRetrieveAsync(buckslipId, limit, offset).thenAccept(result -> {
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
      "id": "bo_e0f8a0562a06bea7f",
      "buckslip_id": "bck_6afffd19045076c",
      "status": "available",
      "quantity_ordered": 5000,
      "unit_price": 0.75,
      "cancelled_reason": "No longer needed",
      "availability_date": "2021-10-12T21:41:48.326Z",
      "expected_availability_date": "2021-11-04T21:03:18.871Z",
      "date_created": "2021-10-07T21:03:18.871Z",
      "date_modified": "2021-10-16T01:00:30.144Z",
      "object": "buckslip_order"
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


# Buckslip Order Create

Creates a new buckslip order given information

```java
CompletableFuture<BuckslipOrder> buckslipOrderCreateAsync(
    final String buckslipId,
    final int quantity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `buckslipId` | `String` | Template, Required | The ID of the buckslip to which the buckslip orders belong.<br>**Constraints**: *Pattern*: `^bck_[a-zA-Z0-9]+$` |
| `quantity` | `int` | Form, Required | The quantity of buckslips in the order (minimum 5,000).<br>**Constraints**: `>= 5000`, `<= 10000000` |

## Response Type

[`BuckslipOrder`](../../doc/models/buckslip-order.md)

## Example Usage

```java
String buckslipId = "buckslip_id6";
int quantity = 10000;

buckslipOrdersController.buckslipOrderCreateAsync(buckslipId, quantity).thenAccept(result -> {
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
  "id": "bo_e0f8a0562a06bea7f",
  "buckslip_id": "bck_6afffd19045076c",
  "status": "available",
  "quantity_ordered": 10000,
  "unit_price": 0.75,
  "cancelled_reason": "No longer needed",
  "availability_date": "2021-10-12T21:41:48.326Z",
  "expected_availability_date": "2021-11-04T21:03:18.871Z",
  "date_created": "2021-10-07T21:03:18.871Z",
  "date_modified": "2021-10-16T01:00:30.144Z",
  "object": "buckslip_order"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

