/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the attribute based on which the query results are grouped. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = QueryResultsGroupedBySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class QueryResultsGroupedBySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"queryResultsGroupedByColumn"})
    public QueryResultsGroupedBySummary(String queryResultsGroupedByColumn) {
        super();
        this.queryResultsGroupedByColumn = queryResultsGroupedByColumn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Column or attribute in the query result, which is a group by value. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsGroupedByColumn")
        private String queryResultsGroupedByColumn;

        /**
         * Column or attribute in the query result, which is a group by value.
         *
         * @param queryResultsGroupedByColumn the value to set
         * @return this builder
         */
        public Builder queryResultsGroupedByColumn(String queryResultsGroupedByColumn) {
            this.queryResultsGroupedByColumn = queryResultsGroupedByColumn;
            this.__explicitlySet__.add("queryResultsGroupedByColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultsGroupedBySummary build() {
            QueryResultsGroupedBySummary model =
                    new QueryResultsGroupedBySummary(this.queryResultsGroupedByColumn);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultsGroupedBySummary model) {
            if (model.wasPropertyExplicitlySet("queryResultsGroupedByColumn")) {
                this.queryResultsGroupedByColumn(model.getQueryResultsGroupedByColumn());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Column or attribute in the query result, which is a group by value. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsGroupedByColumn")
    private final String queryResultsGroupedByColumn;

    /**
     * Column or attribute in the query result, which is a group by value.
     *
     * @return the value
     */
    public String getQueryResultsGroupedByColumn() {
        return queryResultsGroupedByColumn;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryResultsGroupedBySummary(");
        sb.append("super=").append(super.toString());
        sb.append("queryResultsGroupedByColumn=")
                .append(String.valueOf(this.queryResultsGroupedByColumn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryResultsGroupedBySummary)) {
            return false;
        }

        QueryResultsGroupedBySummary other = (QueryResultsGroupedBySummary) o;
        return java.util.Objects.equals(
                        this.queryResultsGroupedByColumn, other.queryResultsGroupedByColumn)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.queryResultsGroupedByColumn == null
                                ? 43
                                : this.queryResultsGroupedByColumn.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
