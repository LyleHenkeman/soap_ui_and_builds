/*
 * XML Type:  AbstractRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.AbstractRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML AbstractRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface AbstractRequestConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AbstractRequestConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("abstractrequest0315type");
    
    /**
     * Gets the "encoding" element
     */
    java.lang.String getEncoding();
    
    /**
     * Gets (as xml) the "encoding" element
     */
    org.apache.xmlbeans.XmlString xgetEncoding();
    
    /**
     * Sets the "encoding" element
     */
    void setEncoding(java.lang.String encoding);
    
    /**
     * Sets (as xml) the "encoding" element
     */
    void xsetEncoding(org.apache.xmlbeans.XmlString encoding);
    
    /**
     * Gets the "endpoint" element
     */
    java.lang.String getEndpoint();
    
    /**
     * Gets (as xml) the "endpoint" element
     */
    org.apache.xmlbeans.XmlString xgetEndpoint();
    
    /**
     * Sets the "endpoint" element
     */
    void setEndpoint(java.lang.String endpoint);
    
    /**
     * Sets (as xml) the "endpoint" element
     */
    void xsetEndpoint(org.apache.xmlbeans.XmlString endpoint);
    
    /**
     * Gets the "request" element
     */
    com.eviware.soapui.config.CompressedStringConfig getRequest();
    
    /**
     * Sets the "request" element
     */
    void setRequest(com.eviware.soapui.config.CompressedStringConfig request);
    
    /**
     * Appends and returns a new empty "request" element
     */
    com.eviware.soapui.config.CompressedStringConfig addNewRequest();
    
    /**
     * Gets the "originalUri" element
     */
    java.lang.String getOriginalUri();
    
    /**
     * Gets (as xml) the "originalUri" element
     */
    org.apache.xmlbeans.XmlString xgetOriginalUri();
    
    /**
     * True if has "originalUri" element
     */
    boolean isSetOriginalUri();
    
    /**
     * Sets the "originalUri" element
     */
    void setOriginalUri(java.lang.String originalUri);
    
    /**
     * Sets (as xml) the "originalUri" element
     */
    void xsetOriginalUri(org.apache.xmlbeans.XmlString originalUri);
    
    /**
     * Unsets the "originalUri" element
     */
    void unsetOriginalUri();
    
    /**
     * Gets a List of "assertion" elements
     */
    java.util.List<com.eviware.soapui.config.TestAssertionConfig> getAssertionList();
    
    /**
     * Gets array of all "assertion" elements
     * @deprecated
     */
    com.eviware.soapui.config.TestAssertionConfig[] getAssertionArray();
    
    /**
     * Gets ith "assertion" element
     */
    com.eviware.soapui.config.TestAssertionConfig getAssertionArray(int i);
    
    /**
     * Returns number of "assertion" element
     */
    int sizeOfAssertionArray();
    
    /**
     * Sets array of all "assertion" element
     */
    void setAssertionArray(com.eviware.soapui.config.TestAssertionConfig[] assertionArray);
    
    /**
     * Sets ith "assertion" element
     */
    void setAssertionArray(int i, com.eviware.soapui.config.TestAssertionConfig assertion);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assertion" element
     */
    com.eviware.soapui.config.TestAssertionConfig insertNewAssertion(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assertion" element
     */
    com.eviware.soapui.config.TestAssertionConfig addNewAssertion();
    
    /**
     * Removes the ith "assertion" element
     */
    void removeAssertion(int i);
    
    /**
     * Gets the "credentials" element
     */
    com.eviware.soapui.config.CredentialsConfig getCredentials();
    
    /**
     * Sets the "credentials" element
     */
    void setCredentials(com.eviware.soapui.config.CredentialsConfig credentials);
    
    /**
     * Appends and returns a new empty "credentials" element
     */
    com.eviware.soapui.config.CredentialsConfig addNewCredentials();
    
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
     * Gets the "jmsConfig" element
     */
    com.eviware.soapui.config.JMSHeaderConfConfig getJmsConfig();
    
    /**
     * True if has "jmsConfig" element
     */
    boolean isSetJmsConfig();
    
    /**
     * Sets the "jmsConfig" element
     */
    void setJmsConfig(com.eviware.soapui.config.JMSHeaderConfConfig jmsConfig);
    
    /**
     * Appends and returns a new empty "jmsConfig" element
     */
    com.eviware.soapui.config.JMSHeaderConfConfig addNewJmsConfig();
    
    /**
     * Unsets the "jmsConfig" element
     */
    void unsetJmsConfig();
    
    /**
     * Gets the "jmsPropertyConfig" element
     */
    com.eviware.soapui.config.JMSPropertiesConfConfig getJmsPropertyConfig();
    
    /**
     * True if has "jmsPropertyConfig" element
     */
    boolean isSetJmsPropertyConfig();
    
    /**
     * Sets the "jmsPropertyConfig" element
     */
    void setJmsPropertyConfig(com.eviware.soapui.config.JMSPropertiesConfConfig jmsPropertyConfig);
    
    /**
     * Appends and returns a new empty "jmsPropertyConfig" element
     */
    com.eviware.soapui.config.JMSPropertiesConfConfig addNewJmsPropertyConfig();
    
    /**
     * Unsets the "jmsPropertyConfig" element
     */
    void unsetJmsPropertyConfig();
    
    /**
     * Gets the "sslKeystore" attribute
     */
    java.lang.String getSslKeystore();
    
    /**
     * Gets (as xml) the "sslKeystore" attribute
     */
    org.apache.xmlbeans.XmlString xgetSslKeystore();
    
    /**
     * True if has "sslKeystore" attribute
     */
    boolean isSetSslKeystore();
    
    /**
     * Sets the "sslKeystore" attribute
     */
    void setSslKeystore(java.lang.String sslKeystore);
    
    /**
     * Sets (as xml) the "sslKeystore" attribute
     */
    void xsetSslKeystore(org.apache.xmlbeans.XmlString sslKeystore);
    
    /**
     * Unsets the "sslKeystore" attribute
     */
    void unsetSslKeystore();
    
    /**
     * Gets the "timeout" attribute
     */
    java.lang.String getTimeout();
    
    /**
     * Gets (as xml) the "timeout" attribute
     */
    org.apache.xmlbeans.XmlString xgetTimeout();
    
    /**
     * True if has "timeout" attribute
     */
    boolean isSetTimeout();
    
    /**
     * Sets the "timeout" attribute
     */
    void setTimeout(java.lang.String timeout);
    
    /**
     * Sets (as xml) the "timeout" attribute
     */
    void xsetTimeout(org.apache.xmlbeans.XmlString timeout);
    
    /**
     * Unsets the "timeout" attribute
     */
    void unsetTimeout();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.eviware.soapui.config.AbstractRequestConfig newInstance() {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static com.eviware.soapui.config.AbstractRequestConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.AbstractRequestConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.AbstractRequestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.AbstractRequestConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.AbstractRequestConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
