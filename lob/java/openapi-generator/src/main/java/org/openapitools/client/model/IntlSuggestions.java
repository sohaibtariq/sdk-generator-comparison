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
 * IntlSuggestions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class IntlSuggestions {
  public static final String SERIALIZED_NAME_PRIMARY_NUMBER_RANGE = "primary_number_range";
  @SerializedName(SERIALIZED_NAME_PRIMARY_NUMBER_RANGE)
  private String primaryNumberRange;

  public static final String SERIALIZED_NAME_PRIMARY_LINE = "primary_line";
  @SerializedName(SERIALIZED_NAME_PRIMARY_LINE)
  private String primaryLine;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private City city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private CountryExtended country;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zip_code";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public IntlSuggestions() {
  }

  public IntlSuggestions primaryNumberRange(String primaryNumberRange) {
    
    this.primaryNumberRange = primaryNumberRange;
    return this;
  }

   /**
   * The primary number range of the address that identifies a building at street level. 
   * @return primaryNumberRange
  **/
  @javax.annotation.Nonnull
  public String getPrimaryNumberRange() {
    return primaryNumberRange;
  }


  public void setPrimaryNumberRange(String primaryNumberRange) {
    this.primaryNumberRange = primaryNumberRange;
  }


  public IntlSuggestions primaryLine(String primaryLine) {
    
    this.primaryLine = primaryLine;
    return this;
  }

   /**
   * The primary delivery line (usually the street address) of the address. Combination of the following applicable &#x60;components&#x60; (primary number &amp; secondary information may be missing or inaccurate): * &#x60;primary_number&#x60; * &#x60;street_predirection&#x60; * &#x60;street_name&#x60; * &#x60;street_suffix&#x60; * &#x60;street_postdirection&#x60; * &#x60;secondary_designator&#x60; * &#x60;secondary_number&#x60; * &#x60;pmb_designator&#x60; * &#x60;pmb_number&#x60; 
   * @return primaryLine
  **/
  @javax.annotation.Nonnull
  public String getPrimaryLine() {
    return primaryLine;
  }


  public void setPrimaryLine(String primaryLine) {
    this.primaryLine = primaryLine;
  }


  public IntlSuggestions city(City city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nonnull
  public City getCity() {
    return city;
  }


  public void setCity(City city) {
    this.city = city;
  }


  public IntlSuggestions country(CountryExtended country) {
    
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


  public IntlSuggestions state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_3166-2\&quot; target&#x3D;\&quot;_blank\&quot;&gt;ISO 3166-2&lt;/a&gt; two letter code for the state. 
   * @return state
  **/
  @javax.annotation.Nonnull
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public IntlSuggestions zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * The postal code.
   * @return zipCode
  **/
  @javax.annotation.Nonnull
  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntlSuggestions intlSuggestions = (IntlSuggestions) o;
    return Objects.equals(this.primaryNumberRange, intlSuggestions.primaryNumberRange) &&
        Objects.equals(this.primaryLine, intlSuggestions.primaryLine) &&
        Objects.equals(this.city, intlSuggestions.city) &&
        Objects.equals(this.country, intlSuggestions.country) &&
        Objects.equals(this.state, intlSuggestions.state) &&
        Objects.equals(this.zipCode, intlSuggestions.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryNumberRange, primaryLine, city, country, state, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntlSuggestions {\n");
    sb.append("    primaryNumberRange: ").append(toIndentedString(primaryNumberRange)).append("\n");
    sb.append("    primaryLine: ").append(toIndentedString(primaryLine)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
    openapiFields.add("primary_number_range");
    openapiFields.add("primary_line");
    openapiFields.add("city");
    openapiFields.add("country");
    openapiFields.add("state");
    openapiFields.add("zip_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("primary_number_range");
    openapiRequiredFields.add("primary_line");
    openapiRequiredFields.add("city");
    openapiRequiredFields.add("country");
    openapiRequiredFields.add("state");
    openapiRequiredFields.add("zip_code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to IntlSuggestions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntlSuggestions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntlSuggestions is not found in the empty JSON string", IntlSuggestions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntlSuggestions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntlSuggestions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntlSuggestions.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("primary_number_range").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_number_range` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_number_range").toString()));
      }
      if (!jsonObj.get("primary_line").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary_line` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary_line").toString()));
      }
      // validate the required field `city`
      City.validateJsonElement(jsonObj.get("city"));
      // validate the required field `country`
      CountryExtended.validateJsonElement(jsonObj.get("country"));
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if (!jsonObj.get("zip_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zip_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zip_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntlSuggestions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntlSuggestions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntlSuggestions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntlSuggestions.class));

       return (TypeAdapter<T>) new TypeAdapter<IntlSuggestions>() {
           @Override
           public void write(JsonWriter out, IntlSuggestions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntlSuggestions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntlSuggestions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntlSuggestions
  * @throws IOException if the JSON string is invalid with respect to IntlSuggestions
  */
  public static IntlSuggestions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntlSuggestions.class);
  }

 /**
  * Convert an instance of IntlSuggestions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

