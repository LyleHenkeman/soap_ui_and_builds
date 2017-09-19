/*
 * XML Type:  ejb-jarType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EjbJarType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML ejb-jarType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface EjbJarType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EjbJarType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("ejbjartype830ctype");
    
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
     * Gets the "enterprise-beans" element
     */
    com.sun.java.xml.ns.j2Ee.EnterpriseBeansType getEnterpriseBeans();
    
    /**
     * Sets the "enterprise-beans" element
     */
    void setEnterpriseBeans(com.sun.java.xml.ns.j2Ee.EnterpriseBeansType enterpriseBeans);
    
    /**
     * Appends and returns a new empty "enterprise-beans" element
     */
    com.sun.java.xml.ns.j2Ee.EnterpriseBeansType addNewEnterpriseBeans();
    
    /**
     * Gets the "relationships" element
     */
    com.sun.java.xml.ns.j2Ee.RelationshipsType getRelationships();
    
    /**
     * True if has "relationships" element
     */
    boolean isSetRelationships();
    
    /**
     * Sets the "relationships" element
     */
    void setRelationships(com.sun.java.xml.ns.j2Ee.RelationshipsType relationships);
    
    /**
     * Appends and returns a new empty "relationships" element
     */
    com.sun.java.xml.ns.j2Ee.RelationshipsType addNewRelationships();
    
    /**
     * Unsets the "relationships" element
     */
    void unsetRelationships();
    
    /**
     * Gets the "assembly-descriptor" element
     */
    com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType getAssemblyDescriptor();
    
    /**
     * True if has "assembly-descriptor" element
     */
    boolean isSetAssemblyDescriptor();
    
    /**
     * Sets the "assembly-descriptor" element
     */
    void setAssemblyDescriptor(com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType assemblyDescriptor);
    
    /**
     * Appends and returns a new empty "assembly-descriptor" element
     */
    com.sun.java.xml.ns.j2Ee.AssemblyDescriptorType addNewAssemblyDescriptor();
    
    /**
     * Unsets the "assembly-descriptor" element
     */
    void unsetAssemblyDescriptor();
    
    /**
     * Gets the "ejb-client-jar" element
     */
    com.sun.java.xml.ns.j2Ee.PathType getEjbClientJar();
    
    /**
     * True if has "ejb-client-jar" element
     */
    boolean isSetEjbClientJar();
    
    /**
     * Sets the "ejb-client-jar" element
     */
    void setEjbClientJar(com.sun.java.xml.ns.j2Ee.PathType ejbClientJar);
    
    /**
     * Appends and returns a new empty "ejb-client-jar" element
     */
    com.sun.java.xml.ns.j2Ee.PathType addNewEjbClientJar();
    
    /**
     * Unsets the "ejb-client-jar" element
     */
    void unsetEjbClientJar();
    
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
        public static com.sun.java.xml.ns.j2Ee.EjbJarType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EjbJarType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EjbJarType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
