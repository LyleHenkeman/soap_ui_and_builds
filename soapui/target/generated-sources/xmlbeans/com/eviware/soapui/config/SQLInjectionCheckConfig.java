/*
 * XML Type:  SQLInjectionCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SQLInjectionCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML SQLInjectionCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface SQLInjectionCheckConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SQLInjectionCheckConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("sqlinjectioncheck6743type");
    
    /**
     * Gets a List of "sqlInjectionStrings" elements
     */
    java.util.List<java.lang.String> getSqlInjectionStringsList();
    
    /**
     * Gets array of all "sqlInjectionStrings" elements
     * @deprecated
     */
    java.lang.String[] getSqlInjectionStringsArray();
    
    /**
     * Gets ith "sqlInjectionStrings" element
     */
    java.lang.String getSqlInjectionStringsArray(int i);
    
    /**
     * Gets (as xml) a List of "sqlInjectionStrings" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetSqlInjectionStringsList();
    
    /**
     * Gets (as xml) array of all "sqlInjectionStrings" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetSqlInjectionStringsArray();
    
    /**
     * Gets (as xml) ith "sqlInjectionStrings" element
     */
    org.apache.xmlbeans.XmlString xgetSqlInjectionStringsArray(int i);
    
    /**
     * Returns number of "sqlInjectionStrings" element
     */
    int sizeOfSqlInjectionStringsArray();
    
    /**
     * Sets array of all "sqlInjectionStrings" element
     */
    void setSqlInjectionStringsArray(java.lang.String[] sqlInjectionStringsArray);
    
    /**
     * Sets ith "sqlInjectionStrings" element
     */
    void setSqlInjectionStringsArray(int i, java.lang.String sqlInjectionStrings);
    
    /**
     * Sets (as xml) array of all "sqlInjectionStrings" element
     */
    void xsetSqlInjectionStringsArray(org.apache.xmlbeans.XmlString[] sqlInjectionStringsArray);
    
    /**
     * Sets (as xml) ith "sqlInjectionStrings" element
     */
    void xsetSqlInjectionStringsArray(int i, org.apache.xmlbeans.XmlString sqlInjectionStrings);
    
    /**
     * Inserts the value as the ith "sqlInjectionStrings" element
     */
    void insertSqlInjectionStrings(int i, java.lang.String sqlInjectionStrings);
    
    /**
     * Appends the value as the last "sqlInjectionStrings" element
     */
    void addSqlInjectionStrings(java.lang.String sqlInjectionStrings);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sqlInjectionStrings" element
     */
    org.apache.xmlbeans.XmlString insertNewSqlInjectionStrings(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sqlInjectionStrings" element
     */
    org.apache.xmlbeans.XmlString addNewSqlInjectionStrings();
    
    /**
     * Removes the ith "sqlInjectionStrings" element
     */
    void removeSqlInjectionStrings(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.SQLInjectionCheckConfig newInstance() {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SQLInjectionCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SQLInjectionCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
