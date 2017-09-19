/*
 * XML Type:  RestService
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestServiceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML RestService(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface RestServiceConfig extends com.eviware.soapui.config.InterfaceConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RestServiceConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("restservicec9e1type");
    
    /**
     * Gets a List of "resource" elements
     */
    java.util.List<com.eviware.soapui.config.RestResourceConfig> getResourceList();
    
    /**
     * Gets array of all "resource" elements
     * @deprecated
     */
    com.eviware.soapui.config.RestResourceConfig[] getResourceArray();
    
    /**
     * Gets ith "resource" element
     */
    com.eviware.soapui.config.RestResourceConfig getResourceArray(int i);
    
    /**
     * Returns number of "resource" element
     */
    int sizeOfResourceArray();
    
    /**
     * Sets array of all "resource" element
     */
    void setResourceArray(com.eviware.soapui.config.RestResourceConfig[] resourceArray);
    
    /**
     * Sets ith "resource" element
     */
    void setResourceArray(int i, com.eviware.soapui.config.RestResourceConfig resource);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resource" element
     */
    com.eviware.soapui.config.RestResourceConfig insertNewResource(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resource" element
     */
    com.eviware.soapui.config.RestResourceConfig addNewResource();
    
    /**
     * Removes the ith "resource" element
     */
    void removeResource(int i);
    
    /**
     * Gets the "inferredSchema" element
     */
    java.lang.String getInferredSchema();
    
    /**
     * Gets (as xml) the "inferredSchema" element
     */
    org.apache.xmlbeans.XmlString xgetInferredSchema();
    
    /**
     * True if has "inferredSchema" element
     */
    boolean isSetInferredSchema();
    
    /**
     * Sets the "inferredSchema" element
     */
    void setInferredSchema(java.lang.String inferredSchema);
    
    /**
     * Sets (as xml) the "inferredSchema" element
     */
    void xsetInferredSchema(org.apache.xmlbeans.XmlString inferredSchema);
    
    /**
     * Unsets the "inferredSchema" element
     */
    void unsetInferredSchema();
    
    /**
     * Gets the "definitionUrl" attribute
     */
    java.lang.String getDefinitionUrl();
    
    /**
     * Gets (as xml) the "definitionUrl" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefinitionUrl();
    
    /**
     * True if has "definitionUrl" attribute
     */
    boolean isSetDefinitionUrl();
    
    /**
     * Sets the "definitionUrl" attribute
     */
    void setDefinitionUrl(java.lang.String definitionUrl);
    
    /**
     * Sets (as xml) the "definitionUrl" attribute
     */
    void xsetDefinitionUrl(org.apache.xmlbeans.XmlString definitionUrl);
    
    /**
     * Unsets the "definitionUrl" attribute
     */
    void unsetDefinitionUrl();
    
    /**
     * Gets the "basePath" attribute
     */
    java.lang.String getBasePath();
    
    /**
     * Gets (as xml) the "basePath" attribute
     */
    org.apache.xmlbeans.XmlString xgetBasePath();
    
    /**
     * True if has "basePath" attribute
     */
    boolean isSetBasePath();
    
    /**
     * Sets the "basePath" attribute
     */
    void setBasePath(java.lang.String basePath);
    
    /**
     * Sets (as xml) the "basePath" attribute
     */
    void xsetBasePath(org.apache.xmlbeans.XmlString basePath);
    
    /**
     * Unsets the "basePath" attribute
     */
    void unsetBasePath();
    
    /**
     * Gets the "wadlVersion" attribute
     */
    java.lang.String getWadlVersion();
    
    /**
     * Gets (as xml) the "wadlVersion" attribute
     */
    org.apache.xmlbeans.XmlString xgetWadlVersion();
    
    /**
     * True if has "wadlVersion" attribute
     */
    boolean isSetWadlVersion();
    
    /**
     * Sets the "wadlVersion" attribute
     */
    void setWadlVersion(java.lang.String wadlVersion);
    
    /**
     * Sets (as xml) the "wadlVersion" attribute
     */
    void xsetWadlVersion(org.apache.xmlbeans.XmlString wadlVersion);
    
    /**
     * Unsets the "wadlVersion" attribute
     */
    void unsetWadlVersion();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.RestServiceConfig newInstance() {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.RestServiceConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.RestServiceConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.RestServiceConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestServiceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestServiceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestServiceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
