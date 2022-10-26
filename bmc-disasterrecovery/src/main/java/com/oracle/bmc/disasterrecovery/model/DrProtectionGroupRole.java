/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Enumeration of different roles of a DR Protection Group. - PRIMARY - The DR Protection Group has
 * a primary role in a DR confguration. - STANDBY - The DR Protection Group has a standby role in a
 * DR confguration. - UNCONFIGURED - The DR Protection Group is not part of a DR confguration
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public enum DrProtectionGroupRole implements com.oracle.bmc.http.internal.BmcEnum {
    Primary("PRIMARY"),
    Standby("STANDBY"),
    Unconfigured("UNCONFIGURED"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DrProtectionGroupRole.class);

    private final String value;
    private static java.util.Map<String, DrProtectionGroupRole> map;

    static {
        map = new java.util.HashMap<>();
        for (DrProtectionGroupRole v : DrProtectionGroupRole.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    DrProtectionGroupRole(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DrProtectionGroupRole create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'DrProtectionGroupRole', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
