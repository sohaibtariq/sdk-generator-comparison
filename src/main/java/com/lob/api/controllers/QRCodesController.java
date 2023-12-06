/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import com.lob.api.ApiHelper;
import com.lob.api.Server;
import com.lob.api.exceptions.ApiException;
import com.lob.api.http.request.HttpMethod;
import com.lob.api.models.QrCodeAnalyticsResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class QRCodesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public QRCodesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns a list of your QR codes. The QR codes are returned sorted by scan date, with the most
     * recently scanned QR codes appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  offset  Optional parameter: An integer that designates the offset at which to begin
     *         returning results. Defaults to 0.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  scanned  Optional parameter: Filter list of responses to only include QR codes with
     *         at least one scan event.
     * @param  resourceIds  Optional parameter: Filter by the resource ID.
     * @return    Returns the QrCodeAnalyticsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public QrCodeAnalyticsResponse qrCodesList(
            final Integer limit,
            final Integer offset,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Boolean scanned,
            final List<String> resourceIds) throws ApiException, IOException {
        return prepareQrCodesListRequest(limit, offset, include, dateCreated, scanned,
                resourceIds).execute();
    }

    /**
     * Returns a list of your QR codes. The QR codes are returned sorted by scan date, with the most
     * recently scanned QR codes appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  offset  Optional parameter: An integer that designates the offset at which to begin
     *         returning results. Defaults to 0.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  scanned  Optional parameter: Filter list of responses to only include QR codes with
     *         at least one scan event.
     * @param  resourceIds  Optional parameter: Filter by the resource ID.
     * @return    Returns the QrCodeAnalyticsResponse response from the API call
     */
    public CompletableFuture<QrCodeAnalyticsResponse> qrCodesListAsync(
            final Integer limit,
            final Integer offset,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Boolean scanned,
            final List<String> resourceIds) {
        try { 
            return prepareQrCodesListRequest(limit, offset, include, dateCreated, scanned,
            resourceIds).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for qrCodesList.
     */
    private ApiCall<QrCodeAnalyticsResponse, ApiException> prepareQrCodesListRequest(
            final Integer limit,
            final Integer offset,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Boolean scanned,
            final List<String> resourceIds) throws IOException {
        return new ApiCall.Builder<QrCodeAnalyticsResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/qr_code_analytics")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("offset")
                                .value((offset != null) ? offset : 0).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value(include).isRequired(false))
                        .queryParam(param -> param.key("date_created")
                                .value(dateCreated).isRequired(false))
                        .queryParam(param -> param.key("scanned")
                                .value(scanned).isRequired(false))
                        .queryParam(param -> param.key("resource_ids")
                                .value(resourceIds).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, QrCodeAnalyticsResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}