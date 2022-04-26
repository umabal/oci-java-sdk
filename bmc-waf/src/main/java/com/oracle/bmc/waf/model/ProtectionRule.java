/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Rule that represents Request/Response Protection.
 * Only actions of the following types are allowed to be referenced in this rule:
 *  * CHECK
 *  * RETURN_HTTP_RESPONSE
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProtectionRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProtectionRule extends WebAppFirewallPolicyRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguage")
        private ConditionLanguage conditionLanguage;

        public Builder conditionLanguage(ConditionLanguage conditionLanguage) {
            this.conditionLanguage = conditionLanguage;
            this.__explicitlySet__.add("conditionLanguage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionName")
        private String actionName;

        public Builder actionName(String actionName) {
            this.actionName = actionName;
            this.__explicitlySet__.add("actionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilities")
        private java.util.List<ProtectionCapability> protectionCapabilities;

        public Builder protectionCapabilities(
                java.util.List<ProtectionCapability> protectionCapabilities) {
            this.protectionCapabilities = protectionCapabilities;
            this.__explicitlySet__.add("protectionCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilitySettings")
        private ProtectionCapabilitySettings protectionCapabilitySettings;

        public Builder protectionCapabilitySettings(
                ProtectionCapabilitySettings protectionCapabilitySettings) {
            this.protectionCapabilitySettings = protectionCapabilitySettings;
            this.__explicitlySet__.add("protectionCapabilitySettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBodyInspectionEnabled")
        private Boolean isBodyInspectionEnabled;

        public Builder isBodyInspectionEnabled(Boolean isBodyInspectionEnabled) {
            this.isBodyInspectionEnabled = isBodyInspectionEnabled;
            this.__explicitlySet__.add("isBodyInspectionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionRule build() {
            ProtectionRule __instance__ =
                    new ProtectionRule(
                            name,
                            conditionLanguage,
                            condition,
                            actionName,
                            protectionCapabilities,
                            protectionCapabilitySettings,
                            isBodyInspectionEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRule o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .conditionLanguage(o.getConditionLanguage())
                            .condition(o.getCondition())
                            .actionName(o.getActionName())
                            .protectionCapabilities(o.getProtectionCapabilities())
                            .protectionCapabilitySettings(o.getProtectionCapabilitySettings())
                            .isBodyInspectionEnabled(o.getIsBodyInspectionEnabled());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public ProtectionRule(
            String name,
            ConditionLanguage conditionLanguage,
            String condition,
            String actionName,
            java.util.List<ProtectionCapability> protectionCapabilities,
            ProtectionCapabilitySettings protectionCapabilitySettings,
            Boolean isBodyInspectionEnabled) {
        super(name, conditionLanguage, condition, actionName);
        this.protectionCapabilities = protectionCapabilities;
        this.protectionCapabilitySettings = protectionCapabilitySettings;
        this.isBodyInspectionEnabled = isBodyInspectionEnabled;
    }

    /**
     * An ordered list that references OCI-managed protection capabilities.
     * Referenced protection capabilities are not necessarily executed in order of appearance. Their execution order
     * is decided at runtime for improved performance.
     * The array cannot contain entries with the same pair of capability key and version more than once.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilities")
    java.util.List<ProtectionCapability> protectionCapabilities;

    @com.fasterxml.jackson.annotation.JsonProperty("protectionCapabilitySettings")
    ProtectionCapabilitySettings protectionCapabilitySettings;

    /**
     * Enables/disables body inspection for this protection rule.
     * Only Protection Rules in RequestProtection can have this option enabled. Response body inspection will
     * be available at a later date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBodyInspectionEnabled")
    Boolean isBodyInspectionEnabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
