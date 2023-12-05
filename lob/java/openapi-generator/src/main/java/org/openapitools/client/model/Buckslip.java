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
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.BuckslipOrder;
import org.openapitools.client.model.Thumbnail;

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
 * Buckslip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class Buckslip {
  public static final String SERIALIZED_NAME_DATE_CREATED = "date_created";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_DATE_MODIFIED = "date_modified";
  @SerializedName(SERIALIZED_NAME_DATE_MODIFIED)
  private OffsetDateTime dateModified;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  /**
   * object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    BUCKSLIP("buckslip");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ObjectEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object = ObjectEnum.BUCKSLIP;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The size of the buckslip
   */
  @JsonAdapter(SizeEnum.Adapter.class)
  public enum SizeEnum {
    _8_75X3_75("8.75x3.75");

    private String value;

    SizeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SizeEnum fromValue(String value) {
      for (SizeEnum b : SizeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SizeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SizeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SizeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SizeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SizeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private SizeEnum size = SizeEnum._8_75X3_75;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AUTO_REORDER = "auto_reorder";
  @SerializedName(SERIALIZED_NAME_AUTO_REORDER)
  private Boolean autoReorder = false;

  public static final String SERIALIZED_NAME_REORDER_QUANTITY = "reorder_quantity";
  @SerializedName(SERIALIZED_NAME_REORDER_QUANTITY)
  private Integer reorderQuantity;

  public static final String SERIALIZED_NAME_THRESHOLD_AMOUNT = "threshold_amount";
  @SerializedName(SERIALIZED_NAME_THRESHOLD_AMOUNT)
  private Integer thresholdAmount = 0;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private URI url;

  public static final String SERIALIZED_NAME_RAW_URL = "raw_url";
  @SerializedName(SERIALIZED_NAME_RAW_URL)
  private URI rawUrl;

  public static final String SERIALIZED_NAME_FRONT_ORIGINAL_URL = "front_original_url";
  @SerializedName(SERIALIZED_NAME_FRONT_ORIGINAL_URL)
  private URI frontOriginalUrl;

  public static final String SERIALIZED_NAME_BACK_ORIGINAL_URL = "back_original_url";
  @SerializedName(SERIALIZED_NAME_BACK_ORIGINAL_URL)
  private URI backOriginalUrl;

  public static final String SERIALIZED_NAME_THUMBNAILS = "thumbnails";
  @SerializedName(SERIALIZED_NAME_THUMBNAILS)
  private List<Thumbnail> thumbnails = new ArrayList<>();

  public static final String SERIALIZED_NAME_AVAILABLE_QUANTITY = "available_quantity";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_QUANTITY)
  private BigDecimal availableQuantity = new BigDecimal("0");

  public static final String SERIALIZED_NAME_ALLOCATED_QUANTITY = "allocated_quantity";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_QUANTITY)
  private BigDecimal allocatedQuantity = new BigDecimal("0");

  public static final String SERIALIZED_NAME_ONHAND_QUANTITY = "onhand_quantity";
  @SerializedName(SERIALIZED_NAME_ONHAND_QUANTITY)
  private BigDecimal onhandQuantity = new BigDecimal("0");

  public static final String SERIALIZED_NAME_PENDING_QUANTITY = "pending_quantity";
  @SerializedName(SERIALIZED_NAME_PENDING_QUANTITY)
  private BigDecimal pendingQuantity = new BigDecimal("0");

  public static final String SERIALIZED_NAME_PROJECTED_QUANTITY = "projected_quantity";
  @SerializedName(SERIALIZED_NAME_PROJECTED_QUANTITY)
  private BigDecimal projectedQuantity = new BigDecimal("0");

  public static final String SERIALIZED_NAME_BUCKSLIP_ORDERS = "buckslip_orders";
  @SerializedName(SERIALIZED_NAME_BUCKSLIP_ORDERS)
  private List<BuckslipOrder> buckslipOrders = new ArrayList<>();

  /**
   * Gets or Sets stock
   */
  @JsonAdapter(StockEnum.Adapter.class)
  public enum StockEnum {
    TEXT("text"),
    
    COVER("cover");

    private String value;

    StockEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StockEnum fromValue(String value) {
      for (StockEnum b : StockEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StockEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StockEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StockEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StockEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StockEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STOCK = "stock";
  @SerializedName(SERIALIZED_NAME_STOCK)
  private StockEnum stock;

  /**
   * Gets or Sets weight
   */
  @JsonAdapter(WeightEnum.Adapter.class)
  public enum WeightEnum {
    _80_("80#");

    private String value;

    WeightEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WeightEnum fromValue(String value) {
      for (WeightEnum b : WeightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WeightEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WeightEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WeightEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WeightEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      WeightEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private WeightEnum weight;

  /**
   * Gets or Sets finish
   */
  @JsonAdapter(FinishEnum.Adapter.class)
  public enum FinishEnum {
    GLOSS("gloss"),
    
    MATTE("matte");

    private String value;

    FinishEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FinishEnum fromValue(String value) {
      for (FinishEnum b : FinishEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FinishEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FinishEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FinishEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FinishEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FinishEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FINISH = "finish";
  @SerializedName(SERIALIZED_NAME_FINISH)
  private FinishEnum finish;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PROCESSED("processed"),
    
    RENDERED("rendered"),
    
    FAILED("failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public Buckslip() {
  }

  public Buckslip dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was created.
   * @return dateCreated
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public Buckslip dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * A timestamp in ISO 8601 format of the date the resource was last modified.
   * @return dateModified
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public Buckslip deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Only returned if the resource has been successfully deleted.
   * @return deleted
  **/
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public Buckslip _object(ObjectEnum _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * object
   * @return _object
  **/
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }


  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public Buckslip description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the buckslip.
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Buckslip size(SizeEnum size) {
    
    this.size = size;
    return this;
  }

   /**
   * The size of the buckslip
   * @return size
  **/
  @javax.annotation.Nullable
  public SizeEnum getSize() {
    return size;
  }


  public void setSize(SizeEnum size) {
    this.size = size;
  }


  public Buckslip id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier prefixed with &#x60;bck_&#x60;.
   * @return id
  **/
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Buckslip autoReorder(Boolean autoReorder) {
    
    this.autoReorder = autoReorder;
    return this;
  }

   /**
   * True if the buckslips should be auto-reordered.
   * @return autoReorder
  **/
  @javax.annotation.Nonnull
  public Boolean getAutoReorder() {
    return autoReorder;
  }


  public void setAutoReorder(Boolean autoReorder) {
    this.autoReorder = autoReorder;
  }


  public Buckslip reorderQuantity(Integer reorderQuantity) {
    
    this.reorderQuantity = reorderQuantity;
    return this;
  }

   /**
   * The number of buckslips to be reordered.
   * @return reorderQuantity
  **/
  @javax.annotation.Nullable
  public Integer getReorderQuantity() {
    return reorderQuantity;
  }


  public void setReorderQuantity(Integer reorderQuantity) {
    this.reorderQuantity = reorderQuantity;
  }


  public Buckslip thresholdAmount(Integer thresholdAmount) {
    
    this.thresholdAmount = thresholdAmount;
    return this;
  }

   /**
   * The threshold amount of the buckslip
   * @return thresholdAmount
  **/
  @javax.annotation.Nonnull
  public Integer getThresholdAmount() {
    return thresholdAmount;
  }


  public void setThresholdAmount(Integer thresholdAmount) {
    this.thresholdAmount = thresholdAmount;
  }


  public Buckslip url(URI url) {
    
    this.url = url;
    return this;
  }

   /**
   * The signed link for the buckslip.
   * @return url
  **/
  @javax.annotation.Nonnull
  public URI getUrl() {
    return url;
  }


  public void setUrl(URI url) {
    this.url = url;
  }


  public Buckslip rawUrl(URI rawUrl) {
    
    this.rawUrl = rawUrl;
    return this;
  }

   /**
   * The raw URL of the buckslip.
   * @return rawUrl
  **/
  @javax.annotation.Nonnull
  public URI getRawUrl() {
    return rawUrl;
  }


  public void setRawUrl(URI rawUrl) {
    this.rawUrl = rawUrl;
  }


  public Buckslip frontOriginalUrl(URI frontOriginalUrl) {
    
    this.frontOriginalUrl = frontOriginalUrl;
    return this;
  }

   /**
   * The original URL of the front template.
   * @return frontOriginalUrl
  **/
  @javax.annotation.Nonnull
  public URI getFrontOriginalUrl() {
    return frontOriginalUrl;
  }


  public void setFrontOriginalUrl(URI frontOriginalUrl) {
    this.frontOriginalUrl = frontOriginalUrl;
  }


  public Buckslip backOriginalUrl(URI backOriginalUrl) {
    
    this.backOriginalUrl = backOriginalUrl;
    return this;
  }

   /**
   * The original URL of the back template.
   * @return backOriginalUrl
  **/
  @javax.annotation.Nonnull
  public URI getBackOriginalUrl() {
    return backOriginalUrl;
  }


  public void setBackOriginalUrl(URI backOriginalUrl) {
    this.backOriginalUrl = backOriginalUrl;
  }


  public Buckslip thumbnails(List<Thumbnail> thumbnails) {
    
    this.thumbnails = thumbnails;
    return this;
  }

  public Buckslip addThumbnailsItem(Thumbnail thumbnailsItem) {
    if (this.thumbnails == null) {
      this.thumbnails = new ArrayList<>();
    }
    this.thumbnails.add(thumbnailsItem);
    return this;
  }

   /**
   * Get thumbnails
   * @return thumbnails
  **/
  @javax.annotation.Nonnull
  public List<Thumbnail> getThumbnails() {
    return thumbnails;
  }


  public void setThumbnails(List<Thumbnail> thumbnails) {
    this.thumbnails = thumbnails;
  }


  public Buckslip availableQuantity(BigDecimal availableQuantity) {
    
    this.availableQuantity = availableQuantity;
    return this;
  }

   /**
   * The available quantity of buckslips.
   * @return availableQuantity
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAvailableQuantity() {
    return availableQuantity;
  }


  public void setAvailableQuantity(BigDecimal availableQuantity) {
    this.availableQuantity = availableQuantity;
  }


  public Buckslip allocatedQuantity(BigDecimal allocatedQuantity) {
    
    this.allocatedQuantity = allocatedQuantity;
    return this;
  }

   /**
   * The allocated quantity of buckslips.
   * @return allocatedQuantity
  **/
  @javax.annotation.Nonnull
  public BigDecimal getAllocatedQuantity() {
    return allocatedQuantity;
  }


  public void setAllocatedQuantity(BigDecimal allocatedQuantity) {
    this.allocatedQuantity = allocatedQuantity;
  }


  public Buckslip onhandQuantity(BigDecimal onhandQuantity) {
    
    this.onhandQuantity = onhandQuantity;
    return this;
  }

   /**
   * The onhand quantity of buckslips.
   * @return onhandQuantity
  **/
  @javax.annotation.Nonnull
  public BigDecimal getOnhandQuantity() {
    return onhandQuantity;
  }


  public void setOnhandQuantity(BigDecimal onhandQuantity) {
    this.onhandQuantity = onhandQuantity;
  }


  public Buckslip pendingQuantity(BigDecimal pendingQuantity) {
    
    this.pendingQuantity = pendingQuantity;
    return this;
  }

   /**
   * The pending quantity of buckslips.
   * @return pendingQuantity
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPendingQuantity() {
    return pendingQuantity;
  }


  public void setPendingQuantity(BigDecimal pendingQuantity) {
    this.pendingQuantity = pendingQuantity;
  }


  public Buckslip projectedQuantity(BigDecimal projectedQuantity) {
    
    this.projectedQuantity = projectedQuantity;
    return this;
  }

   /**
   * The sum of pending and onhand quantities of buckslips.
   * @return projectedQuantity
  **/
  @javax.annotation.Nonnull
  public BigDecimal getProjectedQuantity() {
    return projectedQuantity;
  }


  public void setProjectedQuantity(BigDecimal projectedQuantity) {
    this.projectedQuantity = projectedQuantity;
  }


  public Buckslip buckslipOrders(List<BuckslipOrder> buckslipOrders) {
    
    this.buckslipOrders = buckslipOrders;
    return this;
  }

  public Buckslip addBuckslipOrdersItem(BuckslipOrder buckslipOrdersItem) {
    if (this.buckslipOrders == null) {
      this.buckslipOrders = new ArrayList<>();
    }
    this.buckslipOrders.add(buckslipOrdersItem);
    return this;
  }

   /**
   * An array of buckslip orders that are associated with the buckslip.
   * @return buckslipOrders
  **/
  @javax.annotation.Nonnull
  public List<BuckslipOrder> getBuckslipOrders() {
    return buckslipOrders;
  }


  public void setBuckslipOrders(List<BuckslipOrder> buckslipOrders) {
    this.buckslipOrders = buckslipOrders;
  }


  public Buckslip stock(StockEnum stock) {
    
    this.stock = stock;
    return this;
  }

   /**
   * Get stock
   * @return stock
  **/
  @javax.annotation.Nonnull
  public StockEnum getStock() {
    return stock;
  }


  public void setStock(StockEnum stock) {
    this.stock = stock;
  }


  public Buckslip weight(WeightEnum weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nonnull
  public WeightEnum getWeight() {
    return weight;
  }


  public void setWeight(WeightEnum weight) {
    this.weight = weight;
  }


  public Buckslip finish(FinishEnum finish) {
    
    this.finish = finish;
    return this;
  }

   /**
   * Get finish
   * @return finish
  **/
  @javax.annotation.Nonnull
  public FinishEnum getFinish() {
    return finish;
  }


  public void setFinish(FinishEnum finish) {
    this.finish = finish;
  }


  public Buckslip status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Buckslip buckslip = (Buckslip) o;
    return Objects.equals(this.dateCreated, buckslip.dateCreated) &&
        Objects.equals(this.dateModified, buckslip.dateModified) &&
        Objects.equals(this.deleted, buckslip.deleted) &&
        Objects.equals(this._object, buckslip._object) &&
        Objects.equals(this.description, buckslip.description) &&
        Objects.equals(this.size, buckslip.size) &&
        Objects.equals(this.id, buckslip.id) &&
        Objects.equals(this.autoReorder, buckslip.autoReorder) &&
        Objects.equals(this.reorderQuantity, buckslip.reorderQuantity) &&
        Objects.equals(this.thresholdAmount, buckslip.thresholdAmount) &&
        Objects.equals(this.url, buckslip.url) &&
        Objects.equals(this.rawUrl, buckslip.rawUrl) &&
        Objects.equals(this.frontOriginalUrl, buckslip.frontOriginalUrl) &&
        Objects.equals(this.backOriginalUrl, buckslip.backOriginalUrl) &&
        Objects.equals(this.thumbnails, buckslip.thumbnails) &&
        Objects.equals(this.availableQuantity, buckslip.availableQuantity) &&
        Objects.equals(this.allocatedQuantity, buckslip.allocatedQuantity) &&
        Objects.equals(this.onhandQuantity, buckslip.onhandQuantity) &&
        Objects.equals(this.pendingQuantity, buckslip.pendingQuantity) &&
        Objects.equals(this.projectedQuantity, buckslip.projectedQuantity) &&
        Objects.equals(this.buckslipOrders, buckslip.buckslipOrders) &&
        Objects.equals(this.stock, buckslip.stock) &&
        Objects.equals(this.weight, buckslip.weight) &&
        Objects.equals(this.finish, buckslip.finish) &&
        Objects.equals(this.status, buckslip.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateCreated, dateModified, deleted, _object, description, size, id, autoReorder, reorderQuantity, thresholdAmount, url, rawUrl, frontOriginalUrl, backOriginalUrl, thumbnails, availableQuantity, allocatedQuantity, onhandQuantity, pendingQuantity, projectedQuantity, buckslipOrders, stock, weight, finish, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Buckslip {\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    autoReorder: ").append(toIndentedString(autoReorder)).append("\n");
    sb.append("    reorderQuantity: ").append(toIndentedString(reorderQuantity)).append("\n");
    sb.append("    thresholdAmount: ").append(toIndentedString(thresholdAmount)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    rawUrl: ").append(toIndentedString(rawUrl)).append("\n");
    sb.append("    frontOriginalUrl: ").append(toIndentedString(frontOriginalUrl)).append("\n");
    sb.append("    backOriginalUrl: ").append(toIndentedString(backOriginalUrl)).append("\n");
    sb.append("    thumbnails: ").append(toIndentedString(thumbnails)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
    sb.append("    allocatedQuantity: ").append(toIndentedString(allocatedQuantity)).append("\n");
    sb.append("    onhandQuantity: ").append(toIndentedString(onhandQuantity)).append("\n");
    sb.append("    pendingQuantity: ").append(toIndentedString(pendingQuantity)).append("\n");
    sb.append("    projectedQuantity: ").append(toIndentedString(projectedQuantity)).append("\n");
    sb.append("    buckslipOrders: ").append(toIndentedString(buckslipOrders)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    finish: ").append(toIndentedString(finish)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("date_created");
    openapiFields.add("date_modified");
    openapiFields.add("deleted");
    openapiFields.add("object");
    openapiFields.add("description");
    openapiFields.add("size");
    openapiFields.add("id");
    openapiFields.add("auto_reorder");
    openapiFields.add("reorder_quantity");
    openapiFields.add("threshold_amount");
    openapiFields.add("url");
    openapiFields.add("raw_url");
    openapiFields.add("front_original_url");
    openapiFields.add("back_original_url");
    openapiFields.add("thumbnails");
    openapiFields.add("available_quantity");
    openapiFields.add("allocated_quantity");
    openapiFields.add("onhand_quantity");
    openapiFields.add("pending_quantity");
    openapiFields.add("projected_quantity");
    openapiFields.add("buckslip_orders");
    openapiFields.add("stock");
    openapiFields.add("weight");
    openapiFields.add("finish");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("date_created");
    openapiRequiredFields.add("date_modified");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("auto_reorder");
    openapiRequiredFields.add("reorder_quantity");
    openapiRequiredFields.add("threshold_amount");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("raw_url");
    openapiRequiredFields.add("front_original_url");
    openapiRequiredFields.add("back_original_url");
    openapiRequiredFields.add("thumbnails");
    openapiRequiredFields.add("available_quantity");
    openapiRequiredFields.add("allocated_quantity");
    openapiRequiredFields.add("onhand_quantity");
    openapiRequiredFields.add("pending_quantity");
    openapiRequiredFields.add("projected_quantity");
    openapiRequiredFields.add("buckslip_orders");
    openapiRequiredFields.add("stock");
    openapiRequiredFields.add("weight");
    openapiRequiredFields.add("finish");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Buckslip
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Buckslip.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Buckslip is not found in the empty JSON string", Buckslip.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Buckslip.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Buckslip` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Buckslip.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `object`
      ObjectEnum.validateJsonElement(jsonObj.get("object"));
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      // validate the optional field `size`
      if (jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) {
        SizeEnum.validateJsonElement(jsonObj.get("size"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("raw_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `raw_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("raw_url").toString()));
      }
      if (!jsonObj.get("front_original_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `front_original_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("front_original_url").toString()));
      }
      if (!jsonObj.get("back_original_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `back_original_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("back_original_url").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("thumbnails").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnails` to be an array in the JSON string but got `%s`", jsonObj.get("thumbnails").toString()));
      }

      JsonArray jsonArraythumbnails = jsonObj.getAsJsonArray("thumbnails");
      // validate the required field `thumbnails` (array)
      for (int i = 0; i < jsonArraythumbnails.size(); i++) {
        Thumbnail.validateJsonElement(jsonArraythumbnails.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("buckslip_orders").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buckslip_orders` to be an array in the JSON string but got `%s`", jsonObj.get("buckslip_orders").toString()));
      }

      JsonArray jsonArraybuckslipOrders = jsonObj.getAsJsonArray("buckslip_orders");
      // validate the required field `buckslip_orders` (array)
      for (int i = 0; i < jsonArraybuckslipOrders.size(); i++) {
        BuckslipOrder.validateJsonElement(jsonArraybuckslipOrders.get(i));
      };
      if (!jsonObj.get("stock").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stock` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stock").toString()));
      }
      // validate the required field `stock`
      StockEnum.validateJsonElement(jsonObj.get("stock"));
      if (!jsonObj.get("weight").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `weight` to be a primitive type in the JSON string but got `%s`", jsonObj.get("weight").toString()));
      }
      // validate the required field `weight`
      WeightEnum.validateJsonElement(jsonObj.get("weight"));
      if (!jsonObj.get("finish").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finish` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finish").toString()));
      }
      // validate the required field `finish`
      FinishEnum.validateJsonElement(jsonObj.get("finish"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Buckslip.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Buckslip' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Buckslip> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Buckslip.class));

       return (TypeAdapter<T>) new TypeAdapter<Buckslip>() {
           @Override
           public void write(JsonWriter out, Buckslip value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Buckslip read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Buckslip given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Buckslip
  * @throws IOException if the JSON string is invalid with respect to Buckslip
  */
  public static Buckslip fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Buckslip.class);
  }

 /**
  * Convert an instance of Buckslip to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

