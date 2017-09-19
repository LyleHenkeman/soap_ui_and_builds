/*
 * XML Type:  testsuite
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.Testsuite
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit;


/**
 * An XML testsuite(@http://eviware.com/soapui/junit).
 *
 * This is a complex type.
 */
public interface Testsuite extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testsuite.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testsuitee5b4type");
    
    /**
     * Gets the "properties" element
     */
    com.eviware.soapui.junit.Properties getProperties();
    
    /**
     * True if has "properties" element
     */
    boolean isSetProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(com.eviware.soapui.junit.Properties properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    com.eviware.soapui.junit.Properties addNewProperties();
    
    /**
     * Unsets the "properties" element
     */
    void unsetProperties();
    
    /**
     * Gets a List of "testcase" elements
     */
    java.util.List<com.eviware.soapui.junit.Testcase> getTestcaseList();
    
    /**
     * Gets array of all "testcase" elements
     * @deprecated
     */
    com.eviware.soapui.junit.Testcase[] getTestcaseArray();
    
    /**
     * Gets ith "testcase" element
     */
    com.eviware.soapui.junit.Testcase getTestcaseArray(int i);
    
    /**
     * Returns number of "testcase" element
     */
    int sizeOfTestcaseArray();
    
    /**
     * Sets array of all "testcase" element
     */
    void setTestcaseArray(com.eviware.soapui.junit.Testcase[] testcaseArray);
    
    /**
     * Sets ith "testcase" element
     */
    void setTestcaseArray(int i, com.eviware.soapui.junit.Testcase testcase);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "testcase" element
     */
    com.eviware.soapui.junit.Testcase insertNewTestcase(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "testcase" element
     */
    com.eviware.soapui.junit.Testcase addNewTestcase();
    
    /**
     * Removes the ith "testcase" element
     */
    void removeTestcase(int i);
    
    /**
     * Gets the "system-out" element
     */
    java.lang.String getSystemOut();
    
    /**
     * Gets (as xml) the "system-out" element
     */
    org.apache.xmlbeans.XmlNormalizedString xgetSystemOut();
    
    /**
     * Sets the "system-out" element
     */
    void setSystemOut(java.lang.String systemOut);
    
    /**
     * Sets (as xml) the "system-out" element
     */
    void xsetSystemOut(org.apache.xmlbeans.XmlNormalizedString systemOut);
    
    /**
     * Gets the "system-err" element
     */
    java.lang.String getSystemErr();
    
    /**
     * Gets (as xml) the "system-err" element
     */
    org.apache.xmlbeans.XmlNormalizedString xgetSystemErr();
    
    /**
     * Sets the "system-err" element
     */
    void setSystemErr(java.lang.String systemErr);
    
    /**
     * Sets (as xml) the "system-err" element
     */
    void xsetSystemErr(org.apache.xmlbeans.XmlNormalizedString systemErr);
    
    /**
     * Gets the "errors" attribute
     */
    int getErrors();
    
    /**
     * Gets (as xml) the "errors" attribute
     */
    org.apache.xmlbeans.XmlInt xgetErrors();
    
    /**
     * True if has "errors" attribute
     */
    boolean isSetErrors();
    
    /**
     * Sets the "errors" attribute
     */
    void setErrors(int errors);
    
    /**
     * Sets (as xml) the "errors" attribute
     */
    void xsetErrors(org.apache.xmlbeans.XmlInt errors);
    
    /**
     * Unsets the "errors" attribute
     */
    void unsetErrors();
    
    /**
     * Gets the "failures" attribute
     */
    int getFailures();
    
    /**
     * Gets (as xml) the "failures" attribute
     */
    org.apache.xmlbeans.XmlInt xgetFailures();
    
    /**
     * True if has "failures" attribute
     */
    boolean isSetFailures();
    
    /**
     * Sets the "failures" attribute
     */
    void setFailures(int failures);
    
    /**
     * Sets (as xml) the "failures" attribute
     */
    void xsetFailures(org.apache.xmlbeans.XmlInt failures);
    
    /**
     * Unsets the "failures" attribute
     */
    void unsetFailures();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "tests" attribute
     */
    int getTests();
    
    /**
     * Gets (as xml) the "tests" attribute
     */
    org.apache.xmlbeans.XmlInt xgetTests();
    
    /**
     * True if has "tests" attribute
     */
    boolean isSetTests();
    
    /**
     * Sets the "tests" attribute
     */
    void setTests(int tests);
    
    /**
     * Sets (as xml) the "tests" attribute
     */
    void xsetTests(org.apache.xmlbeans.XmlInt tests);
    
    /**
     * Unsets the "tests" attribute
     */
    void unsetTests();
    
    /**
     * Gets the "time" attribute
     */
    java.lang.String getTime();
    
    /**
     * Gets (as xml) the "time" attribute
     */
    org.apache.xmlbeans.XmlString xgetTime();
    
    /**
     * True if has "time" attribute
     */
    boolean isSetTime();
    
    /**
     * Sets the "time" attribute
     */
    void setTime(java.lang.String time);
    
    /**
     * Sets (as xml) the "time" attribute
     */
    void xsetTime(org.apache.xmlbeans.XmlString time);
    
    /**
     * Unsets the "time" attribute
     */
    void unsetTime();
    
    /**
     * Gets the "package" attribute
     */
    java.lang.String getPackage();
    
    /**
     * Gets (as xml) the "package" attribute
     */
    org.apache.xmlbeans.XmlString xgetPackage();
    
    /**
     * True if has "package" attribute
     */
    boolean isSetPackage();
    
    /**
     * Sets the "package" attribute
     */
    void setPackage(java.lang.String xpackage);
    
    /**
     * Sets (as xml) the "package" attribute
     */
    void xsetPackage(org.apache.xmlbeans.XmlString xpackage);
    
    /**
     * Unsets the "package" attribute
     */
    void unsetPackage();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
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
    void xsetId(org.apache.xmlbeans.XmlString id);
    
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
        public static com.eviware.soapui.junit.Testsuite newInstance() {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.junit.Testsuite parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.junit.Testsuite parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.junit.Testsuite parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.junit.Testsuite parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.junit.Testsuite parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.junit.Testsuite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
