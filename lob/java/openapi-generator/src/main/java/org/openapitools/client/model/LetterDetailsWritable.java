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
import org.openapitools.client.model.AddressPlacement;
import org.openapitools.client.model.ExtraService;
import org.openapitools.client.model.LetterAddOnTypes;
import org.openapitools.client.model.MailType;
import org.openapitools.client.model.QrCodeCampaigns;
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
 * Properties that the letters in your Creative should have. Check within in order to add a QR code to your creative.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class LetterDetailsWritable {
  public static final String SERIALIZED_NAME_ADDRESS_PLACEMENT = "address_placement";
  @SerializedName(SERIALIZED_NAME_ADDRESS_PLACEMENT)
  private AddressPlacement addressPlacement = AddressPlacement.TOP_FIRST_PAGE;

  public static final String SERIALIZED_NAME_ADD_ON_TYPES = "add_on_types";
  @SerializedName(SERIALIZED_NAME_ADD_ON_TYPES)
  private List<LetterAddOnTypes> addOnTypes;

  public static final String SERIALIZED_NAME_BUCKSLIPS = "buckslips";
  @SerializedName(SERIALIZED_NAME_BUCKSLIPS)
  private List<String> buckslips;

  public static final String SERIALIZED_NAME_CARDS = "cards";
  @SerializedName(SERIALIZED_NAME_CARDS)
  private List<String> cards;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private Boolean color;

  public static final String SERIALIZED_NAME_CUSTOM_ENVELOPE = "custom_envelope";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ENVELOPE)
  private String customEnvelope;

  public static final String SERIALIZED_NAME_DOUBLE_SIDED = "double_sided";
  @SerializedName(SERIALIZED_NAME_DOUBLE_SIDED)
  private Boolean doubleSided = true;

  public static final String SERIALIZED_NAME_EXTRA_SERVICE = "extra_service";
  @SerializedName(SERIALIZED_NAME_EXTRA_SERVICE)
  private ExtraService extraService;

  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";
  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  private MailType mailType = MailType.FIRST_CLASS;

  public static final String SERIALIZED_NAME_QR_CODE = "qr_code";
  @SerializedName(SERIALIZED_NAME_QR_CODE)
  private QrCodeCampaigns qrCode;

  public LetterDetailsWritable() {
  }

  public LetterDetailsWritable addressPlacement(AddressPlacement addressPlacement) {
    
    this.addressPlacement = addressPlacement;
    return this;
  }

   /**
   * Get addressPlacement
   * @return addressPlacement
  **/
  @javax.annotation.Nullable
  public AddressPlacement getAddressPlacement() {
    return addressPlacement;
  }


  public void setAddressPlacement(AddressPlacement addressPlacement) {
    this.addressPlacement = addressPlacement;
  }


  public LetterDetailsWritable addOnTypes(List<LetterAddOnTypes> addOnTypes) {
    
    this.addOnTypes = addOnTypes;
    return this;
  }

  public LetterDetailsWritable addAddOnTypesItem(LetterAddOnTypes addOnTypesItem) {
    if (this.addOnTypes == null) {
      this.addOnTypes = new ArrayList<>();
    }
    this.addOnTypes.add(addOnTypesItem);
    return this;
  }

   /**
   * An array containing the types of add-ons for the Letter Creative.
   * @return addOnTypes
  **/
  @javax.annotation.Nullable
  public List<LetterAddOnTypes> getAddOnTypes() {
    return addOnTypes;
  }


  public void setAddOnTypes(List<LetterAddOnTypes> addOnTypes) {
    this.addOnTypes = addOnTypes;
  }


  public LetterDetailsWritable buckslips(List<String> buckslips) {
    
    this.buckslips = buckslips;
    return this;
  }

  public LetterDetailsWritable addBuckslipsItem(String buckslipsItem) {
    if (this.buckslips == null) {
      this.buckslips = new ArrayList<>();
    }
    this.buckslips.add(buckslipsItem);
    return this;
  }

   /**
   * A single-element array containing an existing buckslip id in a string format. See [buckslips](#tag/Buckslips) for more information. Note that buckslip letter campaigns require a minimum send quantity of 5,000 letters per campaign.
   * @return buckslips
  **/
  @javax.annotation.Nullable
  public List<String> getBuckslips() {
    return buckslips;
  }


  public void setBuckslips(List<String> buckslips) {
    this.buckslips = buckslips;
  }


  public LetterDetailsWritable cards(List<String> cards) {
    
    this.cards = cards;
    return this;
  }

  public LetterDetailsWritable addCardsItem(String cardsItem) {
    if (this.cards == null) {
      this.cards = new ArrayList<>();
    }
    this.cards.add(cardsItem);
    return this;
  }

   /**
   * A single-element array containing an existing card id in a string format. See [cards](#tag/Cards) for more information.
   * @return cards
  **/
  @javax.annotation.Nullable
  public List<String> getCards() {
    return cards;
  }


  public void setCards(List<String> cards) {
    this.cards = cards;
  }


  public LetterDetailsWritable color(Boolean color) {
    
    this.color = color;
    return this;
  }

   /**
   * Set this key to &#x60;true&#x60; if you would like to print in color. Set to &#x60;false&#x60; if you would like to print in black and white.
   * @return color
  **/
  @javax.annotation.Nonnull
  public Boolean getColor() {
    return color;
  }


  public void setColor(Boolean color) {
    this.color = color;
  }


  public LetterDetailsWritable customEnvelope(String customEnvelope) {
    
    this.customEnvelope = customEnvelope;
    return this;
  }

   /**
   * Accepts an envelope ID for any customized envelope with available inventory. If no inventory is available for the specified ID, the letter will not be sent, and an error will be returned. If the letter has more than 6 sheets, it will be sent in a blank flat envelope. Custom envelopes may be created and ordered from the dashboard. This feature is exclusive to certain customers. Upgrade to the appropriate &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/editions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Print &amp; Mail Edition&lt;/a&gt; to gain access.
   * @return customEnvelope
  **/
  @javax.annotation.Nullable
  public String getCustomEnvelope() {
    return customEnvelope;
  }


  public void setCustomEnvelope(String customEnvelope) {
    this.customEnvelope = customEnvelope;
  }


  public LetterDetailsWritable doubleSided(Boolean doubleSided) {
    
    this.doubleSided = doubleSided;
    return this;
  }

   /**
   * Set this attribute to &#x60;true&#x60; for double sided printing, or &#x60;false&#x60; for for single sided printing. Defaults to &#x60;true&#x60;.
   * @return doubleSided
  **/
  @javax.annotation.Nullable
  public Boolean getDoubleSided() {
    return doubleSided;
  }


  public void setDoubleSided(Boolean doubleSided) {
    this.doubleSided = doubleSided;
  }


  public LetterDetailsWritable extraService(ExtraService extraService) {
    
    this.extraService = extraService;
    return this;
  }

   /**
   * Get extraService
   * @return extraService
  **/
  @javax.annotation.Nullable
  public ExtraService getExtraService() {
    return extraService;
  }


  public void setExtraService(ExtraService extraService) {
    this.extraService = extraService;
  }


  public LetterDetailsWritable mailType(MailType mailType) {
    
    this.mailType = mailType;
    return this;
  }

   /**
   * Get mailType
   * @return mailType
  **/
  @javax.annotation.Nullable
  public MailType getMailType() {
    return mailType;
  }


  public void setMailType(MailType mailType) {
    this.mailType = mailType;
  }


  public LetterDetailsWritable qrCode(QrCodeCampaigns qrCode) {
    
    this.qrCode = qrCode;
    return this;
  }

   /**
   * Get qrCode
   * @return qrCode
  **/
  @javax.annotation.Nullable
  public QrCodeCampaigns getQrCode() {
    return qrCode;
  }


  public void setQrCode(QrCodeCampaigns qrCode) {
    this.qrCode = qrCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LetterDetailsWritable letterDetailsWritable = (LetterDetailsWritable) o;
    return Objects.equals(this.addressPlacement, letterDetailsWritable.addressPlacement) &&
        Objects.equals(this.addOnTypes, letterDetailsWritable.addOnTypes) &&
        Objects.equals(this.buckslips, letterDetailsWritable.buckslips) &&
        Objects.equals(this.cards, letterDetailsWritable.cards) &&
        Objects.equals(this.color, letterDetailsWritable.color) &&
        Objects.equals(this.customEnvelope, letterDetailsWritable.customEnvelope) &&
        Objects.equals(this.doubleSided, letterDetailsWritable.doubleSided) &&
        Objects.equals(this.extraService, letterDetailsWritable.extraService) &&
        Objects.equals(this.mailType, letterDetailsWritable.mailType) &&
        Objects.equals(this.qrCode, letterDetailsWritable.qrCode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressPlacement, addOnTypes, buckslips, cards, color, customEnvelope, doubleSided, extraService, mailType, qrCode);
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
    sb.append("class LetterDetailsWritable {\n");
    sb.append("    addressPlacement: ").append(toIndentedString(addressPlacement)).append("\n");
    sb.append("    addOnTypes: ").append(toIndentedString(addOnTypes)).append("\n");
    sb.append("    buckslips: ").append(toIndentedString(buckslips)).append("\n");
    sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    customEnvelope: ").append(toIndentedString(customEnvelope)).append("\n");
    sb.append("    doubleSided: ").append(toIndentedString(doubleSided)).append("\n");
    sb.append("    extraService: ").append(toIndentedString(extraService)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
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
    openapiFields.add("address_placement");
    openapiFields.add("add_on_types");
    openapiFields.add("buckslips");
    openapiFields.add("cards");
    openapiFields.add("color");
    openapiFields.add("custom_envelope");
    openapiFields.add("double_sided");
    openapiFields.add("extra_service");
    openapiFields.add("mail_type");
    openapiFields.add("qr_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("color");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to LetterDetailsWritable
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LetterDetailsWritable.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LetterDetailsWritable is not found in the empty JSON string", LetterDetailsWritable.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LetterDetailsWritable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LetterDetailsWritable` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LetterDetailsWritable.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `address_placement`
      if (jsonObj.get("address_placement") != null && !jsonObj.get("address_placement").isJsonNull()) {
        AddressPlacement.validateJsonElement(jsonObj.get("address_placement"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("add_on_types") != null && !jsonObj.get("add_on_types").isJsonNull() && !jsonObj.get("add_on_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `add_on_types` to be an array in the JSON string but got `%s`", jsonObj.get("add_on_types").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("buckslips") != null && !jsonObj.get("buckslips").isJsonNull() && !jsonObj.get("buckslips").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buckslips` to be an array in the JSON string but got `%s`", jsonObj.get("buckslips").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cards") != null && !jsonObj.get("cards").isJsonNull() && !jsonObj.get("cards").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cards` to be an array in the JSON string but got `%s`", jsonObj.get("cards").toString()));
      }
      if ((jsonObj.get("custom_envelope") != null && !jsonObj.get("custom_envelope").isJsonNull()) && !jsonObj.get("custom_envelope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_envelope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_envelope").toString()));
      }
      // validate the optional field `extra_service`
      if (jsonObj.get("extra_service") != null && !jsonObj.get("extra_service").isJsonNull()) {
        ExtraService.validateJsonElement(jsonObj.get("extra_service"));
      }
      // validate the optional field `mail_type`
      if (jsonObj.get("mail_type") != null && !jsonObj.get("mail_type").isJsonNull()) {
        MailType.validateJsonElement(jsonObj.get("mail_type"));
      }
      // validate the optional field `qr_code`
      if (jsonObj.get("qr_code") != null && !jsonObj.get("qr_code").isJsonNull()) {
        QrCodeCampaigns.validateJsonElement(jsonObj.get("qr_code"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LetterDetailsWritable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LetterDetailsWritable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LetterDetailsWritable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LetterDetailsWritable.class));

       return (TypeAdapter<T>) new TypeAdapter<LetterDetailsWritable>() {
           @Override
           public void write(JsonWriter out, LetterDetailsWritable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LetterDetailsWritable read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LetterDetailsWritable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LetterDetailsWritable
  * @throws IOException if the JSON string is invalid with respect to LetterDetailsWritable
  */
  public static LetterDetailsWritable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LetterDetailsWritable.class);
  }

 /**
  * Convert an instance of LetterDetailsWritable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
