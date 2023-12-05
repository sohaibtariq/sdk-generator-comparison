# QRCodes
(*qrCodes*)

## Overview


Lob QR codes allow you to generate a QR code that is unique to each mailpiece, thereby allowing each and every customers to receive a personalized link. See the Create endpoint for <a href="#tag/Letters/operation/letter_create">Letters</a>, <a href="#tag/Postcards/operation/postcard_create">Postcards</a> or <a href="#tag/Self-Mailers/operation/self_mailer_create">Self Mailers</a> to learn how to embed a QR code into your mail piece.

Webhooks can be used to integrate Lob QR code scans into your omni channel marketing strategy. See the <a href="#tag/Webhooks">Webhooks</a> section of our documentation to learn how to enable the `letter.viewed`, `postcard.viewed` and `self_mailer.viewed` event notifications for your mail pieces.

Furthermore, our QR code Analytics endpoint can be used to track the impact and engagement rate of your mail sends. Lob can tell you exactly which recipients opened your mailpiece. Our Analytics endpoint allows you to see exactly which recipient scanned a mailpiece, when they scanned it, and more!

<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [qrCodesList](#qrcodeslist) - List

## qrCodesList

Returns a list of your QR codes. The QR codes are returned sorted by scan date, with the most recently scanned QR codes appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.QrCodesListRequest;
import org.openapis.openapi.models.operations.QrCodesListResponse;
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

            QrCodesListRequest req = new QrCodesListRequest(){{
                limit = 10L;
                offset = 459643L;
                include = new String[]{{
                    add("string"),
                }};
                dateCreated = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                scanned = false;
                resourceIds = new String[]{{
                    add("string"),
                }};
            }};            

            QrCodesListResponse res = sdk.qrCodes.qrCodesList(req);

            if (res.object != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [org.openapis.openapi.models.operations.QrCodesListRequest](../../models/operations/QrCodesListRequest.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[org.openapis.openapi.models.operations.QrCodesListResponse](../../models/operations/QrCodesListResponse.md)**

