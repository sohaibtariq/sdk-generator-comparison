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
 * Status1Enum to be used.
 */
public enum Status1Enum {
    LV4,

    LV3,

    LV2,

    LV1,

    LF4,

    LF3,

    LF2,

    LF1,

    LM4,

    LM3,

    LM2,

    LU1;


    private static TreeMap<String, Status1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        LV4.value = "LV4";
        LV3.value = "LV3";
        LV2.value = "LV2";
        LV1.value = "LV1";
        LF4.value = "LF4";
        LF3.value = "LF3";
        LF2.value = "LF2";
        LF1.value = "LF1";
        LM4.value = "LM4";
        LM3.value = "LM3";
        LM2.value = "LM2";
        LU1.value = "LU1";

        valueMap.put("LV4", LV4);
        valueMap.put("LV3", LV3);
        valueMap.put("LV2", LV2);
        valueMap.put("LV1", LV1);
        valueMap.put("LF4", LF4);
        valueMap.put("LF3", LF3);
        valueMap.put("LF2", LF2);
        valueMap.put("LF1", LF1);
        valueMap.put("LM4", LM4);
        valueMap.put("LM3", LM3);
        valueMap.put("LM2", LM2);
        valueMap.put("LU1", LU1);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Status1Enum constructFromString(String toConvert) throws IOException {
        Status1Enum enumValue = fromString(toConvert);
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
    public static Status1Enum fromString(String toConvert) {
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
     * Convert list of Status1Enum values to list of string values.
     * @param toConvert The list of Status1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Status1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Status1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 