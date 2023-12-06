# Buckslips

The Buckslips endpoint allows you to easily create buckslips that can later be used as add-ons for Letters Campaigns. Note that a Letter Campaign with Buckslip add-on requires a minimum send quantity of 5,000 letters.
The API provides endpoints for creating buckslips, retrieving individual buckslips, creating buckslip orders, and retrieving a list of buckslips.

<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


```java
BuckslipsController buckslipsController = client.getBuckslipsController();
```

## Class Name

`BuckslipsController`

## Methods

* [Buckslips List](../../doc/controllers/buckslips.md#buckslips-list)
* [Buckslip Create](../../doc/controllers/buckslips.md#buckslip-create)
* [Buckslip Retrieve](../../doc/controllers/buckslips.md#buckslip-retrieve)
* [Buckslip Update](../../doc/controllers/buckslips.md#buckslip-update)
* [Buckslip Delete](../../doc/controllers/buckslips.md#buckslip-delete)


# Buckslips List

Returns a list of your buckslips. The buckslips are returned sorted by creation date, with the most recently created buckslips appearing first.

```java
CompletableFuture<BuckslipsResponse> buckslipsListAsync(
    final Integer limit,
    final BeforeAfter beforeAfter,
    final List<String> include)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | [`BeforeAfter`](../../doc/models/before-after.md) | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |

## Response Type

[`BuckslipsResponse`](../../doc/models/buckslips-response.md)

## Example Usage

```java
Integer limit = 10;
buckslipsController.buckslipsListAsync(limit, null, null).thenAccept(result -> {
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
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Buckslip Create

Creates a new buckslip given information

```java
CompletableFuture<Buckslip> buckslipCreateAsync(
    final BuckslipEditable body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BuckslipEditable`](../../doc/models/buckslip-editable.md) | Body, Required | - |

## Response Type

[`Buckslip`](../../doc/models/buckslip.md)

## Example Usage

```java
BuckslipEditable body = new BuckslipEditable.Builder(
    BuckslipEditableFront.fromMString(
        "https://s3-us-west-2.amazonaws.com/public.lob.com/assets/buckslip.pdf"
    )
)
.description("Test buckslip")
.back(BuckslipEditableBack.fromMString(
        "https://s3-us-west-2.amazonaws.com/public.lob.com/assets/buckslip.pdf"
    ))
.build();

buckslipsController.buckslipCreateAsync(body).thenAccept(result -> {
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
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Buckslip Retrieve

Retrieves the details of an existing buckslip. You need only supply the unique customer identifier that was returned upon buckslip creation.

```java
CompletableFuture<Buckslip> buckslipRetrieveAsync(
    final String buckslipId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `buckslipId` | `String` | Template, Required | id of the buckslip<br>**Constraints**: *Pattern*: `^bck_[a-zA-Z0-9]+$` |

## Response Type

[`Buckslip`](../../doc/models/buckslip.md)

## Example Usage

```java
String buckslipId = "buckslip_id6";

buckslipsController.buckslipRetrieveAsync(buckslipId).thenAccept(result -> {
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
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Buckslip Update

Update the details of an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

```java
CompletableFuture<Buckslip> buckslipUpdateAsync(
    final String buckslipId,
    final String description,
    final Boolean autoReorder,
    final Double reorderQuantity)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `buckslipId` | `String` | Template, Required | id of the buckslip<br>**Constraints**: *Pattern*: `^bck_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | Description of the buckslip.<br>**Constraints**: *Maximum Length*: `255` |
| `autoReorder` | `Boolean` | Form, Optional | Allows for auto reordering |
| `reorderQuantity` | `Double` | Form, Optional | The quantity of items to be reordered (only required when auto_reorder is true).<br>**Constraints**: `>= 5000`, `<= 10000000` |

## Response Type

[`Buckslip`](../../doc/models/buckslip.md)

## Example Usage

```java
String buckslipId = "buckslip_id6";
String description = "Test buckslip";
Boolean autoReorder = true;

buckslipsController.buckslipUpdateAsync(buckslipId, description, autoReorder, null).thenAccept(result -> {
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
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Buckslip Delete

Delete an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

```java
CompletableFuture<BuckslipDeletion> buckslipDeleteAsync(
    final String buckslipId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `buckslipId` | `String` | Template, Required | id of the buckslip<br>**Constraints**: *Pattern*: `^bck_[a-zA-Z0-9]+$` |

## Response Type

[`BuckslipDeletion`](../../doc/models/buckslip-deletion.md)

## Example Usage

```java
String buckslipId = "buckslip_id6";

buckslipsController.buckslipDeleteAsync(buckslipId).thenAccept(result -> {
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
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

