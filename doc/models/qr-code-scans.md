
# Qr Code Scans

## Structure

`QrCodeScans`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ResourceId` | `String` | Optional | Unique identifier for each mail piece. | String getResourceId() | setResourceId(String resourceId) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `NumberOfScans` | `Double` | Optional | Number of times the QR Code associated with this mail piece was scanned. | Double getNumberOfScans() | setNumberOfScans(Double numberOfScans) |
| `Scans` | [`List<Scans>`](../../doc/models/scans.md) | Optional | Detailed scan information associated with each mail piece. | List<Scans> getScans() | setScans(List<Scans> scans) |

## Example (as JSON)

```json
{
  "resource_id": "resource_id4",
  "date_created": "2016-03-13T12:52:32.123Z",
  "number_of_scans": 111.36,
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
```

