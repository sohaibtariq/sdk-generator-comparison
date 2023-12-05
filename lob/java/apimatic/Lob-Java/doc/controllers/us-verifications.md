# US Verifications

```java
USVerificationsController uSVerificationsController = client.getUSVerificationsController();
```

## Class Name

`USVerificationsController`

## Methods

* [Bulk Us Verifications](../../doc/controllers/us-verifications.md#bulk-us-verifications)
* [Us Verification](../../doc/controllers/us-verifications.md#us-verification)


# Bulk Us Verifications

Verify a list of US or US territory addresses _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

```java
CompletableFuture<UsVerifications> bulkUsVerificationsAsync(
    final List<MultipleComponents> addresses,
    final CaseEnum mCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `addresses` | [`List<MultipleComponents>`](../../doc/models/multiple-components.md) | Form, Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `20` |
| `mCase` | [`CaseEnum`](../../doc/models/case-enum.md) | Query, Optional | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.<br>**Default**: `CaseEnum.UPPER` |

## Response Type

[`UsVerifications`](../../doc/models/us-verifications.md)

## Example Usage

```java
List<MultipleComponents> addresses = Arrays.asList(
    new MultipleComponents.Builder(
        "210 King Street",
        "San Francisco",
        "CA",
        "94107"
    )
    .build(),
    new MultipleComponents.Builder(
        "Ave Wilson Churchill 123",
        "RIO PIEDRAS",
        "PR",
        "00926"
    )
    .recipient("Walgreens")
    .secondaryLine("")
    .urbanization("URB FAIR OAKS")
    .build()
);

CaseEnum mCase = CaseEnum.UPPER;

uSVerificationsController.bulkUsVerificationsAsync(addresses, mCase).thenAccept(result -> {
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


# Us Verification

Verify a US or US territory address _with a live API key_. The address can be in components (e.g. `primary_line` is "210 King Street", `zip_code` is "94107") or as a single string (e.g. "210 King Street 94107"), but not as both. Requests using a test API key validate required fields but return empty values unless specific `primary_line` values are provided. See the [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.

```java
CompletableFuture<UsVerification> usVerificationAsync(
    final UsVerificationsWritable body,
    final CaseEnum mCase)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UsVerificationsWritable`](../../doc/models/containers/us-verifications-writable.md) | Body, Required | - |
| `mCase` | [`CaseEnum`](../../doc/models/case-enum.md) | Query, Optional | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.<br>**Default**: `CaseEnum.UPPER` |

## Response Type

[`UsVerification`](../../doc/models/us-verification.md)

## Example Usage

```java
UsVerificationsWritable body = UsVerificationsWritable.fromMultipleComponents(
    new MultipleComponents.Builder(
        "210 King Street",
        "San Francisco",
        "CA",
        "94107"
    )
    .build()
);

uSVerificationsController.usVerificationAsync(body, null).thenAccept(result -> {
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

