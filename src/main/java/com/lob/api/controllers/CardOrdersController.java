/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.controllers;

import com.lob.api.ApiHelper;
import com.lob.api.Server;
import com.lob.api.exceptions.ApiException;
import com.lob.api.exceptions.ErrorErrorException;
import com.lob.api.http.request.HttpMethod;
import com.lob.api.models.CardOrder;
import com.lob.api.models.CardsOrdersResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class CardOrdersController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public CardOrdersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves the card orders associated with the given card id.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @param  limit  Optional parameter: How many results to return.
     * @param  offset  Optional parameter: An integer that designates the offset at which to begin
     *         returning results. Defaults to 0.
     * @return    Returns the CardsOrdersResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CardsOrdersResponse cardOrdersRetrieve(
            final String cardId,
            final Integer limit,
            final Integer offset) throws ApiException, IOException {
        return prepareCardOrdersRetrieveRequest(cardId, limit, offset).execute();
    }

    /**
     * Retrieves the card orders associated with the given card id.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @param  limit  Optional parameter: How many results to return.
     * @param  offset  Optional parameter: An integer that designates the offset at which to begin
     *         returning results. Defaults to 0.
     * @return    Returns the CardsOrdersResponse response from the API call
     */
    public CompletableFuture<CardsOrdersResponse> cardOrdersRetrieveAsync(
            final String cardId,
            final Integer limit,
            final Integer offset) {
        try { 
            return prepareCardOrdersRetrieveRequest(cardId, limit, offset).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for cardOrdersRetrieve.
     */
    private ApiCall<CardsOrdersResponse, ApiException> prepareCardOrdersRetrieveRequest(
            final String cardId,
            final Integer limit,
            final Integer offset) throws IOException {
        return new ApiCall.Builder<CardsOrdersResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/cards/{card_id}/orders")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("offset")
                                .value((offset != null) ? offset : 0).isRequired(false))
                        .templateParam(param -> param.key("card_id").value(cardId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CardsOrdersResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a new card order given information.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @param  quantity  Required parameter: The quantity of cards in the order (minimum 10,000).
     * @return    Returns the CardOrder response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CardOrder cardOrderCreate(
            final String cardId,
            final int quantity) throws ApiException, IOException {
        return prepareCardOrderCreateRequest(cardId, quantity).execute();
    }

    /**
     * Creates a new card order given information.
     * @param  cardId  Required parameter: The ID of the card to which the card orders belong.
     * @param  quantity  Required parameter: The quantity of cards in the order (minimum 10,000).
     * @return    Returns the CardOrder response from the API call
     */
    public CompletableFuture<CardOrder> cardOrderCreateAsync(
            final String cardId,
            final int quantity) {
        try { 
            return prepareCardOrderCreateRequest(cardId, quantity).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for cardOrderCreate.
     */
    private ApiCall<CardOrder, ApiException> prepareCardOrderCreateRequest(
            final String cardId,
            final int quantity) throws IOException {
        return new ApiCall.Builder<CardOrder, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/cards/{card_id}/orders")
                        .formParam(param -> param.key("quantity")
                                .value(quantity).isRequired(false))
                        .templateParam(param -> param.key("card_id").value(cardId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CardOrder.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}