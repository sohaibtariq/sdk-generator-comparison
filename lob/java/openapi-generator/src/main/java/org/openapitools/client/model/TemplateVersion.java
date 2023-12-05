/*
 * Lob
 * The Lob API is organized around REST. Our API is designed to have predictable, resource-oriented URLs and uses HTTP response codes to indicate any API errors. <p> 
 *
 * The version of the OpenAPI document: 1.19.18
 * Contact: lob-openapi@lob.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Engine;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TemplateVersion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class TemplateVersion {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private String html;

  public static final String SERIALIZED_NAME_ENGINE = "engine";
  @SerializedName(SERIALIZED_NAME_ENGINE)
  private Engine engine = Engine.LEGACY;

  public static final String SERIALIZED_NAME_REQUIRED_VARS = "required_vars";
  @SerializedName(SERIALIZED_NAME_REQUIRED_VARS)
  private List<String> requiredVars;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  /**
   * Value is resource type.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    VERSION("version");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ObjectEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.VERSION;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SUGGEST_JSON_EDITOR = "suggest_json_editor";
  @SerializedName(SERIALIZED_NAME_SUGGEST_JSON_EDITOR)
  private Boolean suggestJsonEditor;

  public static final String SERIALIZED_NAME_MERGE_VARIABLES = "merge_variables";
  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLES)
  private String mergeVariables;

  public TemplateVersion() {
  }

  public TemplateVersion description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An internal description that identifies this resource. Must be no longer than 255 characters. 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TemplateVersion html(String html) {
    
    this.html = html;
    return this;
  }

   /**
   * An HTML string of less than 100,000 characters to be used as the &#x60;published_version&#x60; of this template. See [here](#section/HTML-Examples) for guidance on designing HTML templates. Please see endpoint specific documentation for any other product-specific HTML details: - [Postcards](#operation/postcard_create) - &#x60;front&#x60; and &#x60;back&#x60; - [Self Mailers](#operation/self_mailer_create) - &#x60;inside&#x60; and &#x60;outside&#x60; - [Letters](#operation/letter_create) - &#x60;file&#x60; - [Checks](#operation/check_create) - &#x60;check_bottom&#x60; and &#x60;attachment&#x60; - [Cards](#operation/card_create) - &#x60;front&#x60; and &#x60;back&#x60;  If there is a syntax error with your variable names within your HTML, then an error will be thrown, e.g. using a &#x60;{{#users}}&#x60; opening tag without the corresponding closing tag &#x60;{{/users}}&#x60;. 
   * @return html
  **/
  @javax.annotation.Nonnull
  public String getHtml() {
    return html;
  }


  public void setHtml(String html) {
    this.html = html;
  }


  public TemplateVersion engine(Engine engine) {
    
    this.engine = engine;
    return this;
  }

   /**
   * Get engine
   * @return engine
  **/
  @javax.annotation.Nullable
  public Engine getEngine() {
    return engine;
  }


  public void setEngine(Engine engine) {
    this.engine = engine;
  }


  public TemplateVersion requiredVars(List<String> requiredVars) {
    
    this.requiredVars = requiredVars;
    return this;
  }

  public TemplateVersion addRequiredVarsItem(String requiredVarsItem) {
    if (this.requiredVars == null) {
      this.requiredVars = new ArrayList<>();
    }
    this.requiredVars.add(requiredVarsItem);
    return this;
  }

   /**
   * An array of required variables to be used in a template. Only available for &#x60;handlebars&#x60; templates. 
   * @return requiredVars
  **/
  @javax.annotation.Nullable
  public List<String> getRequiredVars() {
    return requiredVars;
  }


  public void setRequiredVars(List<String> requiredVars) {
    this.requiredVars = requiredVars;
  }


  public TemplateVersion dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was created.
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TemplateVersion dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was last modified.
   * @return dateModified
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public TemplateVersion deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Only returned if the resource has been successfully deleted.
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public TemplateVersion _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Value is resource type.
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public TemplateVersion id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;vrsn_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TemplateVersion suggestJsonEditor(Boolean suggestJsonEditor) {
    
    this.suggestJsonEditor = suggestJsonEditor;
    return this;
  }

   /**
   * Used by frontend, true if the template uses advanced features. 
   * @return suggestJsonEditor
  **/
  @javax.annotation.Nullable
  public Boolean getSuggestJsonEditor() {
    return suggestJsonEditor;
  }


  public void setSuggestJsonEditor(Boolean suggestJsonEditor) {
    this.suggestJsonEditor = suggestJsonEditor;
  }


  public TemplateVersion mergeVariables(String mergeVariables) {
    
    this.mergeVariables = mergeVariables;
    return this;
  }

   /**
   * Object representing the keys of every merge variable present in the template. It has one key named &#39;keys&#39;, and its value is an array of strings. 
   * @return mergeVariables
  **/
  @javax.annotation.Nullable
  public String getMergeVariables() {
    return mergeVariables;
  }


  public void setMergeVariables(String mergeVariables) {
    this.mergeVariables = mergeVariables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateVersion templateVersion = (TemplateVersion) o;
    return Objects.equals(this.description, templateVersion.description) &&
        Objects.equals(this.html, templateVersion.html) &&
        Objects.equals(this.engine, templateVersion.engine) &&
        Objects.equals(this.requiredVars, templateVersion.requiredVars) &&
        Objects.equals(this.dateCreated, templateVersion.dateCreated) &&
        Objects.equals(this.dateModified, templateVersion.dateModified) &&
        Objects.equals(this.deleted, templateVersion.deleted) &&
        Objects.equals(this._object, templateVersion._object) &&
        Objects.equals(this.id, templateVersion.id) &&
        Objects.equals(this.suggestJsonEditor, templateVersion.suggestJsonEditor) &&
        Objects.equals(this.mergeVariables, templateVersion.mergeVariables);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, html, engine, requiredVars, dateCreated, dateModified, deleted, _object, id, suggestJsonEditor, mergeVariables);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateVersion {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    requiredVars: ").append(toIndentedString(requiredVars)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    suggestJsonEditor: ").append(toIndentedString(suggestJsonEditor)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("html");
    openapiFields.add("engine");
    openapiFields.add("required_vars");
    openapiFields.add("date_created");
    openapiFields.add("date_modified");
    openapiFields.add("deleted");
    openapiFields.add("object");
    openapiFields.add("id");
    openapiFields.add("suggest_json_editor");
    openapiFields.add("merge_variables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("html");
    openapiRequiredFields.add("date_created");
    openapiRequiredFields.add("date_modified");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TemplateVersion
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TemplateVersion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TemplateVersion is not found in the empty JSON string", TemplateVersion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TemplateVersion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TemplateVersion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TemplateVersion.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html").toString()));
      }
      // validate the optional field `engine`
      if (jsonObj.get("engine") != null && !jsonObj.get("engine").isJsonNull()) {
        Engine.validateJsonElement(jsonObj.get("engine"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("required_vars") != null && !jsonObj.get("required_vars").isJsonNull() && !jsonObj.get("required_vars").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `required_vars` to be an array in the JSON string but got `%s`", jsonObj.get("required_vars").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `object`
      ObjectEnum.validateJsonElement(jsonObj.get("object"));
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TemplateVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TemplateVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TemplateVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TemplateVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<TemplateVersion>() {
           @Override
           public void write(JsonWriter out, TemplateVersion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TemplateVersion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TemplateVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TemplateVersion
  * @throws IOException if the JSON string is invalid with respect to TemplateVersion
  */
  public static TemplateVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TemplateVersion.class);
  }

 /**
  * Convert an instance of TemplateVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

