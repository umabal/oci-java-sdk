/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateMaskingReportForDownloadExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GenerateMaskingReportForDownloadRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GenerateMaskingReportForDownloadRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails> {

    /** The OCID of the masking policy. */
    private String maskingPolicyId;

    /** The OCID of the masking policy. */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }
    /** Details to generate a downloadable masking report. */
    private com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails
            generateMaskingReportForDownloadDetails;

    /** Details to generate a downloadable masking report. */
    public com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails
            getGenerateMaskingReportForDownloadDetails() {
        return generateMaskingReportForDownloadDetails;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails getBody$() {
        return generateMaskingReportForDownloadDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateMaskingReportForDownloadRequest,
                    com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the masking policy. */
        private String maskingPolicyId = null;

        /**
         * The OCID of the masking policy.
         *
         * @param maskingPolicyId the value to set
         * @return this builder instance
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            return this;
        }

        /** Details to generate a downloadable masking report. */
        private com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails
                generateMaskingReportForDownloadDetails = null;

        /**
         * Details to generate a downloadable masking report.
         *
         * @param generateMaskingReportForDownloadDetails the value to set
         * @return this builder instance
         */
        public Builder generateMaskingReportForDownloadDetails(
                com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails
                        generateMaskingReportForDownloadDetails) {
            this.generateMaskingReportForDownloadDetails = generateMaskingReportForDownloadDetails;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(GenerateMaskingReportForDownloadRequest o) {
            maskingPolicyId(o.getMaskingPolicyId());
            generateMaskingReportForDownloadDetails(o.getGenerateMaskingReportForDownloadDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateMaskingReportForDownloadRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GenerateMaskingReportForDownloadRequest
         */
        public GenerateMaskingReportForDownloadRequest build() {
            GenerateMaskingReportForDownloadRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.datasafe.model.GenerateMaskingReportForDownloadDetails body) {
            generateMaskingReportForDownloadDetails(body);
            return this;
        }

        /**
         * Build the instance of GenerateMaskingReportForDownloadRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GenerateMaskingReportForDownloadRequest
         */
        public GenerateMaskingReportForDownloadRequest buildWithoutInvocationCallback() {
            GenerateMaskingReportForDownloadRequest request =
                    new GenerateMaskingReportForDownloadRequest();
            request.maskingPolicyId = maskingPolicyId;
            request.generateMaskingReportForDownloadDetails =
                    generateMaskingReportForDownloadDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new GenerateMaskingReportForDownloadRequest(maskingPolicyId,
            // generateMaskingReportForDownloadDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maskingPolicyId(maskingPolicyId)
                .generateMaskingReportForDownloadDetails(generateMaskingReportForDownloadDetails)
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
        sb.append(",maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(",generateMaskingReportForDownloadDetails=")
                .append(String.valueOf(this.generateMaskingReportForDownloadDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateMaskingReportForDownloadRequest)) {
            return false;
        }

        GenerateMaskingReportForDownloadRequest other = (GenerateMaskingReportForDownloadRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(
                        this.generateMaskingReportForDownloadDetails,
                        other.generateMaskingReportForDownloadDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.generateMaskingReportForDownloadDetails == null
                                ? 43
                                : this.generateMaskingReportForDownloadDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
