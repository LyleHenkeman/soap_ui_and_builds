/*
 * XML Type:  TestCase
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestCaseConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML TestCase(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface TestCaseConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestCaseConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testcase0deetype");
    
    /**
     * Gets a List of "testStep" elements
     */
    java.util.List<com.eviware.soapui.config.TestStepConfig> getTestStepList();
    
    /**
     * Gets array of all "testStep" elements
     * @deprecated
     */
    com.eviware.soapui.config.TestStepConfig[] getTestStepArray();
    
    /**
     * Gets ith "testStep" element
     */
    com.eviware.soapui.config.TestStepConfig getTestStepArray(int i);
    
    /**
     * Returns number of "testStep" element
     */
    int sizeOfTestStepArray();
    
    /**
     * Sets array of all "testStep" element
     */
    void setTestStepArray(com.eviware.soapui.config.TestStepConfig[] testStepArray);
    
    /**
     * Sets ith "testStep" element
     */
    void setTestStepArray(int i, com.eviware.soapui.config.TestStepConfig testStep);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStep" element
     */
    com.eviware.soapui.config.TestStepConfig insertNewTestStep(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStep" element
     */
    com.eviware.soapui.config.TestStepConfig addNewTestStep();
    
    /**
     * Removes the ith "testStep" element
     */
    void removeTestStep(int i);
    
    /**
     * Gets a List of "loadTest" elements
     */
    java.util.List<com.eviware.soapui.config.LoadTestConfig> getLoadTestList();
    
    /**
     * Gets array of all "loadTest" elements
     * @deprecated
     */
    com.eviware.soapui.config.LoadTestConfig[] getLoadTestArray();
    
    /**
     * Gets ith "loadTest" element
     */
    com.eviware.soapui.config.LoadTestConfig getLoadTestArray(int i);
    
    /**
     * Returns number of "loadTest" element
     */
    int sizeOfLoadTestArray();
    
    /**
     * Sets array of all "loadTest" element
     */
    void setLoadTestArray(com.eviware.soapui.config.LoadTestConfig[] loadTestArray);
    
    /**
     * Sets ith "loadTest" element
     */
    void setLoadTestArray(int i, com.eviware.soapui.config.LoadTestConfig loadTest);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "loadTest" element
     */
    com.eviware.soapui.config.LoadTestConfig insertNewLoadTest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "loadTest" element
     */
    com.eviware.soapui.config.LoadTestConfig addNewLoadTest();
    
    /**
     * Removes the ith "loadTest" element
     */
    void removeLoadTest(int i);
    
    /**
     * Gets the "setupScript" element
     */
    com.eviware.soapui.config.ScriptConfig getSetupScript();
    
    /**
     * True if has "setupScript" element
     */
    boolean isSetSetupScript();
    
    /**
     * Sets the "setupScript" element
     */
    void setSetupScript(com.eviware.soapui.config.ScriptConfig setupScript);
    
    /**
     * Appends and returns a new empty "setupScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewSetupScript();
    
    /**
     * Unsets the "setupScript" element
     */
    void unsetSetupScript();
    
    /**
     * Gets the "tearDownScript" element
     */
    com.eviware.soapui.config.ScriptConfig getTearDownScript();
    
    /**
     * True if has "tearDownScript" element
     */
    boolean isSetTearDownScript();
    
    /**
     * Sets the "tearDownScript" element
     */
    void setTearDownScript(com.eviware.soapui.config.ScriptConfig tearDownScript);
    
    /**
     * Appends and returns a new empty "tearDownScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewTearDownScript();
    
    /**
     * Unsets the "tearDownScript" element
     */
    void unsetTearDownScript();
    
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
     * Gets a List of "reportTemplates" elements
     */
    java.util.List<com.eviware.soapui.config.ReportTemplateConfig> getReportTemplatesList();
    
    /**
     * Gets array of all "reportTemplates" elements
     * @deprecated
     */
    com.eviware.soapui.config.ReportTemplateConfig[] getReportTemplatesArray();
    
    /**
     * Gets ith "reportTemplates" element
     */
    com.eviware.soapui.config.ReportTemplateConfig getReportTemplatesArray(int i);
    
    /**
     * Returns number of "reportTemplates" element
     */
    int sizeOfReportTemplatesArray();
    
    /**
     * Sets array of all "reportTemplates" element
     */
    void setReportTemplatesArray(com.eviware.soapui.config.ReportTemplateConfig[] reportTemplatesArray);
    
    /**
     * Sets ith "reportTemplates" element
     */
    void setReportTemplatesArray(int i, com.eviware.soapui.config.ReportTemplateConfig reportTemplates);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reportTemplates" element
     */
    com.eviware.soapui.config.ReportTemplateConfig insertNewReportTemplates(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reportTemplates" element
     */
    com.eviware.soapui.config.ReportTemplateConfig addNewReportTemplates();
    
    /**
     * Removes the ith "reportTemplates" element
     */
    void removeReportTemplates(int i);
    
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
     * Gets the "reportParameters" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig getReportParameters();
    
    /**
     * True if has "reportParameters" element
     */
    boolean isSetReportParameters();
    
    /**
     * Sets the "reportParameters" element
     */
    void setReportParameters(com.eviware.soapui.config.PropertiesTypeConfig reportParameters);
    
    /**
     * Appends and returns a new empty "reportParameters" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig addNewReportParameters();
    
    /**
     * Unsets the "reportParameters" element
     */
    void unsetReportParameters();
    
    /**
     * Gets a List of "securityTest" elements
     */
    java.util.List<com.eviware.soapui.config.SecurityTestConfig> getSecurityTestList();
    
    /**
     * Gets array of all "securityTest" elements
     * @deprecated
     */
    com.eviware.soapui.config.SecurityTestConfig[] getSecurityTestArray();
    
    /**
     * Gets ith "securityTest" element
     */
    com.eviware.soapui.config.SecurityTestConfig getSecurityTestArray(int i);
    
    /**
     * Returns number of "securityTest" element
     */
    int sizeOfSecurityTestArray();
    
    /**
     * Sets array of all "securityTest" element
     */
    void setSecurityTestArray(com.eviware.soapui.config.SecurityTestConfig[] securityTestArray);
    
    /**
     * Sets ith "securityTest" element
     */
    void setSecurityTestArray(int i, com.eviware.soapui.config.SecurityTestConfig securityTest);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "securityTest" element
     */
    com.eviware.soapui.config.SecurityTestConfig insertNewSecurityTest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "securityTest" element
     */
    com.eviware.soapui.config.SecurityTestConfig addNewSecurityTest();
    
    /**
     * Removes the ith "securityTest" element
     */
    void removeSecurityTest(int i);
    
    /**
     * Gets a List of "breakPoints" elements
     */
    java.util.List<com.eviware.soapui.config.BreakPointConfig> getBreakPointsList();
    
    /**
     * Gets array of all "breakPoints" elements
     * @deprecated
     */
    com.eviware.soapui.config.BreakPointConfig[] getBreakPointsArray();
    
    /**
     * Gets ith "breakPoints" element
     */
    com.eviware.soapui.config.BreakPointConfig getBreakPointsArray(int i);
    
    /**
     * Returns number of "breakPoints" element
     */
    int sizeOfBreakPointsArray();
    
    /**
     * Sets array of all "breakPoints" element
     */
    void setBreakPointsArray(com.eviware.soapui.config.BreakPointConfig[] breakPointsArray);
    
    /**
     * Sets ith "breakPoints" element
     */
    void setBreakPointsArray(int i, com.eviware.soapui.config.BreakPointConfig breakPoints);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "breakPoints" element
     */
    com.eviware.soapui.config.BreakPointConfig insertNewBreakPoints(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "breakPoints" element
     */
    com.eviware.soapui.config.BreakPointConfig addNewBreakPoints();
    
    /**
     * Removes the ith "breakPoints" element
     */
    void removeBreakPoints(int i);
    
    /**
     * Gets the "keepSession" attribute
     */
    boolean getKeepSession();
    
    /**
     * Gets (as xml) the "keepSession" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetKeepSession();
    
    /**
     * True if has "keepSession" attribute
     */
    boolean isSetKeepSession();
    
    /**
     * Sets the "keepSession" attribute
     */
    void setKeepSession(boolean keepSession);
    
    /**
     * Sets (as xml) the "keepSession" attribute
     */
    void xsetKeepSession(org.apache.xmlbeans.XmlBoolean keepSession);
    
    /**
     * Unsets the "keepSession" attribute
     */
    void unsetKeepSession();
    
    /**
     * Gets the "failOnError" attribute
     */
    boolean getFailOnError();
    
    /**
     * Gets (as xml) the "failOnError" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFailOnError();
    
    /**
     * True if has "failOnError" attribute
     */
    boolean isSetFailOnError();
    
    /**
     * Sets the "failOnError" attribute
     */
    void setFailOnError(boolean failOnError);
    
    /**
     * Sets (as xml) the "failOnError" attribute
     */
    void xsetFailOnError(org.apache.xmlbeans.XmlBoolean failOnError);
    
    /**
     * Unsets the "failOnError" attribute
     */
    void unsetFailOnError();
    
    /**
     * Gets the "failTestCaseOnErrors" attribute
     */
    boolean getFailTestCaseOnErrors();
    
    /**
     * Gets (as xml) the "failTestCaseOnErrors" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFailTestCaseOnErrors();
    
    /**
     * True if has "failTestCaseOnErrors" attribute
     */
    boolean isSetFailTestCaseOnErrors();
    
    /**
     * Sets the "failTestCaseOnErrors" attribute
     */
    void setFailTestCaseOnErrors(boolean failTestCaseOnErrors);
    
    /**
     * Sets (as xml) the "failTestCaseOnErrors" attribute
     */
    void xsetFailTestCaseOnErrors(org.apache.xmlbeans.XmlBoolean failTestCaseOnErrors);
    
    /**
     * Unsets the "failTestCaseOnErrors" attribute
     */
    void unsetFailTestCaseOnErrors();
    
    /**
     * Gets the "discardOkResults" attribute
     */
    boolean getDiscardOkResults();
    
    /**
     * Gets (as xml) the "discardOkResults" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDiscardOkResults();
    
    /**
     * True if has "discardOkResults" attribute
     */
    boolean isSetDiscardOkResults();
    
    /**
     * Sets the "discardOkResults" attribute
     */
    void setDiscardOkResults(boolean discardOkResults);
    
    /**
     * Sets (as xml) the "discardOkResults" attribute
     */
    void xsetDiscardOkResults(org.apache.xmlbeans.XmlBoolean discardOkResults);
    
    /**
     * Unsets the "discardOkResults" attribute
     */
    void unsetDiscardOkResults();
    
    /**
     * Gets the "searchProperties" attribute
     */
    boolean getSearchProperties();
    
    /**
     * Gets (as xml) the "searchProperties" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSearchProperties();
    
    /**
     * True if has "searchProperties" attribute
     */
    boolean isSetSearchProperties();
    
    /**
     * Sets the "searchProperties" attribute
     */
    void setSearchProperties(boolean searchProperties);
    
    /**
     * Sets (as xml) the "searchProperties" attribute
     */
    void xsetSearchProperties(org.apache.xmlbeans.XmlBoolean searchProperties);
    
    /**
     * Unsets the "searchProperties" attribute
     */
    void unsetSearchProperties();
    
    /**
     * Gets the "disabled" attribute
     */
    boolean getDisabled();
    
    /**
     * Gets (as xml) the "disabled" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDisabled();
    
    /**
     * True if has "disabled" attribute
     */
    boolean isSetDisabled();
    
    /**
     * Sets the "disabled" attribute
     */
    void setDisabled(boolean disabled);
    
    /**
     * Sets (as xml) the "disabled" attribute
     */
    void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled);
    
    /**
     * Unsets the "disabled" attribute
     */
    void unsetDisabled();
    
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
     * Gets the "maxResults" attribute
     */
    int getMaxResults();
    
    /**
     * Gets (as xml) the "maxResults" attribute
     */
    org.apache.xmlbeans.XmlInt xgetMaxResults();
    
    /**
     * True if has "maxResults" attribute
     */
    boolean isSetMaxResults();
    
    /**
     * Sets the "maxResults" attribute
     */
    void setMaxResults(int maxResults);
    
    /**
     * Sets (as xml) the "maxResults" attribute
     */
    void xsetMaxResults(org.apache.xmlbeans.XmlInt maxResults);
    
    /**
     * Unsets the "maxResults" attribute
     */
    void unsetMaxResults();
    
    /**
     * Gets the "wsrmEnabled" attribute
     */
    boolean getWsrmEnabled();
    
    /**
     * Gets (as xml) the "wsrmEnabled" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetWsrmEnabled();
    
    /**
     * True if has "wsrmEnabled" attribute
     */
    boolean isSetWsrmEnabled();
    
    /**
     * Sets the "wsrmEnabled" attribute
     */
    void setWsrmEnabled(boolean wsrmEnabled);
    
    /**
     * Sets (as xml) the "wsrmEnabled" attribute
     */
    void xsetWsrmEnabled(org.apache.xmlbeans.XmlBoolean wsrmEnabled);
    
    /**
     * Unsets the "wsrmEnabled" attribute
     */
    void unsetWsrmEnabled();
    
    /**
     * Gets the "wsrmVersion" attribute
     */
    com.eviware.soapui.config.WsrmVersionTypeConfig.Enum getWsrmVersion();
    
    /**
     * Gets (as xml) the "wsrmVersion" attribute
     */
    com.eviware.soapui.config.WsrmVersionTypeConfig xgetWsrmVersion();
    
    /**
     * True if has "wsrmVersion" attribute
     */
    boolean isSetWsrmVersion();
    
    /**
     * Sets the "wsrmVersion" attribute
     */
    void setWsrmVersion(com.eviware.soapui.config.WsrmVersionTypeConfig.Enum wsrmVersion);
    
    /**
     * Sets (as xml) the "wsrmVersion" attribute
     */
    void xsetWsrmVersion(com.eviware.soapui.config.WsrmVersionTypeConfig wsrmVersion);
    
    /**
     * Unsets the "wsrmVersion" attribute
     */
    void unsetWsrmVersion();
    
    /**
     * Gets the "wsrmAckTo" attribute
     */
    java.lang.String getWsrmAckTo();
    
    /**
     * Gets (as xml) the "wsrmAckTo" attribute
     */
    org.apache.xmlbeans.XmlString xgetWsrmAckTo();
    
    /**
     * True if has "wsrmAckTo" attribute
     */
    boolean isSetWsrmAckTo();
    
    /**
     * Sets the "wsrmAckTo" attribute
     */
    void setWsrmAckTo(java.lang.String wsrmAckTo);
    
    /**
     * Sets (as xml) the "wsrmAckTo" attribute
     */
    void xsetWsrmAckTo(org.apache.xmlbeans.XmlString wsrmAckTo);
    
    /**
     * Unsets the "wsrmAckTo" attribute
     */
    void unsetWsrmAckTo();
    
    /**
     * Gets the "wsrmExpires" attribute
     */
    long getWsrmExpires();
    
    /**
     * Gets (as xml) the "wsrmExpires" attribute
     */
    org.apache.xmlbeans.XmlLong xgetWsrmExpires();
    
    /**
     * True if has "wsrmExpires" attribute
     */
    boolean isSetWsrmExpires();
    
    /**
     * Sets the "wsrmExpires" attribute
     */
    void setWsrmExpires(long wsrmExpires);
    
    /**
     * Sets (as xml) the "wsrmExpires" attribute
     */
    void xsetWsrmExpires(org.apache.xmlbeans.XmlLong wsrmExpires);
    
    /**
     * Unsets the "wsrmExpires" attribute
     */
    void unsetWsrmExpires();
    
    /**
     * Gets the "amfAuthorisation" attribute
     */
    boolean getAmfAuthorisation();
    
    /**
     * Gets (as xml) the "amfAuthorisation" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAmfAuthorisation();
    
    /**
     * True if has "amfAuthorisation" attribute
     */
    boolean isSetAmfAuthorisation();
    
    /**
     * Sets the "amfAuthorisation" attribute
     */
    void setAmfAuthorisation(boolean amfAuthorisation);
    
    /**
     * Sets (as xml) the "amfAuthorisation" attribute
     */
    void xsetAmfAuthorisation(org.apache.xmlbeans.XmlBoolean amfAuthorisation);
    
    /**
     * Unsets the "amfAuthorisation" attribute
     */
    void unsetAmfAuthorisation();
    
    /**
     * Gets the "amfLogin" attribute
     */
    java.lang.String getAmfLogin();
    
    /**
     * Gets (as xml) the "amfLogin" attribute
     */
    org.apache.xmlbeans.XmlString xgetAmfLogin();
    
    /**
     * True if has "amfLogin" attribute
     */
    boolean isSetAmfLogin();
    
    /**
     * Sets the "amfLogin" attribute
     */
    void setAmfLogin(java.lang.String amfLogin);
    
    /**
     * Sets (as xml) the "amfLogin" attribute
     */
    void xsetAmfLogin(org.apache.xmlbeans.XmlString amfLogin);
    
    /**
     * Unsets the "amfLogin" attribute
     */
    void unsetAmfLogin();
    
    /**
     * Gets the "amfPassword" attribute
     */
    java.lang.String getAmfPassword();
    
    /**
     * Gets (as xml) the "amfPassword" attribute
     */
    org.apache.xmlbeans.XmlString xgetAmfPassword();
    
    /**
     * True if has "amfPassword" attribute
     */
    boolean isSetAmfPassword();
    
    /**
     * Sets the "amfPassword" attribute
     */
    void setAmfPassword(java.lang.String amfPassword);
    
    /**
     * Sets (as xml) the "amfPassword" attribute
     */
    void xsetAmfPassword(org.apache.xmlbeans.XmlString amfPassword);
    
    /**
     * Unsets the "amfPassword" attribute
     */
    void unsetAmfPassword();
    
    /**
     * Gets the "amfEndpoint" attribute
     */
    java.lang.String getAmfEndpoint();
    
    /**
     * Gets (as xml) the "amfEndpoint" attribute
     */
    org.apache.xmlbeans.XmlString xgetAmfEndpoint();
    
    /**
     * True if has "amfEndpoint" attribute
     */
    boolean isSetAmfEndpoint();
    
    /**
     * Sets the "amfEndpoint" attribute
     */
    void setAmfEndpoint(java.lang.String amfEndpoint);
    
    /**
     * Sets (as xml) the "amfEndpoint" attribute
     */
    void xsetAmfEndpoint(org.apache.xmlbeans.XmlString amfEndpoint);
    
    /**
     * Unsets the "amfEndpoint" attribute
     */
    void unsetAmfEndpoint();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.TestCaseConfig newInstance() {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.TestCaseConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.TestCaseConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.TestCaseConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestCaseConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestCaseConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestCaseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
