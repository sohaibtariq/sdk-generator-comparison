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
 * The mapping of column headers in your file to Lob-optional fields for the resource created. See our &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/building-a-mail-strategy/campaign-or-triggered-sends/campaign-audience-guide#optional-columns-3\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Campaign Audience Guide&lt;/a&gt; for additional details.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class OptionalAddressColumnMapping {
  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_ADDRESS_COUNTRY = "address_country";
  @SerializedName(SERIALIZED_NAME_ADDRESS_COUNTRY)
  private String addressCountry;

  public OptionalAddressColumnMapping() {
  }

  public OptionalAddressColumnMapping addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The column header from the csv file that should be mapped to the optional field \&quot;address_line2\&quot;
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public OptionalAddressColumnMapping company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * The column header from the csv file that should be mapped to the optional field \&quot;company\&quot;
   * @return company
  **/
  @javax.annotation.Nullable
  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public OptionalAddressColumnMapping addressCountry(String addressCountry) {
    
    this.addressCountry = addressCountry;
    return this;
  }

   /**
   * The column header from the csv file that should be mapped to the optional field \&quot;address_country\&quot;
   * @return addressCountry
  **/
  @javax.annotation.Nullable
  public String getAddressCountry() {
    return addressCountry;
  }


  public void setAddressCountry(String addressCountry) {
    this.addressCountry = addressCountry;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalAddressColumnMapping optionalAddressColumnMapping = (OptionalAddressColumnMapping) o;
    return Objects.equals(this.addressLine2, optionalAddressColumnMapping.addressLine2) &&
        Objects.equals(this.company, optionalAddressColumnMapping.company) &&
        Objects.equals(this.addressCountry, optionalAddressColumnMapping.addressCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine2, company, addressCountry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionalAddressColumnMapping {\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    addressCountry: ").append(toIndentedString(addressCountry)).append("\n");
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
    openapiFields.add("address_line2");
    openapiFields.add("company");
    openapiFields.add("address_country");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address_line2");
    openapiRequiredFields.add("company");
    openapiRequiredFields.add("address_country");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to OptionalAddressColumnMapping
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!OptionalAddressColumnMapping.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptionalAddressColumnMapping is not found in the empty JSON string", OptionalAddressColumnMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!OptionalAddressColumnMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OptionalAddressColumnMapping` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OptionalAddressColumnMapping.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      if ((jsonObj.get("address_country") != null && !jsonObj.get("address_country").isJsonNull()) && !jsonObj.get("address_country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptionalAddressColumnMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptionalAddressColumnMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptionalAddressColumnMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptionalAddressColumnMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<OptionalAddressColumnMapping>() {
           @Override
           public void write(JsonWriter out, OptionalAddressColumnMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OptionalAddressColumnMapping read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OptionalAddressColumnMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptionalAddressColumnMapping
  * @throws IOException if the JSON string is invalid with respect to OptionalAddressColumnMapping
  */
  public static OptionalAddressColumnMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptionalAddressColumnMapping.class);
  }

 /**
  * Convert an instance of OptionalAddressColumnMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
