# CardOrdersApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cardOrderCreate**](CardOrdersApi.md#cardOrderCreate) | **POST** /cards/{card_id}/orders | Create |
| [**cardOrdersRetrieve**](CardOrdersApi.md#cardOrdersRetrieve) | **GET** /cards/{card_id}/orders | Retrieve |


<a id="cardOrderCreate"></a>
# **cardOrderCreate**
> CardOrder cardOrderCreate(cardId, cardOrderEditable)

Create

Creates a new card order given information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CardOrdersApi apiInstance = new CardOrdersApi(defaultClient);
    String cardId = "cardId_example"; // String | The ID of the card to which the card orders belong.
    CardOrderEditable cardOrderEditable = new CardOrderEditable(); // CardOrderEditable | 
    try {
      CardOrder result = apiInstance.cardOrderCreate(cardId, cardOrderEditable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOrdersApi#cardOrderCreate");
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
| **cardId** | **String**| The ID of the card to which the card orders belong. | |
| **cardOrderEditable** | [**CardOrderEditable**](CardOrderEditable.md)|  | |

### Return type

[**CardOrder**](CardOrder.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Card order created successfully |  -  |
| **0** | Error |  -  |

<a id="cardOrdersRetrieve"></a>
# **cardOrdersRetrieve**
> CardOrdersRetrieve200Response cardOrdersRetrieve(cardId, limit, offset)

Retrieve

Retrieves the card orders associated with the given card id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardOrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    CardOrdersApi apiInstance = new CardOrdersApi(defaultClient);
    String cardId = "cardId_example"; // String | The ID of the card to which the card orders belong.
    Integer limit = 10; // Integer | How many results to return.
    Integer offset = 0; // Integer | An integer that designates the offset at which to begin returning results. Defaults to 0.
    try {
      CardOrdersRetrieve200Response result = apiInstance.cardOrdersRetrieve(cardId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardOrdersApi#cardOrdersRetrieve");
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
| **cardId** | **String**| The ID of the card to which the card orders belong. | |
| **limit** | **Integer**| How many results to return. | [optional] [default to 10] |
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |

### Return type

[**CardOrdersRetrieve200Response**](CardOrdersRetrieve200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the card orders associated with the given card id |  -  |
| **0** | Error |  -  |

