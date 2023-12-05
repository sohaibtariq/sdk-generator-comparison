
# User

details of a user

## Structure

`User`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | unique identifier for user object | Long getId() | setId(Long id) |
| `Username` | `String` | Optional | username for a user object | String getUsername() | setUsername(String username) |
| `FirstName` | `String` | Optional | first name for a user object | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Optional | last name for a user object | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Optional | email for a user object | String getEmail() | setEmail(String email) |
| `Password` | `String` | Optional | password for a user object | String getPassword() | setPassword(String password) |
| `Phone` | `String` | Optional | phone for a user object | String getPhone() | setPhone(String phone) |
| `UserStatus` | `Integer` | Optional | User Status | Integer getUserStatus() | setUserStatus(Integer userStatus) |

## Example (as JSON)

```json
{
  "id": 1234,
  "username": "theUser",
  "firstName": "John",
  "lastName": "James",
  "email": "john@email.com",
  "password": "123xyz",
  "phone": "867-5309",
  "userStatus": 1
}
```

