/*
 * XML Type:  MalformedXml
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MalformedXmlConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MalformedXml(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MalformedXmlConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MalformedXmlConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("malformedxml9e34type");
    
    /**
     * Gets the "insertNewElement" element
     */
    boolean getInsertNewElement();
    
    /**
     * Gets (as xml) the "insertNewElement" element
     */
    org.apache.xmlbeans.XmlBoolean xgetInsertNewElement();
    
    /**
     * Sets the "insertNewElement" element
     */
    void setInsertNewElement(boolean insertNewElement);
    
    /**
     * Sets (as xml) the "insertNewElement" element
     */
    void xsetInsertNewElement(org.apache.xmlbeans.XmlBoolean insertNewElement);
    
    /**
     * Gets the "newElementValue" element
     */
    java.lang.String getNewElementValue();
    
    /**
     * Gets (as xml) the "newElementValue" element
     */
    org.apache.xmlbeans.XmlString xgetNewElementValue();
    
    /**
     * Sets the "newElementValue" element
     */
    void setNewElementValue(java.lang.String newElementValue);
    
    /**
     * Sets (as xml) the "newElementValue" element
     */
    void xsetNewElementValue(org.apache.xmlbeans.XmlString newElementValue);
    
    /**
     * Gets the "leaveTagOpen" element
     */
    boolean getLeaveTagOpen();
    
    /**
     * Gets (as xml) the "leaveTagOpen" element
     */
    org.apache.xmlbeans.XmlBoolean xgetLeaveTagOpen();
    
    /**
     * Sets the "leaveTagOpen" element
     */
    void setLeaveTagOpen(boolean leaveTagOpen);
    
    /**
     * Sets (as xml) the "leaveTagOpen" element
     */
    void xsetLeaveTagOpen(org.apache.xmlbeans.XmlBoolean leaveTagOpen);
    
    /**
     * Gets the "changeTagName" element
     */
    boolean getChangeTagName();
    
    /**
     * Gets (as xml) the "changeTagName" element
     */
    org.apache.xmlbeans.XmlBoolean xgetChangeTagName();
    
    /**
     * Sets the "changeTagName" element
     */
    void setChangeTagName(boolean changeTagName);
    
    /**
     * Sets (as xml) the "changeTagName" element
     */
    void xsetChangeTagName(org.apache.xmlbeans.XmlBoolean changeTagName);
    
    /**
     * Gets the "attributeMutation" element
     */
    com.eviware.soapui.config.MalformedXmlAttributeConfig getAttributeMutation();
    
    /**
     * Sets the "attributeMutation" element
     */
    void setAttributeMutation(com.eviware.soapui.config.MalformedXmlAttributeConfig attributeMutation);
    
    /**
     * Appends and returns a new empty "attributeMutation" element
     */
    com.eviware.soapui.config.MalformedXmlAttributeConfig addNewAttributeMutation();
    
    /**
     * Gets the "insertInvalidCharacter" element
     */
    boolean getInsertInvalidCharacter();
    
    /**
     * Gets (as xml) the "insertInvalidCharacter" element
     */
    org.apache.xmlbeans.XmlBoolean xgetInsertInvalidCharacter();
    
    /**
     * Sets the "insertInvalidCharacter" element
     */
    void setInsertInvalidCharacter(boolean insertInvalidCharacter);
    
    /**
     * Sets (as xml) the "insertInvalidCharacter" element
     */
    void xsetInsertInvalidCharacter(org.apache.xmlbeans.XmlBoolean insertInvalidCharacter);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MalformedXmlConfig newInstance() {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MalformedXmlConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MalformedXmlConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MalformedXmlConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MalformedXmlConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
