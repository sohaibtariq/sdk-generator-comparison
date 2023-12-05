# US Autocompletions

```java
USAutocompletionsController uSAutocompletionsController = client.getUSAutocompletionsController();
```

## Class Name

`USAutocompletionsController`


# Autocompletion

Given an address prefix consisting of a partial primary line, as well as optional input of city, state, and zip code, this functionality returns up to 10 full US address suggestions. Not all of them will turn out to be valid addresses; they'll need to be [verified](#operation/verification_us).

```java
CompletableFuture<UsAutocompletions> autocompletionAsync(
    final String addressPrefix,
    final CaseEnum mCase,
    final Boolean validAddresses,
    final String city,
    final String state,
    final String zipCode,
    final Boolean geoIpSort)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `addressPrefix` | `String` | Form, Required | Only accepts numbers and street names in an alphanumeric format. |
| `mCase` | [`CaseEnum`](../../doc/models/case-enum.md) | Query, Optional | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `primary_line`, `city`, and `state`. Default casing is `upper`.<br>**Default**: `CaseEnum.UPPER` |
| `validAddresses` | `Boolean` | Query, Optional | Possible values are `true` and `false`. If false, not all of the suggestions in the response will be valid addresses; they'll need to be verified in order to determine the deliverability. The valid_addresses flag will greatly reduce the number of keystrokes needed before reaching an intended address.<br>**Default**: `false` |
| `city` | `String` | Form, Optional | An optional city input used to filter suggestions. Case insensitive and does not match partial abbreviations. |
| `state` | `String` | Form, Optional | An optional state input used to filter suggestions. Case insensitive and does not match partial abbreviations. |
| `zipCode` | `String` | Form, Optional | An optional ZIP Code input used to filter suggestions. Matches partial entries. |
| `geoIpSort` | `Boolean` | Form, Optional | If `true`, sort suggestions by proximity to the IP set in the `X-Forwarded-For` header. |

## Response Type

[`UsAutocompletions`](../../doc/models/us-autocompletions.md)

## Example Usage

```java
String addressPrefix = "185 B";
String city = "San Francisco";
String state = "CA";
String zipCode = "94107";
Boolean geoIpSort = false;

uSAutocompletionsController.autocompletionAsync(addressPrefix, null, null, city, state, zipCode, geoIpSort).thenAccept(result -> {
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
  "id": "us_auto_a3ac97bcfbb2460ab20c",
  "suggestions": [
    {
      "primary_line": "185 BAYSIDE VILLAGE PL",
      "city": "SAN FRANCISCO",
      "state": "CA",
      "zip_code": "94107"
    },
    {
      "primary_line": "185 BRANNAN ST",
      "city": "SAN FRANCISCO",
      "state": "CA",
      "zip_code": "94107"
    },
    {
      "primary_line": "185 BONIFACIO ST",
      "city": "SAN FRANCISCO",
      "state": "CA",
      "zip_code": "94107"
    },
    {
      "primary_line": "185 BLAIR TER",
      "city": "SAN FRANCISCO",
      "state": "CA",
      "zip_code": "94107"
    },
    {
      "primary_line": "185 BLUXOME ST",
      "city": "SAN FRANCISCO",
      "state": "CA",
      "zip_code": "94107"
    },
    {
      "primary_line": "210 KING ST",
      "city": "SAN FRANCISCO",
      "state": "CA",
      "zip_code": "94107"
    },
    {
      "primary_line": "185 BRYANT ST",
      "city": "SAN FRANCISCO",
      "state": "CA",
      "zip_code": "94107"
    }
  ],
  "object": "us_autocompletion"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

