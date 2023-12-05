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
 * EventEnum to be used.
 */
public enum EventEnum {
    PACKAGE_ACCEPTED,

    PACKAGE_ARRIVED,

    PACKAGE_DEPARTED,

    PACKAGE_PROCESSING,

    PACKAGE_PROCESSED,

    PACKAGE_IN_LOCAL_AREA,

    DELIVERY_SCHEDULED,

    OUT_FOR_DELIVERY,

    PICKUP_AVAILABLE,

    DELIVERED,

    PACKAGE_FORWARDED,

    RETURNED_TO_SENDER,

    ADDRESS_ISSUE,

    CONTACT_CARRIER,

    DELAYED,

    DELIVERY_ATTEMPTED,

    DELIVERY_RESCHEDULED,

    LOCATION_INACCESSIBLE,

    NOTICE_LEFT,

    PACKAGE_DAMAGED,

    PACKAGE_DISPOSED,

    PACKAGE_HELD,

    PACKAGE_LOST,

    PACKAGE_UNCLAIMED,

    PACKAGE_UNDELIVERABLE,

    RESCHEDULE_DELIVERY,

    OTHER;


    private static TreeMap<String, EventEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        PACKAGE_ACCEPTED.value = "package_accepted";
        PACKAGE_ARRIVED.value = "package_arrived";
        PACKAGE_DEPARTED.value = "package_departed";
        PACKAGE_PROCESSING.value = "package_processing";
        PACKAGE_PROCESSED.value = "package_processed";
        PACKAGE_IN_LOCAL_AREA.value = "package_in_local_area";
        DELIVERY_SCHEDULED.value = "delivery_scheduled";
        OUT_FOR_DELIVERY.value = "out_for_delivery";
        PICKUP_AVAILABLE.value = "pickup_available";
        DELIVERED.value = "delivered";
        PACKAGE_FORWARDED.value = "package_forwarded";
        RETURNED_TO_SENDER.value = "returned_to_sender";
        ADDRESS_ISSUE.value = "address_issue";
        CONTACT_CARRIER.value = "contact_carrier";
        DELAYED.value = "delayed";
        DELIVERY_ATTEMPTED.value = "delivery_attempted";
        DELIVERY_RESCHEDULED.value = "delivery_rescheduled";
        LOCATION_INACCESSIBLE.value = "location_inaccessible";
        NOTICE_LEFT.value = "notice_left";
        PACKAGE_DAMAGED.value = "package_damaged";
        PACKAGE_DISPOSED.value = "package_disposed";
        PACKAGE_HELD.value = "package_held";
        PACKAGE_LOST.value = "package_lost";
        PACKAGE_UNCLAIMED.value = "package_unclaimed";
        PACKAGE_UNDELIVERABLE.value = "package_undeliverable";
        RESCHEDULE_DELIVERY.value = "reschedule_delivery";
        OTHER.value = "other";

        valueMap.put("package_accepted", PACKAGE_ACCEPTED);
        valueMap.put("package_arrived", PACKAGE_ARRIVED);
        valueMap.put("package_departed", PACKAGE_DEPARTED);
        valueMap.put("package_processing", PACKAGE_PROCESSING);
        valueMap.put("package_processed", PACKAGE_PROCESSED);
        valueMap.put("package_in_local_area", PACKAGE_IN_LOCAL_AREA);
        valueMap.put("delivery_scheduled", DELIVERY_SCHEDULED);
        valueMap.put("out_for_delivery", OUT_FOR_DELIVERY);
        valueMap.put("pickup_available", PICKUP_AVAILABLE);
        valueMap.put("delivered", DELIVERED);
        valueMap.put("package_forwarded", PACKAGE_FORWARDED);
        valueMap.put("returned_to_sender", RETURNED_TO_SENDER);
        valueMap.put("address_issue", ADDRESS_ISSUE);
        valueMap.put("contact_carrier", CONTACT_CARRIER);
        valueMap.put("delayed", DELAYED);
        valueMap.put("delivery_attempted", DELIVERY_ATTEMPTED);
        valueMap.put("delivery_rescheduled", DELIVERY_RESCHEDULED);
        valueMap.put("location_inaccessible", LOCATION_INACCESSIBLE);
        valueMap.put("notice_left", NOTICE_LEFT);
        valueMap.put("package_damaged", PACKAGE_DAMAGED);
        valueMap.put("package_disposed", PACKAGE_DISPOSED);
        valueMap.put("package_held", PACKAGE_HELD);
        valueMap.put("package_lost", PACKAGE_LOST);
        valueMap.put("package_unclaimed", PACKAGE_UNCLAIMED);
        valueMap.put("package_undeliverable", PACKAGE_UNDELIVERABLE);
        valueMap.put("reschedule_delivery", RESCHEDULE_DELIVERY);
        valueMap.put("other", OTHER);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static EventEnum constructFromString(String toConvert) throws IOException {
        EventEnum enumValue = fromString(toConvert);
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
    public static EventEnum fromString(String toConvert) {
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
     * Convert list of EventEnum values to list of string values.
     * @param toConvert The list of EventEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<EventEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (EventEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 