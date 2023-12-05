/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;
import org.openapis.openapi.utils.SerializedBody;

/**
 * The uploads endpoint allows you to upload audience files that are then associated with a given campaign.
 * At this time, only CSV files are allowed. The API provides endpoints for creating uploads, uploading audience files,
 * and marking uploaded files as ready for processing. The API also provides endpoints for downloading files that
 * describe the results, both successful and not, of the processing.
 * 
 */
public class Uploads {
	
	private SDKConfiguration sdkConfiguration;

	public Uploads(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * List
     * Returns a list of your uploads. Optionally, filter uploads by campaign.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadsListResponse uploadsList() throws Exception {
        return this.uploadsList(null);
    }

    /**
     * List
     * Returns a list of your uploads. Optionally, filter uploads by campaign.
     * @param campaignId id of the campaign
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadsListResponse uploadsList(String campaignId) throws Exception {
        org.openapis.openapi.models.operations.UploadsListRequest request = new org.openapis.openapi.models.operations.UploadsListRequest();
        request.campaignId=campaignId;
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/uploads");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.UploadsListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadsListResponse res = new org.openapis.openapi.models.operations.UploadsListResponse(contentType, httpRes.statusCode(), httpRes) {{
            classes = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Upload[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Upload[].class);
                res.classes = out;
            }
        }

        return res;
    }

    /**
     * Create
     * Creates a new upload with the provided properties.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadCreateResponse uploadCreate(org.openapis.openapi.models.shared.UploadWritable request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/uploads");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadCreateResponse res = new org.openapis.openapi.models.operations.UploadCreateResponse(contentType, httpRes.statusCode(), httpRes) {{
            upload = null;
            httpValidationError = null;
        }};
        
        if (httpRes.statusCode() == 201) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Upload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Upload.class);
                res.upload = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.UploadCreateHTTPValidationError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.UploadCreateHTTPValidationError.class);
                res.httpValidationError = out;
            }
        }

        return res;
    }

    /**
     * Delete
     * Delete an existing upload. You need only supply the unique identifier that was returned upon upload creation.
     * @param uplId id of the upload
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadDeleteResponse uploadDelete(String uplId) throws Exception {
        org.openapis.openapi.models.operations.UploadDeleteRequest request = new org.openapis.openapi.models.operations.UploadDeleteRequest(uplId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.UploadDeleteRequest.class, baseUrl, "/uploads/{upl_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadDeleteResponse res = new org.openapis.openapi.models.operations.UploadDeleteResponse(contentType, httpRes.statusCode(), httpRes) {{
        }};
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }

    /**
     * Retrieve
     * Retrieves the details of an existing upload. You need only supply the unique upload identifier that was returned upon upload creation.
     * @param uplId id of the upload
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadRetrieveResponse uploadRetrieve(String uplId) throws Exception {
        org.openapis.openapi.models.operations.UploadRetrieveRequest request = new org.openapis.openapi.models.operations.UploadRetrieveRequest(uplId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.UploadRetrieveRequest.class, baseUrl, "/uploads/{upl_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadRetrieveResponse res = new org.openapis.openapi.models.operations.UploadRetrieveResponse(contentType, httpRes.statusCode(), httpRes) {{
            upload = null;
            error = null;
            httpValidationError = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Upload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Upload.class);
                res.upload = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Error.class);
                res.error = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.UploadRetrieveHTTPValidationError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.UploadRetrieveHTTPValidationError.class);
                res.httpValidationError = out;
            }
        }

        return res;
    }

    /**
     * Update
     * Update the details of an existing upload. You need only supply the unique identifier that was returned upon upload creation.
     * @param uplId id of the upload
     * @param uploadUpdatable
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadUpdateResponse uploadUpdate(String uplId, org.openapis.openapi.models.shared.UploadUpdatable uploadUpdatable) throws Exception {
        org.openapis.openapi.models.operations.UploadUpdateRequest request = new org.openapis.openapi.models.operations.UploadUpdateRequest(uplId, uploadUpdatable);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.UploadUpdateRequest.class, baseUrl, "/uploads/{upl_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "uploadUpdatable", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadUpdateResponse res = new org.openapis.openapi.models.operations.UploadUpdateResponse(contentType, httpRes.statusCode(), httpRes) {{
            upload = null;
            error = null;
            httpValidationError = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Upload out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Upload.class);
                res.upload = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Error.class);
                res.error = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.UploadUpdateHTTPValidationError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.UploadUpdateHTTPValidationError.class);
                res.httpValidationError = out;
            }
        }

        return res;
    }

    /**
     * Upload file
     * Upload an [audience file](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide) and associate it with an upload.
     * @param uplId ID of the upload
     * @param requestBody
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadFileResponse uploadFile(String uplId, org.openapis.openapi.models.operations.UploadFileRequestBody requestBody) throws Exception {
        org.openapis.openapi.models.operations.UploadFileRequest request = new org.openapis.openapi.models.operations.UploadFileRequest(uplId, requestBody);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.UploadFileRequest.class, baseUrl, "/uploads/{upl_id}/file", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = org.openapis.openapi.utils.Utils.serializeRequestBody(request, "requestBody", "multipart");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadFileResponse res = new org.openapis.openapi.models.operations.UploadFileResponse(contentType, httpRes.statusCode(), httpRes) {{
            uploadFile = null;
            httpValidationError = null;
        }};
        
        if (httpRes.statusCode() == 202) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.UploadFile out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.UploadFile.class);
                res.uploadFile = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.UploadFileHTTPValidationError out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.UploadFileHTTPValidationError.class);
                res.httpValidationError = out;
            }
        }

        return res;
    }

    /**
     * Create Export
     * Campaign Exports can help you understand exactly which records in a campaign could not be created. By initiating and retrieving an export, you will get row-by-row errors for your campaign. For a step-by-step walkthrough of creating a campaign and exporting failures, see our [Campaigns Guide](https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/launch-your-first-campaign).
     * 
     * Create an export file associated with an upload.
     * @param uplId ID of the upload
     * @param requestBody
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.UploadExportCreateResponse uploadExportCreate(String uplId, org.openapis.openapi.models.operations.UploadExportCreateRequestBody requestBody) throws Exception {
        org.openapis.openapi.models.operations.UploadExportCreateRequest request = new org.openapis.openapi.models.operations.UploadExportCreateRequest(uplId, requestBody);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.UploadExportCreateRequest.class, baseUrl, "/uploads/{upl_id}/exports", request, null);
        
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
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.UploadExportCreateResponse res = new org.openapis.openapi.models.operations.UploadExportCreateResponse(contentType, httpRes.statusCode(), httpRes) {{
            uploadCreateExport = null;
            object = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.UploadCreateExport out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.UploadCreateExport.class);
                res.uploadCreateExport = out;
            }
        }
        else if ((httpRes.statusCode() >= 400 && httpRes.statusCode() < 500)) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.UploadExportCreateResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.UploadExportCreateResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Retrieve Line Item Report
     * Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.
     * @param uplId ID of the upload
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ReportRetrieveResponse reportRetrieve(String uplId) throws Exception {
        return this.reportRetrieve(uplId, null, null, null);
    }

    /**
     * Retrieve Line Item Report
     * Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.
     * @param uplId ID of the upload
     * @param limit How many results to return.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ReportRetrieveResponse reportRetrieve(String uplId, Long limit) throws Exception {
        return this.reportRetrieve(uplId, null, limit, null);
    }

    /**
     * Retrieve Line Item Report
     * Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.
     * @param uplId ID of the upload
     * @param limit How many results to return.
     * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ReportRetrieveResponse reportRetrieve(String uplId, Long limit, Long offset) throws Exception {
        return this.reportRetrieve(uplId, null, limit, offset);
    }

    /**
     * Retrieve Line Item Report
     * Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.
     * @param uplId ID of the upload
     * @param status The status of line items to filter and retrieve. By default all line items are returned.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ReportRetrieveResponse reportRetrieve(String uplId, org.openapis.openapi.models.operations.Status status) throws Exception {
        return this.reportRetrieve(uplId, status, null, null);
    }

    /**
     * Retrieve Line Item Report
     * Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.
     * @param uplId ID of the upload
     * @param status The status of line items to filter and retrieve. By default all line items are returned.
     * @param limit How many results to return.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ReportRetrieveResponse reportRetrieve(String uplId, org.openapis.openapi.models.operations.Status status, Long limit) throws Exception {
        return this.reportRetrieve(uplId, status, limit, null);
    }

    /**
     * Retrieve Line Item Report
     * Retrieves the line item data for each row from the csv file associated with the upload id record. NOTE: This endpoint is currently feature flagged. Please reach out to Lob's support team if you  would like access to this API endpoint.
     * @param uplId ID of the upload
     * @param status The status of line items to filter and retrieve. By default all line items are returned.
     * @param limit How many results to return.
     * @param offset An integer that designates the offset at which to begin returning results. Defaults to 0.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ReportRetrieveResponse reportRetrieve(String uplId, org.openapis.openapi.models.operations.Status status, Long limit, Long offset) throws Exception {
        org.openapis.openapi.models.operations.ReportRetrieveRequest request = new org.openapis.openapi.models.operations.ReportRetrieveRequest(uplId);
        request.status=status;
        request.limit=limit;
        request.offset=offset;
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.ReportRetrieveRequest.class, baseUrl, "/uploads/{upl_id}/report", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = org.openapis.openapi.utils.Utils.getQueryParams(org.openapis.openapi.models.operations.ReportRetrieveRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.ReportRetrieveResponse res = new org.openapis.openapi.models.operations.ReportRetrieveResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredAndThreeApplicationJsonObject = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.ReportRetrieveResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.ReportRetrieveResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.ReportRetrieveUploadsResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.ReportRetrieveUploadsResponseBody.class);
                res.fourHundredAndThreeApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Retrieve Export
     * Retrieves the details of an existing export. You need only supply the unique export identifier that was returned upon export creation. If you try retrieving an export immediately after creating one (i.e., before we're done processing the export), you will get back an export object with `state = in_progress`.
     * @param uplId ID of the upload
     * @param exId ID of the export
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.ExportRetrieveResponse exportRetrieve(String uplId, String exId) throws Exception {
        org.openapis.openapi.models.operations.ExportRetrieveRequest request = new org.openapis.openapi.models.operations.ExportRetrieveRequest(uplId, exId);
        
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.ExportRetrieveRequest.class, baseUrl, "/uploads/{upl_id}/exports/{ex_id}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.ExportRetrieveResponse res = new org.openapis.openapi.models.operations.ExportRetrieveResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.ExportRetrieveResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.ExportRetrieveResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}