/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for converting a non-container database to pluggable database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConvertToPdbDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ConvertToPdbDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("convertToPdbTargetDetails")
        private ConvertToPdbTargetBase convertToPdbTargetDetails;

        public Builder convertToPdbTargetDetails(ConvertToPdbTargetBase convertToPdbTargetDetails) {
            this.convertToPdbTargetDetails = convertToPdbTargetDetails;
            this.__explicitlySet__.add("convertToPdbTargetDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConvertToPdbDetails build() {
            ConvertToPdbDetails __instance__ =
                    new ConvertToPdbDetails(action, convertToPdbTargetDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConvertToPdbDetails o) {
            Builder copiedBuilder =
                    action(o.getAction())
                            .convertToPdbTargetDetails(o.getConvertToPdbTargetDetails());

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

    /**
     * The operations used to convert a non-container database to a pluggable database.
     * - Use {@code PRECHECK} to run a pre-check operation on non-container database prior to converting it into a pluggable database.
     * - Use {@code CONVERT} to convert a non-container database into a pluggable database.
     * - Use {@code SYNC} if the non-container database was manually converted into a pluggable database using the dbcli command-line utility. Databases may need to be converted manually if the CONVERT action fails when converting a non-container database using the API.
     * - Use {@code SYNC_ROLLBACK} if the conversion of a non-container database into a pluggable database was manually rolled back using the dbcli command line utility. Conversions may need to be manually rolled back if the CONVERT action fails when converting a non-container database using the API.
     *
     **/
    public enum Action {
        Precheck("PRECHECK"),
        Convert("CONVERT"),
        Sync("SYNC"),
        SyncRollback("SYNC_ROLLBACK"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /**
     * The operations used to convert a non-container database to a pluggable database.
     * - Use {@code PRECHECK} to run a pre-check operation on non-container database prior to converting it into a pluggable database.
     * - Use {@code CONVERT} to convert a non-container database into a pluggable database.
     * - Use {@code SYNC} if the non-container database was manually converted into a pluggable database using the dbcli command-line utility. Databases may need to be converted manually if the CONVERT action fails when converting a non-container database using the API.
     * - Use {@code SYNC_ROLLBACK} if the conversion of a non-container database into a pluggable database was manually rolled back using the dbcli command line utility. Conversions may need to be manually rolled back if the CONVERT action fails when converting a non-container database using the API.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

    @com.fasterxml.jackson.annotation.JsonProperty("convertToPdbTargetDetails")
    ConvertToPdbTargetBase convertToPdbTargetDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}