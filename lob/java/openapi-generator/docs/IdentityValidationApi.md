# IdentityValidationApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**identityValidation**](IdentityValidationApi.md#identityValidation) | **POST** /identity_validation | Identity Validation |


<a id="identityValidation"></a>
# **identityValidation**
> IdentityValidation identityValidation(identityValidationWritable)

Identity Validation

Validates whether a given name is associated with an address.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.IdentityValidationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    IdentityValidationApi apiInstance = new IdentityValidationApi(defaultClient);
    IdentityValidationWritable identityValidationWritable = new IdentityValidationWritable(); // IdentityValidationWritable | 
    try {
      IdentityValidation result = apiInstance.identityValidation(identityValidationWritable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IdentityValidationApi#identityValidation");
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
| **identityValidationWritable** | [**IdentityValidationWritable**](IdentityValidationWritable.md)|  | |

### Return type

[**IdentityValidation**](IdentityValidation.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the likelihood a given name is associated with an address. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

