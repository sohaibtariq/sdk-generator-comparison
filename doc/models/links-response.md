
# Links Response

## Structure

`LinksResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Count` | `Integer` | Optional | The number of results in the current response. | Integer getCount() | setCount(Integer count) |
| `Limit` | `Integer` | Optional | How many results to return. | Integer getLimit() | setLimit(Integer limit) |
| `Offset` | `Integer` | Optional | An integer that designates the offset at which to begin returning results. Defaults to 0. | Integer getOffset() | setOffset(Integer offset) |
| `Data` | [`List<LinkResponse>`](../../doc/models/link-response.md) | Optional | list of links | List<LinkResponse> getData() | setData(List<LinkResponse> data) |

## Example (as JSON)

```json
{
  "count": 230,
  "limit": 86,
  "offset": 182,
  "data": [
    {
      "id": "id0",
      "campaign_id": "campaign_id0",
      "domain_id": "domain_id2",
      "resource_id": "resource_id6",
      "redirect_link": "redirect_link0"
    }
  ]
}
```

