

# ReportRetrieve200ResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowNumber** | **BigDecimal** | The row number of the csv file containing this data. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The processing status of line item. |  [optional] |
|**errorMessage** | **String** | The error message detailing the reason why processing the line item failed. |  [optional] |
|**mailpieceId** | **String** | The mailpiece id created from the line item when it was validated. |  [optional] |
|**originalData** | **String** | Key-value pairs where each key is the column header and each value is the value of the column for the row. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALIDATED | &quot;Validated&quot; |
| FAILED | &quot;Failed&quot; |
| PROCESSING | &quot;Processing&quot; |



