/*
 * XML Type:  MaliciousAttachmentElement
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MaliciousAttachmentElementConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MaliciousAttachmentElement(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MaliciousAttachmentElementConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MaliciousAttachmentElementConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("maliciousattachmentelementbbedtype");
    
    /**
     * Gets a List of "replaceAttachment" elements
     */
    java.util.List<com.eviware.soapui.config.MaliciousAttachmentConfig> getReplaceAttachmentList();
    
    /**
     * Gets array of all "replaceAttachment" elements
     * @deprecated
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig[] getReplaceAttachmentArray();
    
    /**
     * Gets ith "replaceAttachment" element
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig getReplaceAttachmentArray(int i);
    
    /**
     * Returns number of "replaceAttachment" element
     */
    int sizeOfReplaceAttachmentArray();
    
    /**
     * Sets array of all "replaceAttachment" element
     */
    void setReplaceAttachmentArray(com.eviware.soapui.config.MaliciousAttachmentConfig[] replaceAttachmentArray);
    
    /**
     * Sets ith "replaceAttachment" element
     */
    void setReplaceAttachmentArray(int i, com.eviware.soapui.config.MaliciousAttachmentConfig replaceAttachment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "replaceAttachment" element
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig insertNewReplaceAttachment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "replaceAttachment" element
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig addNewReplaceAttachment();
    
    /**
     * Removes the ith "replaceAttachment" element
     */
    void removeReplaceAttachment(int i);
    
    /**
     * Gets a List of "generateAttachment" elements
     */
    java.util.List<com.eviware.soapui.config.MaliciousAttachmentConfig> getGenerateAttachmentList();
    
    /**
     * Gets array of all "generateAttachment" elements
     * @deprecated
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig[] getGenerateAttachmentArray();
    
    /**
     * Gets ith "generateAttachment" element
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig getGenerateAttachmentArray(int i);
    
    /**
     * Returns number of "generateAttachment" element
     */
    int sizeOfGenerateAttachmentArray();
    
    /**
     * Sets array of all "generateAttachment" element
     */
    void setGenerateAttachmentArray(com.eviware.soapui.config.MaliciousAttachmentConfig[] generateAttachmentArray);
    
    /**
     * Sets ith "generateAttachment" element
     */
    void setGenerateAttachmentArray(int i, com.eviware.soapui.config.MaliciousAttachmentConfig generateAttachment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "generateAttachment" element
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig insertNewGenerateAttachment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "generateAttachment" element
     */
    com.eviware.soapui.config.MaliciousAttachmentConfig addNewGenerateAttachment();
    
    /**
     * Removes the ith "generateAttachment" element
     */
    void removeGenerateAttachment(int i);
    
    /**
     * Gets the "key" attribute
     */
    java.lang.String getKey();
    
    /**
     * Gets (as xml) the "key" attribute
     */
    org.apache.xmlbeans.XmlString xgetKey();
    
    /**
     * True if has "key" attribute
     */
    boolean isSetKey();
    
    /**
     * Sets the "key" attribute
     */
    void setKey(java.lang.String key);
    
    /**
     * Sets (as xml) the "key" attribute
     */
    void xsetKey(org.apache.xmlbeans.XmlString key);
    
    /**
     * Unsets the "key" attribute
     */
    void unsetKey();
    
    /**
     * Gets the "remove" attribute
     */
    boolean getRemove();
    
    /**
     * Gets (as xml) the "remove" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRemove();
    
    /**
     * True if has "remove" attribute
     */
    boolean isSetRemove();
    
    /**
     * Sets the "remove" attribute
     */
    void setRemove(boolean remove);
    
    /**
     * Sets (as xml) the "remove" attribute
     */
    void xsetRemove(org.apache.xmlbeans.XmlBoolean remove);
    
    /**
     * Unsets the "remove" attribute
     */
    void unsetRemove();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig newInstance() {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MaliciousAttachmentElementConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MaliciousAttachmentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
