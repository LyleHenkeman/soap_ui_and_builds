/*
 * XML Type:  BaseMockService
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BaseMockServiceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML BaseMockService(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface BaseMockServiceConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseMockServiceConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("basemockservice3288type");
    
    /**
     * Gets the "startScript" element
     */
    com.eviware.soapui.config.ScriptConfig getStartScript();
    
    /**
     * True if has "startScript" element
     */
    boolean isSetStartScript();
    
    /**
     * Sets the "startScript" element
     */
    void setStartScript(com.eviware.soapui.config.ScriptConfig startScript);
    
    /**
     * Appends and returns a new empty "startScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewStartScript();
    
    /**
     * Unsets the "startScript" element
     */
    void unsetStartScript();
    
    /**
     * Gets the "stopScript" element
     */
    com.eviware.soapui.config.ScriptConfig getStopScript();
    
    /**
     * True if has "stopScript" element
     */
    boolean isSetStopScript();
    
    /**
     * Sets the "stopScript" element
     */
    void setStopScript(com.eviware.soapui.config.ScriptConfig stopScript);
    
    /**
     * Appends and returns a new empty "stopScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewStopScript();
    
    /**
     * Unsets the "stopScript" element
     */
    void unsetStopScript();
    
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
     * Gets the "onRequestScript" element
     */
    com.eviware.soapui.config.ScriptConfig getOnRequestScript();
    
    /**
     * True if has "onRequestScript" element
     */
    boolean isSetOnRequestScript();
    
    /**
     * Sets the "onRequestScript" element
     */
    void setOnRequestScript(com.eviware.soapui.config.ScriptConfig onRequestScript);
    
    /**
     * Appends and returns a new empty "onRequestScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewOnRequestScript();
    
    /**
     * Unsets the "onRequestScript" element
     */
    void unsetOnRequestScript();
    
    /**
     * Gets the "afterRequestScript" element
     */
    com.eviware.soapui.config.ScriptConfig getAfterRequestScript();
    
    /**
     * True if has "afterRequestScript" element
     */
    boolean isSetAfterRequestScript();
    
    /**
     * Sets the "afterRequestScript" element
     */
    void setAfterRequestScript(com.eviware.soapui.config.ScriptConfig afterRequestScript);
    
    /**
     * Appends and returns a new empty "afterRequestScript" element
     */
    com.eviware.soapui.config.ScriptConfig addNewAfterRequestScript();
    
    /**
     * Unsets the "afterRequestScript" element
     */
    void unsetAfterRequestScript();
    
    /**
     * Gets the "port" attribute
     */
    int getPort();
    
    /**
     * Gets (as xml) the "port" attribute
     */
    org.apache.xmlbeans.XmlInt xgetPort();
    
    /**
     * True if has "port" attribute
     */
    boolean isSetPort();
    
    /**
     * Sets the "port" attribute
     */
    void setPort(int port);
    
    /**
     * Sets (as xml) the "port" attribute
     */
    void xsetPort(org.apache.xmlbeans.XmlInt port);
    
    /**
     * Unsets the "port" attribute
     */
    void unsetPort();
    
    /**
     * Gets the "host" attribute
     */
    java.lang.String getHost();
    
    /**
     * Gets (as xml) the "host" attribute
     */
    org.apache.xmlbeans.XmlString xgetHost();
    
    /**
     * True if has "host" attribute
     */
    boolean isSetHost();
    
    /**
     * Sets the "host" attribute
     */
    void setHost(java.lang.String host);
    
    /**
     * Sets (as xml) the "host" attribute
     */
    void xsetHost(org.apache.xmlbeans.XmlString host);
    
    /**
     * Unsets the "host" attribute
     */
    void unsetHost();
    
    /**
     * Gets the "bindToHostOnly" attribute
     */
    boolean getBindToHostOnly();
    
    /**
     * Gets (as xml) the "bindToHostOnly" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBindToHostOnly();
    
    /**
     * True if has "bindToHostOnly" attribute
     */
    boolean isSetBindToHostOnly();
    
    /**
     * Sets the "bindToHostOnly" attribute
     */
    void setBindToHostOnly(boolean bindToHostOnly);
    
    /**
     * Sets (as xml) the "bindToHostOnly" attribute
     */
    void xsetBindToHostOnly(org.apache.xmlbeans.XmlBoolean bindToHostOnly);
    
    /**
     * Unsets the "bindToHostOnly" attribute
     */
    void unsetBindToHostOnly();
    
    /**
     * Gets the "path" attribute
     */
    java.lang.String getPath();
    
    /**
     * Gets (as xml) the "path" attribute
     */
    org.apache.xmlbeans.XmlString xgetPath();
    
    /**
     * True if has "path" attribute
     */
    boolean isSetPath();
    
    /**
     * Sets the "path" attribute
     */
    void setPath(java.lang.String path);
    
    /**
     * Sets (as xml) the "path" attribute
     */
    void xsetPath(org.apache.xmlbeans.XmlString path);
    
    /**
     * Unsets the "path" attribute
     */
    void unsetPath();
    
    /**
     * Gets the "docroot" attribute
     */
    java.lang.String getDocroot();
    
    /**
     * Gets (as xml) the "docroot" attribute
     */
    org.apache.xmlbeans.XmlString xgetDocroot();
    
    /**
     * True if has "docroot" attribute
     */
    boolean isSetDocroot();
    
    /**
     * Sets the "docroot" attribute
     */
    void setDocroot(java.lang.String docroot);
    
    /**
     * Sets (as xml) the "docroot" attribute
     */
    void xsetDocroot(org.apache.xmlbeans.XmlString docroot);
    
    /**
     * Unsets the "docroot" attribute
     */
    void unsetDocroot();
    
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
     * Gets the "dispatchResponseMessages" attribute
     */
    boolean getDispatchResponseMessages();
    
    /**
     * Gets (as xml) the "dispatchResponseMessages" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDispatchResponseMessages();
    
    /**
     * True if has "dispatchResponseMessages" attribute
     */
    boolean isSetDispatchResponseMessages();
    
    /**
     * Sets the "dispatchResponseMessages" attribute
     */
    void setDispatchResponseMessages(boolean dispatchResponseMessages);
    
    /**
     * Sets (as xml) the "dispatchResponseMessages" attribute
     */
    void xsetDispatchResponseMessages(org.apache.xmlbeans.XmlBoolean dispatchResponseMessages);
    
    /**
     * Unsets the "dispatchResponseMessages" attribute
     */
    void unsetDispatchResponseMessages();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.BaseMockServiceConfig newInstance() {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.BaseMockServiceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.BaseMockServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
