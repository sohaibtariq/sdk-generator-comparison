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
import com.lob.api.models.CompanyValidation;
import com.lob.api.models.RecipientValidation;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = IdentityValidation.IdentityValidationDeserializer.class)
public abstract class IdentityValidation {
    
    /**
     * This is recipient_validation case.
     * @param recipientValidation RecipientValidation value for recipientValidation.
     * @return The RecipientValidationCase object.
     */
    public static IdentityValidation fromRecipientValidation(
            RecipientValidation recipientValidation) {
        return recipientValidation == null ? null : new RecipientValidationCase(recipientValidation);
    }

    /**
     * This is company_validation case.
     * @param companyValidation CompanyValidation value for companyValidation.
     * @return The CompanyValidationCase object.
     */
    public static IdentityValidation fromCompanyValidation(CompanyValidation companyValidation) {
        return companyValidation == null ? null : new CompanyValidationCase(companyValidation);
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
        R recipientValidation(RecipientValidation recipientValidation);

        R companyValidation(CompanyValidation companyValidation);
    }

    /**
     * This is a implementation class for RecipientValidationCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RecipientValidation")
    private static class RecipientValidationCase extends IdentityValidation {

        @JsonValue
        private RecipientValidation recipientValidation;

        RecipientValidationCase(RecipientValidation recipientValidation) {
            this.recipientValidation = recipientValidation;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.recipientValidation(this.recipientValidation);
        }

        @JsonCreator
        private RecipientValidationCase(JsonNode jsonNode) throws IOException {
            this.recipientValidation = ApiHelper.deserialize(jsonNode,
                RecipientValidation.class);
        }

        @Override
        public String toString() {
            return recipientValidation.toString();
        }
    }

    /**
     * This is a implementation class for CompanyValidationCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CompanyValidation")
    private static class CompanyValidationCase extends IdentityValidation {

        @JsonValue
        private CompanyValidation companyValidation;

        CompanyValidationCase(CompanyValidation companyValidation) {
            this.companyValidation = companyValidation;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.companyValidation(this.companyValidation);
        }

        @JsonCreator
        private CompanyValidationCase(JsonNode jsonNode) throws IOException {
            this.companyValidation = ApiHelper.deserialize(jsonNode,
                CompanyValidation.class);
        }

        @Override
        public String toString() {
            return companyValidation.toString();
        }
    }

    /**
     * This is a custom deserializer class for IdentityValidation.
     */
    protected static class IdentityValidationDeserializer
            extends JsonDeserializer<IdentityValidation> {

        @Override
        public IdentityValidation deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(RecipientValidationCase.class,
                    CompanyValidationCase.class), true);
        }
    }

}
