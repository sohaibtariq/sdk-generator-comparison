/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class IntlAutocompletionsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public org.openapis.openapi.models.shared.IntlAutocompletionsWritable intlAutocompletionsWritable;

    public IntlAutocompletionsRequest withIntlAutocompletionsWritable(org.openapis.openapi.models.shared.IntlAutocompletionsWritable intlAutocompletionsWritable) {
        this.intlAutocompletionsWritable = intlAutocompletionsWritable;
        return this;
    }
    
    /**
     * * `native` - Translate response to the native language of the country in the request
     * * `match` - match the response to the language in the request
     * 
     * Default response is in English.
     * 
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-lang-output")
    public org.openapis.openapi.models.shared.LangSpec xLangOutput;

    public IntlAutocompletionsRequest withXLangOutput(org.openapis.openapi.models.shared.LangSpec xLangOutput) {
        this.xLangOutput = xLangOutput;
        return this;
    }
    
    public IntlAutocompletionsRequest(@JsonProperty("intl_autocompletions_writable") org.openapis.openapi.models.shared.IntlAutocompletionsWritable intlAutocompletionsWritable) {
        this.intlAutocompletionsWritable = intlAutocompletionsWritable;
  }
}