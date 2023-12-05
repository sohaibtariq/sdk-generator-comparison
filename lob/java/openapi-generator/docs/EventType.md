

# EventType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**EventTypeId**](EventTypeId.md) |  |  |
|**enabledForTest** | **Boolean** | Value is &#x60;true&#x60; if the event type is enabled in both the test and live environments and &#x60;false&#x60; if it is only enabled in the live environment. |  |
|**resource** | [**ResourceEnum**](#ResourceEnum) |  |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | Value is resource type. |  |



## Enum: ResourceEnum

| Name | Value |
|---- | -----|
| POSTCARDS | &quot;postcards&quot; |
| SELF_MAILERS | &quot;self mailers&quot; |
| LETTERS | &quot;letters&quot; |
| CHECKS | &quot;checks&quot; |
| ADDRESSES | &quot;addresses&quot; |
| BANK_ACCOUNTS | &quot;bank accounts&quot; |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| EVENT_TYPE | &quot;event_type&quot; |



