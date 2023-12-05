# BuckslipOrdersApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buckslipOrderCreate**](BuckslipOrdersApi.md#buckslipOrderCreate) | **POST** /buckslips/{buckslip_id}/orders | Create |
| [**buckslipOrdersRetrieve**](BuckslipOrdersApi.md#buckslipOrdersRetrieve) | **GET** /buckslips/{buckslip_id}/orders | Retrieve |


<a id="buckslipOrderCreate"></a>
# **buckslipOrderCreate**
> BuckslipOrder buckslipOrderCreate(buckslipId, buckslipOrderEditable)

Create

Creates a new buckslip order given information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuckslipOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BuckslipOrdersApi apiInstance = new BuckslipOrdersApi(defaultClient);
    String buckslipId = "buckslipId_example"; // String | The ID of the buckslip to which the buckslip orders belong.
    BuckslipOrderEditable buckslipOrderEditable = new BuckslipOrderEditable(); // BuckslipOrderEditable | 
    try {
      BuckslipOrder result = apiInstance.buckslipOrderCreate(buckslipId, buckslipOrderEditable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipOrdersApi#buckslipOrderCreate");
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
| **buckslipId** | **String**| The ID of the buckslip to which the buckslip orders belong. | |
| **buckslipOrderEditable** | [**BuckslipOrderEditable**](BuckslipOrderEditable.md)|  | |

### Return type

[**BuckslipOrder**](BuckslipOrder.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Buckslip order created successfully |  -  |
| **0** | Error |  -  |

<a id="buckslipOrdersRetrieve"></a>
# **buckslipOrdersRetrieve**
> BuckslipOrdersRetrieve200Response buckslipOrdersRetrieve(buckslipId, limit, offset)

Retrieve

Retrieves the buckslip orders associated with the given buckslip id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuckslipOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BuckslipOrdersApi apiInstance = new BuckslipOrdersApi(defaultClient);
    String buckslipId = "buckslipId_example"; // String | The ID of the buckslip to which the buckslip orders belong.
    Integer limit = 10; // Integer | How many results to return.
    Integer offset = 0; // Integer | An integer that designates the offset at which to begin returning results. Defaults to 0.
    try {
      BuckslipOrdersRetrieve200Response result = apiInstance.buckslipOrdersRetrieve(buckslipId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipOrdersApi#buckslipOrdersRetrieve");
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
| **buckslipId** | **String**| The ID of the buckslip to which the buckslip orders belong. | |
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |

### Return type

[**BuckslipOrdersRetrieve200Response**](BuckslipOrdersRetrieve200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the buckslip orders associated with the given buckslip id |  -  |
| **0** | Error |  -  |

