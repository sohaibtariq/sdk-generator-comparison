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
import org.openapitools.client.model.City;
import org.openapitools.client.model.CountryExtended;
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
 * MultipleComponentsIntl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class MultipleComponentsIntl {
  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_PRIMARY_LINE = "primary_line";
  @SerializedName(SERIALIZED_NAME_PRIMARY_LINE)
  private String primaryLine;

  public static final String SERIALIZED_NAME_SECONDARY_LINE = "secondary_line";
  @SerializedName(SERIALIZED_NAME_SECONDARY_LINE)
  private String secondaryLine;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private City city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryExtended country;

  public MultipleComponentsIntl() {
  }

  public MultipleComponentsIntl recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * The intended recipient, typically a person&#39;s or firm&#39;s name.
   * @return recipient
  **/
  @javax.annotation.Nullable
  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public MultipleComponentsIntl primaryLine(String primaryLine) {
    
    this.primaryLine = primaryLine;
    return this;
  }

   /**
   * The primary delivery line (usually the street address) of the address. 
   * @return primaryLine
  **/
  @javax.annotation.Nonnull
  public String getPrimaryLine() {
    return primaryLine;
  }


  public void setPrimaryLine(String primaryLine) {
    this.primaryLine = primaryLine;
  }


  public MultipleComponentsIntl secondaryLine(String secondaryLine) {
    
    this.secondaryLine = secondaryLine;
    return this;
  }

   /**
   * The secondary delivery line of the address. This field is typically empty but may contain information if &#x60;primary_line&#x60; is too long. 
   * @return secondaryLine
  **/
  @javax.annotation.Nullable
  public String getSecondaryLine() {
    return secondaryLine;
  }


  public void setSecondaryLine(String secondaryLine) {
    this.secondaryLine = secondaryLine;
  }


  public MultipleComponentsIntl city(City city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  public City getCity() {
    return city;
  }


  public void setCity(City city) {
    this.city = city;
  }


  public MultipleComponentsIntl state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The name of the state.
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public MultipleComponentsIntl postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public MultipleComponentsIntl country(CountryExtended country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  public CountryExtended getCountry() {
    return country;
  }


  public void setCountry(CountryExtended country) {
    this.country = country;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleComponentsIntl multipleComponentsIntl = (MultipleComponentsIntl) o;
    return Objects.equals(this.recipient, multipleComponentsIntl.recipient) &&
        Objects.equals(this.primaryLine, multipleComponentsIntl.primaryLine) &&
        Objects.equals(this.secondaryLine, multipleComponentsIntl.secondaryLine) &&
        Objects.equals(this.city, multipleComponentsIntl.city) &&
        Objects.equals(this.state, multipleComponentsIntl.state) &&
        Objects.equals(this.postalCode, multipleComponentsIntl.postalCode) &&
        Objects.equals(this.country, multipleComponentsIntl.country);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipient, primaryLine, secondaryLine, city, state, postalCode, country);
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
    sb.append("class MultipleComponentsIntl {\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    primaryLine: ").append(toIndentedString(primaryLine)).append("\n");
    sb.append("    secondaryLine: ").append(toIndentedString(secondaryLine)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
    openapiFields.add("recipient");
    openapiFields.add("primary_line");
    openapiFields.add("secondary_line");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("postal_code");
    openapiFields.add("country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("primary_line");
    openapiRequiredFields.add("country");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MultipleComponentsIntl
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MultipleComponentsIntl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MultipleComponentsIntl is not found in the empty JSON string", MultipleComponentsIntl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MultipleComponentsIntl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MultipleComponentsIntl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MultipleComponentsIntl.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      if (!jsonObj.get("primary_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_line").toString()));
      }
      if ((jsonObj.get("secondary_line") != null && !jsonObj.get("secondary_line").isJsonNull()) && !jsonObj.get("secondary_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary_line").toString()));
      }
      // validate the optional field `city`
      if (jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) {
        City.validateJsonElement(jsonObj.get("city"));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("postal_code") != null && !jsonObj.get("postal_code").isJsonNull()) && !jsonObj.get("postal_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `postal_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("postal_code").toString()));
      }
      // validate the required field `country`
      CountryExtended.validateJsonElement(jsonObj.get("country"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MultipleComponentsIntl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MultipleComponentsIntl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MultipleComponentsIntl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MultipleComponentsIntl.class));

       return (TypeAdapter<T>) new TypeAdapter<MultipleComponentsIntl>() {
           @Override
           public void write(JsonWriter out, MultipleComponentsIntl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MultipleComponentsIntl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MultipleComponentsIntl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MultipleComponentsIntl
  * @throws IOException if the JSON string is invalid with respect to MultipleComponentsIntl
  */
  public static MultipleComponentsIntl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MultipleComponentsIntl.class);
  }

 /**
  * Convert an instance of MultipleComponentsIntl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
