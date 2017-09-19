/*
 * XML Type:  RunTestCaseStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RunTestCaseStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML RunTestCaseStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface RunTestCaseStepConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RunTestCaseStepConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("runtestcasestep35a9type");
    
    /**
     * Gets the "targetTestCase" element
     */
    java.lang.String getTargetTestCase();
    
    /**
     * Gets (as xml) the "targetTestCase" element
     */
    org.apache.xmlbeans.XmlString xgetTargetTestCase();
    
    /**
     * Sets the "targetTestCase" element
     */
    void setTargetTestCase(java.lang.String targetTestCase);
    
    /**
     * Sets (as xml) the "targetTestCase" element
     */
    void xsetTargetTestCase(org.apache.xmlbeans.XmlString targetTestCase);
    
    /**
     * Gets the "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig getProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig addNewProperties();
    
    /**
     * Gets the "returnProperties" element
     */
    com.eviware.soapui.config.StringListConfig getReturnProperties();
    
    /**
     * Sets the "returnProperties" element
     */
    void setReturnProperties(com.eviware.soapui.config.StringListConfig returnProperties);
    
    /**
     * Appends and returns a new empty "returnProperties" element
     */
    com.eviware.soapui.config.StringListConfig addNewReturnProperties();
    
    /**
     * Gets the "runMode" element
     */
    com.eviware.soapui.config.RunTestCaseRunModeTypeConfig.Enum getRunMode();
    
    /**
     * Gets (as xml) the "runMode" element
     */
    com.eviware.soapui.config.RunTestCaseRunModeTypeConfig xgetRunMode();
    
    /**
     * Sets the "runMode" element
     */
    void setRunMode(com.eviware.soapui.config.RunTestCaseRunModeTypeConfig.Enum runMode);
    
    /**
     * Sets (as xml) the "runMode" element
     */
    void xsetRunMode(com.eviware.soapui.config.RunTestCaseRunModeTypeConfig runMode);
    
    /**
     * Gets the "copyLoadTestProperties" attribute
     */
    boolean getCopyLoadTestProperties();
    
    /**
     * Gets (as xml) the "copyLoadTestProperties" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCopyLoadTestProperties();
    
    /**
     * True if has "copyLoadTestProperties" attribute
     */
    boolean isSetCopyLoadTestProperties();
    
    /**
     * Sets the "copyLoadTestProperties" attribute
     */
    void setCopyLoadTestProperties(boolean copyLoadTestProperties);
    
    /**
     * Sets (as xml) the "copyLoadTestProperties" attribute
     */
    void xsetCopyLoadTestProperties(org.apache.xmlbeans.XmlBoolean copyLoadTestProperties);
    
    /**
     * Unsets the "copyLoadTestProperties" attribute
     */
    void unsetCopyLoadTestProperties();
    
    /**
     * Gets the "copyHttpSession" attribute
     */
    boolean getCopyHttpSession();
    
    /**
     * Gets (as xml) the "copyHttpSession" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCopyHttpSession();
    
    /**
     * True if has "copyHttpSession" attribute
     */
    boolean isSetCopyHttpSession();
    
    /**
     * Sets the "copyHttpSession" attribute
     */
    void setCopyHttpSession(boolean copyHttpSession);
    
    /**
     * Sets (as xml) the "copyHttpSession" attribute
     */
    void xsetCopyHttpSession(org.apache.xmlbeans.XmlBoolean copyHttpSession);
    
    /**
     * Unsets the "copyHttpSession" attribute
     */
    void unsetCopyHttpSession();
    
    /**
     * Gets the "ignoreEmptyProperties" attribute
     */
    boolean getIgnoreEmptyProperties();
    
    /**
     * Gets (as xml) the "ignoreEmptyProperties" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIgnoreEmptyProperties();
    
    /**
     * True if has "ignoreEmptyProperties" attribute
     */
    boolean isSetIgnoreEmptyProperties();
    
    /**
     * Sets the "ignoreEmptyProperties" attribute
     */
    void setIgnoreEmptyProperties(boolean ignoreEmptyProperties);
    
    /**
     * Sets (as xml) the "ignoreEmptyProperties" attribute
     */
    void xsetIgnoreEmptyProperties(org.apache.xmlbeans.XmlBoolean ignoreEmptyProperties);
    
    /**
     * Unsets the "ignoreEmptyProperties" attribute
     */
    void unsetIgnoreEmptyProperties();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.RunTestCaseStepConfig newInstance() {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RunTestCaseStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RunTestCaseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
