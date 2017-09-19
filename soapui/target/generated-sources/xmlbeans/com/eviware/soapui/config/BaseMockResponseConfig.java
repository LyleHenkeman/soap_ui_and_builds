/*
 * XML Type:  BaseMockResponse
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BaseMockResponseConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML BaseMockResponse(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface BaseMockResponseConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BaseMockResponseConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("basemockresponse27b4type");
    
    /**
     * Gets the "script" element
     */
    com.eviware.soapui.config.ScriptConfig getScript();
    
    /**
     * True if has "script" element
     */
    boolean isSetScript();
    
    /**
     * Sets the "script" element
     */
    void setScript(com.eviware.soapui.config.ScriptConfig script);
    
    /**
     * Appends and returns a new empty "script" element
     */
    com.eviware.soapui.config.ScriptConfig addNewScript();
    
    /**
     * Unsets the "script" element
     */
    void unsetScript();
    
    /**
     * Gets the "responseContent" element
     */
    com.eviware.soapui.config.CompressedStringConfig getResponseContent();
    
    /**
     * Sets the "responseContent" element
     */
    void setResponseContent(com.eviware.soapui.config.CompressedStringConfig responseContent);
    
    /**
     * Appends and returns a new empty "responseContent" element
     */
    com.eviware.soapui.config.CompressedStringConfig addNewResponseContent();
    
    /**
     * Gets a List of "attachment" elements
     */
    java.util.List<com.eviware.soapui.config.AttachmentConfig> getAttachmentList();
    
    /**
     * Gets array of all "attachment" elements
     * @deprecated
     */
    com.eviware.soapui.config.AttachmentConfig[] getAttachmentArray();
    
    /**
     * Gets ith "attachment" element
     */
    com.eviware.soapui.config.AttachmentConfig getAttachmentArray(int i);
    
    /**
     * Returns number of "attachment" element
     */
    int sizeOfAttachmentArray();
    
    /**
     * Sets array of all "attachment" element
     */
    void setAttachmentArray(com.eviware.soapui.config.AttachmentConfig[] attachmentArray);
    
    /**
     * Sets ith "attachment" element
     */
    void setAttachmentArray(int i, com.eviware.soapui.config.AttachmentConfig attachment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attachment" element
     */
    com.eviware.soapui.config.AttachmentConfig insertNewAttachment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attachment" element
     */
    com.eviware.soapui.config.AttachmentConfig addNewAttachment();
    
    /**
     * Removes the ith "attachment" element
     */
    void removeAttachment(int i);
    
    /**
     * Gets a List of "header" elements
     */
    java.util.List<com.eviware.soapui.config.HeaderConfig> getHeaderList();
    
    /**
     * Gets array of all "header" elements
     * @deprecated
     */
    com.eviware.soapui.config.HeaderConfig[] getHeaderArray();
    
    /**
     * Gets ith "header" element
     */
    com.eviware.soapui.config.HeaderConfig getHeaderArray(int i);
    
    /**
     * Returns number of "header" element
     */
    int sizeOfHeaderArray();
    
    /**
     * Sets array of all "header" element
     */
    void setHeaderArray(com.eviware.soapui.config.HeaderConfig[] headerArray);
    
    /**
     * Sets ith "header" element
     */
    void setHeaderArray(int i, com.eviware.soapui.config.HeaderConfig header);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "header" element
     */
    com.eviware.soapui.config.HeaderConfig insertNewHeader(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "header" element
     */
    com.eviware.soapui.config.HeaderConfig addNewHeader();
    
    /**
     * Removes the ith "header" element
     */
    void removeHeader(int i);
    
    /**
     * Gets the "httpResponseStatus" attribute
     */
    java.lang.String getHttpResponseStatus();
    
    /**
     * Gets (as xml) the "httpResponseStatus" attribute
     */
    org.apache.xmlbeans.XmlString xgetHttpResponseStatus();
    
    /**
     * True if has "httpResponseStatus" attribute
     */
    boolean isSetHttpResponseStatus();
    
    /**
     * Sets the "httpResponseStatus" attribute
     */
    void setHttpResponseStatus(java.lang.String httpResponseStatus);
    
    /**
     * Sets (as xml) the "httpResponseStatus" attribute
     */
    void xsetHttpResponseStatus(org.apache.xmlbeans.XmlString httpResponseStatus);
    
    /**
     * Unsets the "httpResponseStatus" attribute
     */
    void unsetHttpResponseStatus();
    
    /**
     * Gets the "disabled" attribute
     */
    boolean getDisabled();
    
    /**
     * Gets (as xml) the "disabled" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDisabled();
    
    /**
     * True if has "disabled" attribute
     */
    boolean isSetDisabled();
    
    /**
     * Sets the "disabled" attribute
     */
    void setDisabled(boolean disabled);
    
    /**
     * Sets (as xml) the "disabled" attribute
     */
    void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled);
    
    /**
     * Unsets the "disabled" attribute
     */
    void unsetDisabled();
    
    /**
     * Gets the "compression" attribute
     */
    java.lang.String getCompression();
    
    /**
     * Gets (as xml) the "compression" attribute
     */
    org.apache.xmlbeans.XmlString xgetCompression();
    
    /**
     * True if has "compression" attribute
     */
    boolean isSetCompression();
    
    /**
     * Sets the "compression" attribute
     */
    void setCompression(java.lang.String compression);
    
    /**
     * Sets (as xml) the "compression" attribute
     */
    void xsetCompression(org.apache.xmlbeans.XmlString compression);
    
    /**
     * Unsets the "compression" attribute
     */
    void unsetCompression();
    
    /**
     * Gets the "encoding" attribute
     */
    java.lang.String getEncoding();
    
    /**
     * Gets (as xml) the "encoding" attribute
     */
    org.apache.xmlbeans.XmlString xgetEncoding();
    
    /**
     * True if has "encoding" attribute
     */
    boolean isSetEncoding();
    
    /**
     * Sets the "encoding" attribute
     */
    void setEncoding(java.lang.String encoding);
    
    /**
     * Sets (as xml) the "encoding" attribute
     */
    void xsetEncoding(org.apache.xmlbeans.XmlString encoding);
    
    /**
     * Unsets the "encoding" attribute
     */
    void unsetEncoding();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.BaseMockResponseConfig newInstance() {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.BaseMockResponseConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.BaseMockResponseConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
