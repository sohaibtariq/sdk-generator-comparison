/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status - The status of the buckslip order.
 */
public enum Status {
    PENDING("pending"),
    PRINTING("printing"),
    AVAILABLE("available"),
    CANCELLED("cancelled"),
    DEPLETED("depleted");

    @JsonValue
    public final String value;

    private Status(String value) {
        this.value = value;
    }
}
