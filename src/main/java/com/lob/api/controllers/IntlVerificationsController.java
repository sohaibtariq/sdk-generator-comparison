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
import com.lob.api.models.IntlVerification;
import com.lob.api.models.IntlVerifications;
import com.lob.api.models.MultipleComponentsIntl;
import com.lob.api.models.XLangOutputEnum;
import com.lob.api.models.containers.IntlVerificationWritable;
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
public final class IntlVerificationsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public IntlVerificationsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Verify a list of international (except US or US territories) address _with a live API key_.
     * Requests to this endpoint with a test API key will return a dummy response based on the
     * primary line you input.
     * @param  addresses  Required parameter: Example:
     * @return    Returns the IntlVerifications response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IntlVerifications bulkIntlVerifications(
            final List<MultipleComponentsIntl> addresses) throws ApiException, IOException {
        return prepareBulkIntlVerificationsRequest(addresses).execute();
    }

    /**
     * Verify a list of international (except US or US territories) address _with a live API key_.
     * Requests to this endpoint with a test API key will return a dummy response based on the
     * primary line you input.
     * @param  addresses  Required parameter: Example:
     * @return    Returns the IntlVerifications response from the API call
     */
    public CompletableFuture<IntlVerifications> bulkIntlVerificationsAsync(
            final List<MultipleComponentsIntl> addresses) {
        try { 
            return prepareBulkIntlVerificationsRequest(addresses).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bulkIntlVerifications.
     */
    private ApiCall<IntlVerifications, ApiException> prepareBulkIntlVerificationsRequest(
            final List<MultipleComponentsIntl> addresses) throws IOException {
        return new ApiCall.Builder<IntlVerifications, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/bulk/intl_verifications")
                        .formParam(param -> param.key("addresses")
                                .value(addresses))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, IntlVerifications.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Verify an international (except US or US territories) address _with a live API key_. Requests
     * to this endpoint with a test API key will return a dummy response based on the primary line
     * you input.
     * @param  body  Required parameter: Example:
     * @param  xLangOutput  Optional parameter: * `native` - Translate response to the native
     *         language of the country in the request * `match` - match the response to the language
     *         in the request Default response is in English.
     * @return    Returns the IntlVerification response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IntlVerification intlVerification(
            final IntlVerificationWritable body,
            final XLangOutputEnum xLangOutput) throws ApiException, IOException {
        return prepareIntlVerificationRequest(body, xLangOutput).execute();
    }

    /**
     * Verify an international (except US or US territories) address _with a live API key_. Requests
     * to this endpoint with a test API key will return a dummy response based on the primary line
     * you input.
     * @param  body  Required parameter: Example:
     * @param  xLangOutput  Optional parameter: * `native` - Translate response to the native
     *         language of the country in the request * `match` - match the response to the language
     *         in the request Default response is in English.
     * @return    Returns the IntlVerification response from the API call
     */
    public CompletableFuture<IntlVerification> intlVerificationAsync(
            final IntlVerificationWritable body,
            final XLangOutputEnum xLangOutput) {
        try { 
            return prepareIntlVerificationRequest(body, xLangOutput).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for intlVerification.
     */
    private ApiCall<IntlVerification, ApiException> prepareIntlVerificationRequest(
            final IntlVerificationWritable body,
            final XLangOutputEnum xLangOutput) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<IntlVerification, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/intl_verifications")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("x-lang-output")
                                .value((xLangOutput != null) ? xLangOutput.value() : null).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, IntlVerification.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}