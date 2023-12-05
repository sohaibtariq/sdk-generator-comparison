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
 * AddressFieldsIntl
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class AddressFieldsIntl {
  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "address_line1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "address_line2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_ADDRESS_CITY = "address_city";
  @SerializedName(SERIALIZED_NAME_ADDRESS_CITY)
  private String addressCity;

  public static final String SERIALIZED_NAME_ADDRESS_STATE = "address_state";
  @SerializedName(SERIALIZED_NAME_ADDRESS_STATE)
  private String addressState;

  public static final String SERIALIZED_NAME_ADDRESS_ZIP = "address_zip";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ZIP)
  private String addressZip;

  public AddressFieldsIntl() {
  }

  public AddressFieldsIntl addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The primary number, street name, and directional information.
   * @return addressLine1
  **/
  @javax.annotation.Nonnull
  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public AddressFieldsIntl addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * An optional field containing any information which can&#39;t fit into line 1.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public AddressFieldsIntl addressCity(String addressCity) {
    
    this.addressCity = addressCity;
    return this;
  }

   /**
   * Get addressCity
   * @return addressCity
  **/
  @javax.annotation.Nullable
  public String getAddressCity() {
    return addressCity;
  }


  public void setAddressCity(String addressCity) {
    this.addressCity = addressCity;
  }


  public AddressFieldsIntl addressState(String addressState) {
    
    this.addressState = addressState;
    return this;
  }

   /**
   * Get addressState
   * @return addressState
  **/
  @javax.annotation.Nullable
  public String getAddressState() {
    return addressState;
  }


  public void setAddressState(String addressState) {
    this.addressState = addressState;
  }


  public AddressFieldsIntl addressZip(String addressZip) {
    
    this.addressZip = addressZip;
    return this;
  }

   /**
   * Optional postal code.
   * @return addressZip
  **/
  @javax.annotation.Nullable
  public String getAddressZip() {
    return addressZip;
  }


  public void setAddressZip(String addressZip) {
    this.addressZip = addressZip;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressFieldsIntl addressFieldsIntl = (AddressFieldsIntl) o;
    return Objects.equals(this.addressLine1, addressFieldsIntl.addressLine1) &&
        Objects.equals(this.addressLine2, addressFieldsIntl.addressLine2) &&
        Objects.equals(this.addressCity, addressFieldsIntl.addressCity) &&
        Objects.equals(this.addressState, addressFieldsIntl.addressState) &&
        Objects.equals(this.addressZip, addressFieldsIntl.addressZip);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, addressCity, addressState, addressZip);
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
    sb.append("class AddressFieldsIntl {\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    addressCity: ").append(toIndentedString(addressCity)).append("\n");
    sb.append("    addressState: ").append(toIndentedString(addressState)).append("\n");
    sb.append("    addressZip: ").append(toIndentedString(addressZip)).append("\n");
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
    openapiFields.add("address_line1");
    openapiFields.add("address_line2");
    openapiFields.add("address_city");
    openapiFields.add("address_state");
    openapiFields.add("address_zip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address_line1");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AddressFieldsIntl
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AddressFieldsIntl.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddressFieldsIntl is not found in the empty JSON string", AddressFieldsIntl.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AddressFieldsIntl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddressFieldsIntl` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddressFieldsIntl.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("address_line1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line1").toString()));
      }
      if ((jsonObj.get("address_line2") != null && !jsonObj.get("address_line2").isJsonNull()) && !jsonObj.get("address_line2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_line2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_line2").toString()));
      }
      if ((jsonObj.get("address_city") != null && !jsonObj.get("address_city").isJsonNull()) && !jsonObj.get("address_city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_city").toString()));
      }
      if ((jsonObj.get("address_state") != null && !jsonObj.get("address_state").isJsonNull()) && !jsonObj.get("address_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_state").toString()));
      }
      if ((jsonObj.get("address_zip") != null && !jsonObj.get("address_zip").isJsonNull()) && !jsonObj.get("address_zip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address_zip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address_zip").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddressFieldsIntl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddressFieldsIntl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddressFieldsIntl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddressFieldsIntl.class));

       return (TypeAdapter<T>) new TypeAdapter<AddressFieldsIntl>() {
           @Override
           public void write(JsonWriter out, AddressFieldsIntl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddressFieldsIntl read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddressFieldsIntl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddressFieldsIntl
  * @throws IOException if the JSON string is invalid with respect to AddressFieldsIntl
  */
  public static AddressFieldsIntl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddressFieldsIntl.class);
  }

 /**
  * Convert an instance of AddressFieldsIntl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

