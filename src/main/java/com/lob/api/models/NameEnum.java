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
 * NameEnum to be used.
 */
public enum NameEnum {
    MAILED,

    ENUM_IN_TRANSIT,

    ENUM_IN_LOCAL_AREA,

    ENUM_PROCESSED_FOR_DELIVERY,

    DELIVERED,

    REROUTED,

    ENUM_RETURNED_TO_SENDER,

    ENUM_INTERNATIONAL_EXIT;


    private static TreeMap<String, NameEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        MAILED.value = "Mailed";
        ENUM_IN_TRANSIT.value = "In Transit";
        ENUM_IN_LOCAL_AREA.value = "In Local Area";
        ENUM_PROCESSED_FOR_DELIVERY.value = "Processed for Delivery";
        DELIVERED.value = "Delivered";
        REROUTED.value = "Re-Routed";
        ENUM_RETURNED_TO_SENDER.value = "Returned to Sender";
        ENUM_INTERNATIONAL_EXIT.value = "International Exit";

        valueMap.put("Mailed", MAILED);
        valueMap.put("In Transit", ENUM_IN_TRANSIT);
        valueMap.put("In Local Area", ENUM_IN_LOCAL_AREA);
        valueMap.put("Processed for Delivery", ENUM_PROCESSED_FOR_DELIVERY);
        valueMap.put("Delivered", DELIVERED);
        valueMap.put("Re-Routed", REROUTED);
        valueMap.put("Returned to Sender", ENUM_RETURNED_TO_SENDER);
        valueMap.put("International Exit", ENUM_INTERNATIONAL_EXIT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static NameEnum constructFromString(String toConvert) throws IOException {
        NameEnum enumValue = fromString(toConvert);
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
    public static NameEnum fromString(String toConvert) {
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
     * Convert list of NameEnum values to list of string values.
     * @param toConvert The list of NameEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<NameEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (NameEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 