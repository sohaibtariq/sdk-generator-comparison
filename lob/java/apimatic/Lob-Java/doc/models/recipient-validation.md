
# Recipient Validation

## Structure

`RecipientValidation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier prefixed with `id_validation_`.<br>**Constraints**: *Pattern*: `^id_validation_[a-zA-Z0-9_]+$` | String getId() | setId(String id) |
| `Recipient` | `String` | Optional | The name of the person whose identity is being validated.<br>**Constraints**: *Maximum Length*: `500` | String getRecipient() | setRecipient(String recipient) |
| `PrimaryLine` | `String` | Optional | The primary delivery line (usually the street address) of the address.<br>Combination of the following applicable `components`:<br><br>* `primary_number`<br>* `street_predirection`<br>* `street_name`<br>* `street_suffix`<br>* `street_postdirection`<br>* `secondary_designator`<br>* `secondary_number`<br>* `pmb_designator`<br>* `pmb_number`<br>**Constraints**: *Maximum Length*: `500` | String getPrimaryLine() | setPrimaryLine(String primaryLine) |
| `SecondaryLine` | `String` | Optional | The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.<br>**Constraints**: *Maximum Length*: `500` | String getSecondaryLine() | setSecondaryLine(String secondaryLine) |
| `Urbanization` | `String` | Optional | Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or development within a city. See <a href="https://pe.usps.com/text/pub28/28api_008.htm#:~:text=I51.,-4%20Urbanizations&text=In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name." target="_blank">USPS documentation</a> for clarification.<br>**Constraints**: *Maximum Length*: `500` | String getUrbanization() | setUrbanization(String urbanization) |
| `LastLine` | `String` | Optional | Combination of the following applicable `components`:<br><br>* City (`city`)<br>* State (`state`)<br>* ZIP code (`zip_code`)<br>* ZIP+4 (`zip_code_plus_4`) | String getLastLine() | setLastLine(String lastLine) |
| `Score` | `Double` | Optional | A numerical score between 0 and 100 that represents the likelihood the provided name is associated with a physical address.<br>**Constraints**: `>= 0`, `<= 100` | Double getScore() | setScore(Double score) |
| `Confidence` | [`ConfidenceEnum`](../../doc/models/confidence-enum.md) | Optional | Indicates the likelihood the recipient name and address match based on our custom internal calculation. Possible values are:<br><br>- `high` — Has a Lob confidence score greater than 70.<br>- `medium` — Has a Lob confidence score between 40 and 70.<br>- `low` — Has a Lob confidence score less than 40.<br>- `""` — No tracking data exists for this address. | ConfidenceEnum getConfidence() | setConfidence(ConfidenceEnum confidence) |
| `Object` | [`Object6Enum`](../../doc/models/object-6-enum.md) | Optional | Value is resource type.<br>**Default**: `Object6Enum.ID_VALIDATION` | Object6Enum getObject() | setObject(Object6Enum object) |

## Example (as JSON)

```json
{
  "object": "id_validation",
  "id": "id0",
  "recipient": "recipient2",
  "primary_line": "primary_line0",
  "secondary_line": "secondary_line6",
  "urbanization": "urbanization2"
}
```

