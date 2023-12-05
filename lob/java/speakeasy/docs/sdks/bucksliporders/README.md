# BuckslipOrders
(*buckslipOrders*)

## Overview

The Buckslip Orders endpoint allows you to easily create buckslip orders for existing buckslips.
The API provides endpoints for creating buckslip orders and listing buckslip orders for a given buckslip.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [buckslipOrdersRetrieve](#buckslipordersretrieve) - Retrieve
* [buckslipOrderCreate](#buckslipordercreate) - Create

## buckslipOrdersRetrieve

Retrieves the buckslip orders associated with the given buckslip id.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BuckslipOrdersRetrieveRequest;
import org.openapis.openapi.models.operations.BuckslipOrdersRetrieveResponse;
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

            BuckslipOrdersRetrieveResponse res = sdk.buckslipOrders.buckslipOrdersRetrieve("string", 10L, 780435L);

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
| `buckslipId`                                                                              | *String*                                                                                  | :heavy_check_mark:                                                                        | The ID of the buckslip to which the buckslip orders belong.                               |                                                                                           |
| `limit`                                                                                   | *Long*                                                                                    | :heavy_minus_sign:                                                                        | How many results to return.                                                               | 10                                                                                        |
| `offset`                                                                                  | *Long*                                                                                    | :heavy_minus_sign:                                                                        | An integer that designates the offset at which to begin returning results. Defaults to 0. |                                                                                           |


### Response

**[org.openapis.openapi.models.operations.BuckslipOrdersRetrieveResponse](../../models/operations/BuckslipOrdersRetrieveResponse.md)**


## buckslipOrderCreate

Creates a new buckslip order given information

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BuckslipOrderCreateRequest;
import org.openapis.openapi.models.operations.BuckslipOrderCreateResponse;
import org.openapis.openapi.models.shared.BuckslipOrderEditable;
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

            BuckslipOrderCreateResponse res = sdk.buckslipOrders.buckslipOrderCreate("string", new BuckslipOrderEditable(800712L){{
                quantity = 478033L;
            }});

            if (res.buckslipOrder != null) {
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
| `buckslipId`                                                                                             | *String*                                                                                                 | :heavy_check_mark:                                                                                       | The ID of the buckslip to which the buckslip orders belong.                                              |
| `buckslipOrderEditable`                                                                                  | [org.openapis.openapi.models.shared.BuckslipOrderEditable](../../models/shared/BuckslipOrderEditable.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |


### Response

**[org.openapis.openapi.models.operations.BuckslipOrderCreateResponse](../../models/operations/BuckslipOrderCreateResponse.md)**

