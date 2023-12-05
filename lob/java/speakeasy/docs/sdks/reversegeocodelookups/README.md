# ReverseGeocodeLookups
(*reverseGeocodeLookups*)

## Overview

Find a list of zip codes associated with a valid US location via latitude and longitude. <br> <div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [reverseGeocodeLookup](#reversegeocodelookup) - Reverse Geocode Lookup

## reverseGeocodeLookup

Reverse geocode a valid US location with a live API key.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ReverseGeocodeLookupRequest;
import org.openapis.openapi.models.operations.ReverseGeocodeLookupResponse;
import org.openapis.openapi.models.shared.Location;
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

            ReverseGeocodeLookupResponse res = sdk.reverseGeocodeLookups.reverseGeocodeLookup(new Location(6201.75f, 7874.36f){{
                latitude = 3188.5f;
                longitude = 2102.66f;
            }}, 5L);

            if (res.reverseGeocode != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                   | Type                                                                                                                                                                                        | Required                                                                                                                                                                                    | Description                                                                                                                                                                                 | Example                                                                                                                                                                                     |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `location`                                                                                                                                                                                  | [org.openapis.openapi.models.shared.Location](../../models/shared/Location.md)                                                                                                              | :heavy_check_mark:                                                                                                                                                                          | N/A                                                                                                                                                                                         |                                                                                                                                                                                             |
| `size`                                                                                                                                                                                      | *Long*                                                                                                                                                                                      | :heavy_minus_sign:                                                                                                                                                                          | Determines the number of locations returned. Possible values are between 1 and 50 and any number higher will be rounded down to 50. Default size is a list of 5 reverse geocoded locations. | 5                                                                                                                                                                                           |


### Response

**[org.openapis.openapi.models.operations.ReverseGeocodeLookupResponse](../../models/operations/ReverseGeocodeLookupResponse.md)**

