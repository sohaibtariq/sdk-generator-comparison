/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RecipientInput type.
 */
public class RecipientInput {
    private String recipient;
    private String primaryLine;
    private String secondaryLine;
    private String urbanization;
    private String city;
    private String state;
    private String zipCode;

    /**
     * Default constructor.
     */
    public RecipientInput() {
    }

    /**
     * Initialization constructor.
     * @param  recipient  String value for recipient.
     * @param  primaryLine  String value for primaryLine.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zipCode  String value for zipCode.
     * @param  secondaryLine  String value for secondaryLine.
     * @param  urbanization  String value for urbanization.
     */
    public RecipientInput(
            String recipient,
            String primaryLine,
            String city,
            String state,
            String zipCode,
            String secondaryLine,
            String urbanization) {
        this.recipient = recipient;
        this.primaryLine = primaryLine;
        this.secondaryLine = secondaryLine;
        this.urbanization = urbanization;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    /**
     * Initialization constructor.
     * @param  recipient  String value for recipient.
     * @param  primaryLine  String value for primaryLine.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zipCode  String value for zipCode.
     */
    @JsonCreator
    protected RecipientInput(
            @JsonProperty("recipient") String recipient,
            @JsonProperty("primary_line") String primaryLine,
            @JsonProperty("city") String city,
            @JsonProperty("state") String state,
            @JsonProperty("zip_code") String zipCode) {
        this(recipient, primaryLine, city, state, zipCode, null, null);
    }

    /**
     * Getter for Recipient.
     * The intended recipient, typically a person's or firm's name.
     * @return Returns the String
     */
    @JsonGetter("recipient")
    public String getRecipient() {
        return recipient;
    }

    /**
     * Setter for Recipient.
     * The intended recipient, typically a person's or firm's name.
     * @param recipient Value for String
     */
    @JsonSetter("recipient")
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Getter for PrimaryLine.
     * The primary delivery line (usually the street address) of the address. Combination of the
     * following applicable `components`: * `primary_number` * `street_predirection` * `street_name`
     * * `street_suffix` * `street_postdirection` * `secondary_designator` * `secondary_number` *
     * `pmb_designator` * `pmb_number`
     * @return Returns the String
     */
    @JsonGetter("primary_line")
    public String getPrimaryLine() {
        return primaryLine;
    }

    /**
     * Setter for PrimaryLine.
     * The primary delivery line (usually the street address) of the address. Combination of the
     * following applicable `components`: * `primary_number` * `street_predirection` * `street_name`
     * * `street_suffix` * `street_postdirection` * `secondary_designator` * `secondary_number` *
     * `pmb_designator` * `pmb_number`
     * @param primaryLine Value for String
     */
    @JsonSetter("primary_line")
    public void setPrimaryLine(String primaryLine) {
        this.primaryLine = primaryLine;
    }

    /**
     * Getter for SecondaryLine.
     * The secondary delivery line of the address. This field is typically empty but may contain
     * information if `primary_line` is too long.
     * @return Returns the String
     */
    @JsonGetter("secondary_line")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecondaryLine() {
        return secondaryLine;
    }

    /**
     * Setter for SecondaryLine.
     * The secondary delivery line of the address. This field is typically empty but may contain
     * information if `primary_line` is too long.
     * @param secondaryLine Value for String
     */
    @JsonSetter("secondary_line")
    public void setSecondaryLine(String secondaryLine) {
        this.secondaryLine = secondaryLine;
    }

    /**
     * Getter for Urbanization.
     * Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or
     * development within a city. See &lt;a
     * href="https://pe.usps.com/text/pub28/28api_008.htm#:~:text=I51.,-4%20Urbanizations&amp;text=In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name."
     * target="_blank"&gt;USPS documentation&lt;/a&gt; for clarification.
     * @return Returns the String
     */
    @JsonGetter("urbanization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrbanization() {
        return urbanization;
    }

    /**
     * Setter for Urbanization.
     * Only present for addresses in Puerto Rico. An urbanization refers to an area, sector, or
     * development within a city. See &lt;a
     * href="https://pe.usps.com/text/pub28/28api_008.htm#:~:text=I51.,-4%20Urbanizations&amp;text=In%20Puerto%20Rico%2C%20identical%20street,placed%20before%20the%20urbanization%20name."
     * target="_blank"&gt;USPS documentation&lt;/a&gt; for clarification.
     * @param urbanization Value for String
     */
    @JsonSetter("urbanization")
    public void setUrbanization(String urbanization) {
        this.urbanization = urbanization;
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
     * Getter for State.
     * The &lt;a href="https://en.wikipedia.org/wiki/ISO_3166-2:US" target="_blank"&gt;ISO 3166-2&lt;/a&gt; two
     * letter code or subdivision name for the state. `city` and `state` are required if no
     * `zip_code` is passed.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * The &lt;a href="https://en.wikipedia.org/wiki/ISO_3166-2:US" target="_blank"&gt;ISO 3166-2&lt;/a&gt; two
     * letter code or subdivision name for the state. `city` and `state` are required if no
     * `zip_code` is passed.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for ZipCode.
     * @return Returns the String
     */
    @JsonGetter("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter for ZipCode.
     * @param zipCode Value for String
     */
    @JsonSetter("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * Converts this RecipientInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RecipientInput [" + "recipient=" + recipient + ", primaryLine=" + primaryLine
                + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
                + ", secondaryLine=" + secondaryLine + ", urbanization=" + urbanization + "]";
    }

    /**
     * Builds a new {@link RecipientInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RecipientInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(recipient, primaryLine, city, state, zipCode)
                .secondaryLine(getSecondaryLine())
                .urbanization(getUrbanization());
        return builder;
    }

    /**
     * Class to build instances of {@link RecipientInput}.
     */
    public static class Builder {
        private String recipient;
        private String primaryLine;
        private String city;
        private String state;
        private String zipCode;
        private String secondaryLine;
        private String urbanization;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  recipient  String value for recipient.
         * @param  primaryLine  String value for primaryLine.
         * @param  city  String value for city.
         * @param  state  String value for state.
         * @param  zipCode  String value for zipCode.
         */
        public Builder(String recipient, String primaryLine, String city, String state,
                String zipCode) {
            this.recipient = recipient;
            this.primaryLine = primaryLine;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        /**
         * Setter for recipient.
         * @param  recipient  String value for recipient.
         * @return Builder
         */
        public Builder recipient(String recipient) {
            this.recipient = recipient;
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
         * Setter for secondaryLine.
         * @param  secondaryLine  String value for secondaryLine.
         * @return Builder
         */
        public Builder secondaryLine(String secondaryLine) {
            this.secondaryLine = secondaryLine;
            return this;
        }

        /**
         * Setter for urbanization.
         * @param  urbanization  String value for urbanization.
         * @return Builder
         */
        public Builder urbanization(String urbanization) {
            this.urbanization = urbanization;
            return this;
        }

        /**
         * Builds a new {@link RecipientInput} object using the set fields.
         * @return {@link RecipientInput}
         */
        public RecipientInput build() {
            return new RecipientInput(recipient, primaryLine, city, state, zipCode, secondaryLine,
                    urbanization);
        }
    }
}
