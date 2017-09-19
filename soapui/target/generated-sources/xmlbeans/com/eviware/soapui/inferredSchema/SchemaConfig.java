/*
 * XML Type:  Schema
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.SchemaConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema;


/**
 * An XML Schema(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public interface SchemaConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SchemaConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("schema411atype");
    
    /**
     * Gets the "namespace" element
     */
    java.lang.String getNamespace();
    
    /**
     * Gets (as xml) the "namespace" element
     */
    org.apache.xmlbeans.XmlString xgetNamespace();
    
    /**
     * Sets the "namespace" element
     */
    void setNamespace(java.lang.String namespace);
    
    /**
     * Sets (as xml) the "namespace" element
     */
    void xsetNamespace(org.apache.xmlbeans.XmlString namespace);
    
    /**
     * Gets a List of "particle" elements
     */
    java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> getParticleList();
    
    /**
     * Gets array of all "particle" elements
     * @deprecated
     */
    com.eviware.soapui.inferredSchema.ParticleConfig[] getParticleArray();
    
    /**
     * Gets ith "particle" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig getParticleArray(int i);
    
    /**
     * Returns number of "particle" element
     */
    int sizeOfParticleArray();
    
    /**
     * Sets array of all "particle" element
     */
    void setParticleArray(com.eviware.soapui.inferredSchema.ParticleConfig[] particleArray);
    
    /**
     * Sets ith "particle" element
     */
    void setParticleArray(int i, com.eviware.soapui.inferredSchema.ParticleConfig particle);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "particle" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig insertNewParticle(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "particle" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig addNewParticle();
    
    /**
     * Removes the ith "particle" element
     */
    void removeParticle(int i);
    
    /**
     * Gets a List of "prefix" elements
     */
    java.util.List<com.eviware.soapui.inferredSchema.MapEntryConfig> getPrefixList();
    
    /**
     * Gets array of all "prefix" elements
     * @deprecated
     */
    com.eviware.soapui.inferredSchema.MapEntryConfig[] getPrefixArray();
    
    /**
     * Gets ith "prefix" element
     */
    com.eviware.soapui.inferredSchema.MapEntryConfig getPrefixArray(int i);
    
    /**
     * Returns number of "prefix" element
     */
    int sizeOfPrefixArray();
    
    /**
     * Sets array of all "prefix" element
     */
    void setPrefixArray(com.eviware.soapui.inferredSchema.MapEntryConfig[] prefixArray);
    
    /**
     * Sets ith "prefix" element
     */
    void setPrefixArray(int i, com.eviware.soapui.inferredSchema.MapEntryConfig prefix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    com.eviware.soapui.inferredSchema.MapEntryConfig insertNewPrefix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    com.eviware.soapui.inferredSchema.MapEntryConfig addNewPrefix();
    
    /**
     * Removes the ith "prefix" element
     */
    void removePrefix(int i);
    
    /**
     * Gets a List of "complexType" elements
     */
    java.util.List<com.eviware.soapui.inferredSchema.ComplexTypeConfig> getComplexTypeList();
    
    /**
     * Gets array of all "complexType" elements
     * @deprecated
     */
    com.eviware.soapui.inferredSchema.ComplexTypeConfig[] getComplexTypeArray();
    
    /**
     * Gets ith "complexType" element
     */
    com.eviware.soapui.inferredSchema.ComplexTypeConfig getComplexTypeArray(int i);
    
    /**
     * Returns number of "complexType" element
     */
    int sizeOfComplexTypeArray();
    
    /**
     * Sets array of all "complexType" element
     */
    void setComplexTypeArray(com.eviware.soapui.inferredSchema.ComplexTypeConfig[] complexTypeArray);
    
    /**
     * Sets ith "complexType" element
     */
    void setComplexTypeArray(int i, com.eviware.soapui.inferredSchema.ComplexTypeConfig complexType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "complexType" element
     */
    com.eviware.soapui.inferredSchema.ComplexTypeConfig insertNewComplexType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "complexType" element
     */
    com.eviware.soapui.inferredSchema.ComplexTypeConfig addNewComplexType();
    
    /**
     * Removes the ith "complexType" element
     */
    void removeComplexType(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.inferredSchema.SchemaConfig newInstance() {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.inferredSchema.SchemaConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.inferredSchema.SchemaConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
