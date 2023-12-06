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
import com.lob.api.models.AllChecks;
import com.lob.api.models.BeforeAfter;
import com.lob.api.models.Check;
import com.lob.api.models.CheckDeletion;
import com.lob.api.models.MailTypeEnum;
import com.lob.api.models.SortBy1;
import com.lob.api.models.containers.CheckEditable;
import com.lob.api.models.containers.SendDate;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class ChecksController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public ChecksController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns a list of your checks. The checks are returned sorted by creation date, with the most
     * recently created checks appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @param  scheduled  Optional parameter: * `true` - only return orders (past or future) where
     *         `send_date` is greater than `date_created` * `false` - only return orders where
     *         `send_date` is equal to `date_created`
     * @param  sendDate  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ "gt":
     *         "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is &gt;, `lt` is &lt;, `gte`
     *         is ≥, and `lte` is ≤.
     * @param  mailType  Optional parameter: A string designating the mail postage type: *
     *         `usps_first_class` - (default) * `usps_standard` - a &lt;a
     *         href="https://lob.com/pricing/print-mail#compare" target="_blank"&gt;cheaper
     *         option&lt;/a&gt; which is less predictable and takes longer to deliver.
     *         `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside
     *         of the United States.
     * @param  sortBy  Optional parameter: Sorts items by ascending or descending dates. Use either
     *         `date_created` or `send_date`, not both.
     * @return    Returns the AllChecks response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AllChecks checksList(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata,
            final Boolean scheduled,
            final SendDate sendDate,
            final MailTypeEnum mailType,
            final SortBy1 sortBy) throws ApiException, IOException {
        return prepareChecksListRequest(limit, beforeAfter, include, dateCreated, metadata,
                scheduled, sendDate, mailType, sortBy).execute();
    }

    /**
     * Returns a list of your checks. The checks are returned sorted by creation date, with the most
     * recently created checks appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @param  scheduled  Optional parameter: * `true` - only return orders (past or future) where
     *         `send_date` is greater than `date_created` * `false` - only return orders where
     *         `send_date` is equal to `date_created`
     * @param  sendDate  Optional parameter: Filter by ISO-8601 date or datetime, e.g. `{ "gt":
     *         "2012-01-01", "lt": "2012-01-31T12:34:56Z" }` where `gt` is &gt;, `lt` is &lt;, `gte`
     *         is ≥, and `lte` is ≤.
     * @param  mailType  Optional parameter: A string designating the mail postage type: *
     *         `usps_first_class` - (default) * `usps_standard` - a &lt;a
     *         href="https://lob.com/pricing/print-mail#compare" target="_blank"&gt;cheaper
     *         option&lt;/a&gt; which is less predictable and takes longer to deliver.
     *         `usps_standard` cannot be used with `4x6` postcards or for any postcards sent outside
     *         of the United States.
     * @param  sortBy  Optional parameter: Sorts items by ascending or descending dates. Use either
     *         `date_created` or `send_date`, not both.
     * @return    Returns the AllChecks response from the API call
     */
    public CompletableFuture<AllChecks> checksListAsync(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata,
            final Boolean scheduled,
            final SendDate sendDate,
            final MailTypeEnum mailType,
            final SortBy1 sortBy) {
        try { 
            return prepareChecksListRequest(limit, beforeAfter, include, dateCreated, metadata, scheduled,
            sendDate, mailType, sortBy).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for checksList.
     */
    private ApiCall<AllChecks, ApiException> prepareChecksListRequest(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata,
            final Boolean scheduled,
            final SendDate sendDate,
            final MailTypeEnum mailType,
            final SortBy1 sortBy) throws IOException {
        return new ApiCall.Builder<AllChecks, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/checks")
                        .queryParam(param -> param.key("limit")
                                .value((limit != null) ? limit : 10).isRequired(false))
                        .queryParam(param -> param.key("before/after")
                                .value(beforeAfter).isRequired(false))
                        .queryParam(param -> param.key("include")
                                .value(include).isRequired(false))
                        .queryParam(param -> param.key("date_created")
                                .value(dateCreated).isRequired(false))
                        .queryParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .queryParam(param -> param.key("scheduled")
                                .value(scheduled).isRequired(false))
                        .queryParam(param -> param.key("send_date")
                                .value(sendDate).isRequired(false))
                        .queryParam(param -> param.key("mail_type")
                                .value((mailType != null) ? mailType.value() : "usps_first_class").isRequired(false))
                        .queryParam(param -> param.key("sort_by")
                                .value(sortBy).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AllChecks.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a new check with the provided properties.
     * @param  body  Required parameter: Example:
     * @param  idempotencyKey  Optional parameter: A string of no longer than 256 characters that
     *         uniquely identifies this resource. For more help integrating idempotency keys, refer
     *         to our &lt;a
     *         href="https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12"
     *         target="_blank"&gt;implementation guide&lt;/a&gt;.
     * @return    Returns the Check response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Check checkCreate(
            final CheckEditable body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCheckCreateRequest(body, idempotencyKey).execute();
    }

    /**
     * Creates a new check with the provided properties.
     * @param  body  Required parameter: Example:
     * @param  idempotencyKey  Optional parameter: A string of no longer than 256 characters that
     *         uniquely identifies this resource. For more help integrating idempotency keys, refer
     *         to our &lt;a
     *         href="https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12"
     *         target="_blank"&gt;implementation guide&lt;/a&gt;.
     * @return    Returns the Check response from the API call
     */
    public CompletableFuture<Check> checkCreateAsync(
            final CheckEditable body,
            final String idempotencyKey) {
        try { 
            return prepareCheckCreateRequest(body, idempotencyKey).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for checkCreate.
     */
    private ApiCall<Check, ApiException> prepareCheckCreateRequest(
            final CheckEditable body,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Check, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/checks")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serializeTypeCombinator(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("Idempotency-Key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Check.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves the details of an existing check. You need only supply the unique check identifier
     * that was returned upon check creation.
     * @param  chkId  Required parameter: id of the check
     * @return    Returns the Check response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Check checkRetrieve(
            final String chkId) throws ApiException, IOException {
        return prepareCheckRetrieveRequest(chkId).execute();
    }

    /**
     * Retrieves the details of an existing check. You need only supply the unique check identifier
     * that was returned upon check creation.
     * @param  chkId  Required parameter: id of the check
     * @return    Returns the Check response from the API call
     */
    public CompletableFuture<Check> checkRetrieveAsync(
            final String chkId) {
        try { 
            return prepareCheckRetrieveRequest(chkId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for checkRetrieve.
     */
    private ApiCall<Check, ApiException> prepareCheckRetrieveRequest(
            final String chkId) throws IOException {
        return new ApiCall.Builder<Check, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/checks/{chk_id}")
                        .templateParam(param -> param.key("chk_id").value(chkId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Check.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Completely removes a check from production. This can only be done if the check has a
     * `send_date` and the `send_date` has not yet passed. If the check is successfully canceled,
     * you will not be charged for it. Read more on [cancellation
     * windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings).
     * Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;
     * to gain access.
     * @param  chkId  Required parameter: id of the check
     * @return    Returns the CheckDeletion response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public CheckDeletion checkCancel(
            final String chkId) throws ApiException, IOException {
        return prepareCheckCancelRequest(chkId).execute();
    }

    /**
     * Completely removes a check from production. This can only be done if the check has a
     * `send_date` and the `send_date` has not yet passed. If the check is successfully canceled,
     * you will not be charged for it. Read more on [cancellation
     * windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings).
     * Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;
     * to gain access.
     * @param  chkId  Required parameter: id of the check
     * @return    Returns the CheckDeletion response from the API call
     */
    public CompletableFuture<CheckDeletion> checkCancelAsync(
            final String chkId) {
        try { 
            return prepareCheckCancelRequest(chkId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for checkCancel.
     */
    private ApiCall<CheckDeletion, ApiException> prepareCheckCancelRequest(
            final String chkId) throws IOException {
        return new ApiCall.Builder<CheckDeletion, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/checks/{chk_id}")
                        .templateParam(param -> param.key("chk_id").value(chkId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, CheckDeletion.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}