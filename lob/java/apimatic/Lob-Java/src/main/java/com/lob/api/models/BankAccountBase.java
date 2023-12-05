/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.Map;

/**
 * This is a model class for BankAccountBase type.
 */
public class BankAccountBase {
    private OptionalNullable<String> description;
    private String routingNumber;
    private String accountNumber;
    private AccountTypeEnum accountType;
    private String signatory;
    private CheckTemplateEnum checkTemplate;
    private String fractionalRoutingNumber;
    private String city;
    private String state;
    private String zipcode;
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public BankAccountBase() {
    }

    /**
     * Initialization constructor.
     * @param  routingNumber  String value for routingNumber.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountType  AccountTypeEnum value for accountType.
     * @param  signatory  String value for signatory.
     * @param  description  String value for description.
     * @param  checkTemplate  CheckTemplateEnum value for checkTemplate.
     * @param  fractionalRoutingNumber  String value for fractionalRoutingNumber.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zipcode  String value for zipcode.
     * @param  metadata  Map of String, value for metadata.
     */
    public BankAccountBase(
            String routingNumber,
            String accountNumber,
            AccountTypeEnum accountType,
            String signatory,
            String description,
            CheckTemplateEnum checkTemplate,
            String fractionalRoutingNumber,
            String city,
            String state,
            String zipcode,
            Map<String, String> metadata) {
        this.description = OptionalNullable.of(description);
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.signatory = signatory;
        this.checkTemplate = checkTemplate;
        this.fractionalRoutingNumber = fractionalRoutingNumber;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.metadata = metadata;
    }

    /**
     * Initialization constructor.
     * @param  routingNumber  String value for routingNumber.
     * @param  accountNumber  String value for accountNumber.
     * @param  accountType  AccountTypeEnum value for accountType.
     * @param  signatory  String value for signatory.
     * @param  description  String value for description.
     * @param  checkTemplate  CheckTemplateEnum value for checkTemplate.
     * @param  fractionalRoutingNumber  String value for fractionalRoutingNumber.
     * @param  city  String value for city.
     * @param  state  String value for state.
     * @param  zipcode  String value for zipcode.
     * @param  metadata  Map of String, value for metadata.
     */

    protected BankAccountBase(String routingNumber, String accountNumber,
            AccountTypeEnum accountType, String signatory, OptionalNullable<String> description,
            CheckTemplateEnum checkTemplate, String fractionalRoutingNumber, String city,
            String state, String zipcode, Map<String, String> metadata) {
        this.description = description;
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.signatory = signatory;
        this.checkTemplate = checkTemplate;
        this.fractionalRoutingNumber = fractionalRoutingNumber;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.metadata = metadata;
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
     * Getter for RoutingNumber.
     * Must be a &lt;a href="https://www.frbservices.org/index.html" target="_blank"&gt;valid US routing
     * number&lt;/a&gt;.
     * @return Returns the String
     */
    @JsonGetter("routing_number")
    public String getRoutingNumber() {
        return routingNumber;
    }

    /**
     * Setter for RoutingNumber.
     * Must be a &lt;a href="https://www.frbservices.org/index.html" target="_blank"&gt;valid US routing
     * number&lt;/a&gt;.
     * @param routingNumber Value for String
     */
    @JsonSetter("routing_number")
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    /**
     * Getter for AccountNumber.
     * @return Returns the String
     */
    @JsonGetter("account_number")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * @param accountNumber Value for String
     */
    @JsonSetter("account_number")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for AccountType.
     * The type of entity that holds the account.
     * @return Returns the AccountTypeEnum
     */
    @JsonGetter("account_type")
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    /**
     * Setter for AccountType.
     * The type of entity that holds the account.
     * @param accountType Value for AccountTypeEnum
     */
    @JsonSetter("account_type")
    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    /**
     * Getter for Signatory.
     * The signatory associated with your account. This name will be printed on checks created with
     * this bank account. If you prefer to use a custom signature image on your checks instead,
     * please create your bank account from the &lt;a href="https://dashboard.lob.com/#/login"
     * target="_blank"&gt;Dashboard&lt;/a&gt;.
     * @return Returns the String
     */
    @JsonGetter("signatory")
    public String getSignatory() {
        return signatory;
    }

    /**
     * Setter for Signatory.
     * The signatory associated with your account. This name will be printed on checks created with
     * this bank account. If you prefer to use a custom signature image on your checks instead,
     * please create your bank account from the &lt;a href="https://dashboard.lob.com/#/login"
     * target="_blank"&gt;Dashboard&lt;/a&gt;.
     * @param signatory Value for String
     */
    @JsonSetter("signatory")
    public void setSignatory(String signatory) {
        this.signatory = signatory;
    }

    /**
     * Getter for CheckTemplate.
     * The check template used for printing. The defualt value is `common`. If you bank with JP
     * Morgan Chase and wish to use Positive Pay use the `jpm` template. `jpm` requires additional
     * information to be provided.
     * @return Returns the CheckTemplateEnum
     */
    @JsonGetter("check_template")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckTemplateEnum getCheckTemplate() {
        return checkTemplate;
    }

    /**
     * Setter for CheckTemplate.
     * The check template used for printing. The defualt value is `common`. If you bank with JP
     * Morgan Chase and wish to use Positive Pay use the `jpm` template. `jpm` requires additional
     * information to be provided.
     * @param checkTemplate Value for CheckTemplateEnum
     */
    @JsonSetter("check_template")
    public void setCheckTemplate(CheckTemplateEnum checkTemplate) {
        this.checkTemplate = checkTemplate;
    }

    /**
     * Getter for FractionalRoutingNumber.
     * The fractional routing number for your home bank account. Required for the `jpm` check
     * template only. Please contact a bank representative if you do not know the fractional routing
     * number associated with your home bank institution.
     * @return Returns the String
     */
    @JsonGetter("fractional_routing_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFractionalRoutingNumber() {
        return fractionalRoutingNumber;
    }

    /**
     * Setter for FractionalRoutingNumber.
     * The fractional routing number for your home bank account. Required for the `jpm` check
     * template only. Please contact a bank representative if you do not know the fractional routing
     * number associated with your home bank institution.
     * @param fractionalRoutingNumber Value for String
     */
    @JsonSetter("fractional_routing_number")
    public void setFractionalRoutingNumber(String fractionalRoutingNumber) {
        this.fractionalRoutingNumber = fractionalRoutingNumber;
    }

    /**
     * Getter for City.
     * The city associated with your home bank account. Required for the `jpm` check template only.
     * Please contact a bank representative if you do not know the city associated with your home
     * bank institution.
     * @return Returns the String
     */
    @JsonGetter("city")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCity() {
        return city;
    }

    /**
     * Setter for City.
     * The city associated with your home bank account. Required for the `jpm` check template only.
     * Please contact a bank representative if you do not know the city associated with your home
     * bank institution.
     * @param city Value for String
     */
    @JsonSetter("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter for State.
     * The state associated with your home bank account. Required for the `jpm` check template only.
     * Please contact a bank representative if you do not know the state associated with your home
     * bank institution.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * The state associated with your home bank account. Required for the `jpm` check template only.
     * Please contact a bank representative if you do not know the state associated with your home
     * bank institution.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for Zipcode.
     * The zipcode associated with your home bank account. Required for the `jpm` check template
     * only. Please contact a bank representative if you do not know the zipcode associated with
     * your home bank institution.
     * @return Returns the String
     */
    @JsonGetter("zipcode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Setter for Zipcode.
     * The zipcode associated with your home bank account. Required for the `jpm` check template
     * only. Please contact a bank representative if you do not know the zipcode associated with
     * your home bank institution.
     * @param zipcode Value for String
     */
    @JsonSetter("zipcode")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
     * Converts this BankAccountBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankAccountBase [" + "routingNumber=" + routingNumber + ", accountNumber="
                + accountNumber + ", accountType=" + accountType + ", signatory=" + signatory
                + ", description=" + description + ", checkTemplate=" + checkTemplate
                + ", fractionalRoutingNumber=" + fractionalRoutingNumber + ", city=" + city
                + ", state=" + state + ", zipcode=" + zipcode + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link BankAccountBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankAccountBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(routingNumber, accountNumber, accountType, signatory)
                .checkTemplate(getCheckTemplate())
                .fractionalRoutingNumber(getFractionalRoutingNumber())
                .city(getCity())
                .state(getState())
                .zipcode(getZipcode())
                .metadata(getMetadata());
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link BankAccountBase}.
     */
    public static class Builder {
        private String routingNumber;
        private String accountNumber;
        private AccountTypeEnum accountType;
        private String signatory;
        private OptionalNullable<String> description;
        private CheckTemplateEnum checkTemplate;
        private String fractionalRoutingNumber;
        private String city;
        private String state;
        private String zipcode;
        private Map<String, String> metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  routingNumber  String value for routingNumber.
         * @param  accountNumber  String value for accountNumber.
         * @param  accountType  AccountTypeEnum value for accountType.
         * @param  signatory  String value for signatory.
         */
        public Builder(String routingNumber, String accountNumber, AccountTypeEnum accountType,
                String signatory) {
            this.routingNumber = routingNumber;
            this.accountNumber = accountNumber;
            this.accountType = accountType;
            this.signatory = signatory;
        }

        /**
         * Setter for routingNumber.
         * @param  routingNumber  String value for routingNumber.
         * @return Builder
         */
        public Builder routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Setter for accountType.
         * @param  accountType  AccountTypeEnum value for accountType.
         * @return Builder
         */
        public Builder accountType(AccountTypeEnum accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * Setter for signatory.
         * @param  signatory  String value for signatory.
         * @return Builder
         */
        public Builder signatory(String signatory) {
            this.signatory = signatory;
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
         * Setter for checkTemplate.
         * @param  checkTemplate  CheckTemplateEnum value for checkTemplate.
         * @return Builder
         */
        public Builder checkTemplate(CheckTemplateEnum checkTemplate) {
            this.checkTemplate = checkTemplate;
            return this;
        }

        /**
         * Setter for fractionalRoutingNumber.
         * @param  fractionalRoutingNumber  String value for fractionalRoutingNumber.
         * @return Builder
         */
        public Builder fractionalRoutingNumber(String fractionalRoutingNumber) {
            this.fractionalRoutingNumber = fractionalRoutingNumber;
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
         * Setter for zipcode.
         * @param  zipcode  String value for zipcode.
         * @return Builder
         */
        public Builder zipcode(String zipcode) {
            this.zipcode = zipcode;
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
         * Builds a new {@link BankAccountBase} object using the set fields.
         * @return {@link BankAccountBase}
         */
        public BankAccountBase build() {
            return new BankAccountBase(routingNumber, accountNumber, accountType, signatory,
                    description, checkTemplate, fractionalRoutingNumber, city, state, zipcode,
                    metadata);
        }
    }
}
