/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The level and validation message. <br>
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
        builder = ValidationMessage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ValidationMessage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"level", "validationMessage"})
    public ValidationMessage(String level, String validationMessage) {
        super();
        this.level = level;
        this.validationMessage = validationMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The level of validation messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private String level;

        /**
         * The level of validation messages.
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(String level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /** The message itself. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationMessage")
        private String validationMessage;

        /**
         * The message itself.
         *
         * @param validationMessage the value to set
         * @return this builder
         */
        public Builder validationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            this.__explicitlySet__.add("validationMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidationMessage build() {
            ValidationMessage model = new ValidationMessage(this.level, this.validationMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidationMessage model) {
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("validationMessage")) {
                this.validationMessage(model.getValidationMessage());
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

    /** The level of validation messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final String level;

    /**
     * The level of validation messages.
     *
     * @return the value
     */
    public String getLevel() {
        return level;
    }

    /** The message itself. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationMessage")
    private final String validationMessage;

    /**
     * The message itself.
     *
     * @return the value
     */
    public String getValidationMessage() {
        return validationMessage;
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
        sb.append("ValidationMessage(");
        sb.append("super=").append(super.toString());
        sb.append("level=").append(String.valueOf(this.level));
        sb.append(", validationMessage=").append(String.valueOf(this.validationMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidationMessage)) {
            return false;
        }

        ValidationMessage other = (ValidationMessage) o;
        return java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.validationMessage, other.validationMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result =
                (result * PRIME)
                        + (this.validationMessage == null ? 43 : this.validationMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
