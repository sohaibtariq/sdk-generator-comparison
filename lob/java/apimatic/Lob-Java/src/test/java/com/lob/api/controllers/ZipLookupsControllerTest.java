/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.lob.api.LobClient;
import com.lob.api.exceptions.ApiException;
import com.lob.api.models.Zip;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ZipLookupsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static LobClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static ZipLookupsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getZipLookupsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns information about a ZIP code.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestZipLookup() throws Exception {
        // Parameters for the API call
        String zipCode = 
                "94107";

        // Set callback and perform API call
        Zip result = null;
        try {
            result = controller.zipLookup(zipCode);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("ratelimit-limit", TestHelper.NULL_STRING);
        headers.put("ratelimit-remaining", TestHelper.NULL_STRING);
        headers.put("ratelimit-reset", TestHelper.NULL_STRING);
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"id\":\"us_zip_c7cb63d68f8d6\",\"cities\":[{\"city\":\"SAN FRANCISCO\",\"state"
                + "\":\"CA\",\"county\":\"SAN FRANCISCO\",\"county_fips\":\"06075\",\"preferred\":t"
                + "rue}],\"zip_code_type\":\"standard\",\"object\":\"us_zip_lookup\",\"zip_code\":"
                + "\"94107\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}