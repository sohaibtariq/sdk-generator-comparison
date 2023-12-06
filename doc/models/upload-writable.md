
# Upload Writable

## Structure

`UploadWritable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CampaignId` | `String` | Required | **Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` | String getCampaignId() | setCampaignId(String campaignId) |
| `RequiredAddressColumnMapping` | [`RequiredAddressColumns`](../../doc/models/required-address-columns.md) | Optional | The mapping of column headers in your file to Lob-required fields for the resource created. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#required-columns-2" target="_blank">Campaign Audience Guide</a> for additional details. | RequiredAddressColumns getRequiredAddressColumnMapping() | setRequiredAddressColumnMapping(RequiredAddressColumns requiredAddressColumnMapping) |
| `OptionalAddressColumnMapping` | [`OptionalAddressColumns`](../../doc/models/optional-address-columns.md) | Optional | The mapping of column headers in your file to Lob-optional fields for the resource created. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#optional-columns-3" target="_blank">Campaign Audience Guide</a> for additional details. | OptionalAddressColumns getOptionalAddressColumnMapping() | setOptionalAddressColumnMapping(OptionalAddressColumns optionalAddressColumnMapping) |
| `Metadata` | [`Metadata`](../../doc/models/metadata.md) | Optional | The list of column headers in your file as an array that you want as metadata associated with each mailpiece. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#required-columns-2" target="_blank">Campaign Audience Guide</a> for additional details. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `MergeVariableColumnMapping` | `Object` | Optional | The mapping of column headers in your file to the merge variables present in your creative. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7" target="_blank">Campaign Audience Guide</a> for additional details. <br />If a merge variable has the same "name" as a "key" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects. If using customized QR code redirect from the Audience file, then a `qr_code_redirect_url` must be mapped to the column header as used in the CSV. | Object getMergeVariableColumnMapping() | setMergeVariableColumnMapping(Object mergeVariableColumnMapping) |

## Example (as JSON)

```json
{
  "campaignId": "campaignId0",
  "requiredAddressColumnMapping": {
    "name": "recipient_name",
    "address_line1": "primary_line",
    "address_city": "city",
    "address_state": "state",
    "address_zip": "zip_code"
  },
  "optionalAddressColumnMapping": {
    "address_line2": "secondary_line",
    "company": "company",
    "address_country": "country,"
  },
  "metadata": {
    "columns": [
      "recipient_name"
    ]
  },
  "mergeVariableColumnMapping": {
    "name": "recipient_name",
    "gift_code": "code"
  }
}
```

