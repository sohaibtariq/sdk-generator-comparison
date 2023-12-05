/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;


public class UploadFileRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public File file;

    public UploadFileRequestBody withFile(File file) {
        this.file = file;
        return this;
    }
    
    public UploadFileRequestBody(){}
}