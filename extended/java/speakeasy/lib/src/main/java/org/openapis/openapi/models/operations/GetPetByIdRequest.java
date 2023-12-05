/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class GetPetByIdRequest {
    /**
     * ID of pet to return
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=petId")
    public Long petId;

    public GetPetByIdRequest withPetId(Long petId) {
        this.petId = petId;
        return this;
    }
    
    public GetPetByIdRequest(@JsonProperty("petId") Long petId) {
        this.petId = petId;
  }
}