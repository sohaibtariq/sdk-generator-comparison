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
 * UploadCreateExport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class UploadCreateExport {
  /**
   * Gets or Sets message
   */
  @JsonAdapter(MessageEnum.Adapter.class)
  public enum MessageEnum {
    EXPORT_IS_PROCESSING("Export is processing");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MessageEnum fromValue(String value) {
      for (MessageEnum b : MessageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MessageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MessageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MessageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MessageEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MessageEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private MessageEnum message = MessageEnum.EXPORT_IS_PROCESSING;

  public static final String SERIALIZED_NAME_EXPORT_ID = "exportId";
  @SerializedName(SERIALIZED_NAME_EXPORT_ID)
  private String exportId;

  public UploadCreateExport() {
  }

  public UploadCreateExport message(MessageEnum message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  public MessageEnum getMessage() {
    return message;
  }


  public void setMessage(MessageEnum message) {
    this.message = message;
  }


  public UploadCreateExport exportId(String exportId) {
    
    this.exportId = exportId;
    return this;
  }

   /**
   * Get exportId
   * @return exportId
  **/
  @javax.annotation.Nonnull
  public String getExportId() {
    return exportId;
  }


  public void setExportId(String exportId) {
    this.exportId = exportId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadCreateExport uploadCreateExport = (UploadCreateExport) o;
    return Objects.equals(this.message, uploadCreateExport.message) &&
        Objects.equals(this.exportId, uploadCreateExport.exportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, exportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadCreateExport {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    exportId: ").append(toIndentedString(exportId)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("exportId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
    openapiRequiredFields.add("exportId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to UploadCreateExport
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UploadCreateExport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UploadCreateExport is not found in the empty JSON string", UploadCreateExport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UploadCreateExport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UploadCreateExport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UploadCreateExport.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the required field `message`
      MessageEnum.validateJsonElement(jsonObj.get("message"));
      if (!jsonObj.get("exportId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exportId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exportId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UploadCreateExport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UploadCreateExport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UploadCreateExport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UploadCreateExport.class));

       return (TypeAdapter<T>) new TypeAdapter<UploadCreateExport>() {
           @Override
           public void write(JsonWriter out, UploadCreateExport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UploadCreateExport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UploadCreateExport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UploadCreateExport
  * @throws IOException if the JSON string is invalid with respect to UploadCreateExport
  */
  public static UploadCreateExport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UploadCreateExport.class);
  }

 /**
  * Convert an instance of UploadCreateExport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
