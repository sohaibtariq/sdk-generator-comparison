/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class UploadCreateResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public UploadCreateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public UploadCreateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public UploadCreateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Upload created successfully
     */
    
    public org.openapis.openapi.models.shared.Upload upload;

    public UploadCreateResponse withUpload(org.openapis.openapi.models.shared.Upload upload) {
        this.upload = upload;
        return this;
    }
    
    /**
     * Validation Error
     */
    
    public UploadCreateHTTPValidationError httpValidationError;

    public UploadCreateResponse withHTTPValidationError(UploadCreateHTTPValidationError httpValidationError) {
        this.httpValidationError = httpValidationError;
        return this;
    }
    
    public UploadCreateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}