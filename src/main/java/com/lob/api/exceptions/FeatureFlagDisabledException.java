/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for FeatureFlagDisabledException type.
 */
public class FeatureFlagDisabledException extends ApiException {
    private static final long serialVersionUID = -5095014570835168860L;
    private Double code;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public FeatureFlagDisabledException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Code.
     * The error code
     * @return Returns the Double
     */
    @JsonGetter("code")
    public Double getCode() {
        return this.code;
    }

    /**
     * Setter for Code.
     * The error code
     * @param code Value for Double
     */
    @JsonSetter("code")
    private void setCode(Double code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * Details of the error message with the feature flagged mentioned.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Details of the error message with the feature flagged mentioned.
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }
}
