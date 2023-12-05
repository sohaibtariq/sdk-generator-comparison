# Uploads

The uploads endpoint allows you to upload audience files that are then associated with a given campaign.
At this time, only CSV files are allowed. The API provides endpoints for creating uploads, uploading audience files,
and marking uploaded files as ready for processing. The API also provides endpoints for downloading files that
describe the results, both successful and not, of the processing.

```java
UploadsController uploadsController = client.getUploadsController();
```

## Class Name

`UploadsController`

## Methods

* [Uploads List](../../doc/controllers/uploads.md#uploads-list)
* [Upload Create](../../doc/controllers/uploads.md#upload-create)
* [Upload Retrieve](../../doc/controllers/uploads.md#upload-retrieve)
* [Upload Update](../../doc/controllers/uploads.md#upload-update)
* [Upload Delete](../../doc/controllers/uploads.md#upload-delete)
* [Upload File](../../doc/controllers/uploads.md#upload-file)
* [Upload Export Create](../../doc/controllers/uploads.md#upload-export-create)
* [Report Retrieve](../../doc/controllers/uploads.md#report-retrieve)
* [Export Retrieve](../../doc/controllers/uploads.md#export-retrieve)


# Uploads List

Returns a list of your uploads. Optionally, filter uploads by campaign.

```java
CompletableFuture<List<Upload>> uploadsListAsync(
    final String campaignId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `campaignId` | `String` | Query, Optional | id of the campaign<br>**Constraints**: *Pattern*: `^cmp_[a-zA-Z0-9]+$` |

## Response Type

[`List<Upload>`](../../doc/models/upload.md)

## Example Usage

```java
uploadsController.uploadsListAsync(null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": "upl_71be866e430b11e9",
    "accountId": "fa9ea650fc7b31a89f92",
    "campaignId": "cmp_1933ad629bae1408",
    "mode": "test",
    "failuresUrl": "https://www.example.com",
    "originalFilename": "my_audience.csv",
    "state": "Draft",
    "totalMailpieces": 100,
    "failedMailpieces": 5,
    "validatedMailpieces": 95,
    "bytesProcessed": 17268,
    "dateCreated": "2017-09-05T17:47:53.767Z",
    "dateModified": "2017-09-05T17:47:53.767Z",
    "requiredAddressColumnMapping": {
      "name": "recipient_name",
      "address_line1": "primary_line",
      "address_city": "city",
      "address_state": "state",
      "address_zip": "zip_code"
    },
    "optionalAddressColumnMapping": {
      "address_line2": "secondary_line",
      "company": "company",
      "address_country": "country"
    },
    "mergeVariableColumnMapping": {
      "gift_code": "code"
    },
    "metadata": {
      "columns": [
        "recipient_name",
        "zip_code"
      ]
    }
  }
]
```


# Upload Create

Creates a new upload with the provided properties.

```java
CompletableFuture<Upload> uploadCreateAsync(
    final UploadWritable body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UploadWritable`](../../doc/models/upload-writable.md) | Body, Required | - |

## Response Type

[`Upload`](../../doc/models/upload.md)

## Example Usage

```java
UploadWritable body = new UploadWritable.Builder(
    "campaignId4"
)
.requiredAddressColumnMapping(new RequiredAddressColumns.Builder(
        "recipient_name",
        "primary_line",
        "city",
        "state",
        "zip_code"
    )
    .build())
.optionalAddressColumnMapping(new OptionalAddressColumns.Builder(
        "secondary_line",
        "company",
        "country,"
    )
    .build())
.metadata(new Metadata.Builder(
        Arrays.asList(
            "recipient_name"
        )
    )
    .build())
.mergeVariableColumnMapping(ApiHelper.deserialize("{\"name\":\"recipient_name\",\"gift_code\":\"code\"}"))
.build();

uploadsController.uploadCreateAsync(body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "upl_71be866e430b11e9",
  "accountId": "fa9ea650fc7b31a89f92",
  "campaignId": "cmp_1933ad629bae1408",
  "mode": "live",
  "failuresUrl": "http://www.example.com",
  "originalFilename": "my_audience.csv",
  "state": "Draft",
  "totalMailpieces": 100,
  "failedMailpieces": 5,
  "validatedMailpieces": 95,
  "bytesProcessed": 17628,
  "dateCreated": "2017-09-05T17:47:53.767Z",
  "dateModified": "2017-09-05T17:47:53.767Z",
  "requiredAddressColumnMapping": {
    "name": null,
    "address_line1": null,
    "address_city": null,
    "address_state": null,
    "address_zip": null
  },
  "optionalAddressColumnMapping": {
    "address_line2": null,
    "company": null,
    "address_country": null
  },
  "mergeVariableColumnMapping": null,
  "metadata": {
    "columns": []
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation Error | [`HTTPValidationErrorException`](../../doc/models/http-validation-error-exception.md) |


# Upload Retrieve

Retrieves the details of an existing upload. You need only supply the unique upload identifier that was returned upon upload creation.

```java
CompletableFuture<Upload> uploadRetrieveAsync(
    final String uplId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uplId` | `String` | Template, Required | id of the upload<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` |

## Response Type

[`Upload`](../../doc/models/upload.md)

## Example Usage

```java
String uplId = "upl_id0";

uploadsController.uploadRetrieveAsync(uplId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "upl_71be866e430b11e9",
  "accountId": "fa9ea650fc7b31a89f92",
  "campaignId": "cmp_1933ad629bae1408",
  "mode": "live",
  "failuresUrl": "http://www.example.com",
  "originalFilename": "my_audience.csv",
  "state": "Draft",
  "totalMailpieces": 100,
  "failedMailpieces": 5,
  "validatedMailpieces": 95,
  "bytesProcessed": 17628,
  "dateCreated": "2017-09-05T17:47:53.767Z",
  "dateModified": "2017-09-05T17:47:53.767Z",
  "requiredAddressColumnMapping": {
    "name": null,
    "address_line1": null,
    "address_city": null,
    "address_state": null,
    "address_zip": null
  },
  "optionalAddressColumnMapping": {
    "address_line2": null,
    "company": null,
    "address_country": null
  },
  "mergeVariableColumnMapping": null,
  "metadata": {
    "columns": []
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |
| 422 | Validation Error | [`HTTPValidationErrorException`](../../doc/models/http-validation-error-exception.md) |


# Upload Update

Update the details of an existing upload. You need only supply the unique identifier that was returned upon upload creation.

```java
CompletableFuture<Upload> uploadUpdateAsync(
    final String uplId,
    final UploadUpdatable body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uplId` | `String` | Template, Required | id of the upload<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` |
| `body` | [`UploadUpdatable`](../../doc/models/upload-updatable.md) | Body, Required | - |

## Response Type

[`Upload`](../../doc/models/upload.md)

## Example Usage

```java
String uplId = "upl_id0";
UploadUpdatable body = new UploadUpdatable.Builder()
    .requiredAddressColumnMapping(new RequiredAddressColumns.Builder(
        "recipient_name",
        "primary_line",
        "city",
        "state",
        "zip_code"
    )
    .build())
    .optionalAddressColumnMapping(new OptionalAddressColumns.Builder(
        "secondary_line",
        "company",
        "country,"
    )
    .build())
    .metadata(new Metadata.Builder(
        Arrays.asList(
            "recipient_name"
        )
    )
    .build())
    .mergeVariableColumnMapping(ApiHelper.deserialize("{\"name\":\"recipient_name\",\"gift_code\":\"code\"}"))
    .build();

uploadsController.uploadUpdateAsync(uplId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": "upl_71be866e430b11e9",
  "accountId": "fa9ea650fc7b31a89f92",
  "campaignId": "cmp_1933ad629bae1408",
  "mode": "live",
  "failuresUrl": "http://www.example.com",
  "originalFilename": "my_audience.csv",
  "state": "Draft",
  "totalMailpieces": 100,
  "failedMailpieces": 5,
  "validatedMailpieces": 95,
  "bytesProcessed": 17628,
  "dateCreated": "2017-09-05T17:47:53.767Z",
  "dateModified": "2017-09-05T17:47:53.767Z",
  "requiredAddressColumnMapping": {
    "name": null,
    "address_line1": null,
    "address_city": null,
    "address_state": null,
    "address_zip": null
  },
  "optionalAddressColumnMapping": {
    "address_line2": null,
    "company": null,
    "address_country": null
  },
  "mergeVariableColumnMapping": null,
  "metadata": {
    "columns": []
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Not Found Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |
| 422 | Validation Error | [`HTTPValidationErrorException`](../../doc/models/http-validation-error-exception.md) |


# Upload Delete

Delete an existing upload. You need only supply the unique identifier that was returned upon upload creation.

```java
CompletableFuture<Void> uploadDeleteAsync(
    final String uplId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uplId` | `String` | Template, Required | id of the upload<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` |

## Response Type

`void`

## Example Usage

```java
String uplId = "upl_id0";

uploadsController.uploadDeleteAsync(uplId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```


# Upload File

Upload an [audience file](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide) and associate it with an upload.

```java
CompletableFuture<UploadFile> uploadFileAsync(
    final String uplId,
    final FileWrapper file)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uplId` | `String` | Template, Required | ID of the upload<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` |
| `file` | `FileWrapper` | Form, Optional | - |

## Response Type

[`UploadFile`](../../doc/models/upload-file.md)

## Example Usage

```java
String uplId = "upl_id0";

uploadsController.uploadFileAsync(uplId, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation Error | [`HTTPValidationErrorException`](../../doc/models/http-validation-error-exception.md) |


# Upload Export Create

Campaign Exports can help you understand exactly which records in a campaign could not be created. By initiating and retrieving an export, you will get row-by-row errors for your campaign. For a step-by-step walkthrough of creating a campaign and exporting failures, see our [Campaigns Guide](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).

Create an export file associated with an upload.

```java
CompletableFuture<UploadCreateExport> uploadExportCreateAsync(
    final String uplId,
    final UploadsExportsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uplId` | `String` | Template, Required | ID of the upload<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` |
| `body` | [`UploadsExportsRequest`](../../doc/models/uploads-exports-request.md) | Body, Required | - |

## Response Type

[`UploadCreateExport`](../../doc/models/upload-create-export.md)

## Example Usage

```java
String uplId = "upl_id0";
UploadsExportsRequest body = new UploadsExportsRequest.Builder()
    .build();

uploadsController.uploadExportCreateAsync(uplId, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 401 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 402 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 403 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 404 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 405 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 406 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 407 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 408 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 409 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 410 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 411 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 412 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 413 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 414 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 415 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 416 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 417 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 418 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 419 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 420 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 421 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 422 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 423 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 424 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 425 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 426 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 427 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 428 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 429 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 430 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 431 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 432 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 433 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 434 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 435 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 436 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 437 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 438 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 439 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 440 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 441 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 442 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 443 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 444 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 445 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 446 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 447 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 448 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 449 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 450 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 451 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 452 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 453 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 454 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 455 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 456 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 457 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 458 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 459 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 460 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 461 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 462 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 463 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 464 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 465 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 466 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 467 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 468 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 469 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 470 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 471 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 472 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 473 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 474 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 475 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 476 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 477 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 478 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 479 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 480 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 481 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 482 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 483 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 484 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 485 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 486 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 487 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 488 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 489 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 490 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 491 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 492 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 493 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 494 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 495 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 496 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 497 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 498 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |
| 499 | Create Export Error | [`UploadExportErrorException`](../../doc/models/upload-export-error-exception.md) |


# Report Retrieve

Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.

```java
CompletableFuture<UploadsReportResponse> reportRetrieveAsync(
    final String uplId,
    final Status3Enum status,
    final Integer limit,
    final Integer offset)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uplId` | `String` | Template, Required | ID of the upload<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` |
| `status` | [`Status3Enum`](../../doc/models/status-3-enum.md) | Query, Optional | The status of line items to filter and retrieve. By default all line items are returned. |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `100`<br>**Constraints**: `>= 1`, `<= 100` |
| `offset` | `Integer` | Query, Optional | An integer that designates the offset at which to begin returning results. Defaults to 0.<br>**Default**: `0` |

## Response Type

[`UploadsReportResponse`](../../doc/models/uploads-report-response.md)

## Example Usage

```java
String uplId = "upl_id0";
Integer limit = 10;
Integer offset = 0;

uploadsController.reportRetrieveAsync(uplId, null, limit, offset).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden Error | [`FeatureFlagDisabledException`](../../doc/models/feature-flag-disabled-exception.md) |
| 404 | Not Found Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Export Retrieve

Retrieves the details of an existing export. You need only supply the unique export identifier that was returned upon export creation. If you try retrieving an export immediately after creating one (i.e., before we're done processing the export), you will get back an export object with `state = in_progress`.

```java
CompletableFuture<UploadsExportsResponse> exportRetrieveAsync(
    final String uplId,
    final String exId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `uplId` | `String` | Template, Required | ID of the upload<br>**Constraints**: *Pattern*: `^upl_[a-zA-Z0-9]+$` |
| `exId` | `String` | Template, Required | ID of the export<br>**Constraints**: *Pattern*: `^ex_[a-zA-Z0-9]+$` |

## Response Type

[`UploadsExportsResponse`](../../doc/models/uploads-exports-response.md)

## Example Usage

```java
String uplId = "upl_id0";
String exId = "ex_id4";

uploadsController.exportRetrieveAsync(uplId, exId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

