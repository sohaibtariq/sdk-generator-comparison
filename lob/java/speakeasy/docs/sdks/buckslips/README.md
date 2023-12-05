# Buckslips
(*buckslips*)

## Overview

The Buckslips endpoint allows you to easily create buckslips that can later be used as add-ons for Letters Campaigns. Note that a Letter Campaign with Buckslip add-on requires a minimum send quantity of 5,000 letters.
The API provides endpoints for creating buckslips, retrieving individual buckslips, creating buckslip orders, and retrieving a list of buckslips.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [buckslipsList](#buckslipslist) - List
* [buckslipCreate](#buckslipcreate) - Create
* [buckslipDelete](#buckslipdelete) - Delete
* [buckslipRetrieve](#buckslipretrieve) - Retrieve
* [buckslipUpdate](#buckslipupdate) - Update

## buckslipsList

Returns a list of your buckslips. The buckslips are returned sorted by creation date, with the most recently created buckslips appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BuckslipsListRequest;
import org.openapis.openapi.models.operations.BuckslipsListResponse;
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

            BuckslipsListResponse res = sdk.buckslips.buckslipsList(10L, "string", new String[]{{
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

**[org.openapis.openapi.models.operations.BuckslipsListResponse](../../models/operations/BuckslipsListResponse.md)**


## buckslipCreate

Creates a new buckslip given information

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BuckslipCreateResponse;
import org.openapis.openapi.models.shared.BuckslipEditable;
import org.openapis.openapi.models.shared.BuckslipEditableSize;
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

            org.openapis.openapi.models.shared.BuckslipEditable req = new BuckslipEditable("string"){{
                description = "Multi-channelled leading edge structure";
                size = BuckslipEditableSize.EIGHT75X375;
                back = "string";
            }};            

            BuckslipCreateResponse res = sdk.buckslips.buckslipCreate(req);

            if (res.buckslip != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [org.openapis.openapi.models.shared.BuckslipEditable](../../models/shared/BuckslipEditable.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[org.openapis.openapi.models.operations.BuckslipCreateResponse](../../models/operations/BuckslipCreateResponse.md)**


## buckslipDelete

Delete an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BuckslipDeleteRequest;
import org.openapis.openapi.models.operations.BuckslipDeleteResponse;
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

            BuckslipDeleteResponse res = sdk.buckslips.buckslipDelete("string");

            if (res.buckslipDeletion != null) {
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
| `buckslipId`       | *String*           | :heavy_check_mark: | id of the buckslip |


### Response

**[org.openapis.openapi.models.operations.BuckslipDeleteResponse](../../models/operations/BuckslipDeleteResponse.md)**


## buckslipRetrieve

Retrieves the details of an existing buckslip. You need only supply the unique customer identifier that was returned upon buckslip creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BuckslipRetrieveRequest;
import org.openapis.openapi.models.operations.BuckslipRetrieveResponse;
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

            BuckslipRetrieveResponse res = sdk.buckslips.buckslipRetrieve("string");

            if (res.buckslip != null) {
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
| `buckslipId`       | *String*           | :heavy_check_mark: | id of the buckslip |


### Response

**[org.openapis.openapi.models.operations.BuckslipRetrieveResponse](../../models/operations/BuckslipRetrieveResponse.md)**


## buckslipUpdate

Update the details of an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BuckslipUpdateRequest;
import org.openapis.openapi.models.operations.BuckslipUpdateResponse;
import org.openapis.openapi.models.shared.BuckslipUpdatable;
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

            BuckslipUpdateResponse res = sdk.buckslips.buckslipUpdate("string", new BuckslipUpdatable(){{}});

            if (res.buckslip != null) {
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
| `buckslipId`                                                                                     | *String*                                                                                         | :heavy_check_mark:                                                                               | id of the buckslip                                                                               |
| `buckslipUpdatable`                                                                              | [org.openapis.openapi.models.shared.BuckslipUpdatable](../../models/shared/BuckslipUpdatable.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |


### Response

**[org.openapis.openapi.models.operations.BuckslipUpdateResponse](../../models/operations/BuckslipUpdateResponse.md)**

