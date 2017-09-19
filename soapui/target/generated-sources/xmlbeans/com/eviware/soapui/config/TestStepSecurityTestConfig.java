/*
 * XML Type:  TestStepSecurityTest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestStepSecurityTestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML TestStepSecurityTest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface TestStepSecurityTestConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestStepSecurityTestConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("teststepsecuritytest4e80type");
    
    /**
     * Gets the "testStepId" element
     */
    java.lang.String getTestStepId();
    
    /**
     * Gets (as xml) the "testStepId" element
     */
    org.apache.xmlbeans.XmlString xgetTestStepId();
    
    /**
     * Sets the "testStepId" element
     */
    void setTestStepId(java.lang.String testStepId);
    
    /**
     * Sets (as xml) the "testStepId" element
     */
    void xsetTestStepId(org.apache.xmlbeans.XmlString testStepId);
    
    /**
     * Gets a List of "testStepSecurityCheck" elements
     */
    java.util.List<com.eviware.soapui.config.SecurityCheckConfig> getTestStepSecurityCheckList();
    
    /**
     * Gets array of all "testStepSecurityCheck" elements
     * @deprecated
     */
    com.eviware.soapui.config.SecurityCheckConfig[] getTestStepSecurityCheckArray();
    
    /**
     * Gets ith "testStepSecurityCheck" element
     */
    com.eviware.soapui.config.SecurityCheckConfig getTestStepSecurityCheckArray(int i);
    
    /**
     * Returns number of "testStepSecurityCheck" element
     */
    int sizeOfTestStepSecurityCheckArray();
    
    /**
     * Sets array of all "testStepSecurityCheck" element
     */
    void setTestStepSecurityCheckArray(com.eviware.soapui.config.SecurityCheckConfig[] testStepSecurityCheckArray);
    
    /**
     * Sets ith "testStepSecurityCheck" element
     */
    void setTestStepSecurityCheckArray(int i, com.eviware.soapui.config.SecurityCheckConfig testStepSecurityCheck);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStepSecurityCheck" element
     */
    com.eviware.soapui.config.SecurityCheckConfig insertNewTestStepSecurityCheck(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStepSecurityCheck" element
     */
    com.eviware.soapui.config.SecurityCheckConfig addNewTestStepSecurityCheck();
    
    /**
     * Removes the ith "testStepSecurityCheck" element
     */
    void removeTestStepSecurityCheck(int i);
    
    /**
     * Gets a List of "testStepSecurityScan" elements
     */
    java.util.List<com.eviware.soapui.config.SecurityScanConfig> getTestStepSecurityScanList();
    
    /**
     * Gets array of all "testStepSecurityScan" elements
     * @deprecated
     */
    com.eviware.soapui.config.SecurityScanConfig[] getTestStepSecurityScanArray();
    
    /**
     * Gets ith "testStepSecurityScan" element
     */
    com.eviware.soapui.config.SecurityScanConfig getTestStepSecurityScanArray(int i);
    
    /**
     * Returns number of "testStepSecurityScan" element
     */
    int sizeOfTestStepSecurityScanArray();
    
    /**
     * Sets array of all "testStepSecurityScan" element
     */
    void setTestStepSecurityScanArray(com.eviware.soapui.config.SecurityScanConfig[] testStepSecurityScanArray);
    
    /**
     * Sets ith "testStepSecurityScan" element
     */
    void setTestStepSecurityScanArray(int i, com.eviware.soapui.config.SecurityScanConfig testStepSecurityScan);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testStepSecurityScan" element
     */
    com.eviware.soapui.config.SecurityScanConfig insertNewTestStepSecurityScan(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testStepSecurityScan" element
     */
    com.eviware.soapui.config.SecurityScanConfig addNewTestStepSecurityScan();
    
    /**
     * Removes the ith "testStepSecurityScan" element
     */
    void removeTestStepSecurityScan(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.TestStepSecurityTestConfig newInstance() {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestStepSecurityTestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestStepSecurityTestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
