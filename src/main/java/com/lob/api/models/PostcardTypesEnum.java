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
 * PostcardTypesEnum to be used.
 */
public enum PostcardTypesEnum {
    ENUM_POSTCARDCREATED,

    ENUM_POSTCARDRENDERED_PDF,

    ENUM_POSTCARDRENDERED_THUMBNAILS,

    ENUM_POSTCARDDELETED,

    ENUM_POSTCARDDELIVERED,

    ENUM_POSTCARDFAILED,

    ENUM_POSTCARDMAILED,

    ENUM_POSTCARDIN_TRANSIT,

    ENUM_POSTCARDIN_LOCAL_AREA,

    ENUM_POSTCARDINTERNATIONAL_EXIT,

    ENUM_POSTCARDPROCESSED_FOR_DELIVERY,

    ENUM_POSTCARDREROUTED,

    ENUM_POSTCARDRETURNED_TO_SENDER,

    ENUM_POSTCARDVIEWED;


    private static TreeMap<String, PostcardTypesEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ENUM_POSTCARDCREATED.value = "postcard.created";
        ENUM_POSTCARDRENDERED_PDF.value = "postcard.rendered_pdf";
        ENUM_POSTCARDRENDERED_THUMBNAILS.value = "postcard.rendered_thumbnails";
        ENUM_POSTCARDDELETED.value = "postcard.deleted";
        ENUM_POSTCARDDELIVERED.value = "postcard.delivered";
        ENUM_POSTCARDFAILED.value = "postcard.failed";
        ENUM_POSTCARDMAILED.value = "postcard.mailed";
        ENUM_POSTCARDIN_TRANSIT.value = "postcard.in_transit";
        ENUM_POSTCARDIN_LOCAL_AREA.value = "postcard.in_local_area";
        ENUM_POSTCARDINTERNATIONAL_EXIT.value = "postcard.international_exit";
        ENUM_POSTCARDPROCESSED_FOR_DELIVERY.value = "postcard.processed_for_delivery";
        ENUM_POSTCARDREROUTED.value = "postcard.re-routed";
        ENUM_POSTCARDRETURNED_TO_SENDER.value = "postcard.returned_to_sender";
        ENUM_POSTCARDVIEWED.value = "postcard.viewed";

        valueMap.put("postcard.created", ENUM_POSTCARDCREATED);
        valueMap.put("postcard.rendered_pdf", ENUM_POSTCARDRENDERED_PDF);
        valueMap.put("postcard.rendered_thumbnails", ENUM_POSTCARDRENDERED_THUMBNAILS);
        valueMap.put("postcard.deleted", ENUM_POSTCARDDELETED);
        valueMap.put("postcard.delivered", ENUM_POSTCARDDELIVERED);
        valueMap.put("postcard.failed", ENUM_POSTCARDFAILED);
        valueMap.put("postcard.mailed", ENUM_POSTCARDMAILED);
        valueMap.put("postcard.in_transit", ENUM_POSTCARDIN_TRANSIT);
        valueMap.put("postcard.in_local_area", ENUM_POSTCARDIN_LOCAL_AREA);
        valueMap.put("postcard.international_exit", ENUM_POSTCARDINTERNATIONAL_EXIT);
        valueMap.put("postcard.processed_for_delivery", ENUM_POSTCARDPROCESSED_FOR_DELIVERY);
        valueMap.put("postcard.re-routed", ENUM_POSTCARDREROUTED);
        valueMap.put("postcard.returned_to_sender", ENUM_POSTCARDRETURNED_TO_SENDER);
        valueMap.put("postcard.viewed", ENUM_POSTCARDVIEWED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PostcardTypesEnum constructFromString(String toConvert) throws IOException {
        PostcardTypesEnum enumValue = fromString(toConvert);
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
    public static PostcardTypesEnum fromString(String toConvert) {
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
     * Convert list of PostcardTypesEnum values to list of string values.
     * @param toConvert The list of PostcardTypesEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PostcardTypesEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PostcardTypesEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 