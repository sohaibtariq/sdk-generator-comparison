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
import org.openapitools.client.model.Components;
import org.openapitools.client.model.LocationAnalysis;

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
 * Addresses
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class Addresses {
  public static final String SERIALIZED_NAME_COMPONENTS = "components";
  @SerializedName(SERIALIZED_NAME_COMPONENTS)
  private Components components;

  public static final String SERIALIZED_NAME_LOCATION_ANALYSIS = "location_analysis";
  @SerializedName(SERIALIZED_NAME_LOCATION_ANALYSIS)
  private LocationAnalysis locationAnalysis;

  public Addresses() {
  }

  public Addresses components(Components components) {
    
    this.components = components;
    return this;
  }

   /**
   * Get components
   * @return components
  **/
  @javax.annotation.Nullable
  public Components getComponents() {
    return components;
  }


  public void setComponents(Components components) {
    this.components = components;
  }


  public Addresses locationAnalysis(LocationAnalysis locationAnalysis) {
    
    this.locationAnalysis = locationAnalysis;
    return this;
  }

   /**
   * Get locationAnalysis
   * @return locationAnalysis
  **/
  @javax.annotation.Nullable
  public LocationAnalysis getLocationAnalysis() {
    return locationAnalysis;
  }


  public void setLocationAnalysis(LocationAnalysis locationAnalysis) {
    this.locationAnalysis = locationAnalysis;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Addresses addresses = (Addresses) o;
    return Objects.equals(this.components, addresses.components) &&
        Objects.equals(this.locationAnalysis, addresses.locationAnalysis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components, locationAnalysis);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Addresses {\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    locationAnalysis: ").append(toIndentedString(locationAnalysis)).append("\n");
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
    openapiFields.add("components");
    openapiFields.add("location_analysis");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Addresses
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Addresses.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Addresses is not found in the empty JSON string", Addresses.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Addresses.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Addresses` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `components`
      if (jsonObj.get("components") != null && !jsonObj.get("components").isJsonNull()) {
        Components.validateJsonElement(jsonObj.get("components"));
      }
      // validate the optional field `location_analysis`
      if (jsonObj.get("location_analysis") != null && !jsonObj.get("location_analysis").isJsonNull()) {
        LocationAnalysis.validateJsonElement(jsonObj.get("location_analysis"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Addresses.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Addresses' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Addresses> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Addresses.class));

       return (TypeAdapter<T>) new TypeAdapter<Addresses>() {
           @Override
           public void write(JsonWriter out, Addresses value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Addresses read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Addresses given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Addresses
  * @throws IOException if the JSON string is invalid with respect to Addresses
  */
  public static Addresses fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Addresses.class);
  }

 /**
  * Convert an instance of Addresses to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
