/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class BulkUsVerificationsRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public org.openapis.openapi.models.shared.MultipleComponentsList multipleComponentsList;

    public BulkUsVerificationsRequest withMultipleComponentsList(org.openapis.openapi.models.shared.MultipleComponentsList multipleComponentsList) {
        this.multipleComponentsList = multipleComponentsList;
        return this;
    }
    
    /**
     * Casing of the verified address. Possible values are `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"), respectively. Only affects `recipient`, `primary_line`, `secondary_line`, `urbanization`, and `last_line`. Default casing is `upper`.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=case")
    public Case case_;

    public BulkUsVerificationsRequest withCase(Case case_) {
        this.case_ = case_;
        return this;
    }
    
    public BulkUsVerificationsRequest(@JsonProperty("multiple_components_list") org.openapis.openapi.models.shared.MultipleComponentsList multipleComponentsList) {
        this.multipleComponentsList = multipleComponentsList;
  }
}
