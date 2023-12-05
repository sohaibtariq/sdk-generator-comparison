# Checks

Checks allow you to send payments via physical checks. The API provides endpoints
for creating checks, retrieving individual checks, canceling checks, and retrieving a list of checks.

<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


```java
ChecksController checksController = client.getChecksController();
```

## Class Name

`ChecksController`

## Methods

* [Checks List](../../doc/controllers/checks.md#checks-list)
* [Check Create](../../doc/controllers/checks.md#check-create)
* [Check Retrieve](../../doc/controllers/checks.md#check-retrieve)
* [Check Cancel](../../doc/controllers/checks.md#check-cancel)


# Checks List

Returns a list of your checks. The checks are returned sorted by creation date, with the most recently created checks appearing first.

```java
CompletableFuture<AllChecks> checksListAsync(
    final Integer limit,
    final BeforeAfter beforeAfter,
    final List<String> include,
    final Map<String, String> dateCreated,
    final Map<String, String> metadata,
    final Boolean scheduled,
    final SendDate sendDate,
    final MailTypeEnum mailType,
    final SortBy1 sortBy)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | [`BeforeAfter`](../../doc/models/before-after.md) | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |
| `dateCreated` | `Map<String, String>` | Query, Optional | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `metadata` | `Map<String, String>` | Query, Optional | Filter by metadata key-value pair`. |
| `scheduled` | `Boolean` | Query, Optional | * `true` - only return orders (past or future) where `send_date` is<br>  greater than `date_created`<br>* `false` - only return orders where `send_date` is equal to `date_created` |
| `sendDate` | [`SendDate`](../../doc/models/containers/send-date.md) | Query, Optional | A timestamp in ISO 8601 format which specifies a date after the current time and up to 180 days in the future to send the letter off for production. Setting a send date overrides the default [cancellation window](#section/Cancellation-Windows) applied to the mailpiece. Until the `send_date` has passed, the mailpiece can be canceled. If a date in the format `2017-11-01` is passed, it will evaluate to midnight UTC of that date (`2017-11-01T00:00:00.000Z`). If a datetime is passed, that exact time will be used. A `send_date` passed with no time zone will default to UTC, while a `send_date` passed with a time zone will be converted to UTC. |
| `mailType` | [`MailTypeEnum`](../../doc/models/mail-type-enum.md) | Query, Optional | A string designating the mail postage type: * `usps_first_class` - (default) * `usps_standard` - a <a href="https://lob.com/pricing/print-mail#compare" target="_blank">cheaper option</a> which is less predictable and takes longer to deliver. `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside of the United States.<br>**Default**: `MailTypeEnum.USPS_FIRST_CLASS` |
| `sortBy` | [`SortBy1`](../../doc/models/sort-by-1.md) | Query, Optional | Sorts items by ascending or descending dates. Use either `date_created` or `send_date`, not both. |

## Response Type

[`AllChecks`](../../doc/models/all-checks.md)

## Example Usage

```java
Integer limit = 10;
MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;
checksController.checksListAsync(limit, null, null, null, null, null, null, mailType, null).thenAccept(result -> {
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


# Check Create

Creates a new check with the provided properties.

```java
CompletableFuture<Check> checkCreateAsync(
    final CheckEditable body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CheckEditable`](../../doc/models/containers/check-editable.md) | Body, Required | - |
| `idempotencyKey` | `String` | Header, Optional | A string of no longer than 256 characters that uniquely identifies this resource. For more help integrating idempotency keys, refer to our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12" target="_blank">implementation guide</a>.<br>**Constraints**: *Maximum Length*: `256` |

## Response Type

[`Check`](../../doc/models/check.md)

## Example Usage

```java
CheckEditable body = CheckEditable.fromWordsAtCheckBottom(
    new WordsAtCheckBottom.Builder(
        "message2",
        ChkUseTypeEnum.MARKETING,
        WordsAtCheckBottomTo.fromMString(
            "String7"
        ),
        WordsAtCheckBottomFrom.fromMString(
            "String1"
        ),
        "bank_account6",
        32.84D
    )
    .mailType(MailType2Enum.USPS_FIRST_CLASS)
    .build()
);
String idempotencyKey = "026e7634-24d7-486c-a0bb-4a17fd0eebc5";

checksController.checkCreateAsync(body, idempotencyKey).thenAccept(result -> {
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


# Check Retrieve

Retrieves the details of an existing check. You need only supply the unique check identifier that was returned upon check creation.

```java
CompletableFuture<Check> checkRetrieveAsync(
    final String chkId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chkId` | `String` | Template, Required | id of the check<br>**Constraints**: *Pattern*: `^chk_[a-zA-Z0-9]+$` |

## Response Type

[`Check`](../../doc/models/check.md)

## Example Usage

```java
String chkId = "chk_id8";

checksController.checkRetrieveAsync(chkId).thenAccept(result -> {
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


# Check Cancel

Completely removes a check from production. This can only be done if the check has a `send_date` and the `send_date` has not yet passed. If the check is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a> to gain access.

```java
CompletableFuture<CheckDeletion> checkCancelAsync(
    final String chkId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chkId` | `String` | Template, Required | id of the check<br>**Constraints**: *Pattern*: `^chk_[a-zA-Z0-9]+$` |

## Response Type

[`CheckDeletion`](../../doc/models/check-deletion.md)

## Example Usage

```java
String chkId = "chk_id8";

checksController.checkCancelAsync(chkId).thenAccept(result -> {
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
  "id": "chk_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

