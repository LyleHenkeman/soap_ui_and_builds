/*
 * XML Type:  java-wsdl-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML java-wsdl-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface JavaWsdlMappingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JavaWsdlMappingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("javawsdlmappingtypea951type");
    
    /**
     * Gets a List of "package-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.PackageMappingType> getPackageMappingList();
    
    /**
     * Gets array of all "package-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.PackageMappingType[] getPackageMappingArray();
    
    /**
     * Gets ith "package-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.PackageMappingType getPackageMappingArray(int i);
    
    /**
     * Returns number of "package-mapping" element
     */
    int sizeOfPackageMappingArray();
    
    /**
     * Sets array of all "package-mapping" element
     */
    void setPackageMappingArray(com.sun.java.xml.ns.j2Ee.PackageMappingType[] packageMappingArray);
    
    /**
     * Sets ith "package-mapping" element
     */
    void setPackageMappingArray(int i, com.sun.java.xml.ns.j2Ee.PackageMappingType packageMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "package-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.PackageMappingType insertNewPackageMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "package-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.PackageMappingType addNewPackageMapping();
    
    /**
     * Removes the ith "package-mapping" element
     */
    void removePackageMapping(int i);
    
    /**
     * Gets a List of "java-xml-type-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType> getJavaXmlTypeMappingList();
    
    /**
     * Gets array of all "java-xml-type-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType[] getJavaXmlTypeMappingArray();
    
    /**
     * Gets ith "java-xml-type-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType getJavaXmlTypeMappingArray(int i);
    
    /**
     * Returns number of "java-xml-type-mapping" element
     */
    int sizeOfJavaXmlTypeMappingArray();
    
    /**
     * Sets array of all "java-xml-type-mapping" element
     */
    void setJavaXmlTypeMappingArray(com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType[] javaXmlTypeMappingArray);
    
    /**
     * Sets ith "java-xml-type-mapping" element
     */
    void setJavaXmlTypeMappingArray(int i, com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType javaXmlTypeMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "java-xml-type-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType insertNewJavaXmlTypeMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "java-xml-type-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.JavaXmlTypeMappingType addNewJavaXmlTypeMapping();
    
    /**
     * Removes the ith "java-xml-type-mapping" element
     */
    void removeJavaXmlTypeMapping(int i);
    
    /**
     * Gets a List of "exception-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ExceptionMappingType> getExceptionMappingList();
    
    /**
     * Gets array of all "exception-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ExceptionMappingType[] getExceptionMappingArray();
    
    /**
     * Gets ith "exception-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ExceptionMappingType getExceptionMappingArray(int i);
    
    /**
     * Returns number of "exception-mapping" element
     */
    int sizeOfExceptionMappingArray();
    
    /**
     * Sets array of all "exception-mapping" element
     */
    void setExceptionMappingArray(com.sun.java.xml.ns.j2Ee.ExceptionMappingType[] exceptionMappingArray);
    
    /**
     * Sets ith "exception-mapping" element
     */
    void setExceptionMappingArray(int i, com.sun.java.xml.ns.j2Ee.ExceptionMappingType exceptionMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "exception-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ExceptionMappingType insertNewExceptionMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "exception-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ExceptionMappingType addNewExceptionMapping();
    
    /**
     * Removes the ith "exception-mapping" element
     */
    void removeExceptionMapping(int i);
    
    /**
     * Gets a List of "service-interface-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType> getServiceInterfaceMappingList();
    
    /**
     * Gets array of all "service-interface-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType[] getServiceInterfaceMappingArray();
    
    /**
     * Gets ith "service-interface-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType getServiceInterfaceMappingArray(int i);
    
    /**
     * Returns number of "service-interface-mapping" element
     */
    int sizeOfServiceInterfaceMappingArray();
    
    /**
     * Sets array of all "service-interface-mapping" element
     */
    void setServiceInterfaceMappingArray(com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType[] serviceInterfaceMappingArray);
    
    /**
     * Sets ith "service-interface-mapping" element
     */
    void setServiceInterfaceMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType serviceInterfaceMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-interface-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType insertNewServiceInterfaceMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-interface-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceInterfaceMappingType addNewServiceInterfaceMapping();
    
    /**
     * Removes the ith "service-interface-mapping" element
     */
    void removeServiceInterfaceMapping(int i);
    
    /**
     * Gets a List of "service-endpoint-interface-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType> getServiceEndpointInterfaceMappingList();
    
    /**
     * Gets array of all "service-endpoint-interface-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType[] getServiceEndpointInterfaceMappingArray();
    
    /**
     * Gets ith "service-endpoint-interface-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType getServiceEndpointInterfaceMappingArray(int i);
    
    /**
     * Returns number of "service-endpoint-interface-mapping" element
     */
    int sizeOfServiceEndpointInterfaceMappingArray();
    
    /**
     * Sets array of all "service-endpoint-interface-mapping" element
     */
    void setServiceEndpointInterfaceMappingArray(com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType[] serviceEndpointInterfaceMappingArray);
    
    /**
     * Sets ith "service-endpoint-interface-mapping" element
     */
    void setServiceEndpointInterfaceMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType serviceEndpointInterfaceMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-endpoint-interface-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType insertNewServiceEndpointInterfaceMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-endpoint-interface-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType addNewServiceEndpointInterfaceMapping();
    
    /**
     * Removes the ith "service-endpoint-interface-mapping" element
     */
    void removeServiceEndpointInterfaceMapping(int i);
    
    /**
     * Gets the "version" attribute
     */
    java.math.BigDecimal getVersion();
    
    /**
     * Gets (as xml) the "version" attribute
     */
    com.sun.java.xml.ns.j2Ee.DeweyVersionType xgetVersion();
    
    /**
     * Sets the "version" attribute
     */
    void setVersion(java.math.BigDecimal version);
    
    /**
     * Sets (as xml) the "version" attribute
     */
    void xsetVersion(com.sun.java.xml.ns.j2Ee.DeweyVersionType version);
    
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
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.JavaWsdlMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
