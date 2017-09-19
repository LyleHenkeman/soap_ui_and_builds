/*
 * XML Type:  service-ref_handlerType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML service-ref_handlerType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface ServiceRefHandlerType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceRefHandlerType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("servicerefhandlertype7ae7type");
    
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
     * Gets the "handler-name" element
     */
    com.sun.java.xml.ns.j2Ee.String getHandlerName();
    
    /**
     * Sets the "handler-name" element
     */
    void setHandlerName(com.sun.java.xml.ns.j2Ee.String handlerName);
    
    /**
     * Appends and returns a new empty "handler-name" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewHandlerName();
    
    /**
     * Gets the "handler-class" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType getHandlerClass();
    
    /**
     * Sets the "handler-class" element
     */
    void setHandlerClass(com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType handlerClass);
    
    /**
     * Appends and returns a new empty "handler-class" element
     */
    com.sun.java.xml.ns.j2Ee.FullyQualifiedClassType addNewHandlerClass();
    
    /**
     * Gets a List of "init-param" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ParamValueType> getInitParamList();
    
    /**
     * Gets array of all "init-param" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType[] getInitParamArray();
    
    /**
     * Gets ith "init-param" element
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType getInitParamArray(int i);
    
    /**
     * Returns number of "init-param" element
     */
    int sizeOfInitParamArray();
    
    /**
     * Sets array of all "init-param" element
     */
    void setInitParamArray(com.sun.java.xml.ns.j2Ee.ParamValueType[] initParamArray);
    
    /**
     * Sets ith "init-param" element
     */
    void setInitParamArray(int i, com.sun.java.xml.ns.j2Ee.ParamValueType initParam);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "init-param" element
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType insertNewInitParam(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "init-param" element
     */
    com.sun.java.xml.ns.j2Ee.ParamValueType addNewInitParam();
    
    /**
     * Removes the ith "init-param" element
     */
    void removeInitParam(int i);
    
    /**
     * Gets a List of "soap-header" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.XsdQNameType> getSoapHeaderList();
    
    /**
     * Gets array of all "soap-header" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType[] getSoapHeaderArray();
    
    /**
     * Gets ith "soap-header" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType getSoapHeaderArray(int i);
    
    /**
     * Returns number of "soap-header" element
     */
    int sizeOfSoapHeaderArray();
    
    /**
     * Sets array of all "soap-header" element
     */
    void setSoapHeaderArray(com.sun.java.xml.ns.j2Ee.XsdQNameType[] soapHeaderArray);
    
    /**
     * Sets ith "soap-header" element
     */
    void setSoapHeaderArray(int i, com.sun.java.xml.ns.j2Ee.XsdQNameType soapHeader);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-header" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType insertNewSoapHeader(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-header" element
     */
    com.sun.java.xml.ns.j2Ee.XsdQNameType addNewSoapHeader();
    
    /**
     * Removes the ith "soap-header" element
     */
    void removeSoapHeader(int i);
    
    /**
     * Gets a List of "soap-role" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.String> getSoapRoleList();
    
    /**
     * Gets array of all "soap-role" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.String[] getSoapRoleArray();
    
    /**
     * Gets ith "soap-role" element
     */
    com.sun.java.xml.ns.j2Ee.String getSoapRoleArray(int i);
    
    /**
     * Returns number of "soap-role" element
     */
    int sizeOfSoapRoleArray();
    
    /**
     * Sets array of all "soap-role" element
     */
    void setSoapRoleArray(com.sun.java.xml.ns.j2Ee.String[] soapRoleArray);
    
    /**
     * Sets ith "soap-role" element
     */
    void setSoapRoleArray(int i, com.sun.java.xml.ns.j2Ee.String soapRole);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soap-role" element
     */
    com.sun.java.xml.ns.j2Ee.String insertNewSoapRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soap-role" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewSoapRole();
    
    /**
     * Removes the ith "soap-role" element
     */
    void removeSoapRole(int i);
    
    /**
     * Gets a List of "port-name" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.String> getPortNameList();
    
    /**
     * Gets array of all "port-name" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.String[] getPortNameArray();
    
    /**
     * Gets ith "port-name" element
     */
    com.sun.java.xml.ns.j2Ee.String getPortNameArray(int i);
    
    /**
     * Returns number of "port-name" element
     */
    int sizeOfPortNameArray();
    
    /**
     * Sets array of all "port-name" element
     */
    void setPortNameArray(com.sun.java.xml.ns.j2Ee.String[] portNameArray);
    
    /**
     * Sets ith "port-name" element
     */
    void setPortNameArray(int i, com.sun.java.xml.ns.j2Ee.String portName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "port-name" element
     */
    com.sun.java.xml.ns.j2Ee.String insertNewPortName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "port-name" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewPortName();
    
    /**
     * Removes the ith "port-name" element
     */
    void removePortName(int i);
    
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
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.ServiceRefHandlerType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
