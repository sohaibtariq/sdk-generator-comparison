
# Us Verification

## Structure

`UsVerification`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier prefixed with `us_ver_`.<br>**Constraints**: *Pattern*: `^us_ver_[a-zA-Z0-9_]+$` | String getId() | setId(String id) |
| `Recipient` | `String` | Optional | The intended recipient, typically a person's or firm's name.<br>**Constraints**: *Maximum Length*: `500` | String getRecipient() | setRecipient(String recipient) |
| `PrimaryLine` | `String` | Optional | The primary delivery line (usually the street address) of the address.<br>Combination of the following applicable `components`:<br><br>* `primary_number`<br>* `street_predirection`<br>* `street_name`<br>* `street_suffix`<br>* `street_postdirection`<br>* `secondary_designator`<br>* `secondary_number`<br>* `pmb_designator`<br>* `pmb_number`<br>**Constraints**: *Maximum Length*: `500` | String getPrimaryLine() | setPrimaryLine(String primaryLine) |
| `SecondaryLine` | `String` | Optional | The secondary delivery line of the address. This field is typically empty but may contain information if `primary_line` is too long.<br>**Constraints**: *Maximum Length*: `500` | String getSecondaryLine() | setSecondaryLine(String secondaryLine) |
| `Urbanization` | `String` | Optional | Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or development within a city. See <a href="https://pe.usps.com/text/pub28/28api_008.htm#:~:text=I51.,-4%20Urbanizations&text=In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name." target="_blank">USPS documentation</a> for clarification.<br>**Constraints**: *Maximum Length*: `500` | String getUrbanization() | setUrbanization(String urbanization) |
| `LastLine` | `String` | Optional | Combination of the following applicable `components`:<br><br>* City (`city`)<br>* State (`state`)<br>* ZIP code (`zip_code`)<br>* ZIP+4 (`zip_code_plus_4`) | String getLastLine() | setLastLine(String lastLine) |
| `Deliverability` | [`DeliverabilityEnum`](../../doc/models/deliverability-enum.md) | Optional | Summarizes the deliverability of the `us_verification` object.<br>For full details, see the `deliverability_analysis` field. Possible values are:<br><br>* `deliverable` – The address is deliverable by the USPS.<br>* `deliverable_unnecessary_unit` – The address is deliverable, but the secondary unit information is unnecessary.<br>* `deliverable_incorrect_unit` – The address is deliverable to the building's default address but the secondary unit provided may not exist. There is a chance the mail will not reach the intended recipient.<br>* `deliverable_missing_unit` – The address is deliverable to the building's default address but is missing secondary unit information. There is a chance the mail will not reach the intended recipient.<br>* `undeliverable` – The address is not deliverable according to the USPS. | DeliverabilityEnum getDeliverability() | setDeliverability(DeliverabilityEnum deliverability) |
| `ValidAddress` | `Boolean` | Optional | This field indicates whether an address was found in a more comprehensive address dataset that includes sources from the USPS, open source mapping data, and our proprietary mail delivery data.<br>This field can be interpreted as a representation of whether an address is a real location or not. Additionally a valid address may contradict the deliverability field since an address can be a real valid location but the USPS may not deliver to that address. | Boolean getValidAddress() | setValidAddress(Boolean validAddress) |
| `Components` | [`UsComponents`](../../doc/models/us-components.md) | Optional | A nested object containing a breakdown of each component of an address. | UsComponents getComponents() | setComponents(UsComponents components) |
| `DeliverabilityAnalysis` | [`DeliverabilityAnalysis`](../../doc/models/deliverability-analysis.md) | Optional | A nested object containing a breakdown of the deliverability of an address. | DeliverabilityAnalysis getDeliverabilityAnalysis() | setDeliverabilityAnalysis(DeliverabilityAnalysis deliverabilityAnalysis) |
| `LobConfidenceScore` | [`LobConfidenceScore`](../../doc/models/lob-confidence-score.md) | Optional | Lob Confidence Score is a nested object that provides a numerical value between 0-100 of the likelihood that an address is deliverable based on Lob’s mail delivery data to over half of US households. | LobConfidenceScore getLobConfidenceScore() | setLobConfidenceScore(LobConfidenceScore lobConfidenceScore) |
| `Object` | [`Object1Enum`](../../doc/models/object-1-enum.md) | Optional | Value is resource type.<br>**Default**: `Object1Enum.US_VERIFICATION` | Object1Enum getObject() | setObject(Object1Enum object) |

## Example (as JSON)

```json
{
  "object": "us_verification",
  "id": "id8",
  "recipient": "recipient0",
  "primary_line": "primary_line8",
  "secondary_line": "secondary_line4",
  "urbanization": "urbanization0"
}
```

