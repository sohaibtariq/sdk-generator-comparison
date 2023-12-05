

# LinkSingle


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**redirectLink** | **String** | The original target URL. |  |
|**domain** | **String** | The registered domain to be used for the short URL. |  [optional] |
|**slug** | **String** | The unique path for the shortened URL, if empty a unique path will be used. |  [optional] |
|**metadataTag** | **Map&lt;String, String&gt;** | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters &#x60;\&quot;&#x60; and &#x60;\\&#x60;. i.e. &#39;{\&quot;customer_id\&quot; : \&quot;NEWYORK2015\&quot;}&#39; Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. |  [optional] |
|**billingGroupId** | **String** | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See &lt;a href&#x3D;\&quot;#tag/Billing-Groups\&quot;&gt;Billing Group API&lt;/a&gt; for more information. |  [optional] |



