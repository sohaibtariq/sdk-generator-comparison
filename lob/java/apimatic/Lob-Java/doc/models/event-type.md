
# Event Type

## Structure

`EventType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | [`EventTypeId`](../../doc/models/containers/event-type-id.md) | Required | This is a container for one-of cases. | EventTypeId getId() | setId(EventTypeId id) |
| `EnabledForTest` | `boolean` | Required | Value is `true` if the event type is enabled in both the test and live environments and `false` if it is only enabled in the live environment. | boolean getEnabledForTest() | setEnabledForTest(boolean enabledForTest) |
| `Resource` | [`ResourceEnum`](../../doc/models/resource-enum.md) | Required | - | ResourceEnum getResource() | setResource(ResourceEnum resource) |
| `Object` | `String` | Required, Constant | Value is resource type.<br>**Default**: `"event_type"` | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": "postcard.international_exit",
  "enabled_for_test": false,
  "resource": "addresses",
  "object": "event_type"
}
```

