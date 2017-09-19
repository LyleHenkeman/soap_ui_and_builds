/*
 * XML Type:  HttpRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.HttpRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML HttpRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface HttpRequestConfig extends com.eviware.soapui.config.AbstractRequestConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(HttpRequestConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("httprequeste9fbtype");
    
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
     * Gets the "mediaType" attribute
     */
    java.lang.String getMediaType();
    
    /**
     * Gets (as xml) the "mediaType" attribute
     */
    org.apache.xmlbeans.XmlString xgetMediaType();
    
    /**
     * True if has "mediaType" attribute
     */
    boolean isSetMediaType();
    
    /**
     * Sets the "mediaType" attribute
     */
    void setMediaType(java.lang.String mediaType);
    
    /**
     * Sets (as xml) the "mediaType" attribute
     */
    void xsetMediaType(org.apache.xmlbeans.XmlString mediaType);
    
    /**
     * Unsets the "mediaType" attribute
     */
    void unsetMediaType();
    
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
     * Gets the "postQueryString" attribute
     */
    boolean getPostQueryString();
    
    /**
     * Gets (as xml) the "postQueryString" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPostQueryString();
    
    /**
     * True if has "postQueryString" attribute
     */
    boolean isSetPostQueryString();
    
    /**
     * Sets the "postQueryString" attribute
     */
    void setPostQueryString(boolean postQueryString);
    
    /**
     * Sets (as xml) the "postQueryString" attribute
     */
    void xsetPostQueryString(org.apache.xmlbeans.XmlBoolean postQueryString);
    
    /**
     * Unsets the "postQueryString" attribute
     */
    void unsetPostQueryString();
    
    /**
     * Gets the "downloadIncludedResources" attribute
     */
    boolean getDownloadIncludedResources();
    
    /**
     * Gets (as xml) the "downloadIncludedResources" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDownloadIncludedResources();
    
    /**
     * True if has "downloadIncludedResources" attribute
     */
    boolean isSetDownloadIncludedResources();
    
    /**
     * Sets the "downloadIncludedResources" attribute
     */
    void setDownloadIncludedResources(boolean downloadIncludedResources);
    
    /**
     * Sets (as xml) the "downloadIncludedResources" attribute
     */
    void xsetDownloadIncludedResources(org.apache.xmlbeans.XmlBoolean downloadIncludedResources);
    
    /**
     * Unsets the "downloadIncludedResources" attribute
     */
    void unsetDownloadIncludedResources();
    
    /**
     * Gets the "multiValueDelimiter" attribute
     */
    java.lang.String getMultiValueDelimiter();
    
    /**
     * Gets (as xml) the "multiValueDelimiter" attribute
     */
    org.apache.xmlbeans.XmlString xgetMultiValueDelimiter();
    
    /**
     * True if has "multiValueDelimiter" attribute
     */
    boolean isSetMultiValueDelimiter();
    
    /**
     * Sets the "multiValueDelimiter" attribute
     */
    void setMultiValueDelimiter(java.lang.String multiValueDelimiter);
    
    /**
     * Sets (as xml) the "multiValueDelimiter" attribute
     */
    void xsetMultiValueDelimiter(org.apache.xmlbeans.XmlString multiValueDelimiter);
    
    /**
     * Unsets the "multiValueDelimiter" attribute
     */
    void unsetMultiValueDelimiter();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.HttpRequestConfig newInstance() {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.HttpRequestConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.HttpRequestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.HttpRequestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.HttpRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
