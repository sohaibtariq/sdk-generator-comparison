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
import com.lob.api.models.AllTemplates;
import com.lob.api.models.BeforeAfter;
import com.lob.api.models.EngineEnum;
import com.lob.api.models.Template;
import com.lob.api.models.TemplateDeletion;
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
public final class TemplatesController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public TemplatesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retrieves the details of an existing template. You need only supply the unique template
     * identifier that was returned upon template creation.
     * @param  tmplId  Required parameter: id of the template
     * @return    Returns the Template response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Template templateRetrieve(
            final String tmplId) throws ApiException, IOException {
        return prepareTemplateRetrieveRequest(tmplId).execute();
    }

    /**
     * Retrieves the details of an existing template. You need only supply the unique template
     * identifier that was returned upon template creation.
     * @param  tmplId  Required parameter: id of the template
     * @return    Returns the Template response from the API call
     */
    public CompletableFuture<Template> templateRetrieveAsync(
            final String tmplId) {
        try { 
            return prepareTemplateRetrieveRequest(tmplId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for templateRetrieve.
     */
    private ApiCall<Template, ApiException> prepareTemplateRetrieveRequest(
            final String tmplId) throws IOException {
        return new ApiCall.Builder<Template, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/templates/{tmpl_id}")
                        .templateParam(param -> param.key("tmpl_id").value(tmplId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Template.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates the description and/or published version of the template with the given id. To update
     * the template's html, create a new version of the template.
     * @param  tmplId  Required parameter: id of the template
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  publishedVersion  Optional parameter: Example:
     * @return    Returns the Template response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Template templateUpdate(
            final String tmplId,
            final String description,
            final String publishedVersion) throws ApiException, IOException {
        return prepareTemplateUpdateRequest(tmplId, description, publishedVersion).execute();
    }

    /**
     * Updates the description and/or published version of the template with the given id. To update
     * the template's html, create a new version of the template.
     * @param  tmplId  Required parameter: id of the template
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  publishedVersion  Optional parameter: Example:
     * @return    Returns the Template response from the API call
     */
    public CompletableFuture<Template> templateUpdateAsync(
            final String tmplId,
            final String description,
            final String publishedVersion) {
        try { 
            return prepareTemplateUpdateRequest(tmplId, description, publishedVersion).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for templateUpdate.
     */
    private ApiCall<Template, ApiException> prepareTemplateUpdateRequest(
            final String tmplId,
            final String description,
            final String publishedVersion) throws IOException {
        return new ApiCall.Builder<Template, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/templates/{tmpl_id}")
                        .formParam(param -> param.key("description")
                                .value(description).isRequired(false))
                        .formParam(param -> param.key("published_version")
                                .value(publishedVersion).isRequired(false))
                        .templateParam(param -> param.key("tmpl_id").value(tmplId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Template.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Permanently deletes a template. Deleting a template also deletes its associated versions.
     * Deleted templates can not be used to create postcard, letter, or check resources.
     * @param  tmplId  Required parameter: id of the template
     * @return    Returns the TemplateDeletion response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public TemplateDeletion templateDelete(
            final String tmplId) throws ApiException, IOException {
        return prepareTemplateDeleteRequest(tmplId).execute();
    }

    /**
     * Permanently deletes a template. Deleting a template also deletes its associated versions.
     * Deleted templates can not be used to create postcard, letter, or check resources.
     * @param  tmplId  Required parameter: id of the template
     * @return    Returns the TemplateDeletion response from the API call
     */
    public CompletableFuture<TemplateDeletion> templateDeleteAsync(
            final String tmplId) {
        try { 
            return prepareTemplateDeleteRequest(tmplId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for templateDelete.
     */
    private ApiCall<TemplateDeletion, ApiException> prepareTemplateDeleteRequest(
            final String tmplId) throws IOException {
        return new ApiCall.Builder<TemplateDeletion, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/templates/{tmpl_id}")
                        .templateParam(param -> param.key("tmpl_id").value(tmplId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, TemplateDeletion.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list of your templates. The templates are returned sorted by creation date, with
     * the most recently created templates appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @return    Returns the AllTemplates response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AllTemplates templatesList(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata) throws ApiException, IOException {
        return prepareTemplatesListRequest(limit, beforeAfter, include, dateCreated,
                metadata).execute();
    }

    /**
     * Returns a list of your templates. The templates are returned sorted by creation date, with
     * the most recently created templates appearing first.
     * @param  limit  Optional parameter: How many results to return.
     * @param  beforeAfter  Optional parameter: `before` and `after` are both optional but only one
     *         of them can be in the query at a time.
     * @param  include  Optional parameter: Request that the response include the total count by
     *         specifying `include=["total_count"]`.
     * @param  dateCreated  Optional parameter: Filter by date created. Accepted formats are
     *         ISO-8601 date or datetime, e.g. `{ "gt": "2012-01-01", "lt": "2012-01-31T12:34:56Z"
     *         }` where `gt` is &gt;, `lt` is &lt;, `gte` is ≥, and `lte` is ≤.
     * @param  metadata  Optional parameter: Filter by metadata key-value pair`.
     * @return    Returns the AllTemplates response from the API call
     */
    public CompletableFuture<AllTemplates> templatesListAsync(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata) {
        try { 
            return prepareTemplatesListRequest(limit, beforeAfter, include, dateCreated,
            metadata).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for templatesList.
     */
    private ApiCall<AllTemplates, ApiException> prepareTemplatesListRequest(
            final Integer limit,
            final BeforeAfter beforeAfter,
            final List<String> include,
            final Map<String, String> dateCreated,
            final Map<String, String> metadata) throws IOException {
        return new ApiCall.Builder<AllTemplates, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/templates")
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
                                response -> ApiHelper.deserialize(response, AllTemplates.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a new template for use with the Print &amp; Mail API. In Live mode, you can only have as
     * many non-deleted templates as allotted in your current &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail
     * Edition&lt;/a&gt;. If you attempt to create a template past your limit, you will receive a `403`
     * error. There is no limit in Test mode.
     * @param  html  Required parameter: An HTML string of less than 100,000 characters to be used
     *         as the `published_version` of this template. See [here](#section/HTML-Examples) for
     *         guidance on designing HTML templates. Please see endpoint specific documentation for
     *         any other product-specific HTML details: - [Postcards](#operation/postcard_create) -
     *         `front` and `back` - [Self Mailers](#operation/self_mailer_create) - `inside` and
     *         `outside` - [Letters](#operation/letter_create) - `file` -
     *         [Checks](#operation/check_create) - `check_bottom` and `attachment` -
     *         [Cards](#operation/card_create) - `front` and `back` If there is a syntax error with
     *         your variable names within your HTML, then an error will be thrown, e.g. using a
     *         `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  metadata  Optional parameter: Use metadata to store custom information for tagging
     *         and labeling back to your internal systems. Must be an object with up to 20 key-value
     *         pairs. Keys must be at most 40 characters and values must be at most 500 characters.
     *         Neither can contain the characters `"` and `\`. i.e. '{"customer_id" :
     *         "NEWYORK2015"}' Nested objects are not supported. See [Metadata](#section/Metadata)
     *         for more information.
     * @param  engine  Optional parameter: The engine used to combine HTML template with merge
     *         variables. * `legacy` - Lob's original engine * `handlebars`
     * @param  requiredVars  Optional parameter: An array of required variables to be used in a
     *         template. Only available for `handlebars` templates.
     * @return    Returns the Template response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public Template createTemplate(
            final String html,
            final String description,
            final Map<String, String> metadata,
            final EngineEnum engine,
            final List<String> requiredVars) throws ApiException, IOException {
        return prepareCreateTemplateRequest(html, description, metadata, engine,
                requiredVars).execute();
    }

    /**
     * Creates a new template for use with the Print &amp; Mail API. In Live mode, you can only have as
     * many non-deleted templates as allotted in your current &lt;a
     * href="https://dashboard.lob.com/#/settings/editions" target="_blank"&gt;Print &amp; Mail
     * Edition&lt;/a&gt;. If you attempt to create a template past your limit, you will receive a `403`
     * error. There is no limit in Test mode.
     * @param  html  Required parameter: An HTML string of less than 100,000 characters to be used
     *         as the `published_version` of this template. See [here](#section/HTML-Examples) for
     *         guidance on designing HTML templates. Please see endpoint specific documentation for
     *         any other product-specific HTML details: - [Postcards](#operation/postcard_create) -
     *         `front` and `back` - [Self Mailers](#operation/self_mailer_create) - `inside` and
     *         `outside` - [Letters](#operation/letter_create) - `file` -
     *         [Checks](#operation/check_create) - `check_bottom` and `attachment` -
     *         [Cards](#operation/card_create) - `front` and `back` If there is a syntax error with
     *         your variable names within your HTML, then an error will be thrown, e.g. using a
     *         `{{#users}}` opening tag without the corresponding closing tag `{{/users}}`.
     * @param  description  Optional parameter: An internal description that identifies this
     *         resource. Must be no longer than 255 characters.
     * @param  metadata  Optional parameter: Use metadata to store custom information for tagging
     *         and labeling back to your internal systems. Must be an object with up to 20 key-value
     *         pairs. Keys must be at most 40 characters and values must be at most 500 characters.
     *         Neither can contain the characters `"` and `\`. i.e. '{"customer_id" :
     *         "NEWYORK2015"}' Nested objects are not supported. See [Metadata](#section/Metadata)
     *         for more information.
     * @param  engine  Optional parameter: The engine used to combine HTML template with merge
     *         variables. * `legacy` - Lob's original engine * `handlebars`
     * @param  requiredVars  Optional parameter: An array of required variables to be used in a
     *         template. Only available for `handlebars` templates.
     * @return    Returns the Template response from the API call
     */
    public CompletableFuture<Template> createTemplateAsync(
            final String html,
            final String description,
            final Map<String, String> metadata,
            final EngineEnum engine,
            final List<String> requiredVars) {
        try { 
            return prepareCreateTemplateRequest(html, description, metadata, engine,
            requiredVars).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createTemplate.
     */
    private ApiCall<Template, ApiException> prepareCreateTemplateRequest(
            final String html,
            final String description,
            final Map<String, String> metadata,
            final EngineEnum engine,
            final List<String> requiredVars) throws IOException {
        return new ApiCall.Builder<Template, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/templates")
                        .formParam(param -> param.key("html")
                                .value(html))
                        .formParam(param -> param.key("description")
                                .value(description).isRequired(false))
                        .formParam(param -> param.key("metadata")
                                .value(metadata).isRequired(false))
                        .formParam(param -> param.key("engine")
                                .value((engine != null) ? engine.value() : "legacy").isRequired(false))
                        .formParam(param -> param.key("required_vars")
                                .value(requiredVars).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, Template.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error",
                                (reason, context) -> new ErrorErrorException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}