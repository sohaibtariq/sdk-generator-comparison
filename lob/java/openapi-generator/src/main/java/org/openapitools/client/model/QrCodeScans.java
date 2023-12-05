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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.Scans;

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
 * QrCodeScans
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class QrCodeScans {
  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_NUMBER_OF_SCANS = "number_of_scans";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_SCANS)
  private BigDecimal numberOfScans;

  public static final String SERIALIZED_NAME_SCANS = "scans";
  @SerializedName(SERIALIZED_NAME_SCANS)
  private List<Scans> scans;

  public QrCodeScans() {
  }

  public QrCodeScans resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Unique identifier for each mail piece.
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public QrCodeScans dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was created.
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public QrCodeScans numberOfScans(BigDecimal numberOfScans) {
    
    this.numberOfScans = numberOfScans;
    return this;
  }

   /**
   * Number of times the QR Code associated with this mail piece was scanned.
   * @return numberOfScans
  **/
  @javax.annotation.Nullable
  public BigDecimal getNumberOfScans() {
    return numberOfScans;
  }


  public void setNumberOfScans(BigDecimal numberOfScans) {
    this.numberOfScans = numberOfScans;
  }


  public QrCodeScans scans(List<Scans> scans) {
    
    this.scans = scans;
    return this;
  }

  public QrCodeScans addScansItem(Scans scansItem) {
    if (this.scans == null) {
      this.scans = new ArrayList<>();
    }
    this.scans.add(scansItem);
    return this;
  }

   /**
   * Detailed scan information associated with each mail piece.
   * @return scans
  **/
  @javax.annotation.Nullable
  public List<Scans> getScans() {
    return scans;
  }


  public void setScans(List<Scans> scans) {
    this.scans = scans;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QrCodeScans qrCodeScans = (QrCodeScans) o;
    return Objects.equals(this.resourceId, qrCodeScans.resourceId) &&
        Objects.equals(this.dateCreated, qrCodeScans.dateCreated) &&
        Objects.equals(this.numberOfScans, qrCodeScans.numberOfScans) &&
        Objects.equals(this.scans, qrCodeScans.scans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, dateCreated, numberOfScans, scans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QrCodeScans {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    numberOfScans: ").append(toIndentedString(numberOfScans)).append("\n");
    sb.append("    scans: ").append(toIndentedString(scans)).append("\n");
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
    openapiFields.add("resource_id");
    openapiFields.add("date_created");
    openapiFields.add("number_of_scans");
    openapiFields.add("scans");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to QrCodeScans
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!QrCodeScans.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in QrCodeScans is not found in the empty JSON string", QrCodeScans.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!QrCodeScans.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QrCodeScans` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("resource_id") != null && !jsonObj.get("resource_id").isJsonNull()) && !jsonObj.get("resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
      if (jsonObj.get("scans") != null && !jsonObj.get("scans").isJsonNull()) {
        JsonArray jsonArrayscans = jsonObj.getAsJsonArray("scans");
        if (jsonArrayscans != null) {
          // ensure the json data is an array
          if (!jsonObj.get("scans").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `scans` to be an array in the JSON string but got `%s`", jsonObj.get("scans").toString()));
          }

          // validate the optional field `scans` (array)
          for (int i = 0; i < jsonArrayscans.size(); i++) {
            Scans.validateJsonElement(jsonArrayscans.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QrCodeScans.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QrCodeScans' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QrCodeScans> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QrCodeScans.class));

       return (TypeAdapter<T>) new TypeAdapter<QrCodeScans>() {
           @Override
           public void write(JsonWriter out, QrCodeScans value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QrCodeScans read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QrCodeScans given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QrCodeScans
  * @throws IOException if the JSON string is invalid with respect to QrCodeScans
  */
  public static QrCodeScans fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QrCodeScans.class);
  }

 /**
  * Convert an instance of QrCodeScans to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
