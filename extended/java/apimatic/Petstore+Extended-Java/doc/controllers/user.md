# User

Operations about user

```java
UserController userController = client.getUserController();
```

## Class Name

`UserController`

## Methods

* [Create User](../../doc/controllers/user.md#create-user)
* [Create Users With List Input](../../doc/controllers/user.md#create-users-with-list-input)
* [Login User](../../doc/controllers/user.md#login-user)
* [Logout User](../../doc/controllers/user.md#logout-user)
* [Get User by Name](../../doc/controllers/user.md#get-user-by-name)
* [Update User](../../doc/controllers/user.md#update-user)
* [Delete User](../../doc/controllers/user.md#delete-user)


# Create User

This can only be done by the logged in user.

```java
CompletableFuture<User> createUserAsync(
    final User body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`User`](../../doc/models/user.md) | Body, Optional | Created user object |

## Response Type

[`User`](../../doc/models/user.md)

## Example Usage

```java
User body = new User.Builder()
    .id(1234L)
    .username("theUser")
    .firstName("John")
    .lastName("James")
    .email("john@email.com")
    .password("123xyz")
    .phone("867-5309")
    .userStatus(1)
    .build();

userController.createUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Create Users With List Input

Creates list of users with given input array

```java
CompletableFuture<User> createUsersWithListInputAsync(
    final List<User> body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`List<User>`](../../doc/models/user.md) | Body, Optional | body of creating new user |

## Response Type

[`User`](../../doc/models/user.md)

## Example Usage

```java
List<User> body = Arrays.asList(
    new User.Builder()
        .id(1234L)
        .username("theUser")
        .firstName("John")
        .lastName("James")
        .email("john@email.com")
        .password("123xyz")
        .phone("867-5309")
        .userStatus(1)
        .build()
);

userController.createUsersWithListInputAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | successful operation | `ApiException` |


# Login User

log a user into the petstore

```java
CompletableFuture<String> loginUserAsync(
    final String username,
    final String password)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Query, Optional | The user name for login |
| `password` | `String` | Query, Optional | The password for login in clear text |

## Response Type

`String`

## Example Usage

```java
String username = "theUser";
String password = "foobar";

userController.loginUserAsync(username, password).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response

```
"success"
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username/password supplied | `ApiException` |


# Logout User

log out the current user

```java
CompletableFuture<Void> logoutUserAsync()
```

## Response Type

`void`

## Example Usage

```java
userController.logoutUserAsync().thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Get User by Name

retrieve a user by their username

```java
CompletableFuture<User> getUserByNameAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The name that needs to be fetched. Use user1 for testing. |

## Response Type

[`User`](../../doc/models/user.md)

## Example Usage

```java
String username = "theUser";

userController.getUserByNameAsync(username).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username supplied | `ApiException` |
| 404 | User not found | `ApiException` |


# Update User

This can only be done by the logged in user.

```java
CompletableFuture<Void> updateUserAsync(
    final String username,
    final User body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | name that need to be deleted |
| `body` | [`User`](../../doc/models/user.md) | Body, Optional | Update an existent user in the store |

## Response Type

`void`

## Example Usage

```java
String username = "theUser";
User body = new User.Builder()
    .id(1234L)
    .username("theUser")
    .firstName("John")
    .lastName("James")
    .email("john@email.com")
    .password("123xyz")
    .phone("867-5309")
    .userStatus(1)
    .build();

userController.updateUserAsync(username, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Delete User

This can only be done by the logged in user.

```java
CompletableFuture<Void> deleteUserAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The name that needs to be deleted |

## Response Type

`void`

## Example Usage

```java
String username = "theUser";

userController.deleteUserAsync(username).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid username supplied | `ApiException` |
| 404 | User not found | `ApiException` |

