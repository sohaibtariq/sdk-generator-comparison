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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets letter_add_on_types
 */
@JsonAdapter(LetterAddOnTypes.Adapter.class)
public enum LetterAddOnTypes {
  
  BUCKSLIPS("buckslips"),
  
  CARDS("cards"),
  
  CUSTOM_ENVELOPE("custom_envelope");

  private String value;

  LetterAddOnTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LetterAddOnTypes fromValue(String value) {
    for (LetterAddOnTypes b : LetterAddOnTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<LetterAddOnTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final LetterAddOnTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LetterAddOnTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LetterAddOnTypes.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    LetterAddOnTypes.fromValue(value);
  }
}
