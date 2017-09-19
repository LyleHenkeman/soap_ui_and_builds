/*
 * XML Type:  MockResponseStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockResponseStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MockResponseStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MockResponseStepConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MockResponseStepConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("mockresponsestepef19type");
    
    /**
     * Gets the "interface" element
     */
    java.lang.String getInterface();
    
    /**
     * Gets (as xml) the "interface" element
     */
    org.apache.xmlbeans.XmlString xgetInterface();
    
    /**
     * Sets the "interface" element
     */
    void setInterface(java.lang.String xinterface);
    
    /**
     * Sets (as xml) the "interface" element
     */
    void xsetInterface(org.apache.xmlbeans.XmlString xinterface);
    
    /**
     * Gets the "operation" element
     */
    java.lang.String getOperation();
    
    /**
     * Gets (as xml) the "operation" element
     */
    org.apache.xmlbeans.XmlString xgetOperation();
    
    /**
     * Sets the "operation" element
     */
    void setOperation(java.lang.String operation);
    
    /**
     * Sets (as xml) the "operation" element
     */
    void xsetOperation(org.apache.xmlbeans.XmlString operation);
    
    /**
     * Gets the "path" element
     */
    java.lang.String getPath();
    
    /**
     * Gets (as xml) the "path" element
     */
    org.apache.xmlbeans.XmlString xgetPath();
    
    /**
     * Sets the "path" element
     */
    void setPath(java.lang.String path);
    
    /**
     * Sets (as xml) the "path" element
     */
    void xsetPath(org.apache.xmlbeans.XmlString path);
    
    /**
     * Gets the "port" element
     */
    int getPort();
    
    /**
     * Gets (as xml) the "port" element
     */
    org.apache.xmlbeans.XmlInt xgetPort();
    
    /**
     * Sets the "port" element
     */
    void setPort(int port);
    
    /**
     * Sets (as xml) the "port" element
     */
    void xsetPort(org.apache.xmlbeans.XmlInt port);
    
    /**
     * Gets the "timeout" element
     */
    long getTimeout();
    
    /**
     * Gets (as xml) the "timeout" element
     */
    org.apache.xmlbeans.XmlLong xgetTimeout();
    
    /**
     * Sets the "timeout" element
     */
    void setTimeout(long timeout);
    
    /**
     * Sets (as xml) the "timeout" element
     */
    void xsetTimeout(org.apache.xmlbeans.XmlLong timeout);
    
    /**
     * Gets the "response" element
     */
    com.eviware.soapui.config.MockResponseConfig getResponse();
    
    /**
     * Sets the "response" element
     */
    void setResponse(com.eviware.soapui.config.MockResponseConfig response);
    
    /**
     * Appends and returns a new empty "response" element
     */
    com.eviware.soapui.config.MockResponseConfig addNewResponse();
    
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
     * Gets the "query" element
     */
    java.lang.String getQuery();
    
    /**
     * Gets (as xml) the "query" element
     */
    org.apache.xmlbeans.XmlString xgetQuery();
    
    /**
     * Sets the "query" element
     */
    void setQuery(java.lang.String query);
    
    /**
     * Sets (as xml) the "query" element
     */
    void xsetQuery(org.apache.xmlbeans.XmlString query);
    
    /**
     * Gets the "match" element
     */
    java.lang.String getMatch();
    
    /**
     * Gets (as xml) the "match" element
     */
    org.apache.xmlbeans.XmlString xgetMatch();
    
    /**
     * Sets the "match" element
     */
    void setMatch(java.lang.String match);
    
    /**
     * Sets (as xml) the "match" element
     */
    void xsetMatch(org.apache.xmlbeans.XmlString match);
    
    /**
     * Gets the "host" element
     */
    java.lang.String getHost();
    
    /**
     * Gets (as xml) the "host" element
     */
    org.apache.xmlbeans.XmlString xgetHost();
    
    /**
     * True if has "host" element
     */
    boolean isSetHost();
    
    /**
     * Sets the "host" element
     */
    void setHost(java.lang.String host);
    
    /**
     * Sets (as xml) the "host" element
     */
    void xsetHost(org.apache.xmlbeans.XmlString host);
    
    /**
     * Unsets the "host" element
     */
    void unsetHost();
    
    /**
     * Gets the "handleFault" attribute
     */
    boolean getHandleFault();
    
    /**
     * Gets (as xml) the "handleFault" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHandleFault();
    
    /**
     * True if has "handleFault" attribute
     */
    boolean isSetHandleFault();
    
    /**
     * Sets the "handleFault" attribute
     */
    void setHandleFault(boolean handleFault);
    
    /**
     * Sets (as xml) the "handleFault" attribute
     */
    void xsetHandleFault(org.apache.xmlbeans.XmlBoolean handleFault);
    
    /**
     * Unsets the "handleFault" attribute
     */
    void unsetHandleFault();
    
    /**
     * Gets the "handleResponse" attribute
     */
    boolean getHandleResponse();
    
    /**
     * Gets (as xml) the "handleResponse" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHandleResponse();
    
    /**
     * True if has "handleResponse" attribute
     */
    boolean isSetHandleResponse();
    
    /**
     * Sets the "handleResponse" attribute
     */
    void setHandleResponse(boolean handleResponse);
    
    /**
     * Sets (as xml) the "handleResponse" attribute
     */
    void xsetHandleResponse(org.apache.xmlbeans.XmlBoolean handleResponse);
    
    /**
     * Unsets the "handleResponse" attribute
     */
    void unsetHandleResponse();
    
    /**
     * Gets the "startStep" attribute
     */
    java.lang.String getStartStep();
    
    /**
     * Gets (as xml) the "startStep" attribute
     */
    org.apache.xmlbeans.XmlString xgetStartStep();
    
    /**
     * True if has "startStep" attribute
     */
    boolean isSetStartStep();
    
    /**
     * Sets the "startStep" attribute
     */
    void setStartStep(java.lang.String startStep);
    
    /**
     * Sets (as xml) the "startStep" attribute
     */
    void xsetStartStep(org.apache.xmlbeans.XmlString startStep);
    
    /**
     * Unsets the "startStep" attribute
     */
    void unsetStartStep();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MockResponseStepConfig newInstance() {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MockResponseStepConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MockResponseStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MockResponseStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MockResponseStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
