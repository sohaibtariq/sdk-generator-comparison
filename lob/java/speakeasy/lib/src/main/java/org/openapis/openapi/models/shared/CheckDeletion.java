/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CheckDeletion - Lob uses RESTful HTTP response codes to indicate success or failure of an API request. In general, 2xx indicates success, 4xx indicate an input error, and 5xx indicates an error on Lob's end.
 */

public class CheckDeletion {
    /**
     * Unique identifier prefixed with `chk_`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public CheckDeletion withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Only returned if the resource has been successfully deleted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public Boolean deleted;

    public CheckDeletion withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    public CheckDeletion(){}
}