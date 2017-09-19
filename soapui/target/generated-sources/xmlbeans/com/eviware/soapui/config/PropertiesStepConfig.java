/*
 * XML Type:  PropertiesStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.PropertiesStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML PropertiesStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface PropertiesStepConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PropertiesStepConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("propertiesstep5091type");
    
    /**
     * Gets the "source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * True if has "source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Unsets the "source" element
     */
    void unsetSource();
    
    /**
     * Gets the "target" element
     */
    java.lang.String getTarget();
    
    /**
     * Gets (as xml) the "target" element
     */
    org.apache.xmlbeans.XmlString xgetTarget();
    
    /**
     * True if has "target" element
     */
    boolean isSetTarget();
    
    /**
     * Sets the "target" element
     */
    void setTarget(java.lang.String target);
    
    /**
     * Sets (as xml) the "target" element
     */
    void xsetTarget(org.apache.xmlbeans.XmlString target);
    
    /**
     * Unsets the "target" element
     */
    void unsetTarget();
    
    /**
     * Gets the "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig getProperties();
    
    /**
     * True if has "properties" element
     */
    boolean isSetProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig addNewProperties();
    
    /**
     * Unsets the "properties" element
     */
    void unsetProperties();
    
    /**
     * Gets the "createMissingOnLoad" attribute
     */
    boolean getCreateMissingOnLoad();
    
    /**
     * Gets (as xml) the "createMissingOnLoad" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCreateMissingOnLoad();
    
    /**
     * True if has "createMissingOnLoad" attribute
     */
    boolean isSetCreateMissingOnLoad();
    
    /**
     * Sets the "createMissingOnLoad" attribute
     */
    void setCreateMissingOnLoad(boolean createMissingOnLoad);
    
    /**
     * Sets (as xml) the "createMissingOnLoad" attribute
     */
    void xsetCreateMissingOnLoad(org.apache.xmlbeans.XmlBoolean createMissingOnLoad);
    
    /**
     * Unsets the "createMissingOnLoad" attribute
     */
    void unsetCreateMissingOnLoad();
    
    /**
     * Gets the "saveFirst" attribute
     */
    boolean getSaveFirst();
    
    /**
     * Gets (as xml) the "saveFirst" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSaveFirst();
    
    /**
     * True if has "saveFirst" attribute
     */
    boolean isSetSaveFirst();
    
    /**
     * Sets the "saveFirst" attribute
     */
    void setSaveFirst(boolean saveFirst);
    
    /**
     * Sets (as xml) the "saveFirst" attribute
     */
    void xsetSaveFirst(org.apache.xmlbeans.XmlBoolean saveFirst);
    
    /**
     * Unsets the "saveFirst" attribute
     */
    void unsetSaveFirst();
    
    /**
     * Gets the "discardValuesOnSave" attribute
     */
    boolean getDiscardValuesOnSave();
    
    /**
     * Gets (as xml) the "discardValuesOnSave" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDiscardValuesOnSave();
    
    /**
     * True if has "discardValuesOnSave" attribute
     */
    boolean isSetDiscardValuesOnSave();
    
    /**
     * Sets the "discardValuesOnSave" attribute
     */
    void setDiscardValuesOnSave(boolean discardValuesOnSave);
    
    /**
     * Sets (as xml) the "discardValuesOnSave" attribute
     */
    void xsetDiscardValuesOnSave(org.apache.xmlbeans.XmlBoolean discardValuesOnSave);
    
    /**
     * Unsets the "discardValuesOnSave" attribute
     */
    void unsetDiscardValuesOnSave();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.PropertiesStepConfig newInstance() {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.PropertiesStepConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.PropertiesStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.PropertiesStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.PropertiesStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
