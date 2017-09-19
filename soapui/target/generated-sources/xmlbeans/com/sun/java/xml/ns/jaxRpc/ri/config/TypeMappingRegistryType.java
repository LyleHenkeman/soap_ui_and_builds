/*
 * XML Type:  typeMappingRegistryType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config;


/**
 * An XML typeMappingRegistryType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public interface TypeMappingRegistryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeMappingRegistryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("typemappingregistrytype123atype");
    
    /**
     * Gets the "import" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.ImportType getImport();
    
    /**
     * True if has "import" element
     */
    boolean isSetImport();
    
    /**
     * Sets the "import" element
     */
    void setImport(com.sun.java.xml.ns.jaxRpc.ri.config.ImportType ximport);
    
    /**
     * Appends and returns a new empty "import" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.ImportType addNewImport();
    
    /**
     * Unsets the "import" element
     */
    void unsetImport();
    
    /**
     * Gets a List of "typeMapping" elements
     */
    java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType> getTypeMappingList();
    
    /**
     * Gets array of all "typeMapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType[] getTypeMappingArray();
    
    /**
     * Gets ith "typeMapping" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType getTypeMappingArray(int i);
    
    /**
     * Returns number of "typeMapping" element
     */
    int sizeOfTypeMappingArray();
    
    /**
     * Sets array of all "typeMapping" element
     */
    void setTypeMappingArray(com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType[] typeMappingArray);
    
    /**
     * Sets ith "typeMapping" element
     */
    void setTypeMappingArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType typeMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "typeMapping" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType insertNewTypeMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "typeMapping" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingType addNewTypeMapping();
    
    /**
     * Removes the ith "typeMapping" element
     */
    void removeTypeMapping(int i);
    
    /**
     * Gets the "additionalTypes" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType getAdditionalTypes();
    
    /**
     * True if has "additionalTypes" element
     */
    boolean isSetAdditionalTypes();
    
    /**
     * Sets the "additionalTypes" element
     */
    void setAdditionalTypes(com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType additionalTypes);
    
    /**
     * Appends and returns a new empty "additionalTypes" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.AdditionalTypesType addNewAdditionalTypes();
    
    /**
     * Unsets the "additionalTypes" element
     */
    void unsetAdditionalTypes();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType newInstance() {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
