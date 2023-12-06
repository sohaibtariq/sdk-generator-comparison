/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CustomEnvelopeReturned type.
 */
public class CustomEnvelopeReturned {
    private String id;
    private String url;
    private String object;

    /**
     * Default constructor.
     */
    public CustomEnvelopeReturned() {
        object = "envelope";
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  url  String value for url.
     * @param  object  String value for object.
     */
    public CustomEnvelopeReturned(
            String id,
            String url,
            String object) {
        this.id = id;
        this.url = url;
        this.object = object;
    }

    /**
     * Getter for Id.
     * The unique identifier of the custom envelope used.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The unique identifier of the custom envelope used.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Url.
     * The url of the envelope asset used.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The url of the envelope asset used.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Object.
     * @return Returns the String
     */
    @JsonGetter("object")
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * @param object Value for String
     */
    @JsonSetter("object")
    private void setObject(String object) {
        this.object = object;
    }

    /**
     * Converts this CustomEnvelopeReturned into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CustomEnvelopeReturned [" + "id=" + id + ", url=" + url + ", object=" + object
                + "]";
    }

    /**
     * Builds a new {@link CustomEnvelopeReturned.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CustomEnvelopeReturned.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, url, object);
        return builder;
    }

    /**
     * Class to build instances of {@link CustomEnvelopeReturned}.
     */
    public static class Builder {
        private String id;
        private String url;
        private String object = "envelope";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  url  String value for url.
         * @param  object  String value for object.
         */
        public Builder(String id, String url, String object) {
            this.id = id;
            this.url = url;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * Builds a new {@link CustomEnvelopeReturned} object using the set fields.
         * @return {@link CustomEnvelopeReturned}
         */
        public CustomEnvelopeReturned build() {
            return new CustomEnvelopeReturned(id, url, object);
        }
    }
}
