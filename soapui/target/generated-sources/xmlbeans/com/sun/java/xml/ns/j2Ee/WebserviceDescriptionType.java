/*
 * XML Type:  webservice-descriptionType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML webservice-descriptionType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface WebserviceDescriptionType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WebserviceDescriptionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("webservicedescriptiontype0c23type");
    
    /**
     * Gets the "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType getDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(com.sun.java.xml.ns.j2Ee.DescriptionType description);
    
    /**
     * Appends and returns a new empty "description" element
     */
    com.sun.java.xml.ns.j2Ee.DescriptionType addNewDescription();
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType getDisplayName();
    
    /**
     * True if has "display-name" element
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "display-name" element
     */
    void setDisplayName(com.sun.java.xml.ns.j2Ee.DisplayNameType displayName);
    
    /**
     * Appends and returns a new empty "display-name" element
     */
    com.sun.java.xml.ns.j2Ee.DisplayNameType addNewDisplayName();
    
    /**
     * Unsets the "display-name" element
     */
    void unsetDisplayName();
    
    /**
     * Gets the "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType getIcon();
    
    /**
     * True if has "icon" element
     */
    boolean isSetIcon();
    
    /**
     * Sets the "icon" element
     */
    void setIcon(com.sun.java.xml.ns.j2Ee.IconType icon);
    
    /**
     * Appends and returns a new empty "icon" element
     */
    com.sun.java.xml.ns.j2Ee.IconType addNewIcon();
    
    /**
     * Unsets the "icon" element
     */
    void unsetIcon();
    
    /**
     * Gets the "webservice-description-name" element
     */
    com.sun.java.xml.ns.j2Ee.String getWebserviceDescriptionName();
    
    /**
     * Sets the "webservice-description-name" element
     */
    void setWebserviceDescriptionName(com.sun.java.xml.ns.j2Ee.String webserviceDescriptionName);
    
    /**
     * Appends and returns a new empty "webservice-description-name" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewWebserviceDescriptionName();
    
    /**
     * Gets the "wsdl-file" element
     */
    com.sun.java.xml.ns.j2Ee.PathType getWsdlFile();
    
    /**
     * Sets the "wsdl-file" element
     */
    void setWsdlFile(com.sun.java.xml.ns.j2Ee.PathType wsdlFile);
    
    /**
     * Appends and returns a new empty "wsdl-file" element
     */
    com.sun.java.xml.ns.j2Ee.PathType addNewWsdlFile();
    
    /**
     * Gets the "jaxrpc-mapping-file" element
     */
    com.sun.java.xml.ns.j2Ee.PathType getJaxrpcMappingFile();
    
    /**
     * Sets the "jaxrpc-mapping-file" element
     */
    void setJaxrpcMappingFile(com.sun.java.xml.ns.j2Ee.PathType jaxrpcMappingFile);
    
    /**
     * Appends and returns a new empty "jaxrpc-mapping-file" element
     */
    com.sun.java.xml.ns.j2Ee.PathType addNewJaxrpcMappingFile();
    
    /**
     * Gets a List of "port-component" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentType> getPortComponentList();
    
    /**
     * Gets array of all "port-component" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.PortComponentType[] getPortComponentArray();
    
    /**
     * Gets ith "port-component" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentType getPortComponentArray(int i);
    
    /**
     * Returns number of "port-component" element
     */
    int sizeOfPortComponentArray();
    
    /**
     * Sets array of all "port-component" element
     */
    void setPortComponentArray(com.sun.java.xml.ns.j2Ee.PortComponentType[] portComponentArray);
    
    /**
     * Sets ith "port-component" element
     */
    void setPortComponentArray(int i, com.sun.java.xml.ns.j2Ee.PortComponentType portComponent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-component" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentType insertNewPortComponent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-component" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentType addNewPortComponent();
    
    /**
     * Removes the ith "port-component" element
     */
    void removePortComponent(int i);
    
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
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.WebserviceDescriptionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
