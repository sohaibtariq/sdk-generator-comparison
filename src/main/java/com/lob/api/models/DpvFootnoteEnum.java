/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * DpvFootnoteEnum to be used.
 */
public enum DpvFootnoteEnum {
    AA,

    A1,

    BB,

    CC,

    N1,

    F1,

    G1,

    U1,

    M1,

    M3,

    P1,

    P3,

    R1,

    R7,

    RR;


    private static TreeMap<String, DpvFootnoteEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        AA.value = "AA";
        A1.value = "A1";
        BB.value = "BB";
        CC.value = "CC";
        N1.value = "N1";
        F1.value = "F1";
        G1.value = "G1";
        U1.value = "U1";
        M1.value = "M1";
        M3.value = "M3";
        P1.value = "P1";
        P3.value = "P3";
        R1.value = "R1";
        R7.value = "R7";
        RR.value = "RR";

        valueMap.put("AA", AA);
        valueMap.put("A1", A1);
        valueMap.put("BB", BB);
        valueMap.put("CC", CC);
        valueMap.put("N1", N1);
        valueMap.put("F1", F1);
        valueMap.put("G1", G1);
        valueMap.put("U1", U1);
        valueMap.put("M1", M1);
        valueMap.put("M3", M3);
        valueMap.put("P1", P1);
        valueMap.put("P3", P3);
        valueMap.put("R1", R1);
        valueMap.put("R7", R7);
        valueMap.put("RR", RR);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DpvFootnoteEnum constructFromString(String toConvert) throws IOException {
        DpvFootnoteEnum enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static DpvFootnoteEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of DpvFootnoteEnum values to list of string values.
     * @param toConvert The list of DpvFootnoteEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DpvFootnoteEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DpvFootnoteEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 