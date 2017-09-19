/*
 * XML Type:  serviceType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config;


/**
 * An XML serviceType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public interface ServiceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("servicetype4a16type");
    
    /**
     * Gets a List of "interface" elements
     */
    java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType> getInterfaceList();
    
    /**
     * Gets array of all "interface" elements
     * @deprecated
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType[] getInterfaceArray();
    
    /**
     * Gets ith "interface" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType getInterfaceArray(int i);
    
    /**
     * Returns number of "interface" element
     */
    int sizeOfInterfaceArray();
    
    /**
     * Sets array of all "interface" element
     */
    void setInterfaceArray(com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType[] xinterfaceArray);
    
    /**
     * Sets ith "interface" element
     */
    void setInterfaceArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType xinterface);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interface" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType insertNewInterface(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interface" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.InterfaceType addNewInterface();
    
    /**
     * Removes the ith "interface" element
     */
    void removeInterface(int i);
    
    /**
     * Gets the "typeMappingRegistry" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType getTypeMappingRegistry();
    
    /**
     * True if has "typeMappingRegistry" element
     */
    boolean isSetTypeMappingRegistry();
    
    /**
     * Sets the "typeMappingRegistry" element
     */
    void setTypeMappingRegistry(com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType typeMappingRegistry);
    
    /**
     * Appends and returns a new empty "typeMappingRegistry" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.TypeMappingRegistryType addNewTypeMappingRegistry();
    
    /**
     * Unsets the "typeMappingRegistry" element
     */
    void unsetTypeMappingRegistry();
    
    /**
     * Gets the "handlerChains" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType getHandlerChains();
    
    /**
     * True if has "handlerChains" element
     */
    boolean isSetHandlerChains();
    
    /**
     * Sets the "handlerChains" element
     */
    void setHandlerChains(com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType handlerChains);
    
    /**
     * Appends and returns a new empty "handlerChains" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.HandlerChainsType addNewHandlerChains();
    
    /**
     * Unsets the "handlerChains" element
     */
    void unsetHandlerChains();
    
    /**
     * Gets the "namespaceMappingRegistry" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType getNamespaceMappingRegistry();
    
    /**
     * True if has "namespaceMappingRegistry" element
     */
    boolean isSetNamespaceMappingRegistry();
    
    /**
     * Sets the "namespaceMappingRegistry" element
     */
    void setNamespaceMappingRegistry(com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType namespaceMappingRegistry);
    
    /**
     * Appends and returns a new empty "namespaceMappingRegistry" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType addNewNamespaceMappingRegistry();
    
    /**
     * Unsets the "namespaceMappingRegistry" element
     */
    void unsetNamespaceMappingRegistry();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "targetNamespace" attribute
     */
    java.lang.String getTargetNamespace();
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace();
    
    /**
     * Sets the "targetNamespace" attribute
     */
    void setTargetNamespace(java.lang.String targetNamespace);
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace);
    
    /**
     * Gets the "typeNamespace" attribute
     */
    java.lang.String getTypeNamespace();
    
    /**
     * Gets (as xml) the "typeNamespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTypeNamespace();
    
    /**
     * Sets the "typeNamespace" attribute
     */
    void setTypeNamespace(java.lang.String typeNamespace);
    
    /**
     * Sets (as xml) the "typeNamespace" attribute
     */
    void xsetTypeNamespace(org.apache.xmlbeans.XmlAnyURI typeNamespace);
    
    /**
     * Gets the "packageName" attribute
     */
    java.lang.String getPackageName();
    
    /**
     * Gets (as xml) the "packageName" attribute
     */
    org.apache.xmlbeans.XmlString xgetPackageName();
    
    /**
     * Sets the "packageName" attribute
     */
    void setPackageName(java.lang.String packageName);
    
    /**
     * Sets (as xml) the "packageName" attribute
     */
    void xsetPackageName(org.apache.xmlbeans.XmlString packageName);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType newInstance() {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
