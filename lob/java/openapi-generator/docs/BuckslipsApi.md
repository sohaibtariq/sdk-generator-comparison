# BuckslipsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buckslipCreate**](BuckslipsApi.md#buckslipCreate) | **POST** /buckslips | Create |
| [**buckslipDelete**](BuckslipsApi.md#buckslipDelete) | **DELETE** /buckslips/{buckslip_id} | Delete |
| [**buckslipRetrieve**](BuckslipsApi.md#buckslipRetrieve) | **GET** /buckslips/{buckslip_id} | Retrieve |
| [**buckslipUpdate**](BuckslipsApi.md#buckslipUpdate) | **PATCH** /buckslips/{buckslip_id} | Update |
| [**buckslipsList**](BuckslipsApi.md#buckslipsList) | **GET** /buckslips | List |


<a id="buckslipCreate"></a>
# **buckslipCreate**
> Buckslip buckslipCreate(buckslipEditable)

Create

Creates a new buckslip given information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuckslipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BuckslipsApi apiInstance = new BuckslipsApi(defaultClient);
    BuckslipEditable buckslipEditable = new BuckslipEditable(); // BuckslipEditable | 
    try {
      Buckslip result = apiInstance.buckslipCreate(buckslipEditable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#buckslipCreate");
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
| **buckslipEditable** | [**BuckslipEditable**](BuckslipEditable.md)|  | |

### Return type

[**Buckslip**](Buckslip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Buckslip created successfully |  -  |
| **0** | Error |  -  |

<a id="buckslipDelete"></a>
# **buckslipDelete**
> BuckslipDeletion buckslipDelete(buckslipId)

Delete

Delete an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuckslipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BuckslipsApi apiInstance = new BuckslipsApi(defaultClient);
    String buckslipId = "buckslipId_example"; // String | id of the buckslip
    try {
      BuckslipDeletion result = apiInstance.buckslipDelete(buckslipId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#buckslipDelete");
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
| **buckslipId** | **String**| id of the buckslip | |

### Return type

[**BuckslipDeletion**](BuckslipDeletion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted the buckslip |  -  |
| **0** | Error |  -  |

<a id="buckslipRetrieve"></a>
# **buckslipRetrieve**
> Buckslip buckslipRetrieve(buckslipId)

Retrieve

Retrieves the details of an existing buckslip. You need only supply the unique customer identifier that was returned upon buckslip creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuckslipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BuckslipsApi apiInstance = new BuckslipsApi(defaultClient);
    String buckslipId = "buckslipId_example"; // String | id of the buckslip
    try {
      Buckslip result = apiInstance.buckslipRetrieve(buckslipId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#buckslipRetrieve");
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
| **buckslipId** | **String**| id of the buckslip | |

### Return type

[**Buckslip**](Buckslip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a buckslip object |  -  |
| **0** | Error |  -  |

<a id="buckslipUpdate"></a>
# **buckslipUpdate**
> Buckslip buckslipUpdate(buckslipId, buckslipUpdatable)

Update

Update the details of an existing buckslip. You need only supply the unique identifier that was returned upon buckslip creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuckslipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BuckslipsApi apiInstance = new BuckslipsApi(defaultClient);
    String buckslipId = "buckslipId_example"; // String | id of the buckslip
    BuckslipUpdatable buckslipUpdatable = new BuckslipUpdatable(); // BuckslipUpdatable | 
    try {
      Buckslip result = apiInstance.buckslipUpdate(buckslipId, buckslipUpdatable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#buckslipUpdate");
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
| **buckslipId** | **String**| id of the buckslip | |
| **buckslipUpdatable** | [**BuckslipUpdatable**](BuckslipUpdatable.md)|  | |

### Return type

[**Buckslip**](Buckslip.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a buckslip object |  -  |
| **0** | Error |  -  |

<a id="buckslipsList"></a>
# **buckslipsList**
> BuckslipsList200Response buckslipsList(limit, beforeAfter, include)

List

Returns a list of your buckslips. The buckslips are returned sorted by creation date, with the most recently created buckslips appearing first.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BuckslipsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    BuckslipsApi apiInstance = new BuckslipsApi(defaultClient);
    Integer limit = 10; // Integer | How many results to return.
    AddressesListBeforeAfterParameter beforeAfter = new AddressesListBeforeAfterParameter(); // AddressesListBeforeAfterParameter | `before` and `after` are both optional but only one of them can be in the query at a time. 
    List<String> include = Arrays.asList(); // List<String> | Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    try {
      BuckslipsList200Response result = apiInstance.buckslipsList(limit, beforeAfter, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuckslipsApi#buckslipsList");
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
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **beforeAfter** | [**AddressesListBeforeAfterParameter**](.md)| &#x60;before&#x60; and &#x60;after&#x60; are both optional but only one of them can be in the query at a time.  | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  | [optional] |

### Return type

[**BuckslipsList200Response**](BuckslipsList200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of buckslip objects |  -  |
| **0** | Error |  -  |

