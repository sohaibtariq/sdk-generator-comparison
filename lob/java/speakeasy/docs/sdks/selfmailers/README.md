# SelfMailers
(*selfMailers*)

## Overview

The self mailer endpoint allows you to easily print and mail self mailers. The API provides endpoints
for creating self mailers, retrieving individual self mailers, canceling self mailers, and retrieving a list of self mailers.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [selfMailerDelete](#selfmailerdelete) - Delete
* [selfMailerRetrieve](#selfmailerretrieve) - Retrieve
* [selfMailersList](#selfmailerslist) - List

## selfMailerDelete

Completely removes a self mailer from production. This can only be done if the self mailer's `send_date` has not yet passed. If the self mailer is successfully canceled, you will not be charged for it. This feature is exclusive to certain customers. Upgrade to the appropriate <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a> to gain access.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SelfMailerDeleteRequest;
import org.openapis.openapi.models.operations.SelfMailerDeleteResponse;
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

            SelfMailerDeleteResponse res = sdk.selfMailers.selfMailerDelete("string");

            if (res.selfMailerDeletion != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `sfmId`               | *String*              | :heavy_check_mark:    | id of the self_mailer |


### Response

**[org.openapis.openapi.models.operations.SelfMailerDeleteResponse](../../models/operations/SelfMailerDeleteResponse.md)**


## selfMailerRetrieve

Retrieves the details of an existing self_mailer. You need only supply the unique self_mailer identifier that was returned upon self_mailer creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SelfMailerRetrieveRequest;
import org.openapis.openapi.models.operations.SelfMailerRetrieveResponse;
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

            SelfMailerRetrieveResponse res = sdk.selfMailers.selfMailerRetrieve("string");

            if (res.selfMailer != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `sfmId`               | *String*              | :heavy_check_mark:    | id of the self_mailer |


### Response

**[org.openapis.openapi.models.operations.SelfMailerRetrieveResponse](../../models/operations/SelfMailerRetrieveResponse.md)**


## selfMailersList

Returns a list of your self_mailers. The self_mailers are returned sorted by creation date, with the most recently created self_mailers appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.SelfMailersListRequest;
import org.openapis.openapi.models.operations.SelfMailersListResponse;
import org.openapis.openapi.models.shared.MailType;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.SelfMailerSize;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            SelfMailersListRequest req = new SelfMailersListRequest(){{
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
                size = new org.openapis.openapi.models.shared.SelfMailerSize[]{{
                    add(SelfMailerSize.TWELVEX9_BIFOLD),
                }};
                scheduled = false;
                sendDate = "string";
                mailType = MailType.USPS_STANDARD;
                sortBy = "string";
            }};            

            SelfMailersListResponse res = sdk.selfMailers.selfMailersList(req);

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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [org.openapis.openapi.models.operations.SelfMailersListRequest](../../models/operations/SelfMailersListRequest.md) | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |


### Response

**[org.openapis.openapi.models.operations.SelfMailersListResponse](../../models/operations/SelfMailersListResponse.md)**

