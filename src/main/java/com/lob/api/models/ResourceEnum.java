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
 * ResourceEnum to be used.
 */
public enum ResourceEnum {
    POSTCARDS,

    ENUM_SELF_MAILERS,

    LETTERS,

    CHECKS,

    ADDRESSES,

    ENUM_BANK_ACCOUNTS;


    private static TreeMap<String, ResourceEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        POSTCARDS.value = "postcards";
        ENUM_SELF_MAILERS.value = "self mailers";
        LETTERS.value = "letters";
        CHECKS.value = "checks";
        ADDRESSES.value = "addresses";
        ENUM_BANK_ACCOUNTS.value = "bank accounts";

        valueMap.put("postcards", POSTCARDS);
        valueMap.put("self mailers", ENUM_SELF_MAILERS);
        valueMap.put("letters", LETTERS);
        valueMap.put("checks", CHECKS);
        valueMap.put("addresses", ADDRESSES);
        valueMap.put("bank accounts", ENUM_BANK_ACCOUNTS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ResourceEnum constructFromString(String toConvert) throws IOException {
        ResourceEnum enumValue = fromString(toConvert);
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
    public static ResourceEnum fromString(String toConvert) {
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
     * Convert list of ResourceEnum values to list of string values.
     * @param toConvert The list of ResourceEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ResourceEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ResourceEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 