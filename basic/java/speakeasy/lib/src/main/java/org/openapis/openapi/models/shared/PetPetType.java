/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PetPetType - the type of pets allowed
 */
public enum PetPetType {
    DOG("dog"),
    CAT("cat");

    @JsonValue
    public final String value;

    private PetPetType(String value) {
        this.value = value;
    }
}
