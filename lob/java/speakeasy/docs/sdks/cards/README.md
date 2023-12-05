# Cards
(*cards*)

## Overview

The cards endpoint allows you to easily create cards that can later be affixed to Letters.
The API provides endpoints for creating cards, retrieving individual cards, creating card orders, and retrieving a list of cards.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [cardsList](#cardslist) - List
* [cardCreate](#cardcreate) - Create
* [cardDelete](#carddelete) - Delete
* [cardRetrieve](#cardretrieve) - Retrieve
* [cardUpdate](#cardupdate) - Update

## cardsList

Returns a list of your cards. The cards are returned sorted by creation date, with the most recently created addresses appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CardsListRequest;
import org.openapis.openapi.models.operations.CardsListResponse;
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

            CardsListResponse res = sdk.cards.cardsList(10L, "string", new String[]{{
                add("string"),
            }});

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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `limit`                                                                                     | *Long*                                                                                      | :heavy_minus_sign:                                                                          | How many results to return.                                                                 | 10                                                                                          |
| `beforeAfter`                                                                               | *Object*                                                                                    | :heavy_minus_sign:                                                                          | `before` and `after` are both optional but only one of them can be in the query at a time.<br/> |                                                                                             |
| `include`                                                                                   | List<*String*>                                                                              | :heavy_minus_sign:                                                                          | Request that the response include the total count by specifying `include=["total_count"]`.<br/> |                                                                                             |


### Response

**[org.openapis.openapi.models.operations.CardsListResponse](../../models/operations/CardsListResponse.md)**


## cardCreate

Creates a new card given information

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CardCreateResponse;
import org.openapis.openapi.models.shared.CardEditable;
import org.openapis.openapi.models.shared.CardEditableSize;
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

            org.openapis.openapi.models.shared.CardEditable req = new CardEditable("string"){{
                description = "Sharable 6th generation customer loyalty";
                size = CardEditableSize.TWO125X3375;
                back = "string";
            }};            

            CardCreateResponse res = sdk.cards.cardCreate(req);

            if (res.card != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                              | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `request`                                                                              | [org.openapis.openapi.models.shared.CardEditable](../../models/shared/CardEditable.md) | :heavy_check_mark:                                                                     | The request object to use for the request.                                             |


### Response

**[org.openapis.openapi.models.operations.CardCreateResponse](../../models/operations/CardCreateResponse.md)**


## cardDelete

Delete an existing card. You need only supply the unique identifier that was returned upon card creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CardDeleteRequest;
import org.openapis.openapi.models.operations.CardDeleteResponse;
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

            CardDeleteResponse res = sdk.cards.cardDelete("string");

            if (res.cardDeletion != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `cardId`           | *String*           | :heavy_check_mark: | id of the card     |


### Response

**[org.openapis.openapi.models.operations.CardDeleteResponse](../../models/operations/CardDeleteResponse.md)**


## cardRetrieve

Retrieves the details of an existing card. You need only supply the unique customer identifier that was returned upon card creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CardRetrieveRequest;
import org.openapis.openapi.models.operations.CardRetrieveResponse;
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

            CardRetrieveResponse res = sdk.cards.cardRetrieve("string");

            if (res.card != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `cardId`           | *String*           | :heavy_check_mark: | id of the card     |


### Response

**[org.openapis.openapi.models.operations.CardRetrieveResponse](../../models/operations/CardRetrieveResponse.md)**


## cardUpdate

Update the details of an existing card. You need only supply the unique identifier that was returned upon card creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CardUpdateRequest;
import org.openapis.openapi.models.operations.CardUpdateResponse;
import org.openapis.openapi.models.shared.CardUpdatable;
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

            CardUpdateResponse res = sdk.cards.cardUpdate("string", new CardUpdatable(){{}});

            if (res.card != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                | Type                                                                                     | Required                                                                                 | Description                                                                              |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------- |
| `cardId`                                                                                 | *String*                                                                                 | :heavy_check_mark:                                                                       | id of the card                                                                           |
| `cardUpdatable`                                                                          | [org.openapis.openapi.models.shared.CardUpdatable](../../models/shared/CardUpdatable.md) | :heavy_check_mark:                                                                       | N/A                                                                                      |


### Response

**[org.openapis.openapi.models.operations.CardUpdateResponse](../../models/operations/CardUpdateResponse.md)**

