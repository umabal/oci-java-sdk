/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class CreateDatabaseRegistrationResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A unique Oracle-assigned identifier for an asynchronous request. You can use this to query
     * status of the asynchronous operation.
     */
    private String opcWorkRequestId;

    /**
     * A unique Oracle-assigned identifier for an asynchronous request. You can use this to query
     * status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** Deprecation date of this API version. */
    private String sunset;

    /**
     * Deprecation date of this API version.
     *
     * @return the value
     */
    public String getSunset() {
        return sunset;
    }

    /** The returned DatabaseRegistration instance. */
    private com.oracle.bmc.goldengate.model.DatabaseRegistration databaseRegistration;

    /**
     * The returned DatabaseRegistration instance.
     *
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.DatabaseRegistration getDatabaseRegistration() {
        return databaseRegistration;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcWorkRequestId",
        "opcRequestId",
        "etag",
        "sunset",
        "databaseRegistration"
    })
    private CreateDatabaseRegistrationResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcWorkRequestId,
            String opcRequestId,
            String etag,
            String sunset,
            com.oracle.bmc.goldengate.model.DatabaseRegistration databaseRegistration) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.sunset = sunset;
        this.databaseRegistration = databaseRegistration;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateDatabaseRegistrationResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for an asynchronous request. You can use this to
         * query status of the asynchronous operation.
         */
        private String opcWorkRequestId;

        /**
         * A unique Oracle-assigned identifier for an asynchronous request. You can use this to
         * query status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please include the request ID.
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** Deprecation date of this API version. */
        private String sunset;

        /**
         * Deprecation date of this API version.
         *
         * @param sunset the value to set
         * @return this builder
         */
        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        /** The returned DatabaseRegistration instance. */
        private com.oracle.bmc.goldengate.model.DatabaseRegistration databaseRegistration;

        /**
         * The returned DatabaseRegistration instance.
         *
         * @param databaseRegistration the value to set
         * @return this builder
         */
        public Builder databaseRegistration(
                com.oracle.bmc.goldengate.model.DatabaseRegistration databaseRegistration) {
            this.databaseRegistration = databaseRegistration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateDatabaseRegistrationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            sunset(o.getSunset());
            databaseRegistration(o.getDatabaseRegistration());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateDatabaseRegistrationResponse build() {
            return new CreateDatabaseRegistrationResponse(
                    __httpStatusCode__,
                    headers,
                    opcWorkRequestId,
                    opcRequestId,
                    etag,
                    sunset,
                    databaseRegistration);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",sunset=").append(String.valueOf(sunset));
        sb.append(",databaseRegistration=").append(String.valueOf(databaseRegistration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseRegistrationResponse)) {
            return false;
        }

        CreateDatabaseRegistrationResponse other = (CreateDatabaseRegistrationResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.sunset, other.sunset)
                && java.util.Objects.equals(this.databaseRegistration, other.databaseRegistration);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseRegistration == null
                                ? 43
                                : this.databaseRegistration.hashCode());
        return result;
    }
}
