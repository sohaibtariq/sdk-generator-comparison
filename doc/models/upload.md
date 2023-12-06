
# Upload

## Structure

`Upload`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CampaignId` | `String` | Required | **Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` | String getCampaignId() | setCampaignId(String campaignId) |
| `RequiredAddressColumnMapping` | [`RequiredAddressColumns`](../../doc/models/required-address-columns.md) | Required | The mapping of column headers in your file to Lob-required fields for the resource created. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#required-columns-2" target="_blank">Campaign Audience Guide</a> for additional details. | RequiredAddressColumns getRequiredAddressColumnMapping() | setRequiredAddressColumnMapping(RequiredAddressColumns requiredAddressColumnMapping) |
| `OptionalAddressColumnMapping` | [`OptionalAddressColumns`](../../doc/models/optional-address-columns.md) | Required | The mapping of column headers in your file to Lob-optional fields for the resource created. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#optional-columns-3" target="_blank">Campaign Audience Guide</a> for additional details. | OptionalAddressColumns getOptionalAddressColumnMapping() | setOptionalAddressColumnMapping(OptionalAddressColumns optionalAddressColumnMapping) |
| `Metadata` | [`Metadata`](../../doc/models/metadata.md) | Required | The list of column headers in your file as an array that you want as metadata associated with each mailpiece. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#required-columns-2" target="_blank">Campaign Audience Guide</a> for additional details. | Metadata getMetadata() | setMetadata(Metadata metadata) |
| `MergeVariableColumnMapping` | `Object` | Required | The mapping of column headers in your file to the merge variables present in your creative. See our <a href="https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7" target="_blank">Campaign Audience Guide</a> for additional details. <br />If a merge variable has the same "name" as a "key" in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the `requiredAddressColumnMapping` or `optionalAddressColumnMapping` objects. If using customized QR code redirect from the Audience file, then a `qr_code_redirect_url` must be mapped to the column header as used in the CSV. | Object getMergeVariableColumnMapping() | setMergeVariableColumnMapping(Object mergeVariableColumnMapping) |
| `Id` | `String` | Required | Unique identifier prefixed with `upl_`.<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` | String getId() | setId(String id) |
| `AccountId` | `String` | Required | Account ID that made the request | String getAccountId() | setAccountId(String accountId) |
| `Mode` | [`ModeEnum`](../../doc/models/mode-enum.md) | Required | The environment in which the mailpieces were created. Today, will only be `live`. | ModeEnum getMode() | setMode(ModeEnum mode) |
| `FailuresUrl` | `String` | Optional | Url where your campaign mailpiece failures can be retrieved | String getFailuresUrl() | setFailuresUrl(String failuresUrl) |
| `OriginalFilename` | `String` | Optional | Filename of the upload | String getOriginalFilename() | setOriginalFilename(String originalFilename) |
| `State` | [`UploadStateEnum`](../../doc/models/upload-state-enum.md) | Required | The `state` property on the `upload` object. As the file is processed, the `state` will change from `Ready for Validation` to `Validating` and then will be either `Scheduled` (successfully processed) or `Errored` (Unsuccessfully processed).<br>**Default**: `UploadStateEnum.DRAFT` | UploadStateEnum getState() | setState(UploadStateEnum state) |
| `TotalMailpieces` | `int` | Required | Total number of recipients for the campaign | int getTotalMailpieces() | setTotalMailpieces(int totalMailpieces) |
| `FailedMailpieces` | `int` | Required | Number of mailpieces that failed to create | int getFailedMailpieces() | setFailedMailpieces(int failedMailpieces) |
| `ValidatedMailpieces` | `int` | Required | Number of mailpieces that were successfully created | int getValidatedMailpieces() | setValidatedMailpieces(int validatedMailpieces) |
| `BytesProcessed` | `int` | Required | Number of bytes processed in your CSV | int getBytesProcessed() | setBytesProcessed(int bytesProcessed) |
| `DateCreated` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the upload was created | LocalDateTime getDateCreated() | setDateCreated(LocalDateTime dateCreated) |
| `DateModified` | `LocalDateTime` | Required | A timestamp in ISO 8601 format of the date the upload was last modified | LocalDateTime getDateModified() | setDateModified(LocalDateTime dateModified) |

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
  },
  "id": "id0",
  "accountId": "fa9ea650fc7b31a89f92",
  "mode": "test",
  "failuresUrl": "https://www.example.com",
  "originalFilename": "my_audience.csv",
  "state": "Draft",
  "totalMailpieces": 100,
  "failedMailpieces": 5,
  "validatedMailpieces": 95,
  "bytesProcessed": 17268,
  "dateCreated": "2016-03-13T12:52:32.123Z",
  "dateModified": "2016-03-13T12:52:32.123Z"
}
```

