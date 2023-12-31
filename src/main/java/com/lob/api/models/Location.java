/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Location type.
 */
public class Location {
    private Double latitude;
    private Double longitude;

    /**
     * Default constructor.
     */
    public Location() {
    }

    /**
     * Initialization constructor.
     * @param  latitude  Double value for latitude.
     * @param  longitude  Double value for longitude.
     */
    public Location(
            Double latitude,
            Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Getter for Latitude.
     * A positive or negative decimal indicating the geographic latitude of the address, specifying
     * the north-to-south position of a location. This should be input with `longitude` to pinpoint
     * locations on a map.
     * @return Returns the Double
     */
    @JsonGetter("latitude")
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Setter for Latitude.
     * A positive or negative decimal indicating the geographic latitude of the address, specifying
     * the north-to-south position of a location. This should be input with `longitude` to pinpoint
     * locations on a map.
     * @param latitude Value for Double
     */
    @JsonSetter("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * Getter for Longitude.
     * A positive or negative decimal indicating the geographic longitude of the address, specifying
     * the north-to-south position of a location. This should be input with `latitude` to pinpoint
     * locations on a map.
     * @return Returns the Double
     */
    @JsonGetter("longitude")
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Setter for Longitude.
     * A positive or negative decimal indicating the geographic longitude of the address, specifying
     * the north-to-south position of a location. This should be input with `latitude` to pinpoint
     * locations on a map.
     * @param longitude Value for Double
     */
    @JsonSetter("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * Converts this Location into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Location [" + "latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    /**
     * Builds a new {@link Location.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Location.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(latitude, longitude);
        return builder;
    }

    /**
     * Class to build instances of {@link Location}.
     */
    public static class Builder {
        private Double latitude;
        private Double longitude;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  latitude  Double value for latitude.
         * @param  longitude  Double value for longitude.
         */
        public Builder(Double latitude, Double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        /**
         * Setter for latitude.
         * @param  latitude  Double value for latitude.
         * @return Builder
         */
        public Builder latitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        /**
         * Setter for longitude.
         * @param  longitude  Double value for longitude.
         * @return Builder
         */
        public Builder longitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        /**
         * Builds a new {@link Location} object using the set fields.
         * @return {@link Location}
         */
        public Location build() {
            return new Location(latitude, longitude);
        }
    }
}
