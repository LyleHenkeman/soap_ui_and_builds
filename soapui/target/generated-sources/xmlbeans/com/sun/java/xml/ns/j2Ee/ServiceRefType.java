/*
 * XML Type:  service-refType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceRefType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML service-refType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface ServiceRefType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("servicereftypef85ctype");
    
    /**
     * Gets a List of "description" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.DescriptionType> getDescriptionList();
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(com.sun.java.xml.ns.j2Ee.DescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, com.sun.java.xml.ns.j2Ee.DescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets a List of "display-name" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.DisplayNameType> getDisplayNameList();
    
    /**
     * Gets array of all "display-name" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType[] getDisplayNameArray();
    
    /**
     * Gets ith "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType getDisplayNameArray(int i);
    
    /**
     * Returns number of "display-name" element
     */
    int sizeOfDisplayNameArray();
    
    /**
     * Sets array of all "display-name" element
     */
    void setDisplayNameArray(com.sun.java.xml.ns.j2Ee.DisplayNameType[] displayNameArray);
    
    /**
     * Sets ith "display-name" element
     */
    void setDisplayNameArray(int i, com.sun.java.xml.ns.j2Ee.DisplayNameType displayName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType insertNewDisplayName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType addNewDisplayName();
    
    /**
     * Removes the ith "display-name" element
     */
    void removeDisplayName(int i);
    
    /**
     * Gets a List of "icon" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.IconType> getIconList();
    
    /**
     * Gets array of all "icon" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.IconType[] getIconArray();
    
    /**
     * Gets ith "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType getIconArray(int i);
    
    /**
     * Returns number of "icon" element
     */
    int sizeOfIconArray();
    
    /**
     * Sets array of all "icon" element
     */
    void setIconArray(com.sun.java.xml.ns.j2Ee.IconType[] iconArray);
    
    /**
     * Sets ith "icon" element
     */
    void setIconArray(int i, com.sun.java.xml.ns.j2Ee.IconType icon);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType insertNewIcon(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType addNewIcon();
    
    /**
     * Removes the ith "icon" element
     */
    void removeIcon(int i);
    
    /**
     * Gets the "service-ref-name" element
     */
    com.sun.java.xml.ns.j2Ee.JndiNameType getServiceRefName();
    
    /**
     * Sets the "service-ref-name" element
     */
    void setServiceRefName(com.sun.java.xml.ns.j2Ee.JndiNameType serviceRefName);
    
    /**
     * Appends and returns a new empty "service-ref-name" element
     */
    com.sun.java.xml.ns.j2Ee.JndiNameType addNewServiceRefName();
    
    /**
     * Gets the "service-interface" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getServiceInterface();
    
    /**
     * Sets the "service-interface" element
     */
    void setServiceInterface(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType serviceInterface);
    
    /**
     * Appends and returns a new empty "service-interface" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewServiceInterface();
    
    /**
     * Gets the "wsdl-file" element
     */
    com.sun.java.xml.ns.j2Ee.XsdAnyURIType getWsdlFile();
    
    /**
     * True if has "wsdl-file" element
     */
    boolean isSetWsdlFile();
    
    /**
     * Sets the "wsdl-file" element
     */
    void setWsdlFile(com.sun.java.xml.ns.j2Ee.XsdAnyURIType wsdlFile);
    
    /**
     * Appends and returns a new empty "wsdl-file" element
     */
    com.sun.java.xml.ns.j2Ee.XsdAnyURIType addNewWsdlFile();
    
    /**
     * Unsets the "wsdl-file" element
     */
    void unsetWsdlFile();
    
    /**
     * Gets the "jaxrpc-mapping-file" element
     */
    com.sun.java.xml.ns.j2Ee.PathType getJaxrpcMappingFile();
    
    /**
     * True if has "jaxrpc-mapping-file" element
     */
    boolean isSetJaxrpcMappingFile();
    
    /**
     * Sets the "jaxrpc-mapping-file" element
     */
    void setJaxrpcMappingFile(com.sun.java.xml.ns.j2Ee.PathType jaxrpcMappingFile);
    
    /**
     * Appends and returns a new empty "jaxrpc-mapping-file" element
     */
    com.sun.java.xml.ns.j2Ee.PathType addNewJaxrpcMappingFile();
    
    /**
     * Unsets the "jaxrpc-mapping-file" element
     */
    void unsetJaxrpcMappingFile();
    
    /**
     * Gets the "service-qname" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType getServiceQname();
    
    /**
     * True if has "service-qname" element
     */
    boolean isSetServiceQname();
    
    /**
     * Sets the "service-qname" element
     */
    void setServiceQname(com.sun.java.xml.ns.j2Ee.XsdQNameType serviceQname);
    
    /**
     * Appends and returns a new empty "service-qname" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType addNewServiceQname();
    
    /**
     * Unsets the "service-qname" element
     */
    void unsetServiceQname();
    
    /**
     * Gets a List of "port-component-ref" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentRefType> getPortComponentRefList();
    
    /**
     * Gets array of all "port-component-ref" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.PortComponentRefType[] getPortComponentRefArray();
    
    /**
     * Gets ith "port-component-ref" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentRefType getPortComponentRefArray(int i);
    
    /**
     * Returns number of "port-component-ref" element
     */
    int sizeOfPortComponentRefArray();
    
    /**
     * Sets array of all "port-component-ref" element
     */
    void setPortComponentRefArray(com.sun.java.xml.ns.j2Ee.PortComponentRefType[] portComponentRefArray);
    
    /**
     * Sets ith "port-component-ref" element
     */
    void setPortComponentRefArray(int i, com.sun.java.xml.ns.j2Ee.PortComponentRefType portComponentRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-component-ref" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentRefType insertNewPortComponentRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-component-ref" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentRefType addNewPortComponentRef();
    
    /**
     * Removes the ith "port-component-ref" element
     */
    void removePortComponentRef(int i);
    
    /**
     * Gets a List of "handler" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType> getHandlerList();
    
    /**
     * Gets array of all "handler" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType[] getHandlerArray();
    
    /**
     * Gets ith "handler" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType getHandlerArray(int i);
    
    /**
     * Returns number of "handler" element
     */
    int sizeOfHandlerArray();
    
    /**
     * Sets array of all "handler" element
     */
    void setHandlerArray(com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType[] handlerArray);
    
    /**
     * Sets ith "handler" element
     */
    void setHandlerArray(int i, com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType handler);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType insertNewHandler(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType addNewHandler();
    
    /**
     * Removes the ith "handler" element
     */
    void removeHandler(int i);
    
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
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
