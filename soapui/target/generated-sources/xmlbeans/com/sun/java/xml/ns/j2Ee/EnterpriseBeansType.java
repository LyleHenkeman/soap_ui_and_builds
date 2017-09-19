/*
 * XML Type:  enterprise-beansType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.EnterpriseBeansType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML enterprise-beansType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface EnterpriseBeansType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnterpriseBeansType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("enterprisebeanstype43aatype");
    
    /**
     * Gets a List of "session" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.SessionBeanType> getSessionList();
    
    /**
     * Gets array of all "session" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.SessionBeanType[] getSessionArray();
    
    /**
     * Gets ith "session" element
     */
    com.sun.java.xml.ns.j2Ee.SessionBeanType getSessionArray(int i);
    
    /**
     * Returns number of "session" element
     */
    int sizeOfSessionArray();
    
    /**
     * Sets array of all "session" element
     */
    void setSessionArray(com.sun.java.xml.ns.j2Ee.SessionBeanType[] sessionArray);
    
    /**
     * Sets ith "session" element
     */
    void setSessionArray(int i, com.sun.java.xml.ns.j2Ee.SessionBeanType session);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "session" element
     */
    com.sun.java.xml.ns.j2Ee.SessionBeanType insertNewSession(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "session" element
     */
    com.sun.java.xml.ns.j2Ee.SessionBeanType addNewSession();
    
    /**
     * Removes the ith "session" element
     */
    void removeSession(int i);
    
    /**
     * Gets a List of "entity" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.EntityBeanType> getEntityList();
    
    /**
     * Gets array of all "entity" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.EntityBeanType[] getEntityArray();
    
    /**
     * Gets ith "entity" element
     */
    com.sun.java.xml.ns.j2Ee.EntityBeanType getEntityArray(int i);
    
    /**
     * Returns number of "entity" element
     */
    int sizeOfEntityArray();
    
    /**
     * Sets array of all "entity" element
     */
    void setEntityArray(com.sun.java.xml.ns.j2Ee.EntityBeanType[] entityArray);
    
    /**
     * Sets ith "entity" element
     */
    void setEntityArray(int i, com.sun.java.xml.ns.j2Ee.EntityBeanType entity);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entity" element
     */
    com.sun.java.xml.ns.j2Ee.EntityBeanType insertNewEntity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entity" element
     */
    com.sun.java.xml.ns.j2Ee.EntityBeanType addNewEntity();
    
    /**
     * Removes the ith "entity" element
     */
    void removeEntity(int i);
    
    /**
     * Gets a List of "message-driven" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType> getMessageDrivenList();
    
    /**
     * Gets array of all "message-driven" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType[] getMessageDrivenArray();
    
    /**
     * Gets ith "message-driven" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType getMessageDrivenArray(int i);
    
    /**
     * Returns number of "message-driven" element
     */
    int sizeOfMessageDrivenArray();
    
    /**
     * Sets array of all "message-driven" element
     */
    void setMessageDrivenArray(com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType[] messageDrivenArray);
    
    /**
     * Sets ith "message-driven" element
     */
    void setMessageDrivenArray(int i, com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType messageDriven);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message-driven" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType insertNewMessageDriven(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message-driven" element
     */
    com.sun.java.xml.ns.j2Ee.MessageDrivenBeanType addNewMessageDriven();
    
    /**
     * Removes the ith "message-driven" element
     */
    void removeMessageDriven(int i);
    
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
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.EnterpriseBeansType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.EnterpriseBeansType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
