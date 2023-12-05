# Identity Validation

```java
IdentityValidationController identityValidationController = client.getIdentityValidationController();
```

## Class Name

`IdentityValidationController`


# Identity Validation

Validates whether a given name is associated with an address.

```java
CompletableFuture<IdentityValidation> identityValidationAsync(
    final IdentityValidationWritable body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`IdentityValidationWritable`](../../doc/models/containers/identity-validation-writable.md) | Body, Required | - |

## Response Type

[`IdentityValidation`](../../doc/models/containers/identity-validation.md)

## Example Usage

```java
IdentityValidationWritable body = IdentityValidationWritable.fromRecipientInput(
    new RecipientInput.Builder(
        "Larry Lobster",
        "210 King St.",
        "San Francisco",
        "CA",
        "94107"
    )
    .secondaryLine("")
    .build()
);

identityValidationController.identityValidationAsync(body).thenAccept(result -> {
    result.match(new IdentityValidation.Cases<Void>() {
        @Override
        public Void recipientValidation(RecipientValidation recipientValidation) {
            System.out.println(recipientValidation);
            return null;
        }

        @Override
        public Void companyValidation(CompanyValidation companyValidation) {
            System.out.println(companyValidation);
            return null;
        }
    });
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

