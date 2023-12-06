# Template Versions

```java
TemplateVersionsController templateVersionsController = client.getTemplateVersionsController();
```

## Class Name

`TemplateVersionsController`

## Methods

* [Template Version Retrieve](../../doc/controllers/template-versions.md#template-version-retrieve)
* [Template Version Update](../../doc/controllers/template-versions.md#template-version-update)
* [Template Version Delete](../../doc/controllers/template-versions.md#template-version-delete)
* [Template Versions List](../../doc/controllers/template-versions.md#template-versions-list)
* [Create Template Version](../../doc/controllers/template-versions.md#create-template-version)


# Template Version Retrieve

Retrieves the template version with the given template and version ids.

```java
CompletableFuture<TemplateVersion> templateVersionRetrieveAsync(
    final String tmplId,
    final String vrsnId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template to which the version belongs.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `vrsnId` | `String` | Template, Required | id of the template_version<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` |

## Response Type

[`TemplateVersion`](../../doc/models/template-version.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String vrsnId = "vrsn_id2";

templateVersionsController.templateVersionRetrieveAsync(tmplId, vrsnId).thenAccept(result -> {
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
  "id": "vrsn_534e339882d2282",
  "description": "Second Version",
  "html": "<html>Second HTML for {{name}}</html>",
  "date_created": "2017-11-09T04:49:38.016Z",
  "date_modified": "2017-11-09T04:49:38.016Z",
  "object": "version"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Template Version Update

Updates the template version with the given template and version ids.

```java
CompletableFuture<TemplateVersion> templateVersionUpdateAsync(
    final String tmplId,
    final String vrsnId,
    final String description,
    final EngineEnum engine,
    final List<String> requiredVars)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template to which the version belongs.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `vrsnId` | `String` | Template, Required | id of the template_version<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `engine` | [`EngineEnum`](../../doc/models/engine-enum.md) | Form, Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY` |
| `requiredVars` | `List<String>` | Form, Optional | An array of required variables to be used in a template. Only available for `handlebars` templates. |

## Response Type

[`TemplateVersion`](../../doc/models/template-version.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String vrsnId = "vrsn_id2";
String description = "Some description";
EngineEnum engine = EngineEnum.LEGACY;
templateVersionsController.templateVersionUpdateAsync(tmplId, vrsnId, description, engine, null).thenAccept(result -> {
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
  "id": "vrsn_534e339882d2282",
  "description": "Second Version",
  "html": "<html>Second HTML for {{name}}</html>",
  "date_created": "2017-11-09T04:49:38.016Z",
  "date_modified": "2017-11-09T04:49:38.016Z",
  "object": "version"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Template Version Delete

Permanently deletes a template version. A template's `published_version` can not be deleted.

```java
CompletableFuture<TemplateVersionDeletion> templateVersionDeleteAsync(
    final String tmplId,
    final String vrsnId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template to which the version belongs.<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `vrsnId` | `String` | Template, Required | id of the template_version<br>**Constraints**: *Pattern*: `^vrsn_[a-zA-Z0-9]+$` |

## Response Type

[`TemplateVersionDeletion`](../../doc/models/template-version-deletion.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String vrsnId = "vrsn_id2";

templateVersionsController.templateVersionDeleteAsync(tmplId, vrsnId).thenAccept(result -> {
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
  "value": {
    "id": "vrsn_123456789",
    "deleted": true
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Template Versions List

Returns a list of template versions for the given template ID. The template versions are sorted by creation date, with the most recently created appearing first.

```java
CompletableFuture<AllTemplateVersions> templateVersionsListAsync(
    final String tmplId,
    final Integer limit,
    final BeforeAfter beforeAfter,
    final List<String> include,
    final Map<String, String> dateCreated)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template associated with the retrieved versions<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `limit` | `Integer` | Query, Optional | How many results to return.<br>**Default**: `10`<br>**Constraints**: `>= 1`, `<= 100` |
| `beforeAfter` | [`BeforeAfter`](../../doc/models/before-after.md) | Query, Optional | `before` and `after` are both optional but only one of them can be in the query at a time. |
| `include` | `List<String>` | Query, Optional | Request that the response include the total count by specifying `include=["total_count"]`. |
| `dateCreated` | `Map<String, String>` | Query, Optional | Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is >, `lt` is <, `gte` is ≥, and `lte` is ≤. |

## Response Type

[`AllTemplateVersions`](../../doc/models/all-template-versions.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
Integer limit = 10;
templateVersionsController.templateVersionsListAsync(tmplId, limit, null, null, null).thenAccept(result -> {
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
  "data": [
    {
      "id": "vrsn_4d6ff5d868bf630",
      "description": "Second Version",
      "html": "Second HTML for ",
      "date_created": "2017-11-09T05:09:03.665Z",
      "date_modified": "2018-05-22T22:01:10.479Z",
      "object": "version"
    },
    {
      "id": "vrsn_2a17159c1911919",
      "description": "Test Template",
      "html": "HTML for ",
      "date_created": "2017-11-09T05:08:40.004Z",
      "date_modified": "2018-05-22T22:01:11.309Z",
      "object": "version"
    }
  ],
  "object": "list",
  "count": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |


# Create Template Version

Creates a new template version attached to the specified template.

```java
CompletableFuture<TemplateVersion> createTemplateVersionAsync(
    final String tmplId,
    final String html,
    final String description,
    final EngineEnum engine,
    final List<String> requiredVars)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `tmplId` | `String` | Template, Required | The ID of the template the new version will be attached to<br>**Constraints**: *Pattern*: `^tmpl_[a-zA-Z0-9]+$` |
| `html` | `String` | Form, Required | An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:<br><br>- [Postcards](#operation/postcard_create) - `front` and `back`<br>- [Self Mailers](#operation/self_mailer_create) - `inside` and `outside`<br>- [Letters](#operation/letter_create) - `file`<br>- [Checks](#operation/check_create) - `check_bottom` and `attachment`<br>- [Cards](#operation/card_create) - `front` and `back`<br><br>If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.<br>**Constraints**: *Maximum Length*: `100000` |
| `description` | `String` | Form, Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` |
| `engine` | [`EngineEnum`](../../doc/models/engine-enum.md) | Form, Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY` |
| `requiredVars` | `List<String>` | Form, Optional | An array of required variables to be used in a template. Only available for `handlebars` templates. |

## Response Type

[`TemplateVersion`](../../doc/models/template-version.md)

## Example Usage

```java
String tmplId = "tmpl_id8";
String html = "<html>HTML for {{name}}</html>";
String description = "Some Description";
EngineEnum engine = EngineEnum.LEGACY;
templateVersionsController.createTemplateVersionAsync(tmplId, html, description, engine, null).thenAccept(result -> {
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
  "id": "vrsn_534e339882d2282",
  "description": "Second Version",
  "html": "<html>Second HTML for {{name}}</html>",
  "date_created": "2017-11-09T04:49:38.016Z",
  "date_modified": "2017-11-09T04:49:38.016Z",
  "object": "version"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| Default | Error | [`ErrorErrorException`](../../doc/models/error-error-exception.md) |

