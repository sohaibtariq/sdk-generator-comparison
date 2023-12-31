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
 * This is a model class for Metadata type.
 */
public class Metadata {
    private List<String> columns;

    /**
     * Default constructor.
     */
    public Metadata() {
    }

    /**
     * Initialization constructor.
     * @param  columns  List of String value for columns.
     */
    public Metadata(
            List<String> columns) {
        this.columns = columns;
    }

    /**
     * Getter for Columns.
     * The list of column names from the csv file which you want associated with each of your
     * mailpieces
     * @return Returns the List of String
     */
    @JsonGetter("columns")
    public List<String> getColumns() {
        return columns;
    }

    /**
     * Setter for Columns.
     * The list of column names from the csv file which you want associated with each of your
     * mailpieces
     * @param columns Value for List of String
     */
    @JsonSetter("columns")
    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    /**
     * Converts this Metadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Metadata [" + "columns=" + columns + "]";
    }

    /**
     * Builds a new {@link Metadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Metadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(columns);
        return builder;
    }

    /**
     * Class to build instances of {@link Metadata}.
     */
    public static class Builder {
        private List<String> columns;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  columns  List of String value for columns.
         */
        public Builder(List<String> columns) {
            this.columns = columns;
        }

        /**
         * Setter for columns.
         * @param  columns  List of String value for columns.
         * @return Builder
         */
        public Builder columns(List<String> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * Builds a new {@link Metadata} object using the set fields.
         * @return {@link Metadata}
         */
        public Metadata build() {
            return new Metadata(columns);
        }
    }
}
