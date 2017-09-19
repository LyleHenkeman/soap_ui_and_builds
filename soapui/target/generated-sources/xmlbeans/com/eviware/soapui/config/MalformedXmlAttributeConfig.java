/*
 * XML Type:  MalformedXmlAttribute
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MalformedXmlAttributeConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MalformedXmlAttribute(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MalformedXmlAttributeConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MalformedXmlAttributeConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("malformedxmlattribute5322type");
    
    /**
     * Gets the "leaveAttributeOpen" element
     */
    boolean getLeaveAttributeOpen();
    
    /**
     * Gets (as xml) the "leaveAttributeOpen" element
     */
    org.apache.xmlbeans.XmlBoolean xgetLeaveAttributeOpen();
    
    /**
     * Sets the "leaveAttributeOpen" element
     */
    void setLeaveAttributeOpen(boolean leaveAttributeOpen);
    
    /**
     * Sets (as xml) the "leaveAttributeOpen" element
     */
    void xsetLeaveAttributeOpen(org.apache.xmlbeans.XmlBoolean leaveAttributeOpen);
    
    /**
     * Gets the "insertInvalidChars" element
     */
    boolean getInsertInvalidChars();
    
    /**
     * Gets (as xml) the "insertInvalidChars" element
     */
    org.apache.xmlbeans.XmlBoolean xgetInsertInvalidChars();
    
    /**
     * Sets the "insertInvalidChars" element
     */
    void setInsertInvalidChars(boolean insertInvalidChars);
    
    /**
     * Sets (as xml) the "insertInvalidChars" element
     */
    void xsetInsertInvalidChars(org.apache.xmlbeans.XmlBoolean insertInvalidChars);
    
    /**
     * Gets the "mutateAttributes" element
     */
    boolean getMutateAttributes();
    
    /**
     * Gets (as xml) the "mutateAttributes" element
     */
    org.apache.xmlbeans.XmlBoolean xgetMutateAttributes();
    
    /**
     * Sets the "mutateAttributes" element
     */
    void setMutateAttributes(boolean mutateAttributes);
    
    /**
     * Sets (as xml) the "mutateAttributes" element
     */
    void xsetMutateAttributes(org.apache.xmlbeans.XmlBoolean mutateAttributes);
    
    /**
     * Gets the "newAttributeName" element
     */
    java.lang.String getNewAttributeName();
    
    /**
     * Gets (as xml) the "newAttributeName" element
     */
    org.apache.xmlbeans.XmlString xgetNewAttributeName();
    
    /**
     * Sets the "newAttributeName" element
     */
    void setNewAttributeName(java.lang.String newAttributeName);
    
    /**
     * Sets (as xml) the "newAttributeName" element
     */
    void xsetNewAttributeName(org.apache.xmlbeans.XmlString newAttributeName);
    
    /**
     * Gets the "newAttributeValue" element
     */
    java.lang.String getNewAttributeValue();
    
    /**
     * Gets (as xml) the "newAttributeValue" element
     */
    org.apache.xmlbeans.XmlString xgetNewAttributeValue();
    
    /**
     * Sets the "newAttributeValue" element
     */
    void setNewAttributeValue(java.lang.String newAttributeValue);
    
    /**
     * Sets (as xml) the "newAttributeValue" element
     */
    void xsetNewAttributeValue(org.apache.xmlbeans.XmlString newAttributeValue);
    
    /**
     * Gets the "addNewAttribute" element
     */
    boolean getAddNewAttribute();
    
    /**
     * Gets (as xml) the "addNewAttribute" element
     */
    org.apache.xmlbeans.XmlBoolean xgetAddNewAttribute();
    
    /**
     * Sets the "addNewAttribute" element
     */
    void setAddNewAttribute(boolean addNewAttribute);
    
    /**
     * Sets (as xml) the "addNewAttribute" element
     */
    void xsetAddNewAttribute(org.apache.xmlbeans.XmlBoolean addNewAttribute);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig newInstance() {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MalformedXmlAttributeConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MalformedXmlAttributeConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
