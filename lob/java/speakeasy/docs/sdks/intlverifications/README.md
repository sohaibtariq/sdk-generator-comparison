# IntlVerifications
(*intlVerifications*)

## Overview

Address verification for non-US addresses
<br>
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>

## Intl Verifications Test Env

When verifying international addresses, you'll likely want to test against
a wide array of addresses to ensure you're handling responses correctly.
With your test API key, requests that use specific values for `primary_line`
let you explore the responses to many types of addresses:

<table>
  <tr>
    <th style="white-space: nowrap">DELIVERABILITY OF SAMPLE RESPONSE</th>
    <th style="white-space: nowrap">SET <code>primary_line</code> TO</th>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap">deliverable</td>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>deliverable_missing_info</code></td>
    <td style="white-space: nowrap">deliverable missing info</td>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>undeliverable</code></td>
    <td style="white-space: nowrap">undeliverable</td>
  </tr>
  <tr>
    <td style="white-space: nowrap"><code>no_match</code></td>
    <td style="white-space: nowrap">no match</td>
  </tr>
</table>

See the `test` request & response examples under [Intl Verification Examples](#operation/intl_verification) within the
"Verify an international address section" in Intl Verifications.

You can rely on the response from these examples generally matching the response
you'd see in the live environment with an address of that type (excluding the `recipient` field).

The test API key does not perform any verification, automatic correction, or standardization
for addresses. If you wish to try these features out, use our <a href="https://lob.com/address-verification" target="_blank">live demo</a>
or the free plan (see <a href="https://lob.com/pricing/address-verification" target="_blank">our pricing</a> for details).
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [bulkIntlVerifications](#bulkintlverifications) - Bulk Verify
* [intlVerification](#intlverification) - Single Verify

## bulkIntlVerifications

Verify a list of international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BulkIntlVerificationsResponse;
import org.openapis.openapi.models.shared.CountryExtended;
import org.openapis.openapi.models.shared.IntlVerificationsPayload;
import org.openapis.openapi.models.shared.MultipleComponentsIntl;
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

            org.openapis.openapi.models.shared.IntlVerificationsPayload req = new IntlVerificationsPayload(new org.openapis.openapi.models.shared.MultipleComponentsIntl[]{{
    add(new MultipleComponentsIntl("string", CountryExtended.SH){{
        primaryLine = "string";
        country = CountryExtended.LY;
    }}),
}});            

            BulkIntlVerificationsResponse res = sdk.intlVerifications.bulkIntlVerifications(req);

            if (res.intlVerifications != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [org.openapis.openapi.models.shared.IntlVerificationsPayload](../../models/shared/IntlVerificationsPayload.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.BulkIntlVerificationsResponse](../../models/operations/BulkIntlVerificationsResponse.md)**


## intlVerification

Verify an international (except US or US territories) address _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.IntlVerificationRequest;
import org.openapis.openapi.models.operations.IntlVerificationResponse;
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

            IntlVerificationResponse res = sdk.intlVerifications.intlVerification("string", LangSpec.NATIVE_);

            if (res.intlVerification != null) {
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
| `requestBody`                                                                                                                                                                        | *Object*                                                                                                                                                                             | :heavy_check_mark:                                                                                                                                                                   | N/A                                                                                                                                                                                  |
| `xLangOutput`                                                                                                                                                                        | [org.openapis.openapi.models.shared.LangSpec](../../models/shared/LangSpec.md)                                                                                                       | :heavy_minus_sign:                                                                                                                                                                   | * `native` - Translate response to the native language of the country in the request<br/>* `match` - match the response to the language in the request<br/><br/>Default response is in English.<br/> |


### Response

**[org.openapis.openapi.models.operations.IntlVerificationResponse](../../models/operations/IntlVerificationResponse.md)**

