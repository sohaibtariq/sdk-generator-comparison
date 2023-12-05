# AutocompletionRequest


## Fields

| Field                                                                                                                                                                                                                                                                                                         | Type                                                                                                                                                                                                                                                                                                          | Required                                                                                                                                                                                                                                                                                                      | Description                                                                                                                                                                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `usAutocompletionsWritable`                                                                                                                                                                                                                                                                                   | [org.openapis.openapi.models.shared.UsAutocompletionsWritable](../../models/shared/UsAutocompletionsWritable.md)                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | N/A                                                                                                                                                                                                                                                                                                           |
| `case_`                                                                                                                                                                                                                                                                                                       | [org.openapis.openapi.models.operations.QueryParamCase](../../models/operations/QueryParamCase.md)                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `primary_line`, `city`, and `state`. Default casing is `upper`.                                                                          |
| `validAddresses`                                                                                                                                                                                                                                                                                              | *Boolean*                                                                                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | Possible values are `true` and `false`. If false, not all of the suggestions in the response will be valid addresses; they'll need to be verified in order to determine the deliverability. The valid_addresses flag will greatly reduce the number of keystrokes needed before reaching an intended address. |