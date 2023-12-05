/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapis.openapi.utils.SpeakeasyMetadata;


public class BankAccountRetrieveRequest {
    /**
     * id of the bank account
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bank_id")
    public String bankId;

    public BankAccountRetrieveRequest withBankId(String bankId) {
        this.bankId = bankId;
        return this;
    }
    
    public BankAccountRetrieveRequest(@JsonProperty("bank_id") String bankId) {
        this.bankId = bankId;
  }
}
