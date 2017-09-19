/*
 * XML Type:  service-endpoint-interface-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML service-endpoint-interface-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface ServiceEndpointInterfaceMappingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceEndpointInterfaceMappingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("serviceendpointinterfacemappingtypefcadtype");
    
    /**
     * Gets the "service-endpoint-interface" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceEndpointInterface();
    
    /**
     * Sets the "service-endpoint-interface" element
     */
    void setServiceEndpointInterface(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType serviceEndpointInterface);
    
    /**
     * Appends and returns a new empty "service-endpoint-interface" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewServiceEndpointInterface();
    
    /**
     * Gets the "wsdl-port-type" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType getWsdlPortType();
    
    /**
     * Sets the "wsdl-port-type" element
     */
    void setWsdlPortType(com.sun.java.xml.ns.j2Ee.XsdQNameType wsdlPortType);
    
    /**
     * Appends and returns a new empty "wsdl-port-type" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType addNewWsdlPortType();
    
    /**
     * Gets the "wsdl-binding" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType getWsdlBinding();
    
    /**
     * Sets the "wsdl-binding" element
     */
    void setWsdlBinding(com.sun.java.xml.ns.j2Ee.XsdQNameType wsdlBinding);
    
    /**
     * Appends and returns a new empty "wsdl-binding" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType addNewWsdlBinding();
    
    /**
     * Gets a List of "service-endpoint-method-mapping" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType> getServiceEndpointMethodMappingList();
    
    /**
     * Gets array of all "service-endpoint-method-mapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType[] getServiceEndpointMethodMappingArray();
    
    /**
     * Gets ith "service-endpoint-method-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType getServiceEndpointMethodMappingArray(int i);
    
    /**
     * Returns number of "service-endpoint-method-mapping" element
     */
    int sizeOfServiceEndpointMethodMappingArray();
    
    /**
     * Sets array of all "service-endpoint-method-mapping" element
     */
    void setServiceEndpointMethodMappingArray(com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType[] serviceEndpointMethodMappingArray);
    
    /**
     * Sets ith "service-endpoint-method-mapping" element
     */
    void setServiceEndpointMethodMappingArray(int i, com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType serviceEndpointMethodMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service-endpoint-method-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType insertNewServiceEndpointMethodMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service-endpoint-method-mapping" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceEndpointMethodMappingType addNewServiceEndpointMethodMapping();
    
    /**
     * Removes the ith "service-endpoint-method-mapping" element
     */
    void removeServiceEndpointMethodMapping(int i);
    
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
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceEndpointInterfaceMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
