/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RemoveModuleStreamProfileFromManagedInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RemoveModuleStreamProfileFromManagedInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class RemoveModuleStreamProfileFromManagedInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** OCID for the managed instance */
    private String managedInstanceId;

    /** OCID for the managed instance */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** The name of a module. */
    private String moduleName;

    /** The name of a module. */
    public String getModuleName() {
        return moduleName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
     * The name of the stream of the containing module. This parameter is required if a profileName
     * is specified.
     */
    private String streamName;

    /**
     * The name of the stream of the containing module. This parameter is required if a profileName
     * is specified.
     */
    public String getStreamName() {
        return streamName;
    }
    /** The name of the profile of the containing module stream */
    private String profileName;

    /** The name of the profile of the containing module stream */
    public String getProfileName() {
        return profileName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveModuleStreamProfileFromManagedInstanceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** OCID for the managed instance */
        private String managedInstanceId = null;

        /**
         * OCID for the managed instance
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /** The name of a module. */
        private String moduleName = null;

        /**
         * The name of a module.
         *
         * @param moduleName the value to set
         * @return this builder instance
         */
        public Builder moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
         * The name of the stream of the containing module. This parameter is required if a
         * profileName is specified.
         */
        private String streamName = null;

        /**
         * The name of the stream of the containing module. This parameter is required if a
         * profileName is specified.
         *
         * @param streamName the value to set
         * @return this builder instance
         */
        public Builder streamName(String streamName) {
            this.streamName = streamName;
            return this;
        }

        /** The name of the profile of the containing module stream */
        private String profileName = null;

        /**
         * The name of the profile of the containing module stream
         *
         * @param profileName the value to set
         * @return this builder instance
         */
        public Builder profileName(String profileName) {
            this.profileName = profileName;
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
        public Builder copy(RemoveModuleStreamProfileFromManagedInstanceRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            moduleName(o.getModuleName());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            streamName(o.getStreamName());
            profileName(o.getProfileName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveModuleStreamProfileFromManagedInstanceRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RemoveModuleStreamProfileFromManagedInstanceRequest
         */
        public RemoveModuleStreamProfileFromManagedInstanceRequest build() {
            RemoveModuleStreamProfileFromManagedInstanceRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of RemoveModuleStreamProfileFromManagedInstanceRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveModuleStreamProfileFromManagedInstanceRequest
         */
        public RemoveModuleStreamProfileFromManagedInstanceRequest
                buildWithoutInvocationCallback() {
            RemoveModuleStreamProfileFromManagedInstanceRequest request =
                    new RemoveModuleStreamProfileFromManagedInstanceRequest();
            request.managedInstanceId = managedInstanceId;
            request.moduleName = moduleName;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.streamName = streamName;
            request.profileName = profileName;
            return request;
            // new RemoveModuleStreamProfileFromManagedInstanceRequest(managedInstanceId,
            // moduleName, opcRequestId, opcRetryToken, ifMatch, streamName, profileName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .moduleName(moduleName)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch)
                .streamName(streamName)
                .profileName(profileName);
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",moduleName=").append(String.valueOf(this.moduleName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",streamName=").append(String.valueOf(this.streamName));
        sb.append(",profileName=").append(String.valueOf(this.profileName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveModuleStreamProfileFromManagedInstanceRequest)) {
            return false;
        }

        RemoveModuleStreamProfileFromManagedInstanceRequest other =
                (RemoveModuleStreamProfileFromManagedInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.moduleName, other.moduleName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.streamName, other.streamName)
                && java.util.Objects.equals(this.profileName, other.profileName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.moduleName == null ? 43 : this.moduleName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.streamName == null ? 43 : this.streamName.hashCode());
        result = (result * PRIME) + (this.profileName == null ? 43 : this.profileName.hashCode());
        return result;
    }
}
