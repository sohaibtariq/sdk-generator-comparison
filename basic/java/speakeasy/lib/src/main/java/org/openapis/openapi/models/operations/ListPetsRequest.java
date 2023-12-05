/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.SpeakeasyMetadata;


public class ListPetsRequest {
    /**
     * limit the number of objects returned to max 100
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public ListPetsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    public ListPetsRequest(){}
}
