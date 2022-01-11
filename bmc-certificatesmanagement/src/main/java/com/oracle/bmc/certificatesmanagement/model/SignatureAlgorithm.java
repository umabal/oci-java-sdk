/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The algorithm used to sign the public key certificate.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.extern.slf4j.Slf4j
public enum SignatureAlgorithm {
    Sha256WithRsa("SHA256_WITH_RSA"),
    Sha384WithRsa("SHA384_WITH_RSA"),
    Sha512WithRsa("SHA512_WITH_RSA"),
    Sha256WithEcdsa("SHA256_WITH_ECDSA"),
    Sha384WithEcdsa("SHA384_WITH_ECDSA"),
    Sha512WithEcdsa("SHA512_WITH_ECDSA"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, SignatureAlgorithm> map;

    static {
        map = new java.util.HashMap<>();
        for (SignatureAlgorithm v : SignatureAlgorithm.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    SignatureAlgorithm(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static SignatureAlgorithm create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'SignatureAlgorithm', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}