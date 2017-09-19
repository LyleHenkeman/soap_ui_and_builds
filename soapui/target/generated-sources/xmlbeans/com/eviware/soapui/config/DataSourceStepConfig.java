/*
 * XML Type:  DataSourceStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DataSourceStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML DataSourceStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface DataSourceStepConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DataSourceStepConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("datasourcestep789ftype");
    
    /**
     * Gets the "dataSource" element
     */
    com.eviware.soapui.config.DataSourceConfig getDataSource();
    
    /**
     * Sets the "dataSource" element
     */
    void setDataSource(com.eviware.soapui.config.DataSourceConfig dataSource);
    
    /**
     * Appends and returns a new empty "dataSource" element
     */
    com.eviware.soapui.config.DataSourceConfig addNewDataSource();
    
    /**
     * Gets the "shared" element
     */
    boolean getShared();
    
    /**
     * Gets (as xml) the "shared" element
     */
    org.apache.xmlbeans.XmlBoolean xgetShared();
    
    /**
     * Sets the "shared" element
     */
    void setShared(boolean shared);
    
    /**
     * Sets (as xml) the "shared" element
     */
    void xsetShared(org.apache.xmlbeans.XmlBoolean shared);
    
    /**
     * Gets the "restartShared" element
     */
    boolean getRestartShared();
    
    /**
     * Gets (as xml) the "restartShared" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRestartShared();
    
    /**
     * Sets the "restartShared" element
     */
    void setRestartShared(boolean restartShared);
    
    /**
     * Sets (as xml) the "restartShared" element
     */
    void xsetRestartShared(org.apache.xmlbeans.XmlBoolean restartShared);
    
    /**
     * Gets the "preload" element
     */
    boolean getPreload();
    
    /**
     * Gets (as xml) the "preload" element
     */
    org.apache.xmlbeans.XmlBoolean xgetPreload();
    
    /**
     * Sets the "preload" element
     */
    void setPreload(boolean preload);
    
    /**
     * Sets (as xml) the "preload" element
     */
    void xsetPreload(org.apache.xmlbeans.XmlBoolean preload);
    
    /**
     * Gets a List of "property" elements
     */
    java.util.List<java.lang.String> getPropertyList();
    
    /**
     * Gets array of all "property" elements
     * @deprecated
     */
    java.lang.String[] getPropertyArray();
    
    /**
     * Gets ith "property" element
     */
    java.lang.String getPropertyArray(int i);
    
    /**
     * Gets (as xml) a List of "property" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetPropertyList();
    
    /**
     * Gets (as xml) array of all "property" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetPropertyArray();
    
    /**
     * Gets (as xml) ith "property" element
     */
    org.apache.xmlbeans.XmlString xgetPropertyArray(int i);
    
    /**
     * Returns number of "property" element
     */
    int sizeOfPropertyArray();
    
    /**
     * Sets array of all "property" element
     */
    void setPropertyArray(java.lang.String[] propertyArray);
    
    /**
     * Sets ith "property" element
     */
    void setPropertyArray(int i, java.lang.String property);
    
    /**
     * Sets (as xml) array of all "property" element
     */
    void xsetPropertyArray(org.apache.xmlbeans.XmlString[] propertyArray);
    
    /**
     * Sets (as xml) ith "property" element
     */
    void xsetPropertyArray(int i, org.apache.xmlbeans.XmlString property);
    
    /**
     * Inserts the value as the ith "property" element
     */
    void insertProperty(int i, java.lang.String property);
    
    /**
     * Appends the value as the last "property" element
     */
    void addProperty(java.lang.String property);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    org.apache.xmlbeans.XmlString insertNewProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    org.apache.xmlbeans.XmlString addNewProperty();
    
    /**
     * Removes the ith "property" element
     */
    void removeProperty(int i);
    
    /**
     * Gets the "startRow" element
     */
    java.lang.String getStartRow();
    
    /**
     * Gets (as xml) the "startRow" element
     */
    org.apache.xmlbeans.XmlString xgetStartRow();
    
    /**
     * Sets the "startRow" element
     */
    void setStartRow(java.lang.String startRow);
    
    /**
     * Sets (as xml) the "startRow" element
     */
    void xsetStartRow(org.apache.xmlbeans.XmlString startRow);
    
    /**
     * Gets the "endRow" element
     */
    java.lang.String getEndRow();
    
    /**
     * Gets (as xml) the "endRow" element
     */
    org.apache.xmlbeans.XmlString xgetEndRow();
    
    /**
     * Sets the "endRow" element
     */
    void setEndRow(java.lang.String endRow);
    
    /**
     * Sets (as xml) the "endRow" element
     */
    void xsetEndRow(org.apache.xmlbeans.XmlString endRow);
    
    /**
     * Gets the "failOnEmpty" element
     */
    boolean getFailOnEmpty();
    
    /**
     * Gets (as xml) the "failOnEmpty" element
     */
    org.apache.xmlbeans.XmlBoolean xgetFailOnEmpty();
    
    /**
     * True if has "failOnEmpty" element
     */
    boolean isSetFailOnEmpty();
    
    /**
     * Sets the "failOnEmpty" element
     */
    void setFailOnEmpty(boolean failOnEmpty);
    
    /**
     * Sets (as xml) the "failOnEmpty" element
     */
    void xsetFailOnEmpty(org.apache.xmlbeans.XmlBoolean failOnEmpty);
    
    /**
     * Unsets the "failOnEmpty" element
     */
    void unsetFailOnEmpty();
    
    /**
     * Gets the "gotoLoopOnEmpty" element
     */
    boolean getGotoLoopOnEmpty();
    
    /**
     * Gets (as xml) the "gotoLoopOnEmpty" element
     */
    org.apache.xmlbeans.XmlBoolean xgetGotoLoopOnEmpty();
    
    /**
     * Sets the "gotoLoopOnEmpty" element
     */
    void setGotoLoopOnEmpty(boolean gotoLoopOnEmpty);
    
    /**
     * Sets (as xml) the "gotoLoopOnEmpty" element
     */
    void xsetGotoLoopOnEmpty(org.apache.xmlbeans.XmlBoolean gotoLoopOnEmpty);
    
    /**
     * Gets the "trimValues" element
     */
    boolean getTrimValues();
    
    /**
     * Gets (as xml) the "trimValues" element
     */
    org.apache.xmlbeans.XmlBoolean xgetTrimValues();
    
    /**
     * Sets the "trimValues" element
     */
    void setTrimValues(boolean trimValues);
    
    /**
     * Sets (as xml) the "trimValues" element
     */
    void xsetTrimValues(org.apache.xmlbeans.XmlBoolean trimValues);
    
    /**
     * Gets the "entitizeValues" element
     */
    boolean getEntitizeValues();
    
    /**
     * Gets (as xml) the "entitizeValues" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEntitizeValues();
    
    /**
     * Sets the "entitizeValues" element
     */
    void setEntitizeValues(boolean entitizeValues);
    
    /**
     * Sets (as xml) the "entitizeValues" element
     */
    void xsetEntitizeValues(org.apache.xmlbeans.XmlBoolean entitizeValues);
    
    /**
     * Gets the "restartOnRun" element
     */
    boolean getRestartOnRun();
    
    /**
     * Gets (as xml) the "restartOnRun" element
     */
    org.apache.xmlbeans.XmlBoolean xgetRestartOnRun();
    
    /**
     * Sets the "restartOnRun" element
     */
    void setRestartOnRun(boolean restartOnRun);
    
    /**
     * Sets (as xml) the "restartOnRun" element
     */
    void xsetRestartOnRun(org.apache.xmlbeans.XmlBoolean restartOnRun);
    
    /**
     * Gets the "expandProperties" element
     */
    boolean getExpandProperties();
    
    /**
     * Gets (as xml) the "expandProperties" element
     */
    org.apache.xmlbeans.XmlBoolean xgetExpandProperties();
    
    /**
     * Sets the "expandProperties" element
     */
    void setExpandProperties(boolean expandProperties);
    
    /**
     * Sets (as xml) the "expandProperties" element
     */
    void xsetExpandProperties(org.apache.xmlbeans.XmlBoolean expandProperties);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.DataSourceStepConfig newInstance() {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.DataSourceStepConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.DataSourceStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.DataSourceStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.DataSourceStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
