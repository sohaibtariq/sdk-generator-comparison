/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * TrackingEventCertifiedType - a Certified letter tracking event
 */
public enum TrackingEventCertifiedType {
    CERTIFIED("certified");

    @JsonValue
    public final String value;

    private TrackingEventCertifiedType(String value) {
        this.value = value;
    }
}