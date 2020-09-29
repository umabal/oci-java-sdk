/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class QueryResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the next page of the list. Include this value as the `page` parameter for the
     * subsequent request to get the next batch of items.
     *
     */
    private String opcNextPageId;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then additional items may be available on the previous page of the list. Include this value as the `page` parameter for the
     * subsequent request to get the previous batch of items.
     *
     */
    private String opcPrevPageId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * URI to entity or work request created.
     *
     */
    private String location;

    /**
     * The returned QueryAggregation instance.
     */
    private QueryAggregation queryAggregation;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(QueryResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPageId(o.getOpcNextPageId());
            opcPrevPageId(o.getOpcPrevPageId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            location(o.getLocation());
            queryAggregation(o.getQueryAggregation());

            return this;
        }
    }
}