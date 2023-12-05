
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `basicAuthUserName` | `String` | The username to use with basic authentication |
| `basicAuthPassword` | `String` | The password to use with basic authentication |

The API client can be initialized as follows:

```java
LobClient client = new LobClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .basicAuthCredentials("BasicAuthUserName", "BasicAuthPassword")
    .build();
```

## LobClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAddressesController()` | Provides access to Addresses controller. | `AddressesController` |
| `getBankAccountsController()` | Provides access to BankAccounts controller. | `BankAccountsController` |
| `getBillingGroupsController()` | Provides access to BillingGroups controller. | `BillingGroupsController` |
| `getBuckslipOrdersController()` | Provides access to BuckslipOrders controller. | `BuckslipOrdersController` |
| `getBuckslipsController()` | Provides access to Buckslips controller. | `BuckslipsController` |
| `getCampaignsController()` | Provides access to Campaigns controller. | `CampaignsController` |
| `getCardOrdersController()` | Provides access to CardOrders controller. | `CardOrdersController` |
| `getCardsController()` | Provides access to Cards controller. | `CardsController` |
| `getChecksController()` | Provides access to Checks controller. | `ChecksController` |
| `getCreativesController()` | Provides access to Creatives controller. | `CreativesController` |
| `getIdentityValidationController()` | Provides access to IdentityValidation controller. | `IdentityValidationController` |
| `getIntlAutocompletionsController()` | Provides access to IntlAutocompletions controller. | `IntlAutocompletionsController` |
| `getIntlVerificationsController()` | Provides access to IntlVerifications controller. | `IntlVerificationsController` |
| `getLettersController()` | Provides access to Letters controller. | `LettersController` |
| `getPostcardsController()` | Provides access to Postcards controller. | `PostcardsController` |
| `getQRCodesController()` | Provides access to QRCodes controller. | `QRCodesController` |
| `getReverseGeocodeLookupsController()` | Provides access to ReverseGeocodeLookups controller. | `ReverseGeocodeLookupsController` |
| `getSelfMailersController()` | Provides access to SelfMailers controller. | `SelfMailersController` |
| `getTemplateVersionsController()` | Provides access to TemplateVersions controller. | `TemplateVersionsController` |
| `getTemplatesController()` | Provides access to Templates controller. | `TemplatesController` |
| `getUploadsController()` | Provides access to Uploads controller. | `UploadsController` |
| `getURLShortenerController()` | Provides access to URLShortener controller. | `URLShortenerController` |
| `getUSAutocompletionsController()` | Provides access to USAutocompletions controller. | `USAutocompletionsController` |
| `getUSVerificationsController()` | Provides access to USVerifications controller. | `USVerificationsController` |
| `getZipLookupsController()` | Provides access to ZipLookups controller. | `ZipLookupsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

