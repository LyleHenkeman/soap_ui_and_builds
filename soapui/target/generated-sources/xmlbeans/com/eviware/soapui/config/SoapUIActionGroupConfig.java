/*
 * XML Type:  SoapUIActionGroup
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIActionGroupConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML SoapUIActionGroup(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface SoapUIActionGroupConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoapUIActionGroupConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("soapuiactiongroup0f78type");
    
    /**
     * Gets a List of "actionMapping" elements
     */
    java.util.List<com.eviware.soapui.config.SoapUIActionMappingConfig> getActionMappingList();
    
    /**
     * Gets array of all "actionMapping" elements
     * @deprecated
     */
    com.eviware.soapui.config.SoapUIActionMappingConfig[] getActionMappingArray();
    
    /**
     * Gets ith "actionMapping" element
     */
    com.eviware.soapui.config.SoapUIActionMappingConfig getActionMappingArray(int i);
    
    /**
     * Returns number of "actionMapping" element
     */
    int sizeOfActionMappingArray();
    
    /**
     * Sets array of all "actionMapping" element
     */
    void setActionMappingArray(com.eviware.soapui.config.SoapUIActionMappingConfig[] actionMappingArray);
    
    /**
     * Sets ith "actionMapping" element
     */
    void setActionMappingArray(int i, com.eviware.soapui.config.SoapUIActionMappingConfig actionMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actionMapping" element
     */
    com.eviware.soapui.config.SoapUIActionMappingConfig insertNewActionMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actionMapping" element
     */
    com.eviware.soapui.config.SoapUIActionMappingConfig addNewActionMapping();
    
    /**
     * Removes the ith "actionMapping" element
     */
    void removeActionMapping(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlString xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * Gets the "class" attribute
     */
    java.lang.String getClass1();
    
    /**
     * Gets (as xml) the "class" attribute
     */
    org.apache.xmlbeans.XmlString xgetClass1();
    
    /**
     * True if has "class" attribute
     */
    boolean isSetClass1();
    
    /**
     * Sets the "class" attribute
     */
    void setClass1(java.lang.String class1);
    
    /**
     * Sets (as xml) the "class" attribute
     */
    void xsetClass1(org.apache.xmlbeans.XmlString class1);
    
    /**
     * Unsets the "class" attribute
     */
    void unsetClass1();
    
    /**
     * Gets the "default" attribute
     */
    java.lang.String getDefault();
    
    /**
     * Gets (as xml) the "default" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefault();
    
    /**
     * True if has "default" attribute
     */
    boolean isSetDefault();
    
    /**
     * Sets the "default" attribute
     */
    void setDefault(java.lang.String xdefault);
    
    /**
     * Sets (as xml) the "default" attribute
     */
    void xsetDefault(org.apache.xmlbeans.XmlString xdefault);
    
    /**
     * Unsets the "default" attribute
     */
    void unsetDefault();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.SoapUIActionGroupConfig newInstance() {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SoapUIActionGroupConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SoapUIActionGroupConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
