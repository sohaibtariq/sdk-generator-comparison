# Checks
(*checks*)

## Overview

Checks allow you to send payments via physical checks. The API provides endpoints
for creating checks, retrieving individual checks, canceling checks, and retrieving a list of checks.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [checksList](#checkslist) - List
* [checkCancel](#checkcancel) - Cancel
* [checkRetrieve](#checkretrieve) - Retrieve

## checksList

Returns a list of your checks. The checks are returned sorted by creation date, with the most recently created checks appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ChecksListRequest;
import org.openapis.openapi.models.operations.ChecksListResponse;
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

            ChecksListRequest req = new ChecksListRequest(){{
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
                scheduled = false;
                sendDate = "string";
                mailType = MailType.USPS_FIRST_CLASS;
                sortBy = "string";
            }};            

            ChecksListResponse res = sdk.checks.checksList(req);

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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [org.openapis.openapi.models.operations.ChecksListRequest](../../models/operations/ChecksListRequest.md) | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |


### Response

**[org.openapis.openapi.models.operations.ChecksListResponse](../../models/operations/ChecksListResponse.md)**


## checkCancel

Completely removes a check from production. This can only be done if the check has a `send_date` and the `send_date` has not yet passed. If the check is successfully canceled, you will not be charged for it. Read more on [cancellation windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings). Scheduling and cancellation is a premium feature. Upgrade to the appropriate <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a> to gain access.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CheckCancelRequest;
import org.openapis.openapi.models.operations.CheckCancelResponse;
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

            CheckCancelResponse res = sdk.checks.checkCancel("string");

            if (res.checkDeletion != null) {
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
| `chkId`            | *String*           | :heavy_check_mark: | id of the check    |


### Response

**[org.openapis.openapi.models.operations.CheckCancelResponse](../../models/operations/CheckCancelResponse.md)**


## checkRetrieve

Retrieves the details of an existing check. You need only supply the unique check identifier that was returned upon check creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CheckRetrieveRequest;
import org.openapis.openapi.models.operations.CheckRetrieveResponse;
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

            CheckRetrieveResponse res = sdk.checks.checkRetrieve("string");

            if (res.check != null) {
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
| `chkId`            | *String*           | :heavy_check_mark: | id of the check    |


### Response

**[org.openapis.openapi.models.operations.CheckRetrieveResponse](../../models/operations/CheckRetrieveResponse.md)**

