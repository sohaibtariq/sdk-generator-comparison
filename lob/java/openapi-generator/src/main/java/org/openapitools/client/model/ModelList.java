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
 * Multiple items returned in order
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class ModelList {
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

  public ModelList() {
  }

  public ModelList _object(String _object) {
    
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


  public ModelList nextUrl(String nextUrl) {
    
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


  public ModelList previousUrl(String previousUrl) {
    
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


  public ModelList count(Integer count) {
    
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


  public ModelList totalCount(Integer totalCount) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelList _list = (ModelList) o;
    return Objects.equals(this._object, _list._object) &&
        Objects.equals(this.nextUrl, _list.nextUrl) &&
        Objects.equals(this.previousUrl, _list.previousUrl) &&
        Objects.equals(this.count, _list.count) &&
        Objects.equals(this.totalCount, _list.totalCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, nextUrl, previousUrl, count, totalCount);
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
    sb.append("class ModelList {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    nextUrl: ").append(toIndentedString(nextUrl)).append("\n");
    sb.append("    previousUrl: ").append(toIndentedString(previousUrl)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ModelList
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ModelList.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelList is not found in the empty JSON string", ModelList.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ModelList.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelList` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelList.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelList' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelList> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelList.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelList>() {
           @Override
           public void write(JsonWriter out, ModelList value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelList read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelList given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelList
  * @throws IOException if the JSON string is invalid with respect to ModelList
  */
  public static ModelList fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelList.class);
  }

 /**
  * Convert an instance of ModelList to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
