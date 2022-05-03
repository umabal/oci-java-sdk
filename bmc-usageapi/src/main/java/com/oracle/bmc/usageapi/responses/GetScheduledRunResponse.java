/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.responses;

import com.oracle.bmc.usageapi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetScheduledRunResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * The returned ScheduledRun instance.
     */
    private com.oracle.bmc.usageapi.model.ScheduledRun scheduledRun;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "scheduledRun"
    })
    private GetScheduledRunResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.usageapi.model.ScheduledRun scheduledRun) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.scheduledRun = scheduledRun;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetScheduledRunResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            scheduledRun(o.getScheduledRun());

            return this;
        }

        public GetScheduledRunResponse build() {
            return new GetScheduledRunResponse(
                    __httpStatusCode__, opcRequestId, etag, scheduledRun);
        }
    }
}