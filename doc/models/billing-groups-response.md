
# Billing Groups Response

## Structure

`BillingGroupsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | Value is resource type. | String getObject() | setObject(String object) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PreviousUrl` | `String` | Optional | Url of previous page of items in list. | String getPreviousUrl() | setPreviousUrl(String previousUrl) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |
| `TotalCount` | `Integer` | Optional | Indicates the total number of records. Provided when the request specifies an "include" query parameter | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `Data` | [`List<BillingGroup>`](../../doc/models/billing-group.md) | Optional | list of billing_groups | List<BillingGroup> getData() | setData(List<BillingGroup> data) |

## Example (as JSON)

```json
{
  "object": "object0",
  "next_url": "next_url2",
  "previous_url": "previous_url0",
  "count": 144,
  "total_count": 20
}
```

