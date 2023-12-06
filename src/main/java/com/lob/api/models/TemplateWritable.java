/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for TemplateWritable type.
 */
public class TemplateWritable {
    private OptionalNullable<String> description;
    private String html;
    private Map<String, String> metadata;
    private OptionalNullable<EngineEnum> engine;
    private List<String> requiredVars;

    /**
     * Default constructor.
     */
    public TemplateWritable() {
        engine = OptionalNullable.of(EngineEnum.LEGACY);
    }

    /**
     * Initialization constructor.
     * @param  html  String value for html.
     * @param  description  String value for description.
     * @param  metadata  Map of String, value for metadata.
     * @param  engine  EngineEnum value for engine.
     * @param  requiredVars  List of String value for requiredVars.
     */
    public TemplateWritable(
            String html,
            String description,
            Map<String, String> metadata,
            EngineEnum engine,
            List<String> requiredVars) {
        this.description = OptionalNullable.of(description);
        this.html = html;
        this.metadata = metadata;
        this.engine = OptionalNullable.of(engine);
        this.requiredVars = requiredVars;
    }

    /**
     * Initialization constructor.
     * @param  html  String value for html.
     * @param  description  String value for description.
     * @param  metadata  Map of String, value for metadata.
     * @param  engine  EngineEnum value for engine.
     * @param  requiredVars  List of String value for requiredVars.
     */

    protected TemplateWritable(String html, OptionalNullable<String> description,
            Map<String, String> metadata, OptionalNullable<EngineEnum> engine,
            List<String> requiredVars) {
        this.description = description;
        this.html = html;
        this.metadata = metadata;
        this.engine = engine;
        this.requiredVars = requiredVars;
    }

    /**
     * Internal Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Getter for Html.
     * An HTML string of less than 100,000 characters to be used as the `published_version` of this
     * template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please
     * see endpoint specific documentation for any other product-specific HTML details: -
     * [Postcards](#operation/postcard_create) - `front` and `back` - [Self
     * Mailers](#operation/self_mailer_create) - `inside` and `outside` -
     * [Letters](#operation/letter_create) - `file` - [Checks](#operation/check_create) -
     * `check_bottom` and `attachment` - [Cards](#operation/card_create) - `front` and `back` If
     * there is a syntax error with your variable names within your HTML, then an error will be
     * thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag
     * `{{/users}}`.
     * @return Returns the String
     */
    @JsonGetter("html")
    public String getHtml() {
        return html;
    }

    /**
     * Setter for Html.
     * An HTML string of less than 100,000 characters to be used as the `published_version` of this
     * template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please
     * see endpoint specific documentation for any other product-specific HTML details: -
     * [Postcards](#operation/postcard_create) - `front` and `back` - [Self
     * Mailers](#operation/self_mailer_create) - `inside` and `outside` -
     * [Letters](#operation/letter_create) - `file` - [Checks](#operation/check_create) -
     * `check_bottom` and `attachment` - [Cards](#operation/card_create) - `front` and `back` If
     * there is a syntax error with your variable names within your HTML, then an error will be
     * thrown, e.g. using a `{{#users}}` opening tag without the corresponding closing tag
     * `{{/users}}`.
     * @param html Value for String
     */
    @JsonSetter("html")
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * Getter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Use metadata to store custom information for tagging and labeling back to your internal
     * systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters
     * and values must be at most 500 characters. Neither can contain the characters `"` and `\`.
     * i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported. See
     * [Metadata](#section/Metadata) for more information.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Internal Getter for Engine.
     * The engine used to combine HTML template with merge variables. * `legacy` - Lob's original
     * engine * `handlebars`
     * @return Returns the Internal EngineEnum
     */
    @JsonGetter("engine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<EngineEnum> internalGetEngine() {
        return this.engine;
    }

    /**
     * Getter for Engine.
     * The engine used to combine HTML template with merge variables. * `legacy` - Lob's original
     * engine * `handlebars`
     * @return Returns the EngineEnum
     */
    public EngineEnum getEngine() {
        return OptionalNullable.getFrom(engine);
    }

    /**
     * Setter for Engine.
     * The engine used to combine HTML template with merge variables. * `legacy` - Lob's original
     * engine * `handlebars`
     * @param engine Value for EngineEnum
     */
    @JsonSetter("engine")
    public void setEngine(EngineEnum engine) {
        this.engine = OptionalNullable.of(engine);
    }

    /**
     * UnSetter for Engine.
     * The engine used to combine HTML template with merge variables. * `legacy` - Lob's original
     * engine * `handlebars`
     */
    public void unsetEngine() {
        engine = null;
    }

    /**
     * Getter for RequiredVars.
     * An array of required variables to be used in a template. Only available for `handlebars`
     * templates.
     * @return Returns the List of String
     */
    @JsonGetter("required_vars")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getRequiredVars() {
        return requiredVars;
    }

    /**
     * Setter for RequiredVars.
     * An array of required variables to be used in a template. Only available for `handlebars`
     * templates.
     * @param requiredVars Value for List of String
     */
    @JsonSetter("required_vars")
    public void setRequiredVars(List<String> requiredVars) {
        this.requiredVars = requiredVars;
    }

    /**
     * Converts this TemplateWritable into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TemplateWritable [" + "html=" + html + ", description=" + description
                + ", metadata=" + metadata + ", engine=" + engine + ", requiredVars=" + requiredVars
                + "]";
    }

    /**
     * Builds a new {@link TemplateWritable.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TemplateWritable.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(html)
                .metadata(getMetadata())
                .requiredVars(getRequiredVars());
        builder.description = internalGetDescription();
        builder.engine = internalGetEngine();
        return builder;
    }

    /**
     * Class to build instances of {@link TemplateWritable}.
     */
    public static class Builder {
        private String html;
        private OptionalNullable<String> description;
        private Map<String, String> metadata;
        private OptionalNullable<EngineEnum> engine = OptionalNullable.of(EngineEnum.LEGACY);
        private List<String> requiredVars;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  html  String value for html.
         */
        public Builder(String html) {
            this.html = html;
        }

        /**
         * Setter for html.
         * @param  html  String value for html.
         * @return Builder
         */
        public Builder html(String html) {
            this.html = html;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for engine.
         * @param  engine  EngineEnum value for engine.
         * @return Builder
         */
        public Builder engine(EngineEnum engine) {
            this.engine = OptionalNullable.of(engine);
            return this;
        }

        /**
         * UnSetter for engine.
         * @return Builder
         */
        public Builder unsetEngine() {
            engine = null;
            return this;
        }

        /**
         * Setter for requiredVars.
         * @param  requiredVars  List of String value for requiredVars.
         * @return Builder
         */
        public Builder requiredVars(List<String> requiredVars) {
            this.requiredVars = requiredVars;
            return this;
        }

        /**
         * Builds a new {@link TemplateWritable} object using the set fields.
         * @return {@link TemplateWritable}
         */
        public TemplateWritable build() {
            return new TemplateWritable(html, description, metadata, engine, requiredVars);
        }
    }
}
