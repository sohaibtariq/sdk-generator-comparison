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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.DateTimeHelper;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * This is a model class for AddressUs type.
 */
public class AddressUs {
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;
    private Boolean deleted;
    private String object;
    private String id;
    private OptionalNullable<String> description;
    private String name;
    private String company;
    private OptionalNullable<String> phone;
    private OptionalNullable<String> email;
    private String addressLine1;
    private OptionalNullable<String> addressLine2;
    private String addressCity;
    private String addressState;
    private String addressZip;
    private AddressCountryEnum addressCountry;
    private Map<String, String> metadata;
    private OptionalNullable<Boolean> recipientMoved;

    /**
     * Default constructor.
     */
    public AddressUs() {
        object = "address";
    }

    /**
     * Initialization constructor.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  company  String value for company.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressCity  String value for addressCity.
     * @param  addressState  String value for addressState.
     * @param  addressZip  String value for addressZip.
     * @param  deleted  Boolean value for deleted.
     * @param  description  String value for description.
     * @param  phone  String value for phone.
     * @param  email  String value for email.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressCountry  AddressCountryEnum value for addressCountry.
     * @param  metadata  Map of String, value for metadata.
     * @param  recipientMoved  Boolean value for recipientMoved.
     */
    public AddressUs(
            LocalDateTime dateCreated,
            LocalDateTime dateModified,
            String object,
            String id,
            String name,
            String company,
            String addressLine1,
            String addressCity,
            String addressState,
            String addressZip,
            Boolean deleted,
            String description,
            String phone,
            String email,
            String addressLine2,
            AddressCountryEnum addressCountry,
            Map<String, String> metadata,
            Boolean recipientMoved) {
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.deleted = deleted;
        this.object = object;
        this.id = id;
        this.description = OptionalNullable.of(description);
        this.name = name;
        this.company = company;
        this.phone = OptionalNullable.of(phone);
        this.email = OptionalNullable.of(email);
        this.addressLine1 = addressLine1;
        this.addressLine2 = OptionalNullable.of(addressLine2);
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
        this.addressCountry = addressCountry;
        this.metadata = metadata;
        this.recipientMoved = OptionalNullable.of(recipientMoved);
    }

    /**
     * Initialization constructor.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  company  String value for company.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressCity  String value for addressCity.
     * @param  addressState  String value for addressState.
     * @param  addressZip  String value for addressZip.
     * @param  deleted  Boolean value for deleted.
     * @param  description  String value for description.
     * @param  phone  String value for phone.
     * @param  email  String value for email.
     * @param  addressLine2  String value for addressLine2.
     * @param  addressCountry  AddressCountryEnum value for addressCountry.
     * @param  metadata  Map of String, value for metadata.
     * @param  recipientMoved  Boolean value for recipientMoved.
     */

    protected AddressUs(LocalDateTime dateCreated, LocalDateTime dateModified, String object,
            String id, String name, String company, String addressLine1, String addressCity,
            String addressState, String addressZip, Boolean deleted,
            OptionalNullable<String> description, OptionalNullable<String> phone,
            OptionalNullable<String> email, OptionalNullable<String> addressLine2,
            AddressCountryEnum addressCountry, Map<String, String> metadata,
            OptionalNullable<Boolean> recipientMoved) {
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.deleted = deleted;
        this.object = object;
        this.id = id;
        this.description = description;
        this.name = name;
        this.company = company;
        this.phone = phone;
        this.email = email;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZip = addressZip;
        this.addressCountry = addressCountry;
        this.metadata = metadata;
        this.recipientMoved = recipientMoved;
    }

    /**
     * Initialization constructor.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  dateModified  LocalDateTime value for dateModified.
     * @param  object  String value for object.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  company  String value for company.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressCity  String value for addressCity.
     * @param  addressState  String value for addressState.
     * @param  addressZip  String value for addressZip.
     */
    @JsonCreator
    protected AddressUs(
            @JsonProperty("date_created") LocalDateTime dateCreated,
            @JsonProperty("date_modified") LocalDateTime dateModified,
            @JsonProperty("object") String object,
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("company") String company,
            @JsonProperty("address_line1") String addressLine1,
            @JsonProperty("address_city") String addressCity,
            @JsonProperty("address_state") String addressState,
            @JsonProperty("address_zip") String addressZip) {
        this(dateCreated, dateModified, object, id, name, company, addressLine1, addressCity,
                addressState, addressZip, null, OptionalNullable.of(null),
                OptionalNullable.of(null), OptionalNullable.of(null), OptionalNullable.of(null),
                null, null, OptionalNullable.of(null));
        unsetDescription();
        unsetPhone();
        unsetEmail();
        unsetAddressLine2();
        unsetRecipientMoved();
    }

    /**
     * Getter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_created")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    /**
     * Setter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @param dateCreated Value for LocalDateTime
     */
    @JsonSetter("date_created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Getter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_modified")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateModified() {
        return dateModified;
    }

    /**
     * Setter for DateModified.
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     * @param dateModified Value for LocalDateTime
     */
    @JsonSetter("date_modified")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * Getter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @return Returns the Boolean
     */
    @JsonGetter("deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * Only returned if the resource has been successfully deleted.
     * @param deleted Value for Boolean
     */
    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Getter for Object.
     * Value is resource type.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * Value is resource type.
     * @param object Value for String
     */
    @JsonSetter("object")
    private void setObject(String object) {
        this.object = object;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `adr_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `adr_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
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
     * Getter for Company.
     * Either `name` or `company` is required, you may also add both. Must be no longer than 40
     * characters. If both `name` and `company` are provided, they will be printed on two separate
     * lines above the rest of the address. This field can be used for any secondary recipient
     * information which is not part of the actual mailing address (Company Name, Department,
     * Attention Line, etc).
     * @return Returns the String
     */
    @JsonGetter("company")
    public String getCompany() {
        return company;
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
        this.company = company;
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
     * Getter for AddressLine1.
     * The primary number, street name, and directional information.
     * @return Returns the String
     */
    @JsonGetter("address_line1")
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
     * An optional field containing any information which can't fit into line 1.
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
     * An optional field containing any information which can't fit into line 1.
     * @return Returns the String
     */
    public String getAddressLine2() {
        return OptionalNullable.getFrom(addressLine2);
    }

    /**
     * Setter for AddressLine2.
     * An optional field containing any information which can't fit into line 1.
     * @param addressLine2 Value for String
     */
    @JsonSetter("address_line2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = OptionalNullable.of(addressLine2);
    }

    /**
     * UnSetter for AddressLine2.
     * An optional field containing any information which can't fit into line 1.
     */
    public void unsetAddressLine2() {
        addressLine2 = null;
    }

    /**
     * Getter for AddressCity.
     * @return Returns the String
     */
    @JsonGetter("address_city")
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
     * Getter for AddressCountry.
     * Full name of country
     * @return Returns the AddressCountryEnum
     */
    @JsonGetter("address_country")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddressCountryEnum getAddressCountry() {
        return addressCountry;
    }

    /**
     * Setter for AddressCountry.
     * Full name of country
     * @param addressCountry Value for AddressCountryEnum
     */
    @JsonSetter("address_country")
    public void setAddressCountry(AddressCountryEnum addressCountry) {
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
     * Internal Getter for RecipientMoved.
     * Only returned for accounts on certain &lt;a href="https://dashboard.lob.com/#/settings/editions"
     * target="_blank"&gt;Print &amp; Mail Editions&lt;/a&gt;. Value is `true` if the address was altered
     * because the recipient filed for a &lt;a href="#tag/National-Change-of-Address"&gt;National Change
     * of Address Linkage (NCOALink)&lt;/a&gt;, `false` if the NCOALink check was run but no altered
     * address was found, and `null` if the NCOALink check was not run. The NCOALink check does not
     * happen for non-US addresses, for non-deliverable US addresses, or for addresses created
     * before the NCOALink feature was added to your account.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("recipient_moved")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetRecipientMoved() {
        return this.recipientMoved;
    }

    /**
     * Getter for RecipientMoved.
     * Only returned for accounts on certain &lt;a href="https://dashboard.lob.com/#/settings/editions"
     * target="_blank"&gt;Print &amp; Mail Editions&lt;/a&gt;. Value is `true` if the address was altered
     * because the recipient filed for a &lt;a href="#tag/National-Change-of-Address"&gt;National Change
     * of Address Linkage (NCOALink)&lt;/a&gt;, `false` if the NCOALink check was run but no altered
     * address was found, and `null` if the NCOALink check was not run. The NCOALink check does not
     * happen for non-US addresses, for non-deliverable US addresses, or for addresses created
     * before the NCOALink feature was added to your account.
     * @return Returns the Boolean
     */
    public Boolean getRecipientMoved() {
        return OptionalNullable.getFrom(recipientMoved);
    }

    /**
     * Setter for RecipientMoved.
     * Only returned for accounts on certain &lt;a href="https://dashboard.lob.com/#/settings/editions"
     * target="_blank"&gt;Print &amp; Mail Editions&lt;/a&gt;. Value is `true` if the address was altered
     * because the recipient filed for a &lt;a href="#tag/National-Change-of-Address"&gt;National Change
     * of Address Linkage (NCOALink)&lt;/a&gt;, `false` if the NCOALink check was run but no altered
     * address was found, and `null` if the NCOALink check was not run. The NCOALink check does not
     * happen for non-US addresses, for non-deliverable US addresses, or for addresses created
     * before the NCOALink feature was added to your account.
     * @param recipientMoved Value for Boolean
     */
    @JsonSetter("recipient_moved")
    public void setRecipientMoved(Boolean recipientMoved) {
        this.recipientMoved = OptionalNullable.of(recipientMoved);
    }

    /**
     * UnSetter for RecipientMoved.
     * Only returned for accounts on certain &lt;a href="https://dashboard.lob.com/#/settings/editions"
     * target="_blank"&gt;Print &amp; Mail Editions&lt;/a&gt;. Value is `true` if the address was altered
     * because the recipient filed for a &lt;a href="#tag/National-Change-of-Address"&gt;National Change
     * of Address Linkage (NCOALink)&lt;/a&gt;, `false` if the NCOALink check was run but no altered
     * address was found, and `null` if the NCOALink check was not run. The NCOALink check does not
     * happen for non-US addresses, for non-deliverable US addresses, or for addresses created
     * before the NCOALink feature was added to your account.
     */
    public void unsetRecipientMoved() {
        recipientMoved = null;
    }

    /**
     * Converts this AddressUs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddressUs [" + "dateCreated=" + dateCreated + ", dateModified=" + dateModified
                + ", object=" + object + ", id=" + id + ", name=" + name + ", company=" + company
                + ", addressLine1=" + addressLine1 + ", addressCity=" + addressCity
                + ", addressState=" + addressState + ", addressZip=" + addressZip + ", deleted="
                + deleted + ", description=" + description + ", phone=" + phone + ", email=" + email
                + ", addressLine2=" + addressLine2 + ", addressCountry=" + addressCountry
                + ", metadata=" + metadata + ", recipientMoved=" + recipientMoved + "]";
    }

    /**
     * Builds a new {@link AddressUs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddressUs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dateCreated, dateModified, object, id, name, company,
                addressLine1, addressCity, addressState, addressZip)
                .deleted(getDeleted())
                .addressCountry(getAddressCountry())
                .metadata(getMetadata());
        builder.description = internalGetDescription();
        builder.phone = internalGetPhone();
        builder.email = internalGetEmail();
        builder.addressLine2 = internalGetAddressLine2();
        builder.recipientMoved = internalGetRecipientMoved();
        return builder;
    }

    /**
     * Class to build instances of {@link AddressUs}.
     */
    public static class Builder {
        private LocalDateTime dateCreated;
        private LocalDateTime dateModified;
        private String object = "address";
        private String id;
        private String name;
        private String company;
        private String addressLine1;
        private String addressCity;
        private String addressState;
        private String addressZip;
        private Boolean deleted;
        private OptionalNullable<String> description;
        private OptionalNullable<String> phone;
        private OptionalNullable<String> email;
        private OptionalNullable<String> addressLine2;
        private AddressCountryEnum addressCountry;
        private Map<String, String> metadata;
        private OptionalNullable<Boolean> recipientMoved;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @param  object  String value for object.
         * @param  id  String value for id.
         * @param  name  String value for name.
         * @param  company  String value for company.
         * @param  addressLine1  String value for addressLine1.
         * @param  addressCity  String value for addressCity.
         * @param  addressState  String value for addressState.
         * @param  addressZip  String value for addressZip.
         */
        public Builder(LocalDateTime dateCreated, LocalDateTime dateModified, String object,
                String id, String name, String company, String addressLine1, String addressCity,
                String addressState, String addressZip) {
            this.dateCreated = dateCreated;
            this.dateModified = dateModified;
            this.object = object;
            this.id = id;
            this.name = name;
            this.company = company;
            this.addressLine1 = addressLine1;
            this.addressCity = addressCity;
            this.addressState = addressState;
            this.addressZip = addressZip;
        }

        /**
         * Setter for dateCreated.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @return Builder
         */
        public Builder dateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * Setter for dateModified.
         * @param  dateModified  LocalDateTime value for dateModified.
         * @return Builder
         */
        public Builder dateModified(LocalDateTime dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
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
         * Setter for company.
         * @param  company  String value for company.
         * @return Builder
         */
        public Builder company(String company) {
            this.company = company;
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
         * Setter for deleted.
         * @param  deleted  Boolean value for deleted.
         * @return Builder
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
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
         * Setter for addressCountry.
         * @param  addressCountry  AddressCountryEnum value for addressCountry.
         * @return Builder
         */
        public Builder addressCountry(AddressCountryEnum addressCountry) {
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
         * Setter for recipientMoved.
         * @param  recipientMoved  Boolean value for recipientMoved.
         * @return Builder
         */
        public Builder recipientMoved(Boolean recipientMoved) {
            this.recipientMoved = OptionalNullable.of(recipientMoved);
            return this;
        }

        /**
         * UnSetter for recipientMoved.
         * @return Builder
         */
        public Builder unsetRecipientMoved() {
            recipientMoved = null;
            return this;
        }

        /**
         * Builds a new {@link AddressUs} object using the set fields.
         * @return {@link AddressUs}
         */
        public AddressUs build() {
            return new AddressUs(dateCreated, dateModified, object, id, name, company, addressLine1,
                    addressCity, addressState, addressZip, deleted, description, phone, email,
                    addressLine2, addressCountry, metadata, recipientMoved);
        }
    }
}
