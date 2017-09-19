/*
 * XML Type:  testcase
 * Namespace: http://eviware.com/soapui/junit
 * Java type: com.eviware.soapui.junit.Testcase
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.junit;


/**
 * An XML testcase(@http://eviware.com/soapui/junit).
 *
 * This is a complex type.
 */
public interface Testcase extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Testcase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testcase2c82type");
    
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
     * Gets the "failure" element
     */
    com.eviware.soapui.junit.FailureDocument.Failure getFailure();
    
    /**
     * True if has "failure" element
     */
    boolean isSetFailure();
    
    /**
     * Sets the "failure" element
     */
    void setFailure(com.eviware.soapui.junit.FailureDocument.Failure failure);
    
    /**
     * Appends and returns a new empty "failure" element
     */
    com.eviware.soapui.junit.FailureDocument.Failure addNewFailure();
    
    /**
     * Unsets the "failure" element
     */
    void unsetFailure();
    
    /**
     * Gets the "error" element
     */
    com.eviware.soapui.junit.ErrorDocument.Error getError();
    
    /**
     * True if has "error" element
     */
    boolean isSetError();
    
    /**
     * Sets the "error" element
     */
    void setError(com.eviware.soapui.junit.ErrorDocument.Error error);
    
    /**
     * Appends and returns a new empty "error" element
     */
    com.eviware.soapui.junit.ErrorDocument.Error addNewError();
    
    /**
     * Unsets the "error" element
     */
    void unsetError();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.junit.Testcase newInstance() {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.junit.Testcase newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.junit.Testcase parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.junit.Testcase parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.junit.Testcase parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.junit.Testcase parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.junit.Testcase parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.junit.Testcase parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.junit.Testcase parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.junit.Testcase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.junit.Testcase parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.junit.Testcase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
