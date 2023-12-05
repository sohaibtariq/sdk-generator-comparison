/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SelfMailerSize - Specifies the size of the self mailer. The `17.75x9_trifold` size is in beta. Contact support@lob.com or your account contact to learn more.
 */
public enum SelfMailerSize {
    SIXX18_BIFOLD("6x18_bifold"),
    ELEVENX9_BIFOLD("11x9_bifold"),
    TWELVEX9_BIFOLD("12x9_bifold"),
    SEVENTEEN75X9_TRIFOLD("17.75x9_trifold");

    @JsonValue
    public final String value;

    private SelfMailerSize(String value) {
        this.value = value;
    }
}