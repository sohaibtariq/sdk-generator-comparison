
# Before After

## Structure

`BeforeAfter`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Before` | `String` | Required | A reference to a list entry used for paginating to the previous set of entries. This field is pre-populated in the `previous_url` field in the return response. | String getBefore() | setBefore(String before) |
| `After` | `String` | Required | A reference to a list entry used for paginating to the next set of entries. This field is pre-populated in the `next_url` field in the return response. | String getAfter() | setAfter(String after) |

## Example (as JSON)

```json
{
  "before": "before2",
  "after": "after4"
}
```

