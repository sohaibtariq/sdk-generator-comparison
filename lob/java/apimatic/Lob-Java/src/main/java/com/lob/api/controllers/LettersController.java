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
import com.lob.api.models.AllLetters;
import com.lob.api.models.BeforeAfter;
import com.lob.api.models.LetterDeletion;
import com.lob.api.models.LetterEditable;
import com.lob.api.models.MailTypeEnum;
import com.lob.api.models.SortBy1;
import com.lob.api.models.containers.Letter;
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
public final class LettersController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public LettersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves the details of an existing letter. You need only supply the unique letter
     * identifier that was returned upon letter creation.
     * @param  ltrId  Required parameter: id of the letter
     * @return    Returns the Letter response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Letter letterRetrieve(
            final String ltrId) throws ApiException, IOException {
        return prepareLetterRetrieveRequest(ltrId).execute();
    }

    /**
     * Retrieves the details of an existing letter. You need only supply the unique letter
     * identifier that was returned upon letter creation.
     * @param  ltrId  Required parameter: id of the letter
     * @return    Returns the Letter response from the API call
     */
    public CompletableFuture<Letter> letterRetrieveAsync(
            final String ltrId) {
        try { 
            return prepareLetterRetrieveRequest(ltrId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for letterRetrieve.
     */
    private ApiCall<Letter, ApiException> prepareLetterRetrieveRequest(
            final String ltrId) throws IOException {
        return new ApiCall.Builder<Letter, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/letters/{ltr_id}")
                        .templateParam(param -> param.key("ltr_id").value(ltrId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Letter.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Completely removes a letter from production. This can only be done if the letter has a
     * `send_date` and the `send_date` has not yet passed. If the letter is successfully canceled,
     * you will not be charged for it. Read more on [cancellation
     * windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings).
     * Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;
     * to gain access.
     * @param  ltrId  Required parameter: id of the letter
     * @return    Returns the LetterDeletion response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public LetterDeletion letterCancel(
            final String ltrId) throws ApiException, IOException {
        return prepareLetterCancelRequest(ltrId).execute();
    }

    /**
     * Completely removes a letter from production. This can only be done if the letter has a
     * `send_date` and the `send_date` has not yet passed. If the letter is successfully canceled,
     * you will not be charged for it. Read more on [cancellation
     * windows](#section/Cancellation-Windows) and [scheduling](#section/Scheduled-Mailings).
     * Scheduling and cancellation is a premium feature. Upgrade to the appropriate &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail Edition&lt;/a&gt;
     * to gain access.
     * @param  ltrId  Required parameter: id of the letter
     * @return    Returns the LetterDeletion response from the API call
     */
    public CompletableFuture<LetterDeletion> letterCancelAsync(
            final String ltrId) {
        try { 
            return prepareLetterCancelRequest(ltrId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for letterCancel.
     */
    private ApiCall<LetterDeletion, ApiException> prepareLetterCancelRequest(
            final String ltrId) throws IOException {
        return new ApiCall.Builder<LetterDeletion, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/letters/{ltr_id}")
                        .templateParam(param -> param.key("ltr_id").value(ltrId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, LetterDeletion.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list of your letters. The letters are returned sorted by creation date, with the
     * most recently created letters appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @param  color  Optional parameter: Set to `true` to return only color letters. Set to `false`
     *         to return only black &amp; white letters.
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
     * @return    Returns the AllLetters response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AllLetters lettersList(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata,
            final Boolean color,
            final Boolean scheduled,
            final SendDate sendDate,
            final MailTypeEnum mailType,
            final SortBy1 sortBy) throws ApiException, IOException {
        return prepareLettersListRequest(limit, beforeAfter, include, dateCreated, metadata, color,
                scheduled, sendDate, mailType, sortBy).execute();
    }

    /**
     * Returns a list of your letters. The letters are returned sorted by creation date, with the
     * most recently created letters appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @param  color  Optional parameter: Set to `true` to return only color letters. Set to `false`
     *         to return only black &amp; white letters.
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
     * @return    Returns the AllLetters response from the API call
     */
    public CompletableFuture<AllLetters> lettersListAsync(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata,
            final Boolean color,
            final Boolean scheduled,
            final SendDate sendDate,
            final MailTypeEnum mailType,
            final SortBy1 sortBy) {
        try { 
            return prepareLettersListRequest(limit, beforeAfter, include, dateCreated, metadata, color,
            scheduled, sendDate, mailType, sortBy).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for lettersList.
     */
    private ApiCall<AllLetters, ApiException> prepareLettersListRequest(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata,
            final Boolean color,
            final Boolean scheduled,
            final SendDate sendDate,
            final MailTypeEnum mailType,
            final SortBy1 sortBy) throws IOException {
        return new ApiCall.Builder<AllLetters, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/letters")
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
                        .queryParam(param -> param.key("color")
                                .value(color).isRequired(false))
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
                                response -> ApiHelper.deserialize(response, AllLetters.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a new letter given information.
     * @param  body  Required parameter: Example:
     * @param  idempotencyKey  Optional parameter: A string of no longer than 256 characters that
     *         uniquely identifies this resource. For more help integrating idempotency keys, refer
     *         to our &lt;a
     *         href="https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12"
     *         target="_blank"&gt;implementation guide&lt;/a&gt;.
     * @return    Returns the Letter response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Letter letterCreate(
            final LetterEditable body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareLetterCreateRequest(body, idempotencyKey).execute();
    }

    /**
     * Creates a new letter given information.
     * @param  body  Required parameter: Example:
     * @param  idempotencyKey  Optional parameter: A string of no longer than 256 characters that
     *         uniquely identifies this resource. For more help integrating idempotency keys, refer
     *         to our &lt;a
     *         href="https://help.lob.com/print-and-mail/building-a-mail-strategy/managing-mail-settings#idempotent-requests-12"
     *         target="_blank"&gt;implementation guide&lt;/a&gt;.
     * @return    Returns the Letter response from the API call
     */
    public CompletableFuture<Letter> letterCreateAsync(
            final LetterEditable body,
            final String idempotencyKey) {
        try { 
            return prepareLetterCreateRequest(body, idempotencyKey).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for letterCreate.
     */
    private ApiCall<Letter, ApiException> prepareLetterCreateRequest(
            final LetterEditable body,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<Letter, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/letters")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("Idempotency-Key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Letter.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}