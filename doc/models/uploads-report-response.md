
# Uploads Report Response

## Structure

`UploadsReportResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<Datum>`](../../doc/models/datum.md) | Required | - | List<Datum> getData() | setData(List<Datum> data) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PrevUrl` | `String` | Optional | Url of previous page of items in list. | String getPrevUrl() | setPrevUrl(String prevUrl) |
| `Count` | `int` | Required | number of resources in a set | int getCount() | setCount(int count) |
| `TotalCount` | `int` | Required | Indicates the total number of records. Provided when the request specifies an "include" query parameter | int getTotalCount() | setTotalCount(int totalCount) |

## Example (as JSON)

```json
{
  "data": [
    {
      "rowNumber": 177.76,
      "status": "Processing",
      "errorMessage": "errorMessage8",
      "mailpieceId": "mailpieceId6",
      "originalData": {
        "key1": "val1",
        "key2": "val2"
      }
    }
  ],
  "count": 160,
  "total_count": 4,
  "next_url": "next_url4",
  "prev_url": "prev_url0"
}
```

