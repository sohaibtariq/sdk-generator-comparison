# Uploads
(*uploads*)

## Overview

The uploads endpoint allows you to upload audience files that are then associated with a given campaign.
At this time, only CSV files are allowed. The API provides endpoints for creating uploads, uploading audience files,
and marking uploaded files as ready for processing. The API also provides endpoints for downloading files that
describe the results, both successful and not, of the processing.


### Available Operations

* [uploadsList](#uploadslist) - List
* [uploadCreate](#uploadcreate) - Create
* [uploadDelete](#uploaddelete) - Delete
* [uploadRetrieve](#uploadretrieve) - Retrieve
* [uploadUpdate](#uploadupdate) - Update
* [uploadFile](#uploadfile) - Upload file
* [uploadExportCreate](#uploadexportcreate) - Create Export
* [reportRetrieve](#reportretrieve) - Retrieve Line Item Report
* [exportRetrieve](#exportretrieve) - Retrieve Export

## uploadsList

Returns a list of your uploads. Optionally, filter uploads by campaign.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UploadsListRequest;
import org.openapis.openapi.models.operations.UploadsListResponse;
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

            UploadsListResponse res = sdk.uploads.uploadsList("string");

            if (res.classes != null) {
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
| `campaignId`       | *String*           | :heavy_minus_sign: | id of the campaign |


### Response

**[org.openapis.openapi.models.operations.UploadsListResponse](../../models/operations/UploadsListResponse.md)**


## uploadCreate

Creates a new upload with the provided properties.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UploadCreateResponse;
import org.openapis.openapi.models.shared.MergeVariableColumnMapping;
import org.openapis.openapi.models.shared.OptionalAddressColumnMapping;
import org.openapis.openapi.models.shared.RequiredAddressColumnMapping;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.UploadWritable;
import org.openapis.openapi.models.shared.UploadsMetadata;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            org.openapis.openapi.models.shared.UploadWritable req = new UploadWritable("cmp_1933ad629bae1408"){{
                requiredAddressColumnMapping = new RequiredAddressColumnMapping(){{
                    name = "string";
                    addressLine1 = "string";
                    addressCity = "string";
                    addressState = "string";
                    addressZip = "string";
                }};
                optionalAddressColumnMapping = new OptionalAddressColumnMapping(){{
                    addressLine2 = "string";
                    company = "Jacobson Group";
                    addressCountry = "string";
                }};
                metadata = new UploadsMetadata(new String[]{{
                    add("string"),
                }});
                mergeVariableColumnMapping = new MergeVariableColumnMapping();
            }};            

            UploadCreateResponse res = sdk.uploads.uploadCreate(req);

            if (res.upload != null) {
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
| `request`                                                                                  | [org.openapis.openapi.models.shared.UploadWritable](../../models/shared/UploadWritable.md) | :heavy_check_mark:                                                                         | The request object to use for the request.                                                 |


### Response

**[org.openapis.openapi.models.operations.UploadCreateResponse](../../models/operations/UploadCreateResponse.md)**


## uploadDelete

Delete an existing upload. You need only supply the unique identifier that was returned upon upload creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UploadDeleteRequest;
import org.openapis.openapi.models.operations.UploadDeleteResponse;
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

            UploadDeleteResponse res = sdk.uploads.uploadDelete("string");

            if (res.statusCode == 200) {
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
| `uplId`            | *String*           | :heavy_check_mark: | id of the upload   |


### Response

**[org.openapis.openapi.models.operations.UploadDeleteResponse](../../models/operations/UploadDeleteResponse.md)**


## uploadRetrieve

Retrieves the details of an existing upload. You need only supply the unique upload identifier that was returned upon upload creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UploadRetrieveRequest;
import org.openapis.openapi.models.operations.UploadRetrieveResponse;
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

            UploadRetrieveResponse res = sdk.uploads.uploadRetrieve("string");

            if (res.upload != null) {
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
| `uplId`            | *String*           | :heavy_check_mark: | id of the upload   |


### Response

**[org.openapis.openapi.models.operations.UploadRetrieveResponse](../../models/operations/UploadRetrieveResponse.md)**


## uploadUpdate

Update the details of an existing upload. You need only supply the unique identifier that was returned upon upload creation.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.UploadUpdateRequest;
import org.openapis.openapi.models.operations.UploadUpdateResponse;
import org.openapis.openapi.models.shared.MergeVariableColumnMapping;
import org.openapis.openapi.models.shared.OptionalAddressColumnMapping;
import org.openapis.openapi.models.shared.RequiredAddressColumnMapping;
import org.openapis.openapi.models.shared.Security;
import org.openapis.openapi.models.shared.UploadUpdatable;
import org.openapis.openapi.models.shared.UploadsMetadata;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security("string", "string"){{
                    username = "";
                    password = "";
                }})
                .build();

            UploadUpdateResponse res = sdk.uploads.uploadUpdate("string", new UploadUpdatable(){{
                requiredAddressColumnMapping = new RequiredAddressColumnMapping(){{}};
                optionalAddressColumnMapping = new OptionalAddressColumnMapping(){{}};
                metadata = new UploadsMetadata(new String[]{{
                    add("string"),
                }}){{
                    columns = new String[]{{
                        add("string"),
                    }};
                }};
                mergeVariableColumnMapping = new MergeVariableColumnMapping(){{}};
            }});

            if (res.upload != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                    | Type                                                                                         | Required                                                                                     | Description                                                                                  |
| -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| `uplId`                                                                                      | *String*                                                                                     | :heavy_check_mark:                                                                           | id of the upload                                                                             |
| `uploadUpdatable`                                                                            | [org.openapis.openapi.models.shared.UploadUpdatable](../../models/shared/UploadUpdatable.md) | :heavy_check_mark:                                                                           | N/A                                                                                          |


### Response

**[org.openapis.openapi.models.operations.UploadUpdateResponse](../../models/operations/UploadUpdateResponse.md)**


## uploadFile

Upload an [audience file](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide) and associate it with an upload.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.File;
import org.openapis.openapi.models.operations.UploadFileRequest;
import org.openapis.openapi.models.operations.UploadFileRequestBody;
import org.openapis.openapi.models.operations.UploadFileResponse;
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

            UploadFileResponse res = sdk.uploads.uploadFile("string", new UploadFileRequestBody(){{
                file = new File("string", "0xAb0F3602D6".getBytes()){{
                    fileName = "deposit.pdf";
                    content = "0x42139f9Fae".getBytes();
                }};
            }});

            if (res.uploadFile != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `uplId`                                                                                                          | *String*                                                                                                         | :heavy_check_mark:                                                                                               | ID of the upload                                                                                                 |
| `requestBody`                                                                                                    | [org.openapis.openapi.models.operations.UploadFileRequestBody](../../models/operations/UploadFileRequestBody.md) | :heavy_check_mark:                                                                                               | N/A                                                                                                              |


### Response

**[org.openapis.openapi.models.operations.UploadFileResponse](../../models/operations/UploadFileResponse.md)**


## uploadExportCreate

Campaign Exports can help you understand exactly which records in a campaign could not be created. By initiating and retrieving an export, you will get row-by-row errors for your campaign. For a step-by-step walkthrough of creating a campaign and exporting failures, see our [Campaigns Guide](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).

Create an export file associated with an upload.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.Type;
import org.openapis.openapi.models.operations.UploadExportCreateRequest;
import org.openapis.openapi.models.operations.UploadExportCreateRequestBody;
import org.openapis.openapi.models.operations.UploadExportCreateResponse;
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

            UploadExportCreateResponse res = sdk.uploads.uploadExportCreate("string", new UploadExportCreateRequestBody(){{}});

            if (res.uploadCreateExport != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `uplId`                                                                                                                          | *String*                                                                                                                         | :heavy_check_mark:                                                                                                               | ID of the upload                                                                                                                 |
| `requestBody`                                                                                                                    | [org.openapis.openapi.models.operations.UploadExportCreateRequestBody](../../models/operations/UploadExportCreateRequestBody.md) | :heavy_check_mark:                                                                                                               | N/A                                                                                                                              |


### Response

**[org.openapis.openapi.models.operations.UploadExportCreateResponse](../../models/operations/UploadExportCreateResponse.md)**


## reportRetrieve

Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ReportRetrieveRequest;
import org.openapis.openapi.models.operations.ReportRetrieveResponse;
import org.openapis.openapi.models.operations.Status;
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

            ReportRetrieveResponse res = sdk.uploads.reportRetrieve("string", Status.FAILED, 10L, 379204L);

            if (res.twoHundredApplicationJsonObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `uplId`                                                                                   | *String*                                                                                  | :heavy_check_mark:                                                                        | ID of the upload                                                                          |                                                                                           |
| `status`                                                                                  | [org.openapis.openapi.models.operations.Status](../../models/operations/Status.md)        | :heavy_minus_sign:                                                                        | The status of line items to filter and retrieve. By default all line items are returned.  |                                                                                           |
| `limit`                                                                                   | *Long*                                                                                    | :heavy_minus_sign:                                                                        | How many results to return.                                                               | 10                                                                                        |
| `offset`                                                                                  | *Long*                                                                                    | :heavy_minus_sign:                                                                        | An integer that designates the offset at which to begin returning results. Defaults to 0. |                                                                                           |


### Response

**[org.openapis.openapi.models.operations.ReportRetrieveResponse](../../models/operations/ReportRetrieveResponse.md)**


## exportRetrieve

Retrieves the details of an existing export. You need only supply the unique export identifier that was returned upon export creation. If you try retrieving an export immediately after creating one (i.e., before we're done processing the export), you will get back an export object with `state = in_progress`.

### Example Usage

```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.ExportRetrieveRequest;
import org.openapis.openapi.models.operations.ExportRetrieveResponse;
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

            ExportRetrieveResponse res = sdk.uploads.exportRetrieve("string", "string");

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

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `uplId`            | *String*           | :heavy_check_mark: | ID of the upload   |
| `exId`             | *String*           | :heavy_check_mark: | ID of the export   |


### Response

**[org.openapis.openapi.models.operations.ExportRetrieveResponse](../../models/operations/ExportRetrieveResponse.md)**

