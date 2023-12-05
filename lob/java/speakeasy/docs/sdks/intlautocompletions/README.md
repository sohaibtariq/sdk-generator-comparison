# IntlAutocompletions
(*intlAutocompletions*)

## Overview

Address autocompletion for non-US addresses. Given partial address information, this endpoint returns up to 10 address suggestions.
## Autocompletion Test Env
Your test API key does not autocomplete international addresses and is used to simulate
behavior. With your test API key, requests with specific values for `address_prefix`
return predetermined values. When `address_prefix` is set to:
- `0 suggestions` - Returns no suggestions
- `[PRIMARY NUMBER] s[uggestion]` - Returns a maximum of ten predefined suggested addresses.
  `[PRIMARY NUMBER]` does not have to be a valid primary number when sending a test request.
  Each additional letter in `suggestion` reduces the number of suggestions by one (e.g.
  `1 su` returns 9 suggested addresses). `[PRIMARY NUMBER]` does not affect the number of
  suggestions returned.
Country is a required field.
City and state filters work as expected and filter the list of predetermined suggested addresses.
See the `test` request & response examples under [Autocomplete Examples](#operation/intl_autocompletions) within the "Autocomplete
a partial address" section in Intl Autocompletions.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [intlAutocompletions](#intlautocompletions) - Autocomplete

## intlAutocompletions

Given an address prefix consisting of a partial primary line and country, as well as optional input of city, state, and zip code, this functionality returns up to 10 full International address suggestions. Not all of them will turn out to be valid addresses; they'll need to be [verified](#operation/intl_verification).

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.IntlAutocompletionsRequest;
import org.openapis.openapi.models.operations.IntlAutocompletionsResponse;
import org.openapis.openapi.models.shared.CountryExtended;
import org.openapis.openapi.models.shared.IntlAutocompletionsWritable;
import org.openapis.openapi.models.shared.LangSpec;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            IntlAutocompletionsResponse res = sdk.intlAutocompletions.intlAutocompletions(new IntlAutocompletionsWritable("string", CountryExtended.DE){{
                addressPrefix = "string";
                country = CountryExtended.SK;
            }}, LangSpec.NATIVE_);

            if (res.intlAutocompletions != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                            | Type                                                                                                                                                                                 | Required                                                                                                                                                                             | Description                                                                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `intlAutocompletionsWritable`                                                                                                                                                        | [org.openapis.openapi.models.shared.IntlAutocompletionsWritable](../../models/shared/IntlAutocompletionsWritable.md)                                                                 | :heavy_check_mark:                                                                                                                                                                   | N/A                                                                                                                                                                                  |
| `xLangOutput`                                                                                                                                                                        | [org.openapis.openapi.models.shared.LangSpec](../../models/shared/LangSpec.md)                                                                                                       | :heavy_minus_sign:                                                                                                                                                                   | * `native` - Translate response to the native language of the country in the request<br/>* `match` - match the response to the language in the request<br/><br/>Default response is in English.<br/> |


### Response

**[org.openapis.openapi.models.operations.IntlAutocompletionsResponse](../../models/operations/IntlAutocompletionsResponse.md)**

