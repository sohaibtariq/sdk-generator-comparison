/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CardObject - object
 */
public enum CardObject {
    CARD("card");

    @JsonValue
    public final String value;

    private CardObject(String value) {
        this.value = value;
    }
}