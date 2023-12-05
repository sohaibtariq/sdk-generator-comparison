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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BuckslipOrder;
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
 * BuckslipOrdersRetrieve200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class BuckslipOrdersRetrieve200Response {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_NEXT_URL = "next_url";
  @SerializedName(SERIALIZED_NAME_NEXT_URL)
  private String nextUrl;

  public static final String SERIALIZED_NAME_PREVIOUS_URL = "previous_url";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_URL)
  private String previousUrl;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<BuckslipOrder> data;

  public BuckslipOrdersRetrieve200Response() {
  }

  public BuckslipOrdersRetrieve200Response _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Value is resource type.
   * @return _object
  **/
  @javax.annotation.Nullable
  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public BuckslipOrdersRetrieve200Response nextUrl(String nextUrl) {
    
    this.nextUrl = nextUrl;
    return this;
  }

   /**
   * Url of next page of items in list.
   * @return nextUrl
  **/
  @javax.annotation.Nullable
  public String getNextUrl() {
    return nextUrl;
  }


  public void setNextUrl(String nextUrl) {
    this.nextUrl = nextUrl;
  }


  public BuckslipOrdersRetrieve200Response previousUrl(String previousUrl) {
    
    this.previousUrl = previousUrl;
    return this;
  }

   /**
   * Url of previous page of items in list.
   * @return previousUrl
  **/
  @javax.annotation.Nullable
  public String getPreviousUrl() {
    return previousUrl;
  }


  public void setPreviousUrl(String previousUrl) {
    this.previousUrl = previousUrl;
  }


  public BuckslipOrdersRetrieve200Response count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * number of resources in a set
   * @return count
  **/
  @javax.annotation.Nullable
  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public BuckslipOrdersRetrieve200Response totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Indicates the total number of records. Provided when the request specifies an \&quot;include\&quot; query parameter
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public BuckslipOrdersRetrieve200Response data(List<BuckslipOrder> data) {
    
    this.data = data;
    return this;
  }

  public BuckslipOrdersRetrieve200Response addDataItem(BuckslipOrder dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of buckslip orders
   * @return data
  **/
  @javax.annotation.Nullable
  public List<BuckslipOrder> getData() {
    return data;
  }


  public void setData(List<BuckslipOrder> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuckslipOrdersRetrieve200Response buckslipOrdersRetrieve200Response = (BuckslipOrdersRetrieve200Response) o;
    return Objects.equals(this._object, buckslipOrdersRetrieve200Response._object) &&
        Objects.equals(this.nextUrl, buckslipOrdersRetrieve200Response.nextUrl) &&
        Objects.equals(this.previousUrl, buckslipOrdersRetrieve200Response.previousUrl) &&
        Objects.equals(this.count, buckslipOrdersRetrieve200Response.count) &&
        Objects.equals(this.totalCount, buckslipOrdersRetrieve200Response.totalCount) &&
        Objects.equals(this.data, buckslipOrdersRetrieve200Response.data);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, nextUrl, previousUrl, count, totalCount, data);
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
    sb.append("class BuckslipOrdersRetrieve200Response {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
    sb.append("    previousUrl: ").append(toIndentedString(previousUrl)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("next_url");
    openapiFields.add("previous_url");
    openapiFields.add("count");
    openapiFields.add("total_count");
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BuckslipOrdersRetrieve200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BuckslipOrdersRetrieve200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BuckslipOrdersRetrieve200Response is not found in the empty JSON string", BuckslipOrdersRetrieve200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BuckslipOrdersRetrieve200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BuckslipOrdersRetrieve200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("next_url") != null && !jsonObj.get("next_url").isJsonNull()) && !jsonObj.get("next_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next_url").toString()));
      }
      if ((jsonObj.get("previous_url") != null && !jsonObj.get("previous_url").isJsonNull()) && !jsonObj.get("previous_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previous_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previous_url").toString()));
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            BuckslipOrder.validateJsonElement(jsonArraydata.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BuckslipOrdersRetrieve200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BuckslipOrdersRetrieve200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BuckslipOrdersRetrieve200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BuckslipOrdersRetrieve200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<BuckslipOrdersRetrieve200Response>() {
           @Override
           public void write(JsonWriter out, BuckslipOrdersRetrieve200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BuckslipOrdersRetrieve200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BuckslipOrdersRetrieve200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BuckslipOrdersRetrieve200Response
  * @throws IOException if the JSON string is invalid with respect to BuckslipOrdersRetrieve200Response
  */
  public static BuckslipOrdersRetrieve200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BuckslipOrdersRetrieve200Response.class);
  }

 /**
  * Convert an instance of BuckslipOrdersRetrieve200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

