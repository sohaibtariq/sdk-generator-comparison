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
 * PostcardSizeEnum to be used.
 */
public enum PostcardSizeEnum {
    ENUM_4X6,

    ENUM_6X9,

    ENUM_6X11;


    private static TreeMap<String, PostcardSizeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_4X6.value = "4x6";
        ENUM_6X9.value = "6x9";
        ENUM_6X11.value = "6x11";

        valueMap.put("4x6", ENUM_4X6);
        valueMap.put("6x9", ENUM_6X9);
        valueMap.put("6x11", ENUM_6X11);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PostcardSizeEnum constructFromString(String toConvert) throws IOException {
        PostcardSizeEnum enumValue = fromString(toConvert);
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
    public static PostcardSizeEnum fromString(String toConvert) {
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
     * Convert list of PostcardSizeEnum values to list of string values.
     * @param toConvert The list of PostcardSizeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PostcardSizeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PostcardSizeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 