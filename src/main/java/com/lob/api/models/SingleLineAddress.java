/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SingleLineAddress type.
 */
public class SingleLineAddress {
    private String address;

    /**
     * Default constructor.
     */
    public SingleLineAddress() {
    }

    /**
     * Initialization constructor.
     * @param  address  String value for address.
     */
    @JsonCreator
    public SingleLineAddress(
            @JsonProperty("address") String address) {
        this.address = address;
    }

    /**
     * Getter for Address.
     * The entire address in one string (e.g., "210 King Street 94107"). _Does not support a
     * recipient and will error when other payload parameters are provided._
     * @return Returns the String
     */
    @JsonGetter("address")
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * The entire address in one string (e.g., "210 King Street 94107"). _Does not support a
     * recipient and will error when other payload parameters are provided._
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Converts this SingleLineAddress into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SingleLineAddress [" + "address=" + address + "]";
    }

    /**
     * Builds a new {@link SingleLineAddress.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SingleLineAddress.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(address);
        return builder;
    }

    /**
     * Class to build instances of {@link SingleLineAddress}.
     */
    public static class Builder {
        private String address;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  address  String value for address.
         */
        public Builder(String address) {
            this.address = address;
        }

        /**
         * Setter for address.
         * @param  address  String value for address.
         * @return Builder
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link SingleLineAddress} object using the set fields.
         * @return {@link SingleLineAddress}
         */
        public SingleLineAddress build() {
            return new SingleLineAddress(address);
        }
    }
}
