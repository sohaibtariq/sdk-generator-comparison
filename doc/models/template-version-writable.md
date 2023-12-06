
# Template Version Writable

## Structure

`TemplateVersionWritable`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | An internal description that identifies this resource. Must be no longer than 255 characters.<br>**Constraints**: *Maximum Length*: `255` | String getDescription() | setDescription(String description) |
| `Html` | `String` | Required | An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:<br><br>- [Postcards](#operation/postcard_create) - `front` and `back`<br>- [Self Mailers](#operation/self_mailer_create) - `inside` and `outside`<br>- [Letters](#operation/letter_create) - `file`<br>- [Checks](#operation/check_create) - `check_bottom` and `attachment`<br>- [Cards](#operation/card_create) - `front` and `back`<br><br>If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.<br>**Constraints**: *Maximum Length*: `100000` | String getHtml() | setHtml(String html) |
| `Engine` | [`EngineEnum`](../../doc/models/engine-enum.md) | Optional | The engine used to combine HTML template with merge variables.<br><br>* `legacy` - Lob's original engine<br>* `handlebars`<br>**Default**: `EngineEnum.LEGACY` | EngineEnum getEngine() | setEngine(EngineEnum engine) |
| `RequiredVars` | `List<String>` | Optional | An array of required variables to be used in a template. Only available for `handlebars` templates. | List<String> getRequiredVars() | setRequiredVars(List<String> requiredVars) |

## Example (as JSON)

```json
{
  "html": "html0",
  "engine": "legacy",
  "description": "description0",
  "required_vars": [
    "required_vars3",
    "required_vars4"
  ]
}
```

