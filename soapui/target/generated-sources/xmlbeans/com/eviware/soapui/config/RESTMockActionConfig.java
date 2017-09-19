/*
 * XML Type:  RESTMockAction
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RESTMockActionConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML RESTMockAction(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface RESTMockActionConfig extends com.eviware.soapui.config.BaseMockOperationConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESTMockActionConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("restmockaction2e9ctype");
    
    /**
     * Gets a List of "response" elements
     */
    java.util.List<com.eviware.soapui.config.RESTMockResponseConfig> getResponseList();
    
    /**
     * Gets array of all "response" elements
     * @deprecated
     */
    com.eviware.soapui.config.RESTMockResponseConfig[] getResponseArray();
    
    /**
     * Gets ith "response" element
     */
    com.eviware.soapui.config.RESTMockResponseConfig getResponseArray(int i);
    
    /**
     * Returns number of "response" element
     */
    int sizeOfResponseArray();
    
    /**
     * Sets array of all "response" element
     */
    void setResponseArray(com.eviware.soapui.config.RESTMockResponseConfig[] responseArray);
    
    /**
     * Sets ith "response" element
     */
    void setResponseArray(int i, com.eviware.soapui.config.RESTMockResponseConfig response);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "response" element
     */
    com.eviware.soapui.config.RESTMockResponseConfig insertNewResponse(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "response" element
     */
    com.eviware.soapui.config.RESTMockResponseConfig addNewResponse();
    
    /**
     * Removes the ith "response" element
     */
    void removeResponse(int i);
    
    /**
     * Gets the "resourcePath" attribute
     */
    java.lang.String getResourcePath();
    
    /**
     * Gets (as xml) the "resourcePath" attribute
     */
    org.apache.xmlbeans.XmlString xgetResourcePath();
    
    /**
     * True if has "resourcePath" attribute
     */
    boolean isSetResourcePath();
    
    /**
     * Sets the "resourcePath" attribute
     */
    void setResourcePath(java.lang.String resourcePath);
    
    /**
     * Sets (as xml) the "resourcePath" attribute
     */
    void xsetResourcePath(org.apache.xmlbeans.XmlString resourcePath);
    
    /**
     * Unsets the "resourcePath" attribute
     */
    void unsetResourcePath();
    
    /**
     * Gets the "method" attribute
     */
    java.lang.String getMethod();
    
    /**
     * Gets (as xml) the "method" attribute
     */
    org.apache.xmlbeans.XmlString xgetMethod();
    
    /**
     * True if has "method" attribute
     */
    boolean isSetMethod();
    
    /**
     * Sets the "method" attribute
     */
    void setMethod(java.lang.String method);
    
    /**
     * Sets (as xml) the "method" attribute
     */
    void xsetMethod(org.apache.xmlbeans.XmlString method);
    
    /**
     * Unsets the "method" attribute
     */
    void unsetMethod();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.RESTMockActionConfig newInstance() {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.RESTMockActionConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RESTMockActionConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RESTMockActionConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RESTMockActionConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
