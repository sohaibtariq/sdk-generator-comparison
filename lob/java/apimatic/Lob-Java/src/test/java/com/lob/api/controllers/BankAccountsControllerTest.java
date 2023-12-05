/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lob.api.ApiHelper;
import com.lob.api.LobClient;
import com.lob.api.exceptions.ApiException;
import com.lob.api.models.AccountTypeEnum;
import com.lob.api.models.AllBankAccounts;
import com.lob.api.models.BankAccount;
import com.lob.api.models.BeforeAfter;
import com.lob.api.models.CheckTemplateEnum;
import io.apimatic.core.utilities.TestHelper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountsControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static LobClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static BankAccountsController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getBankAccountsController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns a list of your bank accounts. The bank accounts are returned sorted by creation date,
     * with the most recently created bank accounts appearing first.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestBankAccountsList() throws Exception {
        // Parameters for the API call
        Integer limit = 10;
        BeforeAfter beforeAfter = null;
        List<String> include = null;
        Map<String, String> dateCreated = null;
        Map<String, String> metadata = null;

        // Set callback and perform API call
        AllBankAccounts result = null;
        try {
            result = controller.bankAccountsList(limit, beforeAfter, include, dateCreated, metadata);
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
        assertTrue("Response body does not match in keys", 
                TestHelper.isJsonObjectProperSubsetOf(
                "{\"data\":[{\"id\":\"bank_0e3fb07eba0b35b\",\"signature_url\":\"https://lob-assets"
                + ".com/letters/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a"
                + "\",\"description\":\"Example bank account\",\"metadata\":{},\"routing_number\":"
                + "\"122100024\",\"account_number\":\"1234564789\",\"account_type\":\"company\",\"s"
                + "ignatory\":\"John Doe\",\"bank_name\":\"JPMORGAN CHASE BANK, NA\",\"verified\":t"
                + "rue,\"date_created\":\"2019-03-30T13:13:22.200Z\",\"date_modified\":\"2019-03-30"
                + "T13:13:23.385Z\",\"object\":\"bank_account\"},{\"id\":\"bank_eba93f7de3c02d9\","
                + "\"description\":\"Example bank account\",\"metadata\":{},\"routing_number\":\"12"
                + "2100024\",\"account_number\":\"1234564789\",\"account_type\":\"company\",\"signa"
                + "tory\":\"John Doe\",\"bank_name\":\"JPMORGAN CHASE BANK, NA\",\"verified\":true,"
                + "\"date_created\":\"2019-03-30T13:11:06.809Z\",\"date_modified\":\"2019-03-30T13:"
                + "11:07.872Z\",\"object\":\"bank_account\"}],\"object\":\"list\",\"next_url\":\"ht"
                + "tps://api.lob.com/v1/bank_accounts?limit=2&after=eyJkYXRlT2Zmc2V0IjoiMjAxOS0wMy0"
                + "zMFQxMzoxMTowNi44MDlaIiwiaWRPZmZzZXQiOiJiYW5rX2ViYTkzZjdkZTNjMDJkOSJ9\",\"previo"
                + "us_url\":null,\"count\":2}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

    /**
     * Creates a new bank account with the provided properties. Bank accounts created in live mode
     * will need to be verified via micro deposits before being able to send live checks. The
     * deposits will appear in the bank account in 2-3 business days and have the description
     * "VERIFICATION".
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestBankAccountCreate() throws Exception {
        // Parameters for the API call
        String routingNumber = 
                "322271627";
        String accountNumber = 
                "123456789";
        AccountTypeEnum accountType = AccountTypeEnum.fromString(
                "individual");
        String signatory = 
                "Jane Doe";
        String description = null;
        CheckTemplateEnum checkTemplate = null;
        String fractionalRoutingNumber = null;
        String city = null;
        String state = null;
        String zipcode = null;
        Map<String, String> metadata = ApiHelper.deserialize(
                "{\r\n  \"spiffy\": \"true\"\r\n}",
                new TypeReference<Map<String, String>>(){});

        // Set callback and perform API call
        BankAccount result = null;
        try {
            result = controller.bankAccountCreate(routingNumber, accountNumber, accountType, signatory, description, checkTemplate, fractionalRoutingNumber, city, state, zipcode, metadata);
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
                "{\"id\":\"bank_8cad8df5354d33f\",\"signature_url\":\"https://lob-assets.com/letter"
                + "s/asd_asdfghjklqwertyu.pdf?version=45&expires=1234567890&signature=a\",\"descrip"
                + "tion\":\"Test Bank Account\",\"metadata\":{},\"routing_number\":\"322271627\","
                + "\"fractional_routing_number\":\"25-3/440\",\"check_template\":\"jpm\",\"account_"
                + "number\":\"123456789\",\"account_type\":\"company\",\"signatory\":\"John Doe\","
                + "\"bank_name\":\"J.P. MORGAN CHASE BANK, N.A.,\",\"bank_city\":\"Columbus\",\"ban"
                + "k_state\":\"OH\",\"bank_zip\":\"43240\",\"verified\":false,\"date_created\":\"20"
                + "15-11-06T19:24:24.440Z\",\"date_modified\":\"2015-11-06T19:24:24.440Z\",\"object"
                + "\":\"bank_account\"}",
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()), 
                false, true, false));
    }

}
