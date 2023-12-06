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
 * CaseEnum to be used.
 */
public enum CaseEnum {
    UPPER,

    PROPER;


    private static TreeMap<String, CaseEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        UPPER.value = "upper";
        PROPER.value = "proper";

        valueMap.put("upper", UPPER);
        valueMap.put("proper", PROPER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CaseEnum constructFromString(String toConvert) throws IOException {
        CaseEnum enumValue = fromString(toConvert);
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
    public static CaseEnum fromString(String toConvert) {
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
     * Convert list of CaseEnum values to list of string values.
     * @param toConvert The list of CaseEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CaseEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CaseEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 