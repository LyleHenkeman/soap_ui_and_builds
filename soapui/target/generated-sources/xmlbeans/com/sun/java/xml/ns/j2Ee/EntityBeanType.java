/*
 * XML Type:  entity-beanType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EntityBeanType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML entity-beanType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface EntityBeanType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityBeanType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("entitybeantype6abbtype");
    
    /**
     * Gets a List of "description" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList();
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(com.sun.java.xml.ns.j2Ee.DescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.DescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets a List of "display-name" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.DisplayNameType> getDisplayNameList();
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType[] getDisplayNameArray();
    
    /**
     * Gets ith "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType getDisplayNameArray(int i);
    
    /**
     * Returns number of "display-name" element
     */
    int sizeOfDisplayNameArray();
    
    /**
     * Sets array of all "display-name" element
     */
    void setDisplayNameArray(com.sun.java.xml.ns.j2Ee.DisplayNameType[] displayNameArray);
    
    /**
     * Sets ith "display-name" element
     */
    void setDisplayNameArray(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType displayName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType insertNewDisplayName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType addNewDisplayName();
    
    /**
     * Removes the ith "display-name" element
     */
    void removeDisplayName(int i);
    
    /**
     * Gets a List of "icon" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.IconType> getIconList();
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.IconType[] getIconArray();
    
    /**
     * Gets ith "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType getIconArray(int i);
    
    /**
     * Returns number of "icon" element
     */
    int sizeOfIconArray();
    
    /**
     * Sets array of all "icon" element
     */
    void setIconArray(com.sun.java.xml.ns.j2Ee.IconType[] iconArray);
    
    /**
     * Sets ith "icon" element
     */
    void setIconArray(int i, com.sun.java.xml.ns.j2Ee.IconType icon);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType insertNewIcon(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType addNewIcon();
    
    /**
     * Removes the ith "icon" element
     */
    void removeIcon(int i);
    
    /**
     * Gets the "ejb-name" element
     */
    com.sun.java.xml.ns.j2Ee.EjbNameType getEjbName();
    
    /**
     * Sets the "ejb-name" element
     */
    void setEjbName(com.sun.java.xml.ns.j2Ee.EjbNameType ejbName);
    
    /**
     * Appends and returns a new empty "ejb-name" element
     */
    com.sun.java.xml.ns.j2Ee.EjbNameType addNewEjbName();
    
    /**
     * Gets the "home" element
     */
    com.sun.java.xml.ns.j2Ee.HomeType getHome();
    
    /**
     * True if has "home" element
     */
    boolean isSetHome();
    
    /**
     * Sets the "home" element
     */
    void setHome(com.sun.java.xml.ns.j2Ee.HomeType home);
    
    /**
     * Appends and returns a new empty "home" element
     */
    com.sun.java.xml.ns.j2Ee.HomeType addNewHome();
    
    /**
     * Unsets the "home" element
     */
    void unsetHome();
    
    /**
     * Gets the "remote" element
     */
    com.sun.java.xml.ns.j2Ee.RemoteType getRemote();
    
    /**
     * True if has "remote" element
     */
    boolean isSetRemote();
    
    /**
     * Sets the "remote" element
     */
    void setRemote(com.sun.java.xml.ns.j2Ee.RemoteType remote);
    
    /**
     * Appends and returns a new empty "remote" element
     */
    com.sun.java.xml.ns.j2Ee.RemoteType addNewRemote();
    
    /**
     * Unsets the "remote" element
     */
    void unsetRemote();
    
    /**
     * Gets the "local-home" element
     */
    com.sun.java.xml.ns.j2Ee.LocalHomeType getLocalHome();
    
    /**
     * True if has "local-home" element
     */
    boolean isSetLocalHome();
    
    /**
     * Sets the "local-home" element
     */
    void setLocalHome(com.sun.java.xml.ns.j2Ee.LocalHomeType localHome);
    
    /**
     * Appends and returns a new empty "local-home" element
     */
    com.sun.java.xml.ns.j2Ee.LocalHomeType addNewLocalHome();
    
    /**
     * Unsets the "local-home" element
     */
    void unsetLocalHome();
    
    /**
     * Gets the "local" element
     */
    com.sun.java.xml.ns.j2Ee.LocalType getLocal();
    
    /**
     * True if has "local" element
     */
    boolean isSetLocal();
    
    /**
     * Sets the "local" element
     */
    void setLocal(com.sun.java.xml.ns.j2Ee.LocalType local);
    
    /**
     * Appends and returns a new empty "local" element
     */
    com.sun.java.xml.ns.j2Ee.LocalType addNewLocal();
    
    /**
     * Unsets the "local" element
     */
    void unsetLocal();
    
    /**
     * Gets the "ejb-class" element
     */
    com.sun.java.xml.ns.j2Ee.EjbClassType getEjbClass();
    
    /**
     * Sets the "ejb-class" element
     */
    void setEjbClass(com.sun.java.xml.ns.j2Ee.EjbClassType ejbClass);
    
    /**
     * Appends and returns a new empty "ejb-class" element
     */
    com.sun.java.xml.ns.j2Ee.EjbClassType addNewEjbClass();
    
    /**
     * Gets the "persistence-type" element
     */
    com.sun.java.xml.ns.j2Ee.PersistenceTypeType getPersistenceType();
    
    /**
     * Sets the "persistence-type" element
     */
    void setPersistenceType(com.sun.java.xml.ns.j2Ee.PersistenceTypeType persistenceType);
    
    /**
     * Appends and returns a new empty "persistence-type" element
     */
    com.sun.java.xml.ns.j2Ee.PersistenceTypeType addNewPersistenceType();
    
    /**
     * Gets the "prim-key-class" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getPrimKeyClass();
    
    /**
     * Sets the "prim-key-class" element
     */
    void setPrimKeyClass(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType primKeyClass);
    
    /**
     * Appends and returns a new empty "prim-key-class" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewPrimKeyClass();
    
    /**
     * Gets the "reentrant" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType getReentrant();
    
    /**
     * Sets the "reentrant" element
     */
    void setReentrant(com.sun.java.xml.ns.j2Ee.TrueFalseType reentrant);
    
    /**
     * Appends and returns a new empty "reentrant" element
     */
    com.sun.java.xml.ns.j2Ee.TrueFalseType addNewReentrant();
    
    /**
     * Gets the "cmp-version" element
     */
    com.sun.java.xml.ns.j2Ee.CmpVersionType getCmpVersion();
    
    /**
     * True if has "cmp-version" element
     */
    boolean isSetCmpVersion();
    
    /**
     * Sets the "cmp-version" element
     */
    void setCmpVersion(com.sun.java.xml.ns.j2Ee.CmpVersionType cmpVersion);
    
    /**
     * Appends and returns a new empty "cmp-version" element
     */
    com.sun.java.xml.ns.j2Ee.CmpVersionType addNewCmpVersion();
    
    /**
     * Unsets the "cmp-version" element
     */
    void unsetCmpVersion();
    
    /**
     * Gets the "abstract-schema-name" element
     */
    com.sun.java.xml.ns.j2Ee.JavaIdentifierType getAbstractSchemaName();
    
    /**
     * True if has "abstract-schema-name" element
     */
    boolean isSetAbstractSchemaName();
    
    /**
     * Sets the "abstract-schema-name" element
     */
    void setAbstractSchemaName(com.sun.java.xml.ns.j2Ee.JavaIdentifierType abstractSchemaName);
    
    /**
     * Appends and returns a new empty "abstract-schema-name" element
     */
    com.sun.java.xml.ns.j2Ee.JavaIdentifierType addNewAbstractSchemaName();
    
    /**
     * Unsets the "abstract-schema-name" element
     */
    void unsetAbstractSchemaName();
    
    /**
     * Gets a List of "cmp-field" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.CmpFieldType> getCmpFieldList();
    
    /**
     * Gets array of all "cmp-field" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.CmpFieldType[] getCmpFieldArray();
    
    /**
     * Gets ith "cmp-field" element
     */
    com.sun.java.xml.ns.j2Ee.CmpFieldType getCmpFieldArray(int i);
    
    /**
     * Returns number of "cmp-field" element
     */
    int sizeOfCmpFieldArray();
    
    /**
     * Sets array of all "cmp-field" element
     */
    void setCmpFieldArray(com.sun.java.xml.ns.j2Ee.CmpFieldType[] cmpFieldArray);
    
    /**
     * Sets ith "cmp-field" element
     */
    void setCmpFieldArray(int i, com.sun.java.xml.ns.j2Ee.CmpFieldType cmpField);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cmp-field" element
     */
    com.sun.java.xml.ns.j2Ee.CmpFieldType insertNewCmpField(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cmp-field" element
     */
    com.sun.java.xml.ns.j2Ee.CmpFieldType addNewCmpField();
    
    /**
     * Removes the ith "cmp-field" element
     */
    void removeCmpField(int i);
    
    /**
     * Gets the "primkey-field" element
     */
    com.sun.java.xml.ns.j2Ee.String getPrimkeyField();
    
    /**
     * True if has "primkey-field" element
     */
    boolean isSetPrimkeyField();
    
    /**
     * Sets the "primkey-field" element
     */
    void setPrimkeyField(com.sun.java.xml.ns.j2Ee.String primkeyField);
    
    /**
     * Appends and returns a new empty "primkey-field" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewPrimkeyField();
    
    /**
     * Unsets the "primkey-field" element
     */
    void unsetPrimkeyField();
    
    /**
     * Gets a List of "env-entry" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EnvEntryType> getEnvEntryList();
    
    /**
     * Gets array of all "env-entry" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType[] getEnvEntryArray();
    
    /**
     * Gets ith "env-entry" element
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType getEnvEntryArray(int i);
    
    /**
     * Returns number of "env-entry" element
     */
    int sizeOfEnvEntryArray();
    
    /**
     * Sets array of all "env-entry" element
     */
    void setEnvEntryArray(com.sun.java.xml.ns.j2Ee.EnvEntryType[] envEntryArray);
    
    /**
     * Sets ith "env-entry" element
     */
    void setEnvEntryArray(int i, com.sun.java.xml.ns.j2Ee.EnvEntryType envEntry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "env-entry" element
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType insertNewEnvEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "env-entry" element
     */
    com.sun.java.xml.ns.j2Ee.EnvEntryType addNewEnvEntry();
    
    /**
     * Removes the ith "env-entry" element
     */
    void removeEnvEntry(int i);
    
    /**
     * Gets a List of "ejb-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EjbRefType> getEjbRefList();
    
    /**
     * Gets array of all "ejb-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType[] getEjbRefArray();
    
    /**
     * Gets ith "ejb-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType getEjbRefArray(int i);
    
    /**
     * Returns number of "ejb-ref" element
     */
    int sizeOfEjbRefArray();
    
    /**
     * Sets array of all "ejb-ref" element
     */
    void setEjbRefArray(com.sun.java.xml.ns.j2Ee.EjbRefType[] ejbRefArray);
    
    /**
     * Sets ith "ejb-ref" element
     */
    void setEjbRefArray(int i, com.sun.java.xml.ns.j2Ee.EjbRefType ejbRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType insertNewEjbRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbRefType addNewEjbRef();
    
    /**
     * Removes the ith "ejb-ref" element
     */
    void removeEjbRef(int i);
    
    /**
     * Gets a List of "ejb-local-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EjbLocalRefType> getEjbLocalRefList();
    
    /**
     * Gets array of all "ejb-local-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType[] getEjbLocalRefArray();
    
    /**
     * Gets ith "ejb-local-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType getEjbLocalRefArray(int i);
    
    /**
     * Returns number of "ejb-local-ref" element
     */
    int sizeOfEjbLocalRefArray();
    
    /**
     * Sets array of all "ejb-local-ref" element
     */
    void setEjbLocalRefArray(com.sun.java.xml.ns.j2Ee.EjbLocalRefType[] ejbLocalRefArray);
    
    /**
     * Sets ith "ejb-local-ref" element
     */
    void setEjbLocalRefArray(int i, com.sun.java.xml.ns.j2Ee.EjbLocalRefType ejbLocalRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ejb-local-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType insertNewEjbLocalRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ejb-local-ref" element
     */
    com.sun.java.xml.ns.j2Ee.EjbLocalRefType addNewEjbLocalRef();
    
    /**
     * Removes the ith "ejb-local-ref" element
     */
    void removeEjbLocalRef(int i);
    
    /**
     * Gets a List of "service-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServiceRefType> getServiceRefList();
    
    /**
     * Gets array of all "service-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType[] getServiceRefArray();
    
    /**
     * Gets ith "service-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType getServiceRefArray(int i);
    
    /**
     * Returns number of "service-ref" element
     */
    int sizeOfServiceRefArray();
    
    /**
     * Sets array of all "service-ref" element
     */
    void setServiceRefArray(com.sun.java.xml.ns.j2Ee.ServiceRefType[] serviceRefArray);
    
    /**
     * Sets ith "service-ref" element
     */
    void setServiceRefArray(int i, com.sun.java.xml.ns.j2Ee.ServiceRefType serviceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType insertNewServiceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefType addNewServiceRef();
    
    /**
     * Removes the ith "service-ref" element
     */
    void removeServiceRef(int i);
    
    /**
     * Gets a List of "resource-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ResourceRefType> getResourceRefList();
    
    /**
     * Gets array of all "resource-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType[] getResourceRefArray();
    
    /**
     * Gets ith "resource-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType getResourceRefArray(int i);
    
    /**
     * Returns number of "resource-ref" element
     */
    int sizeOfResourceRefArray();
    
    /**
     * Sets array of all "resource-ref" element
     */
    void setResourceRefArray(com.sun.java.xml.ns.j2Ee.ResourceRefType[] resourceRefArray);
    
    /**
     * Sets ith "resource-ref" element
     */
    void setResourceRefArray(int i, com.sun.java.xml.ns.j2Ee.ResourceRefType resourceRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType insertNewResourceRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceRefType addNewResourceRef();
    
    /**
     * Removes the ith "resource-ref" element
     */
    void removeResourceRef(int i);
    
    /**
     * Gets a List of "resource-env-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ResourceEnvRefType> getResourceEnvRefList();
    
    /**
     * Gets array of all "resource-env-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[] getResourceEnvRefArray();
    
    /**
     * Gets ith "resource-env-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType getResourceEnvRefArray(int i);
    
    /**
     * Returns number of "resource-env-ref" element
     */
    int sizeOfResourceEnvRefArray();
    
    /**
     * Sets array of all "resource-env-ref" element
     */
    void setResourceEnvRefArray(com.sun.java.xml.ns.j2Ee.ResourceEnvRefType[] resourceEnvRefArray);
    
    /**
     * Sets ith "resource-env-ref" element
     */
    void setResourceEnvRefArray(int i, com.sun.java.xml.ns.j2Ee.ResourceEnvRefType resourceEnvRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource-env-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType insertNewResourceEnvRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource-env-ref" element
     */
    com.sun.java.xml.ns.j2Ee.ResourceEnvRefType addNewResourceEnvRef();
    
    /**
     * Removes the ith "resource-env-ref" element
     */
    void removeResourceEnvRef(int i);
    
    /**
     * Gets a List of "message-destination-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationRefType> getMessageDestinationRefList();
    
    /**
     * Gets array of all "message-destination-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[] getMessageDestinationRefArray();
    
    /**
     * Gets ith "message-destination-ref" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType getMessageDestinationRefArray(int i);
    
    /**
     * Returns number of "message-destination-ref" element
     */
    int sizeOfMessageDestinationRefArray();
    
    /**
     * Sets array of all "message-destination-ref" element
     */
    void setMessageDestinationRefArray(com.sun.java.xml.ns.j2Ee.MessageDestinationRefType[] messageDestinationRefArray);
    
    /**
     * Sets ith "message-destination-ref" element
     */
    void setMessageDestinationRefArray(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationRefType messageDestinationRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination-ref" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType insertNewMessageDestinationRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination-ref" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationRefType addNewMessageDestinationRef();
    
    /**
     * Removes the ith "message-destination-ref" element
     */
    void removeMessageDestinationRef(int i);
    
    /**
     * Gets a List of "security-role-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleRefType> getSecurityRoleRefList();
    
    /**
     * Gets array of all "security-role-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleRefType[] getSecurityRoleRefArray();
    
    /**
     * Gets ith "security-role-ref" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleRefType getSecurityRoleRefArray(int i);
    
    /**
     * Returns number of "security-role-ref" element
     */
    int sizeOfSecurityRoleRefArray();
    
    /**
     * Sets array of all "security-role-ref" element
     */
    void setSecurityRoleRefArray(com.sun.java.xml.ns.j2Ee.SecurityRoleRefType[] securityRoleRefArray);
    
    /**
     * Sets ith "security-role-ref" element
     */
    void setSecurityRoleRefArray(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleRefType securityRoleRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-role-ref" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleRefType insertNewSecurityRoleRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-role-ref" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleRefType addNewSecurityRoleRef();
    
    /**
     * Removes the ith "security-role-ref" element
     */
    void removeSecurityRoleRef(int i);
    
    /**
     * Gets the "security-identity" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityIdentityType getSecurityIdentity();
    
    /**
     * True if has "security-identity" element
     */
    boolean isSetSecurityIdentity();
    
    /**
     * Sets the "security-identity" element
     */
    void setSecurityIdentity(com.sun.java.xml.ns.j2Ee.SecurityIdentityType securityIdentity);
    
    /**
     * Appends and returns a new empty "security-identity" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityIdentityType addNewSecurityIdentity();
    
    /**
     * Unsets the "security-identity" element
     */
    void unsetSecurityIdentity();
    
    /**
     * Gets a List of "query" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.QueryType> getQueryList();
    
    /**
     * Gets array of all "query" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.QueryType[] getQueryArray();
    
    /**
     * Gets ith "query" element
     */
    com.sun.java.xml.ns.j2Ee.QueryType getQueryArray(int i);
    
    /**
     * Returns number of "query" element
     */
    int sizeOfQueryArray();
    
    /**
     * Sets array of all "query" element
     */
    void setQueryArray(com.sun.java.xml.ns.j2Ee.QueryType[] queryArray);
    
    /**
     * Sets ith "query" element
     */
    void setQueryArray(int i, com.sun.java.xml.ns.j2Ee.QueryType query);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    com.sun.java.xml.ns.j2Ee.QueryType insertNewQuery(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    com.sun.java.xml.ns.j2Ee.QueryType addNewQuery();
    
    /**
     * Removes the ith "query" element
     */
    void removeQuery(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EntityBeanType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EntityBeanType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
