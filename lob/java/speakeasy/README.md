# openapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://opensource.org/licenses/MIT">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


## 🏗 **Welcome to your new SDK!** 🏗

It has been generated successfully based on your OpenAPI spec. However, it is not yet ready for production use. Here are some next steps:
- [ ] 🛠 Make your SDK feel handcrafted by [customizing it](https://www.speakeasyapi.dev/docs/customize-sdks)
- [ ] ♻️ Refine your SDK quickly by iterating locally with the [Speakeasy CLI](https://github.com/speakeasy-api/speakeasy)
- [ ] 🎁 Publish your SDK to package managers by [configuring automatic publishing](https://www.speakeasyapi.dev/docs/productionize-sdks/publish-sdks)
- [ ] ✨ When ready to productionize, delete this section from the README

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'org.openapis.openapi:openapi:0.0.1'
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

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

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [addresses](docs/sdks/addresses/README.md)

* [addressesList](docs/sdks/addresses/README.md#addresseslist) - List
* [addressCreate](docs/sdks/addresses/README.md#addresscreate) - Create
* [addressDelete](docs/sdks/addresses/README.md#addressdelete) - Delete
* [addressRetrieve](docs/sdks/addresses/README.md#addressretrieve) - Retrieve

### [bankAccounts](docs/sdks/bankaccounts/README.md)

* [bankAccountVerify](docs/sdks/bankaccounts/README.md#bankaccountverify) - Verify
* [bankAccountDelete](docs/sdks/bankaccounts/README.md#bankaccountdelete) - Delete
* [bankAccountRetrieve](docs/sdks/bankaccounts/README.md#bankaccountretrieve) - Retrieve
* [bankAccountsList](docs/sdks/bankaccounts/README.md#bankaccountslist) - List

### [billingGroups](docs/sdks/billinggroups/README.md)

* [billingGroupRetrieve](docs/sdks/billinggroups/README.md#billinggroupretrieve) - Retrieve
* [billingGroupUpdate](docs/sdks/billinggroups/README.md#billinggroupupdate) - Update
* [billingGroupsList](docs/sdks/billinggroups/README.md#billinggroupslist) - List
* [billingGroupCreate](docs/sdks/billinggroups/README.md#billinggroupcreate) - Create

### [buckslips](docs/sdks/buckslips/README.md)

* [buckslipsList](docs/sdks/buckslips/README.md#buckslipslist) - List
* [buckslipCreate](docs/sdks/buckslips/README.md#buckslipcreate) - Create
* [buckslipDelete](docs/sdks/buckslips/README.md#buckslipdelete) - Delete
* [buckslipRetrieve](docs/sdks/buckslips/README.md#buckslipretrieve) - Retrieve
* [buckslipUpdate](docs/sdks/buckslips/README.md#buckslipupdate) - Update

### [buckslipOrders](docs/sdks/bucksliporders/README.md)

* [buckslipOrdersRetrieve](docs/sdks/bucksliporders/README.md#buckslipordersretrieve) - Retrieve
* [buckslipOrderCreate](docs/sdks/bucksliporders/README.md#buckslipordercreate) - Create

### [usVerifications](docs/sdks/usverifications/README.md)

* [bulkUsVerifications](docs/sdks/usverifications/README.md#bulkusverifications) - Bulk Verify
* [usVerification](docs/sdks/usverifications/README.md#usverification) - Single Verify

### [intlVerifications](docs/sdks/intlverifications/README.md)

* [bulkIntlVerifications](docs/sdks/intlverifications/README.md#bulkintlverifications) - Bulk Verify
* [intlVerification](docs/sdks/intlverifications/README.md#intlverification) - Single Verify

### [campaigns](docs/sdks/campaigns/README.md)

* [campaignsList](docs/sdks/campaigns/README.md#campaignslist) - List
* [campaignCreate](docs/sdks/campaigns/README.md#campaigncreate) - Create
* [campaignDelete](docs/sdks/campaigns/README.md#campaigndelete) - Delete
* [campaignRetrieve](docs/sdks/campaigns/README.md#campaignretrieve) - Retrieve
* [campaignUpdate](docs/sdks/campaigns/README.md#campaignupdate) - Update
* [campaignSend](docs/sdks/campaigns/README.md#campaignsend) - Send Campaign

### [cards](docs/sdks/cards/README.md)

* [cardsList](docs/sdks/cards/README.md#cardslist) - List
* [cardCreate](docs/sdks/cards/README.md#cardcreate) - Create
* [cardDelete](docs/sdks/cards/README.md#carddelete) - Delete
* [cardRetrieve](docs/sdks/cards/README.md#cardretrieve) - Retrieve
* [cardUpdate](docs/sdks/cards/README.md#cardupdate) - Update

### [cardOrders](docs/sdks/cardorders/README.md)

* [cardOrdersRetrieve](docs/sdks/cardorders/README.md#cardordersretrieve) - Retrieve
* [cardOrderCreate](docs/sdks/cardorders/README.md#cardordercreate) - Create

### [checks](docs/sdks/checks/README.md)

* [checksList](docs/sdks/checks/README.md#checkslist) - List
* [checkCancel](docs/sdks/checks/README.md#checkcancel) - Cancel
* [checkRetrieve](docs/sdks/checks/README.md#checkretrieve) - Retrieve

### [creatives](docs/sdks/creatives/README.md)

* [creativeCreate](docs/sdks/creatives/README.md#creativecreate) - Create
* [creativeRetrieve](docs/sdks/creatives/README.md#creativeretrieve) - Retrieve
* [creativeUpdate](docs/sdks/creatives/README.md#creativeupdate) - Update

### [identityValidation](docs/sdks/identityvalidation/README.md)

* [identityValidation](docs/sdks/identityvalidation/README.md#identityvalidation) - Identity Validation

### [intlAutocompletions](docs/sdks/intlautocompletions/README.md)

* [intlAutocompletions](docs/sdks/intlautocompletions/README.md#intlautocompletions) - Autocomplete

### [letters](docs/sdks/letters/README.md)

* [letterCancel](docs/sdks/letters/README.md#lettercancel) - Cancel
* [letterRetrieve](docs/sdks/letters/README.md#letterretrieve) - Retrieve
* [lettersList](docs/sdks/letters/README.md#letterslist) - List

### [postcards](docs/sdks/postcards/README.md)

* [postcardDelete](docs/sdks/postcards/README.md#postcarddelete) - Cancel
* [postcardRetrieve](docs/sdks/postcards/README.md#postcardretrieve) - Retrieve
* [postcardsList](docs/sdks/postcards/README.md#postcardslist) - List

### [qrCodes](docs/sdks/qrcodes/README.md)

* [qrCodesList](docs/sdks/qrcodes/README.md#qrcodeslist) - List

### [urlShortener](docs/sdks/urlshortener/README.md)

* [domainDelete](docs/sdks/urlshortener/README.md#domaindelete) - Delete a Domain
* [domainGet](docs/sdks/urlshortener/README.md#domainget) - Retrieve a domain
* [domainList](docs/sdks/urlshortener/README.md#domainlist) - List all domains
* [domainCreate](docs/sdks/urlshortener/README.md#domaincreate) - Create Domain
* [domainDeleteLinks](docs/sdks/urlshortener/README.md#domaindeletelinks) - Delete all links for a domain
* [linksList](docs/sdks/urlshortener/README.md#linkslist) - Retrieve all shortened links
* [linksDelete](docs/sdks/urlshortener/README.md#linksdelete) - Delete Link
* [linksGet](docs/sdks/urlshortener/README.md#linksget) - Retrieve a link
* [linkUpdate](docs/sdks/urlshortener/README.md#linkupdate) - Update a Link
* [linkCreate](docs/sdks/urlshortener/README.md#linkcreate) - Create Link

### [selfMailers](docs/sdks/selfmailers/README.md)

* [selfMailerDelete](docs/sdks/selfmailers/README.md#selfmailerdelete) - Delete
* [selfMailerRetrieve](docs/sdks/selfmailers/README.md#selfmailerretrieve) - Retrieve
* [selfMailersList](docs/sdks/selfmailers/README.md#selfmailerslist) - List

### [templateVersions](docs/sdks/templateversions/README.md)

* [templateVersionDelete](docs/sdks/templateversions/README.md#templateversiondelete) - Delete
* [templateVersionRetrieve](docs/sdks/templateversions/README.md#templateversionretrieve) - Retrieve
* [templateVersionUpdate](docs/sdks/templateversions/README.md#templateversionupdate) - Update
* [templateVersionsList](docs/sdks/templateversions/README.md#templateversionslist) - List
* [createTemplateVersion](docs/sdks/templateversions/README.md#createtemplateversion) - Create

### [templates](docs/sdks/templates/README.md)

* [templateDelete](docs/sdks/templates/README.md#templatedelete) - Delete
* [templateRetrieve](docs/sdks/templates/README.md#templateretrieve) - Retrieve
* [templateUpdate](docs/sdks/templates/README.md#templateupdate) - Update
* [templatesList](docs/sdks/templates/README.md#templateslist) - List
* [createTemplate](docs/sdks/templates/README.md#createtemplate) - Create

### [uploads](docs/sdks/uploads/README.md)

* [uploadsList](docs/sdks/uploads/README.md#uploadslist) - List
* [uploadCreate](docs/sdks/uploads/README.md#uploadcreate) - Create
* [uploadDelete](docs/sdks/uploads/README.md#uploaddelete) - Delete
* [uploadRetrieve](docs/sdks/uploads/README.md#uploadretrieve) - Retrieve
* [uploadUpdate](docs/sdks/uploads/README.md#uploadupdate) - Update
* [uploadFile](docs/sdks/uploads/README.md#uploadfile) - Upload file
* [uploadExportCreate](docs/sdks/uploads/README.md#uploadexportcreate) - Create Export
* [reportRetrieve](docs/sdks/uploads/README.md#reportretrieve) - Retrieve Line Item Report
* [exportRetrieve](docs/sdks/uploads/README.md#exportretrieve) - Retrieve Export

### [usAutocompletions](docs/sdks/usautocompletions/README.md)

* [autocompletion](docs/sdks/usautocompletions/README.md#autocompletion) - Autocomplete

### [reverseGeocodeLookups](docs/sdks/reversegeocodelookups/README.md)

* [reverseGeocodeLookup](docs/sdks/reversegeocodelookups/README.md#reversegeocodelookup) - Reverse Geocode Lookup

### [zipLookups](docs/sdks/ziplookups/README.md)

* [zipLookup](docs/sdks/ziplookups/README.md#ziplookup) - Lookups
<!-- End Available Resources and Operations [operations] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
