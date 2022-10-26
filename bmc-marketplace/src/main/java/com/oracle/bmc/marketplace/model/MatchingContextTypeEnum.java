/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values for matching context returned in the response. If you specify HIGHLIGHTS, then
 * the service will highlight fragments in its response. The default value is NONE.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum MatchingContextTypeEnum implements com.oracle.bmc.http.internal.BmcEnum {
    None("NONE"),
    Highlights("HIGHLIGHTS"),
    ;

    private final String value;
    private static java.util.Map<String, MatchingContextTypeEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (MatchingContextTypeEnum v : MatchingContextTypeEnum.values()) {
            map.put(v.getValue(), v);
        }
    }

    MatchingContextTypeEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static MatchingContextTypeEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        throw new IllegalArgumentException("Invalid MatchingContextTypeEnum: " + key);
    }
}
