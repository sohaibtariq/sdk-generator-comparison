# Postcards
(*postcards*)

## Overview

The postcards endpoint allows you to easily print and mail postcards. The API provides endpoints for creating postcards,
retrieving individual postcards, canceling postcards, and retrieving a list of postcards.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [postcardDelete](#postcarddelete) - Cancel
* [postcardRetrieve](#postcardretrieve) - Retrieve
* [postcardsList](#postcardslist) - List

## postcardDelete

Completely removes a postcard from production. This can only be done if the postcard has a `send_date` and the `send_date` has not yet passed. If the postcard is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a> to gain access.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PostcardDeleteRequest;
import org.openapis.openapi.models.operations.PostcardDeleteResponse;
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

            PostcardDeleteResponse res = sdk.postcards.postcardDelete("string");

            if (res.postcardDeletion != null) {
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
| `pscId`            | *String*           | :heavy_check_mark: | id of the postcard |


### Response

**[org.openapis.openapi.models.operations.PostcardDeleteResponse](../../models/operations/PostcardDeleteResponse.md)**


## postcardRetrieve

Retrieves the details of an existing postcard. You need only supply the unique customer identifier that was returned upon postcard creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PostcardRetrieveRequest;
import org.openapis.openapi.models.operations.PostcardRetrieveResponse;
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

            PostcardRetrieveResponse res = sdk.postcards.postcardRetrieve("string");

            if (res.postcard != null) {
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
| `pscId`            | *String*           | :heavy_check_mark: | id of the postcard |


### Response

**[org.openapis.openapi.models.operations.PostcardRetrieveResponse](../../models/operations/PostcardRetrieveResponse.md)**


## postcardsList

Returns a list of your postcards. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PostcardsListRequest;
import org.openapis.openapi.models.operations.PostcardsListResponse;
import org.openapis.openapi.models.shared.MailType;
import org.openapis.openapi.models.shared.PostcardSize;
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

            PostcardsListRequest req = new PostcardsListRequest(){{
                limit = 10L;
                beforeAfter = "string";
                include = new String[]{{
                    add("string"),
                }};
                dateCreated = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                metadata = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                size = new org.openapis.openapi.models.shared.PostcardSize[]{{
                    add(PostcardSize.SIXX11),
                }};
                scheduled = false;
                sendDate = "string";
                mailType = MailType.USPS_FIRST_CLASS;
                sortBy = "string";
            }};            

            PostcardsListResponse res = sdk.postcards.postcardsList(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [org.openapis.openapi.models.operations.PostcardsListRequest](../../models/operations/PostcardsListRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.PostcardsListResponse](../../models/operations/PostcardsListResponse.md)**

