/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pet - A single Pet object
 */

public class Pet {
    /**
     * a unique identifier for a Pet
     */
    @JsonProperty("id")
    public Long id;

    public Pet withId(Long id) {
        this.id = id;
        return this;
    }
    
    /**
     * the name lovingly given to the pet
     */
    @JsonProperty("name")
    public String name;

    public Pet withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * the type of pets allowed
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("petType")
    public PetPetType petType;

    public Pet withPetType(PetPetType petType) {
        this.petType = petType;
        return this;
    }
    
    public Pet(@JsonProperty("id") Long id, @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
  }
}