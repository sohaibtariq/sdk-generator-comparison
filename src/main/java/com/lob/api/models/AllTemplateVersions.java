/*
 * LobLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.lob.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for AllTemplateVersions type.
 */
public class AllTemplateVersions {
    private String object;
    private OptionalNullable<String> nextUrl;
    private OptionalNullable<String> previousUrl;
    private Integer count;
    private Integer totalCount;
    private List<TemplateVersion> data;

    /**
     * Default constructor.
     */
    public AllTemplateVersions() {
    }

    /**
     * Initialization constructor.
     * @param  object  String value for object.
     * @param  nextUrl  String value for nextUrl.
     * @param  previousUrl  String value for previousUrl.
     * @param  count  Integer value for count.
     * @param  totalCount  Integer value for totalCount.
     * @param  data  List of TemplateVersion value for data.
     */
    public AllTemplateVersions(
            String object,
            String nextUrl,
            String previousUrl,
            Integer count,
            Integer totalCount,
            List<TemplateVersion> data) {
        this.object = object;
        this.nextUrl = OptionalNullable.of(nextUrl);
        this.previousUrl = OptionalNullable.of(previousUrl);
        this.count = count;
        this.totalCount = totalCount;
        this.data = data;
    }

    /**
     * Initialization constructor.
     * @param  object  String value for object.
     * @param  nextUrl  String value for nextUrl.
     * @param  previousUrl  String value for previousUrl.
     * @param  count  Integer value for count.
     * @param  totalCount  Integer value for totalCount.
     * @param  data  List of TemplateVersion value for data.
     */

    protected AllTemplateVersions(String object, OptionalNullable<String> nextUrl,
            OptionalNullable<String> previousUrl, Integer count, Integer totalCount,
            List<TemplateVersion> data) {
        this.object = object;
        this.nextUrl = nextUrl;
        this.previousUrl = previousUrl;
        this.count = count;
        this.totalCount = totalCount;
        this.data = data;
    }

    /**
     * Getter for Object.
     * Value is resource type.
     * @return Returns the String
     */
    @JsonGetter("object")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * Value is resource type.
     * @param object Value for String
     */
    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * Internal Getter for NextUrl.
     * Url of next page of items in list.
     * @return Returns the Internal String
     */
    @JsonGetter("next_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNextUrl() {
        return this.nextUrl;
    }

    /**
     * Getter for NextUrl.
     * Url of next page of items in list.
     * @return Returns the String
     */
    public String getNextUrl() {
        return OptionalNullable.getFrom(nextUrl);
    }

    /**
     * Setter for NextUrl.
     * Url of next page of items in list.
     * @param nextUrl Value for String
     */
    @JsonSetter("next_url")
    public void setNextUrl(String nextUrl) {
        this.nextUrl = OptionalNullable.of(nextUrl);
    }

    /**
     * UnSetter for NextUrl.
     * Url of next page of items in list.
     */
    public void unsetNextUrl() {
        nextUrl = null;
    }

    /**
     * Internal Getter for PreviousUrl.
     * Url of previous page of items in list.
     * @return Returns the Internal String
     */
    @JsonGetter("previous_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPreviousUrl() {
        return this.previousUrl;
    }

    /**
     * Getter for PreviousUrl.
     * Url of previous page of items in list.
     * @return Returns the String
     */
    public String getPreviousUrl() {
        return OptionalNullable.getFrom(previousUrl);
    }

    /**
     * Setter for PreviousUrl.
     * Url of previous page of items in list.
     * @param previousUrl Value for String
     */
    @JsonSetter("previous_url")
    public void setPreviousUrl(String previousUrl) {
        this.previousUrl = OptionalNullable.of(previousUrl);
    }

    /**
     * UnSetter for PreviousUrl.
     * Url of previous page of items in list.
     */
    public void unsetPreviousUrl() {
        previousUrl = null;
    }

    /**
     * Getter for Count.
     * number of resources in a set
     * @return Returns the Integer
     */
    @JsonGetter("count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCount() {
        return count;
    }

    /**
     * Setter for Count.
     * number of resources in a set
     * @param count Value for Integer
     */
    @JsonSetter("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Getter for TotalCount.
     * Indicates the total number of records. Provided when the request specifies an "include" query
     * parameter
     * @return Returns the Integer
     */
    @JsonGetter("total_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Setter for TotalCount.
     * Indicates the total number of records. Provided when the request specifies an "include" query
     * parameter
     * @param totalCount Value for Integer
     */
    @JsonSetter("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * Getter for Data.
     * list of template versions
     * @return Returns the List of TemplateVersion
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TemplateVersion> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * list of template versions
     * @param data Value for List of TemplateVersion
     */
    @JsonSetter("data")
    public void setData(List<TemplateVersion> data) {
        this.data = data;
    }

    /**
     * Converts this AllTemplateVersions into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AllTemplateVersions [" + "object=" + object + ", nextUrl=" + nextUrl
                + ", previousUrl=" + previousUrl + ", count=" + count + ", totalCount=" + totalCount
                + ", data=" + data + "]";
    }

    /**
     * Builds a new {@link AllTemplateVersions.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AllTemplateVersions.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .object(getObject())
                .count(getCount())
                .totalCount(getTotalCount())
                .data(getData());
        builder.nextUrl = internalGetNextUrl();
        builder.previousUrl = internalGetPreviousUrl();
        return builder;
    }

    /**
     * Class to build instances of {@link AllTemplateVersions}.
     */
    public static class Builder {
        private String object;
        private OptionalNullable<String> nextUrl;
        private OptionalNullable<String> previousUrl;
        private Integer count;
        private Integer totalCount;
        private List<TemplateVersion> data;



        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * Setter for nextUrl.
         * @param  nextUrl  String value for nextUrl.
         * @return Builder
         */
        public Builder nextUrl(String nextUrl) {
            this.nextUrl = OptionalNullable.of(nextUrl);
            return this;
        }

        /**
         * UnSetter for nextUrl.
         * @return Builder
         */
        public Builder unsetNextUrl() {
            nextUrl = null;
            return this;
        }

        /**
         * Setter for previousUrl.
         * @param  previousUrl  String value for previousUrl.
         * @return Builder
         */
        public Builder previousUrl(String previousUrl) {
            this.previousUrl = OptionalNullable.of(previousUrl);
            return this;
        }

        /**
         * UnSetter for previousUrl.
         * @return Builder
         */
        public Builder unsetPreviousUrl() {
            previousUrl = null;
            return this;
        }

        /**
         * Setter for count.
         * @param  count  Integer value for count.
         * @return Builder
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Setter for totalCount.
         * @param  totalCount  Integer value for totalCount.
         * @return Builder
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Setter for data.
         * @param  data  List of TemplateVersion value for data.
         * @return Builder
         */
        public Builder data(List<TemplateVersion> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link AllTemplateVersions} object using the set fields.
         * @return {@link AllTemplateVersions}
         */
        public AllTemplateVersions build() {
            return new AllTemplateVersions(object, nextUrl, previousUrl, count, totalCount, data);
        }
    }
}
