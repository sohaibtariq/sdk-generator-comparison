<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ListPetsRequest;
import org.openapis.openapi.models.operations.ListPetsResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    bearerAuth = "";
                }})
                .build();

            ListPetsResponse res = sdk.pets.listPets(21453L);

            if (res.pets != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->