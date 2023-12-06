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
import com.lob.api.models.containers.CardEditableBack;
import com.lob.api.models.containers.CardEditableFront;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for CardEditable type.
 */
public class CardEditable {
    private OptionalNullable<String> description;
    private Size1Enum size;
    private CardEditableFront front;
    private CardEditableBack back;

    /**
     * Default constructor.
     */
    public CardEditable() {
        size = Size1Enum.ENUM_2125X3375;
    }

    /**
     * Initialization constructor.
     * @param  front  CardEditableFront value for front.
     * @param  description  String value for description.
     * @param  size  Size1Enum value for size.
     * @param  back  CardEditableBack value for back.
     */
    public CardEditable(
            CardEditableFront front,
            String description,
            Size1Enum size,
            CardEditableBack back) {
        this.description = OptionalNullable.of(description);
        this.size = size;
        this.front = front;
        this.back = back;
    }

    /**
     * Initialization constructor.
     * @param  front  CardEditableFront value for front.
     * @param  description  String value for description.
     * @param  size  Size1Enum value for size.
     * @param  back  CardEditableBack value for back.
     */

    protected CardEditable(CardEditableFront front, OptionalNullable<String> description,
            Size1Enum size, CardEditableBack back) {
        this.description = description;
        this.size = size;
        this.front = front;
        this.back = back;
    }

    /**
     * Internal Getter for Description.
     * Description of the card.
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
     * Description of the card.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * Description of the card.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * Description of the card.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Size.
     * The size of the card
     * @return Returns the Size1Enum
     */
    @JsonGetter("size")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Size1Enum getSize() {
        return size;
    }

    /**
     * Setter for Size.
     * The size of the card
     * @param size Value for Size1Enum
     */
    @JsonSetter("size")
    public void setSize(Size1Enum size) {
        this.size = size;
    }

    /**
     * Getter for Front.
     * A PDF template for the front of the card
     * @return Returns the CardEditableFront
     */
    @JsonGetter("front")
    public CardEditableFront getFront() {
        return front;
    }

    /**
     * Setter for Front.
     * A PDF template for the front of the card
     * @param front Value for CardEditableFront
     */
    @JsonSetter("front")
    public void setFront(CardEditableFront front) {
        this.front = front;
    }

    /**
     * Getter for Back.
     * A PDF template for the back of the card
     * @return Returns the CardEditableBack
     */
    @JsonGetter("back")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardEditableBack getBack() {
        return back;
    }

    /**
     * Setter for Back.
     * A PDF template for the back of the card
     * @param back Value for CardEditableBack
     */
    @JsonSetter("back")
    public void setBack(CardEditableBack back) {
        this.back = back;
    }

    /**
     * Converts this CardEditable into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardEditable [" + "front=" + front + ", description=" + description + ", size="
                + size + ", back=" + back + "]";
    }

    /**
     * Builds a new {@link CardEditable.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardEditable.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(front)
                .size(getSize())
                .back(getBack());
        builder.description = internalGetDescription();
        return builder;
    }

    /**
     * Class to build instances of {@link CardEditable}.
     */
    public static class Builder {
        private CardEditableFront front;
        private OptionalNullable<String> description;
        private Size1Enum size = Size1Enum.ENUM_2125X3375;
        private CardEditableBack back;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  front  CardEditableFront value for front.
         */
        public Builder(CardEditableFront front) {
            this.front = front;
        }

        /**
         * Setter for front.
         * @param  front  CardEditableFront value for front.
         * @return Builder
         */
        public Builder front(CardEditableFront front) {
            this.front = front;
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
         * Setter for size.
         * @param  size  Size1Enum value for size.
         * @return Builder
         */
        public Builder size(Size1Enum size) {
            this.size = size;
            return this;
        }

        /**
         * Setter for back.
         * @param  back  CardEditableBack value for back.
         * @return Builder
         */
        public Builder back(CardEditableBack back) {
            this.back = back;
            return this;
        }

        /**
         * Builds a new {@link CardEditable} object using the set fields.
         * @return {@link CardEditable}
         */
        public CardEditable build() {
            return new CardEditable(front, description, size, back);
        }
    }
}
