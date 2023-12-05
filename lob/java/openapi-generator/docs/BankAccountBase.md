

# BankAccountBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | An internal description that identifies this resource. Must be no longer than 255 characters.  |  [optional] |
|**routingNumber** | **String** | Must be a &lt;a href&#x3D;\&quot;https://www.frbservices.org/index.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;valid US routing number&lt;/a&gt;. |  |
|**accountNumber** | **String** |  |  |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | The type of entity that holds the account. |  |
|**signatory** | **String** | The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/login\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Dashboard&lt;/a&gt;. |  |
|**checkTemplate** | [**CheckTemplateEnum**](#CheckTemplateEnum) | The check template used for printing. The defualt value is &#x60;common&#x60;. If you bank with JP Morgan Chase and wish to use Positive Pay use the &#x60;jpm&#x60; template. &#x60;jpm&#x60; requires additional information to be provided. |  [optional] |
|**fractionalRoutingNumber** | **String** | The fractional routing number for your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the fractional routing number associated with your home bank institution. |  [optional] |
|**city** | **String** | The city associated with your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the city associated with your home bank institution. |  [optional] |
|**state** | **String** | The state associated with your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the state associated with your home bank institution. |  [optional] |
|**zipcode** | **String** | The zipcode associated with your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the zipcode associated with your home bank institution. |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters &#x60;\&quot;&#x60; and &#x60;\\&#x60;. i.e. &#39;{\&quot;customer_id\&quot; : \&quot;NEWYORK2015\&quot;}&#39; Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |  [optional] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| COMPANY | &quot;company&quot; |
| INDIVIDUAL | &quot;individual&quot; |



## Enum: CheckTemplateEnum

| Name | Value |
|---- | -----|
| COMMON | &quot;common&quot; |
| JPM | &quot;jpm&quot; |



