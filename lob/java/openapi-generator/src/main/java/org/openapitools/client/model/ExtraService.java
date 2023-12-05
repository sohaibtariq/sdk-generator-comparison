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
 * Add an extra service to your letter. Can only be non-&#x60;null&#x60; if &#x60;mail_type&#x60; isn&#39;t &#x60;usps_standard&#x60;. See &lt;a href&#x3D;\&quot;https://www.lob.com/pricing/print-mail#compare\&quot; target&#x3D;\&quot;_blank\&quot;&gt;pricing&lt;/a&gt; for extra costs incurred.   * &#x60;certified&#x60; - track and confirm delivery for domestic destinations. An extra sheet (1 PDF page single-sided or 2 PDF pages double-sided) is added to the beginning of your letter for address and barcode information. See here for templates: &lt;a href&#x3D;\&quot;https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_template.pdf\&quot; target&#x3D;\&quot;_blank\&quot;&gt;#10 envelope&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://s3-us-west-2.amazonaws.com/public.lob.com/assets/templates/letter_certified_flat_template.pdf\&quot; target&#x3D;\&quot;_blank\&quot;&gt;flat envelope&lt;/a&gt; (used for letters over 6 pages single-sided or 12 pages double-sided). You will not be charged for this extra sheet.   * &#x60;certified_return_receipt&#x60; - request an electronic copy of the recipient&#39;s signature to prove delivery of your certified letter   * &#x60;registered&#x60; - provides tracking and confirmation for international addresses 
 */
@JsonAdapter(ExtraService.Adapter.class)
public enum ExtraService {
  
  CERTIFIED("certified"),
  
  CERTIFIED_RETURN_RECEIPT("certified_return_receipt"),
  
  REGISTERED("registered"),
  
  NULL("null");

  private String value;

  ExtraService(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExtraService fromValue(String value) {
    for (ExtraService b : ExtraService.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ExtraService> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExtraService enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExtraService read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExtraService.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ExtraService.fromValue(value);
  }
}

