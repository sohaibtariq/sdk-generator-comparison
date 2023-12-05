# User
(*user*)

## Overview

Operations about user

### Available Operations

* [createUser](#createuser) - Create user
* [createUsersWithListInput](#createuserswithlistinput) - Creates list of users with given input array
* [loginUser](#loginuser) - Logs user into the system
* [logoutUser](#logoutuser) - Logs out current logged in user session
* [deleteUser](#deleteuser) - Delete user
* [getUserByName](#getuserbyname) - Get user by user name
* [updateUser](#updateuser) - Update user

## createUser

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateUserResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            org.openapis.openapi.models.shared.User req = new User(){{
                id = 10L;
                username = "theUser";
                firstName = "John";
                lastName = "James";
                email = "john@email.com";
                password = "12345";
                phone = "867-5309";
                userStatus = 1;
            }};            

            CreateUserResponse res = sdk.user.createUser(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `request`                                                              | [org.openapis.openapi.models.shared.User](../../models/shared/User.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |


### Response

**[org.openapis.openapi.models.operations.CreateUserResponse](../../models/operations/CreateUserResponse.md)**


## createUsersWithListInput

Creates list of users with given input array

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateUsersWithListInputResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            org.openapis.openapi.models.. req =             new org.openapis.openapi.models.shared.User[]{{
                add(new User(){{
                    id = 10L;
                    username = "theUser";
                    firstName = "John";
                    lastName = "James";
                    email = "john@email.com";
                    password = "12345";
                    phone = "867-5309";
                    userStatus = 1;
                }}),
            }};            

            CreateUsersWithListInputResponse res = sdk.user.createUsersWithListInput(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                      | Type                                                           | Required                                                       | Description                                                    |
| -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- | -------------------------------------------------------------- |
| `request`                                                      | [org.openapis.openapi.models.shared.User[]](../../models//.md) | :heavy_check_mark:                                             | The request object to use for the request.                     |


### Response

**[org.openapis.openapi.models.operations.CreateUsersWithListInputResponse](../../models/operations/CreateUsersWithListInputResponse.md)**


## loginUser

log a user into the petstore

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LoginUserRequest;
import org.openapis.openapi.models.operations.LoginUserResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            LoginUserResponse res = sdk.user.loginUser("string", "string");

            if (res.res != null) {
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
| `username`                           | *String*                             | :heavy_minus_sign:                   | The user name for login              |
| `password`                           | *String*                             | :heavy_minus_sign:                   | The password for login in clear text |


### Response

**[org.openapis.openapi.models.operations.LoginUserResponse](../../models/operations/LoginUserResponse.md)**


## logoutUser

log out the current user

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LogoutUserResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            LogoutUserResponse res = sdk.user.logoutUser();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.LogoutUserResponse](../../models/operations/LogoutUserResponse.md)**


## deleteUser

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeleteUserRequest;
import org.openapis.openapi.models.operations.DeleteUserResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            DeleteUserResponse res = sdk.user.deleteUser("string");

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

| Parameter                         | Type                              | Required                          | Description                       |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `username`                        | *String*                          | :heavy_check_mark:                | The name that needs to be deleted |


### Response

**[org.openapis.openapi.models.operations.DeleteUserResponse](../../models/operations/DeleteUserResponse.md)**


## getUserByName

retrieve a user by their username

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetUserByNameRequest;
import org.openapis.openapi.models.operations.GetUserByNameResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            GetUserByNameResponse res = sdk.user.getUserByName("string");

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `username`                                                | *String*                                                  | :heavy_check_mark:                                        | The name that needs to be fetched. Use user1 for testing. |


### Response

**[org.openapis.openapi.models.operations.GetUserByNameResponse](../../models/operations/GetUserByNameResponse.md)**


## updateUser

This can only be done by the logged in user.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UpdateUserRequest;
import org.openapis.openapi.models.operations.UpdateUserResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.User;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            UpdateUserResponse res = sdk.user.updateUser("string", new User(){{
                id = 10L;
                username = "theUser";
                firstName = "John";
                lastName = "James";
                email = "john@email.com";
                password = "12345";
                phone = "867-5309";
                userStatus = 1;
            }});

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

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `username`                                                             | *String*                                                               | :heavy_check_mark:                                                     | name that need to be deleted                                           |
| `user`                                                                 | [org.openapis.openapi.models.shared.User](../../models/shared/User.md) | :heavy_minus_sign:                                                     | Update an existent user in the store                                   |


### Response

**[org.openapis.openapi.models.operations.UpdateUserResponse](../../models/operations/UpdateUserResponse.md)**

