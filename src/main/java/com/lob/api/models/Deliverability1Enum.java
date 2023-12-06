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
 * Deliverability1Enum to be used.
 */
public enum Deliverability1Enum {
    DELIVERABLE,

    DELIVERABLE_MISSING_INFO,

    UNDELIVERABLE,

    NO_MATCH;


    private static TreeMap<String, Deliverability1Enum> valueMap = new TreeMap<>();
    private String value;

    static {
        DELIVERABLE.value = "deliverable";
        DELIVERABLE_MISSING_INFO.value = "deliverable_missing_info";
        UNDELIVERABLE.value = "undeliverable";
        NO_MATCH.value = "no_match";

        valueMap.put("deliverable", DELIVERABLE);
        valueMap.put("deliverable_missing_info", DELIVERABLE_MISSING_INFO);
        valueMap.put("undeliverable", UNDELIVERABLE);
        valueMap.put("no_match", NO_MATCH);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Deliverability1Enum constructFromString(String toConvert) throws IOException {
        Deliverability1Enum enumValue = fromString(toConvert);
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
    public static Deliverability1Enum fromString(String toConvert) {
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
     * Convert list of Deliverability1Enum values to list of string values.
     * @param toConvert The list of Deliverability1Enum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Deliverability1Enum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Deliverability1Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 