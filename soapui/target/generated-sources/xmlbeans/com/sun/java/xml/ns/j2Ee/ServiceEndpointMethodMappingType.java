/*
 * XML Type:  service-endpoint-method-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML service-endpoint-method-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface ServiceEndpointMethodMappingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceEndpointMethodMappingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("serviceendpointmethodmappingtyped1e3type");
    
    /**
     * Gets the "java-method-name" element
     */
    com.sun.java.xml.ns.j2Ee.String getJavaMethodName();
    
    /**
     * Sets the "java-method-name" element
     */
    void setJavaMethodName(com.sun.java.xml.ns.j2Ee.String javaMethodName);
    
    /**
     * Appends and returns a new empty "java-method-name" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewJavaMethodName();
    
    /**
     * Gets the "wsdl-operation" element
     */
    com.sun.java.xml.ns.j2Ee.String getWsdlOperation();
    
    /**
     * Sets the "wsdl-operation" element
     */
    void setWsdlOperation(com.sun.java.xml.ns.j2Ee.String wsdlOperation);
    
    /**
     * Appends and returns a new empty "wsdl-operation" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewWsdlOperation();
    
    /**
     * Gets the "wrapped-element" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType getWrappedElement();
    
    /**
     * True if has "wrapped-element" element
     */
    boolean isSetWrappedElement();
    
    /**
     * Sets the "wrapped-element" element
     */
    void setWrappedElement(com.sun.java.xml.ns.j2Ee.EmptyType wrappedElement);
    
    /**
     * Appends and returns a new empty "wrapped-element" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType addNewWrappedElement();
    
    /**
     * Unsets the "wrapped-element" element
     */
    void unsetWrappedElement();
    
    /**
     * Gets a List of "method-param-parts-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType> getMethodParamPartsMappingList();
    
    /**
     * Gets array of all "method-param-parts-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType[] getMethodParamPartsMappingArray();
    
    /**
     * Gets ith "method-param-parts-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType getMethodParamPartsMappingArray(int i);
    
    /**
     * Returns number of "method-param-parts-mapping" element
     */
    int sizeOfMethodParamPartsMappingArray();
    
    /**
     * Sets array of all "method-param-parts-mapping" element
     */
    void setMethodParamPartsMappingArray(com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType[] methodParamPartsMappingArray);
    
    /**
     * Sets ith "method-param-parts-mapping" element
     */
    void setMethodParamPartsMappingArray(int i, com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType methodParamPartsMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method-param-parts-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType insertNewMethodParamPartsMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method-param-parts-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.MethodParamPartsMappingType addNewMethodParamPartsMapping();
    
    /**
     * Removes the ith "method-param-parts-mapping" element
     */
    void removeMethodParamPartsMapping(int i);
    
    /**
     * Gets the "wsdl-return-value-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType getWsdlReturnValueMapping();
    
    /**
     * True if has "wsdl-return-value-mapping" element
     */
    boolean isSetWsdlReturnValueMapping();
    
    /**
     * Sets the "wsdl-return-value-mapping" element
     */
    void setWsdlReturnValueMapping(com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType wsdlReturnValueMapping);
    
    /**
     * Appends and returns a new empty "wsdl-return-value-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.WsdlReturnValueMappingType addNewWsdlReturnValueMapping();
    
    /**
     * Unsets the "wsdl-return-value-mapping" element
     */
    void unsetWsdlReturnValueMapping();
    
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
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
