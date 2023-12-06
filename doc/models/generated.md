
# Generated

## Structure

`Generated`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `To` | [`Address`](../../doc/models/containers/address.md) | Required | - | Address getTo() | setTo(Address to) |
| `Carrier` | `String` | Required, Constant | **Default**: `"USPS"` | String getCarrier() | setCarrier(String carrier) |
| `Thumbnails` | [`List<Thumbnail>`](../../doc/models/thumbnail.md) | Optional | - | List<Thumbnail> getThumbnails() | setThumbnails(List<Thumbnail> thumbnails) |
| `ExpectedDeliveryDate` | `LocalDate` | Optional | A date in YYYY-MM-DD format of the mailpiece's expected delivery date based on its `send_date`. | LocalDate getExpectedDeliveryDate() | setExpectedDeliveryDate(LocalDate expectedDeliveryDate) |
| `DateCreated` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Optional | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |

## Example (as JSON)

```json
{
  "to": {
    "date_created": "2016-03-13T12:52:32.123Z",
    "date_modified": "2016-03-13T12:52:32.123Z",
    "object": "address",
    "id": "id4",
    "name": "name4",
    "company": "company4",
    "address_line1": "address_line18",
    "address_city": "address_city4",
    "address_state": "address_state6",
    "address_zip": "address_zip6",
    "deleted": false,
    "description": "description4",
    "phone": "phone4",
    "email": "email2",
    "address_line2": "address_line26"
  },
  "carrier": "USPS",
  "thumbnails": [
    {
      "small": "small8",
      "medium": "medium8",
      "large": "large6"
    },
    {
      "small": "small8",
      "medium": "medium8",
      "large": "large6"
    }
  ],
  "expected_delivery_date": "2016-03-13",
  "date_created": "2016-03-13T12:52:32.123Z",
  "date_modified": "2016-03-13T12:52:32.123Z",
  "deleted": false
}
```

