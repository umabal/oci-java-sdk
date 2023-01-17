/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssociationAuthorizationRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AssociationAuthorizationRequest
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"requests"})
    public AssociationAuthorizationRequest(java.util.List<AuthorizationRequest> requests) {
        super();
        this.requests = requests;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of authorization requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("requests")
        private java.util.List<AuthorizationRequest> requests;

        /**
         * The list of authorization requests.
         *
         * @param requests the value to set
         * @return this builder
         */
        public Builder requests(java.util.List<AuthorizationRequest> requests) {
            this.requests = requests;
            this.__explicitlySet__.add("requests");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociationAuthorizationRequest build() {
            AssociationAuthorizationRequest model =
                    new AssociationAuthorizationRequest(this.requests);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociationAuthorizationRequest model) {
            if (model.wasPropertyExplicitlySet("requests")) {
                this.requests(model.getRequests());
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

    /** The list of authorization requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("requests")
    private final java.util.List<AuthorizationRequest> requests;

    /**
     * The list of authorization requests.
     *
     * @return the value
     */
    public java.util.List<AuthorizationRequest> getRequests() {
        return requests;
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
        sb.append("AssociationAuthorizationRequest(");
        sb.append("super=").append(super.toString());
        sb.append("requests=").append(String.valueOf(this.requests));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociationAuthorizationRequest)) {
            return false;
        }

        AssociationAuthorizationRequest other = (AssociationAuthorizationRequest) o;
        return java.util.Objects.equals(this.requests, other.requests) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.requests == null ? 43 : this.requests.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
