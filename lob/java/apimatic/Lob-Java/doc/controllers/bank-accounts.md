# Bank Accounts

```java
BankAccountsController bankAccountsController = client.getBankAccountsController();
```

## Class Name

`BankAccountsController`

## Methods

* [Bank Account Verify](../../doc/controllers/bank-accounts.md#bank-account-verify)
* [Bank Account Retrieve](../../doc/controllers/bank-accounts.md#bank-account-retrieve)
* [Bank Account Delete](../../doc/controllers/bank-accounts.md#bank-account-delete)
* [Bank Accounts List](../../doc/controllers/bank-accounts.md#bank-accounts-list)
* [Bank Account Create](../../doc/controllers/bank-accounts.md#bank-account-create)


# Bank Account Verify

Verify a bank account in order to create a check.

```java
CompletableFuture<BankAccount> bankAccountVerifyAsync(
    final String bankId,
    final List<Integer> amounts)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bankId` | `String` | Template, Required | id of the bank account to be verified<br>**Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` |
| `amounts` | `List<Integer>` | Form, Required | In live mode, an array containing the two micro deposits (in cents) placed in the bank account. In test mode, no micro deposits will be placed, so any two integers between `1` and `100` will work.<br>**Constraints**: *Minimum Items*: `2`, *Maximum Items*: `2`, `>= 1`, `<= 100` |

## Response Type

[`BankAccount`](../../doc/models/bank-account.md)

## Example Usage

```java
String bankId = "bank_id2";
List<Integer> amounts = Arrays.asList(
    1,
    100
);

bankAccountsController.bankAccountVerifyAsync(bankId, amounts).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_8cad8df5354d33f",
  "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
  "description": "Test Bank Account",
  "metadata": {},
  "routing_number": "322271627",
  "fractional_routing_number": "25-3/440",
  "check_template": "jpm",
  "account_number": "123456789",
  "account_type": "company",
  "signatory": "John Doe",
  "bank_name": "J.P. MORGAN CHASE BANK, N.A.,",
  "bank_city": "Columbus",
  "bank_state": "OH",
  "bank_zip": "43240",
  "verified": false,
  "date_created": "2015-11-06T19:24:24.440Z",
  "date_modified": "2015-11-06T19:24:24.440Z",
  "object": "bank_account"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Bank Account Retrieve

Retrieves the details of an existing bank account. You need only supply the unique bank account identifier that was returned upon bank account creation.

```java
CompletableFuture<BankAccount> bankAccountRetrieveAsync(
    final String bankId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bankId` | `String` | Template, Required | id of the bank account<br>**Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` |

## Response Type

[`BankAccount`](../../doc/models/bank-account.md)

## Example Usage

```java
String bankId = "bank_id2";

bankAccountsController.bankAccountRetrieveAsync(bankId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_8cad8df5354d33f",
  "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
  "description": "Test Bank Account",
  "metadata": {},
  "routing_number": "322271627",
  "fractional_routing_number": "25-3/440",
  "check_template": "jpm",
  "account_number": "123456789",
  "account_type": "company",
  "signatory": "John Doe",
  "bank_name": "J.P. MORGAN CHASE BANK, N.A.,",
  "bank_city": "Columbus",
  "bank_state": "OH",
  "bank_zip": "43240",
  "verified": false,
  "date_created": "2015-11-06T19:24:24.440Z",
  "date_modified": "2015-11-06T19:24:24.440Z",
  "object": "bank_account"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Bank Account Delete

Permanently deletes a bank account. It cannot be undone.

```java
CompletableFuture<BankDeletion> bankAccountDeleteAsync(
    final String bankId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `bankId` | `String` | Template, Required | id of the bank account<br>**Constraints**: *Pattern*: `^bank_[a-zA-Z0-9]+$` |

## Response Type

[`BankDeletion`](../../doc/models/bank-deletion.md)

## Example Usage

```java
String bankId = "bank_id2";

bankAccountsController.bankAccountDeleteAsync(bankId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_123456789",
  "deleted": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Bank Accounts List

Returns a list of your bank accounts. The bank accounts are returned sorted by creation date, with the most recently created bank accounts appearing first.

```java
CompletableFuture<AllBankAccounts> bankAccountsListAsync(
    final Integer limit,
    final BeforeAfter beforeAfter,
    final List<String> include,
    final Map<String, String> dateCreated,
    final Map<String, String> metadata)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | [`BeforeAfter`](../../doc/models/before-after.md) | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |
| `dateCreated` | `Map<String, String>` | Query, Optional | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |
| `metadata` | `Map<String, String>` | Query, Optional | Filter by metadata key-value pair`. |

## Response Type

[`AllBankAccounts`](../../doc/models/all-bank-accounts.md)

## Example Usage

```java
Integer limit = 10;
bankAccountsController.bankAccountsListAsync(limit, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "data": [
    {
      "id": "bank_0e3fb07eba0b35b",
      "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
      "description": "Example bank account",
      "metadata": {},
      "routing_number": "122100024",
      "account_number": "1234564789",
      "account_type": "company",
      "signatory": "John Doe",
      "bank_name": "JPMORGAN CHASE BANK, NA",
      "verified": true,
      "date_created": "2019-03-30T13:13:22.200Z",
      "date_modified": "2019-03-30T13:13:23.385Z",
      "object": "bank_account"
    },
    {
      "id": "bank_eba93f7de3c02d9",
      "description": "Example bank account",
      "metadata": {},
      "routing_number": "122100024",
      "account_number": "1234564789",
      "account_type": "company",
      "signatory": "John Doe",
      "bank_name": "JPMORGAN CHASE BANK, NA",
      "verified": true,
      "date_created": "2019-03-30T13:11:06.809Z",
      "date_modified": "2019-03-30T13:11:07.872Z",
      "object": "bank_account"
    }
  ],
  "object": "list",
  "next_url": "https://api.lob.com/v1/bank_accounts?limit=2&after=eyJkYXRlT2Zmc2V0IjoiMjAxOS0wMy0zMFQxMzoxMTowNi44MDlaIiwiaWRPZmZzZXQiOiJiYW5rX2ViYTkzZjdkZTNjMDJkOSJ9",
  "previous_url": null,
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Bank Account Create

Creates a new bank account with the provided properties. Bank accounts created in live mode will need to be verified via micro deposits before being able to send live checks. The deposits will appear in the bank account in 2-3 business days and have the description "VERIFICATION".

```java
CompletableFuture<BankAccount> bankAccountCreateAsync(
    final String routingNumber,
    final String accountNumber,
    final AccountTypeEnum accountType,
    final String signatory,
    final String description,
    final CheckTemplateEnum checkTemplate,
    final String fractionalRoutingNumber,
    final String city,
    final String state,
    final String zipcode,
    final Map<String, String> metadata)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `routingNumber` | `String` | Form, Required | Must be a <a href="https://www.frbservices.org/index.html" target="_blank">valid US routing number</a>.<br>**Constraints**: *Minimum Length*: `9`, *Maximum Length*: `9` |
| `accountNumber` | `String` | Form, Required | **Constraints**: *Maximum Length*: `17` |
| `accountType` | [`AccountTypeEnum`](../../doc/models/account-type-enum.md) | Form, Required | The type of entity that holds the account. |
| `signatory` | `String` | Form, Required | The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the <a href="https://dashboard.lob.com/#/login" target="_blank">Dashboard</a>.<br>**Constraints**: *Maximum Length*: `30` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `checkTemplate` | [`CheckTemplateEnum`](../../doc/models/check-template-enum.md) | Form, Optional | The check template used for printing. The defualt value is `common`. If you bank with JP Morgan Chase and wish to use Positive Pay use the `jpm` template. `jpm` requires additional information to be provided. |
| `fractionalRoutingNumber` | `String` | Form, Optional | The fractional routing number for your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the fractional routing number associated with your home bank institution. |
| `city` | `String` | Form, Optional | The city associated with your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the city associated with your home bank institution. |
| `state` | `String` | Form, Optional | The state associated with your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the state associated with your home bank institution. |
| `zipcode` | `String` | Form, Optional | The zipcode associated with your home bank account. Required for the `jpm` check template only. Please contact a bank representative if you do not know the zipcode associated with your home bank institution. |
| `metadata` | `Map<String, String>` | Form, Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |

## Response Type

[`BankAccount`](../../doc/models/bank-account.md)

## Example Usage

```java
String routingNumber = "322271627";
String accountNumber = "123456789";
AccountTypeEnum accountType = AccountTypeEnum.INDIVIDUAL;
String signatory = "Jane Doe";
String description = "Test Bank Account";
Map<String, String> metadata = new LinkedHashMap<String, String>() {{
    put("spiffy", "true");
}};

bankAccountsController.bankAccountCreateAsync(routingNumber, accountNumber, accountType, signatory, description, null, null, null, null, null, metadata).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "bank_8cad8df5354d33f",
  "signature_url": "https://lob-assets.com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a",
  "description": "Test Bank Account",
  "metadata": {},
  "routing_number": "322271627",
  "fractional_routing_number": "25-3/440",
  "check_template": "jpm",
  "account_number": "123456789",
  "account_type": "company",
  "signatory": "John Doe",
  "bank_name": "J.P. MORGAN CHASE BANK, N.A.,",
  "bank_city": "Columbus",
  "bank_state": "OH",
  "bank_zip": "43240",
  "verified": false,
  "date_created": "2015-11-06T19:24:24.440Z",
  "date_modified": "2015-11-06T19:24:24.440Z",
  "object": "bank_account"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

