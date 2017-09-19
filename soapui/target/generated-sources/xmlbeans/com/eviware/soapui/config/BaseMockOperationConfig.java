/*
 * XML Type:  BaseMockOperation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BaseMockOperationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML BaseMockOperation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface BaseMockOperationConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseMockOperationConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("basemockoperation6916type");
    
    /**
     * Gets the "defaultResponse" element
     */
    java.lang.String getDefaultResponse();
    
    /**
     * Gets (as xml) the "defaultResponse" element
     */
    org.apache.xmlbeans.XmlString xgetDefaultResponse();
    
    /**
     * True if has "defaultResponse" element
     */
    boolean isSetDefaultResponse();
    
    /**
     * Sets the "defaultResponse" element
     */
    void setDefaultResponse(java.lang.String defaultResponse);
    
    /**
     * Sets (as xml) the "defaultResponse" element
     */
    void xsetDefaultResponse(org.apache.xmlbeans.XmlString defaultResponse);
    
    /**
     * Unsets the "defaultResponse" element
     */
    void unsetDefaultResponse();
    
    /**
     * Gets the "dispatchStyle" element
     */
    com.eviware.soapui.config.MockOperationDispatchStyleConfig.Enum getDispatchStyle();
    
    /**
     * Gets (as xml) the "dispatchStyle" element
     */
    com.eviware.soapui.config.MockOperationDispatchStyleConfig xgetDispatchStyle();
    
    /**
     * True if has "dispatchStyle" element
     */
    boolean isSetDispatchStyle();
    
    /**
     * Sets the "dispatchStyle" element
     */
    void setDispatchStyle(com.eviware.soapui.config.MockOperationDispatchStyleConfig.Enum dispatchStyle);
    
    /**
     * Sets (as xml) the "dispatchStyle" element
     */
    void xsetDispatchStyle(com.eviware.soapui.config.MockOperationDispatchStyleConfig dispatchStyle);
    
    /**
     * Unsets the "dispatchStyle" element
     */
    void unsetDispatchStyle();
    
    /**
     * Gets the "dispatchPath" element
     */
    java.lang.String getDispatchPath();
    
    /**
     * Gets (as xml) the "dispatchPath" element
     */
    org.apache.xmlbeans.XmlString xgetDispatchPath();
    
    /**
     * True if has "dispatchPath" element
     */
    boolean isSetDispatchPath();
    
    /**
     * Sets the "dispatchPath" element
     */
    void setDispatchPath(java.lang.String dispatchPath);
    
    /**
     * Sets (as xml) the "dispatchPath" element
     */
    void xsetDispatchPath(org.apache.xmlbeans.XmlString dispatchPath);
    
    /**
     * Unsets the "dispatchPath" element
     */
    void unsetDispatchPath();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.BaseMockOperationConfig newInstance() {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.BaseMockOperationConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.BaseMockOperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
