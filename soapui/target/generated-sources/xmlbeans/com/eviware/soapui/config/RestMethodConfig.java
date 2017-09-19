/*
 * XML Type:  RestMethod
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestMethodConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML RestMethod(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface RestMethodConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RestMethodConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("restmethod1f9btype");
    
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
     * Gets a List of "representation" elements
     */
    java.util.List<com.eviware.soapui.config.RestResourceRepresentationConfig> getRepresentationList();
    
    /**
     * Gets array of all "representation" elements
     * @deprecated
     */
    com.eviware.soapui.config.RestResourceRepresentationConfig[] getRepresentationArray();
    
    /**
     * Gets ith "representation" element
     */
    com.eviware.soapui.config.RestResourceRepresentationConfig getRepresentationArray(int i);
    
    /**
     * Returns number of "representation" element
     */
    int sizeOfRepresentationArray();
    
    /**
     * Sets array of all "representation" element
     */
    void setRepresentationArray(com.eviware.soapui.config.RestResourceRepresentationConfig[] representationArray);
    
    /**
     * Sets ith "representation" element
     */
    void setRepresentationArray(int i, com.eviware.soapui.config.RestResourceRepresentationConfig representation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "representation" element
     */
    com.eviware.soapui.config.RestResourceRepresentationConfig insertNewRepresentation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "representation" element
     */
    com.eviware.soapui.config.RestResourceRepresentationConfig addNewRepresentation();
    
    /**
     * Removes the ith "representation" element
     */
    void removeRepresentation(int i);
    
    /**
     * Gets a List of "request" elements
     */
    java.util.List<com.eviware.soapui.config.RestRequestConfig> getRequestList();
    
    /**
     * Gets array of all "request" elements
     * @deprecated
     */
    com.eviware.soapui.config.RestRequestConfig[] getRequestArray();
    
    /**
     * Gets ith "request" element
     */
    com.eviware.soapui.config.RestRequestConfig getRequestArray(int i);
    
    /**
     * Returns number of "request" element
     */
    int sizeOfRequestArray();
    
    /**
     * Sets array of all "request" element
     */
    void setRequestArray(com.eviware.soapui.config.RestRequestConfig[] requestArray);
    
    /**
     * Sets ith "request" element
     */
    void setRequestArray(int i, com.eviware.soapui.config.RestRequestConfig request);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "request" element
     */
    com.eviware.soapui.config.RestRequestConfig insertNewRequest(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "request" element
     */
    com.eviware.soapui.config.RestRequestConfig addNewRequest();
    
    /**
     * Removes the ith "request" element
     */
    void removeRequest(int i);
    
    /**
     * Gets the "method" attribute
     */
    java.lang.String getMethod();
    
    /**
     * Gets (as xml) the "method" attribute
     */
    org.apache.xmlbeans.XmlString xgetMethod();
    
    /**
     * True if has "method" attribute
     */
    boolean isSetMethod();
    
    /**
     * Sets the "method" attribute
     */
    void setMethod(java.lang.String method);
    
    /**
     * Sets (as xml) the "method" attribute
     */
    void xsetMethod(org.apache.xmlbeans.XmlString method);
    
    /**
     * Unsets the "method" attribute
     */
    void unsetMethod();
    
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
        public static com.eviware.soapui.config.RestMethodConfig newInstance() {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.RestMethodConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.RestMethodConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.RestMethodConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestMethodConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestMethodConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestMethodConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
