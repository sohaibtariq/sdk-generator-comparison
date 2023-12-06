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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.Map;

/**
 * This is a model class for AddressObjWithNameDefined type.
 */
public class AddressObjWithNameDefined {
    private OptionalNullable<String> description;
    private String name;
    private OptionalNullable<String> company;
    private String addressLine1;
    private OptionalNullable<String> addressLine2;
    private String addressCity;
    private String addressState;
    private String addressZip;
    private OptionalNullable<String> phone;
    private OptionalNullable<String> email;
    private AddressCountry2Enum addressCountry;
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public AddressObjWithNameDefined() {
        addressCountry = AddressCountry2Enum.US;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  company  String value for company.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressCity  String value for addressCity.
     * @param  addressState  String value for addressState.
     * @param  addressZip  String value for addressZip.
     * @param  phone  String value for phone.
     * @param  email  String value for email.
     * @param  addressCountry  AddressCountry2Enum value for addressCountry.
     * @param  metadata  Map of String, value for metadata.
     */
    public AddressObjWithNameDefined(
            String name,
            String description,
            String company,
            String addressLine1,
            String addressLine2,
            String addressCity,
            String addressState,
            String addressZip,
            String phone,
            String email,
            AddressCountry2Enum addressCountry,
            Map<String, String> metadata) {
        this.description = OptionalNullable.of(description);
        this.name = name;
        this.company = OptionalNullable.of(company);
        this.addressLine1 = addressLine1;
        this.addressLine2 = OptionalNullable.of(addressLine2);
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
        this.phone = OptionalNullable.of(phone);
        this.email = OptionalNullable.of(email);
        this.addressCountry = addressCountry;
        this.metadata = metadata;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  company  String value for company.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressCity  String value for addressCity.
     * @param  addressState  String value for addressState.
     * @param  addressZip  String value for addressZip.
     * @param  phone  String value for phone.
     * @param  email  String value for email.
     * @param  addressCountry  AddressCountry2Enum value for addressCountry.
     * @param  metadata  Map of String, value for metadata.
     */

    protected AddressObjWithNameDefined(String name, OptionalNullable<String> description,
            OptionalNullable<String> company, String addressLine1,
            OptionalNullable<String> addressLine2, String addressCity, String addressState,
            String addressZip, OptionalNullable<String> phone, OptionalNullable<String> email,
            AddressCountry2Enum addressCountry, Map<String, String> metadata) {
        this.description = description;
        this.name = name;
        this.company = company;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
        this.phone = phone;
        this.email = email;
        this.addressCountry = addressCountry;
        this.metadata = metadata;
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     */
    @JsonCreator
    protected AddressObjWithNameDefined(
            @JsonProperty("name") String name) {
        this(name, OptionalNullable.of(null), OptionalNullable.of(null), null,
                OptionalNullable.of(null), null, null, null, OptionalNullable.of(null),
                OptionalNullable.of(null), null, null);
        unsetDescription();
        unsetCompany();
        unsetAddressLine2();
        unsetPhone();
        unsetEmail();
    }

    /**
     * Internal Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Name.
     * Either `name` or `company` is required, you may also add both. Must be no longer than 40
     * characters. If both `name` and `company` are provided, they will be printed on two separate
     * lines above the rest of the address.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Either `name` or `company` is required, you may also add both. Must be no longer than 40
     * characters. If both `name` and `company` are provided, they will be printed on two separate
     * lines above the rest of the address.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for Company.
     * Either `name` or `company` is required, you may also add both. Must be no longer than 40
     * characters. If both `name` and `company` are provided, they will be printed on two separate
     * lines above the rest of the address. This field can be used for any secondary recipient
     * information which is not part of the actual mailing address (Company Name, Department,
     * Attention Line, etc).
     * @return Returns the Internal String
     */
    @JsonGetter("company")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCompany() {
        return this.company;
    }

    /**
     * Getter for Company.
     * Either `name` or `company` is required, you may also add both. Must be no longer than 40
     * characters. If both `name` and `company` are provided, they will be printed on two separate
     * lines above the rest of the address. This field can be used for any secondary recipient
     * information which is not part of the actual mailing address (Company Name, Department,
     * Attention Line, etc).
     * @return Returns the String
     */
    public String getCompany() {
        return OptionalNullable.getFrom(company);
    }

    /**
     * Setter for Company.
     * Either `name` or `company` is required, you may also add both. Must be no longer than 40
     * characters. If both `name` and `company` are provided, they will be printed on two separate
     * lines above the rest of the address. This field can be used for any secondary recipient
     * information which is not part of the actual mailing address (Company Name, Department,
     * Attention Line, etc).
     * @param company Value for String
     */
    @JsonSetter("company")
    public void setCompany(String company) {
        this.company = OptionalNullable.of(company);
    }

    /**
     * UnSetter for Company.
     * Either `name` or `company` is required, you may also add both. Must be no longer than 40
     * characters. If both `name` and `company` are provided, they will be printed on two separate
     * lines above the rest of the address. This field can be used for any secondary recipient
     * information which is not part of the actual mailing address (Company Name, Department,
     * Attention Line, etc).
     */
    public void unsetCompany() {
        company = null;
    }

    /**
     * Getter for AddressLine1.
     * The primary number, street name, and directional information.
     * @return Returns the String
     */
    @JsonGetter("address_line1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * The primary number, street name, and directional information.
     * @param addressLine1 Value for String
     */
    @JsonSetter("address_line1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Internal Getter for AddressLine2.
     * An optional field for address unit information. Total string sum of this plus `address_line1`
     * may not exceed 50 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("address_line2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAddressLine2() {
        return this.addressLine2;
    }

    /**
     * Getter for AddressLine2.
     * An optional field for address unit information. Total string sum of this plus `address_line1`
     * may not exceed 50 characters.
     * @return Returns the String
     */
    public String getAddressLine2() {
        return OptionalNullable.getFrom(addressLine2);
    }

    /**
     * Setter for AddressLine2.
     * An optional field for address unit information. Total string sum of this plus `address_line1`
     * may not exceed 50 characters.
     * @param addressLine2 Value for String
     */
    @JsonSetter("address_line2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = OptionalNullable.of(addressLine2);
    }

    /**
     * UnSetter for AddressLine2.
     * An optional field for address unit information. Total string sum of this plus `address_line1`
     * may not exceed 50 characters.
     */
    public void unsetAddressLine2() {
        addressLine2 = null;
    }

    /**
     * Getter for AddressCity.
     * @return Returns the String
     */
    @JsonGetter("address_city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Setter for AddressCity.
     * @param addressCity Value for String
     */
    @JsonSetter("address_city")
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * Getter for AddressState.
     * 2 letter state short-name code
     * @return Returns the String
     */
    @JsonGetter("address_state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressState() {
        return addressState;
    }

    /**
     * Setter for AddressState.
     * 2 letter state short-name code
     * @param addressState Value for String
     */
    @JsonSetter("address_state")
    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    /**
     * Getter for AddressZip.
     * Must follow the ZIP format of `12345` or ZIP+4 format of `12345-1234`.
     * @return Returns the String
     */
    @JsonGetter("address_zip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressZip() {
        return addressZip;
    }

    /**
     * Setter for AddressZip.
     * Must follow the ZIP format of `12345` or ZIP+4 format of `12345-1234`.
     * @param addressZip Value for String
     */
    @JsonSetter("address_zip")
    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip;
    }

    /**
     * Internal Getter for Phone.
     * Must be no longer than 40 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPhone() {
        return this.phone;
    }

    /**
     * Getter for Phone.
     * Must be no longer than 40 characters.
     * @return Returns the String
     */
    public String getPhone() {
        return OptionalNullable.getFrom(phone);
    }

    /**
     * Setter for Phone.
     * Must be no longer than 40 characters.
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = OptionalNullable.of(phone);
    }

    /**
     * UnSetter for Phone.
     * Must be no longer than 40 characters.
     */
    public void unsetPhone() {
        phone = null;
    }

    /**
     * Internal Getter for Email.
     * Must be no longer than 100 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetEmail() {
        return this.email;
    }

    /**
     * Getter for Email.
     * Must be no longer than 100 characters.
     * @return Returns the String
     */
    public String getEmail() {
        return OptionalNullable.getFrom(email);
    }

    /**
     * Setter for Email.
     * Must be no longer than 100 characters.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = OptionalNullable.of(email);
    }

    /**
     * UnSetter for Email.
     * Must be no longer than 100 characters.
     */
    public void unsetEmail() {
        email = null;
    }

    /**
     * Getter for AddressCountry.
     * @return Returns the AddressCountry2Enum
     */
    @JsonGetter("address_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddressCountry2Enum getAddressCountry() {
        return addressCountry;
    }

    /**
     * Setter for AddressCountry.
     * @param addressCountry Value for AddressCountry2Enum
     */
    @JsonSetter("address_country")
    public void setAddressCountry(AddressCountry2Enum addressCountry) {
        this.addressCountry = addressCountry;
    }

    /**
     * Getter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this AddressObjWithNameDefined into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddressObjWithNameDefined [" + "name=" + name + ", description=" + description
                + ", company=" + company + ", addressLine1=" + addressLine1 + ", addressLine2="
                + addressLine2 + ", addressCity=" + addressCity + ", addressState=" + addressState
                + ", addressZip=" + addressZip + ", phone=" + phone + ", email=" + email
                + ", addressCountry=" + addressCountry + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link AddressObjWithNameDefined.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddressObjWithNameDefined.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name)
                .addressLine1(getAddressLine1())
                .addressCity(getAddressCity())
                .addressState(getAddressState())
                .addressZip(getAddressZip())
                .addressCountry(getAddressCountry())
                .metadata(getMetadata());
        builder.description = internalGetDescription();
        builder.company = internalGetCompany();
        builder.addressLine2 = internalGetAddressLine2();
        builder.phone = internalGetPhone();
        builder.email = internalGetEmail();
        return builder;
    }

    /**
     * Class to build instances of {@link AddressObjWithNameDefined}.
     */
    public static class Builder {
        private String name;
        private OptionalNullable<String> description;
        private OptionalNullable<String> company;
        private String addressLine1;
        private OptionalNullable<String> addressLine2;
        private String addressCity;
        private String addressState;
        private String addressZip;
        private OptionalNullable<String> phone;
        private OptionalNullable<String> email;
        private AddressCountry2Enum addressCountry = AddressCountry2Enum.US;
        private Map<String, String> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         */
        public Builder(String name) {
            this.name = name;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for company.
         * @param  company  String value for company.
         * @return Builder
         */
        public Builder company(String company) {
            this.company = OptionalNullable.of(company);
            return this;
        }

        /**
         * UnSetter for company.
         * @return Builder
         */
        public Builder unsetCompany() {
            company = null;
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
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = OptionalNullable.of(addressLine2);
            return this;
        }

        /**
         * UnSetter for addressLine2.
         * @return Builder
         */
        public Builder unsetAddressLine2() {
            addressLine2 = null;
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
         * Setter for phone.
         * @param  phone  String value for phone.
         * @return Builder
         */
        public Builder phone(String phone) {
            this.phone = OptionalNullable.of(phone);
            return this;
        }

        /**
         * UnSetter for phone.
         * @return Builder
         */
        public Builder unsetPhone() {
            phone = null;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = OptionalNullable.of(email);
            return this;
        }

        /**
         * UnSetter for email.
         * @return Builder
         */
        public Builder unsetEmail() {
            email = null;
            return this;
        }

        /**
         * Setter for addressCountry.
         * @param  addressCountry  AddressCountry2Enum value for addressCountry.
         * @return Builder
         */
        public Builder addressCountry(AddressCountry2Enum addressCountry) {
            this.addressCountry = addressCountry;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link AddressObjWithNameDefined} object using the set fields.
         * @return {@link AddressObjWithNameDefined}
         */
        public AddressObjWithNameDefined build() {
            return new AddressObjWithNameDefined(name, description, company, addressLine1,
                    addressLine2, addressCity, addressState, addressZip, phone, email,
                    addressCountry, metadata);
        }
    }
}
