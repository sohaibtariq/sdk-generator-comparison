/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class SelfMailerRetrieveResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public SelfMailerRetrieveResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public SelfMailerRetrieveResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public SelfMailerRetrieveResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Returns a self_mailer object
     */
    
    public org.openapis.openapi.models.shared.SelfMailer selfMailer;

    public SelfMailerRetrieveResponse withSelfMailer(org.openapis.openapi.models.shared.SelfMailer selfMailer) {
        this.selfMailer = selfMailer;
        return this;
    }
    
    public SelfMailerRetrieveResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}