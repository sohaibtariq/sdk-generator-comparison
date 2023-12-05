# Letters
(*letters*)

## Overview

The letters endpoint allows you to easily print and mail letters. The API provides endpoints for
creating letters, retrieving individual letters, canceling letters, and retrieving a list of letters.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [letterCancel](#lettercancel) - Cancel
* [letterRetrieve](#letterretrieve) - Retrieve
* [lettersList](#letterslist) - List

## letterCancel

Completely removes a letter from production. This can only be done if the letter has a `send_date` and the `send_date` has not yet passed. If the letter is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a> to gain access.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LetterCancelRequest;
import org.openapis.openapi.models.operations.LetterCancelResponse;
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

            LetterCancelResponse res = sdk.letters.letterCancel("string");

            if (res.letterDeletion != null) {
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
| `ltrId`            | *String*           | :heavy_check_mark: | id of the letter   |


### Response

**[org.openapis.openapi.models.operations.LetterCancelResponse](../../models/operations/LetterCancelResponse.md)**


## letterRetrieve

Retrieves the details of an existing letter. You need only supply the unique letter identifier that was returned upon letter creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LetterRetrieveRequest;
import org.openapis.openapi.models.operations.LetterRetrieveResponse;
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

            LetterRetrieveResponse res = sdk.letters.letterRetrieve("string");

            if (res.letter != null) {
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
| `ltrId`            | *String*           | :heavy_check_mark: | id of the letter   |


### Response

**[org.openapis.openapi.models.operations.LetterRetrieveResponse](../../models/operations/LetterRetrieveResponse.md)**


## lettersList

Returns a list of your letters. The letters are returned sorted by creation date, with the most recently created letters appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LettersListRequest;
import org.openapis.openapi.models.operations.LettersListResponse;
import org.openapis.openapi.models.shared.MailType;
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

            LettersListRequest req = new LettersListRequest(){{
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
                color = false;
                scheduled = false;
                sendDate = "string";
                mailType = MailType.USPS_FIRST_CLASS;
                sortBy = "string";
            }};            

            LettersListResponse res = sdk.letters.lettersList(req);

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [org.openapis.openapi.models.operations.LettersListRequest](../../models/operations/LettersListRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[org.openapis.openapi.models.operations.LettersListResponse](../../models/operations/LettersListResponse.md)**

