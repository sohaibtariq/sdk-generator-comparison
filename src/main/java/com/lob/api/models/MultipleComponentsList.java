/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for MultipleComponentsList type.
 */
public class MultipleComponentsList {
    private List<MultipleComponents> addresses;

    /**
     * Default constructor.
     */
    public MultipleComponentsList() {
    }

    /**
     * Initialization constructor.
     * @param  addresses  List of MultipleComponents value for addresses.
     */
    public MultipleComponentsList(
            List<MultipleComponents> addresses) {
        this.addresses = addresses;
    }

    /**
     * Getter for Addresses.
     * @return Returns the List of MultipleComponents
     */
    @JsonGetter("addresses")
    public List<MultipleComponents> getAddresses() {
        return addresses;
    }

    /**
     * Setter for Addresses.
     * @param addresses Value for List of MultipleComponents
     */
    @JsonSetter("addresses")
    public void setAddresses(List<MultipleComponents> addresses) {
        this.addresses = addresses;
    }

    /**
     * Converts this MultipleComponentsList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MultipleComponentsList [" + "addresses=" + addresses + "]";
    }

    /**
     * Builds a new {@link MultipleComponentsList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MultipleComponentsList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(addresses);
        return builder;
    }

    /**
     * Class to build instances of {@link MultipleComponentsList}.
     */
    public static class Builder {
        private List<MultipleComponents> addresses;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  addresses  List of MultipleComponents value for addresses.
         */
        public Builder(List<MultipleComponents> addresses) {
            this.addresses = addresses;
        }

        /**
         * Setter for addresses.
         * @param  addresses  List of MultipleComponents value for addresses.
         * @return Builder
         */
        public Builder addresses(List<MultipleComponents> addresses) {
            this.addresses = addresses;
            return this;
        }

        /**
         * Builds a new {@link MultipleComponentsList} object using the set fields.
         * @return {@link MultipleComponentsList}
         */
        public MultipleComponentsList build() {
            return new MultipleComponentsList(addresses);
        }
    }
}
