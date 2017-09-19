/*
 * XML Type:  TestScenario
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestScenarioConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML TestScenario(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface TestScenarioConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestScenarioConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testscenario070etype");
    
    /**
     * Gets the "beforeRunScript" element
     */
    java.lang.String getBeforeRunScript();
    
    /**
     * Gets (as xml) the "beforeRunScript" element
     */
    org.apache.xmlbeans.XmlString xgetBeforeRunScript();
    
    /**
     * Sets the "beforeRunScript" element
     */
    void setBeforeRunScript(java.lang.String beforeRunScript);
    
    /**
     * Sets (as xml) the "beforeRunScript" element
     */
    void xsetBeforeRunScript(org.apache.xmlbeans.XmlString beforeRunScript);
    
    /**
     * Gets the "afterRunScript" element
     */
    java.lang.String getAfterRunScript();
    
    /**
     * Gets (as xml) the "afterRunScript" element
     */
    org.apache.xmlbeans.XmlString xgetAfterRunScript();
    
    /**
     * Sets the "afterRunScript" element
     */
    void setAfterRunScript(java.lang.String afterRunScript);
    
    /**
     * Sets (as xml) the "afterRunScript" element
     */
    void xsetAfterRunScript(org.apache.xmlbeans.XmlString afterRunScript);
    
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
        public static com.eviware.soapui.config.TestScenarioConfig newInstance() {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.TestScenarioConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestScenarioConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestScenarioConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestScenarioConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
