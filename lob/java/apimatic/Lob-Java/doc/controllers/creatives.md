# Creatives

The creatives endpoint allows you to create and view creatives. Creatives are used to create
reusable letter and postcard templates. The API provides endpoints for creating creatives, updating creatives,
retrieving individual creatives, and deleting creatives.

```java
CreativesController creativesController = client.getCreativesController();
```

## Class Name

`CreativesController`

## Methods

* [Creative Create](../../doc/controllers/creatives.md#creative-create)
* [Creative Retrieve](../../doc/controllers/creatives.md#creative-retrieve)
* [Creative Update](../../doc/controllers/creatives.md#creative-update)


# Creative Create

Creates a new creative with the provided properties

```java
CompletableFuture<Creative> creativeCreateAsync(
    final CreativeWritable3 body,
    final XLangOutputEnum xLangOutput)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreativeWritable3`](../../doc/models/containers/creative-writable-3.md) | Body, Required | - |
| `xLangOutput` | [`XLangOutputEnum`](../../doc/models/x-lang-output-enum.md) | Header, Optional | * `native` - Translate response to the native language of the country in the request<br>* `match` - match the response to the language in the request<br><br>Default response is in English. |

## Response Type

[`Creative`](../../doc/models/creative.md)

## Example Usage

```java
CreativeWritable3 body = CreativeWritable3.fromCreativeWritable(
    new CreativeWritable.Builder(
        "postcard",
        "campaign_id2",
        CrvFront.fromMString(
            "String3"
        ),
        CrvBack.fromMString(
            "String1"
        ),
        new Writable.Builder()
            .mailType(MailTypeEnum.USPS_FIRST_CLASS)
            .size(PostcardSizeEnum.ENUM_4X6)
            .build()
    )
    .build()
);

creativesController.creativeCreateAsync(body, null).thenAccept(result -> {
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


# Creative Retrieve

Retrieves the details of an existing creative. You need only supply the unique creative identifier that was returned upon creative creation.

```java
CompletableFuture<Creative> creativeRetrieveAsync(
    final String crvId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `crvId` | `String` | Template, Required | id of the creative<br>**Constraints**: *Pattern*: `^crv_[a-zA-Z0-9]+$` |

## Response Type

[`Creative`](../../doc/models/creative.md)

## Example Usage

```java
String crvId = "crv_2a3b096c409b32c";

creativesController.creativeRetrieveAsync(crvId).thenAccept(result -> {
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


# Creative Update

Update the details of an existing creative. You need only supply the unique identifier that was returned upon creative creation.

```java
CompletableFuture<Creative> creativeUpdateAsync(
    final String crvId,
    final FromAttribute from,
    final String description,
    final Map<String, String> metadata)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `crvId` | `String` | Template, Required | id of the creative<br>**Constraints**: *Pattern*: `^crv_[a-zA-Z0-9]+$` |
| `from` | [`FromAttribute`](../../doc/models/containers/from-attribute.md) | Form, Optional | Must either be an address ID or an inline object with correct address parameters. All addresses will be standardized into uppercase without being modified by verification. |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `metadata` | `Map<String, String>` | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |

## Response Type

[`Creative`](../../doc/models/creative.md)

## Example Usage

```java
String crvId = "crv_2a3b096c409b32c";
FromAttribute from = FromAttribute.fromMString(
    "String3"
);
String description = "Test creative";
creativesController.creativeUpdateAsync(crvId, from, description, null).thenAccept(result -> {
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

