# URLShortener
(*urlShortener*)

## Overview

Lob's URL shortener allows you to generate unique short links, either with Lob's own domain or your own custom domains. Each custom link enables Lob to track mail individually and provide customers the relevant tracking data in their dashboard.

Webhooks can be used to integrate Lob's URL Shortener scans into your omni channel marketing stratergy. See the <a href="#tag/Webhooks">Webhooks</a> section of our documentation to learn how to enable the `letter.viewed`, `postcard.viewed` and `self_mailer.viewed` event notifications for your mail pieces.

Furthermore, you can use our Retrieve endpoints to track the impact and engagement rate of links created. 

<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [domainDelete](#domaindelete) - Delete a Domain
* [domainGet](#domainget) - Retrieve a domain
* [domainList](#domainlist) - List all domains
* [domainCreate](#domaincreate) - Create Domain
* [domainDeleteLinks](#domaindeletelinks) - Delete all links for a domain
* [linksList](#linkslist) - Retrieve all shortened links
* [linksDelete](#linksdelete) - Delete Link
* [linksGet](#linksget) - Retrieve a link
* [linkUpdate](#linkupdate) - Update a Link
* [linkCreate](#linkcreate) - Create Link

## domainDelete

Delete a registered domain. This operation can only be performed if all associated links with the domain are deleted.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DomainDeleteRequest;
import org.openapis.openapi.models.operations.DomainDeleteResponse;
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

            DomainDeleteResponse res = sdk.urlShortener.domainDelete("string");

            if (res.domainResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `domainId`                      | *String*                        | :heavy_check_mark:              | Unique identifier for a domain. |


### Response

**[org.openapis.openapi.models.operations.DomainDeleteResponse](../../models/operations/DomainDeleteResponse.md)**


## domainGet

Retrieve details for a single domain.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DomainGetRequest;
import org.openapis.openapi.models.operations.DomainGetResponse;
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

            DomainGetResponse res = sdk.urlShortener.domainGet("string");

            if (res.domainResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `domainId`                      | *String*                        | :heavy_check_mark:              | Unique identifier for a domain. |


### Response

**[org.openapis.openapi.models.operations.DomainGetResponse](../../models/operations/DomainGetResponse.md)**


## domainList

Retrieve a list of all created domains.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DomainListResponse;
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

            DomainListResponse res = sdk.urlShortener.domainList();

            if (res.domainsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[org.openapis.openapi.models.operations.DomainListResponse](../../models/operations/DomainListResponse.md)**


## domainCreate

Add a new custom domain that can be used to create custom links.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DomainCreateResponse;
import org.openapis.openapi.models.shared.Domains;
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

            org.openapis.openapi.models.shared.Domains req = new Domains("string");            

            DomainCreateResponse res = sdk.urlShortener.domainCreate(req);

            if (res.domainResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                    | Type                                                                         | Required                                                                     | Description                                                                  |
| ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- | ---------------------------------------------------------------------------- |
| `request`                                                                    | [org.openapis.openapi.models.shared.Domains](../../models/shared/Domains.md) | :heavy_check_mark:                                                           | The request object to use for the request.                                   |


### Response

**[org.openapis.openapi.models.operations.DomainCreateResponse](../../models/operations/DomainCreateResponse.md)**


## domainDeleteLinks

Delete all associated links for a domain

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.DomainDeleteLinksRequest;
import org.openapis.openapi.models.operations.DomainDeleteLinksResponse;
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

            DomainDeleteLinksResponse res = sdk.urlShortener.domainDeleteLinks("string");

            if (res.domainsResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `domainId`                      | *String*                        | :heavy_check_mark:              | Unique identifier for a domain. |


### Response

**[org.openapis.openapi.models.operations.DomainDeleteLinksResponse](../../models/operations/DomainDeleteLinksResponse.md)**


## linksList

Retrieves a list of shortened links. The list is sorted by  creation date, with the most recently created appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LinksListRequest;
import org.openapis.openapi.models.operations.LinksListResponse;
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

            LinksListRequest req = new LinksListRequest(){{
                limit = 10L;
                offset = 208175L;
                include = new String[]{{
                    add("string"),
                }};
                dateCreated = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                metadata = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                campaignId = "string";
                clicked = false;
                billingGroupId = "string";
            }};            

            LinksListResponse res = sdk.urlShortener.linksList(req);

            if (res.linksResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [org.openapis.openapi.models.operations.LinksListRequest](../../models/operations/LinksListRequest.md) | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |


### Response

**[org.openapis.openapi.models.operations.LinksListResponse](../../models/operations/LinksListResponse.md)**


## linksDelete

Delete the shortened link.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LinksDeleteRequest;
import org.openapis.openapi.models.operations.LinksDeleteResponse;
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

            LinksDeleteResponse res = sdk.urlShortener.linksDelete("string");

            if (res.linkResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                     | Type                          | Required                      | Description                   |
| ----------------------------- | ----------------------------- | ----------------------------- | ----------------------------- |
| `linkId`                      | *String*                      | :heavy_check_mark:            | Unique identifier for a link. |


### Response

**[org.openapis.openapi.models.operations.LinksDeleteResponse](../../models/operations/LinksDeleteResponse.md)**


## linksGet

Retrievs a single shortened link.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LinksGetRequest;
import org.openapis.openapi.models.operations.LinksGetResponse;
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

            LinksGetResponse res = sdk.urlShortener.linksGet("string");

            if (res.linkResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                     | Type                          | Required                      | Description                   |
| ----------------------------- | ----------------------------- | ----------------------------- | ----------------------------- |
| `linkId`                      | *String*                      | :heavy_check_mark:            | Unique identifier for a link. |


### Response

**[org.openapis.openapi.models.operations.LinksGetResponse](../../models/operations/LinksGetResponse.md)**


## linkUpdate

Update any of the properties of a shortened link.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LinkUpdateRequest;
import org.openapis.openapi.models.operations.LinkUpdateResponse;
import org.openapis.openapi.models.shared.LinkSingle;
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

            LinkUpdateResponse res = sdk.urlShortener.linkUpdate("string", new LinkSingle("string"){{
                redirectLink = "string";
                metadataTag = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
            }});

            if (res.linkResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `linkId`                                                                           | *String*                                                                           | :heavy_check_mark:                                                                 | Unique identifier for a link.                                                      |
| `linkSingle`                                                                       | [org.openapis.openapi.models.shared.LinkSingle](../../models/shared/LinkSingle.md) | :heavy_check_mark:                                                                 | N/A                                                                                |


### Response

**[org.openapis.openapi.models.operations.LinkUpdateResponse](../../models/operations/LinkUpdateResponse.md)**


## linkCreate

Given a long URL, shorten your URL either by using a custom domain or Lob's own short domain.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.LinkCreateResponse;
import org.openapis.openapi.models.shared.LinkSingle;
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

            org.openapis.openapi.models.shared.LinkSingle req = new LinkSingle("string"){{
                domain = "critical-health-care.com";
                slug = "string";
                metadataTag = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                billingGroupId = "string";
            }};            

            LinkCreateResponse res = sdk.urlShortener.linkCreate(req);

            if (res.linkResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                          | Type                                                                               | Required                                                                           | Description                                                                        |
| ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| `request`                                                                          | [org.openapis.openapi.models.shared.LinkSingle](../../models/shared/LinkSingle.md) | :heavy_check_mark:                                                                 | The request object to use for the request.                                         |


### Response

**[org.openapis.openapi.models.operations.LinkCreateResponse](../../models/operations/LinkCreateResponse.md)**

