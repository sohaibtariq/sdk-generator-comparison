/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lob.api.ApiHelper;
import com.lob.api.Server;
import com.lob.api.exceptions.ApiException;
import com.lob.api.exceptions.ErrorErrorException;
import com.lob.api.http.request.HttpMethod;
import com.lob.api.models.CaseEnum;
import com.lob.api.models.MultipleComponents;
import com.lob.api.models.UsVerification;
import com.lob.api.models.UsVerifications;
import com.lob.api.models.containers.UsVerificationsWritable;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class USVerificationsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public USVerificationsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Verify a list of US or US territory addresses _with a live API key_. Requests to this
     * endpoint with a test API key will return a dummy response based on the primary line you
     * input.
     * @param  addresses  Required parameter: Example:
     * @param  mCase  Optional parameter: Casing of the verified address. Possible values are
     *         `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"),
     *         respectively. Only affects `recipient`, `primary_line`, `secondary_line`,
     *         `urbanization`, and `last_line`. Default casing is `upper`.
     * @return    Returns the UsVerifications response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UsVerifications bulkUsVerifications(
            final List<MultipleComponents> addresses,
            final CaseEnum mCase) throws ApiException, IOException {
        return prepareBulkUsVerificationsRequest(addresses, mCase).execute();
    }

    /**
     * Verify a list of US or US territory addresses _with a live API key_. Requests to this
     * endpoint with a test API key will return a dummy response based on the primary line you
     * input.
     * @param  addresses  Required parameter: Example:
     * @param  mCase  Optional parameter: Casing of the verified address. Possible values are
     *         `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"),
     *         respectively. Only affects `recipient`, `primary_line`, `secondary_line`,
     *         `urbanization`, and `last_line`. Default casing is `upper`.
     * @return    Returns the UsVerifications response from the API call
     */
    public CompletableFuture<UsVerifications> bulkUsVerificationsAsync(
            final List<MultipleComponents> addresses,
            final CaseEnum mCase) {
        try { 
            return prepareBulkUsVerificationsRequest(addresses, mCase).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bulkUsVerifications.
     */
    private ApiCall<UsVerifications, ApiException> prepareBulkUsVerificationsRequest(
            final List<MultipleComponents> addresses,
            final CaseEnum mCase) throws IOException {
        return new ApiCall.Builder<UsVerifications, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/bulk/us_verifications")
                        .formParam(param -> param.key("addresses")
                                .value(addresses))
                        .queryParam(param -> param.key("case")
                                .value((mCase != null) ? mCase.value() : "upper").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UsVerifications.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Verify a US or US territory address _with a live API key_. The address can be in components
     * (e.g. `primary_line` is "210 King Street", `zip_code` is "94107") or as a single string (e.g.
     * "210 King Street 94107"), but not as both. Requests using a test API key validate required
     * fields but return empty values unless specific `primary_line` values are provided. See the
     * [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.
     * @param  body  Required parameter: Example:
     * @param  mCase  Optional parameter: Casing of the verified address. Possible values are
     *         `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"),
     *         respectively. Only affects `recipient`, `primary_line`, `secondary_line`,
     *         `urbanization`, and `last_line`. Default casing is `upper`.
     * @return    Returns the UsVerification response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UsVerification usVerification(
            final UsVerificationsWritable body,
            final CaseEnum mCase) throws ApiException, IOException {
        return prepareUsVerificationRequest(body, mCase).execute();
    }

    /**
     * Verify a US or US territory address _with a live API key_. The address can be in components
     * (e.g. `primary_line` is "210 King Street", `zip_code` is "94107") or as a single string (e.g.
     * "210 King Street 94107"), but not as both. Requests using a test API key validate required
     * fields but return empty values unless specific `primary_line` values are provided. See the
     * [US Verifications Test Environment](#section/US-Verifications-Test-Env) for details.
     * @param  body  Required parameter: Example:
     * @param  mCase  Optional parameter: Casing of the verified address. Possible values are
     *         `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"),
     *         respectively. Only affects `recipient`, `primary_line`, `secondary_line`,
     *         `urbanization`, and `last_line`. Default casing is `upper`.
     * @return    Returns the UsVerification response from the API call
     */
    public CompletableFuture<UsVerification> usVerificationAsync(
            final UsVerificationsWritable body,
            final CaseEnum mCase) {
        try { 
            return prepareUsVerificationRequest(body, mCase).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for usVerification.
     */
    private ApiCall<UsVerification, ApiException> prepareUsVerificationRequest(
            final UsVerificationsWritable body,
            final CaseEnum mCase) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<UsVerification, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/us_verifications")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .queryParam(param -> param.key("case")
                                .value((mCase != null) ? mCase.value() : "upper").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UsVerification.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}