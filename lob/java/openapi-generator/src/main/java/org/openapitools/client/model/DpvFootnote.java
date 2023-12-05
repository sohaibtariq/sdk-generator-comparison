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
 * Gets or Sets dpv_footnote
 */
@JsonAdapter(DpvFootnote.Adapter.class)
public enum DpvFootnote {
  
  AA("AA"),
  
  A1("A1"),
  
  BB("BB"),
  
  CC("CC"),
  
  N1("N1"),
  
  F1("F1"),
  
  G1("G1"),
  
  U1("U1"),
  
  M1("M1"),
  
  M3("M3"),
  
  P1("P1"),
  
  P3("P3"),
  
  R1("R1"),
  
  R7("R7"),
  
  RR("RR");

  private String value;

  DpvFootnote(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DpvFootnote fromValue(String value) {
    for (DpvFootnote b : DpvFootnote.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DpvFootnote> {
    @Override
    public void write(final JsonWriter jsonWriter, final DpvFootnote enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DpvFootnote read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DpvFootnote.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    DpvFootnote.fromValue(value);
  }
}

