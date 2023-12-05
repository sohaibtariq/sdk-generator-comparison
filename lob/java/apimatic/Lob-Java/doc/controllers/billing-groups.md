# Billing Groups

```java
BillingGroupsController billingGroupsController = client.getBillingGroupsController();
```

## Class Name

`BillingGroupsController`

## Methods

* [Billing Group Retrieve](../../doc/controllers/billing-groups.md#billing-group-retrieve)
* [Billing Group Update](../../doc/controllers/billing-groups.md#billing-group-update)
* [Billing Groups List](../../doc/controllers/billing-groups.md#billing-groups-list)
* [Billing Group Create](../../doc/controllers/billing-groups.md#billing-group-create)


# Billing Group Retrieve

Retrieves the details of an existing billing_group. You need only supply the unique billing_group identifier that was returned upon billing_group creation.

```java
CompletableFuture<BillingGroup> billingGroupRetrieveAsync(
    final String bgId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bgId` | `String` | Template, Required | id of the billing_group<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` |

## Response Type

[`BillingGroup`](../../doc/models/billing-group.md)

## Example Usage

```java
String bgId = "bg_id8";

billingGroupsController.billingGroupRetrieveAsync(bgId).thenAccept(result -> {
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
  "id": "bg_c94e83ca2cd5121",
  "name": "Marketing Dept",
  "description": "Usage group used for the Marketing Dept resource sends",
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "billing_group"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Billing Group Update

Updates all editable attributes of the billing_group with the given id.

```java
CompletableFuture<BillingGroup> billingGroupUpdateAsync(
    final String bgId,
    final String description,
    final String name)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bgId` | `String` | Template, Required | id of the billing_group<br>**Constraints**: *Pattern*: `^bg_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | Description of the billing group.<br>**Constraints**: *Maximum Length*: `255` |
| `name` | `String` | Form, Optional | Name of the billing group.<br>**Constraints**: *Maximum Length*: `255` |

## Response Type

[`BillingGroup`](../../doc/models/billing-group.md)

## Example Usage

```java
String bgId = "bg_id8";
String description = "Usage group used for the Marketing Dept resource sends";
String name = "Marketing Dept";

billingGroupsController.billingGroupUpdateAsync(bgId, description, name).thenAccept(result -> {
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
  "id": "bg_c94e83ca2cd5121",
  "name": "Marketing Dept",
  "description": "Usage group used for the Marketing Dept resource sends",
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "billing_group"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Billing Groups List

Returns a list of your billing_groups. The billing_groups are returned sorted by creation date, with the most recently created billing_groups appearing first.

```java
CompletableFuture<BillingGroupsResponse> billingGroupsListAsync(
    final Integer limit,
    final Integer offset,
    final List<String> include,
    final Map<String, String> dateCreated,
    final Map<String, String> dateModified,
    final SortBy sortBy)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `offset` | `Integer` | Query, Optional | An integer that designates the offset at which to begin returning results. Defaults to 0.<br>**Default**: `0` |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |
| `dateCreated` | `Map<String, String>` | Query, Optional | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `dateModified` | `Map<String, String>` | Query, Optional | Filter by date modified. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `sortBy` | [`SortBy`](../../doc/models/sort-by.md) | Query, Optional | Sorts items by ascending or descending dates. Use either `date_created` or `date_modified`, not both. |

## Response Type

[`BillingGroupsResponse`](../../doc/models/billing-groups-response.md)

## Example Usage

```java
Integer limit = 10;
Integer offset = 0;
billingGroupsController.billingGroupsListAsync(limit, offset, null, null, null, null).thenAccept(result -> {
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
      "id": "bg_d5a5a89da9106f8",
      "description": "Test billing_group",
      "metadata": {},
      "date_created": "2019-07-27T23:49:01.511Z",
      "date_modified": "2019-07-27T23:49:01.511Z",
      "object": "billing_group"
    },
    {
      "id": "bg_59b2150ae120887",
      "description": "Test billing_group",
      "metadata": {},
      "date_created": "2019-03-29T10:22:34.642Z",
      "date_modified": "2019-03-29T10:22:34.642Z",
      "object": "billing_group"
    }
  ],
  "object": "list",
  "next_url": null,
  "prev_url": null,
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Billing Group Create

Creates a new billing_group with the provided properties.

```java
CompletableFuture<BillingGroup> billingGroupCreateAsync(
    final BillingGroupEditable body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`BillingGroupEditable`](../../doc/models/billing-group-editable.md) | Body, Required | - |

## Response Type

[`BillingGroup`](../../doc/models/billing-group.md)

## Example Usage

```java
BillingGroupEditable body = new BillingGroupEditable.Builder(
    "Marketing Dept"
)
.description("Usage group used for the Marketing Dept resource sends")
.build();

billingGroupsController.billingGroupCreateAsync(body).thenAccept(result -> {
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
  "id": "bg_c94e83ca2cd5121",
  "name": "Marketing Dept",
  "description": "Usage group used for the Marketing Dept resource sends",
  "date_created": "2017-11-07T22:56:10.962Z",
  "date_modified": "2017-11-07T22:56:10.962Z",
  "object": "billing_group"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

