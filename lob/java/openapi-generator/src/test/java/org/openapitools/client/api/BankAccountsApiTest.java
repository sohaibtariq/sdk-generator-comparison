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
import org.openapitools.client.model.AddressesListBeforeAfterParameter;
import org.openapitools.client.model.BankAccount;
import org.openapitools.client.model.BankAccountBase;
import org.openapitools.client.model.BankAccountVerify;
import org.openapitools.client.model.BankAccountsList200Response;
import org.openapitools.client.model.BankDeletion;
import org.openapitools.client.model.BankId;
import org.openapitools.client.model.Error;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BankAccountsApi
 */
@Disabled
public class BankAccountsApiTest {

    private final BankAccountsApi api = new BankAccountsApi();

    /**
     * Create
     *
     * Creates a new bank account with the provided properties. Bank accounts created in live mode will need to be verified via micro deposits before being able to send live checks. The deposits will appear in the bank account in 2-3 business days and have the description \&quot;VERIFICATION\&quot;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bankAccountCreateTest() throws ApiException {
        BankAccountBase bankAccountBase = null;
        BankAccount response = api.bankAccountCreate(bankAccountBase);
        // TODO: test validations
    }

    /**
     * Delete
     *
     * Permanently deletes a bank account. It cannot be undone.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bankAccountDeleteTest() throws ApiException {
        BankId bankId = null;
        BankDeletion response = api.bankAccountDelete(bankId);
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the details of an existing bank account. You need only supply the unique bank account identifier that was returned upon bank account creation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bankAccountRetrieveTest() throws ApiException {
        BankId bankId = null;
        BankAccount response = api.bankAccountRetrieve(bankId);
        // TODO: test validations
    }

    /**
     * Verify
     *
     * Verify a bank account in order to create a check.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bankAccountVerifyTest() throws ApiException {
        BankId bankId = null;
        BankAccountVerify bankAccountVerify = null;
        BankAccount response = api.bankAccountVerify(bankId, bankAccountVerify);
        // TODO: test validations
    }

    /**
     * List
     *
     * Returns a list of your bank accounts. The bank accounts are returned sorted by creation date, with the most recently created bank accounts appearing first.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bankAccountsListTest() throws ApiException {
        Integer limit = null;
        AddressesListBeforeAfterParameter beforeAfter = null;
        List<String> include = null;
        Map<String, String> dateCreated = null;
        Map<String, String> metadata = null;
        BankAccountsList200Response response = api.bankAccountsList(limit, beforeAfter, include, dateCreated, metadata);
        // TODO: test validations
    }

}