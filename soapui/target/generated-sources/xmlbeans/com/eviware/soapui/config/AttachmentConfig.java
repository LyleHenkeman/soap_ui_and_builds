/*
 * XML Type:  Attachment
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AttachmentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML Attachment(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface AttachmentConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AttachmentConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("attachment520dtype");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "contentType" element
     */
    java.lang.String getContentType();
    
    /**
     * Gets (as xml) the "contentType" element
     */
    org.apache.xmlbeans.XmlString xgetContentType();
    
    /**
     * Sets the "contentType" element
     */
    void setContentType(java.lang.String contentType);
    
    /**
     * Sets (as xml) the "contentType" element
     */
    void xsetContentType(org.apache.xmlbeans.XmlString contentType);
    
    /**
     * Gets the "size" element
     */
    long getSize();
    
    /**
     * Gets (as xml) the "size" element
     */
    org.apache.xmlbeans.XmlLong xgetSize();
    
    /**
     * Sets the "size" element
     */
    void setSize(long size);
    
    /**
     * Sets (as xml) the "size" element
     */
    void xsetSize(org.apache.xmlbeans.XmlLong size);
    
    /**
     * Gets the "tempFilename" element
     */
    java.lang.String getTempFilename();
    
    /**
     * Gets (as xml) the "tempFilename" element
     */
    org.apache.xmlbeans.XmlString xgetTempFilename();
    
    /**
     * True if has "tempFilename" element
     */
    boolean isSetTempFilename();
    
    /**
     * Sets the "tempFilename" element
     */
    void setTempFilename(java.lang.String tempFilename);
    
    /**
     * Sets (as xml) the "tempFilename" element
     */
    void xsetTempFilename(org.apache.xmlbeans.XmlString tempFilename);
    
    /**
     * Unsets the "tempFilename" element
     */
    void unsetTempFilename();
    
    /**
     * Gets the "contentId" element
     */
    java.lang.String getContentId();
    
    /**
     * Gets (as xml) the "contentId" element
     */
    org.apache.xmlbeans.XmlString xgetContentId();
    
    /**
     * True if has "contentId" element
     */
    boolean isSetContentId();
    
    /**
     * Sets the "contentId" element
     */
    void setContentId(java.lang.String contentId);
    
    /**
     * Sets (as xml) the "contentId" element
     */
    void xsetContentId(org.apache.xmlbeans.XmlString contentId);
    
    /**
     * Unsets the "contentId" element
     */
    void unsetContentId();
    
    /**
     * Gets the "part" element
     */
    java.lang.String getPart();
    
    /**
     * Gets (as xml) the "part" element
     */
    org.apache.xmlbeans.XmlString xgetPart();
    
    /**
     * Sets the "part" element
     */
    void setPart(java.lang.String part);
    
    /**
     * Sets (as xml) the "part" element
     */
    void xsetPart(org.apache.xmlbeans.XmlString part);
    
    /**
     * Gets the "url" element
     */
    java.lang.String getUrl();
    
    /**
     * Gets (as xml) the "url" element
     */
    org.apache.xmlbeans.XmlString xgetUrl();
    
    /**
     * True if has "url" element
     */
    boolean isSetUrl();
    
    /**
     * Sets the "url" element
     */
    void setUrl(java.lang.String url);
    
    /**
     * Sets (as xml) the "url" element
     */
    void xsetUrl(org.apache.xmlbeans.XmlString url);
    
    /**
     * Unsets the "url" element
     */
    void unsetUrl();
    
    /**
     * Gets the "data" element
     */
    byte[] getData();
    
    /**
     * Gets (as xml) the "data" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetData();
    
    /**
     * True if has "data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "data" element
     */
    void setData(byte[] data);
    
    /**
     * Sets (as xml) the "data" element
     */
    void xsetData(org.apache.xmlbeans.XmlBase64Binary data);
    
    /**
     * Unsets the "data" element
     */
    void unsetData();
    
    /**
     * Gets the "id" element
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" element
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * Sets the "id" element
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" element
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.AttachmentConfig newInstance() {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.AttachmentConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.AttachmentConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.AttachmentConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.AttachmentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.AttachmentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.AttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
