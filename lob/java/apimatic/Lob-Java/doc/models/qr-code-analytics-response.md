
# Qr Code Analytics Response

## Structure

`QrCodeAnalyticsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | Value is resource type. | String getObject() | setObject(String object) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |
| `TotalCount` | `Integer` | Optional | Indicates the total number of records. Provided when the request specifies an "include" query parameter | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `ScannedCount` | `Integer` | Optional | Indicates the number of QR Codes out of `count` that were scanned atleast once. | Integer getScannedCount() | setScannedCount(Integer scannedCount) |
| `Data` | [`List<QrCodeScans>`](../../doc/models/qr-code-scans.md) | Optional | List of QR code analytics | List<QrCodeScans> getData() | setData(List<QrCodeScans> data) |

## Example (as JSON)

```json
{
  "object": "object6",
  "count": 244,
  "total_count": 176,
  "scanned_count": 138,
  "data": [
    {
      "resource_id": "resource_id6",
      "date_created": "2016-03-13T12:52:32.123Z",
      "number_of_scans": 198.84,
      "scans": [
        {
          "ip_location": "ip_location0",
          "scan_date": "scan_date4"
        },
        {
          "ip_location": "ip_location0",
          "scan_date": "scan_date4"
        },
        {
          "ip_location": "ip_location0",
          "scan_date": "scan_date4"
        }
      ]
    },
    {
      "resource_id": "resource_id6",
      "date_created": "2016-03-13T12:52:32.123Z",
      "number_of_scans": 198.84,
      "scans": [
        {
          "ip_location": "ip_location0",
          "scan_date": "scan_date4"
        },
        {
          "ip_location": "ip_location0",
          "scan_date": "scan_date4"
        },
        {
          "ip_location": "ip_location0",
          "scan_date": "scan_date4"
        }
      ]
    }
  ]
}
```

