# Intl Verifications

```java
IntlVerificationsController intlVerificationsController = client.getIntlVerificationsController();
```

## Class Name

`IntlVerificationsController`

## Methods

* [Bulk Intl Verifications](../../doc/controllers/intl-verifications.md#bulk-intl-verifications)
* [Intl Verification](../../doc/controllers/intl-verifications.md#intl-verification)


# Bulk Intl Verifications

Verify a list of international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

```java
CompletableFuture<IntlVerifications> bulkIntlVerificationsAsync(
    final List<MultipleComponentsIntl> addresses)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `addresses` | [`List<MultipleComponentsIntl>`](../../doc/models/multiple-components-intl.md) | Form, Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `20` |

## Response Type

[`IntlVerifications`](../../doc/models/intl-verifications.md)

## Example Usage

```java
List<MultipleComponentsIntl> addresses = Arrays.asList(
    new MultipleComponentsIntl.Builder(
        "370 Water St",
        CountryExtendedEnum.CA
    )
    .recipient("John Doe")
    .secondaryLine("")
    .city("Summerside")
    .state("Prince Edwards Island")
    .postalCode("C1N 1C4")
    .build(),
    new MultipleComponentsIntl.Builder(
        "UL. DOLSKAYA 1",
        CountryExtendedEnum.RU
    )
    .recipient("Jane Doe")
    .secondaryLine("")
    .city("MOSCOW")
    .state("MOSCOW G")
    .postalCode("115569")
    .build()
);

intlVerificationsController.bulkIntlVerificationsAsync(addresses).thenAccept(result -> {
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
  "addresses": [
    {
      "id": "intl_ver_c7cb63d68f8d6",
      "recipient": null,
      "primary_line": "370 WATER ST",
      "secondary_line": "",
      "last_line": "SUMMERSIDE PE C1N 1C4",
      "country": "CA",
      "coverage": "SUBBUILDING",
      "deliverability": "deliverable",
      "status": "LV4",
      "components": {
        "primary_number": "370",
        "street_name": "WATER ST",
        "city": "SUMMERSIDE",
        "state": "PE",
        "postal_code": "C1N 1C4"
      },
      "object": "intl_verification"
    }
  ],
  "errors": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Intl Verification

Verify an international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

```java
CompletableFuture<IntlVerification> intlVerificationAsync(
    final IntlVerificationWritable body,
    final XLangOutputEnum xLangOutput)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`IntlVerificationWritable`](../../doc/models/containers/intl-verification-writable.md) | Body, Required | - |
| `xLangOutput` | [`XLangOutputEnum`](../../doc/models/x-lang-output-enum.md) | Header, Optional | * `native` - Translate response to the native language of the country in the request<br>* `match` - match the response to the language in the request<br><br>Default response is in English. |

## Response Type

[`IntlVerification`](../../doc/models/intl-verification.md)

## Example Usage

```java
IntlVerificationWritable body = IntlVerificationWritable.fromMultipleComponentsIntl(
    new MultipleComponentsIntl.Builder(
        "370 Water St",
        CountryExtendedEnum.CA
    )
    .recipient("Harry Zhang")
    .secondaryLine("")
    .city("Summerside")
    .state("Prince Edward Island")
    .build()
);

intlVerificationsController.intlVerificationAsync(body, null).thenAccept(result -> {
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
  "id": "intl_ver_c7cb63d68f8d6",
  "recipient": null,
  "primary_line": "370 WATER ST",
  "secondary_line": "",
  "last_line": "SUMMERSIDE PE C1N 1C4",
  "country": "CA",
  "coverage": "SUBBUILDING",
  "deliverability": "deliverable",
  "status": "LV4",
  "components": {
    "primary_number": "370",
    "street_name": "WATER ST",
    "city": "SUMMERSIDE",
    "state": "PE",
    "postal_code": "C1N 1C4"
  },
  "object": "intl_verification"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

