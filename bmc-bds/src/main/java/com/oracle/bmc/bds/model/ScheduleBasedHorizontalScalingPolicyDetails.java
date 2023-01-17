/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details of a schedule based horizontal autoscaling policy.
 *
 * <p>In a schedule-based autoscaling policy, an autoscaling action is triggered at the scheduled
 * execution time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduleBasedHorizontalScalingPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "policyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ScheduleBasedHorizontalScalingPolicyDetails extends AutoScalePolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("triggerType")
        private TriggerType triggerType;

        public Builder triggerType(TriggerType triggerType) {
            this.triggerType = triggerType;
            this.__explicitlySet__.add("triggerType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /** The time zone of the execution schedule, in IANA time zone database name format */
        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        /**
         * The time zone of the execution schedule, in IANA time zone database name format
         *
         * @param timezone the value to set
         * @return this builder
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
        private java.util.List<HorizontalScalingScheduleDetails> scheduleDetails;

        public Builder scheduleDetails(
                java.util.List<HorizontalScalingScheduleDetails> scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            this.__explicitlySet__.add("scheduleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleBasedHorizontalScalingPolicyDetails build() {
            ScheduleBasedHorizontalScalingPolicyDetails model =
                    new ScheduleBasedHorizontalScalingPolicyDetails(
                            this.triggerType, this.actionType, this.timezone, this.scheduleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleBasedHorizontalScalingPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("triggerType")) {
                this.triggerType(model.getTriggerType());
            }
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("timezone")) {
                this.timezone(model.getTimezone());
            }
            if (model.wasPropertyExplicitlySet("scheduleDetails")) {
                this.scheduleDetails(model.getScheduleDetails());
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

    @Deprecated
    public ScheduleBasedHorizontalScalingPolicyDetails(
            TriggerType triggerType,
            ActionType actionType,
            String timezone,
            java.util.List<HorizontalScalingScheduleDetails> scheduleDetails) {
        super(triggerType, actionType);
        this.timezone = timezone;
        this.scheduleDetails = scheduleDetails;
    }

    /** The time zone of the execution schedule, in IANA time zone database name format */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    private final String timezone;

    /**
     * The time zone of the execution schedule, in IANA time zone database name format
     *
     * @return the value
     */
    public String getTimezone() {
        return timezone;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
    private final java.util.List<HorizontalScalingScheduleDetails> scheduleDetails;

    public java.util.List<HorizontalScalingScheduleDetails> getScheduleDetails() {
        return scheduleDetails;
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
        sb.append("ScheduleBasedHorizontalScalingPolicyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timezone=").append(String.valueOf(this.timezone));
        sb.append(", scheduleDetails=").append(String.valueOf(this.scheduleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleBasedHorizontalScalingPolicyDetails)) {
            return false;
        }

        ScheduleBasedHorizontalScalingPolicyDetails other =
                (ScheduleBasedHorizontalScalingPolicyDetails) o;
        return java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.scheduleDetails, other.scheduleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleDetails == null ? 43 : this.scheduleDetails.hashCode());
        return result;
    }
}
