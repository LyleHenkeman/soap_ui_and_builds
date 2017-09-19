/*
 * XML Type:  tDefinitions
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.TDefinitions
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl;


/**
 * An XML tDefinitions(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public interface TDefinitions extends org.xmlsoap.schemas.wsdl.TExtensibleDocumented
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TDefinitions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("tdefinitions5651type");
    
    /**
     * Gets a List of "import" elements
     */
    java.util.List<org.xmlsoap.schemas.wsdl.TImport> getImportList();
    
    /**
     * Gets array of all "import" elements
     * @deprecated
     */
    org.xmlsoap.schemas.wsdl.TImport[] getImportArray();
    
    /**
     * Gets ith "import" element
     */
    org.xmlsoap.schemas.wsdl.TImport getImportArray(int i);
    
    /**
     * Returns number of "import" element
     */
    int sizeOfImportArray();
    
    /**
     * Sets array of all "import" element
     */
    void setImportArray(org.xmlsoap.schemas.wsdl.TImport[] ximportArray);
    
    /**
     * Sets ith "import" element
     */
    void setImportArray(int i, org.xmlsoap.schemas.wsdl.TImport ximport);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    org.xmlsoap.schemas.wsdl.TImport insertNewImport(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    org.xmlsoap.schemas.wsdl.TImport addNewImport();
    
    /**
     * Removes the ith "import" element
     */
    void removeImport(int i);
    
    /**
     * Gets a List of "types" elements
     */
    java.util.List<org.xmlsoap.schemas.wsdl.TTypes> getTypesList();
    
    /**
     * Gets array of all "types" elements
     * @deprecated
     */
    org.xmlsoap.schemas.wsdl.TTypes[] getTypesArray();
    
    /**
     * Gets ith "types" element
     */
    org.xmlsoap.schemas.wsdl.TTypes getTypesArray(int i);
    
    /**
     * Returns number of "types" element
     */
    int sizeOfTypesArray();
    
    /**
     * Sets array of all "types" element
     */
    void setTypesArray(org.xmlsoap.schemas.wsdl.TTypes[] typesArray);
    
    /**
     * Sets ith "types" element
     */
    void setTypesArray(int i, org.xmlsoap.schemas.wsdl.TTypes types);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "types" element
     */
    org.xmlsoap.schemas.wsdl.TTypes insertNewTypes(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "types" element
     */
    org.xmlsoap.schemas.wsdl.TTypes addNewTypes();
    
    /**
     * Removes the ith "types" element
     */
    void removeTypes(int i);
    
    /**
     * Gets a List of "message" elements
     */
    java.util.List<org.xmlsoap.schemas.wsdl.TMessage> getMessageList();
    
    /**
     * Gets array of all "message" elements
     * @deprecated
     */
    org.xmlsoap.schemas.wsdl.TMessage[] getMessageArray();
    
    /**
     * Gets ith "message" element
     */
    org.xmlsoap.schemas.wsdl.TMessage getMessageArray(int i);
    
    /**
     * Returns number of "message" element
     */
    int sizeOfMessageArray();
    
    /**
     * Sets array of all "message" element
     */
    void setMessageArray(org.xmlsoap.schemas.wsdl.TMessage[] messageArray);
    
    /**
     * Sets ith "message" element
     */
    void setMessageArray(int i, org.xmlsoap.schemas.wsdl.TMessage message);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message" element
     */
    org.xmlsoap.schemas.wsdl.TMessage insertNewMessage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message" element
     */
    org.xmlsoap.schemas.wsdl.TMessage addNewMessage();
    
    /**
     * Removes the ith "message" element
     */
    void removeMessage(int i);
    
    /**
     * Gets a List of "portType" elements
     */
    java.util.List<org.xmlsoap.schemas.wsdl.TPortType> getPortTypeList();
    
    /**
     * Gets array of all "portType" elements
     * @deprecated
     */
    org.xmlsoap.schemas.wsdl.TPortType[] getPortTypeArray();
    
    /**
     * Gets ith "portType" element
     */
    org.xmlsoap.schemas.wsdl.TPortType getPortTypeArray(int i);
    
    /**
     * Returns number of "portType" element
     */
    int sizeOfPortTypeArray();
    
    /**
     * Sets array of all "portType" element
     */
    void setPortTypeArray(org.xmlsoap.schemas.wsdl.TPortType[] portTypeArray);
    
    /**
     * Sets ith "portType" element
     */
    void setPortTypeArray(int i, org.xmlsoap.schemas.wsdl.TPortType portType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "portType" element
     */
    org.xmlsoap.schemas.wsdl.TPortType insertNewPortType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "portType" element
     */
    org.xmlsoap.schemas.wsdl.TPortType addNewPortType();
    
    /**
     * Removes the ith "portType" element
     */
    void removePortType(int i);
    
    /**
     * Gets a List of "binding" elements
     */
    java.util.List<org.xmlsoap.schemas.wsdl.TBinding> getBindingList();
    
    /**
     * Gets array of all "binding" elements
     * @deprecated
     */
    org.xmlsoap.schemas.wsdl.TBinding[] getBindingArray();
    
    /**
     * Gets ith "binding" element
     */
    org.xmlsoap.schemas.wsdl.TBinding getBindingArray(int i);
    
    /**
     * Returns number of "binding" element
     */
    int sizeOfBindingArray();
    
    /**
     * Sets array of all "binding" element
     */
    void setBindingArray(org.xmlsoap.schemas.wsdl.TBinding[] bindingArray);
    
    /**
     * Sets ith "binding" element
     */
    void setBindingArray(int i, org.xmlsoap.schemas.wsdl.TBinding binding);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "binding" element
     */
    org.xmlsoap.schemas.wsdl.TBinding insertNewBinding(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "binding" element
     */
    org.xmlsoap.schemas.wsdl.TBinding addNewBinding();
    
    /**
     * Removes the ith "binding" element
     */
    void removeBinding(int i);
    
    /**
     * Gets a List of "service" elements
     */
    java.util.List<org.xmlsoap.schemas.wsdl.TService> getServiceList();
    
    /**
     * Gets array of all "service" elements
     * @deprecated
     */
    org.xmlsoap.schemas.wsdl.TService[] getServiceArray();
    
    /**
     * Gets ith "service" element
     */
    org.xmlsoap.schemas.wsdl.TService getServiceArray(int i);
    
    /**
     * Returns number of "service" element
     */
    int sizeOfServiceArray();
    
    /**
     * Sets array of all "service" element
     */
    void setServiceArray(org.xmlsoap.schemas.wsdl.TService[] serviceArray);
    
    /**
     * Sets ith "service" element
     */
    void setServiceArray(int i, org.xmlsoap.schemas.wsdl.TService service);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    org.xmlsoap.schemas.wsdl.TService insertNewService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    org.xmlsoap.schemas.wsdl.TService addNewService();
    
    /**
     * Removes the ith "service" element
     */
    void removeService(int i);
    
    /**
     * Gets the "targetNamespace" attribute
     */
    java.lang.String getTargetNamespace();
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace();
    
    /**
     * True if has "targetNamespace" attribute
     */
    boolean isSetTargetNamespace();
    
    /**
     * Sets the "targetNamespace" attribute
     */
    void setTargetNamespace(java.lang.String targetNamespace);
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace);
    
    /**
     * Unsets the "targetNamespace" attribute
     */
    void unsetTargetNamespace();
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();
    
    /**
     * True if has "name" attribute
     */
    boolean isSetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);
    
    /**
     * Unsets the "name" attribute
     */
    void unsetName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.xmlsoap.schemas.wsdl.TDefinitions newInstance() {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.wsdl.TDefinitions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.wsdl.TDefinitions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
