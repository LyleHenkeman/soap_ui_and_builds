/*
 * XML Type:  wsdl-message-mappingType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML wsdl-message-mappingType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface WsdlMessageMappingType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WsdlMessageMappingType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("wsdlmessagemappingtype5772type");
    
    /**
     * Gets the "wsdl-message" element
     */
    com.sun.java.xml.ns.j2Ee.WsdlMessageType getWsdlMessage();
    
    /**
     * Sets the "wsdl-message" element
     */
    void setWsdlMessage(com.sun.java.xml.ns.j2Ee.WsdlMessageType wsdlMessage);
    
    /**
     * Appends and returns a new empty "wsdl-message" element
     */
    com.sun.java.xml.ns.j2Ee.WsdlMessageType addNewWsdlMessage();
    
    /**
     * Gets the "wsdl-message-part-name" element
     */
    com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType getWsdlMessagePartName();
    
    /**
     * Sets the "wsdl-message-part-name" element
     */
    void setWsdlMessagePartName(com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType wsdlMessagePartName);
    
    /**
     * Appends and returns a new empty "wsdl-message-part-name" element
     */
    com.sun.java.xml.ns.j2Ee.WsdlMessagePartNameType addNewWsdlMessagePartName();
    
    /**
     * Gets the "parameter-mode" element
     */
    com.sun.java.xml.ns.j2Ee.ParameterModeType getParameterMode();
    
    /**
     * Sets the "parameter-mode" element
     */
    void setParameterMode(com.sun.java.xml.ns.j2Ee.ParameterModeType parameterMode);
    
    /**
     * Appends and returns a new empty "parameter-mode" element
     */
    com.sun.java.xml.ns.j2Ee.ParameterModeType addNewParameterMode();
    
    /**
     * Gets the "soap-header" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType getSoapHeader();
    
    /**
     * True if has "soap-header" element
     */
    boolean isSetSoapHeader();
    
    /**
     * Sets the "soap-header" element
     */
    void setSoapHeader(com.sun.java.xml.ns.j2Ee.EmptyType soapHeader);
    
    /**
     * Appends and returns a new empty "soap-header" element
     */
    com.sun.java.xml.ns.j2Ee.EmptyType addNewSoapHeader();
    
    /**
     * Unsets the "soap-header" element
     */
    void unsetSoapHeader();
    
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
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.WsdlMessageMappingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
