/*
 * XML Type:  MaliciousAttachment
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MaliciousAttachmentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MaliciousAttachment(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MaliciousAttachmentConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaliciousAttachmentConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("maliciousattachment1ca9type");
    
    /**
     * Gets the "filename" attribute
     */
    java.lang.String getFilename();
    
    /**
     * Gets (as xml) the "filename" attribute
     */
    org.apache.xmlbeans.XmlString xgetFilename();
    
    /**
     * True if has "filename" attribute
     */
    boolean isSetFilename();
    
    /**
     * Sets the "filename" attribute
     */
    void setFilename(java.lang.String filename);
    
    /**
     * Sets (as xml) the "filename" attribute
     */
    void xsetFilename(org.apache.xmlbeans.XmlString filename);
    
    /**
     * Unsets the "filename" attribute
     */
    void unsetFilename();
    
    /**
     * Gets the "size" attribute
     */
    long getSize();
    
    /**
     * Gets (as xml) the "size" attribute
     */
    org.apache.xmlbeans.XmlLong xgetSize();
    
    /**
     * True if has "size" attribute
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" attribute
     */
    void setSize(long size);
    
    /**
     * Sets (as xml) the "size" attribute
     */
    void xsetSize(org.apache.xmlbeans.XmlLong size);
    
    /**
     * Unsets the "size" attribute
     */
    void unsetSize();
    
    /**
     * Gets the "contentType" attribute
     */
    java.lang.String getContentType();
    
    /**
     * Gets (as xml) the "contentType" attribute
     */
    org.apache.xmlbeans.XmlString xgetContentType();
    
    /**
     * True if has "contentType" attribute
     */
    boolean isSetContentType();
    
    /**
     * Sets the "contentType" attribute
     */
    void setContentType(java.lang.String contentType);
    
    /**
     * Sets (as xml) the "contentType" attribute
     */
    void xsetContentType(org.apache.xmlbeans.XmlString contentType);
    
    /**
     * Unsets the "contentType" attribute
     */
    void unsetContentType();
    
    /**
     * Gets the "enabled" attribute
     */
    boolean getEnabled();
    
    /**
     * Gets (as xml) the "enabled" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEnabled();
    
    /**
     * True if has "enabled" attribute
     */
    boolean isSetEnabled();
    
    /**
     * Sets the "enabled" attribute
     */
    void setEnabled(boolean enabled);
    
    /**
     * Sets (as xml) the "enabled" attribute
     */
    void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled);
    
    /**
     * Unsets the "enabled" attribute
     */
    void unsetEnabled();
    
    /**
     * Gets the "cached" attribute
     */
    boolean getCached();
    
    /**
     * Gets (as xml) the "cached" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCached();
    
    /**
     * True if has "cached" attribute
     */
    boolean isSetCached();
    
    /**
     * Sets the "cached" attribute
     */
    void setCached(boolean cached);
    
    /**
     * Sets (as xml) the "cached" attribute
     */
    void xsetCached(org.apache.xmlbeans.XmlBoolean cached);
    
    /**
     * Unsets the "cached" attribute
     */
    void unsetCached();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MaliciousAttachmentConfig newInstance() {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MaliciousAttachmentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MaliciousAttachmentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
