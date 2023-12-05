# Templates
(*templates*)

## Overview

These API endpoints allow you to create, retrieve, update and delete reusable HTML templates for use with the Print & Mail API.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [templateDelete](#templatedelete) - Delete
* [templateRetrieve](#templateretrieve) - Retrieve
* [templateUpdate](#templateupdate) - Update
* [templatesList](#templateslist) - List
* [createTemplate](#createtemplate) - Create

## templateDelete

Permanently deletes a template. Deleting a template also deletes its associated versions. Deleted templates can not be used to create postcard, letter, or check resources.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplateDeleteRequest;
import org.openapis.openapi.models.operations.TemplateDeleteResponse;
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

            TemplateDeleteResponse res = sdk.templates.templateDelete("string");

            if (res.templateDeletion != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `tmplId`           | *String*           | :heavy_check_mark: | id of the template |


### Response

**[org.openapis.openapi.models.operations.TemplateDeleteResponse](../../models/operations/TemplateDeleteResponse.md)**


## templateRetrieve

Retrieves the details of an existing template. You need only supply the unique template identifier that was returned upon template creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplateRetrieveRequest;
import org.openapis.openapi.models.operations.TemplateRetrieveResponse;
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

            TemplateRetrieveResponse res = sdk.templates.templateRetrieve("string");

            if (res.template != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `tmplId`           | *String*           | :heavy_check_mark: | id of the template |


### Response

**[org.openapis.openapi.models.operations.TemplateRetrieveResponse](../../models/operations/TemplateRetrieveResponse.md)**


## templateUpdate

Updates the description and/or published version of the template with the given id. To update the template's html, create a new version of the template.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplateUpdateRequest;
import org.openapis.openapi.models.operations.TemplateUpdateResponse;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TemplateUpdate;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            TemplateUpdateResponse res = sdk.templates.templateUpdate("string", new TemplateUpdate(){{}});

            if (res.template != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `tmplId`                                                                                   | *String*                                                                                   | :heavy_check_mark:                                                                         | id of the template                                                                         |
| `templateUpdate`                                                                           | [org.openapis.openapi.models.shared.TemplateUpdate](../../models/shared/TemplateUpdate.md) | :heavy_check_mark:                                                                         | N/A                                                                                        |


### Response

**[org.openapis.openapi.models.operations.TemplateUpdateResponse](../../models/operations/TemplateUpdateResponse.md)**


## templatesList

Returns a list of your templates. The templates are returned sorted by creation date, with the most recently created templates appearing first.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplatesListRequest;
import org.openapis.openapi.models.operations.TemplatesListResponse;
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

            TemplatesListRequest req = new TemplatesListRequest(){{
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

            TemplatesListResponse res = sdk.templates.templatesList(req);

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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [org.openapis.openapi.models.operations.TemplatesListRequest](../../models/operations/TemplatesListRequest.md) | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |


### Response

**[org.openapis.openapi.models.operations.TemplatesListResponse](../../models/operations/TemplatesListResponse.md)**


## createTemplate

Creates a new template for use with the Print & Mail API. In Live mode, you can only have as many non-deleted templates as allotted in your current <a href="https://dashboard.lob.com/#/settings/editions" target="_blank">Print & Mail Edition</a>. If you attempt to create a template past your limit, you will receive a `403` error. There is no limit in Test mode.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateTemplateResponse;
import org.openapis.openapi.models.shared.Engine;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TemplateWritable;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            org.openapis.openapi.models.shared.TemplateWritable req = new TemplateWritable("string"){{
                description = "Visionary analyzing portal";
                metadata = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
                engine = Engine.LEGACY;
                requiredVars = new String[]{{
                    add("string"),
                }};
            }};            

            CreateTemplateResponse res = sdk.templates.createTemplate(req);

            if (res.template != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `request`                                                                                      | [org.openapis.openapi.models.shared.TemplateWritable](../../models/shared/TemplateWritable.md) | :heavy_check_mark:                                                                             | The request object to use for the request.                                                     |


### Response

**[org.openapis.openapi.models.operations.CreateTemplateResponse](../../models/operations/CreateTemplateResponse.md)**

