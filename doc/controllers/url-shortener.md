# URL Shortener

```java
URLShortenerController uRLShortenerController = client.getURLShortenerController();
```

## Class Name

`URLShortenerController`

## Methods

* [Domain Get](../../doc/controllers/url-shortener.md#domain-get)
* [Domain Delete](../../doc/controllers/url-shortener.md#domain-delete)
* [Domain Create](../../doc/controllers/url-shortener.md#domain-create)
* [Domain List](../../doc/controllers/url-shortener.md#domain-list)
* [Domain Delete Links](../../doc/controllers/url-shortener.md#domain-delete-links)
* [Links List](../../doc/controllers/url-shortener.md#links-list)
* [Links Get](../../doc/controllers/url-shortener.md#links-get)
* [Link Update](../../doc/controllers/url-shortener.md#link-update)
* [Links Delete](../../doc/controllers/url-shortener.md#links-delete)
* [Link Create](../../doc/controllers/url-shortener.md#link-create)
* [Link Bulk Create](../../doc/controllers/url-shortener.md#link-bulk-create)


# Domain Get

Retrieve details for a single domain.

```java
CompletableFuture<DomainResponse> domainGetAsync(
    final String domainId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `String` | Template, Required | Unique identifier for a domain. |

## Response Type

[`DomainResponse`](../../doc/models/domain-response.md)

## Example Usage

```java
String domainId = "domain_id2";

uRLShortenerController.domainGetAsync(domainId).thenAccept(result -> {
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


# Domain Delete

Delete a registered domain. This operation can only be performed if all associated links with the domain are deleted.

```java
CompletableFuture<DomainResponse> domainDeleteAsync(
    final String domainId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `String` | Template, Required | Unique identifier for a domain. |

## Response Type

[`DomainResponse`](../../doc/models/domain-response.md)

## Example Usage

```java
String domainId = "domain_id2";

uRLShortenerController.domainDeleteAsync(domainId).thenAccept(result -> {
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


# Domain Create

Add a new custom domain that can be used to create custom links.

```java
CompletableFuture<DomainResponse> domainCreateAsync(
    final String domain)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domain` | `String` | Form, Required | The registered domain/hostname. |

## Response Type

[`DomainResponse`](../../doc/models/domain-response.md)

## Example Usage

```java
String domain = "lob.st";

uRLShortenerController.domainCreateAsync(domain).thenAccept(result -> {
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


# Domain List

Retrieve a list of all created domains.

```java
CompletableFuture<DomainsResponse> domainListAsync()
```

## Response Type

[`DomainsResponse`](../../doc/models/domains-response.md)

## Example Usage

```java
uRLShortenerController.domainListAsync().thenAccept(result -> {
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


# Domain Delete Links

Delete all associated links for a domain

```java
CompletableFuture<DomainsResponse> domainDeleteLinksAsync(
    final String domainId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `domainId` | `String` | Template, Required | Unique identifier for a domain. |

## Response Type

[`DomainsResponse`](../../doc/models/domains-response.md)

## Example Usage

```java
String domainId = "domain_id2";

uRLShortenerController.domainDeleteLinksAsync(domainId).thenAccept(result -> {
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


# Links List

Retrieves a list of shortened links. The list is sorted by  creation date, with the most recently created appearing first.

```java
CompletableFuture<LinksResponse> linksListAsync(
    final Integer limit,
    final Integer offset,
    final List<String> include,
    final Map<String, String> dateCreated,
    final Map<String, String> metadata,
    final String campaignId,
    final Boolean clicked,
    final String billingGroupId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `offset` | `Integer` | Query, Optional | An integer that designates the offset at which to begin returning results. Defaults to 0.<br>**Default**: `0` |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |
| `dateCreated` | `Map<String, String>` | Query, Optional | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `metadata` | `Map<String, String>` | Query, Optional | Filter by metadata key-value pair`. |
| `campaignId` | `String` | Query, Optional | Filter the links generated for a particular campaign using its campaign id.<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` |
| `clicked` | `Boolean` | Query, Optional | Retrieve the list of links that have been opened. |
| `billingGroupId` | `String` | Query, Optional | Filter the links generated for a particular billing group id. |

## Response Type

[`LinksResponse`](../../doc/models/links-response.md)

## Example Usage

```java
Integer limit = 10;
Integer offset = 0;

uRLShortenerController.linksListAsync(limit, offset, null, null, null, null, null, null).thenAccept(result -> {
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


# Links Get

Retrievs a single shortened link.

```java
CompletableFuture<LinkResponse> linksGetAsync(
    final String linkId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `linkId` | `String` | Template, Required | Unique identifier for a link. |

## Response Type

[`LinkResponse`](../../doc/models/link-response.md)

## Example Usage

```java
String linkId = "link_id0";

uRLShortenerController.linksGetAsync(linkId).thenAccept(result -> {
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


# Link Update

Update any of the properties of a shortened link.

```java
CompletableFuture<LinkResponse> linkUpdateAsync(
    final String linkId,
    final String redirectLink,
    final String domain,
    final String slug,
    final Map<String, String> metadataTag,
    final String billingGroupId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `linkId` | `String` | Template, Required | Unique identifier for a link. |
| `redirectLink` | `String` | Form, Required | The original target URL. |
| `domain` | `String` | Form, Optional | The registered domain to be used for the short URL. |
| `slug` | `String` | Form, Optional | The unique path for the shortened URL, if empty a unique path will be used. |
| `metadataTag` | `Map<String, String>` | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |
| `billingGroupId` | `String` | Form, Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href="#tag/Billing-Groups">Billing Group API</a> for more information. |

## Response Type

[`LinkResponse`](../../doc/models/link-response.md)

## Example Usage

```java
String linkId = "link_id0";
String redirectLink = "redirect_link0";

uRLShortenerController.linkUpdateAsync(linkId, redirectLink, null, null, null, null).thenAccept(result -> {
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


# Links Delete

Delete the shortened link.

```java
CompletableFuture<LinkResponse> linksDeleteAsync(
    final String linkId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `linkId` | `String` | Template, Required | Unique identifier for a link. |

## Response Type

[`LinkResponse`](../../doc/models/link-response.md)

## Example Usage

```java
String linkId = "link_id0";

uRLShortenerController.linksDeleteAsync(linkId).thenAccept(result -> {
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


# Link Create

Given a long URL, shorten your URL either by using a custom domain or Lob's own short domain.

```java
CompletableFuture<LinkResponse> linkCreateAsync(
    final String redirectLink,
    final String domain,
    final String slug,
    final Map<String, String> metadataTag,
    final String billingGroupId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `redirectLink` | `String` | Form, Required | The original target URL. |
| `domain` | `String` | Form, Optional | The registered domain to be used for the short URL. |
| `slug` | `String` | Form, Optional | The unique path for the shortened URL, if empty a unique path will be used. |
| `metadataTag` | `Map<String, String>` | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |
| `billingGroupId` | `String` | Form, Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href="#tag/Billing-Groups">Billing Group API</a> for more information. |

## Response Type

[`LinkResponse`](../../doc/models/link-response.md)

## Example Usage

```java
String redirectLink = "https://www.lob.com";
String domain = "lob.st";

uRLShortenerController.linkCreateAsync(redirectLink, domain, null, null, null).thenAccept(result -> {
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


# Link Bulk Create

Shortens a list of links in a single request.

```java
CompletableFuture<LinksResponse> linkBulkCreateAsync(
    final List<LinkSingle> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<LinkSingle>`](../../doc/models/link-single.md) | Body, Required | **Constraints**: *Minimum Items*: `1`, *Maximum Items*: `1000` |

## Response Type

[`LinksResponse`](../../doc/models/links-response.md)

## Example Usage

```java
List<LinkSingle> body = Arrays.asList(
    new LinkSingle.Builder(
        "redirect_link6"
    )
    .build()
);

uRLShortenerController.linkBulkCreateAsync(body).thenAccept(result -> {
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

