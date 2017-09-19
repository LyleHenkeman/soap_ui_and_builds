/*
 * XML Type:  SecurityCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SecurityCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML SecurityCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface SecurityCheckConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecurityCheckConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("securitycheck7b1atype");
    
    /**
     * Gets the "config" element
     */
    org.apache.xmlbeans.XmlObject getConfig();
    
    /**
     * Sets the "config" element
     */
    void setConfig(org.apache.xmlbeans.XmlObject config);
    
    /**
     * Appends and returns a new empty "config" element
     */
    org.apache.xmlbeans.XmlObject addNewConfig();
    
    /**
     * Gets a List of "assertion" elements
     */
    java.util.List<com.eviware.soapui.config.TestAssertionConfig> getAssertionList();
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    com.eviware.soapui.config.TestAssertionConfig[] getAssertionArray();
    
    /**
     * Gets ith "assertion" element
     */
    com.eviware.soapui.config.TestAssertionConfig getAssertionArray(int i);
    
    /**
     * Returns number of "assertion" element
     */
    int sizeOfAssertionArray();
    
    /**
     * Sets array of all "assertion" element
     */
    void setAssertionArray(com.eviware.soapui.config.TestAssertionConfig[] assertionArray);
    
    /**
     * Sets ith "assertion" element
     */
    void setAssertionArray(int i, com.eviware.soapui.config.TestAssertionConfig assertion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    com.eviware.soapui.config.TestAssertionConfig insertNewAssertion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    com.eviware.soapui.config.TestAssertionConfig addNewAssertion();
    
    /**
     * Removes the ith "assertion" element
     */
    void removeAssertion(int i);
    
    /**
     * Gets the "testStep" element
     */
    com.eviware.soapui.config.TestStepConfig getTestStep();
    
    /**
     * Sets the "testStep" element
     */
    void setTestStep(com.eviware.soapui.config.TestStepConfig testStep);
    
    /**
     * Appends and returns a new empty "testStep" element
     */
    com.eviware.soapui.config.TestStepConfig addNewTestStep();
    
    /**
     * Gets the "checkedPameters" element
     */
    com.eviware.soapui.config.CheckedParametersListConfig getCheckedPameters();
    
    /**
     * Sets the "checkedPameters" element
     */
    void setCheckedPameters(com.eviware.soapui.config.CheckedParametersListConfig checkedPameters);
    
    /**
     * Appends and returns a new empty "checkedPameters" element
     */
    com.eviware.soapui.config.CheckedParametersListConfig addNewCheckedPameters();
    
    /**
     * Gets the "checkedParameters" element
     */
    com.eviware.soapui.config.CheckedParametersListConfig getCheckedParameters();
    
    /**
     * Sets the "checkedParameters" element
     */
    void setCheckedParameters(com.eviware.soapui.config.CheckedParametersListConfig checkedParameters);
    
    /**
     * Appends and returns a new empty "checkedParameters" element
     */
    com.eviware.soapui.config.CheckedParametersListConfig addNewCheckedParameters();
    
    /**
     * Gets the "executionStrategy" element
     */
    com.eviware.soapui.config.ExecutionStrategyConfig getExecutionStrategy();
    
    /**
     * Sets the "executionStrategy" element
     */
    void setExecutionStrategy(com.eviware.soapui.config.ExecutionStrategyConfig executionStrategy);
    
    /**
     * Appends and returns a new empty "executionStrategy" element
     */
    com.eviware.soapui.config.ExecutionStrategyConfig addNewExecutionStrategy();
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "applyForFailedStep" attribute
     */
    boolean getApplyForFailedStep();
    
    /**
     * Gets (as xml) the "applyForFailedStep" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetApplyForFailedStep();
    
    /**
     * True if has "applyForFailedStep" attribute
     */
    boolean isSetApplyForFailedStep();
    
    /**
     * Sets the "applyForFailedStep" attribute
     */
    void setApplyForFailedStep(boolean applyForFailedStep);
    
    /**
     * Sets (as xml) the "applyForFailedStep" attribute
     */
    void xsetApplyForFailedStep(org.apache.xmlbeans.XmlBoolean applyForFailedStep);
    
    /**
     * Unsets the "applyForFailedStep" attribute
     */
    void unsetApplyForFailedStep();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.SecurityCheckConfig newInstance() {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.SecurityCheckConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SecurityCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SecurityCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SecurityCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
