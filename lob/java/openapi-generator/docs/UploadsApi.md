# UploadsApi

All URIs are relative to *https://api.lob.com/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportRetrieve**](UploadsApi.md#exportRetrieve) | **GET** /uploads/{upl_id}/exports/{ex_id} | Retrieve Export |
| [**reportRetrieve**](UploadsApi.md#reportRetrieve) | **GET** /uploads/{upl_id}/report | Retrieve Line Item Report |
| [**uploadCreate**](UploadsApi.md#uploadCreate) | **POST** /uploads | Create |
| [**uploadDelete**](UploadsApi.md#uploadDelete) | **DELETE** /uploads/{upl_id} | Delete |
| [**uploadExportCreate**](UploadsApi.md#uploadExportCreate) | **POST** /uploads/{upl_id}/exports | Create Export |
| [**uploadFile**](UploadsApi.md#uploadFile) | **POST** /uploads/{upl_id}/file | Upload file |
| [**uploadRetrieve**](UploadsApi.md#uploadRetrieve) | **GET** /uploads/{upl_id} | Retrieve |
| [**uploadUpdate**](UploadsApi.md#uploadUpdate) | **PATCH** /uploads/{upl_id} | Update |
| [**uploadsList**](UploadsApi.md#uploadsList) | **GET** /uploads | List |


<a id="exportRetrieve"></a>
# **exportRetrieve**
> ExportRetrieve200Response exportRetrieve(uplId, exId)

Retrieve Export

Retrieves the details of an existing export. You need only supply the unique export identifier that was returned upon export creation. If you try retrieving an export immediately after creating one (i.e., before we&#39;re done processing the export), you will get back an export object with &#x60;state &#x3D; in_progress&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String uplId = "uplId_example"; // String | ID of the upload
    String exId = "exId_example"; // String | ID of the export
    try {
      ExportRetrieve200Response result = apiInstance.exportRetrieve(uplId, exId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#exportRetrieve");
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
| **uplId** | **String**| ID of the upload | |
| **exId** | **String**| ID of the export | |

### Return type

[**ExportRetrieve200Response**](ExportRetrieve200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an export object |  -  |

<a id="reportRetrieve"></a>
# **reportRetrieve**
> ReportRetrieve200Response reportRetrieve(uplId, status, limit, offset)

Retrieve Line Item Report

Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob&#39;s support team if you  would like access to this API endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String uplId = "uplId_example"; // String | ID of the upload
    String status = "Validated"; // String | The status of line items to filter and retrieve. By default all line items are returned.
    Integer limit = 100; // Integer | How many results to return.
    Integer offset = 0; // Integer | An integer that designates the offset at which to begin returning results. Defaults to 0.
    try {
      ReportRetrieve200Response result = apiInstance.reportRetrieve(uplId, status, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#reportRetrieve");
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
| **uplId** | **String**| ID of the upload | |
| **status** | **String**| The status of line items to filter and retrieve. By default all line items are returned. | [optional] [enum: Validated, Failed, Processing] |
| **limit** | **Integer**| How many results to return. | [optional] [default to 100] |
| **offset** | **Integer**| An integer that designates the offset at which to begin returning results. Defaults to 0. | [optional] [default to 0] |

### Return type

[**ReportRetrieve200Response**](ReportRetrieve200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an report object |  -  |
| **403** | Forbidden Error |  -  |
| **404** | Not Found Error |  -  |

<a id="uploadCreate"></a>
# **uploadCreate**
> Upload uploadCreate(uploadWritable)

Create

Creates a new upload with the provided properties.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    UploadWritable uploadWritable = new UploadWritable(); // UploadWritable | 
    try {
      Upload result = apiInstance.uploadCreate(uploadWritable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadCreate");
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
| **uploadWritable** | [**UploadWritable**](UploadWritable.md)|  | |

### Return type

[**Upload**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Upload created successfully |  -  |
| **422** | Validation Error |  -  |

<a id="uploadDelete"></a>
# **uploadDelete**
> uploadDelete(uplId)

Delete

Delete an existing upload. You need only supply the unique identifier that was returned upon upload creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String uplId = "uplId_example"; // String | id of the upload
    try {
      apiInstance.uploadDelete(uplId);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadDelete");
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
| **uplId** | **String**| id of the upload | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |

<a id="uploadExportCreate"></a>
# **uploadExportCreate**
> UploadCreateExport uploadExportCreate(uplId, uploadExportCreateRequest)

Create Export

Campaign Exports can help you understand exactly which records in a campaign could not be created. By initiating and retrieving an export, you will get row-by-row errors for your campaign. For a step-by-step walkthrough of creating a campaign and exporting failures, see our [Campaigns Guide](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).  Create an export file associated with an upload.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String uplId = "uplId_example"; // String | ID of the upload
    UploadExportCreateRequest uploadExportCreateRequest = new UploadExportCreateRequest(); // UploadExportCreateRequest | 
    try {
      UploadCreateExport result = apiInstance.uploadExportCreate(uplId, uploadExportCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadExportCreate");
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
| **uplId** | **String**| ID of the upload | |
| **uploadExportCreateRequest** | [**UploadExportCreateRequest**](UploadExportCreateRequest.md)|  | |

### Return type

[**UploadCreateExport**](UploadCreateExport.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **4XX** | Create Export Error |  -  |

<a id="uploadFile"></a>
# **uploadFile**
> UploadFile uploadFile(uplId, _file)

Upload file

Upload an [audience file](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide) and associate it with an upload.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String uplId = "uplId_example"; // String | ID of the upload
    File _file = new File("/path/to/file"); // File | 
    try {
      UploadFile result = apiInstance.uploadFile(uplId, _file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadFile");
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
| **uplId** | **String**| ID of the upload | |
| **_file** | **File**|  | [optional] |

### Return type

[**UploadFile**](UploadFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="uploadRetrieve"></a>
# **uploadRetrieve**
> Upload uploadRetrieve(uplId)

Retrieve

Retrieves the details of an existing upload. You need only supply the unique upload identifier that was returned upon upload creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String uplId = "uplId_example"; // String | id of the upload
    try {
      Upload result = apiInstance.uploadRetrieve(uplId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadRetrieve");
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
| **uplId** | **String**| id of the upload | |

### Return type

[**Upload**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an upload object |  -  |
| **404** | Not Found Error |  -  |
| **422** | Validation Error |  -  |

<a id="uploadUpdate"></a>
# **uploadUpdate**
> Upload uploadUpdate(uplId, uploadUpdatable)

Update

Update the details of an existing upload. You need only supply the unique identifier that was returned upon upload creation.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String uplId = "uplId_example"; // String | id of the upload
    UploadUpdatable uploadUpdatable = new UploadUpdatable(); // UploadUpdatable | 
    try {
      Upload result = apiInstance.uploadUpdate(uplId, uploadUpdatable);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadUpdate");
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
| **uplId** | **String**| id of the upload | |
| **uploadUpdatable** | [**UploadUpdatable**](UploadUpdatable.md)|  | |

### Return type

[**Upload**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns an upload object |  -  |
| **404** | Not Found Error |  -  |
| **422** | Validation Error |  -  |

<a id="uploadsList"></a>
# **uploadsList**
> List&lt;Upload&gt; uploadsList(campaignId)

List

Returns a list of your uploads. Optionally, filter uploads by campaign.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UploadsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.lob.com/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    UploadsApi apiInstance = new UploadsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | id of the campaign
    try {
      List<Upload> result = apiInstance.uploadsList(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadsApi#uploadsList");
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
| **campaignId** | **String**| id of the campaign | [optional] |

### Return type

[**List&lt;Upload&gt;**](Upload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An array of matching uploads. Each entry in the array is a separate upload. |  -  |

