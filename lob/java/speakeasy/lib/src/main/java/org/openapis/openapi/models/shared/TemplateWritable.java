/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class TemplateWritable {
    /**
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    @SpeakeasyMetadata("form:name=description multipartForm:name=description")
    public String description;

    public TemplateWritable withDescription(String description) {
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

    public TemplateWritable withHtml(String html) {
        this.html = html;
        return this;
    }
    
    /**
     * Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    @SpeakeasyMetadata("form:name=metadata,json multipartForm:name=metadata,json")
    public java.util.Map<String, String> metadata;

    public TemplateWritable withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
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

    public TemplateWritable withEngine(Engine engine) {
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

    public TemplateWritable withRequiredVars(String[] requiredVars) {
        this.requiredVars = requiredVars;
        return this;
    }
    
    public TemplateWritable(@JsonProperty("html") String html) {
        this.html = html;
  }
}
