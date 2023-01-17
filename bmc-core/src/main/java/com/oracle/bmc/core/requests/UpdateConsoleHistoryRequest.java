/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateConsoleHistoryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateConsoleHistoryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateConsoleHistoryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateConsoleHistoryDetails> {

    /** The OCID of the console history. */
    private String instanceConsoleHistoryId;

    /** The OCID of the console history. */
    public String getInstanceConsoleHistoryId() {
        return instanceConsoleHistoryId;
    }
    /** Update instance fields */
    private com.oracle.bmc.core.model.UpdateConsoleHistoryDetails updateConsoleHistoryDetails;

    /** Update instance fields */
    public com.oracle.bmc.core.model.UpdateConsoleHistoryDetails getUpdateConsoleHistoryDetails() {
        return updateConsoleHistoryDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateConsoleHistoryDetails getBody$() {
        return updateConsoleHistoryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateConsoleHistoryRequest,
                    com.oracle.bmc.core.model.UpdateConsoleHistoryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the console history. */
        private String instanceConsoleHistoryId = null;

        /**
         * The OCID of the console history.
         *
         * @param instanceConsoleHistoryId the value to set
         * @return this builder instance
         */
        public Builder instanceConsoleHistoryId(String instanceConsoleHistoryId) {
            this.instanceConsoleHistoryId = instanceConsoleHistoryId;
            return this;
        }

        /** Update instance fields */
        private com.oracle.bmc.core.model.UpdateConsoleHistoryDetails updateConsoleHistoryDetails =
                null;

        /**
         * Update instance fields
         *
         * @param updateConsoleHistoryDetails the value to set
         * @return this builder instance
         */
        public Builder updateConsoleHistoryDetails(
                com.oracle.bmc.core.model.UpdateConsoleHistoryDetails updateConsoleHistoryDetails) {
            this.updateConsoleHistoryDetails = updateConsoleHistoryDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(UpdateConsoleHistoryRequest o) {
            instanceConsoleHistoryId(o.getInstanceConsoleHistoryId());
            updateConsoleHistoryDetails(o.getUpdateConsoleHistoryDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateConsoleHistoryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateConsoleHistoryRequest
         */
        public UpdateConsoleHistoryRequest build() {
            UpdateConsoleHistoryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.core.model.UpdateConsoleHistoryDetails body) {
            updateConsoleHistoryDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateConsoleHistoryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateConsoleHistoryRequest
         */
        public UpdateConsoleHistoryRequest buildWithoutInvocationCallback() {
            UpdateConsoleHistoryRequest request = new UpdateConsoleHistoryRequest();
            request.instanceConsoleHistoryId = instanceConsoleHistoryId;
            request.updateConsoleHistoryDetails = updateConsoleHistoryDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateConsoleHistoryRequest(instanceConsoleHistoryId,
            // updateConsoleHistoryDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .instanceConsoleHistoryId(instanceConsoleHistoryId)
                .updateConsoleHistoryDetails(updateConsoleHistoryDetails)
                .ifMatch(ifMatch);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",instanceConsoleHistoryId=")
                .append(String.valueOf(this.instanceConsoleHistoryId));
        sb.append(",updateConsoleHistoryDetails=")
                .append(String.valueOf(this.updateConsoleHistoryDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConsoleHistoryRequest)) {
            return false;
        }

        UpdateConsoleHistoryRequest other = (UpdateConsoleHistoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.instanceConsoleHistoryId, other.instanceConsoleHistoryId)
                && java.util.Objects.equals(
                        this.updateConsoleHistoryDetails, other.updateConsoleHistoryDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instanceConsoleHistoryId == null
                                ? 43
                                : this.instanceConsoleHistoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateConsoleHistoryDetails == null
                                ? 43
                                : this.updateConsoleHistoryDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
