/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UploadFile {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public Message message;

    public UploadFile withMessage(Message message) {
        this.message = message;
        return this;
    }
    
    @JsonProperty("filename")
    public String filename;

    public UploadFile withFilename(String filename) {
        this.filename = filename;
        return this;
    }
    
    public UploadFile(@JsonProperty("filename") String filename) {
        this.filename = filename;
  }
}