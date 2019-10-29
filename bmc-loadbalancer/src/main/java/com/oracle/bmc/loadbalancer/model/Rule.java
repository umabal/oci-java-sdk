/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object that represents an action to apply to a listener.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action",
    defaultImpl = Rule.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AddHttpRequestHeaderRule.class,
        name = "ADD_HTTP_REQUEST_HEADER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RemoveHttpRequestHeaderRule.class,
        name = "REMOVE_HTTP_REQUEST_HEADER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExtendHttpRequestHeaderValueRule.class,
        name = "EXTEND_HTTP_REQUEST_HEADER_VALUE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RemoveHttpResponseHeaderRule.class,
        name = "REMOVE_HTTP_RESPONSE_HEADER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ControlAccessUsingHttpMethodsRule.class,
        name = "CONTROL_ACCESS_USING_HTTP_METHODS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AllowRule.class, name = "ALLOW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = AddHttpResponseHeaderRule.class,
        name = "ADD_HTTP_RESPONSE_HEADER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExtendHttpResponseHeaderValueRule.class,
        name = "EXTEND_HTTP_RESPONSE_HEADER_VALUE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Rule {

    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Action {
        AddHttpRequestHeader("ADD_HTTP_REQUEST_HEADER"),
        ExtendHttpRequestHeaderValue("EXTEND_HTTP_REQUEST_HEADER_VALUE"),
        RemoveHttpRequestHeader("REMOVE_HTTP_REQUEST_HEADER"),
        AddHttpResponseHeader("ADD_HTTP_RESPONSE_HEADER"),
        ExtendHttpResponseHeaderValue("EXTEND_HTTP_RESPONSE_HEADER_VALUE"),
        RemoveHttpResponseHeader("REMOVE_HTTP_RESPONSE_HEADER"),
        Allow("ALLOW"),
        ControlAccessUsingHttpMethods("CONTROL_ACCESS_USING_HTTP_METHODS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
