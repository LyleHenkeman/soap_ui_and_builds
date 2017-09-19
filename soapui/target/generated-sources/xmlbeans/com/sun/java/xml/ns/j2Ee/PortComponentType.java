/*
 * XML Type:  port-componentType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.PortComponentType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML port-componentType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface PortComponentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PortComponentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("portcomponenttyped244type");
    
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
     * Gets the "port-component-name" element
     */
    com.sun.java.xml.ns.j2Ee.String getPortComponentName();
    
    /**
     * Sets the "port-component-name" element
     */
    void setPortComponentName(com.sun.java.xml.ns.j2Ee.String portComponentName);
    
    /**
     * Appends and returns a new empty "port-component-name" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewPortComponentName();
    
    /**
     * Gets the "wsdl-port" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType getWsdlPort();
    
    /**
     * Sets the "wsdl-port" element
     */
    void setWsdlPort(com.sun.java.xml.ns.j2Ee.XsdQNameType wsdlPort);
    
    /**
     * Appends and returns a new empty "wsdl-port" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType addNewWsdlPort();
    
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
     * Gets the "service-impl-bean" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceImplBeanType getServiceImplBean();
    
    /**
     * Sets the "service-impl-bean" element
     */
    void setServiceImplBean(com.sun.java.xml.ns.j2Ee.ServiceImplBeanType serviceImplBean);
    
    /**
     * Appends and returns a new empty "service-impl-bean" element
     */
    com.sun.java.xml.ns.j2Ee.ServiceImplBeanType addNewServiceImplBean();
    
    /**
     * Gets a List of "handler" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.PortComponentHandlerType> getHandlerList();
    
    /**
     * Gets array of all "handler" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.PortComponentHandlerType[] getHandlerArray();
    
    /**
     * Gets ith "handler" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentHandlerType getHandlerArray(int i);
    
    /**
     * Returns number of "handler" element
     */
    int sizeOfHandlerArray();
    
    /**
     * Sets array of all "handler" element
     */
    void setHandlerArray(com.sun.java.xml.ns.j2Ee.PortComponentHandlerType[] handlerArray);
    
    /**
     * Sets ith "handler" element
     */
    void setHandlerArray(int i, com.sun.java.xml.ns.j2Ee.PortComponentHandlerType handler);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "handler" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentHandlerType insertNewHandler(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "handler" element
     */
    com.sun.java.xml.ns.j2Ee.PortComponentHandlerType addNewHandler();
    
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
        public static com.sun.java.xml.ns.j2Ee.PortComponentType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.PortComponentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.PortComponentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
