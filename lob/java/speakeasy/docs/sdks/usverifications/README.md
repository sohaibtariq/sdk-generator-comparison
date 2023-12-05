# USVerifications
(*usVerifications*)

## Overview

Validate, automatically correct, and standardize the addresses in your
address book based on USPS's <a href="https://postalpro.usps.com/certifications/cass" target="_blank">Coding Accuracy Support System (CASS)</a>.
<br>
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>

## US Verifications Test Env

When verifying US addresses, you'll likely want to test against a wide array of addresses to
ensure you're handling responses correctly. With your test API key, requests that use specific
values for `address` or `primary_line` and (if using `primary_line`) an arbitrary five digit
number for `zip_code` (e.g. "11111") let you explore the responses to many types of addresses:

<table>
  <tr>
    <th style="white-space: nowrap">ADDRESS TYPE FOR SAMPLE RESPONSE</th>
    <th style="white-space: nowrap">DELIVERABILITY</th>
    <th style="white-space: nowrap">SET <code>primary_line</code> OR <code>address</code> TO</th>
  </tr>
  <tr>
    <td style="white-space: nowrap">Commercial highrise</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>commercial highrise</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Residential highrise</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>residential highrise</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Residential house</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>residential house</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">PO Box</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>po box</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Rural route</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>rural route</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Puerty Rico address w/ urbanization</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>puerto rico</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Military address</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>military</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Department of state</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>department of state</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Generic deliverable</td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
    <td style="white-space: nowrap"><code>deliverable</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Missing a suite number</td>
    <td style="white-space: nowrap"><code>deliverable_missing_unit</code></td>
    <td style="white-space: nowrap"><code>missing unit</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Suite number doesn't exist</td>
    <td style="white-space: nowrap"><code>deliverable_incorrect_unit</code></td>
    <td style="white-space: nowrap"><code>incorrect unit</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Residential house with unnecessary suite number</td>
    <td style="white-space: nowrap"><code>deliverable_unnecessary_unit</code></td>
    <td style="white-space: nowrap"><code>unnecessary unit</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Undeliverable and block matched</td>
    <td style="white-space: nowrap"><code>undeliverable</code></td>
    <td style="white-space: nowrap"><code>undeliverable block match</code></td>
  </tr>
  <tr>
    <td style="white-space: nowrap">Undeliverable and no block matched</td>
    <td style="white-space: nowrap"><code>undeliverable</code></td>
    <td style="white-space: nowrap"><code>undeliverable no match</code></td>
  </tr>
</table>

See the `test` request & response examples under [US Verification Examples](#operation/us_verification) within the
"Verify a US or US territory address" section in US Verifications.

You can rely on the response from these examples generally matching the response you'd see in the live environment with an
address of that type (excluding the `recipient` field).

The test API key does not perform any verification, automatic correction, or standardization for addresses. If you wish to
try these features out, use our <a href="https://lob.com/address-verification" target="_blank">live demo</a> or the free plan (see <a href="https://lob.com/pricing/address-verification" target="_blank">our pricing</a> for details).
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [bulkUsVerifications](#bulkusverifications) - Bulk Verify
* [usVerification](#usverification) - Single Verify

## bulkUsVerifications

Verify a list of US or US territory addresses _with a live API key_. Requests to this endpoint with a test API key will return a dummy response based on the primary line you input.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.BulkUsVerificationsRequest;
import org.openapis.openapi.models.operations.BulkUsVerificationsResponse;
import org.openapis.openapi.models.operations.Case;
import org.openapis.openapi.models.shared.MultipleComponentsList;
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

            BulkUsVerificationsResponse res = sdk.usVerifications.bulkUsVerifications(new MultipleComponentsList(new Object[]{{
                add("string"),
            }}){{
                addresses = new Object[]{{
                    add("string"),
                }};
            }}, Case.PROPER);

            if (res.usVerifications != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                       | Type                                                                                                                                                                                                                                                                            | Required                                                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `multipleComponentsList`                                                                                                                                                                                                                                                        | [org.openapis.openapi.models.shared.MultipleComponentsList](../../models/shared/MultipleComponentsList.md)                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                                                                              | N/A                                                                                                                                                                                                                                                                             |
| `case_`                                                                                                                                                                                                                                                                         | [org.openapis.openapi.models.operations.Case](../../models/operations/Case.md)                                                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                              | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`. |


### Response

**[org.openapis.openapi.models.operations.BulkUsVerificationsResponse](../../models/operations/BulkUsVerificationsResponse.md)**


## usVerification

Verify a US or US territory address _with a live API key_. The address can be in components (e.g. `primary_line` is "210 King Street", `zip_code` is "94107") or as a single string (e.g. "210 King Street 94107"), but not as both. Requests using a test API key validate required fields but return empty values unless specific `primary_line` values are provided. See the [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UsVerificationQueryParamCase;
import org.openapis.openapi.models.operations.UsVerificationRequest;
import org.openapis.openapi.models.operations.UsVerificationResponse;
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

            UsVerificationResponse res = sdk.usVerifications.usVerification("string", UsVerificationQueryParamCase.UPPER);

            if (res.usVerification != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                       | Type                                                                                                                                                                                                                                                                            | Required                                                                                                                                                                                                                                                                        | Description                                                                                                                                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `requestBody`                                                                                                                                                                                                                                                                   | *Object*                                                                                                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                                                                              | N/A                                                                                                                                                                                                                                                                             |
| `case_`                                                                                                                                                                                                                                                                         | [org.openapis.openapi.models.operations.UsVerificationQueryParamCase](../../models/operations/UsVerificationQueryParamCase.md)                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                                                                                                              | Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`. |


### Response

**[org.openapis.openapi.models.operations.UsVerificationResponse](../../models/operations/UsVerificationResponse.md)**

