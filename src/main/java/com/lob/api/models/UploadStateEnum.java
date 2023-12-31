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
 * UploadStateEnum to be used.
 */
public enum UploadStateEnum {
    PREPROCESSING,

    DRAFT,

    ENUM_READY_FOR_VALIDATION,

    VALIDATING,

    SCHEDULED,

    CANCELLED,

    ERRORED;


    private static TreeMap<String, UploadStateEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PREPROCESSING.value = "Preprocessing";
        DRAFT.value = "Draft";
        ENUM_READY_FOR_VALIDATION.value = "Ready for Validation";
        VALIDATING.value = "Validating";
        SCHEDULED.value = "Scheduled";
        CANCELLED.value = "Cancelled";
        ERRORED.value = "Errored";

        valueMap.put("Preprocessing", PREPROCESSING);
        valueMap.put("Draft", DRAFT);
        valueMap.put("Ready for Validation", ENUM_READY_FOR_VALIDATION);
        valueMap.put("Validating", VALIDATING);
        valueMap.put("Scheduled", SCHEDULED);
        valueMap.put("Cancelled", CANCELLED);
        valueMap.put("Errored", ERRORED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UploadStateEnum constructFromString(String toConvert) throws IOException {
        UploadStateEnum enumValue = fromString(toConvert);
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
    public static UploadStateEnum fromString(String toConvert) {
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
     * Convert list of UploadStateEnum values to list of string values.
     * @param toConvert The list of UploadStateEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UploadStateEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UploadStateEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 