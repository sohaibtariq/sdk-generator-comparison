/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class ShowPetByIdRequest {
    /**
     * The id of the pet to retrieve
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=petId")
    public String petId;

    public ShowPetByIdRequest withPetId(String petId) {
        this.petId = petId;
        return this;
    }
    
    public ShowPetByIdRequest(@JsonProperty("petId") String petId) {
        this.petId = petId;
  }
}
