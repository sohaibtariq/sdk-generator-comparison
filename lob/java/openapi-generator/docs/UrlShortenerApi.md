# UrlShortenerApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**domainCreate**](UrlShortenerApi.md#domainCreate) | **POST** /domains | Create Domain |
| [**domainDelete**](UrlShortenerApi.md#domainDelete) | **DELETE** /domains/{domain_id} | Delete a Domain |
| [**domainDeleteLinks**](UrlShortenerApi.md#domainDeleteLinks) | **DELETE** /domains/{domain_id}/links | Delete all links for a domain |
| [**domainGet**](UrlShortenerApi.md#domainGet) | **GET** /domains/{domain_id} | Retrieve a domain |
| [**domainList**](UrlShortenerApi.md#domainList) | **GET** /domains | List all domains |
| [**linkBulkCreate**](UrlShortenerApi.md#linkBulkCreate) | **POST** /links/shorten/bulk | Bulk Create Links |
| [**linkCreate**](UrlShortenerApi.md#linkCreate) | **POST** /links/shorten | Create Link |
| [**linkUpdate**](UrlShortenerApi.md#linkUpdate) | **PATCH** /links/{link_id} | Update a Link |
| [**linksDelete**](UrlShortenerApi.md#linksDelete) | **DELETE** /links/{link_id} | Delete Link |
| [**linksGet**](UrlShortenerApi.md#linksGet) | **GET** /links/{link_id} | Retrieve a link |
| [**linksList**](UrlShortenerApi.md#linksList) | **GET** /links | Retrieve all shortened links |


<a id="domainCreate"></a>
# **domainCreate**
> DomainResponse domainCreate(domains)

Create Domain

Add a new custom domain that can be used to create custom links.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    Domains domains = new Domains(); // Domains | 
    try {
      DomainResponse result = apiInstance.domainCreate(domains);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#domainCreate");
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
| **domains** | [**Domains**](Domains.md)|  | |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a domain object with details. |  -  |
| **0** | Error |  -  |

<a id="domainDelete"></a>
# **domainDelete**
> DomainResponse domainDelete(domainId)

Delete a Domain

Delete a registered domain. This operation can only be performed if all associated links with the domain are deleted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    String domainId = "domainId_example"; // String | Unique identifier for a domain.
    try {
      DomainResponse result = apiInstance.domainDelete(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#domainDelete");
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
| **domainId** | **String**| Unique identifier for a domain. | |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted link object. |  -  |
| **0** | Error |  -  |

<a id="domainDeleteLinks"></a>
# **domainDeleteLinks**
> DomainsResponse domainDeleteLinks(domainId)

Delete all links for a domain

Delete all associated links for a domain

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    String domainId = "domainId_example"; // String | Unique identifier for a domain.
    try {
      DomainsResponse result = apiInstance.domainDeleteLinks(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#domainDeleteLinks");
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
| **domainId** | **String**| Unique identifier for a domain. | |

### Return type

[**DomainsResponse**](DomainsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted objects. |  -  |
| **0** | Error |  -  |

<a id="domainGet"></a>
# **domainGet**
> DomainResponse domainGet(domainId)

Retrieve a domain

Retrieve details for a single domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    String domainId = "domainId_example"; // String | Unique identifier for a domain.
    try {
      DomainResponse result = apiInstance.domainGet(domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#domainGet");
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
| **domainId** | **String**| Unique identifier for a domain. | |

### Return type

[**DomainResponse**](DomainResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns domain related details. |  -  |
| **0** | Error |  -  |

<a id="domainList"></a>
# **domainList**
> DomainsResponse domainList()

List all domains

Retrieve a list of all created domains.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    try {
      DomainsResponse result = apiInstance.domainList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#domainList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DomainsResponse**](DomainsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of all domains. |  -  |
| **0** | Error |  -  |

<a id="linkBulkCreate"></a>
# **linkBulkCreate**
> LinksResponse linkBulkCreate(linkSingle)

Bulk Create Links

Shortens a list of links in a single request.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    List<LinkSingle> linkSingle = Arrays.asList(); // List<LinkSingle> | 
    try {
      LinksResponse result = apiInstance.linkBulkCreate(linkSingle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#linkBulkCreate");
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
| **linkSingle** | [**List&lt;LinkSingle&gt;**](LinkSingle.md)|  | |

### Return type

[**LinksResponse**](LinksResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns all successfully created links |  -  |
| **0** | Error |  -  |

<a id="linkCreate"></a>
# **linkCreate**
> LinkResponse linkCreate(linkSingle)

Create Link

Given a long URL, shorten your URL either by using a custom domain or Lob&#39;s own short domain.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    LinkSingle linkSingle = new LinkSingle(); // LinkSingle | 
    try {
      LinkResponse result = apiInstance.linkCreate(linkSingle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#linkCreate");
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
| **linkSingle** | [**LinkSingle**](LinkSingle.md)|  | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a successfully created link. |  -  |
| **0** | Error |  -  |

<a id="linkUpdate"></a>
# **linkUpdate**
> LinkResponse linkUpdate(linkId, linkSingle)

Update a Link

Update any of the properties of a shortened link.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    String linkId = "linkId_example"; // String | Unique identifier for a link.
    LinkSingle linkSingle = new LinkSingle(); // LinkSingle | 
    try {
      LinkResponse result = apiInstance.linkUpdate(linkId, linkSingle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#linkUpdate");
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
| **linkId** | **String**| Unique identifier for a link. | |
| **linkSingle** | [**LinkSingle**](LinkSingle.md)|  | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the updated link. |  -  |
| **0** | Error |  -  |

<a id="linksDelete"></a>
# **linksDelete**
> LinkResponse linksDelete(linkId)

Delete Link

Delete the shortened link.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    String linkId = "linkId_example"; // String | Unique identifier for a link.
    try {
      LinkResponse result = apiInstance.linksDelete(linkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#linksDelete");
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
| **linkId** | **String**| Unique identifier for a link. | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted short link object |  -  |
| **0** | Error |  -  |

<a id="linksGet"></a>
# **linksGet**
> LinkResponse linksGet(linkId)

Retrieve a link

Retrievs a single shortened link.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    String linkId = "linkId_example"; // String | Unique identifier for a link.
    try {
      LinkResponse result = apiInstance.linksGet(linkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#linksGet");
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
| **linkId** | **String**| Unique identifier for a link. | |

### Return type

[**LinkResponse**](LinkResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a single link. |  -  |
| **0** | Error |  -  |

<a id="linksList"></a>
# **linksList**
> LinksResponse linksList(limit, offset, include, dateCreated, metadata, campaignId, clicked, billingGroupId)

Retrieve all shortened links

Retrieves a list of shortened links. The list is sorted by  creation date, with the most recently created appearing first.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UrlShortenerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UrlShortenerApi apiInstance = new UrlShortenerApi(defaultClient);
    Integer limit = 10; // Integer | How many results to return.
    Integer offset = 0; // Integer | An integer that designates the offset at which to begin returning results. Defaults to 0.
    List<String> include = Arrays.asList(); // List<String> | Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    Map<String, String> dateCreated = new HashMap(); // Map<String, String> | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ \"gt\": \"2012-01-01\", \"lt\": \"2012-01-31T12:34:56Z\" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤.
    Map<String, String> metadata = new HashMap(); // Map<String, String> | Filter by metadata key-value pair`.
    String campaignId = "campaignId_example"; // String | Filter the links generated for a particular campaign using its campaign id.
    Boolean clicked = true; // Boolean | Retrieve the list of links that have been opened.
    String billingGroupId = "billingGroupId_example"; // String | Filter the links generated for a particular billing group id.
    try {
      LinksResponse result = apiInstance.linksList(limit, offset, include, dateCreated, metadata, campaignId, clicked, billingGroupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UrlShortenerApi#linksList");
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
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |
| **include** | [**List&lt;String&gt;**](String.md)| Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  | [optional] |
| **dateCreated** | [**Map&lt;String, String&gt;**](String.md)| Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. | [optional] |
| **metadata** | [**Map&lt;String, String&gt;**](String.md)| Filter by metadata key-value pair&#x60;. | [optional] |
| **campaignId** | **String**| Filter the links generated for a particular campaign using its campaign id. | [optional] |
| **clicked** | **Boolean**| Retrieve the list of links that have been opened. | [optional] |
| **billingGroupId** | **String**| Filter the links generated for a particular billing group id. | [optional] |

### Return type

[**LinksResponse**](LinksResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the deleted link object. |  -  |
| **0** | Error |  -  |

