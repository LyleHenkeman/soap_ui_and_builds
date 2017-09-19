/*
 * XML Type:  ReportTemplate
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ReportTemplateConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML ReportTemplate(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface ReportTemplateConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportTemplateConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("reporttemplated742type");
    
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
     * Gets the "reportType" element
     */
    com.eviware.soapui.config.ReportTypeConfig.Enum getReportType();
    
    /**
     * Gets (as xml) the "reportType" element
     */
    com.eviware.soapui.config.ReportTypeConfig xgetReportType();
    
    /**
     * Sets the "reportType" element
     */
    void setReportType(com.eviware.soapui.config.ReportTypeConfig.Enum reportType);
    
    /**
     * Sets (as xml) the "reportType" element
     */
    void xsetReportType(com.eviware.soapui.config.ReportTypeConfig reportType);
    
    /**
     * Gets the "reportLevel" element
     */
    com.eviware.soapui.config.ReportLevelTypesConfig.Enum getReportLevel();
    
    /**
     * Gets (as xml) the "reportLevel" element
     */
    com.eviware.soapui.config.ReportLevelTypesConfig xgetReportLevel();
    
    /**
     * Sets the "reportLevel" element
     */
    void setReportLevel(com.eviware.soapui.config.ReportLevelTypesConfig.Enum reportLevel);
    
    /**
     * Sets (as xml) the "reportLevel" element
     */
    void xsetReportLevel(com.eviware.soapui.config.ReportLevelTypesConfig reportLevel);
    
    /**
     * Gets the "data" element
     */
    java.lang.String getData();
    
    /**
     * Gets (as xml) the "data" element
     */
    org.apache.xmlbeans.XmlString xgetData();
    
    /**
     * Sets the "data" element
     */
    void setData(java.lang.String data);
    
    /**
     * Sets (as xml) the "data" element
     */
    void xsetData(org.apache.xmlbeans.XmlString data);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets a List of "subreports" elements
     */
    java.util.List<java.lang.String> getSubreportsList();
    
    /**
     * Gets array of all "subreports" elements
     * @deprecated
     */
    java.lang.String[] getSubreportsArray();
    
    /**
     * Gets ith "subreports" element
     */
    java.lang.String getSubreportsArray(int i);
    
    /**
     * Gets (as xml) a List of "subreports" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetSubreportsList();
    
    /**
     * Gets (as xml) array of all "subreports" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetSubreportsArray();
    
    /**
     * Gets (as xml) ith "subreports" element
     */
    org.apache.xmlbeans.XmlString xgetSubreportsArray(int i);
    
    /**
     * Returns number of "subreports" element
     */
    int sizeOfSubreportsArray();
    
    /**
     * Sets array of all "subreports" element
     */
    void setSubreportsArray(java.lang.String[] subreportsArray);
    
    /**
     * Sets ith "subreports" element
     */
    void setSubreportsArray(int i, java.lang.String subreports);
    
    /**
     * Sets (as xml) array of all "subreports" element
     */
    void xsetSubreportsArray(org.apache.xmlbeans.XmlString[] subreportsArray);
    
    /**
     * Sets (as xml) ith "subreports" element
     */
    void xsetSubreportsArray(int i, org.apache.xmlbeans.XmlString subreports);
    
    /**
     * Inserts the value as the ith "subreports" element
     */
    void insertSubreports(int i, java.lang.String subreports);
    
    /**
     * Appends the value as the last "subreports" element
     */
    void addSubreports(java.lang.String subreports);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "subreports" element
     */
    org.apache.xmlbeans.XmlString insertNewSubreports(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "subreports" element
     */
    org.apache.xmlbeans.XmlString addNewSubreports();
    
    /**
     * Removes the ith "subreports" element
     */
    void removeSubreports(int i);
    
    /**
     * Gets the "scope" element
     */
    com.eviware.soapui.config.ScopeTypeConfig.Enum getScope();
    
    /**
     * Gets (as xml) the "scope" element
     */
    com.eviware.soapui.config.ScopeTypeConfig xgetScope();
    
    /**
     * Sets the "scope" element
     */
    void setScope(com.eviware.soapui.config.ScopeTypeConfig.Enum scope);
    
    /**
     * Sets (as xml) the "scope" element
     */
    void xsetScope(com.eviware.soapui.config.ScopeTypeConfig scope);
    
    /**
     * Gets the "dataSource" element
     */
    java.lang.String getDataSource();
    
    /**
     * Gets (as xml) the "dataSource" element
     */
    org.apache.xmlbeans.XmlString xgetDataSource();
    
    /**
     * Sets the "dataSource" element
     */
    void setDataSource(java.lang.String dataSource);
    
    /**
     * Sets (as xml) the "dataSource" element
     */
    void xsetDataSource(org.apache.xmlbeans.XmlString dataSource);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.ReportTemplateConfig newInstance() {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.ReportTemplateConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ReportTemplateConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ReportTemplateConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ReportTemplateConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
