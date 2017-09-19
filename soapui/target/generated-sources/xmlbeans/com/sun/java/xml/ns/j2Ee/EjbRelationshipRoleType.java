/*
 * XML Type:  ejb-relationship-roleType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML ejb-relationship-roleType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface EjbRelationshipRoleType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EjbRelationshipRoleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("ejbrelationshiproletype179ctype");
    
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
     * Gets the "ejb-relationship-role-name" element
     */
    com.sun.java.xml.ns.j2Ee.String getEjbRelationshipRoleName();
    
    /**
     * True if has "ejb-relationship-role-name" element
     */
    boolean isSetEjbRelationshipRoleName();
    
    /**
     * Sets the "ejb-relationship-role-name" element
     */
    void setEjbRelationshipRoleName(com.sun.java.xml.ns.j2Ee.String ejbRelationshipRoleName);
    
    /**
     * Appends and returns a new empty "ejb-relationship-role-name" element
     */
    com.sun.java.xml.ns.j2Ee.String addNewEjbRelationshipRoleName();
    
    /**
     * Unsets the "ejb-relationship-role-name" element
     */
    void unsetEjbRelationshipRoleName();
    
    /**
     * Gets the "multiplicity" element
     */
    com.sun.java.xml.ns.j2Ee.MultiplicityType getMultiplicity();
    
    /**
     * Sets the "multiplicity" element
     */
    void setMultiplicity(com.sun.java.xml.ns.j2Ee.MultiplicityType multiplicity);
    
    /**
     * Appends and returns a new empty "multiplicity" element
     */
    com.sun.java.xml.ns.j2Ee.MultiplicityType addNewMultiplicity();
    
    /**
     * Gets the "cascade-delete" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType getCascadeDelete();
    
    /**
     * True if has "cascade-delete" element
     */
    boolean isSetCascadeDelete();
    
    /**
     * Sets the "cascade-delete" element
     */
    void setCascadeDelete(com.sun.java.xml.ns.j2Ee.EmptyType cascadeDelete);
    
    /**
     * Appends and returns a new empty "cascade-delete" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType addNewCascadeDelete();
    
    /**
     * Unsets the "cascade-delete" element
     */
    void unsetCascadeDelete();
    
    /**
     * Gets the "relationship-role-source" element
     */
    com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType getRelationshipRoleSource();
    
    /**
     * Sets the "relationship-role-source" element
     */
    void setRelationshipRoleSource(com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType relationshipRoleSource);
    
    /**
     * Appends and returns a new empty "relationship-role-source" element
     */
    com.sun.java.xml.ns.j2Ee.RelationshipRoleSourceType addNewRelationshipRoleSource();
    
    /**
     * Gets the "cmr-field" element
     */
    com.sun.java.xml.ns.j2Ee.CmrFieldType getCmrField();
    
    /**
     * True if has "cmr-field" element
     */
    boolean isSetCmrField();
    
    /**
     * Sets the "cmr-field" element
     */
    void setCmrField(com.sun.java.xml.ns.j2Ee.CmrFieldType cmrField);
    
    /**
     * Appends and returns a new empty "cmr-field" element
     */
    com.sun.java.xml.ns.j2Ee.CmrFieldType addNewCmrField();
    
    /**
     * Unsets the "cmr-field" element
     */
    void unsetCmrField();
    
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
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EjbRelationshipRoleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
