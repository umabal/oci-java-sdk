/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.requests;

import com.oracle.bmc.dataflow.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataflow/CreateStatementExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateStatementRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class CreateStatementRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataflow.model.CreateStatementDetails> {

    /** Details for creating a statement. */
    private com.oracle.bmc.dataflow.model.CreateStatementDetails createStatementDetails;

    /** Details for creating a statement. */
    public com.oracle.bmc.dataflow.model.CreateStatementDetails getCreateStatementDetails() {
        return createStatementDetails;
    }
    /** The unique ID for the run */
    private String runId;

    /** The unique ID for the run */
    public String getRunId() {
        return runId;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this
     * value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataflow.model.CreateStatementDetails getBody$() {
        return createStatementDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateStatementRequest, com.oracle.bmc.dataflow.model.CreateStatementDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for creating a statement. */
        private com.oracle.bmc.dataflow.model.CreateStatementDetails createStatementDetails = null;

        /**
         * Details for creating a statement.
         *
         * @param createStatementDetails the value to set
         * @return this builder instance
         */
        public Builder createStatementDetails(
                com.oracle.bmc.dataflow.model.CreateStatementDetails createStatementDetails) {
            this.createStatementDetails = createStatementDetails;
            return this;
        }

        /** The unique ID for the run */
        private String runId = null;

        /**
         * The unique ID for the run
         *
         * @param runId the value to set
         * @return this builder instance
         */
        public Builder runId(String runId) {
            this.runId = runId;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this
         * value. Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(CreateStatementRequest o) {
            createStatementDetails(o.getCreateStatementDetails());
            runId(o.getRunId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateStatementRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateStatementRequest
         */
        public CreateStatementRequest build() {
            CreateStatementRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataflow.model.CreateStatementDetails body) {
            createStatementDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateStatementRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateStatementRequest
         */
        public CreateStatementRequest buildWithoutInvocationCallback() {
            CreateStatementRequest request = new CreateStatementRequest();
            request.createStatementDetails = createStatementDetails;
            request.runId = runId;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateStatementRequest(createStatementDetails, runId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createStatementDetails(createStatementDetails)
                .runId(runId)
                .opcRequestId(opcRequestId);
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
        sb.append(",createStatementDetails=").append(String.valueOf(this.createStatementDetails));
        sb.append(",runId=").append(String.valueOf(this.runId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateStatementRequest)) {
            return false;
        }

        CreateStatementRequest other = (CreateStatementRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createStatementDetails, other.createStatementDetails)
                && java.util.Objects.equals(this.runId, other.runId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createStatementDetails == null
                                ? 43
                                : this.createStatementDetails.hashCode());
        result = (result * PRIME) + (this.runId == null ? 43 : this.runId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
