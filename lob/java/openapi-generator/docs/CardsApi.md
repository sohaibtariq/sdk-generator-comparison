# CardsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cardCreate**](CardsApi.md#cardCreate) | **POST** /cards | Create |
| [**cardDelete**](CardsApi.md#cardDelete) | **DELETE** /cards/{card_id} | Delete |
| [**cardRetrieve**](CardsApi.md#cardRetrieve) | **GET** /cards/{card_id} | Retrieve |
| [**cardUpdate**](CardsApi.md#cardUpdate) | **POST** /cards/{card_id} | Update |
| [**cardsList**](CardsApi.md#cardsList) | **GET** /cards | List |


<a id="cardCreate"></a>
# **cardCreate**
> Card cardCreate(cardEditable)

Create

Creates a new card given information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CardsApi apiInstance = new CardsApi(defaultClient);
    CardEditable cardEditable = new CardEditable(); // CardEditable | 
    try {
      Card result = apiInstance.cardCreate(cardEditable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#cardCreate");
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
| **cardEditable** | [**CardEditable**](CardEditable.md)|  | |

### Return type

[**Card**](Card.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Card created successfully |  -  |
| **0** | Error |  -  |

<a id="cardDelete"></a>
# **cardDelete**
> CardDeletion cardDelete(cardId)

Delete

Delete an existing card. You need only supply the unique identifier that was returned upon card creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String cardId = "cardId_example"; // String | id of the card
    try {
      CardDeletion result = apiInstance.cardDelete(cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#cardDelete");
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
| **cardId** | **String**| id of the card | |

### Return type

[**CardDeletion**](CardDeletion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deleted the card |  -  |
| **0** | Error |  -  |

<a id="cardRetrieve"></a>
# **cardRetrieve**
> Card cardRetrieve(cardId)

Retrieve

Retrieves the details of an existing card. You need only supply the unique customer identifier that was returned upon card creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String cardId = "cardId_example"; // String | id of the card
    try {
      Card result = apiInstance.cardRetrieve(cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#cardRetrieve");
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
| **cardId** | **String**| id of the card | |

### Return type

[**Card**](Card.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a card object |  -  |
| **0** | Error |  -  |

<a id="cardUpdate"></a>
# **cardUpdate**
> Card cardUpdate(cardId, cardUpdatable)

Update

Update the details of an existing card. You need only supply the unique identifier that was returned upon card creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String cardId = "cardId_example"; // String | id of the card
    CardUpdatable cardUpdatable = new CardUpdatable(); // CardUpdatable | 
    try {
      Card result = apiInstance.cardUpdate(cardId, cardUpdatable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#cardUpdate");
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
| **cardId** | **String**| id of the card | |
| **cardUpdatable** | [**CardUpdatable**](CardUpdatable.md)|  | |

### Return type

[**Card**](Card.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a card object |  -  |
| **0** | Error |  -  |

<a id="cardsList"></a>
# **cardsList**
> CardsList200Response cardsList(limit, beforeAfter, include)

List

Returns a list of your cards. The cards are returned sorted by creation date, with the most recently created addresses appearing first.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer limit = 10; // Integer | How many results to return.
    AddressesListBeforeAfterParameter beforeAfter = new AddressesListBeforeAfterParameter(); // AddressesListBeforeAfterParameter | `before` and `after` are both optional but only one of them can be in the query at a time. 
    List<String> include = Arrays.asList(); // List<String> | Request that the response include the total count by specifying `include=[\"total_count\"]`. 
    try {
      CardsList200Response result = apiInstance.cardsList(limit, beforeAfter, include);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#cardsList");
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

[**CardsList200Response**](CardsList200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of card objects |  -  |
| **0** | Error |  -  |

