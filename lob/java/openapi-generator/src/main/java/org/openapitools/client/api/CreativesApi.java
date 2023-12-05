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


import org.openapitools.client.model.Creative;
import org.openapitools.client.model.CreativeBase;
import org.openapitools.client.model.CreativeWritable;
import org.openapitools.client.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreativesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CreativesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CreativesApi(ApiClient apiClient) {
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
     * Build call for creativeCreate
     * @param creativeWritable  (required)
     * @param xLangOutput * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Creative created successfully </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call creativeCreateCall(CreativeWritable creativeWritable, String xLangOutput, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = creativeWritable;

        // create path and map variables
        String localVarPath = "/creatives";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xLangOutput != null) {
            localVarHeaderParams.put("x-lang-output", localVarApiClient.parameterToString(xLangOutput));
        }

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
    private okhttp3.Call creativeCreateValidateBeforeCall(CreativeWritable creativeWritable, String xLangOutput, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'creativeWritable' is set
        if (creativeWritable == null) {
            throw new ApiException("Missing the required parameter 'creativeWritable' when calling creativeCreate(Async)");
        }

        return creativeCreateCall(creativeWritable, xLangOutput, _callback);

    }

    /**
     * Create
     * Creates a new creative with the provided properties
     * @param creativeWritable  (required)
     * @param xLangOutput * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  (optional)
     * @return Creative
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Creative created successfully </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public Creative creativeCreate(CreativeWritable creativeWritable, String xLangOutput) throws ApiException {
        ApiResponse<Creative> localVarResp = creativeCreateWithHttpInfo(creativeWritable, xLangOutput);
        return localVarResp.getData();
    }

    /**
     * Create
     * Creates a new creative with the provided properties
     * @param creativeWritable  (required)
     * @param xLangOutput * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  (optional)
     * @return ApiResponse&lt;Creative&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Creative created successfully </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Creative> creativeCreateWithHttpInfo(CreativeWritable creativeWritable, String xLangOutput) throws ApiException {
        okhttp3.Call localVarCall = creativeCreateValidateBeforeCall(creativeWritable, xLangOutput, null);
        Type localVarReturnType = new TypeToken<Creative>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create (asynchronously)
     * Creates a new creative with the provided properties
     * @param creativeWritable  (required)
     * @param xLangOutput * &#x60;native&#x60; - Translate response to the native language of the country in the request * &#x60;match&#x60; - match the response to the language in the request  Default response is in English.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Creative created successfully </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call creativeCreateAsync(CreativeWritable creativeWritable, String xLangOutput, final ApiCallback<Creative> _callback) throws ApiException {

        okhttp3.Call localVarCall = creativeCreateValidateBeforeCall(creativeWritable, xLangOutput, _callback);
        Type localVarReturnType = new TypeToken<Creative>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for creativeRetrieve
     * @param crvId id of the creative (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call creativeRetrieveCall(String crvId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/creatives/{crv_id}"
            .replace("{" + "crv_id" + "}", localVarApiClient.escapeString(crvId.toString()));

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
    private okhttp3.Call creativeRetrieveValidateBeforeCall(String crvId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'crvId' is set
        if (crvId == null) {
            throw new ApiException("Missing the required parameter 'crvId' when calling creativeRetrieve(Async)");
        }

        return creativeRetrieveCall(crvId, _callback);

    }

    /**
     * Retrieve
     * Retrieves the details of an existing creative. You need only supply the unique creative identifier that was returned upon creative creation.
     * @param crvId id of the creative (required)
     * @return Creative
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public Creative creativeRetrieve(String crvId) throws ApiException {
        ApiResponse<Creative> localVarResp = creativeRetrieveWithHttpInfo(crvId);
        return localVarResp.getData();
    }

    /**
     * Retrieve
     * Retrieves the details of an existing creative. You need only supply the unique creative identifier that was returned upon creative creation.
     * @param crvId id of the creative (required)
     * @return ApiResponse&lt;Creative&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Creative> creativeRetrieveWithHttpInfo(String crvId) throws ApiException {
        okhttp3.Call localVarCall = creativeRetrieveValidateBeforeCall(crvId, null);
        Type localVarReturnType = new TypeToken<Creative>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve (asynchronously)
     * Retrieves the details of an existing creative. You need only supply the unique creative identifier that was returned upon creative creation.
     * @param crvId id of the creative (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call creativeRetrieveAsync(String crvId, final ApiCallback<Creative> _callback) throws ApiException {

        okhttp3.Call localVarCall = creativeRetrieveValidateBeforeCall(crvId, _callback);
        Type localVarReturnType = new TypeToken<Creative>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for creativeUpdate
     * @param crvId id of the creative (required)
     * @param creativeBase  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call creativeUpdateCall(String crvId, CreativeBase creativeBase, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = creativeBase;

        // create path and map variables
        String localVarPath = "/creatives/{crv_id}"
            .replace("{" + "crv_id" + "}", localVarApiClient.escapeString(crvId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call creativeUpdateValidateBeforeCall(String crvId, CreativeBase creativeBase, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'crvId' is set
        if (crvId == null) {
            throw new ApiException("Missing the required parameter 'crvId' when calling creativeUpdate(Async)");
        }

        // verify the required parameter 'creativeBase' is set
        if (creativeBase == null) {
            throw new ApiException("Missing the required parameter 'creativeBase' when calling creativeUpdate(Async)");
        }

        return creativeUpdateCall(crvId, creativeBase, _callback);

    }

    /**
     * Update
     * Update the details of an existing creative. You need only supply the unique identifier that was returned upon creative creation.
     * @param crvId id of the creative (required)
     * @param creativeBase  (required)
     * @return Creative
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public Creative creativeUpdate(String crvId, CreativeBase creativeBase) throws ApiException {
        ApiResponse<Creative> localVarResp = creativeUpdateWithHttpInfo(crvId, creativeBase);
        return localVarResp.getData();
    }

    /**
     * Update
     * Update the details of an existing creative. You need only supply the unique identifier that was returned upon creative creation.
     * @param crvId id of the creative (required)
     * @param creativeBase  (required)
     * @return ApiResponse&lt;Creative&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Creative> creativeUpdateWithHttpInfo(String crvId, CreativeBase creativeBase) throws ApiException {
        okhttp3.Call localVarCall = creativeUpdateValidateBeforeCall(crvId, creativeBase, null);
        Type localVarReturnType = new TypeToken<Creative>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update (asynchronously)
     * Update the details of an existing creative. You need only supply the unique identifier that was returned upon creative creation.
     * @param crvId id of the creative (required)
     * @param creativeBase  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a creative object </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call creativeUpdateAsync(String crvId, CreativeBase creativeBase, final ApiCallback<Creative> _callback) throws ApiException {

        okhttp3.Call localVarCall = creativeUpdateValidateBeforeCall(crvId, creativeBase, _callback);
        Type localVarReturnType = new TypeToken<Creative>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}