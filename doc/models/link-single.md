
# Link Single

## Structure

`LinkSingle`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RedirectLink` | `String` | Required | The original target URL. | String getRedirectLink() | setRedirectLink(String redirectLink) |
| `Domain` | `String` | Optional | The registered domain to be used for the short URL. | String getDomain() | setDomain(String domain) |
| `Slug` | `String` | Optional | The unique path for the shortened URL, if empty a unique path will be used. | String getSlug() | setSlug(String slug) |
| `MetadataTag` | `Map<String, String>` | Optional | Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information. | Map<String, String> getMetadataTag() | setMetadataTag(Map<String, String> metadataTag) |
| `BillingGroupId` | `String` | Optional | An optional string with the billing group ID to tag your usage with. Is used for billing purposes. Requires special activation to use. See <a href="#tag/Billing-Groups">Billing Group API</a> for more information. | String getBillingGroupId() | setBillingGroupId(String billingGroupId) |

## Example (as JSON)

```json
{
  "redirect_link": "redirect_link4",
  "domain": "domain0",
  "slug": "slug8",
  "metadata_tag": {
    "key0": "metadata_tag0",
    "key1": "metadata_tag9"
  },
  "billing_group_id": "billing_group_id6"
}
```

