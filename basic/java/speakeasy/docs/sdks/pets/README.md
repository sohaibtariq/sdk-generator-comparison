# Pets
(*pets*)

## Overview

the pet tag for grouping similar methods

### Available Operations

* [listPets](#listpets) - list all the available pets
* [createPet](#createpet) - Create a new Pet object
* [showPetById](#showpetbyid) - showPetById

## listPets

List all pets

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ListPetsRequest;
import org.openapis.openapi.models.operations.ListPetsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    bearerAuth = "";
                }})
                .build();

            ListPetsResponse res = sdk.pets.listPets(21453L);

            if (res.pets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `limit`                                         | *Long*                                          | :heavy_minus_sign:                              | limit the number of objects returned to max 100 |


### Response

**[org.openapis.openapi.models.operations.ListPetsResponse](../../models/operations/ListPetsResponse.md)**


## createPet

Create a pet and key characteristics

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreatePetResponse;
import org.openapis.openapi.models.shared.Pet;
import org.openapis.openapi.models.shared.PetPetType;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    bearerAuth = "";
                }})
                .build();

            org.openapis.openapi.models.shared.Pet req = new Pet(1234L, "Fido"){{
                petType = PetPetType.DOG;
            }};            

            CreatePetResponse res = sdk.pets.createPet(req);

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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [org.openapis.openapi.models.shared.Pet](../../models/shared/Pet.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[org.openapis.openapi.models.operations.CreatePetResponse](../../models/operations/CreatePetResponse.md)**


## showPetById

Info for a specific pet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ShowPetByIdRequest;
import org.openapis.openapi.models.operations.ShowPetByIdResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    bearerAuth = "";
                }})
                .build();

            ShowPetByIdResponse res = sdk.pets.showPetById("string");

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                     | Type                          | Required                      | Description                   |
| ----------------------------- | ----------------------------- | ----------------------------- | ----------------------------- |
| `petId`                       | *String*                      | :heavy_check_mark:            | The id of the pet to retrieve |


### Response

**[org.openapis.openapi.models.operations.ShowPetByIdResponse](../../models/operations/ShowPetByIdResponse.md)**

