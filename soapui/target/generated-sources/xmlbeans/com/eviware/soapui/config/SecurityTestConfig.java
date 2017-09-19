/*
 * XML Type:  SecurityTest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SecurityTestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML SecurityTest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface SecurityTestConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityTestConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("securitytest575etype");
    
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
     * Gets a List of "testStepSecurityTest" elements
     */
    java.util.List<com.eviware.soapui.config.TestStepSecurityTestConfig> getTestStepSecurityTestList();
    
    /**
     * Gets array of all "testStepSecurityTest" elements
     * @deprecated
     */
    com.eviware.soapui.config.TestStepSecurityTestConfig[] getTestStepSecurityTestArray();
    
    /**
     * Gets ith "testStepSecurityTest" element
     */
    com.eviware.soapui.config.TestStepSecurityTestConfig getTestStepSecurityTestArray(int i);
    
    /**
     * Returns number of "testStepSecurityTest" element
     */
    int sizeOfTestStepSecurityTestArray();
    
    /**
     * Sets array of all "testStepSecurityTest" element
     */
    void setTestStepSecurityTestArray(com.eviware.soapui.config.TestStepSecurityTestConfig[] testStepSecurityTestArray);
    
    /**
     * Sets ith "testStepSecurityTest" element
     */
    void setTestStepSecurityTestArray(int i, com.eviware.soapui.config.TestStepSecurityTestConfig testStepSecurityTest);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStepSecurityTest" element
     */
    com.eviware.soapui.config.TestStepSecurityTestConfig insertNewTestStepSecurityTest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStepSecurityTest" element
     */
    com.eviware.soapui.config.TestStepSecurityTestConfig addNewTestStepSecurityTest();
    
    /**
     * Removes the ith "testStepSecurityTest" element
     */
    void removeTestStepSecurityTest(int i);
    
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
     * Gets the "failSecurityTestOnCheckErrors" attribute
     */
    boolean getFailSecurityTestOnCheckErrors();
    
    /**
     * Gets (as xml) the "failSecurityTestOnCheckErrors" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFailSecurityTestOnCheckErrors();
    
    /**
     * True if has "failSecurityTestOnCheckErrors" attribute
     */
    boolean isSetFailSecurityTestOnCheckErrors();
    
    /**
     * Sets the "failSecurityTestOnCheckErrors" attribute
     */
    void setFailSecurityTestOnCheckErrors(boolean failSecurityTestOnCheckErrors);
    
    /**
     * Sets (as xml) the "failSecurityTestOnCheckErrors" attribute
     */
    void xsetFailSecurityTestOnCheckErrors(org.apache.xmlbeans.XmlBoolean failSecurityTestOnCheckErrors);
    
    /**
     * Unsets the "failSecurityTestOnCheckErrors" attribute
     */
    void unsetFailSecurityTestOnCheckErrors();
    
    /**
     * Gets the "failSecurityTestOnScanErrors" attribute
     */
    boolean getFailSecurityTestOnScanErrors();
    
    /**
     * Gets (as xml) the "failSecurityTestOnScanErrors" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFailSecurityTestOnScanErrors();
    
    /**
     * True if has "failSecurityTestOnScanErrors" attribute
     */
    boolean isSetFailSecurityTestOnScanErrors();
    
    /**
     * Sets the "failSecurityTestOnScanErrors" attribute
     */
    void setFailSecurityTestOnScanErrors(boolean failSecurityTestOnScanErrors);
    
    /**
     * Sets (as xml) the "failSecurityTestOnScanErrors" attribute
     */
    void xsetFailSecurityTestOnScanErrors(org.apache.xmlbeans.XmlBoolean failSecurityTestOnScanErrors);
    
    /**
     * Unsets the "failSecurityTestOnScanErrors" attribute
     */
    void unsetFailSecurityTestOnScanErrors();
    
    /**
     * Gets the "skipDataSourceLoops" attribute
     */
    boolean getSkipDataSourceLoops();
    
    /**
     * Gets (as xml) the "skipDataSourceLoops" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSkipDataSourceLoops();
    
    /**
     * True if has "skipDataSourceLoops" attribute
     */
    boolean isSetSkipDataSourceLoops();
    
    /**
     * Sets the "skipDataSourceLoops" attribute
     */
    void setSkipDataSourceLoops(boolean skipDataSourceLoops);
    
    /**
     * Sets (as xml) the "skipDataSourceLoops" attribute
     */
    void xsetSkipDataSourceLoops(org.apache.xmlbeans.XmlBoolean skipDataSourceLoops);
    
    /**
     * Unsets the "skipDataSourceLoops" attribute
     */
    void unsetSkipDataSourceLoops();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.SecurityTestConfig newInstance() {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.SecurityTestConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SecurityTestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SecurityTestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
