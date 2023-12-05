/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class File {
    @SpeakeasyMetadata("multipartForm:name=file")
    public String fileName;

    public File withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    
    @SpeakeasyMetadata("multipartForm:content")
    public byte[] content;

    public File withContent(byte[] content) {
        this.content = content;
        return this;
    }
    
    public File(@JsonProperty("fileName") String fileName, @JsonProperty("content") byte[] content) {
        this.fileName = fileName;
        this.content = content;
  }
}
