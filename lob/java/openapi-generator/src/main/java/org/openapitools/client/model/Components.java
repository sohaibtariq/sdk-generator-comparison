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
 * A nested object containing a breakdown of each component of a reverse geocoded response.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class Components {
  public static final String SERIALIZED_NAME_ZIP_CODE = "zip_code";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_ZIP_CODE_PLUS4 = "zip_code_plus_4";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE_PLUS4)
  private Object zipCodePlus4;

  public Components() {
  }

  public Components zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * The 5-digit ZIP code
   * @return zipCode
  **/
  @javax.annotation.Nonnull
  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public Components zipCodePlus4(Object zipCodePlus4) {
    
    this.zipCodePlus4 = zipCodePlus4;
    return this;
  }

   /**
   * Get zipCodePlus4
   * @return zipCodePlus4
  **/
  @javax.annotation.Nonnull
  public Object getZipCodePlus4() {
    return zipCodePlus4;
  }


  public void setZipCodePlus4(Object zipCodePlus4) {
    this.zipCodePlus4 = zipCodePlus4;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Components components = (Components) o;
    return Objects.equals(this.zipCode, components.zipCode) &&
        Objects.equals(this.zipCodePlus4, components.zipCodePlus4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, zipCodePlus4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Components {\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    zipCodePlus4: ").append(toIndentedString(zipCodePlus4)).append("\n");
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
    openapiFields.add("zip_code");
    openapiFields.add("zip_code_plus_4");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("zip_code");
    openapiRequiredFields.add("zip_code_plus_4");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Components
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Components.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Components is not found in the empty JSON string", Components.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Components.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Components` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Components.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("zip_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip_code").toString()));
      }
      // validate the required field `zip_code_plus_4`
      Object.validateJsonElement(jsonObj.get("zip_code_plus_4"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Components.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Components' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Components> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Components.class));

       return (TypeAdapter<T>) new TypeAdapter<Components>() {
           @Override
           public void write(JsonWriter out, Components value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Components read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Components given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Components
  * @throws IOException if the JSON string is invalid with respect to Components
  */
  public static Components fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Components.class);
  }

 /**
  * Convert an instance of Components to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
