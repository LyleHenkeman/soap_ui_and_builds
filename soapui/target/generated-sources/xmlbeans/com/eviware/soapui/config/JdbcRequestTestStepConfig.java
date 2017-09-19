/*
 * XML Type:  JdbcRequestTestStep
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.JdbcRequestTestStepConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML JdbcRequestTestStep(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface JdbcRequestTestStepConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JdbcRequestTestStepConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("jdbcrequestteststep6190type");
    
    /**
     * Gets the "dbConnectionName" element
     */
    java.lang.String getDbConnectionName();
    
    /**
     * Gets (as xml) the "dbConnectionName" element
     */
    org.apache.xmlbeans.XmlString xgetDbConnectionName();
    
    /**
     * Sets the "dbConnectionName" element
     */
    void setDbConnectionName(java.lang.String dbConnectionName);
    
    /**
     * Sets (as xml) the "dbConnectionName" element
     */
    void xsetDbConnectionName(org.apache.xmlbeans.XmlString dbConnectionName);
    
    /**
     * Gets the "driver" element
     */
    java.lang.String getDriver();
    
    /**
     * Gets (as xml) the "driver" element
     */
    org.apache.xmlbeans.XmlString xgetDriver();
    
    /**
     * Sets the "driver" element
     */
    void setDriver(java.lang.String driver);
    
    /**
     * Sets (as xml) the "driver" element
     */
    void xsetDriver(org.apache.xmlbeans.XmlString driver);
    
    /**
     * Gets the "connectionString" element
     */
    java.lang.String getConnectionString();
    
    /**
     * Gets (as xml) the "connectionString" element
     */
    org.apache.xmlbeans.XmlString xgetConnectionString();
    
    /**
     * Sets the "connectionString" element
     */
    void setConnectionString(java.lang.String connectionString);
    
    /**
     * Sets (as xml) the "connectionString" element
     */
    void xsetConnectionString(org.apache.xmlbeans.XmlString connectionString);
    
    /**
     * Gets the "password" element
     */
    java.lang.String getPassword();
    
    /**
     * Gets (as xml) the "password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * Sets the "password" element
     */
    void setPassword(java.lang.String password);
    
    /**
     * Sets (as xml) the "password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * Gets the "query" element
     */
    java.lang.String getQuery();
    
    /**
     * Gets (as xml) the "query" element
     */
    org.apache.xmlbeans.XmlString xgetQuery();
    
    /**
     * Sets the "query" element
     */
    void setQuery(java.lang.String query);
    
    /**
     * Sets (as xml) the "query" element
     */
    void xsetQuery(org.apache.xmlbeans.XmlString query);
    
    /**
     * Gets the "storedProcedure" element
     */
    boolean getStoredProcedure();
    
    /**
     * Gets (as xml) the "storedProcedure" element
     */
    org.apache.xmlbeans.XmlBoolean xgetStoredProcedure();
    
    /**
     * Sets the "storedProcedure" element
     */
    void setStoredProcedure(boolean storedProcedure);
    
    /**
     * Sets (as xml) the "storedProcedure" element
     */
    void xsetStoredProcedure(org.apache.xmlbeans.XmlBoolean storedProcedure);
    
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
     * Gets the "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig getProperties();
    
    /**
     * Sets the "properties" element
     */
    void setProperties(com.eviware.soapui.config.PropertiesTypeConfig properties);
    
    /**
     * Appends and returns a new empty "properties" element
     */
    com.eviware.soapui.config.PropertiesTypeConfig addNewProperties();
    
    /**
     * Gets the "convertColumnNamesToUpperCase" attribute
     */
    boolean getConvertColumnNamesToUpperCase();
    
    /**
     * Gets (as xml) the "convertColumnNamesToUpperCase" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetConvertColumnNamesToUpperCase();
    
    /**
     * True if has "convertColumnNamesToUpperCase" attribute
     */
    boolean isSetConvertColumnNamesToUpperCase();
    
    /**
     * Sets the "convertColumnNamesToUpperCase" attribute
     */
    void setConvertColumnNamesToUpperCase(boolean convertColumnNamesToUpperCase);
    
    /**
     * Sets (as xml) the "convertColumnNamesToUpperCase" attribute
     */
    void xsetConvertColumnNamesToUpperCase(org.apache.xmlbeans.XmlBoolean convertColumnNamesToUpperCase);
    
    /**
     * Unsets the "convertColumnNamesToUpperCase" attribute
     */
    void unsetConvertColumnNamesToUpperCase();
    
    /**
     * Gets the "queryTimeout" attribute
     */
    java.lang.String getQueryTimeout();
    
    /**
     * Gets (as xml) the "queryTimeout" attribute
     */
    org.apache.xmlbeans.XmlString xgetQueryTimeout();
    
    /**
     * True if has "queryTimeout" attribute
     */
    boolean isSetQueryTimeout();
    
    /**
     * Sets the "queryTimeout" attribute
     */
    void setQueryTimeout(java.lang.String queryTimeout);
    
    /**
     * Sets (as xml) the "queryTimeout" attribute
     */
    void xsetQueryTimeout(org.apache.xmlbeans.XmlString queryTimeout);
    
    /**
     * Unsets the "queryTimeout" attribute
     */
    void unsetQueryTimeout();
    
    /**
     * Gets the "maxRows" attribute
     */
    java.lang.String getMaxRows();
    
    /**
     * Gets (as xml) the "maxRows" attribute
     */
    org.apache.xmlbeans.XmlString xgetMaxRows();
    
    /**
     * True if has "maxRows" attribute
     */
    boolean isSetMaxRows();
    
    /**
     * Sets the "maxRows" attribute
     */
    void setMaxRows(java.lang.String maxRows);
    
    /**
     * Sets (as xml) the "maxRows" attribute
     */
    void xsetMaxRows(org.apache.xmlbeans.XmlString maxRows);
    
    /**
     * Unsets the "maxRows" attribute
     */
    void unsetMaxRows();
    
    /**
     * Gets the "fetchSize" attribute
     */
    java.lang.String getFetchSize();
    
    /**
     * Gets (as xml) the "fetchSize" attribute
     */
    org.apache.xmlbeans.XmlString xgetFetchSize();
    
    /**
     * True if has "fetchSize" attribute
     */
    boolean isSetFetchSize();
    
    /**
     * Sets the "fetchSize" attribute
     */
    void setFetchSize(java.lang.String fetchSize);
    
    /**
     * Sets (as xml) the "fetchSize" attribute
     */
    void xsetFetchSize(org.apache.xmlbeans.XmlString fetchSize);
    
    /**
     * Unsets the "fetchSize" attribute
     */
    void unsetFetchSize();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig newInstance() {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.JdbcRequestTestStepConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.JdbcRequestTestStepConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
