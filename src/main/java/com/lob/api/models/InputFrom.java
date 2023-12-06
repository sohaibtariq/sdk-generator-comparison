/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.lob.api.models.containers.InputFromFrom;

/**
 * This is a model class for InputFrom type.
 */
public class InputFrom {
    private InputFromFrom from;

    /**
     * Default constructor.
     */
    public InputFrom() {
    }

    /**
     * Initialization constructor.
     * @param  from  InputFromFrom value for from.
     */
    public InputFrom(
            InputFromFrom from) {
        this.from = from;
    }

    /**
     * Getter for From.
     * Must either be an address ID or an inline object with correct address parameters. Must be a
     * US address unless using a `custom_envelope`. All addresses will be standardized into
     * uppercase without being modified by verification.
     * @return Returns the InputFromFrom
     */
    @JsonGetter("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InputFromFrom getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * Must either be an address ID or an inline object with correct address parameters. Must be a
     * US address unless using a `custom_envelope`. All addresses will be standardized into
     * uppercase without being modified by verification.
     * @param from Value for InputFromFrom
     */
    @JsonSetter("from")
    public void setFrom(InputFromFrom from) {
        this.from = from;
    }

    /**
     * Converts this InputFrom into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InputFrom [" + "from=" + from + "]";
    }

    /**
     * Builds a new {@link InputFrom.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InputFrom.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .from(getFrom());
        return builder;
    }

    /**
     * Class to build instances of {@link InputFrom}.
     */
    public static class Builder {
        private InputFromFrom from;



        /**
         * Setter for from.
         * @param  from  InputFromFrom value for from.
         * @return Builder
         */
        public Builder from(InputFromFrom from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link InputFrom} object using the set fields.
         * @return {@link InputFrom}
         */
        public InputFrom build() {
            return new InputFrom(from);
        }
    }
}