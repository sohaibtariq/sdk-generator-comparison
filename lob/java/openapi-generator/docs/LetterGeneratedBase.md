

# LetterGeneratedBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**to** | [**Address**](Address.md) |  |  |
|**carrier** | [**CarrierEnum**](#CarrierEnum) |  |  |
|**thumbnails** | [**List&lt;Thumbnail&gt;**](Thumbnail.md) |  |  [optional] |
|**expectedDeliveryDate** | **LocalDate** | A date in YYYY-MM-DD format of the mailpiece&#39;s expected delivery date based on its &#x60;send_date&#x60;. |  [optional] |
|**dateCreated** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was created. |  [optional] |
|**dateModified** | **OffsetDateTime** | A timestamp in ISO 8601 format of the date the resource was last modified. |  [optional] |
|**deleted** | **Boolean** | Only returned if the resource has been successfully deleted. |  [optional] |
|**from** | [**Address**](Address.md) |  |  |
|**url** | **String** | A [signed link](#section/Asset-URLs) served over HTTPS. The link returned will expire in 30 days to prevent mis-sharing. Each time a GET request is initiated, a new signed URL will be generated. |  [optional] |
|**id** | **String** | Unique identifier prefixed with &#x60;ltr_&#x60;. |  |
|**templateId** | [**Object**](Object.md) |  |  [optional] |
|**templateVersionId** | [**String**](String.md) |  |  [optional] |
|**campaignId** | **String** | The unique ID of the associated campaign if the resource was generated from a campaign. |  [optional] |
|**useType** | **LtrUseType** |  |  |
|**fsc** | **Boolean** | This is in beta. Contact support@lob.com or your account contact to learn more. Not available for &#x60;A4&#x60; letter size. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**failureReason** | **String** | A string describing the reason for failure if the letter failed to render. |  [optional] |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  [optional] |



## Enum: CarrierEnum

| Name | Value |
|---- | -----|
| USPS | &quot;USPS&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSED | &quot;processed&quot; |
| RENDERED | &quot;rendered&quot; |
| FAILED | &quot;failed&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| LETTER | &quot;letter&quot; |



