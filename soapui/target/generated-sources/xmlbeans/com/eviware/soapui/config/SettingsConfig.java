/*
 * XML Type:  Settings
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SettingsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML Settings(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface SettingsConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SettingsConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("settingsd8cdtype");
    
    /**
     * Gets a List of "setting" elements
     */
    java.util.List<com.eviware.soapui.config.SettingConfig> getSettingList();
    
    /**
     * Gets array of all "setting" elements
     * @deprecated
     */
    com.eviware.soapui.config.SettingConfig[] getSettingArray();
    
    /**
     * Gets ith "setting" element
     */
    com.eviware.soapui.config.SettingConfig getSettingArray(int i);
    
    /**
     * Returns number of "setting" element
     */
    int sizeOfSettingArray();
    
    /**
     * Sets array of all "setting" element
     */
    void setSettingArray(com.eviware.soapui.config.SettingConfig[] settingArray);
    
    /**
     * Sets ith "setting" element
     */
    void setSettingArray(int i, com.eviware.soapui.config.SettingConfig setting);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "setting" element
     */
    com.eviware.soapui.config.SettingConfig insertNewSetting(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "setting" element
     */
    com.eviware.soapui.config.SettingConfig addNewSetting();
    
    /**
     * Removes the ith "setting" element
     */
    void removeSetting(int i);
    
    /**
     * Gets the "encryptedContent" element
     */
    byte[] getEncryptedContent();
    
    /**
     * Gets (as xml) the "encryptedContent" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetEncryptedContent();
    
    /**
     * True if has "encryptedContent" element
     */
    boolean isSetEncryptedContent();
    
    /**
     * Sets the "encryptedContent" element
     */
    void setEncryptedContent(byte[] encryptedContent);
    
    /**
     * Sets (as xml) the "encryptedContent" element
     */
    void xsetEncryptedContent(org.apache.xmlbeans.XmlBase64Binary encryptedContent);
    
    /**
     * Unsets the "encryptedContent" element
     */
    void unsetEncryptedContent();
    
    /**
     * Gets the "encryptedContentAlgorithm" element
     */
    java.lang.String getEncryptedContentAlgorithm();
    
    /**
     * Gets (as xml) the "encryptedContentAlgorithm" element
     */
    org.apache.xmlbeans.XmlString xgetEncryptedContentAlgorithm();
    
    /**
     * True if has "encryptedContentAlgorithm" element
     */
    boolean isSetEncryptedContentAlgorithm();
    
    /**
     * Sets the "encryptedContentAlgorithm" element
     */
    void setEncryptedContentAlgorithm(java.lang.String encryptedContentAlgorithm);
    
    /**
     * Sets (as xml) the "encryptedContentAlgorithm" element
     */
    void xsetEncryptedContentAlgorithm(org.apache.xmlbeans.XmlString encryptedContentAlgorithm);
    
    /**
     * Unsets the "encryptedContentAlgorithm" element
     */
    void unsetEncryptedContentAlgorithm();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.SettingsConfig newInstance() {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.SettingsConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.SettingsConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.SettingsConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SettingsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SettingsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SettingsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
