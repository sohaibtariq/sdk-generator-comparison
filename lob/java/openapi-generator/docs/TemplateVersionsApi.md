# TemplateVersionsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTemplateVersion**](TemplateVersionsApi.md#createTemplateVersion) | **POST** /templates/{tmpl_id}/versions | Create |
| [**templateVersionDelete**](TemplateVersionsApi.md#templateVersionDelete) | **DELETE** /templates/{tmpl_id}/versions/{vrsn_id} | Delete |
| [**templateVersionRetrieve**](TemplateVersionsApi.md#templateVersionRetrieve) | **GET** /templates/{tmpl_id}/versions/{vrsn_id} | Retrieve |
| [**templateVersionUpdate**](TemplateVersionsApi.md#templateVersionUpdate) | **POST** /templates/{tmpl_id}/versions/{vrsn_id} | Update |
| [**templateVersionsList**](TemplateVersionsApi.md#templateVersionsList) | **GET** /templates/{tmpl_id}/versions | List |


<a id="createTemplateVersion"></a>
# **createTemplateVersion**
> TemplateVersion createTemplateVersion(tmplId, templateVersionWritable)

Create

Creates a new template version attached to the specified template.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String tmplId = "tmplId_example"; // String | The ID of the template the new version will be attached to
    TemplateVersionWritable templateVersionWritable = new TemplateVersionWritable(); // TemplateVersionWritable | 
    try {
      TemplateVersion result = apiInstance.createTemplateVersion(tmplId, templateVersionWritable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#createTemplateVersion");
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
| **tmplId** | **String**| The ID of the template the new version will be attached to | |
| **templateVersionWritable** | [**TemplateVersionWritable**](TemplateVersionWritable.md)|  | |

### Return type

[**TemplateVersion**](TemplateVersion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the template version with the given template and version ids. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a id="templateVersionDelete"></a>
# **templateVersionDelete**
> TemplateVersionDeletion templateVersionDelete(tmplId, vrsnId)

Delete

Permanently deletes a template version. A template&#39;s &#x60;published_version&#x60; can not be deleted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String tmplId = "tmplId_example"; // String | The ID of the template to which the version belongs.
    String vrsnId = "vrsnId_example"; // String | id of the template_version
    try {
      TemplateVersionDeletion result = apiInstance.templateVersionDelete(tmplId, vrsnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#templateVersionDelete");
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
| **tmplId** | **String**| The ID of the template to which the version belongs. | |
| **vrsnId** | **String**| id of the template_version | |

### Return type

[**TemplateVersionDeletion**](TemplateVersionDeletion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted |  -  |
| **0** | Error |  -  |

<a id="templateVersionRetrieve"></a>
# **templateVersionRetrieve**
> TemplateVersion templateVersionRetrieve(tmplId, vrsnId)

Retrieve

Retrieves the template version with the given template and version ids.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String tmplId = "tmplId_example"; // String | The ID of the template to which the version belongs.
    String vrsnId = "vrsnId_example"; // String | id of the template_version
    try {
      TemplateVersion result = apiInstance.templateVersionRetrieve(tmplId, vrsnId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#templateVersionRetrieve");
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
| **tmplId** | **String**| The ID of the template to which the version belongs. | |
| **vrsnId** | **String**| id of the template_version | |

### Return type

[**TemplateVersion**](TemplateVersion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the template version with the given template and version ids. |  -  |
| **0** | Error |  -  |

<a id="templateVersionUpdate"></a>
# **templateVersionUpdate**
> TemplateVersion templateVersionUpdate(tmplId, vrsnId, templateVersionUpdatable)

Update

Updates the template version with the given template and version ids.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String tmplId = "tmplId_example"; // String | The ID of the template to which the version belongs.
    String vrsnId = "vrsnId_example"; // String | id of the template_version
    TemplateVersionUpdatable templateVersionUpdatable = new TemplateVersionUpdatable(); // TemplateVersionUpdatable | 
    try {
      TemplateVersion result = apiInstance.templateVersionUpdate(tmplId, vrsnId, templateVersionUpdatable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#templateVersionUpdate");
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
| **tmplId** | **String**| The ID of the template to which the version belongs. | |
| **vrsnId** | **String**| id of the template_version | |
| **templateVersionUpdatable** | [**TemplateVersionUpdatable**](TemplateVersionUpdatable.md)|  | |

### Return type

[**TemplateVersion**](TemplateVersion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the template version with the given template and version ids. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

<a id="templateVersionsList"></a>
# **templateVersionsList**
> TemplateVersionsList200Response templateVersionsList(tmplId, limit, beforeAfter, include, dateCreated)

List

Returns a list of template versions for the given template ID. The template versions are sorted by creation date, with the most recently created appearing first. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TemplateVersionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    TemplateVersionsApi apiInstance = new TemplateVersionsApi(defaultClient);
    String tmplId = "tmplId_example"; // String | The ID of the template associated with the retrieved versions
    Integer limit = 10; // Integer | How many results to return.
    AddressesListBeforeAfterParameter beforeAfter = new AddressesListBeforeAfterParameter(); // AddressesListBeforeAfterParameter | `before` and `after` are both optional but only one of them can be in the query at a time. 
    List<String> include = Arrays.asList(); // List<String> | Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    Map<String, String> dateCreated = new HashMap(); // Map<String, String> | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤.
    try {
      TemplateVersionsList200Response result = apiInstance.templateVersionsList(tmplId, limit, beforeAfter, include, dateCreated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplateVersionsApi#templateVersionsList");
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
| **tmplId** | **String**| The ID of the template associated with the retrieved versions | |
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **beforeAfter** | [**AddressesListBeforeAfterParameter**](.md)| &#x60;before&#x60; and &#x60;after&#x60; are both optional but only one of them can be in the query at a time.  | [optional] |
| **include** | [**List&lt;String&gt;**](String.md)| Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  | [optional] |
| **dateCreated** | [**Map&lt;String, String&gt;**](String.md)| Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. | [optional] |

### Return type

[**TemplateVersionsList200Response**](TemplateVersionsList200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A dictionary with a data property that contains an array of up to &#x60;limit&#x60; template versions. Each entry in the array is a separate template version object. The previous and next page of template versions can be retrieved by calling the endpoint contained in the &#x60;previous_url&#x60; and &#x60;next_url&#x60; fields in the API response respectively.&lt;br&gt;If no more template versions are available beyond the current set of returned results, the &#x60;next_url&#x60; field will be empty. |  -  |
| **0** | Error |  -  |

