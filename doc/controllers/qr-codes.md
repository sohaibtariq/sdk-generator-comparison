# QR Codes

```java
QRCodesController qRCodesController = client.getQRCodesController();
```

## Class Name

`QRCodesController`


# Qr Codes List

Returns a list of your QR codes. The QR codes are returned sorted by scan date, with the most recently scanned QR codes appearing first.

```java
CompletableFuture<QrCodeAnalyticsResponse> qrCodesListAsync(
    final Integer limit,
    final Integer offset,
    final List<String> include,
    final Map<String, String> dateCreated,
    final Boolean scanned,
    final List<String> resourceIds)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `offset` | `Integer` | Query, Optional | An integer that designates the offset at which to begin returning results. Defaults to 0.<br>**Default**: `0` |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |
| `dateCreated` | `Map<String, String>` | Query, Optional | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `scanned` | `Boolean` | Query, Optional | Filter list of responses to only include QR codes with at least one scan event. |
| `resourceIds` | `List<String>` | Query, Optional | Filter by the resource ID.<br>**Constraints**: *Maximum Items*: `100` |

## Response Type

[`QrCodeAnalyticsResponse`](../../doc/models/qr-code-analytics-response.md)

## Example Usage

```java
Integer limit = 10;
Integer offset = 0;
qRCodesController.qrCodesListAsync(limit, offset, null, null, null, null).thenAccept(result -> {
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
      "resource_id": "ltr_d5a5a89da9106f8",
      "date_created": "2019-07-27T23:49:01.511Z",
      "number_of_scans": 2,
      "scans": [
        {
          "ip_location": "127.0.0.1",
          "scan_date": "2022-07-27T23:49:01.511Z"
        },
        {
          "ip_location": "127.0.0.1",
          "scan_date": "2022-07-29T23:45:00.436Z"
        }
      ]
    },
    {
      "resource_id": "psc_d5a5a89da9106f8",
      "date_created": "2022-09-27T23:49:01.511Z",
      "number_of_scans": 1,
      "scans": [
        {
          "ip_location": "127.0.0.1",
          "scan_date": "2022-09-27T23:49:01.511Z"
        }
      ]
    }
  ],
  "object": "list",
  "count": 2,
  "scanned_count": 2,
  "total_count": 2
}
```

