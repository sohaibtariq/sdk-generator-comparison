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
 * BankAccountBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class BankAccountBase {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ROUTING_NUMBER = "routing_number";
  @SerializedName(SERIALIZED_NAME_ROUTING_NUMBER)
  private String routingNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  /**
   * The type of entity that holds the account.
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    COMPANY("company"),
    
    INDIVIDUAL("individual");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AccountTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_SIGNATORY = "signatory";
  @SerializedName(SERIALIZED_NAME_SIGNATORY)
  private String signatory;

  /**
   * The check template used for printing. The defualt value is &#x60;common&#x60;. If you bank with JP Morgan Chase and wish to use Positive Pay use the &#x60;jpm&#x60; template. &#x60;jpm&#x60; requires additional information to be provided.
   */
  @JsonAdapter(CheckTemplateEnum.Adapter.class)
  public enum CheckTemplateEnum {
    COMMON("common"),
    
    JPM("jpm");

    private String value;

    CheckTemplateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CheckTemplateEnum fromValue(String value) {
      for (CheckTemplateEnum b : CheckTemplateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CheckTemplateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CheckTemplateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CheckTemplateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CheckTemplateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CheckTemplateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CHECK_TEMPLATE = "check_template";
  @SerializedName(SERIALIZED_NAME_CHECK_TEMPLATE)
  private CheckTemplateEnum checkTemplate;

  public static final String SERIALIZED_NAME_FRACTIONAL_ROUTING_NUMBER = "fractional_routing_number";
  @SerializedName(SERIALIZED_NAME_FRACTIONAL_ROUTING_NUMBER)
  private String fractionalRoutingNumber;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ZIPCODE = "zipcode";
  @SerializedName(SERIALIZED_NAME_ZIPCODE)
  private String zipcode;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public BankAccountBase() {
  }

  public BankAccountBase description(String description) {
    
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


  public BankAccountBase routingNumber(String routingNumber) {
    
    this.routingNumber = routingNumber;
    return this;
  }

   /**
   * Must be a &lt;a href&#x3D;\&quot;https://www.frbservices.org/index.html\&quot; target&#x3D;\&quot;_blank\&quot;&gt;valid US routing number&lt;/a&gt;.
   * @return routingNumber
  **/
  @javax.annotation.Nonnull
  public String getRoutingNumber() {
    return routingNumber;
  }


  public void setRoutingNumber(String routingNumber) {
    this.routingNumber = routingNumber;
  }


  public BankAccountBase accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public BankAccountBase accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The type of entity that holds the account.
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public BankAccountBase signatory(String signatory) {
    
    this.signatory = signatory;
    return this;
  }

   /**
   * The signatory associated with your account. This name will be printed on checks created with this bank account. If you prefer to use a custom signature image on your checks instead, please create your bank account from the &lt;a href&#x3D;\&quot;https://dashboard.lob.com/#/login\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Dashboard&lt;/a&gt;.
   * @return signatory
  **/
  @javax.annotation.Nonnull
  public String getSignatory() {
    return signatory;
  }


  public void setSignatory(String signatory) {
    this.signatory = signatory;
  }


  public BankAccountBase checkTemplate(CheckTemplateEnum checkTemplate) {
    
    this.checkTemplate = checkTemplate;
    return this;
  }

   /**
   * The check template used for printing. The defualt value is &#x60;common&#x60;. If you bank with JP Morgan Chase and wish to use Positive Pay use the &#x60;jpm&#x60; template. &#x60;jpm&#x60; requires additional information to be provided.
   * @return checkTemplate
  **/
  @javax.annotation.Nullable
  public CheckTemplateEnum getCheckTemplate() {
    return checkTemplate;
  }


  public void setCheckTemplate(CheckTemplateEnum checkTemplate) {
    this.checkTemplate = checkTemplate;
  }


  public BankAccountBase fractionalRoutingNumber(String fractionalRoutingNumber) {
    
    this.fractionalRoutingNumber = fractionalRoutingNumber;
    return this;
  }

   /**
   * The fractional routing number for your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the fractional routing number associated with your home bank institution.
   * @return fractionalRoutingNumber
  **/
  @javax.annotation.Nullable
  public String getFractionalRoutingNumber() {
    return fractionalRoutingNumber;
  }


  public void setFractionalRoutingNumber(String fractionalRoutingNumber) {
    this.fractionalRoutingNumber = fractionalRoutingNumber;
  }


  public BankAccountBase city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city associated with your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the city associated with your home bank institution.
   * @return city
  **/
  @javax.annotation.Nullable
  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public BankAccountBase state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state associated with your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the state associated with your home bank institution.
   * @return state
  **/
  @javax.annotation.Nullable
  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public BankAccountBase zipcode(String zipcode) {
    
    this.zipcode = zipcode;
    return this;
  }

   /**
   * The zipcode associated with your home bank account. Required for the &#x60;jpm&#x60; check template only. Please contact a bank representative if you do not know the zipcode associated with your home bank institution.
   * @return zipcode
  **/
  @javax.annotation.Nullable
  public String getZipcode() {
    return zipcode;
  }


  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }


  public BankAccountBase metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public BankAccountBase putMetadataItem(String key, String metadataItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountBase bankAccountBase = (BankAccountBase) o;
    return Objects.equals(this.description, bankAccountBase.description) &&
        Objects.equals(this.routingNumber, bankAccountBase.routingNumber) &&
        Objects.equals(this.accountNumber, bankAccountBase.accountNumber) &&
        Objects.equals(this.accountType, bankAccountBase.accountType) &&
        Objects.equals(this.signatory, bankAccountBase.signatory) &&
        Objects.equals(this.checkTemplate, bankAccountBase.checkTemplate) &&
        Objects.equals(this.fractionalRoutingNumber, bankAccountBase.fractionalRoutingNumber) &&
        Objects.equals(this.city, bankAccountBase.city) &&
        Objects.equals(this.state, bankAccountBase.state) &&
        Objects.equals(this.zipcode, bankAccountBase.zipcode) &&
        Objects.equals(this.metadata, bankAccountBase.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, routingNumber, accountNumber, accountType, signatory, checkTemplate, fractionalRoutingNumber, city, state, zipcode, metadata);
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
    sb.append("class BankAccountBase {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    routingNumber: ").append(toIndentedString(routingNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    signatory: ").append(toIndentedString(signatory)).append("\n");
    sb.append("    checkTemplate: ").append(toIndentedString(checkTemplate)).append("\n");
    sb.append("    fractionalRoutingNumber: ").append(toIndentedString(fractionalRoutingNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("routing_number");
    openapiFields.add("account_number");
    openapiFields.add("account_type");
    openapiFields.add("signatory");
    openapiFields.add("check_template");
    openapiFields.add("fractional_routing_number");
    openapiFields.add("city");
    openapiFields.add("state");
    openapiFields.add("zipcode");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("routing_number");
    openapiRequiredFields.add("account_number");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("signatory");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BankAccountBase
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BankAccountBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BankAccountBase is not found in the empty JSON string", BankAccountBase.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BankAccountBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BankAccountBase` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BankAccountBase.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("routing_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `routing_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("routing_number").toString()));
      }
      if (!jsonObj.get("account_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_number").toString()));
      }
      if (!jsonObj.get("account_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_type").toString()));
      }
      // validate the required field `account_type`
      AccountTypeEnum.validateJsonElement(jsonObj.get("account_type"));
      if (!jsonObj.get("signatory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signatory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signatory").toString()));
      }
      if ((jsonObj.get("check_template") != null && !jsonObj.get("check_template").isJsonNull()) && !jsonObj.get("check_template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `check_template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("check_template").toString()));
      }
      // validate the optional field `check_template`
      if (jsonObj.get("check_template") != null && !jsonObj.get("check_template").isJsonNull()) {
        CheckTemplateEnum.validateJsonElement(jsonObj.get("check_template"));
      }
      if ((jsonObj.get("fractional_routing_number") != null && !jsonObj.get("fractional_routing_number").isJsonNull()) && !jsonObj.get("fractional_routing_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fractional_routing_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fractional_routing_number").toString()));
      }
      if ((jsonObj.get("city") != null && !jsonObj.get("city").isJsonNull()) && !jsonObj.get("city").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("zipcode") != null && !jsonObj.get("zipcode").isJsonNull()) && !jsonObj.get("zipcode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zipcode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zipcode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BankAccountBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BankAccountBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BankAccountBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BankAccountBase.class));

       return (TypeAdapter<T>) new TypeAdapter<BankAccountBase>() {
           @Override
           public void write(JsonWriter out, BankAccountBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BankAccountBase read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BankAccountBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BankAccountBase
  * @throws IOException if the JSON string is invalid with respect to BankAccountBase
  */
  public static BankAccountBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BankAccountBase.class);
  }

 /**
  * Convert an instance of BankAccountBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

