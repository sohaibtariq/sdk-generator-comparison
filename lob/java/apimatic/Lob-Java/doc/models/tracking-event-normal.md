
# Tracking Event Normal

## Structure

`TrackingEventNormal`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Unique identifier prefixed with `evnt_`.<br>**Constraints**: *Pattern*: `^evnt_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Time` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date USPS registered the event. | LocalDateTime getTime() | setTime(LocalDateTime time) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Object` | [`Object3Enum`](../../doc/models/object-3-enum.md) | Required | - | Object3Enum getObject() | setObject(Object3Enum object) |
| `Type` | `String` | Required, Constant | non-Certified postcards, self mailers, letters, and checks<br>**Default**: `"normal"` | String getType() | setType(String type) |
| `Name` | [`NameEnum`](../../doc/models/name-enum.md) | Required | Name of tracking event (for normal postcards, self mailers, letters, and checks):<br><br>* `Mailed` - The mailpiece has been handed off to and accepted by USPS<br>  and is en route. <a href="https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4" target="_blank">More about<br>  Mailed.</a><br>  Note this data is only available in Enterprise editions of<br>  Lob. <a href="https://lob.com/support/contact#contact" target="_blank">Contact Sales</a> if<br>  you want access to this feature.<br><br>* `In Transit` - The mailpiece is being processed at the entry/origin facility.<br><br>* `In Local Area` - The mailpiece is being processed at the destination facility.<br><br>* `Processed for Delivery` - The mailpiece has been greenlit for<br>  delivery at the recipient's nearest postal facility. The mailpiece<br>  should reach the mailbox within 1 business day of this tracking<br>  event.<br><br>* `Delivered` - The mail piece has been delivered to<br>  the recipient’s address. The final scan is generated when the mail<br>  carrier's GPS unit leaves the delivery area.<br><br>* `Re-Routed` - The mailpiece is re-routed due to recipient change of<br>  address, address errors, or USPS relabeling of barcode/ID tag<br>  area.<br><br>* `Returned to Sender` - The mailpiece is being returned to sender due<br>  to barcode, ID tag area, or address errors.<br><br>* `International Exit` - The mail piece has been processed to<br>  ship to a destination abroad. This is typically the last<br>  scan a US-originated international mail piece will receive<br>  from the USPS.<br><br><a href="https://help.lob.com/print-and-mail/getting-data-and-results/tracking-your-mail#mailed-tracking-events-4" target="_blank">More about tracking</a> | NameEnum getName() | setName(NameEnum name) |
| `Details` | `Object` | Optional | Will be `null` for `type=normal` events | Object getDetails() | setDetails(Object details) |
| `Location` | `String` | Optional | The zip code in which the scan event occurred. Null for `Mailed` events. | String getLocation() | setLocation(String location) |

## Example (as JSON)

```json
{
  "id": "id0",
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "object": "tracking_event",
  "type": "normal",
  "name": "Delivered",
  "time": "2016-03-13T12:52:32.123Z",
  "details": {
    "key1": "val1",
    "key2": "val2"
  },
  "location": "location4"
}
```

