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
import org.openapitools.client.model.BuckslipOrder;
import org.openapitools.client.model.BuckslipOrderEditable;
import org.openapitools.client.model.BuckslipOrdersRetrieve200Response;
import org.openapitools.client.model.Error;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BuckslipOrdersApi
 */
@Disabled
public class BuckslipOrdersApiTest {

    private final BuckslipOrdersApi api = new BuckslipOrdersApi();

    /**
     * Create
     *
     * Creates a new buckslip order given information
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void buckslipOrderCreateTest() throws ApiException {
        String buckslipId = null;
        BuckslipOrderEditable buckslipOrderEditable = null;
        BuckslipOrder response = api.buckslipOrderCreate(buckslipId, buckslipOrderEditable);
        // TODO: test validations
    }

    /**
     * Retrieve
     *
     * Retrieves the buckslip orders associated with the given buckslip id.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void buckslipOrdersRetrieveTest() throws ApiException {
        String buckslipId = null;
        Integer limit = null;
        Integer offset = null;
        BuckslipOrdersRetrieve200Response response = api.buckslipOrdersRetrieve(buckslipId, limit, offset);
        // TODO: test validations
    }

}
