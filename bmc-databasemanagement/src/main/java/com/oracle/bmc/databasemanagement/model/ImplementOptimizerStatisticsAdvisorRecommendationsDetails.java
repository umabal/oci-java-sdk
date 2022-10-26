/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The request details object to implement the Optimizer Statistics Advisor task recommendations.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImplementOptimizerStatisticsAdvisorRecommendationsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ImplementOptimizerStatisticsAdvisorRecommendationsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"taskName", "jobDetails"})
    public ImplementOptimizerStatisticsAdvisorRecommendationsDetails(
            String taskName, ImplementOptimizerStatisticsAdvisorRecommendationsJob jobDetails) {
        super();
        this.taskName = taskName;
        this.jobDetails = jobDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        /**
         * The name of the task.
         *
         * @param taskName the value to set
         * @return this builder
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobDetails")
        private ImplementOptimizerStatisticsAdvisorRecommendationsJob jobDetails;

        public Builder jobDetails(
                ImplementOptimizerStatisticsAdvisorRecommendationsJob jobDetails) {
            this.jobDetails = jobDetails;
            this.__explicitlySet__.add("jobDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImplementOptimizerStatisticsAdvisorRecommendationsDetails build() {
            ImplementOptimizerStatisticsAdvisorRecommendationsDetails model =
                    new ImplementOptimizerStatisticsAdvisorRecommendationsDetails(
                            this.taskName, this.jobDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImplementOptimizerStatisticsAdvisorRecommendationsDetails model) {
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
            }
            if (model.wasPropertyExplicitlySet("jobDetails")) {
                this.jobDetails(model.getJobDetails());
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

    /** The name of the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    private final String taskName;

    /**
     * The name of the task.
     *
     * @return the value
     */
    public String getTaskName() {
        return taskName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobDetails")
    private final ImplementOptimizerStatisticsAdvisorRecommendationsJob jobDetails;

    public ImplementOptimizerStatisticsAdvisorRecommendationsJob getJobDetails() {
        return jobDetails;
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
        sb.append("ImplementOptimizerStatisticsAdvisorRecommendationsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("taskName=").append(String.valueOf(this.taskName));
        sb.append(", jobDetails=").append(String.valueOf(this.jobDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImplementOptimizerStatisticsAdvisorRecommendationsDetails)) {
            return false;
        }

        ImplementOptimizerStatisticsAdvisorRecommendationsDetails other =
                (ImplementOptimizerStatisticsAdvisorRecommendationsDetails) o;
        return java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.jobDetails, other.jobDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result = (result * PRIME) + (this.jobDetails == null ? 43 : this.jobDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
