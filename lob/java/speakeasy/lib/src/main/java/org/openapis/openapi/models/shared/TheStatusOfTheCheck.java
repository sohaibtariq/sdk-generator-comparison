/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TheStatusOfTheCheck {
    PROCESSED("processed"),
    RENDERED("rendered"),
    FAILED("failed");

    @JsonValue
    public final String value;

    private TheStatusOfTheCheck(String value) {
        this.value = value;
    }
}
