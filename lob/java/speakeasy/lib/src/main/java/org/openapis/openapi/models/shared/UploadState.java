/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UploadState - The `state` property on the `upload` object. As the file is processed, the `state` will change from `Ready for Validation` to `Validating` and then will be either `Scheduled` (successfully processed) or `Errored` (Unsuccessfully processed).
 */
public enum UploadState {
    PREPROCESSING("Preprocessing"),
    DRAFT("Draft"),
    READY_FOR_VALIDATION("Ready for Validation"),
    VALIDATING("Validating"),
    SCHEDULED("Scheduled"),
    CANCELLED("Cancelled"),
    ERRORED("Errored");

    @JsonValue
    public final String value;

    private UploadState(String value) {
        this.value = value;
    }
}
