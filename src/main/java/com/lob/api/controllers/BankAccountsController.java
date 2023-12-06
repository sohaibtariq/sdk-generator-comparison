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
import com.lob.api.models.AccountTypeEnum;
import com.lob.api.models.AllBankAccounts;
import com.lob.api.models.BankAccount;
import com.lob.api.models.BankDeletion;
import com.lob.api.models.BeforeAfter;
import com.lob.api.models.CheckTemplateEnum;
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
public final class BankAccountsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public BankAccountsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Verify a bank account in order to create a check.
     * @param  bankId  Required parameter: id of the bank account to be verified
     * @param  amounts  Required parameter: In live mode, an array containing the two micro deposits
     *         (in cents) placed in the bank account. In test mode, no micro deposits will be
     *         placed, so any two integers between `1` and `100` will work.
     * @return    Returns the BankAccount response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccount bankAccountVerify(
            final String bankId,
            final List<Integer> amounts) throws ApiException, IOException {
        return prepareBankAccountVerifyRequest(bankId, amounts).execute();
    }

    /**
     * Verify a bank account in order to create a check.
     * @param  bankId  Required parameter: id of the bank account to be verified
     * @param  amounts  Required parameter: In live mode, an array containing the two micro deposits
     *         (in cents) placed in the bank account. In test mode, no micro deposits will be
     *         placed, so any two integers between `1` and `100` will work.
     * @return    Returns the BankAccount response from the API call
     */
    public CompletableFuture<BankAccount> bankAccountVerifyAsync(
            final String bankId,
            final List<Integer> amounts) {
        try { 
            return prepareBankAccountVerifyRequest(bankId, amounts).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bankAccountVerify.
     */
    private ApiCall<BankAccount, ApiException> prepareBankAccountVerifyRequest(
            final String bankId,
            final List<Integer> amounts) throws IOException {
        return new ApiCall.Builder<BankAccount, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/bank_accounts/{bank_id}/verify")
                        .formParam(param -> param.key("amounts")
                                .value(amounts))
                        .templateParam(param -> param.key("bank_id").value(bankId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccount.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves the details of an existing bank account. You need only supply the unique bank
     * account identifier that was returned upon bank account creation.
     * @param  bankId  Required parameter: id of the bank account
     * @return    Returns the BankAccount response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccount bankAccountRetrieve(
            final String bankId) throws ApiException, IOException {
        return prepareBankAccountRetrieveRequest(bankId).execute();
    }

    /**
     * Retrieves the details of an existing bank account. You need only supply the unique bank
     * account identifier that was returned upon bank account creation.
     * @param  bankId  Required parameter: id of the bank account
     * @return    Returns the BankAccount response from the API call
     */
    public CompletableFuture<BankAccount> bankAccountRetrieveAsync(
            final String bankId) {
        try { 
            return prepareBankAccountRetrieveRequest(bankId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bankAccountRetrieve.
     */
    private ApiCall<BankAccount, ApiException> prepareBankAccountRetrieveRequest(
            final String bankId) throws IOException {
        return new ApiCall.Builder<BankAccount, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/bank_accounts/{bank_id}")
                        .templateParam(param -> param.key("bank_id").value(bankId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccount.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Permanently deletes a bank account. It cannot be undone.
     * @param  bankId  Required parameter: id of the bank account
     * @return    Returns the BankDeletion response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankDeletion bankAccountDelete(
            final String bankId) throws ApiException, IOException {
        return prepareBankAccountDeleteRequest(bankId).execute();
    }

    /**
     * Permanently deletes a bank account. It cannot be undone.
     * @param  bankId  Required parameter: id of the bank account
     * @return    Returns the BankDeletion response from the API call
     */
    public CompletableFuture<BankDeletion> bankAccountDeleteAsync(
            final String bankId) {
        try { 
            return prepareBankAccountDeleteRequest(bankId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bankAccountDelete.
     */
    private ApiCall<BankDeletion, ApiException> prepareBankAccountDeleteRequest(
            final String bankId) throws IOException {
        return new ApiCall.Builder<BankDeletion, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/bank_accounts/{bank_id}")
                        .templateParam(param -> param.key("bank_id").value(bankId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankDeletion.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list of your bank accounts. The bank accounts are returned sorted by creation date,
     * with the most recently created bank accounts appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @return    Returns the AllBankAccounts response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AllBankAccounts bankAccountsList(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata) throws ApiException, IOException {
        return prepareBankAccountsListRequest(limit, beforeAfter, include, dateCreated,
                metadata).execute();
    }

    /**
     * Returns a list of your bank accounts. The bank accounts are returned sorted by creation date,
     * with the most recently created bank accounts appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @return    Returns the AllBankAccounts response from the API call
     */
    public CompletableFuture<AllBankAccounts> bankAccountsListAsync(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata) {
        try { 
            return prepareBankAccountsListRequest(limit, beforeAfter, include, dateCreated,
            metadata).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bankAccountsList.
     */
    private ApiCall<AllBankAccounts, ApiException> prepareBankAccountsListRequest(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata) throws IOException {
        return new ApiCall.Builder<AllBankAccounts, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/bank_accounts")
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
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AllBankAccounts.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a new bank account with the provided properties. Bank accounts created in live mode
     * will need to be verified via micro deposits before being able to send live checks. The
     * deposits will appear in the bank account in 2-3 business days and have the description
     * "VERIFICATION".
     * @param  routingNumber  Required parameter: Must be a &lt;a
     *         href="https://www.frbservices.org/index.html" target="_blank"&gt;valid US routing
     *         number&lt;/a&gt;.
     * @param  accountNumber  Required parameter: Example:
     * @param  accountType  Required parameter: The type of entity that holds the account.
     * @param  signatory  Required parameter: The signatory associated with your account. This name
     *         will be printed on checks created with this bank account. If you prefer to use a
     *         custom signature image on your checks instead, please create your bank account from
     *         the &lt;a href="https://dashboard.lob.com/#/login"
     *         target="_blank"&gt;Dashboard&lt;/a&gt;.
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  checkTemplate  Optional parameter: The check template used for printing. The defualt
     *         value is `common`. If you bank with JP Morgan Chase and wish to use Positive Pay use
     *         the `jpm` template. `jpm` requires additional information to be provided.
     * @param  fractionalRoutingNumber  Optional parameter: The fractional routing number for your
     *         home bank account. Required for the `jpm` check template only. Please contact a bank
     *         representative if you do not know the fractional routing number associated with your
     *         home bank institution.
     * @param  city  Optional parameter: The city associated with your home bank account. Required
     *         for the `jpm` check template only. Please contact a bank representative if you do not
     *         know the city associated with your home bank institution.
     * @param  state  Optional parameter: The state associated with your home bank account. Required
     *         for the `jpm` check template only. Please contact a bank representative if you do not
     *         know the state associated with your home bank institution.
     * @param  zipcode  Optional parameter: The zipcode associated with your home bank account.
     *         Required for the `jpm` check template only. Please contact a bank representative if
     *         you do not know the zipcode associated with your home bank institution.
     * @param  metadata  Optional parameter: Use metadata to store custom information for tagging
     *         and labeling back to your internal systems. Must be an object with up to 20 key-value
     *         pairs. Keys must be at most 40 characters and values must be at most 500 characters.
     *         Neither can contain the characters `"` and `\`. i.e. '{"customer_id" :
     *         "NEWYORK2015"}' Nested objects are not supported. See [Metadata](#section/Metadata)
     *         for more information.
     * @return    Returns the BankAccount response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public BankAccount bankAccountCreate(
            final String routingNumber,
            final String accountNumber,
            final AccountTypeEnum accountType,
            final String signatory,
            final String description,
            final CheckTemplateEnum checkTemplate,
            final String fractionalRoutingNumber,
            final String city,
            final String state,
            final String zipcode,
            final Map<String, String> metadata) throws ApiException, IOException {
        return prepareBankAccountCreateRequest(routingNumber, accountNumber, accountType, signatory,
                description, checkTemplate, fractionalRoutingNumber, city, state, zipcode,
                metadata).execute();
    }

    /**
     * Creates a new bank account with the provided properties. Bank accounts created in live mode
     * will need to be verified via micro deposits before being able to send live checks. The
     * deposits will appear in the bank account in 2-3 business days and have the description
     * "VERIFICATION".
     * @param  routingNumber  Required parameter: Must be a &lt;a
     *         href="https://www.frbservices.org/index.html" target="_blank"&gt;valid US routing
     *         number&lt;/a&gt;.
     * @param  accountNumber  Required parameter: Example:
     * @param  accountType  Required parameter: The type of entity that holds the account.
     * @param  signatory  Required parameter: The signatory associated with your account. This name
     *         will be printed on checks created with this bank account. If you prefer to use a
     *         custom signature image on your checks instead, please create your bank account from
     *         the &lt;a href="https://dashboard.lob.com/#/login"
     *         target="_blank"&gt;Dashboard&lt;/a&gt;.
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  checkTemplate  Optional parameter: The check template used for printing. The defualt
     *         value is `common`. If you bank with JP Morgan Chase and wish to use Positive Pay use
     *         the `jpm` template. `jpm` requires additional information to be provided.
     * @param  fractionalRoutingNumber  Optional parameter: The fractional routing number for your
     *         home bank account. Required for the `jpm` check template only. Please contact a bank
     *         representative if you do not know the fractional routing number associated with your
     *         home bank institution.
     * @param  city  Optional parameter: The city associated with your home bank account. Required
     *         for the `jpm` check template only. Please contact a bank representative if you do not
     *         know the city associated with your home bank institution.
     * @param  state  Optional parameter: The state associated with your home bank account. Required
     *         for the `jpm` check template only. Please contact a bank representative if you do not
     *         know the state associated with your home bank institution.
     * @param  zipcode  Optional parameter: The zipcode associated with your home bank account.
     *         Required for the `jpm` check template only. Please contact a bank representative if
     *         you do not know the zipcode associated with your home bank institution.
     * @param  metadata  Optional parameter: Use metadata to store custom information for tagging
     *         and labeling back to your internal systems. Must be an object with up to 20 key-value
     *         pairs. Keys must be at most 40 characters and values must be at most 500 characters.
     *         Neither can contain the characters `"` and `\`. i.e. '{"customer_id" :
     *         "NEWYORK2015"}' Nested objects are not supported. See [Metadata](#section/Metadata)
     *         for more information.
     * @return    Returns the BankAccount response from the API call
     */
    public CompletableFuture<BankAccount> bankAccountCreateAsync(
            final String routingNumber,
            final String accountNumber,
            final AccountTypeEnum accountType,
            final String signatory,
            final String description,
            final CheckTemplateEnum checkTemplate,
            final String fractionalRoutingNumber,
            final String city,
            final String state,
            final String zipcode,
            final Map<String, String> metadata) {
        try { 
            return prepareBankAccountCreateRequest(routingNumber, accountNumber, accountType, signatory,
            description, checkTemplate, fractionalRoutingNumber, city, state, zipcode,
            metadata).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for bankAccountCreate.
     */
    private ApiCall<BankAccount, ApiException> prepareBankAccountCreateRequest(
            final String routingNumber,
            final String accountNumber,
            final AccountTypeEnum accountType,
            final String signatory,
            final String description,
            final CheckTemplateEnum checkTemplate,
            final String fractionalRoutingNumber,
            final String city,
            final String state,
            final String zipcode,
            final Map<String, String> metadata) throws IOException {
        return new ApiCall.Builder<BankAccount, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/bank_accounts")
                        .formParam(param -> param.key("routing_number")
                                .value(routingNumber))
                        .formParam(param -> param.key("account_number")
                                .value(accountNumber))
                        .formParam(param -> param.key("account_type")
                                .value((accountType != null) ? accountType.value() : null))
                        .formParam(param -> param.key("signatory")
                                .value(signatory))
                        .formParam(param -> param.key("description")
                                .value(description).isRequired(false))
                        .formParam(param -> param.key("check_template")
                                .value((checkTemplate != null) ? checkTemplate.value() : null).isRequired(false))
                        .formParam(param -> param.key("fractional_routing_number")
                                .value(fractionalRoutingNumber).isRequired(false))
                        .formParam(param -> param.key("city")
                                .value(city).isRequired(false))
                        .formParam(param -> param.key("state")
                                .value(state).isRequired(false))
                        .formParam(param -> param.key("zipcode")
                                .value(zipcode).isRequired(false))
                        .formParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, BankAccount.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}