/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for IntlSuggestions type.
 */
public class IntlSuggestions {
    private String primaryNumberRange;
    private String primaryLine;
    private String city;
    private CountryExtendedEnum country;
    private String state;
    private String zipCode;

    /**
     * Default constructor.
     */
    public IntlSuggestions() {
    }

    /**
     * Initialization constructor.
     * @param  primaryNumberRange  String value for primaryNumberRange.
     * @param  primaryLine  String value for primaryLine.
     * @param  city  String value for city.
     * @param  country  CountryExtendedEnum value for country.
     * @param  state  String value for state.
     * @param  zipCode  String value for zipCode.
     */
    public IntlSuggestions(
            String primaryNumberRange,
            String primaryLine,
            String city,
            CountryExtendedEnum country,
            String state,
            String zipCode) {
        this.primaryNumberRange = primaryNumberRange;
        this.primaryLine = primaryLine;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Getter for PrimaryNumberRange.
     * The primary number range of the address that identifies a building at street level.
     * @return Returns the String
     */
    @JsonGetter("primary_number_range")
    public String getPrimaryNumberRange() {
        return primaryNumberRange;
    }

    /**
     * Setter for PrimaryNumberRange.
     * The primary number range of the address that identifies a building at street level.
     * @param primaryNumberRange Value for String
     */
    @JsonSetter("primary_number_range")
    public void setPrimaryNumberRange(String primaryNumberRange) {
        this.primaryNumberRange = primaryNumberRange;
    }

    /**
     * Getter for PrimaryLine.
     * The primary delivery line (usually the street address) of the address. Combination of the
     * following applicable `components` (primary number &amp; secondary information may be missing or
     * inaccurate): * `primary_number` * `street_predirection` * `street_name` * `street_suffix` *
     * `street_postdirection` * `secondary_designator` * `secondary_number` * `pmb_designator` *
     * `pmb_number`
     * @return Returns the String
     */
    @JsonGetter("primary_line")
    public String getPrimaryLine() {
        return primaryLine;
    }

    /**
     * Setter for PrimaryLine.
     * The primary delivery line (usually the street address) of the address. Combination of the
     * following applicable `components` (primary number &amp; secondary information may be missing or
     * inaccurate): * `primary_number` * `street_predirection` * `street_name` * `street_suffix` *
     * `street_postdirection` * `secondary_designator` * `secondary_number` * `pmb_designator` *
     * `pmb_number`
     * @param primaryLine Value for String
     */
    @JsonSetter("primary_line")
    public void setPrimaryLine(String primaryLine) {
        this.primaryLine = primaryLine;
    }

    /**
     * Getter for City.
     * @return Returns the String
     */
    @JsonGetter("city")
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for Country.
     * Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`,
     * `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification
     * API. Also does not accept `PS`, which is not currently supported.
     * @return Returns the CountryExtendedEnum
     */
    @JsonGetter("country")
    public CountryExtendedEnum getCountry() {
        return country;
    }

    /**
     * Setter for Country.
     * Must be a 2 letter country short-name code (ISO 3166). Does not accept `US`, `AS`, `PR`,
     * `FM`, `GU`, `MH`, `MP`, `PW`, or `VI`. For these addresses, please use the US verification
     * API. Also does not accept `PS`, which is not currently supported.
     * @param country Value for CountryExtendedEnum
     */
    @JsonSetter("country")
    public void setCountry(CountryExtendedEnum country) {
        this.country = country;
    }

    /**
     * Getter for State.
     * The &lt;a href="https://en.wikipedia.org/wiki/ISO_3166-2" target="_blank"&gt;ISO 3166-2&lt;/a&gt; two
     * letter code for the state.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * The &lt;a href="https://en.wikipedia.org/wiki/ISO_3166-2" target="_blank"&gt;ISO 3166-2&lt;/a&gt; two
     * letter code for the state.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for ZipCode.
     * The postal code.
     * @return Returns the String
     */
    @JsonGetter("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * The postal code.
     * @param zipCode Value for String
     */
    @JsonSetter("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Converts this IntlSuggestions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IntlSuggestions [" + "primaryNumberRange=" + primaryNumberRange + ", primaryLine="
                + primaryLine + ", city=" + city + ", country=" + country + ", state=" + state
                + ", zipCode=" + zipCode + "]";
    }

    /**
     * Builds a new {@link IntlSuggestions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IntlSuggestions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(primaryNumberRange, primaryLine, city, country, state,
                zipCode);
        return builder;
    }

    /**
     * Class to build instances of {@link IntlSuggestions}.
     */
    public static class Builder {
        private String primaryNumberRange;
        private String primaryLine;
        private String city;
        private CountryExtendedEnum country;
        private String state;
        private String zipCode;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  primaryNumberRange  String value for primaryNumberRange.
         * @param  primaryLine  String value for primaryLine.
         * @param  city  String value for city.
         * @param  country  CountryExtendedEnum value for country.
         * @param  state  String value for state.
         * @param  zipCode  String value for zipCode.
         */
        public Builder(String primaryNumberRange, String primaryLine, String city,
                CountryExtendedEnum country, String state, String zipCode) {
            this.primaryNumberRange = primaryNumberRange;
            this.primaryLine = primaryLine;
            this.city = city;
            this.country = country;
            this.state = state;
            this.zipCode = zipCode;
        }

        /**
         * Setter for primaryNumberRange.
         * @param  primaryNumberRange  String value for primaryNumberRange.
         * @return Builder
         */
        public Builder primaryNumberRange(String primaryNumberRange) {
            this.primaryNumberRange = primaryNumberRange;
            return this;
        }

        /**
         * Setter for primaryLine.
         * @param  primaryLine  String value for primaryLine.
         * @return Builder
         */
        public Builder primaryLine(String primaryLine) {
            this.primaryLine = primaryLine;
            return this;
        }

        /**
         * Setter for city.
         * @param  city  String value for city.
         * @return Builder
         */
        public Builder city(String city) {
            this.city = city;
            return this;
        }

        /**
         * Setter for country.
         * @param  country  CountryExtendedEnum value for country.
         * @return Builder
         */
        public Builder country(CountryExtendedEnum country) {
            this.country = country;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for zipCode.
         * @param  zipCode  String value for zipCode.
         * @return Builder
         */
        public Builder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        /**
         * Builds a new {@link IntlSuggestions} object using the set fields.
         * @return {@link IntlSuggestions}
         */
        public IntlSuggestions build() {
            return new IntlSuggestions(primaryNumberRange, primaryLine, city, country, state,
                    zipCode);
        }
    }
}
