/*
 * PetstoreLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.quickmocker.api.src8wr32cg.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Pet type.
 */
public class Pet {
    private long id;
    private String name;
    private PetPetTypeEnum petType;

    /**
     * Default constructor.
     */
    public Pet() {
    }

    /**
     * Initialization constructor.
     * @param  id  long value for id.
     * @param  name  String value for name.
     * @param  petType  PetPetTypeEnum value for petType.
     */
    public Pet(
            long id,
            String name,
            PetPetTypeEnum petType) {
        this.id = id;
        this.name = name;
        this.petType = petType;
    }

    /**
     * Getter for Id.
     * a unique identifier for a Pet
     * @return Returns the long
     */
    @JsonGetter("id")
    public long getId() {
        return id;
    }

    /**
     * Setter for Id.
     * a unique identifier for a Pet
     * @param id Value for long
     */
    @JsonSetter("id")
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Getter for Name.
     * the name lovingly given to the pet
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * the name lovingly given to the pet
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for PetType.
     * the type of pets allowed
     * @return Returns the PetPetTypeEnum
     */
    @JsonGetter("petType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PetPetTypeEnum getPetType() {
        return petType;
    }

    /**
     * Setter for PetType.
     * the type of pets allowed
     * @param petType Value for PetPetTypeEnum
     */
    @JsonSetter("petType")
    public void setPetType(PetPetTypeEnum petType) {
        this.petType = petType;
    }

    /**
     * Converts this Pet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Pet [" + "id=" + id + ", name=" + name + ", petType=" + petType + "]";
    }

    /**
     * Builds a new {@link Pet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Pet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, name)
                .petType(getPetType());
        return builder;
    }

    /**
     * Class to build instances of {@link Pet}.
     */
    public static class Builder {
        private long id;
        private String name;
        private PetPetTypeEnum petType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  long value for id.
         * @param  name  String value for name.
         */
        public Builder(long id, String name) {
            this.id = id;
            this.name = name;
        }

        /**
         * Setter for id.
         * @param  id  long value for id.
         * @return Builder
         */
        public Builder id(long id) {
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
         * Setter for petType.
         * @param  petType  PetPetTypeEnum value for petType.
         * @return Builder
         */
        public Builder petType(PetPetTypeEnum petType) {
            this.petType = petType;
            return this;
        }

        /**
         * Builds a new {@link Pet} object using the set fields.
         * @return {@link Pet}
         */
        public Pet build() {
            return new Pet(id, name, petType);
        }
    }
}
