/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class MarketplaceClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Marketplace {
    /** Service instance for Marketplace. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MARKETPLACE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://marketplace.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MarketplaceAsyncClient.class);

    private final MarketplaceWaiters waiters;

    private final MarketplacePaginators paginators;

    private MarketplaceClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("Marketplace-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MarketplaceWaiters(executorService, this);

        this.paginators = new MarketplacePaginators(this);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MarketplaceClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MarketplaceClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MarketplaceClient(this, authenticationDetailsProvider, executorService);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public ChangePublicationCompartmentResponse changePublicationCompartment(
            ChangePublicationCompartmentRequest request) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");
        Objects.requireNonNull(
                request.getChangePublicationCompartmentDetails(),
                "changePublicationCompartmentDetails is required");

        return clientCall(request, ChangePublicationCompartmentResponse::builder)
                .logger(LOG, "changePublicationCompartment")
                .serviceDetails(
                        "Marketplace",
                        "ChangePublicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/ChangePublicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePublicationCompartmentRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePublicationCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateAcceptedAgreementResponse createAcceptedAgreement(
            CreateAcceptedAgreementRequest request) {
        Objects.requireNonNull(
                request.getCreateAcceptedAgreementDetails(),
                "createAcceptedAgreementDetails is required");

        return clientCall(request, CreateAcceptedAgreementResponse::builder)
                .logger(LOG, "createAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "CreateAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/CreateAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.AcceptedAgreement.class,
                        CreateAcceptedAgreementResponse.Builder::acceptedAgreement)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAcceptedAgreementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAcceptedAgreementResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreatePublicationResponse createPublication(CreatePublicationRequest request) {
        Objects.requireNonNull(
                request.getCreatePublicationDetails(), "createPublicationDetails is required");

        return clientCall(request, CreatePublicationResponse::builder)
                .logger(LOG, "createPublication")
                .serviceDetails(
                        "Marketplace",
                        "CreatePublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/CreatePublication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.Publication.class,
                        CreatePublicationResponse.Builder::publication)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePublicationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePublicationResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteAcceptedAgreementResponse deleteAcceptedAgreement(
            DeleteAcceptedAgreementRequest request) {

        Validate.notBlank(
                request.getAcceptedAgreementId(), "acceptedAgreementId must not be blank");

        return clientCall(request, DeleteAcceptedAgreementResponse::builder)
                .logger(LOG, "deleteAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "DeleteAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/DeleteAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendPathParam(request.getAcceptedAgreementId())
                .appendQueryParam("signature", request.getSignature())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAcceptedAgreementResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeletePublicationResponse deletePublication(DeletePublicationRequest request) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        return clientCall(request, DeletePublicationResponse::builder)
                .logger(LOG, "deletePublication")
                .serviceDetails(
                        "Marketplace",
                        "DeletePublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/DeletePublication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePublicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAcceptedAgreementResponse getAcceptedAgreement(GetAcceptedAgreementRequest request) {

        Validate.notBlank(
                request.getAcceptedAgreementId(), "acceptedAgreementId must not be blank");

        return clientCall(request, GetAcceptedAgreementResponse::builder)
                .logger(LOG, "getAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "GetAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/GetAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendPathParam(request.getAcceptedAgreementId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.AcceptedAgreement.class,
                        GetAcceptedAgreementResponse.Builder::acceptedAgreement)
                .handleResponseHeaderString(
                        "opc-request-id", GetAcceptedAgreementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAcceptedAgreementResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetAgreementResponse getAgreement(GetAgreementRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        Validate.notBlank(request.getAgreementId(), "agreementId must not be blank");

        return clientCall(request, GetAgreementResponse::builder)
                .logger(LOG, "getAgreement")
                .serviceDetails(
                        "Marketplace",
                        "GetAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Agreement/GetAgreement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .appendPathParam("agreements")
                .appendPathParam(request.getAgreementId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.Agreement.class,
                        GetAgreementResponse.Builder::agreement)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgreementResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetListingResponse getListing(GetListingRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, GetListingResponse::builder)
                .logger(LOG, "getListing")
                .serviceDetails(
                        "Marketplace",
                        "GetListing",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Listing/GetListing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.Listing.class,
                        GetListingResponse.Builder::listing)
                .handleResponseHeaderString(
                        "opc-request-id", GetListingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetListingResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetPackageResponse getPackage(GetPackageRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        return clientCall(request, GetPackageResponse::builder)
                .logger(LOG, "getPackage")
                .serviceDetails(
                        "Marketplace",
                        "GetPackage",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingPackage/GetPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPackageRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.ListingPackage.class,
                        GetPackageResponse.Builder::listingPackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetPackageResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetPublicationResponse getPublication(GetPublicationRequest request) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        return clientCall(request, GetPublicationResponse::builder)
                .logger(LOG, "getPublication")
                .serviceDetails(
                        "Marketplace",
                        "GetPublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/GetPublication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.Publication.class,
                        GetPublicationResponse.Builder::publication)
                .handleResponseHeaderString("etag", GetPublicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetPublicationPackageResponse getPublicationPackage(
            GetPublicationPackageRequest request) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        return clientCall(request, GetPublicationPackageResponse::builder)
                .logger(LOG, "getPublicationPackage")
                .serviceDetails(
                        "Marketplace",
                        "GetPublicationPackage",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublicationPackage/GetPublicationPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublicationPackageRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.PublicationPackage.class,
                        GetPublicationPackageResponse.Builder::publicationPackage)
                .handleResponseHeaderString("etag", GetPublicationPackageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicationPackageResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAcceptedAgreementsResponse listAcceptedAgreements(
            ListAcceptedAgreementsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAcceptedAgreementsResponse::builder)
                .logger(LOG, "listAcceptedAgreements")
                .serviceDetails(
                        "Marketplace",
                        "ListAcceptedAgreements",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreementSummary/ListAcceptedAgreements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAcceptedAgreementsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("packageVersion", request.getPackageVersion())
                .appendQueryParam("acceptedAgreementId", request.getAcceptedAgreementId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.AcceptedAgreementSummary.class,
                        ListAcceptedAgreementsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAcceptedAgreementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAcceptedAgreementsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAgreementsResponse listAgreements(ListAgreementsRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        return clientCall(request, ListAgreementsResponse::builder)
                .logger(LOG, "listAgreements")
                .serviceDetails(
                        "Marketplace",
                        "ListAgreements",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AgreementSummary/ListAgreements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgreementsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .appendPathParam("agreements")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.AgreementSummary.class,
                        ListAgreementsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgreementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgreementsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) {

        return clientCall(request, ListCategoriesResponse::builder)
                .logger(LOG, "listCategories")
                .serviceDetails(
                        "Marketplace",
                        "ListCategories",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/CategorySummary/ListCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCategoriesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("categories")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.CategorySummary.class,
                        ListCategoriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCategoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCategoriesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListListingsResponse listListings(ListListingsRequest request) {

        return clientCall(request, ListListingsResponse::builder)
                .logger(LOG, "listListings")
                .serviceDetails(
                        "Marketplace",
                        "ListListings",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingSummary/ListListings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListingsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("imageId", request.getImageId())
                .appendQueryParam("publisherId", request.getPublisherId())
                .appendQueryParam("packageType", request.getPackageType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "category",
                        request.getCategory(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "pricing",
                        request.getPricing(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isFeatured", request.getIsFeatured())
                .appendListQueryParam(
                        "listingTypes",
                        request.getListingTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "operatingSystems",
                        request.getOperatingSystems(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.ListingSummary.class,
                        ListListingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListListingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListingsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPackagesResponse listPackages(ListPackagesRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, ListPackagesResponse::builder)
                .logger(LOG, "listPackages")
                .serviceDetails(
                        "Marketplace",
                        "ListPackages",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingPackageSummary/ListPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPackagesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendQueryParam("packageVersion", request.getPackageVersion())
                .appendQueryParam("packageType", request.getPackageType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.ListingPackageSummary.class,
                        ListPackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPackagesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPublicationPackagesResponse listPublicationPackages(
            ListPublicationPackagesRequest request) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        return clientCall(request, ListPublicationPackagesResponse::builder)
                .logger(LOG, "listPublicationPackages")
                .serviceDetails(
                        "Marketplace",
                        "ListPublicationPackages",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublicationPackageSummary/ListPublicationPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicationPackagesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .appendPathParam("packages")
                .appendQueryParam("packageVersion", request.getPackageVersion())
                .appendQueryParam("packageType", request.getPackageType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.PublicationPackageSummary.class,
                        ListPublicationPackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicationPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicationPackagesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPublicationsResponse listPublications(ListPublicationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getListingType(), "listingType is required");

        return clientCall(request, ListPublicationsResponse::builder)
                .logger(LOG, "listPublications")
                .serviceDetails(
                        "Marketplace",
                        "ListPublications",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublicationSummary/ListPublications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicationsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("listingType", request.getListingType())
                .appendQueryParam("publicationId", request.getPublicationId())
                .appendListQueryParam(
                        "operatingSystems",
                        request.getOperatingSystems(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.PublicationSummary.class,
                        ListPublicationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPublishersResponse listPublishers(ListPublishersRequest request) {

        return clientCall(request, ListPublishersResponse::builder)
                .logger(LOG, "listPublishers")
                .serviceDetails(
                        "Marketplace",
                        "ListPublishers",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublisherSummary/ListPublishers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublishersRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publishers")
                .appendQueryParam("publisherId", request.getPublisherId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.PublisherSummary.class,
                        ListPublishersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublishersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublishersResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListReportTypesResponse listReportTypes(ListReportTypesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListReportTypesResponse::builder)
                .logger(LOG, "listReportTypes")
                .serviceDetails(
                        "Marketplace",
                        "ListReportTypes",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ReportTypeCollection/ListReportTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReportTypesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("reportTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.ReportTypeCollection.class,
                        ListReportTypesResponse.Builder::reportTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReportTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReportTypesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListReportsResponse listReports(ListReportsRequest request) {
        Objects.requireNonNull(request.getReportType(), "reportType is required");

        Objects.requireNonNull(request.getDate(), "date is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListReportsResponse::builder)
                .logger(LOG, "listReports")
                .serviceDetails(
                        "Marketplace",
                        "ListReports",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ReportCollection/ListReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReportsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("reports")
                .appendQueryParam("reportType", request.getReportType())
                .appendQueryParam("date", request.getDate())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.ReportCollection.class,
                        ListReportsResponse.Builder::reportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReportsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTaxesResponse listTaxes(ListTaxesRequest request) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, ListTaxesResponse::builder)
                .logger(LOG, "listTaxes")
                .serviceDetails(
                        "Marketplace",
                        "ListTaxes",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/TaxSummary/ListTaxes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaxesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("taxes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.TaxSummary.class,
                        ListTaxesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaxesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTaxesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SearchListingsResponse searchListings(SearchListingsRequest request) {
        Objects.requireNonNull(
                request.getSearchListingsDetails(), "searchListingsDetails is required");

        return clientCall(request, SearchListingsResponse::builder)
                .logger(LOG, "searchListings")
                .serviceDetails(
                        "Marketplace",
                        "SearchListings",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingSummary/SearchListings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchListingsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("searchListings")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.ListingSummary.class,
                        SearchListingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", SearchListingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchListingsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateAcceptedAgreementResponse updateAcceptedAgreement(
            UpdateAcceptedAgreementRequest request) {

        Validate.notBlank(
                request.getAcceptedAgreementId(), "acceptedAgreementId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAcceptedAgreementDetails(),
                "updateAcceptedAgreementDetails is required");

        return clientCall(request, UpdateAcceptedAgreementResponse::builder)
                .logger(LOG, "updateAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "UpdateAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/UpdateAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendPathParam(request.getAcceptedAgreementId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.AcceptedAgreement.class,
                        UpdateAcceptedAgreementResponse.Builder::acceptedAgreement)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAcceptedAgreementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateAcceptedAgreementResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdatePublicationResponse updatePublication(UpdatePublicationRequest request) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePublicationDetails(), "updatePublicationDetails is required");

        return clientCall(request, UpdatePublicationResponse::builder)
                .logger(LOG, "updatePublication")
                .serviceDetails(
                        "Marketplace",
                        "UpdatePublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/UpdatePublication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.Publication.class,
                        UpdatePublicationResponse.Builder::publication)
                .handleResponseHeaderString("etag", UpdatePublicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePublicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public MarketplaceWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MarketplacePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
