
# Buckslips Orders Response

## Structure

`BuckslipsOrdersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | Value is resource type. | String getObject() | setObject(String object) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PreviousUrl` | `String` | Optional | Url of previous page of items in list. | String getPreviousUrl() | setPreviousUrl(String previousUrl) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |
| `TotalCount` | `Integer` | Optional | Indicates the total number of records. Provided when the request specifies an "include" query parameter | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `Data` | [`List<BuckslipOrder>`](../../doc/models/buckslip-order.md) | Optional | List of buckslip orders | List<BuckslipOrder> getData() | setData(List<BuckslipOrder> data) |

## Example (as JSON)

```json
{
  "object": "object0",
  "next_url": "next_url2",
  "previous_url": "previous_url0",
  "count": 188,
  "total_count": 96
}
```

