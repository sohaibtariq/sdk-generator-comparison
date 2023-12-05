/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class TemplateVersionWritable {
    /**
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    @SpeakeasyMetadata("form:name=description multipartForm:name=description")
    public String description;

    public TemplateVersionWritable withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * An HTML string of less than 100,000 characters to be used as the `published_version` of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details:
     * - [Postcards](#operation/postcard_create) - `front` and `back`
     * - [Self Mailers](#operation/self_mailer_create) - `inside` and `outside`
     * - [Letters](#operation/letter_create) - `file`
     * - [Checks](#operation/check_create) - `check_bottom` and `attachment`
     * - [Cards](#operation/card_create) - `front` and `back`
     * 
     * If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.
     * 
     */
    @JsonProperty("html")
    @SpeakeasyMetadata("form:name=html multipartForm:name=html")
    public String html;

    public TemplateVersionWritable withHtml(String html) {
        this.html = html;
        return this;
    }
    
    /**
     * The engine used to combine HTML template with merge variables.
     *   * `legacy` - Lob's original engine
     *   * `handlebars`
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("engine")
    @SpeakeasyMetadata("form:name=engine multipartForm:name=engine")
    public Engine engine;

    public TemplateVersionWritable withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
    
    /**
     * An array of required variables to be used in a template. Only available for `handlebars` templates.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required_vars")
    @SpeakeasyMetadata("form:name=required_vars multipartForm:name=required_vars")
    public String[] requiredVars;

    public TemplateVersionWritable withRequiredVars(String[] requiredVars) {
        this.requiredVars = requiredVars;
        return this;
    }
    
    public TemplateVersionWritable(@JsonProperty("html") String html) {
        this.html = html;
  }
}
