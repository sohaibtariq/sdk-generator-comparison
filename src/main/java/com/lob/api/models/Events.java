/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lob.api.DateTimeHelper;
import java.time.LocalDateTime;

/**
 * This is a model class for Events type.
 */
public class Events {
    private String id;
    private Object body;
    private String referenceId;
    private EventType eventType;
    private LocalDateTime dateCreated;
    private String object;

    /**
     * Default constructor.
     */
    public Events() {
        object = "event";
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  body  Object value for body.
     * @param  referenceId  String value for referenceId.
     * @param  eventType  EventType value for eventType.
     * @param  dateCreated  LocalDateTime value for dateCreated.
     * @param  object  String value for object.
     */
    public Events(
            String id,
            Object body,
            String referenceId,
            EventType eventType,
            LocalDateTime dateCreated,
            String object) {
        this.id = id;
        this.body = body;
        this.referenceId = referenceId;
        this.eventType = eventType;
        this.dateCreated = dateCreated;
        this.object = object;
    }

    /**
     * Getter for Id.
     * Unique identifier prefixed with `evt_`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier prefixed with `evt_`.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Body.
     * The body of the associated resource as they were at the time of the event, i.e. the [postcard
     * object](#operation/postcard_retrieve), [the letter object](#operation/letter_retrieve), [the
     * check object](#operation/check_retrieve), [the address object](#operation/address_retrieve),
     * or [the bank account object](#operation/bank_account_retrieve). For `.deleted` events, the
     * body matches the response for the corresponding delete endpoint for that resource (e.g. the
     * [postcard delete response](#operation/postcard_delete)).
     * @return Returns the Object
     */
    @JsonGetter("body")
    public Object getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * The body of the associated resource as they were at the time of the event, i.e. the [postcard
     * object](#operation/postcard_retrieve), [the letter object](#operation/letter_retrieve), [the
     * check object](#operation/check_retrieve), [the address object](#operation/address_retrieve),
     * or [the bank account object](#operation/bank_account_retrieve). For `.deleted` events, the
     * body matches the response for the corresponding delete endpoint for that resource (e.g. the
     * [postcard delete response](#operation/postcard_delete)).
     * @param body Value for Object
     */
    @JsonSetter("body")
    public void setBody(Object body) {
        this.body = body;
    }

    /**
     * Getter for ReferenceId.
     * Unique identifier of the related resource for the event.
     * @return Returns the String
     */
    @JsonGetter("reference_id")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Setter for ReferenceId.
     * Unique identifier of the related resource for the event.
     * @param referenceId Value for String
     */
    @JsonSetter("reference_id")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Getter for EventType.
     * @return Returns the EventType
     */
    @JsonGetter("event_type")
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Setter for EventType.
     * @param eventType Value for EventType
     */
    @JsonSetter("event_type")
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    /**
     * Getter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("date_created")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    /**
     * Setter for DateCreated.
     * A timestamp in ISO 8601 format of the date the resource was created.
     * @param dateCreated Value for LocalDateTime
     */
    @JsonSetter("date_created")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * Getter for Object.
     * Value is resource type.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * Value is resource type.
     * @param object Value for String
     */
    @JsonSetter("object")
    private void setObject(String object) {
        this.object = object;
    }

    /**
     * Converts this Events into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Events [" + "id=" + id + ", body=" + body + ", referenceId=" + referenceId
                + ", eventType=" + eventType + ", dateCreated=" + dateCreated + ", object=" + object
                + "]";
    }

    /**
     * Builds a new {@link Events.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Events.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, body, referenceId, eventType, dateCreated, object);
        return builder;
    }

    /**
     * Class to build instances of {@link Events}.
     */
    public static class Builder {
        private String id;
        private Object body;
        private String referenceId;
        private EventType eventType;
        private LocalDateTime dateCreated;
        private String object = "event";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  body  Object value for body.
         * @param  referenceId  String value for referenceId.
         * @param  eventType  EventType value for eventType.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @param  object  String value for object.
         */
        public Builder(String id, Object body, String referenceId, EventType eventType,
                LocalDateTime dateCreated, String object) {
            this.id = id;
            this.body = body;
            this.referenceId = referenceId;
            this.eventType = eventType;
            this.dateCreated = dateCreated;
            this.object = object;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  Object value for body.
         * @return Builder
         */
        public Builder body(Object body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for referenceId.
         * @param  referenceId  String value for referenceId.
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Setter for eventType.
         * @param  eventType  EventType value for eventType.
         * @return Builder
         */
        public Builder eventType(EventType eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Setter for dateCreated.
         * @param  dateCreated  LocalDateTime value for dateCreated.
         * @return Builder
         */
        public Builder dateCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * Builds a new {@link Events} object using the set fields.
         * @return {@link Events}
         */
        public Events build() {
            return new Events(id, body, referenceId, eventType, dateCreated, object);
        }
    }
}
