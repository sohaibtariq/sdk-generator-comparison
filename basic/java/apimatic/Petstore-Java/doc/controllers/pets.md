# Pets

the pet tag for grouping similar methods

```java
PetsController petsController = client.getPetsController();
```

## Class Name

`PetsController`

## Methods

* [Create Pet](../../doc/controllers/pets.md#create-pet)
* [List Pets](../../doc/controllers/pets.md#list-pets)
* [Show Pet by Id](../../doc/controllers/pets.md#show-pet-by-id)


# Create Pet

Create a pet and key characteristics

```java
CompletableFuture<Void> createPetAsync(
    final Pet body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Pet`](../../doc/models/pet.md) | Body, Required | A single Pet object used to create a new Pet |

## Response Type

`void`

## Example Usage

```java
Pet body = new Pet.Builder(
    12345L,
    "Indiana"
)
.petType(PetPetTypeEnum.DOG)
.build();

petsController.createPetAsync(body).thenAccept(result -> {
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
| Default | unexpected error | [`ErrorException`](../../doc/models/error-exception.md) |


# List Pets

List all pets

```java
CompletableFuture<List<Pet>> listPetsAsync(
    final Integer limit)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `limit` | `Integer` | Query, Optional | limit the number of objects returned to max 100<br>**Constraints**: `<= 100` |

## Response Type

[`List<Pet>`](../../doc/models/pet.md)

## Example Usage

```java
Integer limit = 10;

petsController.listPetsAsync(limit).thenAccept(result -> {
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
[
  {
    "id": 10101,
    "name": "indiana",
    "petType": "cat"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | unexpected error | [`ErrorException`](../../doc/models/error-exception.md) |


# Show Pet by Id

Info for a specific pet

```java
CompletableFuture<Pet> showPetByIdAsync(
    final String petId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `String` | Template, Required | The id of the pet to retrieve |

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
String petId = "33918";

petsController.showPetByIdAsync(petId).thenAccept(result -> {
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
  "id": 12345,
  "name": "Cody",
  "petType": "dog"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | unexpected error | [`ErrorException`](../../doc/models/error-exception.md) |

