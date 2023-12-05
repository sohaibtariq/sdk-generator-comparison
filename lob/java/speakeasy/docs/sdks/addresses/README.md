# Addresses
(*addresses*)

## Overview

To add an address to your address book, you create a new address object. You can retrieve and delete individual
addresses as well as get a list of addresses. Addresses are identified by a unique random ID.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [addressesList](#addresseslist) - List
* [addressCreate](#addresscreate) - Create
* [addressDelete](#addressdelete) - Delete
* [addressRetrieve](#addressretrieve) - Retrieve

## addressesList

Returns a list of your addresses. The addresses are returned sorted by creation date, with the most recently created addresses appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AddressesListRequest;
import org.openapis.openapi.models.operations.AddressesListResponse;
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

            AddressesListRequest req = new AddressesListRequest(){{
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
            }};            

            AddressesListResponse res = sdk.addresses.addressesList(req);

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
| `request`                                                                                                      | [org.openapis.openapi.models.operations.AddressesListRequest](../../models/operations/AddressesListRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.AddressesListResponse](../../models/operations/AddressesListResponse.md)**


## addressCreate

Creates a new address given information

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AddressCreateResponse;
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

            org.openapis.openapi.models.. req = "string";            

            AddressCreateResponse res = sdk.addresses.addressCreate(req);

            if (res.address != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [Object](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |


### Response

**[org.openapis.openapi.models.operations.AddressCreateResponse](../../models/operations/AddressCreateResponse.md)**


## addressDelete

Deletes the details of an existing address. You need only supply the unique identifier that was returned upon address creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AddressDeleteRequest;
import org.openapis.openapi.models.operations.AddressDeleteResponse;
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

            AddressDeleteResponse res = sdk.addresses.addressDelete("string");

            if (res.addressDeletion != null) {
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
| `adrId`            | *String*           | :heavy_check_mark: | id of the address  |


### Response

**[org.openapis.openapi.models.operations.AddressDeleteResponse](../../models/operations/AddressDeleteResponse.md)**


## addressRetrieve

Retrieves the details of an existing address. You need only supply the unique identifier that was returned upon address creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AddressRetrieveRequest;
import org.openapis.openapi.models.operations.AddressRetrieveResponse;
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

            AddressRetrieveResponse res = sdk.addresses.addressRetrieve("string");

            if (res.address != null) {
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
| `adrId`            | *String*           | :heavy_check_mark: | id of the address  |


### Response

**[org.openapis.openapi.models.operations.AddressRetrieveResponse](../../models/operations/AddressRetrieveResponse.md)**

