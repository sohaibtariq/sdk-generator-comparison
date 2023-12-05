/*
 * PetstoreExtendedLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.example.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.ApiHelper;
import com.example.PetstoreExtendedClient;
import com.example.exceptions.ApiException;
import com.example.models.User;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static PetstoreExtendedClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static UserController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getUserController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * This can only be done by the logged in user.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateUser() throws Exception {
        // Parameters for the API call
        User body = null;

        // Set callback and perform API call
        try {
            controller.createUser(body);
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
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Creates list of users with given input array.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestCreateUsersWithListInput() throws Exception {
        // Parameters for the API call
        List<User> body = null;

        // Set callback and perform API call
        try {
            controller.createUsersWithListInput(body);
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
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * log a user into the petstore.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestLoginUser() throws Exception {
        // Parameters for the API call
        String username = 
                "theUser";
        String password = 
                "foobar";

        // Set callback and perform API call
        String result = null;
        try {
            result = controller.loginUser(username, password);
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
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);
        assertEquals("Response body does not match exactly",
                "success",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

    /**
     * log out the current user.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestLogoutUser() throws Exception {

        // Set callback and perform API call
        try {
            controller.logoutUser();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

    }

    /**
     * retrieve a user by their username.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetUserByName() throws Exception {
        // Parameters for the API call
        String username = 
                "theUser";

        // Set callback and perform API call
        try {
            controller.getUserByName(username);
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
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * This can only be done by the logged in user.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestUpdateUser() throws Exception {
        // Parameters for the API call
        String username = 
                "theUser";
        User body = null;

        // Set callback and perform API call
        try {
            controller.updateUser(username, body);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

    }

    /**
     * This can only be done by the logged in user.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestDeleteUser() throws Exception {
        // Parameters for the API call
        String username = 
                "theUser";

        // Set callback and perform API call
        try {
            controller.deleteUser(username);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 201", 
                201, httpResponse.getResponse().getStatusCode());

    }

}