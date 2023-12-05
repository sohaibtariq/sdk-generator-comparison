# Deliverability

Summarizes the deliverability of the `intl_verification` object. Possible values are:
* `deliverable` — The address is deliverable.
* `deliverable_missing_info` — The address is missing some information, but is most likely deliverable.
* `undeliverable` — The address is most likely not deliverable. Some components of the address (such as city or postal code) may have been found.
* `no_match` — This address is not deliverable. No matching street could be found within the city or postal code.



## Values

| Name                       | Value                      |
| -------------------------- | -------------------------- |
| `DELIVERABLE`              | deliverable                |
| `DELIVERABLE_MISSING_INFO` | deliverable_missing_info   |
| `UNDELIVERABLE`            | undeliverable              |
| `NO_MATCH`                 | no_match                   |