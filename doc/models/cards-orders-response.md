
# Cards Orders Response

## Structure

`CardsOrdersResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | Value is resource type. | String getObject() | setObject(String object) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PreviousUrl` | `String` | Optional | Url of previous page of items in list. | String getPreviousUrl() | setPreviousUrl(String previousUrl) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |
| `TotalCount` | `Integer` | Optional | Indicates the total number of records. Provided when the request specifies an "include" query parameter | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `Data` | [`List<CardOrder>`](../../doc/models/card-order.md) | Optional | List of card orders | List<CardOrder> getData() | setData(List<CardOrder> data) |

## Example (as JSON)

```json
{
  "object": "object2",
  "next_url": "next_url0",
  "previous_url": "previous_url2",
  "count": 174,
  "total_count": 246
}
```

