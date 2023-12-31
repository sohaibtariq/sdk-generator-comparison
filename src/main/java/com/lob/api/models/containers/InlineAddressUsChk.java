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
import com.lob.api.models.AddressObjWithCompanyDefined;
import com.lob.api.models.AddressObjWithNameDefined;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = InlineAddressUsChk.InlineAddressUsChkDeserializer.class)
public abstract class InlineAddressUsChk {
    
    /**
     * This is address obj with `name` defined case.
     * @param addressObjWithNameDefined AddressObjWithNameDefined value for addressObjWithNameDefined.
     * @return The AddressObjWithNameDefinedCase object.
     */
    public static InlineAddressUsChk fromAddressObjWithNameDefined(
            AddressObjWithNameDefined addressObjWithNameDefined) {
        return addressObjWithNameDefined == null ? null : new AddressObjWithNameDefinedCase(addressObjWithNameDefined);
    }

    /**
     * This is address obj with `company` defined case.
     * @param addressObjWithCompanyDefined AddressObjWithCompanyDefined value for addressObjWithCompanyDefined.
     * @return The AddressObjWithCompanyDefinedCase object.
     */
    public static InlineAddressUsChk fromAddressObjWithCompanyDefined(
            AddressObjWithCompanyDefined addressObjWithCompanyDefined) {
        return addressObjWithCompanyDefined == null ? null : new AddressObjWithCompanyDefinedCase(addressObjWithCompanyDefined);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R addressObjWithNameDefined(AddressObjWithNameDefined addressObjWithNameDefined);

        R addressObjWithCompanyDefined(AddressObjWithCompanyDefined addressObjWithCompanyDefined);
    }

    /**
     * This is a implementation class for AddressObjWithNameDefinedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AddressObjWithNameDefined")
    private static class AddressObjWithNameDefinedCase extends InlineAddressUsChk {

        @JsonValue
        private AddressObjWithNameDefined addressObjWithNameDefined;

        AddressObjWithNameDefinedCase(AddressObjWithNameDefined addressObjWithNameDefined) {
            this.addressObjWithNameDefined = addressObjWithNameDefined;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.addressObjWithNameDefined(this.addressObjWithNameDefined);
        }

        @JsonCreator
        private AddressObjWithNameDefinedCase(JsonNode jsonNode) throws IOException {
            this.addressObjWithNameDefined = ApiHelper.deserialize(jsonNode,
                AddressObjWithNameDefined.class);
        }

        @Override
        public String toString() {
            return addressObjWithNameDefined.toString();
        }
    }

    /**
     * This is a implementation class for AddressObjWithCompanyDefinedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AddressObjWithCompanyDefined")
    private static class AddressObjWithCompanyDefinedCase extends InlineAddressUsChk {

        @JsonValue
        private AddressObjWithCompanyDefined addressObjWithCompanyDefined;

        AddressObjWithCompanyDefinedCase(AddressObjWithCompanyDefined addressObjWithCompanyDefined) {
            this.addressObjWithCompanyDefined = addressObjWithCompanyDefined;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.addressObjWithCompanyDefined(this.addressObjWithCompanyDefined);
        }

        @JsonCreator
        private AddressObjWithCompanyDefinedCase(JsonNode jsonNode) throws IOException {
            this.addressObjWithCompanyDefined = ApiHelper.deserialize(jsonNode,
                AddressObjWithCompanyDefined.class);
        }

        @Override
        public String toString() {
            return addressObjWithCompanyDefined.toString();
        }
    }

    /**
     * This is a custom deserializer class for InlineAddressUsChk.
     */
    protected static class InlineAddressUsChkDeserializer
            extends JsonDeserializer<InlineAddressUsChk> {

        @Override
        public InlineAddressUsChk deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(AddressObjWithNameDefinedCase.class,
                    AddressObjWithCompanyDefinedCase.class), false);
        }
    }

}
