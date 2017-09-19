/*
 * XML Type:  namespaceMappingRegistryType
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config;


/**
 * An XML namespaceMappingRegistryType(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
 *
 * This is a complex type.
 */
public interface NamespaceMappingRegistryType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NamespaceMappingRegistryType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("namespacemappingregistrytypece29type");
    
    /**
     * Gets a List of "namespaceMapping" elements
     */
    java.util.List<com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType> getNamespaceMappingList();
    
    /**
     * Gets array of all "namespaceMapping" elements
     * @deprecated
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType[] getNamespaceMappingArray();
    
    /**
     * Gets ith "namespaceMapping" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType getNamespaceMappingArray(int i);
    
    /**
     * Returns number of "namespaceMapping" element
     */
    int sizeOfNamespaceMappingArray();
    
    /**
     * Sets array of all "namespaceMapping" element
     */
    void setNamespaceMappingArray(com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType[] namespaceMappingArray);
    
    /**
     * Sets ith "namespaceMapping" element
     */
    void setNamespaceMappingArray(int i, com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType namespaceMapping);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "namespaceMapping" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType insertNewNamespaceMapping(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "namespaceMapping" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingType addNewNamespaceMapping();
    
    /**
     * Removes the ith "namespaceMapping" element
     */
    void removeNamespaceMapping(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType newInstance() {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.NamespaceMappingRegistryType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
