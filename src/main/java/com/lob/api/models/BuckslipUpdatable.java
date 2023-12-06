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

/**
 * This is a model class for BuckslipUpdatable type.
 */
public class BuckslipUpdatable {
    private OptionalNullable<String> description;
    private Boolean autoReorder;
    private Double reorderQuantity;

    /**
     * Default constructor.
     */
    public BuckslipUpdatable() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  autoReorder  Boolean value for autoReorder.
     * @param  reorderQuantity  Double value for reorderQuantity.
     */
    public BuckslipUpdatable(
            String description,
            Boolean autoReorder,
            Double reorderQuantity) {
        this.description = OptionalNullable.of(description);
        this.autoReorder = autoReorder;
        this.reorderQuantity = reorderQuantity;
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  autoReorder  Boolean value for autoReorder.
     * @param  reorderQuantity  Double value for reorderQuantity.
     */

    protected BuckslipUpdatable(OptionalNullable<String> description, Boolean autoReorder,
            Double reorderQuantity) {
        this.description = description;
        this.autoReorder = autoReorder;
        this.reorderQuantity = reorderQuantity;
    }

    /**
     * Internal Getter for Description.
     * Description of the buckslip.
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
     * Description of the buckslip.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * Description of the buckslip.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * Description of the buckslip.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for AutoReorder.
     * Allows for auto reordering
     * @return Returns the Boolean
     */
    @JsonGetter("auto_reorder")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAutoReorder() {
        return autoReorder;
    }

    /**
     * Setter for AutoReorder.
     * Allows for auto reordering
     * @param autoReorder Value for Boolean
     */
    @JsonSetter("auto_reorder")
    public void setAutoReorder(Boolean autoReorder) {
        this.autoReorder = autoReorder;
    }

    /**
     * Getter for ReorderQuantity.
     * The quantity of items to be reordered (only required when auto_reorder is true).
     * @return Returns the Double
     */
    @JsonGetter("reorder_quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getReorderQuantity() {
        return reorderQuantity;
    }

    /**
     * Setter for ReorderQuantity.
     * The quantity of items to be reordered (only required when auto_reorder is true).
     * @param reorderQuantity Value for Double
     */
    @JsonSetter("reorder_quantity")
    public void setReorderQuantity(Double reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    /**
     * Converts this BuckslipUpdatable into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BuckslipUpdatable [" + "description=" + description + ", autoReorder=" + autoReorder
                + ", reorderQuantity=" + reorderQuantity + "]";
    }

    /**
     * Builds a new {@link BuckslipUpdatable.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BuckslipUpdatable.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .autoReorder(getAutoReorder())
                .reorderQuantity(getReorderQuantity());
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link BuckslipUpdatable}.
     */
    public static class Builder {
        private OptionalNullable<String> description;
        private Boolean autoReorder;
        private Double reorderQuantity;



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
         * Setter for autoReorder.
         * @param  autoReorder  Boolean value for autoReorder.
         * @return Builder
         */
        public Builder autoReorder(Boolean autoReorder) {
            this.autoReorder = autoReorder;
            return this;
        }

        /**
         * Setter for reorderQuantity.
         * @param  reorderQuantity  Double value for reorderQuantity.
         * @return Builder
         */
        public Builder reorderQuantity(Double reorderQuantity) {
            this.reorderQuantity = reorderQuantity;
            return this;
        }

        /**
         * Builds a new {@link BuckslipUpdatable} object using the set fields.
         * @return {@link BuckslipUpdatable}
         */
        public BuckslipUpdatable build() {
            return new BuckslipUpdatable(description, autoReorder, reorderQuantity);
        }
    }
}
