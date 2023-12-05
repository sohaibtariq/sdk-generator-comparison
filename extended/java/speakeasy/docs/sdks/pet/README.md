# Pet
(*pet*)

## Overview

Everything about your Pets

Find out more
<http://swagger.io>
### Available Operations

* [addPet](#addpet) - Add a new pet to the store
* [updatePet](#updatepet) - Update an existing pet
* [findPetsByStatus](#findpetsbystatus) - Finds Pets by status
* [deletePet](#deletepet) - Deletes a pet
* [getPetById](#getpetbyid) - Find pet by ID
* [updatePetWithForm](#updatepetwithform) - Updates a pet in the store with form data
* [uploadFile](#uploadfile) - uploads an image

## addPet

Add a new pet to the store

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AddPetResponse;
import org.openapis.openapi.models.shared.Category;
import org.openapis.openapi.models.shared.Pet;
import org.openapis.openapi.models.shared.PetStatus;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Tag;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            org.openapis.openapi.models.shared.Pet req = new Pet("doggie", new String[]{{
    add("https://www.example.com/image.jpeg"),
}}){{
                id = 123L;
                category = new Category(){{
                    id = 1L;
                    name = "Dogs";
                }};
                tags = new org.openapis.openapi.models.shared.Tag[]{{
                    add(new Tag(){{
                        id = 1234L;
                        name = "Hugo";
                    }}),
                }};
                status = PetStatus.PENDING;
            }};            

            AddPetResponse res = sdk.pet.addPet(req);

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

| Parameter                                                            | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `request`                                                            | [org.openapis.openapi.models.shared.Pet](../../models/shared/Pet.md) | :heavy_check_mark:                                                   | The request object to use for the request.                           |


### Response

**[org.openapis.openapi.models.operations.AddPetResponse](../../models/operations/AddPetResponse.md)**


## updatePet

Update an existing pet by Id

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UpdatePetResponse;
import org.openapis.openapi.models.shared.Category;
import org.openapis.openapi.models.shared.PetStatus;
import org.openapis.openapi.models.shared.RequestBodiePet;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Tag;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            org.openapis.openapi.models.shared.RequestBodiePet req = new RequestBodiePet(){{
                id = 10L;
                name = "doggie";
                category = new Category(){{
                    id = 1L;
                    name = "Dogs";
                }};
                photoUrls = new String[]{{
                    add("https://www.example.com/image.jpeg"),
                }};
                tags = new org.openapis.openapi.models.shared.Tag[]{{
                    add(new Tag(){{
                        id = 1234L;
                        name = "Hugo";
                    }}),
                }};
                status = PetStatus.PENDING;
            }};            

            UpdatePetResponse res = sdk.pet.updatePet(req);

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

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `request`                                                                                    | [org.openapis.openapi.models.shared.RequestBodiePet](../../models/shared/RequestBodiePet.md) | :heavy_check_mark:                                                                           | The request object to use for the request.                                                   |


### Response

**[org.openapis.openapi.models.operations.UpdatePetResponse](../../models/operations/UpdatePetResponse.md)**


## findPetsByStatus

Multiple status values can be provided with comma separated strings

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.FindPetsByStatusRequest;
import org.openapis.openapi.models.operations.FindPetsByStatusResponse;
import org.openapis.openapi.models.shared.PetStatus;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            FindPetsByStatusResponse res = sdk.pet.findPetsByStatus(PetStatus.PENDING);

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

| Parameter                                                                        | Type                                                                             | Required                                                                         | Description                                                                      | Example                                                                          |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `status`                                                                         | [org.openapis.openapi.models.shared.PetStatus](../../models/shared/PetStatus.md) | :heavy_minus_sign:                                                               | Status values that need to be considered for filter                              | pending                                                                          |


### Response

**[org.openapis.openapi.models.operations.FindPetsByStatusResponse](../../models/operations/FindPetsByStatusResponse.md)**


## deletePet

delete a pet based on a unique id

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DeletePetRequest;
import org.openapis.openapi.models.operations.DeletePetResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            DeletePetResponse res = sdk.pet.deletePet(441876L);

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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `petId`            | *Long*             | :heavy_check_mark: | Pet id to delete   |


### Response

**[org.openapis.openapi.models.operations.DeletePetResponse](../../models/operations/DeletePetResponse.md)**


## getPetById

Returns a single pet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetPetByIdRequest;
import org.openapis.openapi.models.operations.GetPetByIdResponse;
import org.openapis.openapi.models.operations.GetPetByIdSecurity;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .build();

            GetPetByIdResponse res = sdk.pet.getPetById(new GetPetByIdSecurity(){{
                apiKey = "";
            }}, 504151L);

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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                 | [org.openapis.openapi.models.operations.GetPetByIdSecurity](../../models/operations/GetPetByIdSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |
| `petId`                                                                                                    | *Long*                                                                                                     | :heavy_check_mark:                                                                                         | ID of pet to return                                                                                        |


### Response

**[org.openapis.openapi.models.operations.GetPetByIdResponse](../../models/operations/GetPetByIdResponse.md)**


## updatePetWithForm

update a pet using form data

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UpdatePetWithFormRequest;
import org.openapis.openapi.models.operations.UpdatePetWithFormResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            UpdatePetWithFormResponse res = sdk.pet.updatePetWithForm(303241L, "string", "string");

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

| Parameter                              | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `petId`                                | *Long*                                 | :heavy_check_mark:                     | ID of pet that needs to be updated     |
| `name`                                 | *String*                               | :heavy_minus_sign:                     | Name of pet that needs to be updated   |
| `status`                               | *String*                               | :heavy_minus_sign:                     | Status of pet that needs to be updated |


### Response

**[org.openapis.openapi.models.operations.UpdatePetWithFormResponse](../../models/operations/UpdatePetWithFormResponse.md)**


## uploadFile

upload an image of a pet

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UploadFileRequest;
import org.openapis.openapi.models.operations.UploadFileResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            UploadFileResponse res = sdk.pet.uploadFile(565380L, "string", "0x7cca7F47Dd".getBytes());

            if (res.apiResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `petId`                         | *Long*                          | :heavy_check_mark:              | ID of pet to update             |
| `additionalMetadata`            | *String*                        | :heavy_minus_sign:              | Additional Metadata             |
| `requestBody`                   | *byte[]*                        | :heavy_minus_sign:              | binary data for body of request |


### Response

**[org.openapis.openapi.models.operations.UploadFileResponse](../../models/operations/UploadFileResponse.md)**

