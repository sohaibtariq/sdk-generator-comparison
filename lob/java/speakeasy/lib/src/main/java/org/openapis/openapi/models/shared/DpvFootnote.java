/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DpvFootnote {
    AA("AA"),
    A1("A1"),
    BB("BB"),
    CC("CC"),
    N1("N1"),
    F1("F1"),
    G1("G1"),
    U1("U1"),
    M1("M1"),
    M3("M3"),
    P1("P1"),
    P3("P3"),
    R1("R1"),
    R7("R7"),
    RR("RR");

    @JsonValue
    public final String value;

    private DpvFootnote(String value) {
        this.value = value;
    }
}