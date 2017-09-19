/*
 * XML Type:  MockOperation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockOperationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MockOperation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MockOperationConfig extends com.eviware.soapui.config.BaseMockOperationConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MockOperationConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("mockoperatione865type");
    
    /**
     * Gets a List of "response" elements
     */
    java.util.List<com.eviware.soapui.config.MockResponseConfig> getResponseList();
    
    /**
     * Gets array of all "response" elements
     * @deprecated
     */
    com.eviware.soapui.config.MockResponseConfig[] getResponseArray();
    
    /**
     * Gets ith "response" element
     */
    com.eviware.soapui.config.MockResponseConfig getResponseArray(int i);
    
    /**
     * Returns number of "response" element
     */
    int sizeOfResponseArray();
    
    /**
     * Sets array of all "response" element
     */
    void setResponseArray(com.eviware.soapui.config.MockResponseConfig[] responseArray);
    
    /**
     * Sets ith "response" element
     */
    void setResponseArray(int i, com.eviware.soapui.config.MockResponseConfig response);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "response" element
     */
    com.eviware.soapui.config.MockResponseConfig insertNewResponse(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "response" element
     */
    com.eviware.soapui.config.MockResponseConfig addNewResponse();
    
    /**
     * Removes the ith "response" element
     */
    void removeResponse(int i);
    
    /**
     * Gets the "dispatchConfig" element
     */
    org.apache.xmlbeans.XmlObject getDispatchConfig();
    
    /**
     * True if has "dispatchConfig" element
     */
    boolean isSetDispatchConfig();
    
    /**
     * Sets the "dispatchConfig" element
     */
    void setDispatchConfig(org.apache.xmlbeans.XmlObject dispatchConfig);
    
    /**
     * Appends and returns a new empty "dispatchConfig" element
     */
    org.apache.xmlbeans.XmlObject addNewDispatchConfig();
    
    /**
     * Unsets the "dispatchConfig" element
     */
    void unsetDispatchConfig();
    
    /**
     * Gets the "interface" attribute
     */
    java.lang.String getInterface();
    
    /**
     * Gets (as xml) the "interface" attribute
     */
    org.apache.xmlbeans.XmlString xgetInterface();
    
    /**
     * True if has "interface" attribute
     */
    boolean isSetInterface();
    
    /**
     * Sets the "interface" attribute
     */
    void setInterface(java.lang.String xinterface);
    
    /**
     * Sets (as xml) the "interface" attribute
     */
    void xsetInterface(org.apache.xmlbeans.XmlString xinterface);
    
    /**
     * Unsets the "interface" attribute
     */
    void unsetInterface();
    
    /**
     * Gets the "operation" attribute
     */
    java.lang.String getOperation();
    
    /**
     * Gets (as xml) the "operation" attribute
     */
    org.apache.xmlbeans.XmlString xgetOperation();
    
    /**
     * True if has "operation" attribute
     */
    boolean isSetOperation();
    
    /**
     * Sets the "operation" attribute
     */
    void setOperation(java.lang.String operation);
    
    /**
     * Sets (as xml) the "operation" attribute
     */
    void xsetOperation(org.apache.xmlbeans.XmlString operation);
    
    /**
     * Unsets the "operation" attribute
     */
    void unsetOperation();
    
    /**
     * Gets the "faultMockOperation" attribute
     */
    java.lang.String getFaultMockOperation();
    
    /**
     * Gets (as xml) the "faultMockOperation" attribute
     */
    org.apache.xmlbeans.XmlString xgetFaultMockOperation();
    
    /**
     * True if has "faultMockOperation" attribute
     */
    boolean isSetFaultMockOperation();
    
    /**
     * Sets the "faultMockOperation" attribute
     */
    void setFaultMockOperation(java.lang.String faultMockOperation);
    
    /**
     * Sets (as xml) the "faultMockOperation" attribute
     */
    void xsetFaultMockOperation(org.apache.xmlbeans.XmlString faultMockOperation);
    
    /**
     * Unsets the "faultMockOperation" attribute
     */
    void unsetFaultMockOperation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MockOperationConfig newInstance() {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MockOperationConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MockOperationConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MockOperationConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MockOperationConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
