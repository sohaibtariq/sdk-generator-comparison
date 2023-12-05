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
import com.lob.api.models.containers.IdentityValidation;
import com.lob.api.models.containers.IdentityValidationWritable;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class IdentityValidationController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public IdentityValidationController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Validates whether a given name is associated with an address.
     * @param  body  Required parameter: Example:
     * @return    Returns the IdentityValidation response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public IdentityValidation identityValidation(
            final IdentityValidationWritable body) throws ApiException, IOException {
        return prepareIdentityValidationRequest(body).execute();
    }

    /**
     * Validates whether a given name is associated with an address.
     * @param  body  Required parameter: Example:
     * @return    Returns the IdentityValidation response from the API call
     */
    public CompletableFuture<IdentityValidation> identityValidationAsync(
            final IdentityValidationWritable body) {
        try { 
            return prepareIdentityValidationRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for identityValidation.
     */
    private ApiCall<IdentityValidation, ApiException> prepareIdentityValidationRequest(
            final IdentityValidationWritable body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<IdentityValidation, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/identity_validation")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, IdentityValidation.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}