/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.requests;

import com.oracle.bmc.certificatesmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificatesmanagement/ListCertificateVersionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListCertificateVersionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class ListCertificateVersionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the certificate. */
    private String certificateId;

    /** The OCID of the certificate. */
    public String getCertificateId() {
        return certificateId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If provided, the returned request ID will
     * include this value. Otherwise, a random request ID will be generated by the service.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter that returns only resources that match the specified version number. The default
     * value is 0, which means that this filter is not applied.
     */
    private Long versionNumber;

    /**
     * A filter that returns only resources that match the specified version number. The default
     * value is 0, which means that this filter is not applied.
     */
    public Long getVersionNumber() {
        return versionNumber;
    }
    /** The maximum number of items to return in a paginated "List" call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated "List" call. */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. You can specify only one sort order. The default order for
     * 'VERSION_NUMBER' is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order. The default order for
     * 'VERSION_NUMBER' is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        VersionNumber("VERSION_NUMBER"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. You can specify only one sort order. The default order for
     * 'VERSION_NUMBER' is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCertificateVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the certificate. */
        private String certificateId = null;

        /**
         * The OCID of the certificate.
         *
         * @param certificateId the value to set
         * @return this builder instance
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A filter that returns only resources that match the specified version number. The default
         * value is 0, which means that this filter is not applied.
         */
        private Long versionNumber = null;

        /**
         * A filter that returns only resources that match the specified version number. The default
         * value is 0, which means that this filter is not applied.
         *
         * @param versionNumber the value to set
         * @return this builder instance
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        /** The maximum number of items to return in a paginated "List" call. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by. You can specify only one sort order. The default order for
         * 'VERSION_NUMBER' is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order. The default order for
         * 'VERSION_NUMBER' is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListCertificateVersionsRequest o) {
            certificateId(o.getCertificateId());
            opcRequestId(o.getOpcRequestId());
            versionNumber(o.getVersionNumber());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCertificateVersionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCertificateVersionsRequest
         */
        public ListCertificateVersionsRequest build() {
            ListCertificateVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCertificateVersionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCertificateVersionsRequest
         */
        public ListCertificateVersionsRequest buildWithoutInvocationCallback() {
            ListCertificateVersionsRequest request = new ListCertificateVersionsRequest();
            request.certificateId = certificateId;
            request.opcRequestId = opcRequestId;
            request.versionNumber = versionNumber;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListCertificateVersionsRequest(certificateId, opcRequestId, versionNumber, limit,
            // page, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateId(certificateId)
                .opcRequestId(opcRequestId)
                .versionNumber(versionNumber)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",certificateId=").append(String.valueOf(this.certificateId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCertificateVersionsRequest)) {
            return false;
        }

        ListCertificateVersionsRequest other = (ListCertificateVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
