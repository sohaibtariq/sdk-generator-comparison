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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.ChkUseType;
import org.openapitools.client.model.SendDate;
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
 * CheckBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class CheckBase {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_MERGE_VARIABLES = "merge_variables";
  @SerializedName(SERIALIZED_NAME_MERGE_VARIABLES)
  private String mergeVariables;

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";
  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  private SendDate sendDate;

  /**
   * Checks must be sent &#x60;usps_first_class&#x60;
   */
  @JsonAdapter(MailTypeEnum.Adapter.class)
  public enum MailTypeEnum {
    USPS_FIRST_CLASS("usps_first_class");

    private String value;

    MailTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MailTypeEnum fromValue(String value) {
      for (MailTypeEnum b : MailTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MailTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MailTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MailTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MailTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      MailTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_MAIL_TYPE = "mail_type";
  @SerializedName(SERIALIZED_NAME_MAIL_TYPE)
  private MailTypeEnum mailType = MailTypeEnum.USPS_FIRST_CLASS;

  public static final String SERIALIZED_NAME_MEMO = "memo";
  @SerializedName(SERIALIZED_NAME_MEMO)
  private String memo;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "check_number";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private Integer checkNumber;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_USE_TYPE = "use_type";
  @SerializedName(SERIALIZED_NAME_USE_TYPE)
  private ChkUseType useType;

  public CheckBase() {
  }

  public CheckBase description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * An internal description that identifies this resource. Must be no longer than 255 characters. 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CheckBase metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public CheckBase putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Use metadata to store custom information for tagging and labeling back to your internal systems. Must be an object with up to 20 key-value pairs. Keys must be at most 40 characters and values must be at most 500 characters. Neither can contain the characters &#x60;\&quot;&#x60; and &#x60;\\&#x60;. i.e. &#39;{\&quot;customer_id\&quot; : \&quot;NEWYORK2015\&quot;}&#39; Nested objects are not supported.  See [Metadata](#section/Metadata) for more information.
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public CheckBase mergeVariables(String mergeVariables) {
    
    this.mergeVariables = mergeVariables;
    return this;
  }

   /**
   * You can input a merge variable payload object to your template to render dynamic content. For example, if you have a template like: &#x60;{{variable_name}}&#x60;, pass in &#x60;{\&quot;variable_name\&quot;: \&quot;Harry\&quot;}&#x60; to render &#x60;Harry&#x60;. &#x60;merge_variables&#x60; must be an object. Any type of value is accepted as long as the object is valid JSON; you can use &#x60;strings&#x60;, &#x60;numbers&#x60;, &#x60;booleans&#x60;, &#x60;arrays&#x60;, &#x60;objects&#x60;, or &#x60;null&#x60;. The max length of the object is 25,000 characters. If you call &#x60;JSON.stringify&#x60; on your object, it can be no longer than 25,000 characters. Your variable names cannot contain any whitespace or any of the following special characters: &#x60;!&#x60;, &#x60;\&quot;&#x60;, &#x60;#&#x60;, &#x60;%&#x60;, &#x60;&amp;&#x60;, &#x60;&#39;&#x60;, &#x60;(&#x60;, &#x60;)&#x60;, &#x60;*&#x60;, &#x60;+&#x60;, &#x60;,&#x60;, &#x60;/&#x60;, &#x60;;&#x60;, &#x60;&lt;&#x60;, &#x60;&#x3D;&#x60;, &#x60;&gt;&#x60;, &#x60;@&#x60;, &#x60;[&#x60;, &#x60;\\&#x60;, &#x60;]&#x60;, &#x60;^&#x60;, &#x60;&#x60; &#x60; &#x60;&#x60;, &#x60;{&#x60;, &#x60;|&#x60;, &#x60;}&#x60;, &#x60;~&#x60;. More instructions can be found in &lt;a href&#x3D;\&quot;https://help.lob.com/print-and-mail/designing-mail-creatives/dynamic-personalization#using-html-and-merge-variables-10\&quot; target&#x3D;\&quot;_blank\&quot;&gt;our guide to using html and merge variables&lt;/a&gt;. Depending on your &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/settings/account\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Merge Variable strictness&lt;/a&gt; setting, if you define variables in your HTML but do not pass them here, you will either receive an error or the variable will render as an empty string.
   * @return mergeVariables
  **/
  @javax.annotation.Nullable
  public String getMergeVariables() {
    return mergeVariables;
  }


  public void setMergeVariables(String mergeVariables) {
    this.mergeVariables = mergeVariables;
  }


  public CheckBase sendDate(SendDate sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }

   /**
   * Get sendDate
   * @return sendDate
  **/
  @javax.annotation.Nullable
  public SendDate getSendDate() {
    return sendDate;
  }


  public void setSendDate(SendDate sendDate) {
    this.sendDate = sendDate;
  }


  public CheckBase mailType(MailTypeEnum mailType) {
    
    this.mailType = mailType;
    return this;
  }

   /**
   * Checks must be sent &#x60;usps_first_class&#x60;
   * @return mailType
  **/
  @javax.annotation.Nullable
  public MailTypeEnum getMailType() {
    return mailType;
  }


  public void setMailType(MailTypeEnum mailType) {
    this.mailType = mailType;
  }


  public CheckBase memo(String memo) {
    
    this.memo = memo;
    return this;
  }

   /**
   * Text to include on the memo line of the check.
   * @return memo
  **/
  @javax.annotation.Nullable
  public String getMemo() {
    return memo;
  }


  public void setMemo(String memo) {
    this.memo = memo;
  }


  public CheckBase checkNumber(Integer checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * An integer that designates the check number. If &#x60;check_number&#x60; is not provided, checks created from a new &#x60;bank_account&#x60; will start at &#x60;10000&#x60; and increment with each check created with the &#x60;bank_account&#x60;. A provided &#x60;check_number&#x60; overrides the defaults. Subsequent checks created with the same &#x60;bank_account&#x60; will increment from the provided check number.
   * minimum: 1
   * maximum: 500000000
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  public Integer getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(Integer checkNumber) {
    this.checkNumber = checkNumber;
  }


  public CheckBase message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Max of 400 characters to be included at the bottom of the check page.
   * @return message
  **/
  @javax.annotation.Nullable
  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public CheckBase useType(ChkUseType useType) {
    
    this.useType = useType;
    return this;
  }

   /**
   * Get useType
   * @return useType
  **/
  @javax.annotation.Nullable
  public ChkUseType getUseType() {
    return useType;
  }


  public void setUseType(ChkUseType useType) {
    this.useType = useType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckBase checkBase = (CheckBase) o;
    return Objects.equals(this.description, checkBase.description) &&
        Objects.equals(this.metadata, checkBase.metadata) &&
        Objects.equals(this.mergeVariables, checkBase.mergeVariables) &&
        Objects.equals(this.sendDate, checkBase.sendDate) &&
        Objects.equals(this.mailType, checkBase.mailType) &&
        Objects.equals(this.memo, checkBase.memo) &&
        Objects.equals(this.checkNumber, checkBase.checkNumber) &&
        Objects.equals(this.message, checkBase.message) &&
        Objects.equals(this.useType, checkBase.useType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, metadata, mergeVariables, sendDate, mailType, memo, checkNumber, message, useType);
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
    sb.append("class CheckBase {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    mergeVariables: ").append(toIndentedString(mergeVariables)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    mailType: ").append(toIndentedString(mailType)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    useType: ").append(toIndentedString(useType)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("metadata");
    openapiFields.add("merge_variables");
    openapiFields.add("send_date");
    openapiFields.add("mail_type");
    openapiFields.add("memo");
    openapiFields.add("check_number");
    openapiFields.add("message");
    openapiFields.add("use_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CheckBase
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CheckBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CheckBase is not found in the empty JSON string", CheckBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CheckBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CheckBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `send_date`
      if (jsonObj.get("send_date") != null && !jsonObj.get("send_date").isJsonNull()) {
        SendDate.validateJsonElement(jsonObj.get("send_date"));
      }
      if ((jsonObj.get("mail_type") != null && !jsonObj.get("mail_type").isJsonNull()) && !jsonObj.get("mail_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mail_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mail_type").toString()));
      }
      // validate the optional field `mail_type`
      if (jsonObj.get("mail_type") != null && !jsonObj.get("mail_type").isJsonNull()) {
        MailTypeEnum.validateJsonElement(jsonObj.get("mail_type"));
      }
      if ((jsonObj.get("memo") != null && !jsonObj.get("memo").isJsonNull()) && !jsonObj.get("memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memo").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      // validate the optional field `use_type`
      if (jsonObj.get("use_type") != null && !jsonObj.get("use_type").isJsonNull()) {
        ChkUseType.validateJsonElement(jsonObj.get("use_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CheckBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CheckBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CheckBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CheckBase.class));

       return (TypeAdapter<T>) new TypeAdapter<CheckBase>() {
           @Override
           public void write(JsonWriter out, CheckBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CheckBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CheckBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CheckBase
  * @throws IOException if the JSON string is invalid with respect to CheckBase
  */
  public static CheckBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CheckBase.class);
  }

 /**
  * Convert an instance of CheckBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
