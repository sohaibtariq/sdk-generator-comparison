# BillingGroups
(*billingGroups*)

## Overview

The Billing Groups API allows you to create and view labels that can be attached to certain consumption-based
usages of Letters, Checks, Postcards and Self-Mailers to customize your bill. Please check each
resource API section to learn more about how to access the Billing Groups API.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [billingGroupRetrieve](#billinggroupretrieve) - Retrieve
* [billingGroupUpdate](#billinggroupupdate) - Update
* [billingGroupsList](#billinggroupslist) - List
* [billingGroupCreate](#billinggroupcreate) - Create

## billingGroupRetrieve

Retrieves the details of an existing billing_group. You need only supply the unique billing_group identifier that was returned upon billing_group creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BillingGroupRetrieveRequest;
import org.openapis.openapi.models.operations.BillingGroupRetrieveResponse;
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

            BillingGroupRetrieveResponse res = sdk.billingGroups.billingGroupRetrieve("string");

            if (res.billingGroup != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `bgId`                  | *String*                | :heavy_check_mark:      | id of the billing_group |


### Response

**[org.openapis.openapi.models.operations.BillingGroupRetrieveResponse](../../models/operations/BillingGroupRetrieveResponse.md)**


## billingGroupUpdate

Updates all editable attributes of the billing_group with the given id.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BillingGroupUpdateRequest;
import org.openapis.openapi.models.operations.BillingGroupUpdateResponse;
import org.openapis.openapi.models.shared.BillingGroupBase;
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

            BillingGroupUpdateResponse res = sdk.billingGroups.billingGroupUpdate("string", new BillingGroupBase(){{}});

            if (res.billingGroup != null) {
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
| `bgId`                                                                                         | *String*                                                                                       | :heavy_check_mark:                                                                             | id of the billing_group                                                                        |
| `billingGroupBase`                                                                             | [org.openapis.openapi.models.shared.BillingGroupBase](../../models/shared/BillingGroupBase.md) | :heavy_check_mark:                                                                             | N/A                                                                                            |


### Response

**[org.openapis.openapi.models.operations.BillingGroupUpdateResponse](../../models/operations/BillingGroupUpdateResponse.md)**


## billingGroupsList

Returns a list of your billing_groups. The billing_groups are returned sorted by creation date, with the most recently created billing_groups appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BillingGroupsListRequest;
import org.openapis.openapi.models.operations.BillingGroupsListResponse;
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

            BillingGroupsListRequest req = new BillingGroupsListRequest(){{
                limit = 10L;
                offset = 190361L;
                include = new String[]{{
                    add("string"),
                }};
                dateCreated = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                dateModified = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                sortBy = "string";
            }};            

            BillingGroupsListResponse res = sdk.billingGroups.billingGroupsList(req);

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

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [org.openapis.openapi.models.operations.BillingGroupsListRequest](../../models/operations/BillingGroupsListRequest.md) | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |


### Response

**[org.openapis.openapi.models.operations.BillingGroupsListResponse](../../models/operations/BillingGroupsListResponse.md)**


## billingGroupCreate

Creates a new billing_group with the provided properties.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BillingGroupCreateResponse;
import org.openapis.openapi.models.shared.BillingGroupEditable;
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

            org.openapis.openapi.models.shared.BillingGroupEditable req = new BillingGroupEditable("string"){{
                description = "Stand-alone mission-critical alliance";
            }};            

            BillingGroupCreateResponse res = sdk.billingGroups.billingGroupCreate(req);

            if (res.billingGroup != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [org.openapis.openapi.models.shared.BillingGroupEditable](../../models/shared/BillingGroupEditable.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[org.openapis.openapi.models.operations.BillingGroupCreateResponse](../../models/operations/BillingGroupCreateResponse.md)**

