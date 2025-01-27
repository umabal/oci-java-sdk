/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The detach DataAsset payload. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDetachDataAssetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateDetachDataAssetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dataAssets"})
    public CreateDetachDataAssetDetails(java.util.List<DataAsset> dataAssets) {
        super();
        this.dataAssets = dataAssets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The array of DataAsset keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssets")
        private java.util.List<DataAsset> dataAssets;

        /**
         * The array of DataAsset keys.
         *
         * @param dataAssets the value to set
         * @return this builder
         */
        public Builder dataAssets(java.util.List<DataAsset> dataAssets) {
            this.dataAssets = dataAssets;
            this.__explicitlySet__.add("dataAssets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDetachDataAssetDetails build() {
            CreateDetachDataAssetDetails model = new CreateDetachDataAssetDetails(this.dataAssets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDetachDataAssetDetails model) {
            if (model.wasPropertyExplicitlySet("dataAssets")) {
                this.dataAssets(model.getDataAssets());
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

    /** The array of DataAsset keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssets")
    private final java.util.List<DataAsset> dataAssets;

    /**
     * The array of DataAsset keys.
     *
     * @return the value
     */
    public java.util.List<DataAsset> getDataAssets() {
        return dataAssets;
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
        sb.append("CreateDetachDataAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dataAssets=").append(String.valueOf(this.dataAssets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDetachDataAssetDetails)) {
            return false;
        }

        CreateDetachDataAssetDetails other = (CreateDetachDataAssetDetails) o;
        return java.util.Objects.equals(this.dataAssets, other.dataAssets) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataAssets == null ? 43 : this.dataAssets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
