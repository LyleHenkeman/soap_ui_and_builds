/*
 * XML Type:  LoadStrategy
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.LoadStrategyConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML LoadStrategy(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface LoadStrategyConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LoadStrategyConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("loadstrategy8db7type");
    
    /**
     * Gets the "type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Gets the "config" element
     */
    org.apache.xmlbeans.XmlObject getConfig();
    
    /**
     * Sets the "config" element
     */
    void setConfig(org.apache.xmlbeans.XmlObject config);
    
    /**
     * Appends and returns a new empty "config" element
     */
    org.apache.xmlbeans.XmlObject addNewConfig();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.LoadStrategyConfig newInstance() {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.LoadStrategyConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.LoadStrategyConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.LoadStrategyConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.LoadStrategyConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
