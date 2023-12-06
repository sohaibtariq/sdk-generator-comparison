
# Address Us

## Structure

`AddressUs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was created. | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the resource was last modified. | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |
| `Deleted` | `Boolean` | Optional | Only returned if the resource has been successfully deleted. | Boolean getDeleted() | setDeleted(Boolean deleted) |
| `Object` | `String` | Required, Constant | Value is resource type.<br>**Default**: `"address"` | String getObject() | setObject(String object) |
| `Id` | `String` | Required | Unique identifier prefixed with `adr_`.<br>**Constraints**: *Pattern*: `^adr_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Name` | `String` | Required | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address.<br>**Constraints**: *Maximum Length*: `40` | String getName() | setName(String name) |
| `Company` | `String` | Required | Either `name` or `company` is required, you may also add both. Must be no longer than 40 characters. If both `name` and `company` are provided, they will be printed on two separate lines above the rest of the address. This field can be used for any secondary recipient information which is not part of the actual mailing address (Company Name, Department, Attention Line, etc).<br>**Constraints**: *Maximum Length*: `40` | String getCompany() | setCompany(String company) |
| `Phone` | `String` | Optional | Must be no longer than 40 characters.<br>**Constraints**: *Maximum Length*: `40` | String getPhone() | setPhone(String phone) |
| `Email` | `String` | Optional | Must be no longer than 100 characters.<br>**Constraints**: *Maximum Length*: `100` | String getEmail() | setEmail(String email) |
| `AddressLine1` | `String` | Required | The primary number, street name, and directional information.<br>**Constraints**: *Maximum Length*: `64` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | An optional field containing any information which can't fit into line 1.<br>**Constraints**: *Maximum Length*: `64` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AddressCity` | `String` | Required | **Constraints**: *Maximum Length*: `200` | String getAddressCity() | setAddressCity(String addressCity) |
| `AddressState` | `String` | Required | 2 letter state short-name code<br>**Constraints**: *Pattern*: `^[a-zA-Z]{2}$` | String getAddressState() | setAddressState(String addressState) |
| `AddressZip` | `String` | Required | Must follow the ZIP format of `12345` or ZIP+4 format of `12345-1234`.<br>**Constraints**: *Pattern*: `^\d{5}(-\d{4})?$` | String getAddressZip() | setAddressZip(String addressZip) |
| `AddressCountry` | [`AddressCountryEnum`](../../doc/models/address-country-enum.md) | Optional | Full name of country<br>**Constraints**: *Minimum Length*: `13`, *Maximum Length*: `13` | AddressCountryEnum getAddressCountry() | setAddressCountry(AddressCountryEnum addressCountry) |
| `Metadata` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `RecipientMoved` | `Boolean` | Optional | Only returned for accounts on certain <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print &amp; Mail Editions</a>. Value is `true` if the address was altered because the recipient filed for a <a href="#tag/National-Change-of-Address">National Change of Address Linkage (NCOALink)</a>, `false` if the NCOALink check was run but no altered address was found, and `null` if the NCOALink check was not run. The NCOALink check does not happen for non-US addresses, for non-deliverable US addresses, or for addresses created before the NCOALink feature was added to your account. | Boolean getRecipientMoved() | setRecipientMoved(Boolean recipientMoved) |

## Example (as JSON)

```json
{
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
}
```

