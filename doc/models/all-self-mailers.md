
# All Self Mailers

## Structure

`AllSelfMailers`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | Value is resource type. | String getObject() | setObject(String object) |
| `NextUrl` | `String` | Optional | Url of next page of items in list. | String getNextUrl() | setNextUrl(String nextUrl) |
| `PreviousUrl` | `String` | Optional | Url of previous page of items in list. | String getPreviousUrl() | setPreviousUrl(String previousUrl) |
| `Count` | `Integer` | Optional | number of resources in a set | Integer getCount() | setCount(Integer count) |
| `TotalCount` | `Integer` | Optional | Indicates the total number of records. Provided when the request specifies an "include" query parameter | Integer getTotalCount() | setTotalCount(Integer totalCount) |
| `Data` | [`List<SelfMailer>`](../../doc/models/self-mailer.md) | Optional | list of self_mailers | List<SelfMailer> getData() | setData(List<SelfMailer> data) |

## Example (as JSON)

```json
{
  "object": "object2",
  "next_url": "next_url0",
  "previous_url": "previous_url2",
  "count": 76,
  "total_count": 240
}
```

