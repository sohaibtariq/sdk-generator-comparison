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
 * DeliverabilityEnum to be used.
 */
public enum DeliverabilityEnum {
    DELIVERABLE,

    DELIVERABLE_UNNECESSARY_UNIT,

    DELIVERABLE_INCORRECT_UNIT,

    DELIVERABLE_MISSING_UNIT,

    UNDELIVERABLE;


    private static TreeMap<String, DeliverabilityEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        DELIVERABLE.value = "deliverable";
        DELIVERABLE_UNNECESSARY_UNIT.value = "deliverable_unnecessary_unit";
        DELIVERABLE_INCORRECT_UNIT.value = "deliverable_incorrect_unit";
        DELIVERABLE_MISSING_UNIT.value = "deliverable_missing_unit";
        UNDELIVERABLE.value = "undeliverable";

        valueMap.put("deliverable", DELIVERABLE);
        valueMap.put("deliverable_unnecessary_unit", DELIVERABLE_UNNECESSARY_UNIT);
        valueMap.put("deliverable_incorrect_unit", DELIVERABLE_INCORRECT_UNIT);
        valueMap.put("deliverable_missing_unit", DELIVERABLE_MISSING_UNIT);
        valueMap.put("undeliverable", UNDELIVERABLE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DeliverabilityEnum constructFromString(String toConvert) throws IOException {
        DeliverabilityEnum enumValue = fromString(toConvert);
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
    public static DeliverabilityEnum fromString(String toConvert) {
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
     * Convert list of DeliverabilityEnum values to list of string values.
     * @param toConvert The list of DeliverabilityEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DeliverabilityEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DeliverabilityEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 