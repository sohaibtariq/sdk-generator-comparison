# BankAccounts
(*bankAccounts*)

## Overview

Bank Accounts allow you to store your bank account securely in our system. The API provides
endpoints for creating bank accounts, deleting bank accounts, verifying bank accounts,
retrieving individual bank accounts, and retrieving a list of bank accounts.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [bankAccountVerify](#bankaccountverify) - Verify
* [bankAccountDelete](#bankaccountdelete) - Delete
* [bankAccountRetrieve](#bankaccountretrieve) - Retrieve
* [bankAccountsList](#bankaccountslist) - List

## bankAccountVerify

Verify a bank account in order to create a check.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BankAccountVerifyRequest;
import org.openapis.openapi.models.operations.BankAccountVerifyResponse;
import org.openapis.openapi.models.shared.BankAccountVerify;
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

            BankAccountVerifyResponse res = sdk.bankAccounts.bankAccountVerify("string", new BankAccountVerify(new Long[]{{
                add(86280L),
            }}){{
                amounts = new Long[]{{
                    add(861210L),
                }};
            }});

            if (res.bankAccount != null) {
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
| `bankId`                                                                                         | *String*                                                                                         | :heavy_check_mark:                                                                               | id of the bank account to be verified                                                            |
| `bankAccountVerify`                                                                              | [org.openapis.openapi.models.shared.BankAccountVerify](../../models/shared/BankAccountVerify.md) | :heavy_check_mark:                                                                               | N/A                                                                                              |


### Response

**[org.openapis.openapi.models.operations.BankAccountVerifyResponse](../../models/operations/BankAccountVerifyResponse.md)**


## bankAccountDelete

Permanently deletes a bank account. It cannot be undone.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BankAccountDeleteRequest;
import org.openapis.openapi.models.operations.BankAccountDeleteResponse;
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

            BankAccountDeleteResponse res = sdk.bankAccounts.bankAccountDelete("string");

            if (res.bankDeletion != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `bankId`               | *String*               | :heavy_check_mark:     | id of the bank account |


### Response

**[org.openapis.openapi.models.operations.BankAccountDeleteResponse](../../models/operations/BankAccountDeleteResponse.md)**


## bankAccountRetrieve

Retrieves the details of an existing bank account. You need only supply the unique bank account identifier that was returned upon bank account creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BankAccountRetrieveRequest;
import org.openapis.openapi.models.operations.BankAccountRetrieveResponse;
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

            BankAccountRetrieveResponse res = sdk.bankAccounts.bankAccountRetrieve("string");

            if (res.bankAccount != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `bankId`               | *String*               | :heavy_check_mark:     | id of the bank account |


### Response

**[org.openapis.openapi.models.operations.BankAccountRetrieveResponse](../../models/operations/BankAccountRetrieveResponse.md)**


## bankAccountsList

Returns a list of your bank accounts. The bank accounts are returned sorted by creation date, with the most recently created bank accounts appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BankAccountsListRequest;
import org.openapis.openapi.models.operations.BankAccountsListResponse;
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

            BankAccountsListRequest req = new BankAccountsListRequest(){{
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

            BankAccountsListResponse res = sdk.bankAccounts.bankAccountsList(req);

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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [org.openapis.openapi.models.operations.BankAccountsListRequest](../../models/operations/BankAccountsListRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[org.openapis.openapi.models.operations.BankAccountsListResponse](../../models/operations/BankAccountsListResponse.md)**

