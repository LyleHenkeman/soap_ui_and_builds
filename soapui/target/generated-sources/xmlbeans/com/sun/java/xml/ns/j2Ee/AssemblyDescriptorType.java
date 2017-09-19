/*
 * XML Type:  assembly-descriptorType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML assembly-descriptorType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface AssemblyDescriptorType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssemblyDescriptorType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("assemblydescriptortype3417type");
    
    /**
     * Gets a List of "security-role" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.SecurityRoleType> getSecurityRoleList();
    
    /**
     * Gets array of all "security-role" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType[] getSecurityRoleArray();
    
    /**
     * Gets ith "security-role" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType getSecurityRoleArray(int i);
    
    /**
     * Returns number of "security-role" element
     */
    int sizeOfSecurityRoleArray();
    
    /**
     * Sets array of all "security-role" element
     */
    void setSecurityRoleArray(com.sun.java.xml.ns.j2Ee.SecurityRoleType[] securityRoleArray);
    
    /**
     * Sets ith "security-role" element
     */
    void setSecurityRoleArray(int i, com.sun.java.xml.ns.j2Ee.SecurityRoleType securityRole);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "security-role" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType insertNewSecurityRole(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "security-role" element
     */
    com.sun.java.xml.ns.j2Ee.SecurityRoleType addNewSecurityRole();
    
    /**
     * Removes the ith "security-role" element
     */
    void removeSecurityRole(int i);
    
    /**
     * Gets a List of "method-permission" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MethodPermissionType> getMethodPermissionList();
    
    /**
     * Gets array of all "method-permission" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MethodPermissionType[] getMethodPermissionArray();
    
    /**
     * Gets ith "method-permission" element
     */
    com.sun.java.xml.ns.j2Ee.MethodPermissionType getMethodPermissionArray(int i);
    
    /**
     * Returns number of "method-permission" element
     */
    int sizeOfMethodPermissionArray();
    
    /**
     * Sets array of all "method-permission" element
     */
    void setMethodPermissionArray(com.sun.java.xml.ns.j2Ee.MethodPermissionType[] methodPermissionArray);
    
    /**
     * Sets ith "method-permission" element
     */
    void setMethodPermissionArray(int i, com.sun.java.xml.ns.j2Ee.MethodPermissionType methodPermission);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method-permission" element
     */
    com.sun.java.xml.ns.j2Ee.MethodPermissionType insertNewMethodPermission(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method-permission" element
     */
    com.sun.java.xml.ns.j2Ee.MethodPermissionType addNewMethodPermission();
    
    /**
     * Removes the ith "method-permission" element
     */
    void removeMethodPermission(int i);
    
    /**
     * Gets a List of "container-transaction" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.ContainerTransactionType> getContainerTransactionList();
    
    /**
     * Gets array of all "container-transaction" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.ContainerTransactionType[] getContainerTransactionArray();
    
    /**
     * Gets ith "container-transaction" element
     */
    com.sun.java.xml.ns.j2Ee.ContainerTransactionType getContainerTransactionArray(int i);
    
    /**
     * Returns number of "container-transaction" element
     */
    int sizeOfContainerTransactionArray();
    
    /**
     * Sets array of all "container-transaction" element
     */
    void setContainerTransactionArray(com.sun.java.xml.ns.j2Ee.ContainerTransactionType[] containerTransactionArray);
    
    /**
     * Sets ith "container-transaction" element
     */
    void setContainerTransactionArray(int i, com.sun.java.xml.ns.j2Ee.ContainerTransactionType containerTransaction);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "container-transaction" element
     */
    com.sun.java.xml.ns.j2Ee.ContainerTransactionType insertNewContainerTransaction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "container-transaction" element
     */
    com.sun.java.xml.ns.j2Ee.ContainerTransactionType addNewContainerTransaction();
    
    /**
     * Removes the ith "container-transaction" element
     */
    void removeContainerTransaction(int i);
    
    /**
     * Gets a List of "message-destination" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MessageDestinationType> getMessageDestinationList();
    
    /**
     * Gets array of all "message-destination" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType[] getMessageDestinationArray();
    
    /**
     * Gets ith "message-destination" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType getMessageDestinationArray(int i);
    
    /**
     * Returns number of "message-destination" element
     */
    int sizeOfMessageDestinationArray();
    
    /**
     * Sets array of all "message-destination" element
     */
    void setMessageDestinationArray(com.sun.java.xml.ns.j2Ee.MessageDestinationType[] messageDestinationArray);
    
    /**
     * Sets ith "message-destination" element
     */
    void setMessageDestinationArray(int i, com.sun.java.xml.ns.j2Ee.MessageDestinationType messageDestination);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-destination" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType insertNewMessageDestination(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-destination" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDestinationType addNewMessageDestination();
    
    /**
     * Removes the ith "message-destination" element
     */
    void removeMessageDestination(int i);
    
    /**
     * Gets the "exclude-list" element
     */
    com.sun.java.xml.ns.j2Ee.ExcludeListType getExcludeList();
    
    /**
     * True if has "exclude-list" element
     */
    boolean isSetExcludeList();
    
    /**
     * Sets the "exclude-list" element
     */
    void setExcludeList(com.sun.java.xml.ns.j2Ee.ExcludeListType excludeList);
    
    /**
     * Appends and returns a new empty "exclude-list" element
     */
    com.sun.java.xml.ns.j2Ee.ExcludeListType addNewExcludeList();
    
    /**
     * Unsets the "exclude-list" element
     */
    void unsetExcludeList();
    
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
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
