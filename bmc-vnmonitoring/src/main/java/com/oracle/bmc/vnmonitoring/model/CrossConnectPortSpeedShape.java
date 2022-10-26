/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * An individual port speed level for cross-connects. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CrossConnectPortSpeedShape.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CrossConnectPortSpeedShape
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "portSpeedInGbps"})
    public CrossConnectPortSpeedShape(String name, Integer portSpeedInGbps) {
        super();
        this.name = name;
        this.portSpeedInGbps = portSpeedInGbps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the port speed shape.
         *
         * <p>Example: {@code 10 Gbps}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the port speed shape.
         *
         * <p>Example: {@code 10 Gbps}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The port speed in Gbps.
         *
         * <p>Example: {@code 10}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("portSpeedInGbps")
        private Integer portSpeedInGbps;

        /**
         * The port speed in Gbps.
         *
         * <p>Example: {@code 10}
         *
         * @param portSpeedInGbps the value to set
         * @return this builder
         */
        public Builder portSpeedInGbps(Integer portSpeedInGbps) {
            this.portSpeedInGbps = portSpeedInGbps;
            this.__explicitlySet__.add("portSpeedInGbps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectPortSpeedShape build() {
            CrossConnectPortSpeedShape model =
                    new CrossConnectPortSpeedShape(this.name, this.portSpeedInGbps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectPortSpeedShape model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("portSpeedInGbps")) {
                this.portSpeedInGbps(model.getPortSpeedInGbps());
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

    /**
     * The name of the port speed shape.
     *
     * <p>Example: {@code 10 Gbps}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the port speed shape.
     *
     * <p>Example: {@code 10 Gbps}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The port speed in Gbps.
     *
     * <p>Example: {@code 10}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portSpeedInGbps")
    private final Integer portSpeedInGbps;

    /**
     * The port speed in Gbps.
     *
     * <p>Example: {@code 10}
     *
     * @return the value
     */
    public Integer getPortSpeedInGbps() {
        return portSpeedInGbps;
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
        sb.append("CrossConnectPortSpeedShape(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", portSpeedInGbps=").append(String.valueOf(this.portSpeedInGbps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrossConnectPortSpeedShape)) {
            return false;
        }

        CrossConnectPortSpeedShape other = (CrossConnectPortSpeedShape) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.portSpeedInGbps, other.portSpeedInGbps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.portSpeedInGbps == null ? 43 : this.portSpeedInGbps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
