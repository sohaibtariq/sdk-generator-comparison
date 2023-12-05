/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class UsVerificationRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public Object requestBody;

    public UsVerificationRequest withRequestBody(Object requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=case")
    public UsVerificationQueryParamCase case_;

    public UsVerificationRequest withCase(UsVerificationQueryParamCase case_) {
        this.case_ = case_;
        return this;
    }
    
    public UsVerificationRequest(@JsonProperty("RequestBody") Object requestBody) {
        this.requestBody = requestBody;
  }
}