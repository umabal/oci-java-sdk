/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmsynthetics.requests.*;
import com.oracle.bmc.apmsynthetics.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ApmSyntheticClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements ApmSynthetic {
    /** Service instance for ApmSynthetic. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("APMSYNTHETIC")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://apm-synthetic.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ApmSyntheticAsyncClient.class);

    private final ApmSyntheticPaginators paginators;

    private ApmSyntheticClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new ApmSyntheticPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, ApmSyntheticClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public ApmSyntheticClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ApmSyntheticClient(this, authenticationDetailsProvider);
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
    public AggregateNetworkDataResponse aggregateNetworkData(AggregateNetworkDataRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getAggregateNetworkDataDetails(),
                "aggregateNetworkDataDetails is required");

        return clientCall(request, AggregateNetworkDataResponse::builder)
                .logger(LOG, "aggregateNetworkData")
                .serviceDetails(
                        "ApmSynthetic",
                        "AggregateNetworkData",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/AggregatedNetworkDataResult/AggregateNetworkData")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AggregateNetworkDataRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendPathParam("actions")
                .appendPathParam("aggregateNetworkData")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.AggregatedNetworkDataResult.class,
                        AggregateNetworkDataResponse.Builder::aggregatedNetworkDataResult)
                .handleResponseHeaderString("etag", AggregateNetworkDataResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AggregateNetworkDataResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDedicatedVantagePointResponse createDedicatedVantagePoint(
            CreateDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getCreateDedicatedVantagePointDetails(),
                "createDedicatedVantagePointDetails is required");

        return clientCall(request, CreateDedicatedVantagePointResponse::builder)
                .logger(LOG, "createDedicatedVantagePoint")
                .serviceDetails(
                        "ApmSynthetic",
                        "CreateDedicatedVantagePoint",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/CreateDedicatedVantagePoint")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePoint.class,
                        CreateDedicatedVantagePointResponse.Builder::dedicatedVantagePoint)
                .handleResponseHeaderString(
                        "etag", CreateDedicatedVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDedicatedVantagePointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMonitorResponse createMonitor(CreateMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getCreateMonitorDetails(), "createMonitorDetails is required");

        return clientCall(request, CreateMonitorResponse::builder)
                .logger(LOG, "createMonitor")
                .serviceDetails(
                        "ApmSynthetic",
                        "CreateMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/CreateMonitor")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Monitor.class,
                        CreateMonitorResponse.Builder::monitor)
                .handleResponseHeaderString("etag", CreateMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMonitorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateScriptResponse createScript(CreateScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(request.getCreateScriptDetails(), "createScriptDetails is required");

        return clientCall(request, CreateScriptResponse::builder)
                .logger(LOG, "createScript")
                .serviceDetails(
                        "ApmSynthetic",
                        "CreateScript",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/CreateScript")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Script.class,
                        CreateScriptResponse.Builder::script)
                .handleResponseHeaderString("etag", CreateScriptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScriptResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDedicatedVantagePointResponse deleteDedicatedVantagePoint(
            DeleteDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getDedicatedVantagePointId(), "dedicatedVantagePointId must not be blank");

        return clientCall(request, DeleteDedicatedVantagePointResponse::builder)
                .logger(LOG, "deleteDedicatedVantagePoint")
                .serviceDetails(
                        "ApmSynthetic",
                        "DeleteDedicatedVantagePoint",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/DeleteDedicatedVantagePoint")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendPathParam(request.getDedicatedVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDedicatedVantagePointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMonitorResponse deleteMonitor(DeleteMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, DeleteMonitorResponse::builder)
                .logger(LOG, "deleteMonitor")
                .serviceDetails(
                        "ApmSynthetic",
                        "DeleteMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/DeleteMonitor")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMonitorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScriptId(), "scriptId must not be blank");

        return clientCall(request, DeleteScriptResponse::builder)
                .logger(LOG, "deleteScript")
                .serviceDetails(
                        "ApmSynthetic",
                        "DeleteScript",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/DeleteScript")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendPathParam(request.getScriptId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScriptResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDedicatedVantagePointResponse getDedicatedVantagePoint(
            GetDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getDedicatedVantagePointId(), "dedicatedVantagePointId must not be blank");

        return clientCall(request, GetDedicatedVantagePointResponse::builder)
                .logger(LOG, "getDedicatedVantagePoint")
                .serviceDetails(
                        "ApmSynthetic",
                        "GetDedicatedVantagePoint",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/GetDedicatedVantagePoint")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendPathParam(request.getDedicatedVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePoint.class,
                        GetDedicatedVantagePointResponse.Builder::dedicatedVantagePoint)
                .handleResponseHeaderString("etag", GetDedicatedVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDedicatedVantagePointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMonitorResponse getMonitor(GetMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");

        return clientCall(request, GetMonitorResponse::builder)
                .logger(LOG, "getMonitor")
                .serviceDetails(
                        "ApmSynthetic",
                        "GetMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/GetMonitor")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Monitor.class,
                        GetMonitorResponse.Builder::monitor)
                .handleResponseHeaderString("etag", GetMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMonitorResultResponse getMonitorResult(GetMonitorResultRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(request.getVantagePoint(), "vantagePoint is required");

        Objects.requireNonNull(request.getResultType(), "resultType is required");

        Objects.requireNonNull(request.getResultContentType(), "resultContentType is required");

        Validate.notBlank(request.getExecutionTime(), "executionTime must not be blank");

        return clientCall(request, GetMonitorResultResponse::builder)
                .logger(LOG, "getMonitorResult")
                .serviceDetails(
                        "ApmSynthetic",
                        "GetMonitorResult",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/MonitorResult/GetMonitorResult")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMonitorResultRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendPathParam("results")
                .appendPathParam(request.getExecutionTime())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("vantagePoint", request.getVantagePoint())
                .appendQueryParam("resultType", request.getResultType())
                .appendQueryParam("resultContentType", request.getResultContentType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.MonitorResult.class,
                        GetMonitorResultResponse.Builder::monitorResult)
                .handleResponseHeaderString(
                        "opc-request-id", GetMonitorResultResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetScriptResponse getScript(GetScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScriptId(), "scriptId must not be blank");

        return clientCall(request, GetScriptResponse::builder)
                .logger(LOG, "getScript")
                .serviceDetails(
                        "ApmSynthetic",
                        "GetScript",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/GetScript")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendPathParam(request.getScriptId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Script.class,
                        GetScriptResponse.Builder::script)
                .handleResponseHeaderString("etag", GetScriptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetScriptResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDedicatedVantagePointsResponse listDedicatedVantagePoints(
            ListDedicatedVantagePointsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListDedicatedVantagePointsResponse::builder)
                .logger(LOG, "listDedicatedVantagePoints")
                .serviceDetails(
                        "ApmSynthetic",
                        "ListDedicatedVantagePoints",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePointCollection/ListDedicatedVantagePoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDedicatedVantagePointsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("status", request.getStatus())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePointCollection.class,
                        ListDedicatedVantagePointsResponse.Builder::dedicatedVantagePointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDedicatedVantagePointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDedicatedVantagePointsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMonitorsResponse listMonitors(ListMonitorsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListMonitorsResponse::builder)
                .logger(LOG, "listMonitors")
                .serviceDetails(
                        "ApmSynthetic",
                        "ListMonitors",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/MonitorCollection/ListMonitors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMonitorsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("scriptId", request.getScriptId())
                .appendQueryParam("vantagePoint", request.getVantagePoint())
                .appendQueryParam("monitorType", request.getMonitorType())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam(
                        "isMaintenanceWindowActive", request.getIsMaintenanceWindowActive())
                .appendQueryParam("isMaintenanceWindowSet", request.getIsMaintenanceWindowSet())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.MonitorCollection.class,
                        ListMonitorsResponse.Builder::monitorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMonitorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMonitorsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListPublicVantagePointsResponse listPublicVantagePoints(
            ListPublicVantagePointsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListPublicVantagePointsResponse::builder)
                .logger(LOG, "listPublicVantagePoints")
                .serviceDetails(
                        "ApmSynthetic",
                        "ListPublicVantagePoints",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/PublicVantagePointCollection/ListPublicVantagePoints")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicVantagePointsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("publicVantagePoints")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.PublicVantagePointCollection.class,
                        ListPublicVantagePointsResponse.Builder::publicVantagePointCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicVantagePointsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicVantagePointsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListScriptsResponse listScripts(ListScriptsRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListScriptsResponse::builder)
                .logger(LOG, "listScripts")
                .serviceDetails(
                        "ApmSynthetic",
                        "ListScripts",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/ScriptCollection/ListScripts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScriptsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("contentType", request.getContentType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.ScriptCollection.class,
                        ListScriptsResponse.Builder::scriptCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScriptsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScriptsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDedicatedVantagePointResponse updateDedicatedVantagePoint(
            UpdateDedicatedVantagePointRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(
                request.getDedicatedVantagePointId(), "dedicatedVantagePointId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDedicatedVantagePointDetails(),
                "updateDedicatedVantagePointDetails is required");

        return clientCall(request, UpdateDedicatedVantagePointResponse::builder)
                .logger(LOG, "updateDedicatedVantagePoint")
                .serviceDetails(
                        "ApmSynthetic",
                        "UpdateDedicatedVantagePoint",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/DedicatedVantagePoint/UpdateDedicatedVantagePoint")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDedicatedVantagePointRequest::builder)
                .basePath("/20200630")
                .appendPathParam("dedicatedVantagePoints")
                .appendPathParam(request.getDedicatedVantagePointId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.DedicatedVantagePoint.class,
                        UpdateDedicatedVantagePointResponse.Builder::dedicatedVantagePoint)
                .handleResponseHeaderString(
                        "etag", UpdateDedicatedVantagePointResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDedicatedVantagePointResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMonitorResponse updateMonitor(UpdateMonitorRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMonitorDetails(), "updateMonitorDetails is required");

        return clientCall(request, UpdateMonitorResponse::builder)
                .logger(LOG, "updateMonitor")
                .serviceDetails(
                        "ApmSynthetic",
                        "UpdateMonitor",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Monitor/UpdateMonitor")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMonitorRequest::builder)
                .basePath("/20200630")
                .appendPathParam("monitors")
                .appendPathParam(request.getMonitorId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Monitor.class,
                        UpdateMonitorResponse.Builder::monitor)
                .handleResponseHeaderString("etag", UpdateMonitorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMonitorResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScriptId(), "scriptId must not be blank");
        Objects.requireNonNull(request.getUpdateScriptDetails(), "updateScriptDetails is required");

        return clientCall(request, UpdateScriptResponse::builder)
                .logger(LOG, "updateScript")
                .serviceDetails(
                        "ApmSynthetic",
                        "UpdateScript",
                        "https://docs.oracle.com/iaas/api/#/en/apm-synthetic-monitoring/20200630/Script/UpdateScript")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScriptRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scripts")
                .appendPathParam(request.getScriptId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmsynthetics.model.Script.class,
                        UpdateScriptResponse.Builder::script)
                .handleResponseHeaderString("etag", UpdateScriptResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScriptResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ApmSyntheticPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApmSyntheticClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ApmSyntheticClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
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
    public ApmSyntheticClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
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
    public ApmSyntheticClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
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
    public ApmSyntheticClient(
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
                authenticationDetailsProvider);
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
    public ApmSyntheticClient(
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
                authenticationDetailsProvider);
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
    public ApmSyntheticClient(
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
                authenticationDetailsProvider);
    }
}
