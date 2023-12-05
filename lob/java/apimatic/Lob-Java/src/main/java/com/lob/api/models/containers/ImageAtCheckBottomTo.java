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
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = ImageAtCheckBottomTo.ImageAtCheckBottomToDeserializer.class)
public abstract class ImageAtCheckBottomTo {
    
    /**
     * This is String case.
     * @param mString String value for mString.
     * @return The MStringCase object.
     */
    public static ImageAtCheckBottomTo fromMString(String mString) {
        return mString == null ? null : new MStringCase(mString);
    }

    /**
     * This is inline_address_us_chk case.
     * @param inlineAddressUsChk InlineAddressUsChk value for inlineAddressUsChk.
     * @return The Case1 object.
     */
    public static ImageAtCheckBottomTo fromInlineAddressUsChk(
            InlineAddressUsChk inlineAddressUsChk) {
        return inlineAddressUsChk == null ? null : new Case1(inlineAddressUsChk);
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
        R mString(String mString);

        R inlineAddressUsChk(InlineAddressUsChk inlineAddressUsChk);
    }

    /**
     * This is a implementation class for MStringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase(type = "String")
    private static class MStringCase extends ImageAtCheckBottomTo {

        @JsonValue
        private String mString;

        MStringCase(String mString) {
            this.mString = mString;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mString(this.mString);
        }

        @JsonCreator
        private MStringCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isTextual()) {
                this.mString = ApiHelper.deserialize(jsonNode, String.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return mString.toString();
        }
    }

    /**
     * This is a implementation class for Case1Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "InlineAddressUsChk")
    private static class Case1 extends ImageAtCheckBottomTo {

        @JsonValue
        private InlineAddressUsChk case1;

        Case1(InlineAddressUsChk case1) {
            this.case1 = case1;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.inlineAddressUsChk(this.case1);
        }

        @JsonCreator
        private Case1(JsonNode jsonNode) throws IOException {
            this.case1 = ApiHelper.deserialize(jsonNode,
                InlineAddressUsChk.class);
        }

        @Override
        public String toString() {
            return case1.toString();
        }
    }

    /**
     * This is a custom deserializer class for ImageAtCheckBottomTo.
     */
    protected static class ImageAtCheckBottomToDeserializer
            extends JsonDeserializer<ImageAtCheckBottomTo> {

        @Override
        public ImageAtCheckBottomTo deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MStringCase.class, Case1.class), true);
        }
    }

}
