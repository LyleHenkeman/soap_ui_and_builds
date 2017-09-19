/*
 * XML Type:  EnvironmentEndpoint
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.EnvironmentEndpointConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML EnvironmentEndpoint(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.EnvironmentEndpointConfig.
 */
public interface EnvironmentEndpointConfig extends com.eviware.soapui.config.EndpointConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvironmentEndpointConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("environmentendpoint793atype");
    
    /**
     * Gets the "proxyHost" attribute
     */
    java.lang.String getProxyHost();
    
    /**
     * Gets (as xml) the "proxyHost" attribute
     */
    org.apache.xmlbeans.XmlString xgetProxyHost();
    
    /**
     * True if has "proxyHost" attribute
     */
    boolean isSetProxyHost();
    
    /**
     * Sets the "proxyHost" attribute
     */
    void setProxyHost(java.lang.String proxyHost);
    
    /**
     * Sets (as xml) the "proxyHost" attribute
     */
    void xsetProxyHost(org.apache.xmlbeans.XmlString proxyHost);
    
    /**
     * Unsets the "proxyHost" attribute
     */
    void unsetProxyHost();
    
    /**
     * Gets the "proxyPort" attribute
     */
    java.lang.String getProxyPort();
    
    /**
     * Gets (as xml) the "proxyPort" attribute
     */
    org.apache.xmlbeans.XmlString xgetProxyPort();
    
    /**
     * True if has "proxyPort" attribute
     */
    boolean isSetProxyPort();
    
    /**
     * Sets the "proxyPort" attribute
     */
    void setProxyPort(java.lang.String proxyPort);
    
    /**
     * Sets (as xml) the "proxyPort" attribute
     */
    void xsetProxyPort(org.apache.xmlbeans.XmlString proxyPort);
    
    /**
     * Unsets the "proxyPort" attribute
     */
    void unsetProxyPort();
    
    /**
     * Gets the "proxyUsername" attribute
     */
    java.lang.String getProxyUsername();
    
    /**
     * Gets (as xml) the "proxyUsername" attribute
     */
    org.apache.xmlbeans.XmlString xgetProxyUsername();
    
    /**
     * True if has "proxyUsername" attribute
     */
    boolean isSetProxyUsername();
    
    /**
     * Sets the "proxyUsername" attribute
     */
    void setProxyUsername(java.lang.String proxyUsername);
    
    /**
     * Sets (as xml) the "proxyUsername" attribute
     */
    void xsetProxyUsername(org.apache.xmlbeans.XmlString proxyUsername);
    
    /**
     * Unsets the "proxyUsername" attribute
     */
    void unsetProxyUsername();
    
    /**
     * Gets the "proxyPassword" attribute
     */
    java.lang.String getProxyPassword();
    
    /**
     * Gets (as xml) the "proxyPassword" attribute
     */
    org.apache.xmlbeans.XmlString xgetProxyPassword();
    
    /**
     * True if has "proxyPassword" attribute
     */
    boolean isSetProxyPassword();
    
    /**
     * Sets the "proxyPassword" attribute
     */
    void setProxyPassword(java.lang.String proxyPassword);
    
    /**
     * Sets (as xml) the "proxyPassword" attribute
     */
    void xsetProxyPassword(org.apache.xmlbeans.XmlString proxyPassword);
    
    /**
     * Unsets the "proxyPassword" attribute
     */
    void unsetProxyPassword();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.EnvironmentEndpointConfig newInstance() {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.EnvironmentEndpointConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.EnvironmentEndpointConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
