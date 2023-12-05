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
import java.util.Arrays;
import org.openapitools.client.model.OptionalAddressColumnMapping;
import org.openapitools.client.model.RequiredAddressColumnMapping;
import org.openapitools.client.model.UploadsMetadata;
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
 * UploadUpdatable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class UploadUpdatable {
  public static final String SERIALIZED_NAME_ORIGINAL_FILENAME = "originalFilename";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_FILENAME)
  private String originalFilename;

  public static final String SERIALIZED_NAME_REQUIRED_ADDRESS_COLUMN_MAPPING = "requiredAddressColumnMapping";
  @SerializedName(SERIALIZED_NAME_REQUIRED_ADDRESS_COLUMN_MAPPING)
  private RequiredAddressColumnMapping requiredAddressColumnMapping;

  public static final String SERIALIZED_NAME_OPTIONAL_ADDRESS_COLUMN_MAPPING = "optionalAddressColumnMapping";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_ADDRESS_COLUMN_MAPPING)
  private OptionalAddressColumnMapping optionalAddressColumnMapping;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private UploadsMetadata metadata = {"columns":[]};

  public static final String SERIALIZED_NAME_MERGE_VARIABLE_COLUMN_MAPPING = "mergeVariableColumnMapping";
  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLE_COLUMN_MAPPING)
  private String mergeVariableColumnMapping;

  public UploadUpdatable() {
  }

  public UploadUpdatable originalFilename(String originalFilename) {
    
    this.originalFilename = originalFilename;
    return this;
  }

   /**
   * Original filename provided when the upload is created.
   * @return originalFilename
  **/
  @javax.annotation.Nullable
  public String getOriginalFilename() {
    return originalFilename;
  }


  public void setOriginalFilename(String originalFilename) {
    this.originalFilename = originalFilename;
  }


  public UploadUpdatable requiredAddressColumnMapping(RequiredAddressColumnMapping requiredAddressColumnMapping) {
    
    this.requiredAddressColumnMapping = requiredAddressColumnMapping;
    return this;
  }

   /**
   * Get requiredAddressColumnMapping
   * @return requiredAddressColumnMapping
  **/
  @javax.annotation.Nullable
  public RequiredAddressColumnMapping getRequiredAddressColumnMapping() {
    return requiredAddressColumnMapping;
  }


  public void setRequiredAddressColumnMapping(RequiredAddressColumnMapping requiredAddressColumnMapping) {
    this.requiredAddressColumnMapping = requiredAddressColumnMapping;
  }


  public UploadUpdatable optionalAddressColumnMapping(OptionalAddressColumnMapping optionalAddressColumnMapping) {
    
    this.optionalAddressColumnMapping = optionalAddressColumnMapping;
    return this;
  }

   /**
   * Get optionalAddressColumnMapping
   * @return optionalAddressColumnMapping
  **/
  @javax.annotation.Nullable
  public OptionalAddressColumnMapping getOptionalAddressColumnMapping() {
    return optionalAddressColumnMapping;
  }


  public void setOptionalAddressColumnMapping(OptionalAddressColumnMapping optionalAddressColumnMapping) {
    this.optionalAddressColumnMapping = optionalAddressColumnMapping;
  }


  public UploadUpdatable metadata(UploadsMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  public UploadsMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(UploadsMetadata metadata) {
    this.metadata = metadata;
  }


  public UploadUpdatable mergeVariableColumnMapping(String mergeVariableColumnMapping) {
    
    this.mergeVariableColumnMapping = mergeVariableColumnMapping;
    return this;
  }

   /**
   * The mapping of column headers in your file to the merge variables present in your creative. See our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#step-3-map-merge-variable-data-if-applicable-7\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Campaign Audience Guide&lt;/a&gt; for additional details. &lt;br /&gt;If a merge variable has the same \&quot;name\&quot; as a \&quot;key\&quot; in the &#x60;requiredAddressColumnMapping&#x60; or &#x60;optionalAddressColumnMapping&#x60; objects, then they **CANNOT** have a different value in this object. If a different value is provided, then when the campaign is processing it will get overwritten with the mapped value present in the &#x60;requiredAddressColumnMapping&#x60; or &#x60;optionalAddressColumnMapping&#x60; objects. If using customized QR code redirect from the Audience file, then a &#x60;qr_code_redirect_url&#x60; must be mapped to the column header as used in the CSV.
   * @return mergeVariableColumnMapping
  **/
  @javax.annotation.Nullable
  public String getMergeVariableColumnMapping() {
    return mergeVariableColumnMapping;
  }


  public void setMergeVariableColumnMapping(String mergeVariableColumnMapping) {
    this.mergeVariableColumnMapping = mergeVariableColumnMapping;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadUpdatable uploadUpdatable = (UploadUpdatable) o;
    return Objects.equals(this.originalFilename, uploadUpdatable.originalFilename) &&
        Objects.equals(this.requiredAddressColumnMapping, uploadUpdatable.requiredAddressColumnMapping) &&
        Objects.equals(this.optionalAddressColumnMapping, uploadUpdatable.optionalAddressColumnMapping) &&
        Objects.equals(this.metadata, uploadUpdatable.metadata) &&
        Objects.equals(this.mergeVariableColumnMapping, uploadUpdatable.mergeVariableColumnMapping);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalFilename, requiredAddressColumnMapping, optionalAddressColumnMapping, metadata, mergeVariableColumnMapping);
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
    sb.append("class UploadUpdatable {\n");
    sb.append("    originalFilename: ").append(toIndentedString(originalFilename)).append("\n");
    sb.append("    requiredAddressColumnMapping: ").append(toIndentedString(requiredAddressColumnMapping)).append("\n");
    sb.append("    optionalAddressColumnMapping: ").append(toIndentedString(optionalAddressColumnMapping)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mergeVariableColumnMapping: ").append(toIndentedString(mergeVariableColumnMapping)).append("\n");
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
    openapiFields.add("originalFilename");
    openapiFields.add("requiredAddressColumnMapping");
    openapiFields.add("optionalAddressColumnMapping");
    openapiFields.add("metadata");
    openapiFields.add("mergeVariableColumnMapping");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadUpdatable
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UploadUpdatable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadUpdatable is not found in the empty JSON string", UploadUpdatable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UploadUpdatable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadUpdatable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("originalFilename") != null && !jsonObj.get("originalFilename").isJsonNull()) && !jsonObj.get("originalFilename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalFilename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalFilename").toString()));
      }
      // validate the optional field `requiredAddressColumnMapping`
      if (jsonObj.get("requiredAddressColumnMapping") != null && !jsonObj.get("requiredAddressColumnMapping").isJsonNull()) {
        RequiredAddressColumnMapping.validateJsonElement(jsonObj.get("requiredAddressColumnMapping"));
      }
      // validate the optional field `optionalAddressColumnMapping`
      if (jsonObj.get("optionalAddressColumnMapping") != null && !jsonObj.get("optionalAddressColumnMapping").isJsonNull()) {
        OptionalAddressColumnMapping.validateJsonElement(jsonObj.get("optionalAddressColumnMapping"));
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        UploadsMetadata.validateJsonElement(jsonObj.get("metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadUpdatable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadUpdatable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadUpdatable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadUpdatable.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadUpdatable>() {
           @Override
           public void write(JsonWriter out, UploadUpdatable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadUpdatable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadUpdatable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadUpdatable
  * @throws IOException if the JSON string is invalid with respect to UploadUpdatable
  */
  public static UploadUpdatable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadUpdatable.class);
  }

 /**
  * Convert an instance of UploadUpdatable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

