/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for SortBy type.
 */
public class SortBy {
    private DateCreatedEnum dateCreated;
    private DateModifiedEnum dateModified;

    /**
     * Default constructor.
     */
    public SortBy() {
    }

    /**
     * Initialization constructor.
     * @param  dateCreated  DateCreatedEnum value for dateCreated.
     * @param  dateModified  DateModifiedEnum value for dateModified.
     */
    public SortBy(
            DateCreatedEnum dateCreated,
            DateModifiedEnum dateModified) {
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    /**
     * Getter for DateCreated.
     * @return Returns the DateCreatedEnum
     */
    @JsonGetter("date_created")
    public DateCreatedEnum getDateCreated() {
        return dateCreated;
    }

    /**
     * Setter for DateCreated.
     * @param dateCreated Value for DateCreatedEnum
     */
    @JsonSetter("date_created")
    public void setDateCreated(DateCreatedEnum dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Getter for DateModified.
     * @return Returns the DateModifiedEnum
     */
    @JsonGetter("date_modified")
    public DateModifiedEnum getDateModified() {
        return dateModified;
    }

    /**
     * Setter for DateModified.
     * @param dateModified Value for DateModifiedEnum
     */
    @JsonSetter("date_modified")
    public void setDateModified(DateModifiedEnum dateModified) {
        this.dateModified = dateModified;
    }

    /**
     * Converts this SortBy into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SortBy [" + "dateCreated=" + dateCreated + ", dateModified=" + dateModified + "]";
    }

    /**
     * Builds a new {@link SortBy.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SortBy.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(dateCreated, dateModified);
        return builder;
    }

    /**
     * Class to build instances of {@link SortBy}.
     */
    public static class Builder {
        private DateCreatedEnum dateCreated;
        private DateModifiedEnum dateModified;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  dateCreated  DateCreatedEnum value for dateCreated.
         * @param  dateModified  DateModifiedEnum value for dateModified.
         */
        public Builder(DateCreatedEnum dateCreated, DateModifiedEnum dateModified) {
            this.dateCreated = dateCreated;
            this.dateModified = dateModified;
        }

        /**
         * Setter for dateCreated.
         * @param  dateCreated  DateCreatedEnum value for dateCreated.
         * @return Builder
         */
        public Builder dateCreated(DateCreatedEnum dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * Setter for dateModified.
         * @param  dateModified  DateModifiedEnum value for dateModified.
         * @return Builder
         */
        public Builder dateModified(DateModifiedEnum dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        /**
         * Builds a new {@link SortBy} object using the set fields.
         * @return {@link SortBy}
         */
        public SortBy build() {
            return new SortBy(dateCreated, dateModified);
        }
    }
}
