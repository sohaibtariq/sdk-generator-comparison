/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;
import org.openapis.openapi.utils.SerializedBody;

/**
 * The creatives endpoint allows you to create and view creatives. Creatives are used to create
 * reusable letter and postcard templates. The API provides endpoints for creating creatives, updating creatives,
 * retrieving individual creatives, and deleting creatives.
 * 
 */
public class Creatives {
	
	private SDKConfiguration sdkConfiguration;

	public Creatives(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create
     * Creates a new creative with the provided properties
     * @param requestBody
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.CreativeCreateResponse creativeCreate(Object requestBody) throws Exception {
        return this.creativeCreate(requestBody, null);
    }

    /**
     * Create
     * Creates a new creative with the provided properties
     * @param requestBody
     * @param xLangOutput
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.CreativeCreateResponse creativeCreate(Object requestBody, org.openapis.openapi.models.shared.LangSpec xLangOutput) throws Exception {
        org.openapis.openapi.models.operations.CreativeCreateRequest request = new org.openapis.openapi.models.operations.CreativeCreateRequest(requestBody);
        request.xLangOutput=xLangOutput;
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/creatives");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "requestBody", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.Map<String, java.util.List<String>> headers = org.openapis.openapi.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.CreativeCreateResponse res = new org.openapis.openapi.models.operations.CreativeCreateResponse(contentType, httpRes.statusCode(), httpRes) {{
            creative = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.creative = out;
            }
        }

        return res;
    }

    /**
     * Retrieve
     * Retrieves the details of an existing creative. You need only supply the unique creative identifier that was returned upon creative creation.
     * @param crvId id of the creative
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.CreativeRetrieveResponse creativeRetrieve(String crvId) throws Exception {
        org.openapis.openapi.models.operations.CreativeRetrieveRequest request = new org.openapis.openapi.models.operations.CreativeRetrieveRequest(crvId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.CreativeRetrieveRequest.class, baseUrl, "/creatives/{crv_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.CreativeRetrieveResponse res = new org.openapis.openapi.models.operations.CreativeRetrieveResponse(contentType, httpRes.statusCode(), httpRes) {{
            creative = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.creative = out;
            }
        }

        return res;
    }

    /**
     * Update
     * Update the details of an existing creative. You need only supply the unique identifier that was returned upon creative creation.
     * @param crvId id of the creative
     * @param creativeBase
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.CreativeUpdateResponse creativeUpdate(String crvId, org.openapis.openapi.models.shared.CreativeBase creativeBase) throws Exception {
        org.openapis.openapi.models.operations.CreativeUpdateRequest request = new org.openapis.openapi.models.operations.CreativeUpdateRequest(crvId, creativeBase);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.CreativeUpdateRequest.class, baseUrl, "/creatives/{crv_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "creativeBase", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.CreativeUpdateResponse res = new org.openapis.openapi.models.operations.CreativeUpdateResponse(contentType, httpRes.statusCode(), httpRes) {{
            creative = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Object out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Object.class);
                res.creative = out;
            }
        }

        return res;
    }
}