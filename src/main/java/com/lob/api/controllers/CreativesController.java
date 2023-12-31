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
import com.lob.api.models.Creative;
import com.lob.api.models.XLangOutputEnum;
import com.lob.api.models.containers.CreativeWritable3;
import com.lob.api.models.containers.FromAttribute;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CreativesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CreativesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a new creative with the provided properties.
     * @param  body  Required parameter: Example:
     * @param  xLangOutput  Optional parameter: * `native` - Translate response to the native
     *         language of the country in the request * `match` - match the response to the language
     *         in the request Default response is in English.
     * @return    Returns the Creative response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Creative creativeCreate(
            final CreativeWritable3 body,
            final XLangOutputEnum xLangOutput) throws ApiException, IOException {
        return prepareCreativeCreateRequest(body, xLangOutput).execute();
    }

    /**
     * Creates a new creative with the provided properties.
     * @param  body  Required parameter: Example:
     * @param  xLangOutput  Optional parameter: * `native` - Translate response to the native
     *         language of the country in the request * `match` - match the response to the language
     *         in the request Default response is in English.
     * @return    Returns the Creative response from the API call
     */
    public CompletableFuture<Creative> creativeCreateAsync(
            final CreativeWritable3 body,
            final XLangOutputEnum xLangOutput) {
        try { 
            return prepareCreativeCreateRequest(body, xLangOutput).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for creativeCreate.
     */
    private ApiCall<Creative, ApiException> prepareCreativeCreateRequest(
            final CreativeWritable3 body,
            final XLangOutputEnum xLangOutput) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Creative, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/creatives")
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
                                response -> ApiHelper.deserialize(response, Creative.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves the details of an existing creative. You need only supply the unique creative
     * identifier that was returned upon creative creation.
     * @param  crvId  Required parameter: id of the creative
     * @return    Returns the Creative response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Creative creativeRetrieve(
            final String crvId) throws ApiException, IOException {
        return prepareCreativeRetrieveRequest(crvId).execute();
    }

    /**
     * Retrieves the details of an existing creative. You need only supply the unique creative
     * identifier that was returned upon creative creation.
     * @param  crvId  Required parameter: id of the creative
     * @return    Returns the Creative response from the API call
     */
    public CompletableFuture<Creative> creativeRetrieveAsync(
            final String crvId) {
        try { 
            return prepareCreativeRetrieveRequest(crvId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for creativeRetrieve.
     */
    private ApiCall<Creative, ApiException> prepareCreativeRetrieveRequest(
            final String crvId) throws IOException {
        return new ApiCall.Builder<Creative, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/creatives/{crv_id}")
                        .templateParam(param -> param.key("crv_id").value(crvId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Creative.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Update the details of an existing creative. You need only supply the unique identifier that
     * was returned upon creative creation.
     * @param  crvId  Required parameter: id of the creative
     * @param  from  Optional parameter: Must either be an address ID or an inline object with
     *         correct address parameters. All addresses will be standardized into uppercase without
     *         being modified by verification.
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  metadata  Optional parameter: Use metadata to store custom information for tagging
     *         and labeling back to your internal systems. Must be an object with up to 20 key-value
     *         pairs. Keys must be at most 40 characters and values must be at most 500 characters.
     *         Neither can contain the characters `"` and `\`. i.e. '{"customer_id" :
     *         "NEWYORK2015"}' Nested objects are not supported. See [Metadata](#section/Metadata)
     *         for more information.
     * @return    Returns the Creative response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Creative creativeUpdate(
            final String crvId,
            final FromAttribute from,
            final String description,
            final Map<String, String> metadata) throws ApiException, IOException {
        return prepareCreativeUpdateRequest(crvId, from, description, metadata).execute();
    }

    /**
     * Update the details of an existing creative. You need only supply the unique identifier that
     * was returned upon creative creation.
     * @param  crvId  Required parameter: id of the creative
     * @param  from  Optional parameter: Must either be an address ID or an inline object with
     *         correct address parameters. All addresses will be standardized into uppercase without
     *         being modified by verification.
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  metadata  Optional parameter: Use metadata to store custom information for tagging
     *         and labeling back to your internal systems. Must be an object with up to 20 key-value
     *         pairs. Keys must be at most 40 characters and values must be at most 500 characters.
     *         Neither can contain the characters `"` and `\`. i.e. '{"customer_id" :
     *         "NEWYORK2015"}' Nested objects are not supported. See [Metadata](#section/Metadata)
     *         for more information.
     * @return    Returns the Creative response from the API call
     */
    public CompletableFuture<Creative> creativeUpdateAsync(
            final String crvId,
            final FromAttribute from,
            final String description,
            final Map<String, String> metadata) {
        try { 
            return prepareCreativeUpdateRequest(crvId, from, description, metadata).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for creativeUpdate.
     */
    private ApiCall<Creative, ApiException> prepareCreativeUpdateRequest(
            final String crvId,
            final FromAttribute from,
            final String description,
            final Map<String, String> metadata) throws IOException {
        return new ApiCall.Builder<Creative, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/creatives/{crv_id}")
                        .formParam(param -> param.key("from")
                                .value(from).isRequired(false))
                        .formParam(param -> param.key("description")
                                .value(description).isRequired(false))
                        .formParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .templateParam(param -> param.key("crv_id").value(crvId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Creative.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}