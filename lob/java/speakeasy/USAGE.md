<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AddressesListRequest;
import org.openapis.openapi.models.operations.AddressesListResponse;
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

            AddressesListRequest req = new AddressesListRequest(){{
                limit = 10L;
                beforeAfter = "string";
                include = new String[]{{
                    add("string"),
                }};
                dateCreated = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                metadata = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
            }};            

            AddressesListResponse res = sdk.addresses.addressesList(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->