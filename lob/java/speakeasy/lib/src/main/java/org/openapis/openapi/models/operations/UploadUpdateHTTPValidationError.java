/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UploadUpdateHTTPValidationError - Validation Error
 */

public class UploadUpdateHTTPValidationError {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("detail")
    public UploadUpdateValidationError[] detail;

    public UploadUpdateHTTPValidationError withDetail(UploadUpdateValidationError[] detail) {
        this.detail = detail;
        return this;
    }
    
    public UploadUpdateHTTPValidationError(){}
}