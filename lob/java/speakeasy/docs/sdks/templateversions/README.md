# TemplateVersions
(*templateVersions*)

## Overview

These API endpoints allow you to create, retrieve, update and delete versions of reusable HTML templates for use with the Print & Mail API.
<div class="back-to-top" ><a href="#" onclick="toTopLink()">back to top</a></div>


### Available Operations

* [templateVersionDelete](#templateversiondelete) - Delete
* [templateVersionRetrieve](#templateversionretrieve) - Retrieve
* [templateVersionUpdate](#templateversionupdate) - Update
* [templateVersionsList](#templateversionslist) - List
* [createTemplateVersion](#createtemplateversion) - Create

## templateVersionDelete

Permanently deletes a template version. A template's `published_version` can not be deleted.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplateVersionDeleteRequest;
import org.openapis.openapi.models.operations.TemplateVersionDeleteResponse;
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

            TemplateVersionDeleteResponse res = sdk.templateVersions.templateVersionDelete("string", "string");

            if (res.templateVersionDeletion != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `tmplId`                                             | *String*                                             | :heavy_check_mark:                                   | The ID of the template to which the version belongs. |
| `vrsnId`                                             | *String*                                             | :heavy_check_mark:                                   | id of the template_version                           |


### Response

**[org.openapis.openapi.models.operations.TemplateVersionDeleteResponse](../../models/operations/TemplateVersionDeleteResponse.md)**


## templateVersionRetrieve

Retrieves the template version with the given template and version ids.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplateVersionRetrieveRequest;
import org.openapis.openapi.models.operations.TemplateVersionRetrieveResponse;
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

            TemplateVersionRetrieveResponse res = sdk.templateVersions.templateVersionRetrieve("string", "string");

            if (res.templateVersion != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `tmplId`                                             | *String*                                             | :heavy_check_mark:                                   | The ID of the template to which the version belongs. |
| `vrsnId`                                             | *String*                                             | :heavy_check_mark:                                   | id of the template_version                           |


### Response

**[org.openapis.openapi.models.operations.TemplateVersionRetrieveResponse](../../models/operations/TemplateVersionRetrieveResponse.md)**


## templateVersionUpdate

Updates the template version with the given template and version ids.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplateVersionUpdateRequest;
import org.openapis.openapi.models.operations.TemplateVersionUpdateResponse;
import org.openapis.openapi.models.shared.Engine;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TemplateVersionUpdatable;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            TemplateVersionUpdateResponse res = sdk.templateVersions.templateVersionUpdate("string", "string", new TemplateVersionUpdatable(){{
                requiredVars = new String[]{{
                    add("string"),
                }};
            }});

            if (res.templateVersion != null) {
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
| `tmplId`                                                                                                       | *String*                                                                                                       | :heavy_check_mark:                                                                                             | The ID of the template to which the version belongs.                                                           |
| `vrsnId`                                                                                                       | *String*                                                                                                       | :heavy_check_mark:                                                                                             | id of the template_version                                                                                     |
| `templateVersionUpdatable`                                                                                     | [org.openapis.openapi.models.shared.TemplateVersionUpdatable](../../models/shared/TemplateVersionUpdatable.md) | :heavy_check_mark:                                                                                             | N/A                                                                                                            |


### Response

**[org.openapis.openapi.models.operations.TemplateVersionUpdateResponse](../../models/operations/TemplateVersionUpdateResponse.md)**


## templateVersionsList

Returns a list of template versions for the given template ID. The template versions are sorted by creation date, with the most recently created appearing first.


### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.TemplateVersionsListRequest;
import org.openapis.openapi.models.operations.TemplateVersionsListResponse;
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

            TemplateVersionsListRequest req = new TemplateVersionsListRequest("string"){{
                limit = 10L;
                beforeAfter = "string";
                include = new String[]{{
                    add("string"),
                }};
                dateCreated = new java.util.HashMap<String, String>(){{
                    put("key", "string");
                }};
            }};            

            TemplateVersionsListResponse res = sdk.templateVersions.templateVersionsList(req);

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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [org.openapis.openapi.models.operations.TemplateVersionsListRequest](../../models/operations/TemplateVersionsListRequest.md) | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |


### Response

**[org.openapis.openapi.models.operations.TemplateVersionsListResponse](../../models/operations/TemplateVersionsListResponse.md)**


## createTemplateVersion

Creates a new template version attached to the specified template.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.CreateTemplateVersionRequest;
import org.openapis.openapi.models.operations.CreateTemplateVersionResponse;
import org.openapis.openapi.models.shared.Engine;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.TemplateVersionWritable;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            CreateTemplateVersionResponse res = sdk.templateVersions.createTemplateVersion("string", new TemplateVersionWritable("string"){{
                html = "string";
                requiredVars = new String[]{{
                    add("string"),
                }};
            }});

            if (res.templateVersion != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `tmplId`                                                                                                     | *String*                                                                                                     | :heavy_check_mark:                                                                                           | The ID of the template the new version will be attached to                                                   |
| `templateVersionWritable`                                                                                    | [org.openapis.openapi.models.shared.TemplateVersionWritable](../../models/shared/TemplateVersionWritable.md) | :heavy_check_mark:                                                                                           | N/A                                                                                                          |


### Response

**[org.openapis.openapi.models.operations.CreateTemplateVersionResponse](../../models/operations/CreateTemplateVersionResponse.md)**

