/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBootVolumeBackupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetBootVolumeBackupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetBootVolumeBackupRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the boot volume backup. */
    private String bootVolumeBackupId;

    /** The OCID of the boot volume backup. */
    public String getBootVolumeBackupId() {
        return bootVolumeBackupId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetBootVolumeBackupRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the boot volume backup. */
        private String bootVolumeBackupId = null;

        /**
         * The OCID of the boot volume backup.
         *
         * @param bootVolumeBackupId the value to set
         * @return this builder instance
         */
        public Builder bootVolumeBackupId(String bootVolumeBackupId) {
            this.bootVolumeBackupId = bootVolumeBackupId;
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
        public Builder copy(GetBootVolumeBackupRequest o) {
            bootVolumeBackupId(o.getBootVolumeBackupId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetBootVolumeBackupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetBootVolumeBackupRequest
         */
        public GetBootVolumeBackupRequest build() {
            GetBootVolumeBackupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetBootVolumeBackupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetBootVolumeBackupRequest
         */
        public GetBootVolumeBackupRequest buildWithoutInvocationCallback() {
            GetBootVolumeBackupRequest request = new GetBootVolumeBackupRequest();
            request.bootVolumeBackupId = bootVolumeBackupId;
            return request;
            // new GetBootVolumeBackupRequest(bootVolumeBackupId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().bootVolumeBackupId(bootVolumeBackupId);
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
        sb.append(",bootVolumeBackupId=").append(String.valueOf(this.bootVolumeBackupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBootVolumeBackupRequest)) {
            return false;
        }

        GetBootVolumeBackupRequest other = (GetBootVolumeBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bootVolumeBackupId, other.bootVolumeBackupId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bootVolumeBackupId == null
                                ? 43
                                : this.bootVolumeBackupId.hashCode());
        return result;
    }
}
