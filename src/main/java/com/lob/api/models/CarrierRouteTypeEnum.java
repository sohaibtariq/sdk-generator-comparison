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
 * CarrierRouteTypeEnum to be used.
 */
public enum CarrierRouteTypeEnum {
    CITY_DELIVERY,

    RURAL_ROUTE,

    HIGHWAY_CONTRACT,

    PO_BOX,

    GENERAL_DELIVERY;


    private static TreeMap<String, CarrierRouteTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        CITY_DELIVERY.value = "city_delivery";
        RURAL_ROUTE.value = "rural_route";
        HIGHWAY_CONTRACT.value = "highway_contract";
        PO_BOX.value = "po_box";
        GENERAL_DELIVERY.value = "general_delivery";

        valueMap.put("city_delivery", CITY_DELIVERY);
        valueMap.put("rural_route", RURAL_ROUTE);
        valueMap.put("highway_contract", HIGHWAY_CONTRACT);
        valueMap.put("po_box", PO_BOX);
        valueMap.put("general_delivery", GENERAL_DELIVERY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CarrierRouteTypeEnum constructFromString(String toConvert) throws IOException {
        CarrierRouteTypeEnum enumValue = fromString(toConvert);
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
    public static CarrierRouteTypeEnum fromString(String toConvert) {
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
     * Convert list of CarrierRouteTypeEnum values to list of string values.
     * @param toConvert The list of CarrierRouteTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CarrierRouteTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CarrierRouteTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 