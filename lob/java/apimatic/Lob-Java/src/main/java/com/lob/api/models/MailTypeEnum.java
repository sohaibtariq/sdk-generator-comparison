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
 * MailTypeEnum to be used.
 */
public enum MailTypeEnum {
    USPS_FIRST_CLASS,

    USPS_STANDARD;


    private static TreeMap<String, MailTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        USPS_FIRST_CLASS.value = "usps_first_class";
        USPS_STANDARD.value = "usps_standard";

        valueMap.put("usps_first_class", USPS_FIRST_CLASS);
        valueMap.put("usps_standard", USPS_STANDARD);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static MailTypeEnum constructFromString(String toConvert) throws IOException {
        MailTypeEnum enumValue = fromString(toConvert);
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
    public static MailTypeEnum fromString(String toConvert) {
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
     * Convert list of MailTypeEnum values to list of string values.
     * @param toConvert The list of MailTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<MailTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (MailTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 