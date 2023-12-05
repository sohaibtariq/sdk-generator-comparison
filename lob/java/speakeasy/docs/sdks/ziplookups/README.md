# ZipLookups
(*zipLookups*)

## Overview

Find a list of cities, states and associated information about a US ZIP code. <div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [zipLookup](#ziplookup) - Lookups

## zipLookup

Returns information about a ZIP code

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ZipLookupResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Zip5;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            org.openapis.openapi.models.shared.Zip5 req = new Zip5("94107");            

            ZipLookupResponse res = sdk.zipLookups.zipLookup(req);

            if (res.zip != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                              | Type                                                                   | Required                                                               | Description                                                            |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| `request`                                                              | [org.openapis.openapi.models.shared.Zip5](../../models/shared/Zip5.md) | :heavy_check_mark:                                                     | The request object to use for the request.                             |


### Response

**[org.openapis.openapi.models.operations.ZipLookupResponse](../../models/operations/ZipLookupResponse.md)**

