/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ReportRetrieveData {
    /**
     * The row number of the csv file containing this data.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rowNumber")
    public Double rowNumber;

    public ReportRetrieveData withRowNumber(Double rowNumber) {
        this.rowNumber = rowNumber;
        return this;
    }
    
    /**
     * The processing status of line item.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public ReportRetrieveStatus status;

    public ReportRetrieveData withStatus(ReportRetrieveStatus status) {
        this.status = status;
        return this;
    }
    
    /**
     * The error message detailing the reason why processing the line item failed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errorMessage")
    public String errorMessage;

    public ReportRetrieveData withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    
    /**
     * The mailpiece id created from the line item when it was validated.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mailpieceId")
    public String mailpieceId;

    public ReportRetrieveData withMailpieceId(String mailpieceId) {
        this.mailpieceId = mailpieceId;
        return this;
    }
    
    /**
     * Key-value pairs where each key is the column header and each value is the value of the column for the row.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("originalData")
    public OriginalData originalData;

    public ReportRetrieveData withOriginalData(OriginalData originalData) {
        this.originalData = originalData;
        return this;
    }
    
    public ReportRetrieveData(){}
}
