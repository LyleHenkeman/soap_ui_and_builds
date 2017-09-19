/*
 * XML Type:  redirect
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.Redirect
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig;


/**
 * An XML redirect(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public interface Redirect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Redirect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("redirect9dc3type");
    
    /**
     * Gets the "comment" element
     */
    java.lang.String getComment();
    
    /**
     * Gets (as xml) the "comment" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.Comment xgetComment();
    
    /**
     * True if has "comment" element
     */
    boolean isSetComment();
    
    /**
     * Sets the "comment" element
     */
    void setComment(java.lang.String comment);
    
    /**
     * Sets (as xml) the "comment" element
     */
    void xsetComment(org.wsI.testing.x2003.x03.monitorConfig.Comment comment);
    
    /**
     * Unsets the "comment" element
     */
    void unsetComment();
    
    /**
     * Gets the "listenPort" element
     */
    int getListenPort();
    
    /**
     * Gets (as xml) the "listenPort" element
     */
    org.apache.xmlbeans.XmlInt xgetListenPort();
    
    /**
     * Sets the "listenPort" element
     */
    void setListenPort(int listenPort);
    
    /**
     * Sets (as xml) the "listenPort" element
     */
    void xsetListenPort(org.apache.xmlbeans.XmlInt listenPort);
    
    /**
     * Gets the "schemeAndHostPort" element
     */
    java.lang.String getSchemeAndHostPort();
    
    /**
     * Gets (as xml) the "schemeAndHostPort" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetSchemeAndHostPort();
    
    /**
     * Sets the "schemeAndHostPort" element
     */
    void setSchemeAndHostPort(java.lang.String schemeAndHostPort);
    
    /**
     * Sets (as xml) the "schemeAndHostPort" element
     */
    void xsetSchemeAndHostPort(org.apache.xmlbeans.XmlAnyURI schemeAndHostPort);
    
    /**
     * Gets the "maxConnections" element
     */
    int getMaxConnections();
    
    /**
     * Gets (as xml) the "maxConnections" element
     */
    org.apache.xmlbeans.XmlInt xgetMaxConnections();
    
    /**
     * Sets the "maxConnections" element
     */
    void setMaxConnections(int maxConnections);
    
    /**
     * Sets (as xml) the "maxConnections" element
     */
    void xsetMaxConnections(org.apache.xmlbeans.XmlInt maxConnections);
    
    /**
     * Gets the "readTimeoutSeconds" element
     */
    int getReadTimeoutSeconds();
    
    /**
     * Gets (as xml) the "readTimeoutSeconds" element
     */
    org.apache.xmlbeans.XmlInt xgetReadTimeoutSeconds();
    
    /**
     * Sets the "readTimeoutSeconds" element
     */
    void setReadTimeoutSeconds(int readTimeoutSeconds);
    
    /**
     * Sets (as xml) the "readTimeoutSeconds" element
     */
    void xsetReadTimeoutSeconds(org.apache.xmlbeans.XmlInt readTimeoutSeconds);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect newInstance() {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.Redirect parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Redirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
