/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TheStockOfTheBuckslip {
    TEXT("text"),
    COVER("cover");

    @JsonValue
    public final String value;

    private TheStockOfTheBuckslip(String value) {
        this.value = value;
    }
}
