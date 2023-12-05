# UsVerificationsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkUsVerifications**](UsVerificationsApi.md#bulkUsVerifications) | **POST** /bulk/us_verifications | Bulk Verify |
| [**usVerification**](UsVerificationsApi.md#usVerification) | **POST** /us_verifications | Single Verify |


<a id="bulkUsVerifications"></a>
# **bulkUsVerifications**
> UsVerifications bulkUsVerifications(multipleComponentsList, _case)

Bulk Verify

Verify a list of US or US territory addresses _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsVerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UsVerificationsApi apiInstance = new UsVerificationsApi(defaultClient);
    MultipleComponentsList multipleComponentsList = new MultipleComponentsList(); // MultipleComponentsList | 
    String _case = "upper"; // String | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. \"PO BOX\") and proper-cased (e.g. \"PO Box\"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.
    try {
      UsVerifications result = apiInstance.bulkUsVerifications(multipleComponentsList, _case);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsVerificationsApi#bulkUsVerifications");
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
| **multipleComponentsList** | [**MultipleComponentsList**](MultipleComponentsList.md)|  | |
| **_case** | **String**| Casing of the verified address. Possible values are &#x60;upper&#x60; and &#x60;proper&#x60; for uppercased (e.g. \&quot;PO BOX\&quot;) and proper-cased (e.g. \&quot;PO Box\&quot;), respectively. Only affects &#x60;recipient&#x60;, &#x60;primary_line&#x60;, &#x60;secondary_line&#x60;, &#x60;urbanization&#x60;, and &#x60;last_line&#x60;. Default casing is &#x60;upper&#x60;. | [optional] [default to upper] [enum: upper, proper] |

### Return type

[**UsVerifications**](UsVerifications.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of US verification objects. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a id="usVerification"></a>
# **usVerification**
> UsVerification usVerification(usVerificationsWritable, _case)

Single Verify

Verify a US or US territory address _with a live API key_. The address can be in components (e.g. &#x60;primary_line&#x60; is \&quot;210 King Street\&quot;, &#x60;zip_code&#x60; is \&quot;94107\&quot;) or as a single string (e.g. \&quot;210 King Street 94107\&quot;), but not as both. Requests using a test API key validate required fields but return empty values unless specific &#x60;primary_line&#x60; values are provided. See the [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsVerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UsVerificationsApi apiInstance = new UsVerificationsApi(defaultClient);
    UsVerificationsWritable usVerificationsWritable = new UsVerificationsWritable(); // UsVerificationsWritable | 
    String _case = "upper"; // String | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. \"PO BOX\") and proper-cased (e.g. \"PO Box\"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.
    try {
      UsVerification result = apiInstance.usVerification(usVerificationsWritable, _case);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsVerificationsApi#usVerification");
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
| **usVerificationsWritable** | [**UsVerificationsWritable**](UsVerificationsWritable.md)|  | |
| **_case** | **String**| Casing of the verified address. Possible values are &#x60;upper&#x60; and &#x60;proper&#x60; for uppercased (e.g. \&quot;PO BOX\&quot;) and proper-cased (e.g. \&quot;PO Box\&quot;), respectively. Only affects &#x60;recipient&#x60;, &#x60;primary_line&#x60;, &#x60;secondary_line&#x60;, &#x60;urbanization&#x60;, and &#x60;last_line&#x60;. Default casing is &#x60;upper&#x60;. | [optional] [default to upper] [enum: upper, proper] |

### Return type

[**UsVerification**](UsVerification.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a US verification object. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

