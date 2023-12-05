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
import com.lob.api.models.MultipleComponentsIntl;
import com.lob.api.models.SingleLineAddressIntl;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = IntlVerificationWritable.IntlVerificationWritableDeserializer.class)
public abstract class IntlVerificationWritable {
    
    /**
     * This is multiple_components_intl case.
     * @param multipleComponentsIntl MultipleComponentsIntl value for multipleComponentsIntl.
     * @return The MultipleComponentsIntlCase object.
     */
    public static IntlVerificationWritable fromMultipleComponentsIntl(
            MultipleComponentsIntl multipleComponentsIntl) {
        return multipleComponentsIntl == null ? null : new MultipleComponentsIntlCase(multipleComponentsIntl);
    }

    /**
     * This is single_line_address_intl case.
     * @param singleLineAddressIntl SingleLineAddressIntl value for singleLineAddressIntl.
     * @return The SingleLineAddressIntlCase object.
     */
    public static IntlVerificationWritable fromSingleLineAddressIntl(
            SingleLineAddressIntl singleLineAddressIntl) {
        return singleLineAddressIntl == null ? null : new SingleLineAddressIntlCase(singleLineAddressIntl);
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
        R multipleComponentsIntl(MultipleComponentsIntl multipleComponentsIntl);

        R singleLineAddressIntl(SingleLineAddressIntl singleLineAddressIntl);
    }

    /**
     * This is a implementation class for MultipleComponentsIntlCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "MultipleComponentsIntl")
    private static class MultipleComponentsIntlCase extends IntlVerificationWritable {

        @JsonValue
        private MultipleComponentsIntl multipleComponentsIntl;

        MultipleComponentsIntlCase(MultipleComponentsIntl multipleComponentsIntl) {
            this.multipleComponentsIntl = multipleComponentsIntl;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.multipleComponentsIntl(this.multipleComponentsIntl);
        }

        @JsonCreator
        private MultipleComponentsIntlCase(JsonNode jsonNode) throws IOException {
            this.multipleComponentsIntl = ApiHelper.deserialize(jsonNode,
                MultipleComponentsIntl.class);
        }

        @Override
        public String toString() {
            return multipleComponentsIntl.toString();
        }
    }

    /**
     * This is a implementation class for SingleLineAddressIntlCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SingleLineAddressIntl")
    private static class SingleLineAddressIntlCase extends IntlVerificationWritable {

        @JsonValue
        private SingleLineAddressIntl singleLineAddressIntl;

        SingleLineAddressIntlCase(SingleLineAddressIntl singleLineAddressIntl) {
            this.singleLineAddressIntl = singleLineAddressIntl;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.singleLineAddressIntl(this.singleLineAddressIntl);
        }

        @JsonCreator
        private SingleLineAddressIntlCase(JsonNode jsonNode) throws IOException {
            this.singleLineAddressIntl = ApiHelper.deserialize(jsonNode,
                SingleLineAddressIntl.class);
        }

        @Override
        public String toString() {
            return singleLineAddressIntl.toString();
        }
    }

    /**
     * This is a custom deserializer class for IntlVerificationWritable.
     */
    protected static class IntlVerificationWritableDeserializer
            extends JsonDeserializer<IntlVerificationWritable> {

        @Override
        public IntlVerificationWritable deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MultipleComponentsIntlCase.class,
                    SingleLineAddressIntlCase.class), true);
        }
    }

}
