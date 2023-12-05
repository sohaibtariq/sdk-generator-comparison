# CardOrders
(*cardOrders*)

## Overview

The card orders endpoint allows you to easily create card orders for existing cards.
The API provides endpoints for creating card orders and listing card orders for a given card.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [cardOrdersRetrieve](#cardordersretrieve) - Retrieve
* [cardOrderCreate](#cardordercreate) - Create

## cardOrdersRetrieve

Retrieves the card orders associated with the given card id.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CardOrdersRetrieveRequest;
import org.openapis.openapi.models.operations.CardOrdersRetrieveResponse;
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

            CardOrdersRetrieveResponse res = sdk.cardOrders.cardOrdersRetrieve("string", 10L, 346470L);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `cardId`                                                                                  | *String*                                                                                  | :heavy_check_mark:                                                                        | The ID of the card to which the card orders belong.                                       |                                                                                           |
| `limit`                                                                                   | *Long*                                                                                    | :heavy_minus_sign:                                                                        | How many results to return.                                                               | 10                                                                                        |
| `offset`                                                                                  | *Long*                                                                                    | :heavy_minus_sign:                                                                        | An integer that designates the offset at which to begin returning results. Defaults to 0. |                                                                                           |


### Response

**[org.openapis.openapi.models.operations.CardOrdersRetrieveResponse](../../models/operations/CardOrdersRetrieveResponse.md)**


## cardOrderCreate

Creates a new card order given information

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CardOrderCreateRequest;
import org.openapis.openapi.models.operations.CardOrderCreateResponse;
import org.openapis.openapi.models.shared.CardOrderEditable;
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

            CardOrderCreateResponse res = sdk.cardOrders.cardOrderCreate("string", new CardOrderEditable(836780L){{
                quantity = 236310L;
            }});

            if (res.cardOrder != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                        | Type                                                                                             | Required                                                                                         | Description                                                                                      |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------ |
| `cardId`                                                                                         | *String*                                                                                         | :heavy_check_mark:                                                                               | The ID of the card to which the card orders belong.                                              |
| `cardOrderEditable`                                                                              | [org.openapis.openapi.models.shared.CardOrderEditable](../../models/shared/CardOrderEditable.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |


### Response

**[org.openapis.openapi.models.operations.CardOrderCreateResponse](../../models/operations/CardOrderCreateResponse.md)**

