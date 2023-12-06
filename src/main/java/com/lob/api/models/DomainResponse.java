/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for DomainResponse type.
 */
public class DomainResponse {
    private String id;
    private String domain;
    private String accountId;

    /**
     * Default constructor.
     */
    public DomainResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  domain  String value for domain.
     * @param  accountId  String value for accountId.
     */
    public DomainResponse(
            String id,
            String domain,
            String accountId) {
        this.id = id;
        this.domain = domain;
        this.accountId = accountId;
    }

    /**
     * Getter for Id.
     * Unique identifier for a domain.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier for a domain.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Domain.
     * The registered domain/hostname.
     * @return Returns the String
     */
    @JsonGetter("domain")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDomain() {
        return domain;
    }

    /**
     * Setter for Domain.
     * The registered domain/hostname.
     * @param domain Value for String
     */
    @JsonSetter("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * Getter for AccountId.
     * Unique identifier associated with the account the domain is registered for.
     * @return Returns the String
     */
    @JsonGetter("account_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountId() {
        return accountId;
    }

    /**
     * Setter for AccountId.
     * Unique identifier associated with the account the domain is registered for.
     * @param accountId Value for String
     */
    @JsonSetter("account_id")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Converts this DomainResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DomainResponse [" + "id=" + id + ", domain=" + domain + ", accountId=" + accountId
                + "]";
    }

    /**
     * Builds a new {@link DomainResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DomainResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .domain(getDomain())
                .accountId(getAccountId());
        return builder;
    }

    /**
     * Class to build instances of {@link DomainResponse}.
     */
    public static class Builder {
        private String id;
        private String domain;
        private String accountId;



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
         * Setter for domain.
         * @param  domain  String value for domain.
         * @return Builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Setter for accountId.
         * @param  accountId  String value for accountId.
         * @return Builder
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Builds a new {@link DomainResponse} object using the set fields.
         * @return {@link DomainResponse}
         */
        public DomainResponse build() {
            return new DomainResponse(id, domain, accountId);
        }
    }
}