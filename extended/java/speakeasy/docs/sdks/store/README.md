# Store
(*store*)

## Overview

Access to Petstore orders

Find out more about our store
<http://swagger.io>
### Available Operations

* [getInventory](#getinventory) - Returns pet inventories by status
* [placeOrder](#placeorder) - Place an order for a pet
* [deleteOrder](#deleteorder) - Delete purchase order by ID
* [getOrderById](#getorderbyid) - Find purchase order by ID

## getInventory

Returns a map of status codes to quantities

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetInventoryResponse;
import org.openapis.openapi.models.operations.GetInventorySecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetInventoryResponse res = sdk.store.getInventory(new GetInventorySecurity("string"){{
                apiKey = "";
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                     | [org.openapis.openapi.models.operations.GetInventorySecurity](../../models/operations/GetInventorySecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[org.openapis.openapi.models.operations.GetInventoryResponse](../../models/operations/GetInventoryResponse.md)**


## placeOrder

Place a new order in the store

### Example Usage

```java
package hello.world;

import java.time.OffsetDateTime;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.PlaceOrderResponse;
import org.openapis.openapi.models.shared.Order;
import org.openapis.openapi.models.shared.OrderStatus;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            org.openapis.openapi.models.shared.Order req = new Order(){{
                id = 10L;
                petId = 198772L;
                quantity = 7;
                shipDate = OffsetDateTime.parse("2023-12-08T18:04:28Z");
                status = OrderStatus.APPROVED;
                complete = true;
            }};            

            PlaceOrderResponse res = sdk.store.placeOrder(req);

            if (res.order != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `request`                                                                | [org.openapis.openapi.models.shared.Order](../../models/shared/Order.md) | :heavy_check_mark:                                                       | The request object to use for the request.                               |


### Response

**[org.openapis.openapi.models.operations.PlaceOrderResponse](../../models/operations/PlaceOrderResponse.md)**


## deleteOrder

For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will generate API errors

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeleteOrderRequest;
import org.openapis.openapi.models.operations.DeleteOrderResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            DeleteOrderResponse res = sdk.store.deleteOrder(127902L);

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `orderId`                                | *Long*                                   | :heavy_check_mark:                       | ID of the order that needs to be deleted |


### Response

**[org.openapis.openapi.models.operations.DeleteOrderResponse](../../models/operations/DeleteOrderResponse.md)**


## getOrderById

For valid response try integer IDs with value <= 5 or > 10. Other values will generate exceptions.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetOrderByIdRequest;
import org.openapis.openapi.models.operations.GetOrderByIdResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            GetOrderByIdResponse res = sdk.store.getOrderById(614993L);

            if (res.order != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `orderId`                            | *Long*                               | :heavy_check_mark:                   | ID of order that needs to be fetched |


### Response

**[org.openapis.openapi.models.operations.GetOrderByIdResponse](../../models/operations/GetOrderByIdResponse.md)**

