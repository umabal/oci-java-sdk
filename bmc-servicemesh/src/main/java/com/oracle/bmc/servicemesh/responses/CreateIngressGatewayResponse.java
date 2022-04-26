/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.responses;

import com.oracle.bmc.servicemesh.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CreateIngressGatewayResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Location header field identifying the URL of the new resource.
     *
     */
    private String location;

    /**
     * The returned IngressGateway instance.
     */
    private com.oracle.bmc.servicemesh.model.IngressGateway ingressGateway;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "location",
        "ingressGateway"
    })
    private CreateIngressGatewayResponse(
            int __httpStatusCode__,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            com.oracle.bmc.servicemesh.model.IngressGateway ingressGateway) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.ingressGateway = ingressGateway;
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
        public Builder copy(CreateIngressGatewayResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            ingressGateway(o.getIngressGateway());

            return this;
        }

        public CreateIngressGatewayResponse build() {
            return new CreateIngressGatewayResponse(
                    __httpStatusCode__,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    location,
                    ingressGateway);
        }
    }
}
