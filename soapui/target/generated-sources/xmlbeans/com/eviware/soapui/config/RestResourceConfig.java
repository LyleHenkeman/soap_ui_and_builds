/*
 * XML Type:  RestResource
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestResourceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML RestResource(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface RestResourceConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RestResourceConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("restresourceb94etype");
    
    /**
     * Gets the "parameters" element
     */
    com.eviware.soapui.config.RestParametersConfig getParameters();
    
    /**
     * Sets the "parameters" element
     */
    void setParameters(com.eviware.soapui.config.RestParametersConfig parameters);
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    com.eviware.soapui.config.RestParametersConfig addNewParameters();
    
    /**
     * Gets a List of "request" elements
     */
    java.util.List<com.eviware.soapui.config.OldRestRequestConfig> getRequestList();
    
    /**
     * Gets array of all "request" elements
     * @deprecated
     */
    com.eviware.soapui.config.OldRestRequestConfig[] getRequestArray();
    
    /**
     * Gets ith "request" element
     */
    com.eviware.soapui.config.OldRestRequestConfig getRequestArray(int i);
    
    /**
     * Returns number of "request" element
     */
    int sizeOfRequestArray();
    
    /**
     * Sets array of all "request" element
     */
    void setRequestArray(com.eviware.soapui.config.OldRestRequestConfig[] requestArray);
    
    /**
     * Sets ith "request" element
     */
    void setRequestArray(int i, com.eviware.soapui.config.OldRestRequestConfig request);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "request" element
     */
    com.eviware.soapui.config.OldRestRequestConfig insertNewRequest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "request" element
     */
    com.eviware.soapui.config.OldRestRequestConfig addNewRequest();
    
    /**
     * Removes the ith "request" element
     */
    void removeRequest(int i);
    
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
     * Gets a List of "method" elements
     */
    java.util.List<com.eviware.soapui.config.RestMethodConfig> getMethodList();
    
    /**
     * Gets array of all "method" elements
     * @deprecated
     */
    com.eviware.soapui.config.RestMethodConfig[] getMethodArray();
    
    /**
     * Gets ith "method" element
     */
    com.eviware.soapui.config.RestMethodConfig getMethodArray(int i);
    
    /**
     * Returns number of "method" element
     */
    int sizeOfMethodArray();
    
    /**
     * Sets array of all "method" element
     */
    void setMethodArray(com.eviware.soapui.config.RestMethodConfig[] methodArray);
    
    /**
     * Sets ith "method" element
     */
    void setMethodArray(int i, com.eviware.soapui.config.RestMethodConfig method);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method" element
     */
    com.eviware.soapui.config.RestMethodConfig insertNewMethod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method" element
     */
    com.eviware.soapui.config.RestMethodConfig addNewMethod();
    
    /**
     * Removes the ith "method" element
     */
    void removeMethod(int i);
    
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
     * Gets the "wadlId" attribute
     */
    java.lang.String getWadlId();
    
    /**
     * Gets (as xml) the "wadlId" attribute
     */
    org.apache.xmlbeans.XmlString xgetWadlId();
    
    /**
     * True if has "wadlId" attribute
     */
    boolean isSetWadlId();
    
    /**
     * Sets the "wadlId" attribute
     */
    void setWadlId(java.lang.String wadlId);
    
    /**
     * Sets (as xml) the "wadlId" attribute
     */
    void xsetWadlId(org.apache.xmlbeans.XmlString wadlId);
    
    /**
     * Unsets the "wadlId" attribute
     */
    void unsetWadlId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.RestResourceConfig newInstance() {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.RestResourceConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.RestResourceConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.RestResourceConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestResourceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestResourceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestResourceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
