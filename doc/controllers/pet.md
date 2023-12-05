# Pet

Everything about your Pets

Find out more: [http://swagger.io](http://swagger.io)

```java
PetController petController = client.getPetController();
```

## Class Name

`PetController`

## Methods

* [Update Pet](../../doc/controllers/pet.md#update-pet)
* [Add Pet](../../doc/controllers/pet.md#add-pet)
* [Find Pets by Status](../../doc/controllers/pet.md#find-pets-by-status)
* [Find Pets by Tags](../../doc/controllers/pet.md#find-pets-by-tags)
* [Get Pet by Id](../../doc/controllers/pet.md#get-pet-by-id)
* [Update Pet With Form](../../doc/controllers/pet.md#update-pet-with-form)
* [Delete Pet](../../doc/controllers/pet.md#delete-pet)
* [Upload File](../../doc/controllers/pet.md#upload-file)


# Update Pet

Update an existing pet by Id

```java
CompletableFuture<Pet> updatePetAsync(
    final Pet1 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Pet1`](../../doc/models/pet-1.md) | Body, Required | Created user object |

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
Pet1 body = new Pet1.Builder()
    .id(10L)
    .name("doggie")
    .category(new Category.Builder()
        .id(1L)
        .name("Dogs")
        .build())
    .photoUrls(Arrays.asList(
        "https://www.example.com/image.jpeg"
    ))
    .tags(Arrays.asList(
        new Tag.Builder()
            .id(1234L)
            .name("Hugo")
            .build()
    ))
    .status(PetStatusEnum.PENDING)
    .build();

petController.updatePetAsync(body).thenAccept(result -> {
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
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Pet not found | `ApiException` |
| 405 | Validation exception | `ApiException` |


# Add Pet

Add a new pet to the store

```java
CompletableFuture<Pet> addPetAsync(
    final Pet body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Pet`](../../doc/models/pet.md) | Body, Required | Create a new pet in the store |

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
Pet body = new Pet.Builder(
    "doggie",
    Arrays.asList(
        "http://www.example.com/photo.jpg"
    )
)
.category(new Category.Builder()
        .id(1L)
        .name("Dogs")
        .build())
.tags(Arrays.asList(
        new Tag.Builder()
            .id(1L)
            .name("Pet")
            .build()
    ))
.status(PetStatusEnum.PENDING)
.build();

petController.addPetAsync(body).thenAccept(result -> {
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
| 405 | Invalid input | `ApiException` |


# Find Pets by Status

Multiple status values can be provided with comma separated strings

```java
CompletableFuture<List<Pet>> findPetsByStatusAsync(
    final PetStatusEnum status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `status` | [`PetStatusEnum`](../../doc/models/pet-status-enum.md) | Query, Optional | Status values that need to be considered for filter |

## Response Type

[`List<Pet>`](../../doc/models/pet.md)

## Example Usage

```java
PetStatusEnum status = PetStatusEnum.PENDING;

petController.findPetsByStatusAsync(status).thenAccept(result -> {
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
    "name": "doggie",
    "category": {
      "id": 1,
      "name": "Dogs"
    },
    "photoUrls": [
      "http://www.example.com/photo.jpg"
    ],
    "tags": [
      {
        "id": 1,
        "name": "Pet"
      }
    ],
    "status": "pending"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid status value | `ApiException` |


# Find Pets by Tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

```java
CompletableFuture<List<Pet>> findPetsByTagsAsync(
    final List<Tag> tags)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tags` | [`List<Tag>`](../../doc/models/tag.md) | Query, Optional | Tags to filter by |

## Response Type

[`List<Pet>`](../../doc/models/pet.md)

## Example Usage

```java
List<Tag> tags = Arrays.asList(
    new Tag.Builder()
        .id(1234L)
        .name("Hugo")
        .build()
);

petController.findPetsByTagsAsync(tags).thenAccept(result -> {
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
    "name": "doggie",
    "category": {
      "id": 1,
      "name": "Dogs"
    },
    "photoUrls": [
      "http://www.example.com/photo.jpg"
    ],
    "tags": [
      {
        "id": 1,
        "name": "Pet"
      }
    ],
    "status": "pending"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid tag value | `ApiException` |


# Get Pet by Id

Returns a single pet

```java
CompletableFuture<Pet> getPetByIdAsync(
    final long petId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | ID of pet to return |

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
long petId = 1234L;

petController.getPetByIdAsync(petId).thenAccept(result -> {
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
| 400 | Invalid ID supplied | `ApiException` |
| 404 | Pet not found | `ApiException` |


# Update Pet With Form

update a pet using form data

```java
CompletableFuture<Pet> updatePetWithFormAsync(
    final long petId,
    final String name,
    final String status)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | ID of pet that needs to be updated |
| `name` | `String` | Query, Optional | Name of pet that needs to be updated |
| `status` | `String` | Query, Optional | Status of pet that needs to be updated |

## Response Type

[`Pet`](../../doc/models/pet.md)

## Example Usage

```java
long petId = 12345L;
String name = "Fido";
String status = "pending";

petController.updatePetWithFormAsync(petId, name, status).thenAccept(result -> {
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
| 405 | Invalid input | `ApiException` |


# Delete Pet

delete a pet based on a unique id

```java
CompletableFuture<Void> deletePetAsync(
    final long petId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | Pet id to delete |

## Response Type

`void`

## Example Usage

```java
long petId = 1234L;

petController.deletePetAsync(petId).thenAccept(result -> {
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
| 400 | Invalid pet value | `ApiException` |


# Upload File

upload an image of a pet

```java
CompletableFuture<ApiResponse> uploadFileAsync(
    final long petId,
    final String additionalMetadata,
    final FileWrapper body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `petId` | `long` | Template, Required | ID of pet to update |
| `additionalMetadata` | `String` | Query, Optional | Additional Metadata |
| `body` | `FileWrapper` | Form, Optional | binary data for body of request |

## Response Type

[`ApiResponse`](../../doc/models/api-response.md)

## Example Usage

```java
long petId = 123L;
String additionalMetadata = "foobar";

petController.uploadFileAsync(petId, additionalMetadata, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

