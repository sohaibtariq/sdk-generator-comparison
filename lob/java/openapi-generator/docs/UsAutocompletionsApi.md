# UsAutocompletionsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autocompletion**](UsAutocompletionsApi.md#autocompletion) | **POST** /us_autocompletions | Autocomplete |


<a id="autocompletion"></a>
# **autocompletion**
> UsAutocompletions autocompletion(usAutocompletionsWritable, _case, validAddresses)

Autocomplete

Given an address prefix consisting of a partial primary line, as well as optional input of city, state, and zip code, this functionality returns up to 10 full US address suggestions. Not all of them will turn out to be valid addresses; they&#39;ll need to be [verified](#operation/verification_us).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsAutocompletionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UsAutocompletionsApi apiInstance = new UsAutocompletionsApi(defaultClient);
    UsAutocompletionsWritable usAutocompletionsWritable = new UsAutocompletionsWritable(); // UsAutocompletionsWritable | 
    String _case = "upper"; // String | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. \"PO BOX\") and proper-cased (e.g. \"PO Box\"), respectively. Only affects `primary_line`, `city`, and `state`. Default casing is `upper`.
    Boolean validAddresses = false; // Boolean | Possible values are `true` and `false`. If false, not all of the suggestions in the response will be valid addresses; they'll need to be verified in order to determine the deliverability. The valid_addresses flag will greatly reduce the number of keystrokes needed before reaching an intended address.
    try {
      UsAutocompletions result = apiInstance.autocompletion(usAutocompletionsWritable, _case, validAddresses);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsAutocompletionsApi#autocompletion");
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
| **usAutocompletionsWritable** | [**UsAutocompletionsWritable**](UsAutocompletionsWritable.md)|  | |
| **_case** | **String**| Casing of the verified address. Possible values are &#x60;upper&#x60; and &#x60;proper&#x60; for uppercased (e.g. \&quot;PO BOX\&quot;) and proper-cased (e.g. \&quot;PO Box\&quot;), respectively. Only affects &#x60;primary_line&#x60;, &#x60;city&#x60;, and &#x60;state&#x60;. Default casing is &#x60;upper&#x60;. | [optional] [default to upper] [enum: upper, proper] |
| **validAddresses** | **Boolean**| Possible values are &#x60;true&#x60; and &#x60;false&#x60;. If false, not all of the suggestions in the response will be valid addresses; they&#39;ll need to be verified in order to determine the deliverability. The valid_addresses flag will greatly reduce the number of keystrokes needed before reaching an intended address. | [optional] [default to false] |

### Return type

[**UsAutocompletions**](UsAutocompletions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a US autocompletion object. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

