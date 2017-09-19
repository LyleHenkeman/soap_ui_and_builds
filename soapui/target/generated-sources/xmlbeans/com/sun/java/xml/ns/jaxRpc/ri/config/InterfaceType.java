/*
 * XML Type:  interfaceType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config;


/**
 * An XML interfaceType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public interface InterfaceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InterfaceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("interfacetyped5d2type");
    
    /**
     * Gets the "handlerChains" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType getHandlerChains();
    
    /**
     * True if has "handlerChains" element
     */
    boolean isSetHandlerChains();
    
    /**
     * Sets the "handlerChains" element
     */
    void setHandlerChains(com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType handlerChains);
    
    /**
     * Appends and returns a new empty "handlerChains" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType addNewHandlerChains();
    
    /**
     * Unsets the "handlerChains" element
     */
    void unsetHandlerChains();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "servantName" attribute
     */
    java.lang.String getServantName();
    
    /**
     * Gets (as xml) the "servantName" attribute
     */
    org.apache.xmlbeans.XmlString xgetServantName();
    
    /**
     * True if has "servantName" attribute
     */
    boolean isSetServantName();
    
    /**
     * Sets the "servantName" attribute
     */
    void setServantName(java.lang.String servantName);
    
    /**
     * Sets (as xml) the "servantName" attribute
     */
    void xsetServantName(org.apache.xmlbeans.XmlString servantName);
    
    /**
     * Unsets the "servantName" attribute
     */
    void unsetServantName();
    
    /**
     * Gets the "soapAction" attribute
     */
    java.lang.String getSoapAction();
    
    /**
     * Gets (as xml) the "soapAction" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoapAction();
    
    /**
     * True if has "soapAction" attribute
     */
    boolean isSetSoapAction();
    
    /**
     * Sets the "soapAction" attribute
     */
    void setSoapAction(java.lang.String soapAction);
    
    /**
     * Sets (as xml) the "soapAction" attribute
     */
    void xsetSoapAction(org.apache.xmlbeans.XmlString soapAction);
    
    /**
     * Unsets the "soapAction" attribute
     */
    void unsetSoapAction();
    
    /**
     * Gets the "soapActionBase" attribute
     */
    java.lang.String getSoapActionBase();
    
    /**
     * Gets (as xml) the "soapActionBase" attribute
     */
    org.apache.xmlbeans.XmlString xgetSoapActionBase();
    
    /**
     * True if has "soapActionBase" attribute
     */
    boolean isSetSoapActionBase();
    
    /**
     * Sets the "soapActionBase" attribute
     */
    void setSoapActionBase(java.lang.String soapActionBase);
    
    /**
     * Sets (as xml) the "soapActionBase" attribute
     */
    void xsetSoapActionBase(org.apache.xmlbeans.XmlString soapActionBase);
    
    /**
     * Unsets the "soapActionBase" attribute
     */
    void unsetSoapActionBase();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType newInstance() {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
