# Creatives
(*creatives*)

## Overview

The creatives endpoint allows you to create and view creatives. Creatives are used to create
reusable letter and postcard templates. The API provides endpoints for creating creatives, updating creatives,
retrieving individual creatives, and deleting creatives.


### Available Operations

* [creativeCreate](#creativecreate) - Create
* [creativeRetrieve](#creativeretrieve) - Retrieve
* [creativeUpdate](#creativeupdate) - Update

## creativeCreate

Creates a new creative with the provided properties

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreativeCreateRequest;
import org.openapis.openapi.models.operations.CreativeCreateResponse;
import org.openapis.openapi.models.shared.LangSpec;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CreativeCreateResponse res = sdk.creatives.creativeCreate("string", LangSpec.MATCH);

            if (res.creative != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `requestBody`                                                                                                                                                                        | *Object*                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                   | N/A                                                                                                                                                                                  |
| `xLangOutput`                                                                                                                                                                        | [org.openapis.openapi.models.shared.LangSpec](../../models/shared/LangSpec.md)                                                                                                       | :heavy_minus_sign:                                                                                                                                                                   | * `native` - Translate response to the native language of the country in the request<br/>* `match` - match the response to the language in the request<br/><br/>Default response is in English.<br/> |


### Response

**[org.openapis.openapi.models.operations.CreativeCreateResponse](../../models/operations/CreativeCreateResponse.md)**


## creativeRetrieve

Retrieves the details of an existing creative. You need only supply the unique creative identifier that was returned upon creative creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreativeRetrieveRequest;
import org.openapis.openapi.models.operations.CreativeRetrieveResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CreativeRetrieveResponse res = sdk.creatives.creativeRetrieve("crv_2a3b096c409b32c");

            if (res.creative != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         | Example             |
| ------------------- | ------------------- | ------------------- | ------------------- | ------------------- |
| `crvId`             | *String*            | :heavy_check_mark:  | id of the creative  | crv_2a3b096c409b32c |


### Response

**[org.openapis.openapi.models.operations.CreativeRetrieveResponse](../../models/operations/CreativeRetrieveResponse.md)**


## creativeUpdate

Update the details of an existing creative. You need only supply the unique identifier that was returned upon creative creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreativeUpdateRequest;
import org.openapis.openapi.models.operations.CreativeUpdateResponse;
import org.openapis.openapi.models.shared.CreativeBase;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CreativeUpdateResponse res = sdk.creatives.creativeUpdate("crv_2a3b096c409b32c", new CreativeBase(){{
                from = "string";
                metadata = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
            }});

            if (res.creative != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            | Example                                                                                |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `crvId`                                                                                | *String*                                                                               | :heavy_check_mark:                                                                     | id of the creative                                                                     | crv_2a3b096c409b32c                                                                    |
| `creativeBase`                                                                         | [org.openapis.openapi.models.shared.CreativeBase](../../models/shared/CreativeBase.md) | :heavy_check_mark:                                                                     | N/A                                                                                    |                                                                                        |


### Response

**[org.openapis.openapi.models.operations.CreativeUpdateResponse](../../models/operations/CreativeUpdateResponse.md)**

