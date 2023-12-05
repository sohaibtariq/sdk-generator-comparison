/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Engine - The engine used to combine HTML template with merge variables.
 *   * `legacy` - Lob's original engine
 *   * `handlebars`
 * 
 */
public enum Engine {
    LEGACY("legacy"),
    HANDLEBARS("handlebars");

    @JsonValue
    public final String value;

    private Engine(String value) {
        this.value = value;
    }
}
