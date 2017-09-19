/*
 * XML Type:  Project
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ProjectConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML Project(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface ProjectConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProjectConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("project7289type");
    
    /**
     * Gets a List of "interface" elements
     */
    java.util.List<com.eviware.soapui.config.InterfaceConfig> getInterfaceList();
    
    /**
     * Gets array of all "interface" elements
     * @deprecated
     */
    com.eviware.soapui.config.InterfaceConfig[] getInterfaceArray();
    
    /**
     * Gets ith "interface" element
     */
    com.eviware.soapui.config.InterfaceConfig getInterfaceArray(int i);
    
    /**
     * Returns number of "interface" element
     */
    int sizeOfInterfaceArray();
    
    /**
     * Sets array of all "interface" element
     */
    void setInterfaceArray(com.eviware.soapui.config.InterfaceConfig[] xinterfaceArray);
    
    /**
     * Sets ith "interface" element
     */
    void setInterfaceArray(int i, com.eviware.soapui.config.InterfaceConfig xinterface);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    com.eviware.soapui.config.InterfaceConfig insertNewInterface(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    com.eviware.soapui.config.InterfaceConfig addNewInterface();
    
    /**
     * Removes the ith "interface" element
     */
    void removeInterface(int i);
    
    /**
     * Gets a List of "testSuite" elements
     */
    java.util.List<com.eviware.soapui.config.TestSuiteConfig> getTestSuiteList();
    
    /**
     * Gets array of all "testSuite" elements
     * @deprecated
     */
    com.eviware.soapui.config.TestSuiteConfig[] getTestSuiteArray();
    
    /**
     * Gets ith "testSuite" element
     */
    com.eviware.soapui.config.TestSuiteConfig getTestSuiteArray(int i);
    
    /**
     * Returns number of "testSuite" element
     */
    int sizeOfTestSuiteArray();
    
    /**
     * Sets array of all "testSuite" element
     */
    void setTestSuiteArray(com.eviware.soapui.config.TestSuiteConfig[] testSuiteArray);
    
    /**
     * Sets ith "testSuite" element
     */
    void setTestSuiteArray(int i, com.eviware.soapui.config.TestSuiteConfig testSuite);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testSuite" element
     */
    com.eviware.soapui.config.TestSuiteConfig insertNewTestSuite(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testSuite" element
     */
    com.eviware.soapui.config.TestSuiteConfig addNewTestSuite();
    
    /**
     * Removes the ith "testSuite" element
     */
    void removeTestSuite(int i);
    
    /**
     * Gets a List of "mockService" elements
     */
    java.util.List<com.eviware.soapui.config.MockServiceConfig> getMockServiceList();
    
    /**
     * Gets array of all "mockService" elements
     * @deprecated
     */
    com.eviware.soapui.config.MockServiceConfig[] getMockServiceArray();
    
    /**
     * Gets ith "mockService" element
     */
    com.eviware.soapui.config.MockServiceConfig getMockServiceArray(int i);
    
    /**
     * Returns number of "mockService" element
     */
    int sizeOfMockServiceArray();
    
    /**
     * Sets array of all "mockService" element
     */
    void setMockServiceArray(com.eviware.soapui.config.MockServiceConfig[] mockServiceArray);
    
    /**
     * Sets ith "mockService" element
     */
    void setMockServiceArray(int i, com.eviware.soapui.config.MockServiceConfig mockService);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mockService" element
     */
    com.eviware.soapui.config.MockServiceConfig insertNewMockService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mockService" element
     */
    com.eviware.soapui.config.MockServiceConfig addNewMockService();
    
    /**
     * Removes the ith "mockService" element
     */
    void removeMockService(int i);
    
    /**
     * Gets a List of "restMockService" elements
     */
    java.util.List<com.eviware.soapui.config.RESTMockServiceConfig> getRestMockServiceList();
    
    /**
     * Gets array of all "restMockService" elements
     * @deprecated
     */
    com.eviware.soapui.config.RESTMockServiceConfig[] getRestMockServiceArray();
    
    /**
     * Gets ith "restMockService" element
     */
    com.eviware.soapui.config.RESTMockServiceConfig getRestMockServiceArray(int i);
    
    /**
     * Returns number of "restMockService" element
     */
    int sizeOfRestMockServiceArray();
    
    /**
     * Sets array of all "restMockService" element
     */
    void setRestMockServiceArray(com.eviware.soapui.config.RESTMockServiceConfig[] restMockServiceArray);
    
    /**
     * Sets ith "restMockService" element
     */
    void setRestMockServiceArray(int i, com.eviware.soapui.config.RESTMockServiceConfig restMockService);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "restMockService" element
     */
    com.eviware.soapui.config.RESTMockServiceConfig insertNewRestMockService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "restMockService" element
     */
    com.eviware.soapui.config.RESTMockServiceConfig addNewRestMockService();
    
    /**
     * Removes the ith "restMockService" element
     */
    void removeRestMockService(int i);
    
    /**
     * Gets the "endpointStrategy" element
     */
    com.eviware.soapui.config.EndpointStrategyConfig getEndpointStrategy();
    
    /**
     * True if has "endpointStrategy" element
     */
    boolean isSetEndpointStrategy();
    
    /**
     * Sets the "endpointStrategy" element
     */
    void setEndpointStrategy(com.eviware.soapui.config.EndpointStrategyConfig endpointStrategy);
    
    /**
     * Appends and returns a new empty "endpointStrategy" element
     */
    com.eviware.soapui.config.EndpointStrategyConfig addNewEndpointStrategy();
    
    /**
     * Unsets the "endpointStrategy" element
     */
    void unsetEndpointStrategy();
    
    /**
     * Gets the "requirements" element
     */
    com.eviware.soapui.config.RequirementsTypeConfig getRequirements();
    
    /**
     * True if has "requirements" element
     */
    boolean isSetRequirements();
    
    /**
     * Sets the "requirements" element
     */
    void setRequirements(com.eviware.soapui.config.RequirementsTypeConfig requirements);
    
    /**
     * Appends and returns a new empty "requirements" element
     */
    com.eviware.soapui.config.RequirementsTypeConfig addNewRequirements();
    
    /**
     * Unsets the "requirements" element
     */
    void unsetRequirements();
    
    /**
     * Gets the "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig getProperties();
    
    /**
     * True if has "properties" element
     */
    boolean isSetProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig addNewProperties();
    
    /**
     * Unsets the "properties" element
     */
    void unsetProperties();
    
    /**
     * Gets the "afterLoadScript" element
     */
    com.eviware.soapui.config.ScriptConfig getAfterLoadScript();
    
    /**
     * True if has "afterLoadScript" element
     */
    boolean isSetAfterLoadScript();
    
    /**
     * Sets the "afterLoadScript" element
     */
    void setAfterLoadScript(com.eviware.soapui.config.ScriptConfig afterLoadScript);
    
    /**
     * Appends and returns a new empty "afterLoadScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewAfterLoadScript();
    
    /**
     * Unsets the "afterLoadScript" element
     */
    void unsetAfterLoadScript();
    
    /**
     * Gets the "beforeSaveScript" element
     */
    com.eviware.soapui.config.ScriptConfig getBeforeSaveScript();
    
    /**
     * True if has "beforeSaveScript" element
     */
    boolean isSetBeforeSaveScript();
    
    /**
     * Sets the "beforeSaveScript" element
     */
    void setBeforeSaveScript(com.eviware.soapui.config.ScriptConfig beforeSaveScript);
    
    /**
     * Appends and returns a new empty "beforeSaveScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewBeforeSaveScript();
    
    /**
     * Unsets the "beforeSaveScript" element
     */
    void unsetBeforeSaveScript();
    
    /**
     * Gets the "encryptedContent" element
     */
    byte[] getEncryptedContent();
    
    /**
     * Gets (as xml) the "encryptedContent" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetEncryptedContent();
    
    /**
     * True if has "encryptedContent" element
     */
    boolean isSetEncryptedContent();
    
    /**
     * Sets the "encryptedContent" element
     */
    void setEncryptedContent(byte[] encryptedContent);
    
    /**
     * Sets (as xml) the "encryptedContent" element
     */
    void xsetEncryptedContent(org.apache.xmlbeans.XmlBase64Binary encryptedContent);
    
    /**
     * Unsets the "encryptedContent" element
     */
    void unsetEncryptedContent();
    
    /**
     * Gets the "encryptedContentAlgorithm" element
     */
    java.lang.String getEncryptedContentAlgorithm();
    
    /**
     * Gets (as xml) the "encryptedContentAlgorithm" element
     */
    org.apache.xmlbeans.XmlString xgetEncryptedContentAlgorithm();
    
    /**
     * True if has "encryptedContentAlgorithm" element
     */
    boolean isSetEncryptedContentAlgorithm();
    
    /**
     * Sets the "encryptedContentAlgorithm" element
     */
    void setEncryptedContentAlgorithm(java.lang.String encryptedContentAlgorithm);
    
    /**
     * Sets (as xml) the "encryptedContentAlgorithm" element
     */
    void xsetEncryptedContentAlgorithm(org.apache.xmlbeans.XmlString encryptedContentAlgorithm);
    
    /**
     * Unsets the "encryptedContentAlgorithm" element
     */
    void unsetEncryptedContentAlgorithm();
    
    /**
     * Gets the "wssContainer" element
     */
    com.eviware.soapui.config.WssContainerConfig getWssContainer();
    
    /**
     * True if has "wssContainer" element
     */
    boolean isSetWssContainer();
    
    /**
     * Sets the "wssContainer" element
     */
    void setWssContainer(com.eviware.soapui.config.WssContainerConfig wssContainer);
    
    /**
     * Appends and returns a new empty "wssContainer" element
     */
    com.eviware.soapui.config.WssContainerConfig addNewWssContainer();
    
    /**
     * Unsets the "wssContainer" element
     */
    void unsetWssContainer();
    
    /**
     * Gets the "databaseConnectionContainer" element
     */
    com.eviware.soapui.config.DatabaseConnectionContainerConfig getDatabaseConnectionContainer();
    
    /**
     * True if has "databaseConnectionContainer" element
     */
    boolean isSetDatabaseConnectionContainer();
    
    /**
     * Sets the "databaseConnectionContainer" element
     */
    void setDatabaseConnectionContainer(com.eviware.soapui.config.DatabaseConnectionContainerConfig databaseConnectionContainer);
    
    /**
     * Appends and returns a new empty "databaseConnectionContainer" element
     */
    com.eviware.soapui.config.DatabaseConnectionContainerConfig addNewDatabaseConnectionContainer();
    
    /**
     * Unsets the "databaseConnectionContainer" element
     */
    void unsetDatabaseConnectionContainer();
    
    /**
     * Gets the "oAuth2ProfileContainer" element
     */
    com.eviware.soapui.config.OAuth2ProfileContainerConfig getOAuth2ProfileContainer();
    
    /**
     * True if has "oAuth2ProfileContainer" element
     */
    boolean isSetOAuth2ProfileContainer();
    
    /**
     * Sets the "oAuth2ProfileContainer" element
     */
    void setOAuth2ProfileContainer(com.eviware.soapui.config.OAuth2ProfileContainerConfig oAuth2ProfileContainer);
    
    /**
     * Appends and returns a new empty "oAuth2ProfileContainer" element
     */
    com.eviware.soapui.config.OAuth2ProfileContainerConfig addNewOAuth2ProfileContainer();
    
    /**
     * Unsets the "oAuth2ProfileContainer" element
     */
    void unsetOAuth2ProfileContainer();
    
    /**
     * Gets the "oAuth1ProfileContainer" element
     */
    com.eviware.soapui.config.OAuth1ProfileContainerConfig getOAuth1ProfileContainer();
    
    /**
     * True if has "oAuth1ProfileContainer" element
     */
    boolean isSetOAuth1ProfileContainer();
    
    /**
     * Sets the "oAuth1ProfileContainer" element
     */
    void setOAuth1ProfileContainer(com.eviware.soapui.config.OAuth1ProfileContainerConfig oAuth1ProfileContainer);
    
    /**
     * Appends and returns a new empty "oAuth1ProfileContainer" element
     */
    com.eviware.soapui.config.OAuth1ProfileContainerConfig addNewOAuth1ProfileContainer();
    
    /**
     * Unsets the "oAuth1ProfileContainer" element
     */
    void unsetOAuth1ProfileContainer();
    
    /**
     * Gets the "reporting" element
     */
    com.eviware.soapui.config.ReportingTypeConfig getReporting();
    
    /**
     * True if has "reporting" element
     */
    boolean isSetReporting();
    
    /**
     * Sets the "reporting" element
     */
    void setReporting(com.eviware.soapui.config.ReportingTypeConfig reporting);
    
    /**
     * Appends and returns a new empty "reporting" element
     */
    com.eviware.soapui.config.ReportingTypeConfig addNewReporting();
    
    /**
     * Unsets the "reporting" element
     */
    void unsetReporting();
    
    /**
     * Gets the "reportScript" element
     */
    com.eviware.soapui.config.ScriptConfig getReportScript();
    
    /**
     * True if has "reportScript" element
     */
    boolean isSetReportScript();
    
    /**
     * Sets the "reportScript" element
     */
    void setReportScript(com.eviware.soapui.config.ScriptConfig reportScript);
    
    /**
     * Appends and returns a new empty "reportScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewReportScript();
    
    /**
     * Unsets the "reportScript" element
     */
    void unsetReportScript();
    
    /**
     * Gets the "beforeRunScript" element
     */
    com.eviware.soapui.config.ScriptConfig getBeforeRunScript();
    
    /**
     * True if has "beforeRunScript" element
     */
    boolean isSetBeforeRunScript();
    
    /**
     * Sets the "beforeRunScript" element
     */
    void setBeforeRunScript(com.eviware.soapui.config.ScriptConfig beforeRunScript);
    
    /**
     * Appends and returns a new empty "beforeRunScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewBeforeRunScript();
    
    /**
     * Unsets the "beforeRunScript" element
     */
    void unsetBeforeRunScript();
    
    /**
     * Gets the "afterRunScript" element
     */
    com.eviware.soapui.config.ScriptConfig getAfterRunScript();
    
    /**
     * True if has "afterRunScript" element
     */
    boolean isSetAfterRunScript();
    
    /**
     * Sets the "afterRunScript" element
     */
    void setAfterRunScript(com.eviware.soapui.config.ScriptConfig afterRunScript);
    
    /**
     * Appends and returns a new empty "afterRunScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewAfterRunScript();
    
    /**
     * Unsets the "afterRunScript" element
     */
    void unsetAfterRunScript();
    
    /**
     * Gets a List of "eventHandlers" elements
     */
    java.util.List<com.eviware.soapui.config.EventHandlerTypeConfig> getEventHandlersList();
    
    /**
     * Gets array of all "eventHandlers" elements
     * @deprecated
     */
    com.eviware.soapui.config.EventHandlerTypeConfig[] getEventHandlersArray();
    
    /**
     * Gets ith "eventHandlers" element
     */
    com.eviware.soapui.config.EventHandlerTypeConfig getEventHandlersArray(int i);
    
    /**
     * Returns number of "eventHandlers" element
     */
    int sizeOfEventHandlersArray();
    
    /**
     * Sets array of all "eventHandlers" element
     */
    void setEventHandlersArray(com.eviware.soapui.config.EventHandlerTypeConfig[] eventHandlersArray);
    
    /**
     * Sets ith "eventHandlers" element
     */
    void setEventHandlersArray(int i, com.eviware.soapui.config.EventHandlerTypeConfig eventHandlers);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventHandlers" element
     */
    com.eviware.soapui.config.EventHandlerTypeConfig insertNewEventHandlers(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventHandlers" element
     */
    com.eviware.soapui.config.EventHandlerTypeConfig addNewEventHandlers();
    
    /**
     * Removes the ith "eventHandlers" element
     */
    void removeEventHandlers(int i);
    
    /**
     * Gets the "sensitiveInformation" element
     */
    com.eviware.soapui.config.SensitiveInformationConfig getSensitiveInformation();
    
    /**
     * True if has "sensitiveInformation" element
     */
    boolean isSetSensitiveInformation();
    
    /**
     * Sets the "sensitiveInformation" element
     */
    void setSensitiveInformation(com.eviware.soapui.config.SensitiveInformationConfig sensitiveInformation);
    
    /**
     * Appends and returns a new empty "sensitiveInformation" element
     */
    com.eviware.soapui.config.SensitiveInformationConfig addNewSensitiveInformation();
    
    /**
     * Unsets the "sensitiveInformation" element
     */
    void unsetSensitiveInformation();
    
    /**
     * Gets a List of "environment" elements
     */
    java.util.List<com.eviware.soapui.config.EnvironmentConfig> getEnvironmentList();
    
    /**
     * Gets array of all "environment" elements
     * @deprecated
     */
    com.eviware.soapui.config.EnvironmentConfig[] getEnvironmentArray();
    
    /**
     * Gets ith "environment" element
     */
    com.eviware.soapui.config.EnvironmentConfig getEnvironmentArray(int i);
    
    /**
     * Returns number of "environment" element
     */
    int sizeOfEnvironmentArray();
    
    /**
     * Sets array of all "environment" element
     */
    void setEnvironmentArray(com.eviware.soapui.config.EnvironmentConfig[] environmentArray);
    
    /**
     * Sets ith "environment" element
     */
    void setEnvironmentArray(int i, com.eviware.soapui.config.EnvironmentConfig environment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "environment" element
     */
    com.eviware.soapui.config.EnvironmentConfig insertNewEnvironment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "environment" element
     */
    com.eviware.soapui.config.EnvironmentConfig addNewEnvironment();
    
    /**
     * Removes the ith "environment" element
     */
    void removeEnvironment(int i);
    
    /**
     * Gets the "soapui-version" attribute
     */
    java.lang.String getSoapuiVersion();
    
    /**
     * Gets (as xml) the "soapui-version" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoapuiVersion();
    
    /**
     * True if has "soapui-version" attribute
     */
    boolean isSetSoapuiVersion();
    
    /**
     * Sets the "soapui-version" attribute
     */
    void setSoapuiVersion(java.lang.String soapuiVersion);
    
    /**
     * Sets (as xml) the "soapui-version" attribute
     */
    void xsetSoapuiVersion(org.apache.xmlbeans.XmlString soapuiVersion);
    
    /**
     * Unsets the "soapui-version" attribute
     */
    void unsetSoapuiVersion();
    
    /**
     * Gets the "resourceRoot" attribute
     */
    java.lang.String getResourceRoot();
    
    /**
     * Gets (as xml) the "resourceRoot" attribute
     */
    org.apache.xmlbeans.XmlString xgetResourceRoot();
    
    /**
     * True if has "resourceRoot" attribute
     */
    boolean isSetResourceRoot();
    
    /**
     * Sets the "resourceRoot" attribute
     */
    void setResourceRoot(java.lang.String resourceRoot);
    
    /**
     * Sets (as xml) the "resourceRoot" attribute
     */
    void xsetResourceRoot(org.apache.xmlbeans.XmlString resourceRoot);
    
    /**
     * Unsets the "resourceRoot" attribute
     */
    void unsetResourceRoot();
    
    /**
     * Gets the "defaultScriptLanguage" attribute
     */
    java.lang.String getDefaultScriptLanguage();
    
    /**
     * Gets (as xml) the "defaultScriptLanguage" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefaultScriptLanguage();
    
    /**
     * True if has "defaultScriptLanguage" attribute
     */
    boolean isSetDefaultScriptLanguage();
    
    /**
     * Sets the "defaultScriptLanguage" attribute
     */
    void setDefaultScriptLanguage(java.lang.String defaultScriptLanguage);
    
    /**
     * Sets (as xml) the "defaultScriptLanguage" attribute
     */
    void xsetDefaultScriptLanguage(org.apache.xmlbeans.XmlString defaultScriptLanguage);
    
    /**
     * Unsets the "defaultScriptLanguage" attribute
     */
    void unsetDefaultScriptLanguage();
    
    /**
     * Gets the "abortOnError" attribute
     */
    boolean getAbortOnError();
    
    /**
     * Gets (as xml) the "abortOnError" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAbortOnError();
    
    /**
     * True if has "abortOnError" attribute
     */
    boolean isSetAbortOnError();
    
    /**
     * Sets the "abortOnError" attribute
     */
    void setAbortOnError(boolean abortOnError);
    
    /**
     * Sets (as xml) the "abortOnError" attribute
     */
    void xsetAbortOnError(org.apache.xmlbeans.XmlBoolean abortOnError);
    
    /**
     * Unsets the "abortOnError" attribute
     */
    void unsetAbortOnError();
    
    /**
     * Gets the "timeout" attribute
     */
    long getTimeout();
    
    /**
     * Gets (as xml) the "timeout" attribute
     */
    org.apache.xmlbeans.XmlLong xgetTimeout();
    
    /**
     * True if has "timeout" attribute
     */
    boolean isSetTimeout();
    
    /**
     * Sets the "timeout" attribute
     */
    void setTimeout(long timeout);
    
    /**
     * Sets (as xml) the "timeout" attribute
     */
    void xsetTimeout(org.apache.xmlbeans.XmlLong timeout);
    
    /**
     * Unsets the "timeout" attribute
     */
    void unsetTimeout();
    
    /**
     * Gets the "runType" attribute
     */
    com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum getRunType();
    
    /**
     * Gets (as xml) the "runType" attribute
     */
    com.eviware.soapui.config.TestSuiteRunTypesConfig xgetRunType();
    
    /**
     * True if has "runType" attribute
     */
    boolean isSetRunType();
    
    /**
     * Sets the "runType" attribute
     */
    void setRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum runType);
    
    /**
     * Sets (as xml) the "runType" attribute
     */
    void xsetRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig runType);
    
    /**
     * Unsets the "runType" attribute
     */
    void unsetRunType();
    
    /**
     * Gets the "scriptLibrary" attribute
     */
    java.lang.String getScriptLibrary();
    
    /**
     * Gets (as xml) the "scriptLibrary" attribute
     */
    org.apache.xmlbeans.XmlString xgetScriptLibrary();
    
    /**
     * True if has "scriptLibrary" attribute
     */
    boolean isSetScriptLibrary();
    
    /**
     * Sets the "scriptLibrary" attribute
     */
    void setScriptLibrary(java.lang.String scriptLibrary);
    
    /**
     * Sets (as xml) the "scriptLibrary" attribute
     */
    void xsetScriptLibrary(org.apache.xmlbeans.XmlString scriptLibrary);
    
    /**
     * Unsets the "scriptLibrary" attribute
     */
    void unsetScriptLibrary();
    
    /**
     * Gets the "activeEnvironment" attribute
     */
    java.lang.String getActiveEnvironment();
    
    /**
     * Gets (as xml) the "activeEnvironment" attribute
     */
    org.apache.xmlbeans.XmlString xgetActiveEnvironment();
    
    /**
     * True if has "activeEnvironment" attribute
     */
    boolean isSetActiveEnvironment();
    
    /**
     * Sets the "activeEnvironment" attribute
     */
    void setActiveEnvironment(java.lang.String activeEnvironment);
    
    /**
     * Sets (as xml) the "activeEnvironment" attribute
     */
    void xsetActiveEnvironment(org.apache.xmlbeans.XmlString activeEnvironment);
    
    /**
     * Unsets the "activeEnvironment" attribute
     */
    void unsetActiveEnvironment();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.ProjectConfig newInstance() {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.ProjectConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.ProjectConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.ProjectConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ProjectConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ProjectConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
