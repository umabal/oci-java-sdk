/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ListKeysExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListKeysRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class ListKeysRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment. */
    private String compartmentId;

    /** The OCID of the compartment. */
    public String getCompartmentId() {
        return compartmentId;
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
     * The field to sort by. You can specify only one sort order. The default order for {@code
     * TIMECREATED} is descending. The default order for {@code DISPLAYNAME} is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order. The default order for {@code
     * TIMECREATED} is descending. The default order for {@code DISPLAYNAME} is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by. You can specify only one sort order. The default order for {@code
     * TIMECREATED} is descending. The default order for {@code DISPLAYNAME} is ascending.
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
    /**
     * A key's protection mode indicates how the key persists and where cryptographic operations
     * that use the key are performed. A protection mode of {@code HSM} means that the key persists
     * on a hardware security module (HSM) and all cryptographic operations are performed inside the
     * HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server,
     * protected by the vault's RSA wrapping key which persists on the HSM. All cryptographic
     * operations that use a key with a protection mode of {@code SOFTWARE} are performed on the
     * server.
     */
    private ProtectionMode protectionMode;

    /**
     * A key's protection mode indicates how the key persists and where cryptographic operations
     * that use the key are performed. A protection mode of {@code HSM} means that the key persists
     * on a hardware security module (HSM) and all cryptographic operations are performed inside the
     * HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server,
     * protected by the vault's RSA wrapping key which persists on the HSM. All cryptographic
     * operations that use a key with a protection mode of {@code SOFTWARE} are performed on the
     * server.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
        Hsm("HSM"),
        Software("SOFTWARE"),
        ;

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProtectionMode: " + key);
        }
    };

    /**
     * A key's protection mode indicates how the key persists and where cryptographic operations
     * that use the key are performed. A protection mode of {@code HSM} means that the key persists
     * on a hardware security module (HSM) and all cryptographic operations are performed inside the
     * HSM. A protection mode of {@code SOFTWARE} means that the key persists on the server,
     * protected by the vault's RSA wrapping key which persists on the HSM. All cryptographic
     * operations that use a key with a protection mode of {@code SOFTWARE} are performed on the
     * server.
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }
    /**
     * The algorithm used by a key's key versions to encrypt or decrypt data. Currently, support
     * includes AES, RSA, and ECDSA algorithms.
     */
    private Algorithm algorithm;

    /**
     * The algorithm used by a key's key versions to encrypt or decrypt data. Currently, support
     * includes AES, RSA, and ECDSA algorithms.
     */
    public enum Algorithm implements com.oracle.bmc.http.internal.BmcEnum {
        Aes("AES"),
        Rsa("RSA"),
        Ecdsa("ECDSA"),
        ;

        private final String value;
        private static java.util.Map<String, Algorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (Algorithm v : Algorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        Algorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Algorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Algorithm: " + key);
        }
    };

    /**
     * The algorithm used by a key's key versions to encrypt or decrypt data. Currently, support
     * includes AES, RSA, and ECDSA algorithms.
     */
    public Algorithm getAlgorithm() {
        return algorithm;
    }
    /**
     * The length of the key in bytes, expressed as an integer. Supported values include 16, 24, or
     * 32.
     */
    private Integer length;

    /**
     * The length of the key in bytes, expressed as an integer. Supported values include 16, 24, or
     * 32.
     */
    public Integer getLength() {
        return length;
    }
    /** The curve ID of the keys. (This pertains only to ECDSA keys.) */
    private CurveId curveId;

    /** The curve ID of the keys. (This pertains only to ECDSA keys.) */
    public enum CurveId implements com.oracle.bmc.http.internal.BmcEnum {
        NistP256("NIST_P256"),
        NistP384("NIST_P384"),
        NistP521("NIST_P521"),
        ;

        private final String value;
        private static java.util.Map<String, CurveId> map;

        static {
            map = new java.util.HashMap<>();
            for (CurveId v : CurveId.values()) {
                map.put(v.getValue(), v);
            }
        }

        CurveId(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CurveId create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CurveId: " + key);
        }
    };

    /** The curve ID of the keys. (This pertains only to ECDSA keys.) */
    public CurveId getCurveId() {
        return curveId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListKeysRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
         * The field to sort by. You can specify only one sort order. The default order for {@code
         * TIMECREATED} is descending. The default order for {@code DISPLAYNAME} is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order. The default order for {@code
         * TIMECREATED} is descending. The default order for {@code DISPLAYNAME} is ascending.
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
         * A key's protection mode indicates how the key persists and where cryptographic operations
         * that use the key are performed. A protection mode of {@code HSM} means that the key
         * persists on a hardware security module (HSM) and all cryptographic operations are
         * performed inside the HSM. A protection mode of {@code SOFTWARE} means that the key
         * persists on the server, protected by the vault's RSA wrapping key which persists on the
         * HSM. All cryptographic operations that use a key with a protection mode of {@code
         * SOFTWARE} are performed on the server.
         */
        private ProtectionMode protectionMode = null;

        /**
         * A key's protection mode indicates how the key persists and where cryptographic operations
         * that use the key are performed. A protection mode of {@code HSM} means that the key
         * persists on a hardware security module (HSM) and all cryptographic operations are
         * performed inside the HSM. A protection mode of {@code SOFTWARE} means that the key
         * persists on the server, protected by the vault's RSA wrapping key which persists on the
         * HSM. All cryptographic operations that use a key with a protection mode of {@code
         * SOFTWARE} are performed on the server.
         *
         * @param protectionMode the value to set
         * @return this builder instance
         */
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            return this;
        }

        /**
         * The algorithm used by a key's key versions to encrypt or decrypt data. Currently, support
         * includes AES, RSA, and ECDSA algorithms.
         */
        private Algorithm algorithm = null;

        /**
         * The algorithm used by a key's key versions to encrypt or decrypt data. Currently, support
         * includes AES, RSA, and ECDSA algorithms.
         *
         * @param algorithm the value to set
         * @return this builder instance
         */
        public Builder algorithm(Algorithm algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * The length of the key in bytes, expressed as an integer. Supported values include 16, 24,
         * or 32.
         */
        private Integer length = null;

        /**
         * The length of the key in bytes, expressed as an integer. Supported values include 16, 24,
         * or 32.
         *
         * @param length the value to set
         * @return this builder instance
         */
        public Builder length(Integer length) {
            this.length = length;
            return this;
        }

        /** The curve ID of the keys. (This pertains only to ECDSA keys.) */
        private CurveId curveId = null;

        /**
         * The curve ID of the keys. (This pertains only to ECDSA keys.)
         *
         * @param curveId the value to set
         * @return this builder instance
         */
        public Builder curveId(CurveId curveId) {
            this.curveId = curveId;
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
        public Builder copy(ListKeysRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            protectionMode(o.getProtectionMode());
            algorithm(o.getAlgorithm());
            length(o.getLength());
            curveId(o.getCurveId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListKeysRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListKeysRequest
         */
        public ListKeysRequest build() {
            ListKeysRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListKeysRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListKeysRequest
         */
        public ListKeysRequest buildWithoutInvocationCallback() {
            ListKeysRequest request = new ListKeysRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.protectionMode = protectionMode;
            request.algorithm = algorithm;
            request.length = length;
            request.curveId = curveId;
            return request;
            // new ListKeysRequest(compartmentId, limit, page, opcRequestId, sortBy, sortOrder,
            // protectionMode, algorithm, length, curveId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .protectionMode(protectionMode)
                .algorithm(algorithm)
                .length(length)
                .curveId(curveId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(",algorithm=").append(String.valueOf(this.algorithm));
        sb.append(",length=").append(String.valueOf(this.length));
        sb.append(",curveId=").append(String.valueOf(this.curveId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListKeysRequest)) {
            return false;
        }

        ListKeysRequest other = (ListKeysRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.curveId, other.curveId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.curveId == null ? 43 : this.curveId.hashCode());
        return result;
    }
}
