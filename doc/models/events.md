
# Events

## Structure

`Events`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Unique identifier prefixed with `evt_`.<br>**Constraints**: *Pattern*: `^evt_[a-zA-Z0-9_]+$` | String getId() | setId(String id) |
| `Body` | `Object` | Required | The body of the associated resource as they were at the time of the event, i.e. the [postcard object](#operation/postcard_retrieve), [the letter object](#operation/letter_retrieve), [the check object](#operation/check_retrieve), [the address object](#operation/address_retrieve), or [the bank account object](#operation/bank_account_retrieve). For `.deleted` events, the body matches the response for the corresponding delete endpoint for that resource (e.g. the [postcard delete response](#operation/postcard_delete)). | Object getBody() | setBody(Object body) |
| `ReferenceId` | `String` | Required | Unique identifier of the related resource for the event. | String getReferenceId() | setReferenceId(String referenceId) |
| `EventType` | [`EventType`](../../doc/models/event-type.md) | Required | - | EventType getEventType() | setEventType(EventType eventType) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `Object` | `String` | Required, Constant | Value is resource type.<br>**Default**: `"event"` | String getObject() | setObject(String object) |

## Example (as JSON)

```json
{
  "id": "id0",
  "body": {
    "key1": "val1",
    "key2": "val2"
  },
  "reference_id": "reference_id8",
  "event_type": {
    "id": "postcard.international_exit",
    "enabled_for_test": false,
    "resource": "addresses",
    "object": "event_type"
  },
  "date_created": "2016-03-13T12:52:32.123Z",
  "object": "event"
}
```

