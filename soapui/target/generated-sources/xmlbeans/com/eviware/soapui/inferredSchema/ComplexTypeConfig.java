/*
 * XML Type:  ComplexType
 * Namespace: http://www.eviware.com/soapui/InferredSchema
 * Java type: com.eviware.soapui.inferredSchema.ComplexTypeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.inferredSchema;


/**
 * An XML ComplexType(@http://www.eviware.com/soapui/InferredSchema).
 *
 * This is a complex type.
 */
public interface ComplexTypeConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ComplexTypeConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("complextype4e03type");
    
    /**
     * Gets the "completed" element
     */
    boolean getCompleted();
    
    /**
     * Gets (as xml) the "completed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetCompleted();
    
    /**
     * Sets the "completed" element
     */
    void setCompleted(boolean completed);
    
    /**
     * Sets (as xml) the "completed" element
     */
    void xsetCompleted(org.apache.xmlbeans.XmlBoolean completed);
    
    /**
     * Gets the "mixed" element
     */
    boolean getMixed();
    
    /**
     * Gets (as xml) the "mixed" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMixed();
    
    /**
     * Sets the "mixed" element
     */
    void setMixed(boolean mixed);
    
    /**
     * Sets (as xml) the "mixed" element
     */
    void xsetMixed(org.apache.xmlbeans.XmlBoolean mixed);
    
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
     * Gets a List of "attribute" elements
     */
    java.util.List<com.eviware.soapui.inferredSchema.ParticleConfig> getAttributeList();
    
    /**
     * Gets array of all "attribute" elements
     * @deprecated
     */
    com.eviware.soapui.inferredSchema.ParticleConfig[] getAttributeArray();
    
    /**
     * Gets ith "attribute" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig getAttributeArray(int i);
    
    /**
     * Returns number of "attribute" element
     */
    int sizeOfAttributeArray();
    
    /**
     * Sets array of all "attribute" element
     */
    void setAttributeArray(com.eviware.soapui.inferredSchema.ParticleConfig[] attributeArray);
    
    /**
     * Sets ith "attribute" element
     */
    void setAttributeArray(int i, com.eviware.soapui.inferredSchema.ParticleConfig attribute);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "attribute" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig insertNewAttribute(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "attribute" element
     */
    com.eviware.soapui.inferredSchema.ParticleConfig addNewAttribute();
    
    /**
     * Removes the ith "attribute" element
     */
    void removeAttribute(int i);
    
    /**
     * Gets the "content" element
     */
    com.eviware.soapui.inferredSchema.ContentConfig getContent();
    
    /**
     * Sets the "content" element
     */
    void setContent(com.eviware.soapui.inferredSchema.ContentConfig content);
    
    /**
     * Appends and returns a new empty "content" element
     */
    com.eviware.soapui.inferredSchema.ContentConfig addNewContent();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig newInstance() {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.inferredSchema.ComplexTypeConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.inferredSchema.ComplexTypeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
