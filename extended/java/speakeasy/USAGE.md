<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.AddPetResponse;
import org.openapis.openapi.models.shared.Category;
import org.openapis.openapi.models.shared.Pet;
import org.openapis.openapi.models.shared.PetStatus;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.Tag;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string"){{
                    petstoreAuth = "";
                }})
                .build();

            org.openapis.openapi.models.shared.Pet req = new Pet("doggie", new String[]{{
    add("https://www.example.com/image.jpeg"),
}}){{
                id = 123L;
                category = new Category(){{
                    id = 1L;
                    name = "Dogs";
                }};
                tags = new org.openapis.openapi.models.shared.Tag[]{{
                    add(new Tag(){{
                        id = 1234L;
                        name = "Hugo";
                    }}),
                }};
                status = PetStatus.PENDING;
            }};            

            AddPetResponse res = sdk.pet.addPet(req);

            if (res.pet != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->