/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> 
 *
 * The version of the OpenAPI document: 1.19.18
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Location;
import org.openapitools.client.model.ReverseGeocode;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReverseGeocodeLookupsApi
 */
@Disabled
public class ReverseGeocodeLookupsApiTest {

    private final ReverseGeocodeLookupsApi api = new ReverseGeocodeLookupsApi();

    /**
     * Reverse Geocode Lookup
     *
     * Reverse geocode a valid US location with a live API key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reverseGeocodeLookupTest() throws ApiException {
        Location location = null;
        Integer size = null;
        ReverseGeocode response = api.reverseGeocodeLookup(location, size);
        // TODO: test validations
    }

}
