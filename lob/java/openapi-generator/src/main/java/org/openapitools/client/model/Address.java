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
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.client.model.AddressIntl;
import org.openapitools.client.model.AddressUs;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-28T10:58:18.138843-08:00[America/Los_Angeles]")
public class Address extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Address.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Address.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Address' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddressUs> adapterAddressUs = gson.getDelegateAdapter(this, TypeToken.get(AddressUs.class));
            final TypeAdapter<AddressIntl> adapterAddressIntl = gson.getDelegateAdapter(this, TypeToken.get(AddressIntl.class));

            return (TypeAdapter<T>) new TypeAdapter<Address>() {
                @Override
                public void write(JsonWriter out, Address value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AddressUs`
                    if (value.getActualInstance() instanceof AddressUs) {
                      JsonElement element = adapterAddressUs.toJsonTree((AddressUs)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `AddressIntl`
                    if (value.getActualInstance() instanceof AddressIntl) {
                      JsonElement element = adapterAddressIntl.toJsonTree((AddressIntl)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AddressIntl, AddressUs");
                }

                @Override
                public Address read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize AddressUs
                    try {
                      // validate the JSON object to see if any exception is thrown
                      AddressUs.validateJsonElement(jsonElement);
                      actualAdapter = adapterAddressUs;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'AddressUs'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for AddressUs failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'AddressUs'", e);
                    }
                    // deserialize AddressIntl
                    try {
                      // validate the JSON object to see if any exception is thrown
                      AddressIntl.validateJsonElement(jsonElement);
                      actualAdapter = adapterAddressIntl;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'AddressIntl'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for AddressIntl failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'AddressIntl'", e);
                    }

                    if (match == 1) {
                        Address ret = new Address();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for Address: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Address() {
        super("oneOf", Boolean.FALSE);
    }

    public Address(AddressIntl o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public Address(AddressUs o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AddressUs", AddressUs.class);
        schemas.put("AddressIntl", AddressIntl.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Address.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AddressIntl, AddressUs
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AddressUs) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AddressIntl) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AddressIntl, AddressUs");
    }

    /**
     * Get the actual instance, which can be the following:
     * AddressIntl, AddressUs
     *
     * @return The actual instance (AddressIntl, AddressUs)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AddressUs`. If the actual instance is not `AddressUs`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddressUs`
     * @throws ClassCastException if the instance is not `AddressUs`
     */
    public AddressUs getAddressUs() throws ClassCastException {
        return (AddressUs)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AddressIntl`. If the actual instance is not `AddressIntl`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AddressIntl`
     * @throws ClassCastException if the instance is not `AddressIntl`
     */
    public AddressIntl getAddressIntl() throws ClassCastException {
        return (AddressIntl)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Address
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with AddressUs
    try {
      AddressUs.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AddressUs failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AddressIntl
    try {
      AddressIntl.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AddressIntl failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for Address with oneOf schemas: AddressIntl, AddressUs. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of Address given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Address
  * @throws IOException if the JSON string is invalid with respect to Address
  */
  public static Address fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Address.class);
  }

 /**
  * Convert an instance of Address to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
