/*
 * XML Type:  java-xml-type-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML java-xml-type-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface JavaXmlTypeMappingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JavaXmlTypeMappingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("javaxmltypemappingtype991dtype");
    
    /**
     * Gets the "java-type" element
     */
    com.sun.java.xml.ns.j2Ee.JavaTypeType getJavaType();
    
    /**
     * Sets the "java-type" element
     */
    void setJavaType(com.sun.java.xml.ns.j2Ee.JavaTypeType javaType);
    
    /**
     * Appends and returns a new empty "java-type" element
     */
    com.sun.java.xml.ns.j2Ee.JavaTypeType addNewJavaType();
    
    /**
     * Gets the "root-type-qname" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType getRootTypeQname();
    
    /**
     * True if has "root-type-qname" element
     */
    boolean isSetRootTypeQname();
    
    /**
     * Sets the "root-type-qname" element
     */
    void setRootTypeQname(com.sun.java.xml.ns.j2Ee.XsdQNameType rootTypeQname);
    
    /**
     * Appends and returns a new empty "root-type-qname" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType addNewRootTypeQname();
    
    /**
     * Unsets the "root-type-qname" element
     */
    void unsetRootTypeQname();
    
    /**
     * Gets the "anonymous-type-qname" element
     */
    com.sun.java.xml.ns.j2Ee.String getAnonymousTypeQname();
    
    /**
     * True if has "anonymous-type-qname" element
     */
    boolean isSetAnonymousTypeQname();
    
    /**
     * Sets the "anonymous-type-qname" element
     */
    void setAnonymousTypeQname(com.sun.java.xml.ns.j2Ee.String anonymousTypeQname);
    
    /**
     * Appends and returns a new empty "anonymous-type-qname" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewAnonymousTypeQname();
    
    /**
     * Unsets the "anonymous-type-qname" element
     */
    void unsetAnonymousTypeQname();
    
    /**
     * Gets the "qname-scope" element
     */
    com.sun.java.xml.ns.j2Ee.QnameScopeType getQnameScope();
    
    /**
     * Sets the "qname-scope" element
     */
    void setQnameScope(com.sun.java.xml.ns.j2Ee.QnameScopeType qnameScope);
    
    /**
     * Appends and returns a new empty "qname-scope" element
     */
    com.sun.java.xml.ns.j2Ee.QnameScopeType addNewQnameScope();
    
    /**
     * Gets a List of "variable-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.VariableMappingType> getVariableMappingList();
    
    /**
     * Gets array of all "variable-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.VariableMappingType[] getVariableMappingArray();
    
    /**
     * Gets ith "variable-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.VariableMappingType getVariableMappingArray(int i);
    
    /**
     * Returns number of "variable-mapping" element
     */
    int sizeOfVariableMappingArray();
    
    /**
     * Sets array of all "variable-mapping" element
     */
    void setVariableMappingArray(com.sun.java.xml.ns.j2Ee.VariableMappingType[] variableMappingArray);
    
    /**
     * Sets ith "variable-mapping" element
     */
    void setVariableMappingArray(int i, com.sun.java.xml.ns.j2Ee.VariableMappingType variableMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "variable-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.VariableMappingType insertNewVariableMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "variable-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.VariableMappingType addNewVariableMapping();
    
    /**
     * Removes the ith "variable-mapping" element
     */
    void removeVariableMapping(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
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
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
