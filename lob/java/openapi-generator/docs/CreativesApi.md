# CreativesApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**creativeCreate**](CreativesApi.md#creativeCreate) | **POST** /creatives | Create |
| [**creativeRetrieve**](CreativesApi.md#creativeRetrieve) | **GET** /creatives/{crv_id} | Retrieve |
| [**creativeUpdate**](CreativesApi.md#creativeUpdate) | **PATCH** /creatives/{crv_id} | Update |


<a id="creativeCreate"></a>
# **creativeCreate**
> Creative creativeCreate(creativeWritable, xLangOutput)

Create

Creates a new creative with the provided properties

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreativesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CreativesApi apiInstance = new CreativesApi(defaultClient);
    CreativeWritable creativeWritable = new CreativeWritable(); // CreativeWritable | 
    String xLangOutput = "native"; // String | * `native` - Translate response to the native language of the country in the request * `match` - match the response to the language in the request  Default response is in English. 
    try {
      Creative result = apiInstance.creativeCreate(creativeWritable, xLangOutput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativesApi#creativeCreate");
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
| **creativeWritable** | [**CreativeWritable**](CreativeWritable.md)|  | |
| **xLangOutput** | **String**| * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  | [optional] [enum: native, match] |

### Return type

[**Creative**](Creative.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Creative created successfully |  -  |
| **0** | Error |  -  |

<a id="creativeRetrieve"></a>
# **creativeRetrieve**
> Creative creativeRetrieve(crvId)

Retrieve

Retrieves the details of an existing creative. You need only supply the unique creative identifier that was returned upon creative creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreativesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CreativesApi apiInstance = new CreativesApi(defaultClient);
    String crvId = "crvId_example"; // String | id of the creative
    try {
      Creative result = apiInstance.creativeRetrieve(crvId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativesApi#creativeRetrieve");
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
| **crvId** | **String**| id of the creative | |

### Return type

[**Creative**](Creative.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a creative object |  -  |
| **0** | Error |  -  |

<a id="creativeUpdate"></a>
# **creativeUpdate**
> Creative creativeUpdate(crvId, creativeBase)

Update

Update the details of an existing creative. You need only supply the unique identifier that was returned upon creative creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreativesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CreativesApi apiInstance = new CreativesApi(defaultClient);
    String crvId = "crvId_example"; // String | id of the creative
    CreativeBase creativeBase = new CreativeBase(); // CreativeBase | 
    try {
      Creative result = apiInstance.creativeUpdate(crvId, creativeBase);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreativesApi#creativeUpdate");
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
| **crvId** | **String**| id of the creative | |
| **creativeBase** | [**CreativeBase**](CreativeBase.md)|  | |

### Return type

[**Creative**](Creative.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a creative object |  -  |
| **0** | Error |  -  |

