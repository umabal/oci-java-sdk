/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Validate connection from the connection metadata or oracle wallet file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidateConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ValidateConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"connectionDetail", "connectionPayload"})
    public ValidateConnectionDetails(
            CreateConnectionDetails connectionDetail, byte[] connectionPayload) {
        super();
        this.connectionDetail = connectionDetail;
        this.connectionPayload = connectionPayload;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetail")
        private CreateConnectionDetails connectionDetail;

        public Builder connectionDetail(CreateConnectionDetails connectionDetail) {
            this.connectionDetail = connectionDetail;
            this.__explicitlySet__.add("connectionDetail");
            return this;
        }
        /** The information used to validate the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionPayload")
        private byte[] connectionPayload;

        /**
         * The information used to validate the connection.
         *
         * @param connectionPayload the value to set
         * @return this builder
         */
        public Builder connectionPayload(byte[] connectionPayload) {
            this.connectionPayload = connectionPayload;
            this.__explicitlySet__.add("connectionPayload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateConnectionDetails build() {
            ValidateConnectionDetails model =
                    new ValidateConnectionDetails(this.connectionDetail, this.connectionPayload);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("connectionDetail")) {
                this.connectionDetail(model.getConnectionDetail());
            }
            if (model.wasPropertyExplicitlySet("connectionPayload")) {
                this.connectionPayload(model.getConnectionPayload());
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

    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetail")
    private final CreateConnectionDetails connectionDetail;

    public CreateConnectionDetails getConnectionDetail() {
        return connectionDetail;
    }

    /** The information used to validate the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionPayload")
    private final byte[] connectionPayload;

    /**
     * The information used to validate the connection.
     *
     * @return the value
     */
    public byte[] getConnectionPayload() {
        return connectionPayload;
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
        sb.append("ValidateConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("connectionDetail=").append(String.valueOf(this.connectionDetail));
        sb.append(", connectionPayload=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.connectionPayload)
                                : (String.valueOf(this.connectionPayload)
                                        + (this.connectionPayload != null
                                                ? " (byte[" + this.connectionPayload.length + "])"
                                                : ""))));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateConnectionDetails)) {
            return false;
        }

        ValidateConnectionDetails other = (ValidateConnectionDetails) o;
        return java.util.Objects.equals(this.connectionDetail, other.connectionDetail)
                && java.util.Arrays.equals(this.connectionPayload, other.connectionPayload)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionDetail == null ? 43 : this.connectionDetail.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.connectionPayload);
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
