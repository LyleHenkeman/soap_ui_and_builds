/*
 * XML Type:  TestSuite
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestSuiteConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML TestSuite(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface TestSuiteConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestSuiteConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testsuite137ctype");
    
    /**
     * Gets the "runType" element
     */
    com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum getRunType();
    
    /**
     * Gets (as xml) the "runType" element
     */
    com.eviware.soapui.config.TestSuiteRunTypesConfig xgetRunType();
    
    /**
     * True if has "runType" element
     */
    boolean isSetRunType();
    
    /**
     * Sets the "runType" element
     */
    void setRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig.Enum runType);
    
    /**
     * Sets (as xml) the "runType" element
     */
    void xsetRunType(com.eviware.soapui.config.TestSuiteRunTypesConfig runType);
    
    /**
     * Unsets the "runType" element
     */
    void unsetRunType();
    
    /**
     * Gets a List of "testCase" elements
     */
    java.util.List<com.eviware.soapui.config.TestCaseConfig> getTestCaseList();
    
    /**
     * Gets array of all "testCase" elements
     * @deprecated
     */
    com.eviware.soapui.config.TestCaseConfig[] getTestCaseArray();
    
    /**
     * Gets ith "testCase" element
     */
    com.eviware.soapui.config.TestCaseConfig getTestCaseArray(int i);
    
    /**
     * Returns number of "testCase" element
     */
    int sizeOfTestCaseArray();
    
    /**
     * Sets array of all "testCase" element
     */
    void setTestCaseArray(com.eviware.soapui.config.TestCaseConfig[] testCaseArray);
    
    /**
     * Sets ith "testCase" element
     */
    void setTestCaseArray(int i, com.eviware.soapui.config.TestCaseConfig testCase);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testCase" element
     */
    com.eviware.soapui.config.TestCaseConfig insertNewTestCase(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testCase" element
     */
    com.eviware.soapui.config.TestCaseConfig addNewTestCase();
    
    /**
     * Removes the ith "testCase" element
     */
    void removeTestCase(int i);
    
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
     * Gets the "failOnErrors" attribute
     */
    boolean getFailOnErrors();
    
    /**
     * Gets (as xml) the "failOnErrors" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFailOnErrors();
    
    /**
     * True if has "failOnErrors" attribute
     */
    boolean isSetFailOnErrors();
    
    /**
     * Sets the "failOnErrors" attribute
     */
    void setFailOnErrors(boolean failOnErrors);
    
    /**
     * Sets (as xml) the "failOnErrors" attribute
     */
    void xsetFailOnErrors(org.apache.xmlbeans.XmlBoolean failOnErrors);
    
    /**
     * Unsets the "failOnErrors" attribute
     */
    void unsetFailOnErrors();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.TestSuiteConfig newInstance() {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.TestSuiteConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestSuiteConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestSuiteConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestSuiteConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
