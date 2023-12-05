/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for RequiredAddressColumns type.
 */
public class RequiredAddressColumns {
    private String name;
    private String addressLine1;
    private String addressCity;
    private String addressState;
    private String addressZip;

    /**
     * Default constructor.
     */
    public RequiredAddressColumns() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressCity  String value for addressCity.
     * @param  addressState  String value for addressState.
     * @param  addressZip  String value for addressZip.
     */
    public RequiredAddressColumns(
            String name,
            String addressLine1,
            String addressCity,
            String addressState,
            String addressZip) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
    }

    /**
     * Getter for Name.
     * The column header from the csv file that should be mapped to the required field `name`
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The column header from the csv file that should be mapped to the required field `name`
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for AddressLine1.
     * The column header from the csv file that should be mapped to the required field
     * `address_line1`
     * @return Returns the String
     */
    @JsonGetter("address_line1")
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * The column header from the csv file that should be mapped to the required field
     * `address_line1`
     * @param addressLine1 Value for String
     */
    @JsonSetter("address_line1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for AddressCity.
     * The column header from the csv file that should be mapped to the required field
     * `address_city`
     * @return Returns the String
     */
    @JsonGetter("address_city")
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Setter for AddressCity.
     * The column header from the csv file that should be mapped to the required field
     * `address_city`
     * @param addressCity Value for String
     */
    @JsonSetter("address_city")
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * Getter for AddressState.
     * The column header from the csv file that should be mapped to the required field
     * `address_state`
     * @return Returns the String
     */
    @JsonGetter("address_state")
    public String getAddressState() {
        return addressState;
    }

    /**
     * Setter for AddressState.
     * The column header from the csv file that should be mapped to the required field
     * `address_state`
     * @param addressState Value for String
     */
    @JsonSetter("address_state")
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * Getter for AddressZip.
     * The column header from the csv file that should be mapped to the required field `address_zip`
     * @return Returns the String
     */
    @JsonGetter("address_zip")
    public String getAddressZip() {
        return addressZip;
    }

    /**
     * Setter for AddressZip.
     * The column header from the csv file that should be mapped to the required field `address_zip`
     * @param addressZip Value for String
     */
    @JsonSetter("address_zip")
    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    /**
     * Converts this RequiredAddressColumns into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RequiredAddressColumns [" + "name=" + name + ", addressLine1=" + addressLine1
                + ", addressCity=" + addressCity + ", addressState=" + addressState
                + ", addressZip=" + addressZip + "]";
    }

    /**
     * Builds a new {@link RequiredAddressColumns.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RequiredAddressColumns.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, addressLine1, addressCity, addressState, addressZip);
        return builder;
    }

    /**
     * Class to build instances of {@link RequiredAddressColumns}.
     */
    public static class Builder {
        private String name;
        private String addressLine1;
        private String addressCity;
        private String addressState;
        private String addressZip;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  addressLine1  String value for addressLine1.
         * @param  addressCity  String value for addressCity.
         * @param  addressState  String value for addressState.
         * @param  addressZip  String value for addressZip.
         */
        public Builder(String name, String addressLine1, String addressCity, String addressState,
                String addressZip) {
            this.name = name;
            this.addressLine1 = addressLine1;
            this.addressCity = addressCity;
            this.addressState = addressState;
            this.addressZip = addressZip;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        /**
         * Setter for addressCity.
         * @param  addressCity  String value for addressCity.
         * @return Builder
         */
        public Builder addressCity(String addressCity) {
            this.addressCity = addressCity;
            return this;
        }

        /**
         * Setter for addressState.
         * @param  addressState  String value for addressState.
         * @return Builder
         */
        public Builder addressState(String addressState) {
            this.addressState = addressState;
            return this;
        }

        /**
         * Setter for addressZip.
         * @param  addressZip  String value for addressZip.
         * @return Builder
         */
        public Builder addressZip(String addressZip) {
            this.addressZip = addressZip;
            return this;
        }

        /**
         * Builds a new {@link RequiredAddressColumns} object using the set fields.
         * @return {@link RequiredAddressColumns}
         */
        public RequiredAddressColumns build() {
            return new RequiredAddressColumns(name, addressLine1, addressCity, addressState,
                    addressZip);
        }
    }
}
