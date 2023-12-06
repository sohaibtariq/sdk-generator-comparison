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
import com.lob.api.models.AddressTypesEnum;
import com.lob.api.models.BankAccountTypesEnum;
import com.lob.api.models.CheckTypesEnum;
import com.lob.api.models.LetterTypesEnum;
import com.lob.api.models.PostcardTypesEnum;
import com.lob.api.models.SelfMailerTypesEnum;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = EventTypeId.EventTypeIdDeserializer.class)
public abstract class EventTypeId {
    
    /**
     * This is postcard_types case.
     * @param postcardTypes PostcardTypesEnum value for postcardTypes.
     * @return The PostcardTypesCase object.
     */
    public static EventTypeId fromPostcardTypes(PostcardTypesEnum postcardTypes) {
        return postcardTypes == null ? null : new PostcardTypesCase(postcardTypes);
    }

    /**
     * This is self_mailer_types case.
     * @param selfMailerTypes SelfMailerTypesEnum value for selfMailerTypes.
     * @return The SelfMailerTypesCase object.
     */
    public static EventTypeId fromSelfMailerTypes(SelfMailerTypesEnum selfMailerTypes) {
        return selfMailerTypes == null ? null : new SelfMailerTypesCase(selfMailerTypes);
    }

    /**
     * This is letter_types case.
     * @param letterTypes LetterTypesEnum value for letterTypes.
     * @return The LetterTypesCase object.
     */
    public static EventTypeId fromLetterTypes(LetterTypesEnum letterTypes) {
        return letterTypes == null ? null : new LetterTypesCase(letterTypes);
    }

    /**
     * This is check_types case.
     * @param checkTypes CheckTypesEnum value for checkTypes.
     * @return The CheckTypesCase object.
     */
    public static EventTypeId fromCheckTypes(CheckTypesEnum checkTypes) {
        return checkTypes == null ? null : new CheckTypesCase(checkTypes);
    }

    /**
     * This is address_types case.
     * @param addressTypes AddressTypesEnum value for addressTypes.
     * @return The AddressTypesCase object.
     */
    public static EventTypeId fromAddressTypes(AddressTypesEnum addressTypes) {
        return addressTypes == null ? null : new AddressTypesCase(addressTypes);
    }

    /**
     * This is bank_account_types case.
     * @param bankAccountTypes BankAccountTypesEnum value for bankAccountTypes.
     * @return The BankAccountTypesCase object.
     */
    public static EventTypeId fromBankAccountTypes(BankAccountTypesEnum bankAccountTypes) {
        return bankAccountTypes == null ? null : new BankAccountTypesCase(bankAccountTypes);
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
        R postcardTypes(PostcardTypesEnum postcardTypes);

        R selfMailerTypes(SelfMailerTypesEnum selfMailerTypes);

        R letterTypes(LetterTypesEnum letterTypes);

        R checkTypes(CheckTypesEnum checkTypes);

        R addressTypes(AddressTypesEnum addressTypes);

        R bankAccountTypes(BankAccountTypesEnum bankAccountTypes);
    }

    /**
     * This is a implementation class for PostcardTypesCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PostcardTypesEnum")
    private static class PostcardTypesCase extends EventTypeId {

        @JsonValue
        private PostcardTypesEnum postcardTypes;

        PostcardTypesCase(PostcardTypesEnum postcardTypes) {
            this.postcardTypes = postcardTypes;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.postcardTypes(this.postcardTypes);
        }

        @JsonCreator
        private PostcardTypesCase(JsonNode jsonNode) throws IOException {
            this.postcardTypes = 
                PostcardTypesEnum.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.postcardTypes == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return postcardTypes.toString();
        }
    }

    /**
     * This is a implementation class for SelfMailerTypesCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SelfMailerTypesEnum")
    private static class SelfMailerTypesCase extends EventTypeId {

        @JsonValue
        private SelfMailerTypesEnum selfMailerTypes;

        SelfMailerTypesCase(SelfMailerTypesEnum selfMailerTypes) {
            this.selfMailerTypes = selfMailerTypes;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.selfMailerTypes(this.selfMailerTypes);
        }

        @JsonCreator
        private SelfMailerTypesCase(JsonNode jsonNode) throws IOException {
            this.selfMailerTypes = 
                SelfMailerTypesEnum.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.selfMailerTypes == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return selfMailerTypes.toString();
        }
    }

    /**
     * This is a implementation class for LetterTypesCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "LetterTypesEnum")
    private static class LetterTypesCase extends EventTypeId {

        @JsonValue
        private LetterTypesEnum letterTypes;

        LetterTypesCase(LetterTypesEnum letterTypes) {
            this.letterTypes = letterTypes;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.letterTypes(this.letterTypes);
        }

        @JsonCreator
        private LetterTypesCase(JsonNode jsonNode) throws IOException {
            this.letterTypes = 
                LetterTypesEnum.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.letterTypes == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return letterTypes.toString();
        }
    }

    /**
     * This is a implementation class for CheckTypesCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CheckTypesEnum")
    private static class CheckTypesCase extends EventTypeId {

        @JsonValue
        private CheckTypesEnum checkTypes;

        CheckTypesCase(CheckTypesEnum checkTypes) {
            this.checkTypes = checkTypes;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.checkTypes(this.checkTypes);
        }

        @JsonCreator
        private CheckTypesCase(JsonNode jsonNode) throws IOException {
            this.checkTypes = 
                CheckTypesEnum.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.checkTypes == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return checkTypes.toString();
        }
    }

    /**
     * This is a implementation class for AddressTypesCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "AddressTypesEnum")
    private static class AddressTypesCase extends EventTypeId {

        @JsonValue
        private AddressTypesEnum addressTypes;

        AddressTypesCase(AddressTypesEnum addressTypes) {
            this.addressTypes = addressTypes;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.addressTypes(this.addressTypes);
        }

        @JsonCreator
        private AddressTypesCase(JsonNode jsonNode) throws IOException {
            this.addressTypes = 
                AddressTypesEnum.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.addressTypes == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return addressTypes.toString();
        }
    }

    /**
     * This is a implementation class for BankAccountTypesCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "BankAccountTypesEnum")
    private static class BankAccountTypesCase extends EventTypeId {

        @JsonValue
        private BankAccountTypesEnum bankAccountTypes;

        BankAccountTypesCase(BankAccountTypesEnum bankAccountTypes) {
            this.bankAccountTypes = bankAccountTypes;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.bankAccountTypes(this.bankAccountTypes);
        }

        @JsonCreator
        private BankAccountTypesCase(JsonNode jsonNode) throws IOException {
            this.bankAccountTypes = 
                BankAccountTypesEnum.fromString(ApiHelper.deserialize(jsonNode, String.class));
            if (this.bankAccountTypes == null) {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return bankAccountTypes.toString();
        }
    }

    /**
     * This is a custom deserializer class for EventTypeId.
     */
    protected static class EventTypeIdDeserializer
            extends JsonDeserializer<EventTypeId> {

        @Override
        public EventTypeId deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(PostcardTypesCase.class,
                    SelfMailerTypesCase.class, LetterTypesCase.class, CheckTypesCase.class,
                    AddressTypesCase.class, BankAccountTypesCase.class), true);
        }
    }

}