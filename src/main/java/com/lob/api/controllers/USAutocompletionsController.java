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
import com.lob.api.models.CaseEnum;
import com.lob.api.models.UsAutocompletions;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class USAutocompletionsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public USAutocompletionsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Given an address prefix consisting of a partial primary line, as well as optional input of
     * city, state, and zip code, this functionality returns up to 10 full US address suggestions.
     * Not all of them will turn out to be valid addresses; they'll need to be
     * [verified](#operation/verification_us).
     * @param  addressPrefix  Required parameter: Only accepts numbers and street names in an
     *         alphanumeric format.
     * @param  mCase  Optional parameter: Casing of the verified address. Possible values are
     *         `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"),
     *         respectively. Only affects `primary_line`, `city`, and `state`. Default casing is
     *         `upper`.
     * @param  validAddresses  Optional parameter: Possible values are `true` and `false`. If false,
     *         not all of the suggestions in the response will be valid addresses; they'll need to
     *         be verified in order to determine the deliverability. The valid_addresses flag will
     *         greatly reduce the number of keystrokes needed before reaching an intended address.
     * @param  city  Optional parameter: An optional city input used to filter suggestions. Case
     *         insensitive and does not match partial abbreviations.
     * @param  state  Optional parameter: An optional state input used to filter suggestions. Case
     *         insensitive and does not match partial abbreviations.
     * @param  zipCode  Optional parameter: An optional ZIP Code input used to filter suggestions.
     *         Matches partial entries.
     * @param  geoIpSort  Optional parameter: If `true`, sort suggestions by proximity to the IP set
     *         in the `X-Forwarded-For` header.
     * @return    Returns the UsAutocompletions response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public UsAutocompletions autocompletion(
            final String addressPrefix,
            final CaseEnum mCase,
            final Boolean validAddresses,
            final String city,
            final String state,
            final String zipCode,
            final Boolean geoIpSort) throws ApiException, IOException {
        return prepareAutocompletionRequest(addressPrefix, mCase, validAddresses, city, state,
                zipCode, geoIpSort).execute();
    }

    /**
     * Given an address prefix consisting of a partial primary line, as well as optional input of
     * city, state, and zip code, this functionality returns up to 10 full US address suggestions.
     * Not all of them will turn out to be valid addresses; they'll need to be
     * [verified](#operation/verification_us).
     * @param  addressPrefix  Required parameter: Only accepts numbers and street names in an
     *         alphanumeric format.
     * @param  mCase  Optional parameter: Casing of the verified address. Possible values are
     *         `upper` and `proper` for uppercased (e.g. "PO BOX") and proper-cased (e.g. "PO Box"),
     *         respectively. Only affects `primary_line`, `city`, and `state`. Default casing is
     *         `upper`.
     * @param  validAddresses  Optional parameter: Possible values are `true` and `false`. If false,
     *         not all of the suggestions in the response will be valid addresses; they'll need to
     *         be verified in order to determine the deliverability. The valid_addresses flag will
     *         greatly reduce the number of keystrokes needed before reaching an intended address.
     * @param  city  Optional parameter: An optional city input used to filter suggestions. Case
     *         insensitive and does not match partial abbreviations.
     * @param  state  Optional parameter: An optional state input used to filter suggestions. Case
     *         insensitive and does not match partial abbreviations.
     * @param  zipCode  Optional parameter: An optional ZIP Code input used to filter suggestions.
     *         Matches partial entries.
     * @param  geoIpSort  Optional parameter: If `true`, sort suggestions by proximity to the IP set
     *         in the `X-Forwarded-For` header.
     * @return    Returns the UsAutocompletions response from the API call
     */
    public CompletableFuture<UsAutocompletions> autocompletionAsync(
            final String addressPrefix,
            final CaseEnum mCase,
            final Boolean validAddresses,
            final String city,
            final String state,
            final String zipCode,
            final Boolean geoIpSort) {
        try { 
            return prepareAutocompletionRequest(addressPrefix, mCase, validAddresses, city, state, zipCode,
            geoIpSort).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for autocompletion.
     */
    private ApiCall<UsAutocompletions, ApiException> prepareAutocompletionRequest(
            final String addressPrefix,
            final CaseEnum mCase,
            final Boolean validAddresses,
            final String city,
            final String state,
            final String zipCode,
            final Boolean geoIpSort) throws IOException {
        return new ApiCall.Builder<UsAutocompletions, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/us_autocompletions")
                        .formParam(param -> param.key("address_prefix")
                                .value(addressPrefix))
                        .formParam(param -> param.key("city")
                                .value(city).isRequired(false))
                        .formParam(param -> param.key("state")
                                .value(state).isRequired(false))
                        .formParam(param -> param.key("zip_code")
                                .value(zipCode).isRequired(false))
                        .formParam(param -> param.key("geo_ip_sort")
                                .value(geoIpSort).isRequired(false))
                        .queryParam(param -> param.key("case")
                                .value((mCase != null) ? mCase.value() : "upper").isRequired(false))
                        .queryParam(param -> param.key("valid_addresses")
                                .value((validAddresses != null) ? validAddresses : false).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, UsAutocompletions.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}