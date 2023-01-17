/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Database Connection resource used for migrations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Connection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Connection extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "databaseType",
        "manualDatabaseSubType",
        "isDedicated",
        "displayName",
        "databaseId",
        "connectDescriptor",
        "credentialsSecretId",
        "certificateTdn",
        "sshDetails",
        "adminCredentials",
        "privateEndpoint",
        "vaultDetails",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "nsgIds"
    })
    public Connection(
            String id,
            String compartmentId,
            DatabaseConnectionTypes databaseType,
            DatabaseManualConnectionSubTypes manualDatabaseSubType,
            Boolean isDedicated,
            String displayName,
            String databaseId,
            ConnectDescriptor connectDescriptor,
            String credentialsSecretId,
            String certificateTdn,
            SshDetails sshDetails,
            AdminCredentials adminCredentials,
            PrivateEndpointDetails privateEndpoint,
            VaultDetails vaultDetails,
            LifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<String> nsgIds) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.databaseType = databaseType;
        this.manualDatabaseSubType = manualDatabaseSubType;
        this.isDedicated = isDedicated;
        this.displayName = displayName;
        this.databaseId = databaseId;
        this.connectDescriptor = connectDescriptor;
        this.credentialsSecretId = credentialsSecretId;
        this.certificateTdn = certificateTdn;
        this.sshDetails = sshDetails;
        this.adminCredentials = adminCredentials;
        this.privateEndpoint = privateEndpoint;
        this.vaultDetails = vaultDetails;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the resource */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OCID of the compartment */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Database connection type. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseConnectionTypes databaseType;

        /**
         * Database connection type.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(DatabaseConnectionTypes databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * Database manual connection subtype. This value can only be specified for manual
         * connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("manualDatabaseSubType")
        private DatabaseManualConnectionSubTypes manualDatabaseSubType;

        /**
         * Database manual connection subtype. This value can only be specified for manual
         * connections.
         *
         * @param manualDatabaseSubType the value to set
         * @return this builder
         */
        public Builder manualDatabaseSubType(
                DatabaseManualConnectionSubTypes manualDatabaseSubType) {
            this.manualDatabaseSubType = manualDatabaseSubType;
            this.__explicitlySet__.add("manualDatabaseSubType");
            return this;
        }
        /**
         * True if the Autonomous Connection is dedicated. Not provided for Non-Autonomous
         * Connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
        private Boolean isDedicated;

        /**
         * True if the Autonomous Connection is dedicated. Not provided for Non-Autonomous
         * Connections.
         *
         * @param isDedicated the value to set
         * @return this builder
         */
        public Builder isDedicated(Boolean isDedicated) {
            this.isDedicated = isDedicated;
            this.__explicitlySet__.add("isDedicated");
            return this;
        }
        /** Database Connection display name identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Database Connection display name identifier.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the cloud database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The OCID of the cloud database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
        private ConnectDescriptor connectDescriptor;

        public Builder connectDescriptor(ConnectDescriptor connectDescriptor) {
            this.connectDescriptor = connectDescriptor;
            this.__explicitlySet__.add("connectDescriptor");
            return this;
        }
        /** OCID of the Secret in the OCI vault containing the Database Connection credentials. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
        private String credentialsSecretId;

        /**
         * OCID of the Secret in the OCI vault containing the Database Connection credentials.
         *
         * @param credentialsSecretId the value to set
         * @return this builder
         */
        public Builder credentialsSecretId(String credentialsSecretId) {
            this.credentialsSecretId = credentialsSecretId;
            this.__explicitlySet__.add("credentialsSecretId");
            return this;
        }
        /**
         * This name is the distinguished name used while creating the certificate on target
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
        private String certificateTdn;

        /**
         * This name is the distinguished name used while creating the certificate on target
         * database.
         *
         * @param certificateTdn the value to set
         * @return this builder
         */
        public Builder certificateTdn(String certificateTdn) {
            this.certificateTdn = certificateTdn;
            this.__explicitlySet__.add("certificateTdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
        private SshDetails sshDetails;

        public Builder sshDetails(SshDetails sshDetails) {
            this.sshDetails = sshDetails;
            this.__explicitlySet__.add("sshDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
        private AdminCredentials adminCredentials;

        public Builder adminCredentials(AdminCredentials adminCredentials) {
            this.adminCredentials = adminCredentials;
            this.__explicitlySet__.add("adminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private PrivateEndpointDetails privateEndpoint;

        public Builder privateEndpoint(PrivateEndpointDetails privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
        private VaultDetails vaultDetails;

        public Builder vaultDetails(VaultDetails vaultDetails) {
            this.vaultDetails = vaultDetails;
            this.__explicitlySet__.add("vaultDetails");
            return this;
        }
        /** The current state of the Connection resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current state of the Connection resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The time the Connection resource was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the Connection resource was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time of the last Connection resource details update. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time of the last Connection resource details update. An RFC3339 formatted datetime
         * string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * An array of Network Security Group OCIDs used to define network access for Connections.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * An array of Network Security Group OCIDs used to define network access for Connections.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Connection build() {
            Connection model =
                    new Connection(
                            this.id,
                            this.compartmentId,
                            this.databaseType,
                            this.manualDatabaseSubType,
                            this.isDedicated,
                            this.displayName,
                            this.databaseId,
                            this.connectDescriptor,
                            this.credentialsSecretId,
                            this.certificateTdn,
                            this.sshDetails,
                            this.adminCredentials,
                            this.privateEndpoint,
                            this.vaultDetails,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Connection model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("manualDatabaseSubType")) {
                this.manualDatabaseSubType(model.getManualDatabaseSubType());
            }
            if (model.wasPropertyExplicitlySet("isDedicated")) {
                this.isDedicated(model.getIsDedicated());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("connectDescriptor")) {
                this.connectDescriptor(model.getConnectDescriptor());
            }
            if (model.wasPropertyExplicitlySet("credentialsSecretId")) {
                this.credentialsSecretId(model.getCredentialsSecretId());
            }
            if (model.wasPropertyExplicitlySet("certificateTdn")) {
                this.certificateTdn(model.getCertificateTdn());
            }
            if (model.wasPropertyExplicitlySet("sshDetails")) {
                this.sshDetails(model.getSshDetails());
            }
            if (model.wasPropertyExplicitlySet("adminCredentials")) {
                this.adminCredentials(model.getAdminCredentials());
            }
            if (model.wasPropertyExplicitlySet("privateEndpoint")) {
                this.privateEndpoint(model.getPrivateEndpoint());
            }
            if (model.wasPropertyExplicitlySet("vaultDetails")) {
                this.vaultDetails(model.getVaultDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The OCID of the resource */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OCID of the compartment */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Database connection type. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseConnectionTypes databaseType;

    /**
     * Database connection type.
     *
     * @return the value
     */
    public DatabaseConnectionTypes getDatabaseType() {
        return databaseType;
    }

    /**
     * Database manual connection subtype. This value can only be specified for manual connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manualDatabaseSubType")
    private final DatabaseManualConnectionSubTypes manualDatabaseSubType;

    /**
     * Database manual connection subtype. This value can only be specified for manual connections.
     *
     * @return the value
     */
    public DatabaseManualConnectionSubTypes getManualDatabaseSubType() {
        return manualDatabaseSubType;
    }

    /**
     * True if the Autonomous Connection is dedicated. Not provided for Non-Autonomous Connections.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
    private final Boolean isDedicated;

    /**
     * True if the Autonomous Connection is dedicated. Not provided for Non-Autonomous Connections.
     *
     * @return the value
     */
    public Boolean getIsDedicated() {
        return isDedicated;
    }

    /** Database Connection display name identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Database Connection display name identifier.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the cloud database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The OCID of the cloud database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
    private final ConnectDescriptor connectDescriptor;

    public ConnectDescriptor getConnectDescriptor() {
        return connectDescriptor;
    }

    /** OCID of the Secret in the OCI vault containing the Database Connection credentials. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
    private final String credentialsSecretId;

    /**
     * OCID of the Secret in the OCI vault containing the Database Connection credentials.
     *
     * @return the value
     */
    public String getCredentialsSecretId() {
        return credentialsSecretId;
    }

    /**
     * This name is the distinguished name used while creating the certificate on target database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
    private final String certificateTdn;

    /**
     * This name is the distinguished name used while creating the certificate on target database.
     *
     * @return the value
     */
    public String getCertificateTdn() {
        return certificateTdn;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
    private final SshDetails sshDetails;

    public SshDetails getSshDetails() {
        return sshDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
    private final AdminCredentials adminCredentials;

    public AdminCredentials getAdminCredentials() {
        return adminCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    private final PrivateEndpointDetails privateEndpoint;

    public PrivateEndpointDetails getPrivateEndpoint() {
        return privateEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    private final VaultDetails vaultDetails;

    public VaultDetails getVaultDetails() {
        return vaultDetails;
    }

    /** The current state of the Connection resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current state of the Connection resource.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The time the Connection resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Connection resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time of the last Connection resource details update. An RFC3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time of the last Connection resource details update. An RFC3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** An array of Network Security Group OCIDs used to define network access for Connections. */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * An array of Network Security Group OCIDs used to define network access for Connections.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Connection(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", manualDatabaseSubType=").append(String.valueOf(this.manualDatabaseSubType));
        sb.append(", isDedicated=").append(String.valueOf(this.isDedicated));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", connectDescriptor=").append(String.valueOf(this.connectDescriptor));
        sb.append(", credentialsSecretId=").append(String.valueOf(this.credentialsSecretId));
        sb.append(", certificateTdn=").append(String.valueOf(this.certificateTdn));
        sb.append(", sshDetails=").append(String.valueOf(this.sshDetails));
        sb.append(", adminCredentials=").append(String.valueOf(this.adminCredentials));
        sb.append(", privateEndpoint=").append(String.valueOf(this.privateEndpoint));
        sb.append(", vaultDetails=").append(String.valueOf(this.vaultDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Connection)) {
            return false;
        }

        Connection other = (Connection) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.manualDatabaseSubType, other.manualDatabaseSubType)
                && java.util.Objects.equals(this.isDedicated, other.isDedicated)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.connectDescriptor, other.connectDescriptor)
                && java.util.Objects.equals(this.credentialsSecretId, other.credentialsSecretId)
                && java.util.Objects.equals(this.certificateTdn, other.certificateTdn)
                && java.util.Objects.equals(this.sshDetails, other.sshDetails)
                && java.util.Objects.equals(this.adminCredentials, other.adminCredentials)
                && java.util.Objects.equals(this.privateEndpoint, other.privateEndpoint)
                && java.util.Objects.equals(this.vaultDetails, other.vaultDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.manualDatabaseSubType == null
                                ? 43
                                : this.manualDatabaseSubType.hashCode());
        result = (result * PRIME) + (this.isDedicated == null ? 43 : this.isDedicated.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectDescriptor == null ? 43 : this.connectDescriptor.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialsSecretId == null
                                ? 43
                                : this.credentialsSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateTdn == null ? 43 : this.certificateTdn.hashCode());
        result = (result * PRIME) + (this.sshDetails == null ? 43 : this.sshDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.adminCredentials == null ? 43 : this.adminCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpoint == null ? 43 : this.privateEndpoint.hashCode());
        result = (result * PRIME) + (this.vaultDetails == null ? 43 : this.vaultDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
