/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage;

import com.oracle.bmc.osubusage.requests.*;
import com.oracle.bmc.osubusage.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ComputedUsage where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@lombok.RequiredArgsConstructor
public class ComputedUsagePaginators {
    private final ComputedUsage client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputedUsageAggregateds operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputedUsageAggregatedsResponse>
            listComputedUsageAggregatedsResponseIterator(
                    final ListComputedUsageAggregatedsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputedUsageAggregatedsRequest.Builder, ListComputedUsageAggregatedsRequest,
                ListComputedUsageAggregatedsResponse>(
                new com.google.common.base.Supplier<ListComputedUsageAggregatedsRequest.Builder>() {
                    @Override
                    public ListComputedUsageAggregatedsRequest.Builder get() {
                        return ListComputedUsageAggregatedsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsageAggregatedsResponse, String>() {
                    @Override
                    public String apply(ListComputedUsageAggregatedsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputedUsageAggregatedsRequest.Builder>,
                        ListComputedUsageAggregatedsRequest>() {
                    @Override
                    public ListComputedUsageAggregatedsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputedUsageAggregatedsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsageAggregatedsRequest,
                        ListComputedUsageAggregatedsResponse>() {
                    @Override
                    public ListComputedUsageAggregatedsResponse apply(
                            ListComputedUsageAggregatedsRequest request) {
                        return client.listComputedUsageAggregateds(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osubusage.model.ComputedUsageAggregatedSummary} objects
     * contained in responses from the listComputedUsageAggregateds operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osubusage.model.ComputedUsageAggregatedSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osubusage.model.ComputedUsageAggregatedSummary>
            listComputedUsageAggregatedsRecordIterator(
                    final ListComputedUsageAggregatedsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputedUsageAggregatedsRequest.Builder, ListComputedUsageAggregatedsRequest,
                ListComputedUsageAggregatedsResponse,
                com.oracle.bmc.osubusage.model.ComputedUsageAggregatedSummary>(
                new com.google.common.base.Supplier<ListComputedUsageAggregatedsRequest.Builder>() {
                    @Override
                    public ListComputedUsageAggregatedsRequest.Builder get() {
                        return ListComputedUsageAggregatedsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsageAggregatedsResponse, String>() {
                    @Override
                    public String apply(ListComputedUsageAggregatedsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputedUsageAggregatedsRequest.Builder>,
                        ListComputedUsageAggregatedsRequest>() {
                    @Override
                    public ListComputedUsageAggregatedsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputedUsageAggregatedsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsageAggregatedsRequest,
                        ListComputedUsageAggregatedsResponse>() {
                    @Override
                    public ListComputedUsageAggregatedsResponse apply(
                            ListComputedUsageAggregatedsRequest request) {
                        return client.listComputedUsageAggregateds(request);
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsageAggregatedsResponse,
                        java.util.List<
                                com.oracle.bmc.osubusage.model.ComputedUsageAggregatedSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.osubusage.model.ComputedUsageAggregatedSummary>
                            apply(ListComputedUsageAggregatedsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listComputedUsages operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListComputedUsagesResponse> listComputedUsagesResponseIterator(
            final ListComputedUsagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListComputedUsagesRequest.Builder, ListComputedUsagesRequest,
                ListComputedUsagesResponse>(
                new com.google.common.base.Supplier<ListComputedUsagesRequest.Builder>() {
                    @Override
                    public ListComputedUsagesRequest.Builder get() {
                        return ListComputedUsagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListComputedUsagesResponse, String>() {
                    @Override
                    public String apply(ListComputedUsagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputedUsagesRequest.Builder>,
                        ListComputedUsagesRequest>() {
                    @Override
                    public ListComputedUsagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputedUsagesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsagesRequest, ListComputedUsagesResponse>() {
                    @Override
                    public ListComputedUsagesResponse apply(ListComputedUsagesRequest request) {
                        return client.listComputedUsages(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.osubusage.model.ComputedUsageSummary} objects
     * contained in responses from the listComputedUsages operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.osubusage.model.ComputedUsageSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.osubusage.model.ComputedUsageSummary>
            listComputedUsagesRecordIterator(final ListComputedUsagesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListComputedUsagesRequest.Builder, ListComputedUsagesRequest,
                ListComputedUsagesResponse, com.oracle.bmc.osubusage.model.ComputedUsageSummary>(
                new com.google.common.base.Supplier<ListComputedUsagesRequest.Builder>() {
                    @Override
                    public ListComputedUsagesRequest.Builder get() {
                        return ListComputedUsagesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListComputedUsagesResponse, String>() {
                    @Override
                    public String apply(ListComputedUsagesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListComputedUsagesRequest.Builder>,
                        ListComputedUsagesRequest>() {
                    @Override
                    public ListComputedUsagesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListComputedUsagesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsagesRequest, ListComputedUsagesResponse>() {
                    @Override
                    public ListComputedUsagesResponse apply(ListComputedUsagesRequest request) {
                        return client.listComputedUsages(request);
                    }
                },
                new com.google.common.base.Function<
                        ListComputedUsagesResponse,
                        java.util.List<com.oracle.bmc.osubusage.model.ComputedUsageSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.osubusage.model.ComputedUsageSummary>
                            apply(ListComputedUsagesResponse response) {
                        return response.getItems();
                    }
                });
    }
}