/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import org.openapis.openapi.utils.DateTimeDeserializer;
import org.openapis.openapi.utils.DateTimeSerializer;


public class Template {
    /**
     * An internal description that identifies this resource. Must be no longer than 255 characters.
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public Template withDescription(String description) {
        this.description = description;
        return this;
    }
    
    /**
     * Unique identifier prefixed with `tmpl_`. ID of a saved [HTML template](#section/HTML-Templates).
     */
    @JsonProperty("id")
    public String id;

    public Template withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * An array of all non-deleted [version objects](#tag/Template-Versions) associated with the template.
     */
    @JsonProperty("versions")
    public TemplateVersion[] versions;

    public Template withVersions(TemplateVersion[] versions) {
        this.versions = versions;
        return this;
    }
    
    @JsonProperty("published_version")
    public PublishedVersion publishedVersion;

    public Template withPublishedVersion(PublishedVersion publishedVersion) {
        this.publishedVersion = publishedVersion;
        return this;
    }
    
    /**
     * Value is resource type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object")
    public TemplateObject object;

    public Template withObject(TemplateObject object) {
        this.object = object;
        return this;
    }
    
    /**
     * Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters `"` and `\`. i.e. '{"customer_id" : "NEWYORK2015"}' Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public Template withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was created.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_created")
    public OffsetDateTime dateCreated;

    public Template withDateCreated(OffsetDateTime dateCreated) {
        this.dateCreated = dateCreated;
        return this;
    }
    
    /**
     * A timestamp in ISO 8601 format of the date the resource was last modified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date_modified")
    public OffsetDateTime dateModified;

    public Template withDateModified(OffsetDateTime dateModified) {
        this.dateModified = dateModified;
        return this;
    }
    
    /**
     * Only returned if the resource has been successfully deleted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted")
    public Boolean deleted;

    public Template withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    
    public Template(@JsonProperty("id") String id, @JsonProperty("versions") TemplateVersion[] versions, @JsonProperty("published_version") PublishedVersion publishedVersion) {
        this.id = id;
        this.versions = versions;
        this.publishedVersion = publishedVersion;
  }
}