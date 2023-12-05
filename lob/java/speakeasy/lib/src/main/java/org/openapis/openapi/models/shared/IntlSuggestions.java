/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class IntlSuggestions {
    /**
     * The primary number range of the address that identifies a building at street level.
     * 
     */
    @JsonProperty("primary_number_range")
    public String primaryNumberRange;

    public IntlSuggestions withPrimaryNumberRange(String primaryNumberRange) {
        this.primaryNumberRange = primaryNumberRange;
        return this;
    }
    
    /**
     * The primary delivery line (usually the street address) of the address.
     * Combination of the following applicable `components` (primary number &amp;
     * secondary information may be missing or inaccurate):
     * * `primary_number`
     * * `street_predirection`
     * * `street_name`
     * * `street_suffix`
     * * `street_postdirection`
     * * `secondary_designator`
     * * `secondary_number`
     * * `pmb_designator`
     * * `pmb_number`
     * 
     */
    @JsonProperty("primary_line")
    public String primaryLine;

    public IntlSuggestions withPrimaryLine(String primaryLine) {
        this.primaryLine = primaryLine;
        return this;
    }
    
    @JsonProperty("city")
    public String city;

    public IntlSuggestions withCity(String city) {
        this.city = city;
        return this;
    }
    
    /**
     * Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`, `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification API. Also does not accept `PS`, which is not currently supported.
     */
    @JsonProperty("country")
    public CountryExtended country;

    public IntlSuggestions withCountry(CountryExtended country) {
        this.country = country;
        return this;
    }
    
    /**
     * The &lt;a href="https://en.wikipedia.org/wiki/ISO_3166-2" target="_blank"&gt;ISO 3166-2&lt;/a&gt; two letter code for the state.
     * 
     */
    @JsonProperty("state")
    public String state;

    public IntlSuggestions withState(String state) {
        this.state = state;
        return this;
    }
    
    /**
     * The postal code.
     */
    @JsonProperty("zip_code")
    public String zipCode;

    public IntlSuggestions withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }
    
    public IntlSuggestions(@JsonProperty("primary_number_range") String primaryNumberRange, @JsonProperty("primary_line") String primaryLine, @JsonProperty("city") String city, @JsonProperty("country") CountryExtended country, @JsonProperty("state") String state, @JsonProperty("zip_code") String zipCode) {
        this.primaryNumberRange = primaryNumberRange;
        this.primaryLine = primaryLine;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
  }
}