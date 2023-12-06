
# Domain Response

## Structure

`DomainResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier for a domain. | String getId() | setId(String id) |
| `Domain` | `String` | Optional | The registered domain/hostname. | String getDomain() | setDomain(String domain) |
| `AccountId` | `String` | Optional | Unique identifier associated with the account the domain is registered for. | String getAccountId() | setAccountId(String accountId) |

## Example (as JSON)

```json
{
  "id": "id2",
  "domain": "domain8",
  "account_id": "account_id4"
}
```

