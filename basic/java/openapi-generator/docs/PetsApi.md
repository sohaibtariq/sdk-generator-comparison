# PetsApi

All URIs are relative to *https://src8wr32cg.api.quickmocker.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPet**](PetsApi.md#createPet) | **POST** /pets | Create a new Pet object |
| [**listPets**](PetsApi.md#listPets) | **GET** /pets | create a single pet |
| [**showPetById**](PetsApi.md#showPetById) | **GET** /pets/{petId} | showPetById |


<a id="createPet"></a>
# **createPet**
> createPet(pet)

Create a new Pet object

Create a pet and key characteristics

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://src8wr32cg.api.quickmocker.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PetsApi apiInstance = new PetsApi(defaultClient);
    Pet pet = new Pet(); // Pet | A single Pet object used to create a new Pet
    try {
      apiInstance.createPet(pet);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetsApi#createPet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pet** | [**Pet**](Pet.md)| A single Pet object used to create a new Pet | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Null response |  -  |
| **0** | unexpected error |  -  |

<a id="listPets"></a>
# **listPets**
> List&lt;Pet&gt; listPets(limit)

create a single pet

List all pets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://src8wr32cg.api.quickmocker.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PetsApi apiInstance = new PetsApi(defaultClient);
    Integer limit = 10; // Integer | limit the number of objects returned to max 100
    try {
      List<Pet> result = apiInstance.listPets(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetsApi#listPets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| limit the number of objects returned to max 100 | [optional] |

### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A paged array of pets |  -  |
| **0** | unexpected error |  -  |

<a id="showPetById"></a>
# **showPetById**
> Pet showPetById(petId)

showPetById

Info for a specific pet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://src8wr32cg.api.quickmocker.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    PetsApi apiInstance = new PetsApi(defaultClient);
    String petId = "33918"; // String | The id of the pet to retrieve
    try {
      Pet result = apiInstance.showPetById(petId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PetsApi#showPetById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **petId** | **String**| The id of the pet to retrieve | |

### Return type

[**Pet**](Pet.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response to a valid request |  -  |
| **0** | unexpected error |  -  |

