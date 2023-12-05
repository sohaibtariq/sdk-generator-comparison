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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.BillingGroup;
import org.openapitools.client.model.BillingGroupBase;
import org.openapitools.client.model.BillingGroupEditable;
import org.openapitools.client.model.BillingGroupsList200Response;
import org.openapitools.client.model.BillingGroupsListSortByParameter;
import org.openapitools.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BillingGroupsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BillingGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BillingGroupsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for billingGroupCreate
     * @param billingGroupEditable  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupCreateCall(BillingGroupEditable billingGroupEditable, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = billingGroupEditable;

        // create path and map variables
        String localVarPath = "/billing_groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/x-www-form-urlencoded",
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call billingGroupCreateValidateBeforeCall(BillingGroupEditable billingGroupEditable, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'billingGroupEditable' is set
        if (billingGroupEditable == null) {
            throw new ApiException("Missing the required parameter 'billingGroupEditable' when calling billingGroupCreate(Async)");
        }

        return billingGroupCreateCall(billingGroupEditable, _callback);

    }

    /**
     * Create
     * Creates a new billing_group with the provided properties.
     * @param billingGroupEditable  (required)
     * @return BillingGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public BillingGroup billingGroupCreate(BillingGroupEditable billingGroupEditable) throws ApiException {
        ApiResponse<BillingGroup> localVarResp = billingGroupCreateWithHttpInfo(billingGroupEditable);
        return localVarResp.getData();
    }

    /**
     * Create
     * Creates a new billing_group with the provided properties.
     * @param billingGroupEditable  (required)
     * @return ApiResponse&lt;BillingGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillingGroup> billingGroupCreateWithHttpInfo(BillingGroupEditable billingGroupEditable) throws ApiException {
        okhttp3.Call localVarCall = billingGroupCreateValidateBeforeCall(billingGroupEditable, null);
        Type localVarReturnType = new TypeToken<BillingGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create (asynchronously)
     * Creates a new billing_group with the provided properties.
     * @param billingGroupEditable  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupCreateAsync(BillingGroupEditable billingGroupEditable, final ApiCallback<BillingGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = billingGroupCreateValidateBeforeCall(billingGroupEditable, _callback);
        Type localVarReturnType = new TypeToken<BillingGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for billingGroupRetrieve
     * @param bgId id of the billing_group (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing_group object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupRetrieveCall(String bgId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billing_groups/{bg_id}"
            .replace("{" + "bg_id" + "}", localVarApiClient.escapeString(bgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call billingGroupRetrieveValidateBeforeCall(String bgId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bgId' is set
        if (bgId == null) {
            throw new ApiException("Missing the required parameter 'bgId' when calling billingGroupRetrieve(Async)");
        }

        return billingGroupRetrieveCall(bgId, _callback);

    }

    /**
     * Retrieve
     * Retrieves the details of an existing billing_group. You need only supply the unique billing_group identifier that was returned upon billing_group creation.
     * @param bgId id of the billing_group (required)
     * @return BillingGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing_group object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public BillingGroup billingGroupRetrieve(String bgId) throws ApiException {
        ApiResponse<BillingGroup> localVarResp = billingGroupRetrieveWithHttpInfo(bgId);
        return localVarResp.getData();
    }

    /**
     * Retrieve
     * Retrieves the details of an existing billing_group. You need only supply the unique billing_group identifier that was returned upon billing_group creation.
     * @param bgId id of the billing_group (required)
     * @return ApiResponse&lt;BillingGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing_group object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillingGroup> billingGroupRetrieveWithHttpInfo(String bgId) throws ApiException {
        okhttp3.Call localVarCall = billingGroupRetrieveValidateBeforeCall(bgId, null);
        Type localVarReturnType = new TypeToken<BillingGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve (asynchronously)
     * Retrieves the details of an existing billing_group. You need only supply the unique billing_group identifier that was returned upon billing_group creation.
     * @param bgId id of the billing_group (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing_group object. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupRetrieveAsync(String bgId, final ApiCallback<BillingGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = billingGroupRetrieveValidateBeforeCall(bgId, _callback);
        Type localVarReturnType = new TypeToken<BillingGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for billingGroupUpdate
     * @param bgId id of the billing_group (required)
     * @param billingGroupBase  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupUpdateCall(String bgId, BillingGroupBase billingGroupBase, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = billingGroupBase;

        // create path and map variables
        String localVarPath = "/billing_groups/{bg_id}"
            .replace("{" + "bg_id" + "}", localVarApiClient.escapeString(bgId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/x-www-form-urlencoded",
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call billingGroupUpdateValidateBeforeCall(String bgId, BillingGroupBase billingGroupBase, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bgId' is set
        if (bgId == null) {
            throw new ApiException("Missing the required parameter 'bgId' when calling billingGroupUpdate(Async)");
        }

        // verify the required parameter 'billingGroupBase' is set
        if (billingGroupBase == null) {
            throw new ApiException("Missing the required parameter 'billingGroupBase' when calling billingGroupUpdate(Async)");
        }

        return billingGroupUpdateCall(bgId, billingGroupBase, _callback);

    }

    /**
     * Update
     * Updates all editable attributes of the billing_group with the given id.
     * @param bgId id of the billing_group (required)
     * @param billingGroupBase  (required)
     * @return BillingGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public BillingGroup billingGroupUpdate(String bgId, BillingGroupBase billingGroupBase) throws ApiException {
        ApiResponse<BillingGroup> localVarResp = billingGroupUpdateWithHttpInfo(bgId, billingGroupBase);
        return localVarResp.getData();
    }

    /**
     * Update
     * Updates all editable attributes of the billing_group with the given id.
     * @param bgId id of the billing_group (required)
     * @param billingGroupBase  (required)
     * @return ApiResponse&lt;BillingGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillingGroup> billingGroupUpdateWithHttpInfo(String bgId, BillingGroupBase billingGroupBase) throws ApiException {
        okhttp3.Call localVarCall = billingGroupUpdateValidateBeforeCall(bgId, billingGroupBase, null);
        Type localVarReturnType = new TypeToken<BillingGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update (asynchronously)
     * Updates all editable attributes of the billing_group with the given id.
     * @param bgId id of the billing_group (required)
     * @param billingGroupBase  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a billing group object </td><td>  * ratelimit-limit -  <br>  * ratelimit-remaining -  <br>  * ratelimit-reset -  <br>  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupUpdateAsync(String bgId, BillingGroupBase billingGroupBase, final ApiCallback<BillingGroup> _callback) throws ApiException {

        okhttp3.Call localVarCall = billingGroupUpdateValidateBeforeCall(bgId, billingGroupBase, _callback);
        Type localVarReturnType = new TypeToken<BillingGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for billingGroupsList
     * @param limit How many results to return. (optional, default to 10)
     * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0. (optional, default to 0)
     * @param include Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  (optional)
     * @param dateCreated Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param dateModified Filter by date modified. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;date_modified&#x60;, not both.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of billing_groups. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupsListCall(Integer limit, Integer offset, List<String> include, Map<String, String> dateCreated, Map<String, String> dateModified, BillingGroupsListSortByParameter sortBy, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/billing_groups";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (include != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "include", include));
        }

        if (dateCreated != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_created", dateCreated));
        }

        if (dateModified != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date_modified", dateModified));
        }

        if (sortBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort_by", sortBy));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call billingGroupsListValidateBeforeCall(Integer limit, Integer offset, List<String> include, Map<String, String> dateCreated, Map<String, String> dateModified, BillingGroupsListSortByParameter sortBy, final ApiCallback _callback) throws ApiException {
        return billingGroupsListCall(limit, offset, include, dateCreated, dateModified, sortBy, _callback);

    }

    /**
     * List
     * Returns a list of your billing_groups. The billing_groups are returned sorted by creation date, with the most recently created billing_groups appearing first.
     * @param limit How many results to return. (optional, default to 10)
     * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0. (optional, default to 0)
     * @param include Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  (optional)
     * @param dateCreated Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param dateModified Filter by date modified. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;date_modified&#x60;, not both.  (optional)
     * @return BillingGroupsList200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of billing_groups. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public BillingGroupsList200Response billingGroupsList(Integer limit, Integer offset, List<String> include, Map<String, String> dateCreated, Map<String, String> dateModified, BillingGroupsListSortByParameter sortBy) throws ApiException {
        ApiResponse<BillingGroupsList200Response> localVarResp = billingGroupsListWithHttpInfo(limit, offset, include, dateCreated, dateModified, sortBy);
        return localVarResp.getData();
    }

    /**
     * List
     * Returns a list of your billing_groups. The billing_groups are returned sorted by creation date, with the most recently created billing_groups appearing first.
     * @param limit How many results to return. (optional, default to 10)
     * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0. (optional, default to 0)
     * @param include Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  (optional)
     * @param dateCreated Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param dateModified Filter by date modified. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;date_modified&#x60;, not both.  (optional)
     * @return ApiResponse&lt;BillingGroupsList200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of billing_groups. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BillingGroupsList200Response> billingGroupsListWithHttpInfo(Integer limit, Integer offset, List<String> include, Map<String, String> dateCreated, Map<String, String> dateModified, BillingGroupsListSortByParameter sortBy) throws ApiException {
        okhttp3.Call localVarCall = billingGroupsListValidateBeforeCall(limit, offset, include, dateCreated, dateModified, sortBy, null);
        Type localVarReturnType = new TypeToken<BillingGroupsList200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List (asynchronously)
     * Returns a list of your billing_groups. The billing_groups are returned sorted by creation date, with the most recently created billing_groups appearing first.
     * @param limit How many results to return. (optional, default to 10)
     * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0. (optional, default to 0)
     * @param include Request that the response include the total count by specifying &#x60;include&#x3D;[\&quot;total_count\&quot;]&#x60;.  (optional)
     * @param dateCreated Filter by date created. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param dateModified Filter by date modified. Accepted formats are ISO-8601 date or datetime, e.g. &#x60;{ \&quot;gt\&quot;: \&quot;2012-01-01\&quot;, \&quot;lt\&quot;: \&quot;2012-01-31T12:34:56Z\&quot; }&#x60; where &#x60;gt&#x60; is &gt;, &#x60;lt&#x60; is &lt;, &#x60;gte&#x60; is ≥, and &#x60;lte&#x60; is ≤. (optional)
     * @param sortBy Sorts items by ascending or descending dates. Use either &#x60;date_created&#x60; or &#x60;date_modified&#x60;, not both.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a list of billing_groups. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call billingGroupsListAsync(Integer limit, Integer offset, List<String> include, Map<String, String> dateCreated, Map<String, String> dateModified, BillingGroupsListSortByParameter sortBy, final ApiCallback<BillingGroupsList200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = billingGroupsListValidateBeforeCall(limit, offset, include, dateCreated, dateModified, sortBy, _callback);
        Type localVarReturnType = new TypeToken<BillingGroupsList200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}