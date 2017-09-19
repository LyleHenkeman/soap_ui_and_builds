/*
 * XML Type:  WsrmConfig
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WsrmConfigConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML WsrmConfig(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface WsrmConfigConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WsrmConfigConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("wsrmconfig4db7type");
    
    /**
     * Gets the "version" attribute
     */
    com.eviware.soapui.config.WsrmVersionTypeConfig.Enum getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    com.eviware.soapui.config.WsrmVersionTypeConfig xgetVersion();
    
    /**
     * True if has "version" attribute
     */
    boolean isSetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(com.eviware.soapui.config.WsrmVersionTypeConfig.Enum version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(com.eviware.soapui.config.WsrmVersionTypeConfig version);
    
    /**
     * Unsets the "version" attribute
     */
    void unsetVersion();
    
    /**
     * Gets the "ackTo" attribute
     */
    java.lang.String getAckTo();
    
    /**
     * Gets (as xml) the "ackTo" attribute
     */
    org.apache.xmlbeans.XmlString xgetAckTo();
    
    /**
     * True if has "ackTo" attribute
     */
    boolean isSetAckTo();
    
    /**
     * Sets the "ackTo" attribute
     */
    void setAckTo(java.lang.String ackTo);
    
    /**
     * Sets (as xml) the "ackTo" attribute
     */
    void xsetAckTo(org.apache.xmlbeans.XmlString ackTo);
    
    /**
     * Unsets the "ackTo" attribute
     */
    void unsetAckTo();
    
    /**
     * Gets the "sequenceExpires" attribute
     */
    java.math.BigInteger getSequenceExpires();
    
    /**
     * Gets (as xml) the "sequenceExpires" attribute
     */
    org.apache.xmlbeans.XmlInteger xgetSequenceExpires();
    
    /**
     * True if has "sequenceExpires" attribute
     */
    boolean isSetSequenceExpires();
    
    /**
     * Sets the "sequenceExpires" attribute
     */
    void setSequenceExpires(java.math.BigInteger sequenceExpires);
    
    /**
     * Sets (as xml) the "sequenceExpires" attribute
     */
    void xsetSequenceExpires(org.apache.xmlbeans.XmlInteger sequenceExpires);
    
    /**
     * Unsets the "sequenceExpires" attribute
     */
    void unsetSequenceExpires();
    
    /**
     * Gets the "offerEndpoint" attribute
     */
    java.lang.String getOfferEndpoint();
    
    /**
     * Gets (as xml) the "offerEndpoint" attribute
     */
    org.apache.xmlbeans.XmlString xgetOfferEndpoint();
    
    /**
     * True if has "offerEndpoint" attribute
     */
    boolean isSetOfferEndpoint();
    
    /**
     * Sets the "offerEndpoint" attribute
     */
    void setOfferEndpoint(java.lang.String offerEndpoint);
    
    /**
     * Sets (as xml) the "offerEndpoint" attribute
     */
    void xsetOfferEndpoint(org.apache.xmlbeans.XmlString offerEndpoint);
    
    /**
     * Unsets the "offerEndpoint" attribute
     */
    void unsetOfferEndpoint();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.WsrmConfigConfig newInstance() {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.WsrmConfigConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WsrmConfigConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WsrmConfigConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WsrmConfigConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
