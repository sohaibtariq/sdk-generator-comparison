# USAutocompletions
(*usAutocompletions*)

## Overview

Given partial address information, this endpoint returns up to 10 address suggestions. <br> <div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>
## Autocompletion Test Env
Your test API key does not autocomplete US addresses and is used to simulate behavior. With your test API key, requests with specific values for `address_prefix` return predetermined values. When `address_prefix` is set to:
- `0 suggestions` - Returns no suggestions - `[PRIMARY NUMBER] s[uggestion]` - Returns a maximum of ten predefined suggested addresses.
  `[PRIMARY NUMBER]` does not have to be a valid primary number when sending a test request.
  Each additional letter in `suggestion` reduces the number of suggestions by one (e.g.
  `1 su` returns 9 suggested addresses). `[PRIMARY NUMBER]` does not affect the number of
  suggestions returned.

City and state filters work as expected and filter the list of predetermined suggested addresses.
See the `test` request & response examples under [Autocomplete Examples](#operation/autocompletion) within the "Autocomplete a partial address" section in US Autocompletions. <div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [autocompletion](#autocompletion) - Autocomplete

## autocompletion

Given an address prefix consisting of a partial primary line, as well as optional input of city, state, and zip code, this functionality returns up to 10 full US address suggestions. Not all of them will turn out to be valid addresses; they'll need to be [verified](#operation/verification_us).

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AutocompletionRequest;
import org.openapis.openapi.models.operations.AutocompletionResponse;
import org.openapis.openapi.models.operations.QueryParamCase;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.UsAutocompletionsWritable;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            AutocompletionResponse res = sdk.usAutocompletions.autocompletion(new UsAutocompletionsWritable("string"){{
                addressPrefix = "string";
            }}, QueryParamCase.PROPER, false);

            if (res.usAutocompletions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                     | Type                                                                                                                                                                                                                                                                                                          | Required                                                                                                                                                                                                                                                                                                      | Description                                                                                                                                                                                                                                                                                                   |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `usAutocompletionsWritable`                                                                                                                                                                                                                                                                                   | [org.openapis.openapi.models.shared.UsAutocompletionsWritable](../../models/shared/UsAutocompletionsWritable.md)                                                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                                                                                                            | N/A                                                                                                                                                                                                                                                                                                           |
| `case_`                                                                                                                                                                                                                                                                                                       | [org.openapis.openapi.models.operations.QueryParamCase](../../models/operations/QueryParamCase.md)                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `primary_line`, `city`, and `state`. Default casing is `upper`.                                                                          |
| `validAddresses`                                                                                                                                                                                                                                                                                              | *Boolean*                                                                                                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                                                                                            | Possible values are `true` and `false`. If false, not all of the suggestions in the response will be valid addresses; they'll need to be verified in order to determine the deliverability. The valid_addresses flag will greatly reduce the number of keystrokes needed before reaching an intended address. |


### Response

**[org.openapis.openapi.models.operations.AutocompletionResponse](../../models/operations/AutocompletionResponse.md)**

