# ReverseGeocodeLookupsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reverseGeocodeLookup**](ReverseGeocodeLookupsApi.md#reverseGeocodeLookup) | **POST** /us_reverse_geocode_lookups | Reverse Geocode Lookup |


<a id="reverseGeocodeLookup"></a>
# **reverseGeocodeLookup**
> ReverseGeocode reverseGeocodeLookup(location, size)

Reverse Geocode Lookup

Reverse geocode a valid US location with a live API key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReverseGeocodeLookupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    ReverseGeocodeLookupsApi apiInstance = new ReverseGeocodeLookupsApi(defaultClient);
    Location location = new Location(); // Location | 
    Integer size = 5; // Integer | Determines the number of locations returned. Possible values are between 1 and 50 and any number higher will be rounded down to 50. Default size is a list of 5 reverse geocoded locations.
    try {
      ReverseGeocode result = apiInstance.reverseGeocodeLookup(location, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReverseGeocodeLookupsApi#reverseGeocodeLookup");
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
| **location** | [**Location**](Location.md)|  | |
| **size** | **Integer**| Determines the number of locations returned. Possible values are between 1 and 50 and any number higher will be rounded down to 50. Default size is a list of 5 reverse geocoded locations. | [optional] [default to 5] |

### Return type

[**ReverseGeocode**](ReverseGeocode.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a zip lookup object if a valid zip was provided. |  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  |
| **0** | Error |  -  |

