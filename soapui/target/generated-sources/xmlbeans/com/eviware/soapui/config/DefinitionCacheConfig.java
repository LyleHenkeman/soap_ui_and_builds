/*
 * XML Type:  DefinitionCache
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.DefinitionCacheConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML DefinitionCache(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface DefinitionCacheConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DefinitionCacheConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("definitioncache7173type");
    
    /**
     * Gets a List of "part" elements
     */
    java.util.List<com.eviware.soapui.config.DefintionPartConfig> getPartList();
    
    /**
     * Gets array of all "part" elements
     * @deprecated
     */
    com.eviware.soapui.config.DefintionPartConfig[] getPartArray();
    
    /**
     * Gets ith "part" element
     */
    com.eviware.soapui.config.DefintionPartConfig getPartArray(int i);
    
    /**
     * Returns number of "part" element
     */
    int sizeOfPartArray();
    
    /**
     * Sets array of all "part" element
     */
    void setPartArray(com.eviware.soapui.config.DefintionPartConfig[] partArray);
    
    /**
     * Sets ith "part" element
     */
    void setPartArray(int i, com.eviware.soapui.config.DefintionPartConfig part);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "part" element
     */
    com.eviware.soapui.config.DefintionPartConfig insertNewPart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "part" element
     */
    com.eviware.soapui.config.DefintionPartConfig addNewPart();
    
    /**
     * Removes the ith "part" element
     */
    void removePart(int i);
    
    /**
     * Gets the "rootPart" attribute
     */
    java.lang.String getRootPart();
    
    /**
     * Gets (as xml) the "rootPart" attribute
     */
    org.apache.xmlbeans.XmlString xgetRootPart();
    
    /**
     * True if has "rootPart" attribute
     */
    boolean isSetRootPart();
    
    /**
     * Sets the "rootPart" attribute
     */
    void setRootPart(java.lang.String rootPart);
    
    /**
     * Sets (as xml) the "rootPart" attribute
     */
    void xsetRootPart(org.apache.xmlbeans.XmlString rootPart);
    
    /**
     * Unsets the "rootPart" attribute
     */
    void unsetRootPart();
    
    /**
     * Gets the "cacheTime" attribute
     */
    java.util.Calendar getCacheTime();
    
    /**
     * Gets (as xml) the "cacheTime" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetCacheTime();
    
    /**
     * True if has "cacheTime" attribute
     */
    boolean isSetCacheTime();
    
    /**
     * Sets the "cacheTime" attribute
     */
    void setCacheTime(java.util.Calendar cacheTime);
    
    /**
     * Sets (as xml) the "cacheTime" attribute
     */
    void xsetCacheTime(org.apache.xmlbeans.XmlDateTime cacheTime);
    
    /**
     * Unsets the "cacheTime" attribute
     */
    void unsetCacheTime();
    
    /**
     * Gets the "type" attribute
     */
    com.eviware.soapui.config.DefinitionCacheTypeConfig.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    com.eviware.soapui.config.DefinitionCacheTypeConfig xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(com.eviware.soapui.config.DefinitionCacheTypeConfig.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.eviware.soapui.config.DefinitionCacheTypeConfig type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.DefinitionCacheConfig newInstance() {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.DefinitionCacheConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.DefinitionCacheConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
