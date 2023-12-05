

# QrCodesList200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | Value is resource type. |  [optional] |
|**count** | **Integer** | number of resources in a set |  [optional] |
|**totalCount** | **Integer** | Indicates the total number of records. Provided when the request specifies an \&quot;include\&quot; query parameter |  [optional] |
|**scannedCount** | **Integer** | Indicates the number of QR Codes out of &#x60;count&#x60; that were scanned atleast once. |  [optional] |
|**data** | [**List&lt;QrCodeScans&gt;**](QrCodeScans.md) | List of QR code analytics |  [optional] |



