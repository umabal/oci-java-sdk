/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.requests;

import com.oracle.bmc.artifacts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/ListContainerImageSignaturesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListContainerImageSignaturesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListContainerImageSignaturesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * When set to true, the hierarchy of compartments is traversed
     * and all compartments and subcompartments in the tenancy are
     * inspected depending on the the setting of `accessLevel`.
     * Default is false. Can only be set to true when calling the API
     * on the tenancy (root compartment).
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * A filter to return a container image summary only for the specified container image OCID.
     *
     */
    private String imageId;

    /**
     * A filter to return container images only for the specified container repository OCID.
     *
     */
    private String repositoryId;

    /**
     * A filter to return container images or container image signatures that match the repository name.
     * <p>
     * Example: `foo` or `foo*`
     *
     */
    private String repositoryName;

    /**
     * The digest of the container image.
     * <p>
     * Example: `sha256:e7d38b3517548a1c71e41bffe9c8ae6d6d29546ce46bf62159837aad072c90aa`
     *
     */
    private String imageDigest;

    /**
     * A filter to return only resources that match the given display name exactly.
     *
     */
    private String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
     * <p>
     * Example: `ocid1.keyversion.oc1..exampleuniqueID`
     *
     */
    private String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the kmsKeyVersionId used to sign the container image.
     * <p>
     * Example: `ocid1.keyversion.oc1..exampleuniqueID`
     *
     */
    private String kmsKeyVersionId;

    /**
     * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     */
    private SigningAlgorithm signingAlgorithm;

    /**
     * The algorithm to be used for signing. These are the only supported signing algorithms for container images.
     **/
    public enum SigningAlgorithm {
        Sha224RsaPkcsPss("SHA_224_RSA_PKCS_PSS"),
        Sha256RsaPkcsPss("SHA_256_RSA_PKCS_PSS"),
        Sha384RsaPkcsPss("SHA_384_RSA_PKCS_PSS"),
        Sha512RsaPkcsPss("SHA_512_RSA_PKCS_PSS"),
        ;

        private final String value;
        private static java.util.Map<String, SigningAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (SigningAlgorithm v : SigningAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        SigningAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SigningAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SigningAlgorithm: " + key);
        }
    };
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * \"List\" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: `50`
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the `opc-next-page` response header from the previous \"List\"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The field to sort by. You can provide one sort order (`sortOrder`). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some \"List\" operations (for example, `ListInstances`) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these \"List\" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order (`sortOrder`). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some \"List\" operations (for example, `ListInstances`) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these \"List\" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     **/
    public enum SortBy {
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
     * The sort order to use, either ascending (`ASC`) or descending (`DESC`). The DISPLAYNAME sort order
     * is case sensitive.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (`ASC`) or descending (`DESC`). The DISPLAYNAME sort order
     * is case sensitive.
     *
     **/
    public enum SortOrder {
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListContainerImageSignaturesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ListContainerImageSignaturesRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            imageId(o.getImageId());
            repositoryId(o.getRepositoryId());
            repositoryName(o.getRepositoryName());
            imageDigest(o.getImageDigest());
            displayName(o.getDisplayName());
            kmsKeyId(o.getKmsKeyId());
            kmsKeyVersionId(o.getKmsKeyVersionId());
            signingAlgorithm(o.getSigningAlgorithm());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListContainerImageSignaturesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListContainerImageSignaturesRequest
         */
        public ListContainerImageSignaturesRequest build() {
            ListContainerImageSignaturesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
