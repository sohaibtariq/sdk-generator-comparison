
# Datum

## Structure

`Datum`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RowNumber` | `Double` | Optional | The row number of the csv file containing this data. | Double getRowNumber() | setRowNumber(Double rowNumber) |
| `Status` | [`Status4Enum`](../../doc/models/status-4-enum.md) | Optional | The processing status of line item. | Status4Enum getStatus() | setStatus(Status4Enum status) |
| `ErrorMessage` | `String` | Optional | The error message detailing the reason why processing the line item failed. | String getErrorMessage() | setErrorMessage(String errorMessage) |
| `MailpieceId` | `String` | Optional | The mailpiece id created from the line item when it was validated. | String getMailpieceId() | setMailpieceId(String mailpieceId) |
| `OriginalData` | `Object` | Optional | Key-value pairs where each key is the column header and each value is the value of the column for the row. | Object getOriginalData() | setOriginalData(Object originalData) |

## Example (as JSON)

```json
{
  "rowNumber": 28.48,
  "status": "Processing",
  "errorMessage": "errorMessage0",
  "mailpieceId": "mailpieceId8",
  "originalData": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

