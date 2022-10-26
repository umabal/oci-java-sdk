/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetDbSystemUpgradeHistoryEntryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDbSystemUpgradeHistoryEntryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetDbSystemUpgradeHistoryEntryRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String dbSystemId;

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /**
     * The database/db system upgrade History
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String upgradeHistoryEntryId;

    /**
     * The database/db system upgrade History
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getUpgradeHistoryEntryId() {
        return upgradeHistoryEntryId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDbSystemUpgradeHistoryEntryRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The DB system
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String dbSystemId = null;

        /**
         * The DB system
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * The database/db system upgrade History
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String upgradeHistoryEntryId = null;

        /**
         * The database/db system upgrade History
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param upgradeHistoryEntryId the value to set
         * @return this builder instance
         */
        public Builder upgradeHistoryEntryId(String upgradeHistoryEntryId) {
            this.upgradeHistoryEntryId = upgradeHistoryEntryId;
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
        public Builder copy(GetDbSystemUpgradeHistoryEntryRequest o) {
            dbSystemId(o.getDbSystemId());
            upgradeHistoryEntryId(o.getUpgradeHistoryEntryId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDbSystemUpgradeHistoryEntryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDbSystemUpgradeHistoryEntryRequest
         */
        public GetDbSystemUpgradeHistoryEntryRequest build() {
            GetDbSystemUpgradeHistoryEntryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDbSystemUpgradeHistoryEntryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDbSystemUpgradeHistoryEntryRequest
         */
        public GetDbSystemUpgradeHistoryEntryRequest buildWithoutInvocationCallback() {
            GetDbSystemUpgradeHistoryEntryRequest request =
                    new GetDbSystemUpgradeHistoryEntryRequest();
            request.dbSystemId = dbSystemId;
            request.upgradeHistoryEntryId = upgradeHistoryEntryId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDbSystemUpgradeHistoryEntryRequest(dbSystemId, upgradeHistoryEntryId,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .upgradeHistoryEntryId(upgradeHistoryEntryId)
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",upgradeHistoryEntryId=").append(String.valueOf(this.upgradeHistoryEntryId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDbSystemUpgradeHistoryEntryRequest)) {
            return false;
        }

        GetDbSystemUpgradeHistoryEntryRequest other = (GetDbSystemUpgradeHistoryEntryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.upgradeHistoryEntryId, other.upgradeHistoryEntryId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeHistoryEntryId == null
                                ? 43
                                : this.upgradeHistoryEntryId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
