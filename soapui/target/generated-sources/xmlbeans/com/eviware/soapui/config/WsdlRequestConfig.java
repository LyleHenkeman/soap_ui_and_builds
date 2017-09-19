/*
 * XML Type:  WsdlRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WsdlRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML WsdlRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface WsdlRequestConfig extends com.eviware.soapui.config.AbstractRequestConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WsdlRequestConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("wsdlrequesta9d7type");
    
    /**
     * Gets the "wsaConfig" element
     */
    com.eviware.soapui.config.WsaConfigConfig getWsaConfig();
    
    /**
     * True if has "wsaConfig" element
     */
    boolean isSetWsaConfig();
    
    /**
     * Sets the "wsaConfig" element
     */
    void setWsaConfig(com.eviware.soapui.config.WsaConfigConfig wsaConfig);
    
    /**
     * Appends and returns a new empty "wsaConfig" element
     */
    com.eviware.soapui.config.WsaConfigConfig addNewWsaConfig();
    
    /**
     * Unsets the "wsaConfig" element
     */
    void unsetWsaConfig();
    
    /**
     * Gets the "wsrmConfig" element
     */
    com.eviware.soapui.config.WsrmConfigConfig getWsrmConfig();
    
    /**
     * True if has "wsrmConfig" element
     */
    boolean isSetWsrmConfig();
    
    /**
     * Sets the "wsrmConfig" element
     */
    void setWsrmConfig(com.eviware.soapui.config.WsrmConfigConfig wsrmConfig);
    
    /**
     * Appends and returns a new empty "wsrmConfig" element
     */
    com.eviware.soapui.config.WsrmConfigConfig addNewWsrmConfig();
    
    /**
     * Unsets the "wsrmConfig" element
     */
    void unsetWsrmConfig();
    
    /**
     * Gets the "wssPasswordType" attribute
     */
    java.lang.String getWssPasswordType();
    
    /**
     * Gets (as xml) the "wssPasswordType" attribute
     */
    org.apache.xmlbeans.XmlString xgetWssPasswordType();
    
    /**
     * True if has "wssPasswordType" attribute
     */
    boolean isSetWssPasswordType();
    
    /**
     * Sets the "wssPasswordType" attribute
     */
    void setWssPasswordType(java.lang.String wssPasswordType);
    
    /**
     * Sets (as xml) the "wssPasswordType" attribute
     */
    void xsetWssPasswordType(org.apache.xmlbeans.XmlString wssPasswordType);
    
    /**
     * Unsets the "wssPasswordType" attribute
     */
    void unsetWssPasswordType();
    
    /**
     * Gets the "outgoingWss" attribute
     */
    java.lang.String getOutgoingWss();
    
    /**
     * Gets (as xml) the "outgoingWss" attribute
     */
    org.apache.xmlbeans.XmlString xgetOutgoingWss();
    
    /**
     * True if has "outgoingWss" attribute
     */
    boolean isSetOutgoingWss();
    
    /**
     * Sets the "outgoingWss" attribute
     */
    void setOutgoingWss(java.lang.String outgoingWss);
    
    /**
     * Sets (as xml) the "outgoingWss" attribute
     */
    void xsetOutgoingWss(org.apache.xmlbeans.XmlString outgoingWss);
    
    /**
     * Unsets the "outgoingWss" attribute
     */
    void unsetOutgoingWss();
    
    /**
     * Gets the "incomingWss" attribute
     */
    java.lang.String getIncomingWss();
    
    /**
     * Gets (as xml) the "incomingWss" attribute
     */
    org.apache.xmlbeans.XmlString xgetIncomingWss();
    
    /**
     * True if has "incomingWss" attribute
     */
    boolean isSetIncomingWss();
    
    /**
     * Sets the "incomingWss" attribute
     */
    void setIncomingWss(java.lang.String incomingWss);
    
    /**
     * Sets (as xml) the "incomingWss" attribute
     */
    void xsetIncomingWss(org.apache.xmlbeans.XmlString incomingWss);
    
    /**
     * Unsets the "incomingWss" attribute
     */
    void unsetIncomingWss();
    
    /**
     * Gets the "useWsAddressing" attribute
     */
    boolean getUseWsAddressing();
    
    /**
     * Gets (as xml) the "useWsAddressing" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseWsAddressing();
    
    /**
     * True if has "useWsAddressing" attribute
     */
    boolean isSetUseWsAddressing();
    
    /**
     * Sets the "useWsAddressing" attribute
     */
    void setUseWsAddressing(boolean useWsAddressing);
    
    /**
     * Sets (as xml) the "useWsAddressing" attribute
     */
    void xsetUseWsAddressing(org.apache.xmlbeans.XmlBoolean useWsAddressing);
    
    /**
     * Unsets the "useWsAddressing" attribute
     */
    void unsetUseWsAddressing();
    
    /**
     * Gets the "useWsReliableMessaging" attribute
     */
    boolean getUseWsReliableMessaging();
    
    /**
     * Gets (as xml) the "useWsReliableMessaging" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetUseWsReliableMessaging();
    
    /**
     * True if has "useWsReliableMessaging" attribute
     */
    boolean isSetUseWsReliableMessaging();
    
    /**
     * Sets the "useWsReliableMessaging" attribute
     */
    void setUseWsReliableMessaging(boolean useWsReliableMessaging);
    
    /**
     * Sets (as xml) the "useWsReliableMessaging" attribute
     */
    void xsetUseWsReliableMessaging(org.apache.xmlbeans.XmlBoolean useWsReliableMessaging);
    
    /**
     * Unsets the "useWsReliableMessaging" attribute
     */
    void unsetUseWsReliableMessaging();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.WsdlRequestConfig newInstance() {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.WsdlRequestConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WsdlRequestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WsdlRequestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WsdlRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
