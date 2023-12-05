/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.lob.api.ApiHelper;
import com.lob.api.models.AddressIntl;
import com.lob.api.models.AddressUs;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = Address.AddressDeserializer.class)
public abstract class Address {
    
    /**
     * This is address_us case.
     * @param addressUs AddressUs value for addressUs.
     * @return The AddressUsCase object.
     */
    public static Address fromAddressUs(AddressUs addressUs) {
        return addressUs == null ? null : new AddressUsCase(addressUs);
    }

    /**
     * This is address_intl case.
     * @param addressIntl AddressIntl value for addressIntl.
     * @return The AddressIntlCase object.
     */
    public static Address fromAddressIntl(AddressIntl addressIntl) {
        return addressIntl == null ? null : new AddressIntlCase(addressIntl);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R addressUs(AddressUs addressUs);

        R addressIntl(AddressIntl addressIntl);
    }

    /**
     * This is a implementation class for AddressUsCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AddressUs")
    private static class AddressUsCase extends Address {

        @JsonValue
        private AddressUs addressUs;

        AddressUsCase(AddressUs addressUs) {
            this.addressUs = addressUs;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.addressUs(this.addressUs);
        }

        @JsonCreator
        private AddressUsCase(JsonNode jsonNode) throws IOException {
            this.addressUs = ApiHelper.deserialize(jsonNode,
                AddressUs.class);
        }

        @Override
        public String toString() {
            return addressUs.toString();
        }
    }

    /**
     * This is a implementation class for AddressIntlCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AddressIntl")
    private static class AddressIntlCase extends Address {

        @JsonValue
        private AddressIntl addressIntl;

        AddressIntlCase(AddressIntl addressIntl) {
            this.addressIntl = addressIntl;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.addressIntl(this.addressIntl);
        }

        @JsonCreator
        private AddressIntlCase(JsonNode jsonNode) throws IOException {
            this.addressIntl = ApiHelper.deserialize(jsonNode,
                AddressIntl.class);
        }

        @Override
        public String toString() {
            return addressIntl.toString();
        }
    }

    /**
     * This is a custom deserializer class for Address.
     */
    protected static class AddressDeserializer
            extends JsonDeserializer<Address> {

        @Override
        public Address deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(AddressUsCase.class,
                    AddressIntlCase.class), true);
        }
    }

}