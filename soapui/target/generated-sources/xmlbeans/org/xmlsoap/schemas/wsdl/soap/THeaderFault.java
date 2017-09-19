/*
 * XML Type:  tHeaderFault
 * Namespace: http://schemas.xmlsoap.org/wsdl/soap/
 * Java type: org.xmlsoap.schemas.wsdl.soap.THeaderFault
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl.soap;


/**
 * An XML tHeaderFault(@http://schemas.xmlsoap.org/wsdl/soap/).
 *
 * This is a complex type.
 */
public interface THeaderFault extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(THeaderFault.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("theaderfaultbca8type");
    
    /**
     * Gets the "message" attribute
     */
    javax.xml.namespace.QName getMessage();
    
    /**
     * Gets (as xml) the "message" attribute
     */
    org.apache.xmlbeans.XmlQName xgetMessage();
    
    /**
     * Sets the "message" attribute
     */
    void setMessage(javax.xml.namespace.QName message);
    
    /**
     * Sets (as xml) the "message" attribute
     */
    void xsetMessage(org.apache.xmlbeans.XmlQName message);
    
    /**
     * Gets the "part" attribute
     */
    java.lang.String getPart();
    
    /**
     * Gets (as xml) the "part" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetPart();
    
    /**
     * Sets the "part" attribute
     */
    void setPart(java.lang.String part);
    
    /**
     * Sets (as xml) the "part" attribute
     */
    void xsetPart(org.apache.xmlbeans.XmlNMTOKEN part);
    
    /**
     * Gets the "use" attribute
     */
    org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum getUse();
    
    /**
     * Gets (as xml) the "use" attribute
     */
    org.xmlsoap.schemas.wsdl.soap.UseChoice xgetUse();
    
    /**
     * Sets the "use" attribute
     */
    void setUse(org.xmlsoap.schemas.wsdl.soap.UseChoice.Enum use);
    
    /**
     * Sets (as xml) the "use" attribute
     */
    void xsetUse(org.xmlsoap.schemas.wsdl.soap.UseChoice use);
    
    /**
     * Gets the "encodingStyle" attribute
     */
    java.util.List getEncodingStyle();
    
    /**
     * Gets (as xml) the "encodingStyle" attribute
     */
    org.xmlsoap.schemas.wsdl.soap.EncodingStyle xgetEncodingStyle();
    
    /**
     * True if has "encodingStyle" attribute
     */
    boolean isSetEncodingStyle();
    
    /**
     * Sets the "encodingStyle" attribute
     */
    void setEncodingStyle(java.util.List encodingStyle);
    
    /**
     * Sets (as xml) the "encodingStyle" attribute
     */
    void xsetEncodingStyle(org.xmlsoap.schemas.wsdl.soap.EncodingStyle encodingStyle);
    
    /**
     * Unsets the "encodingStyle" attribute
     */
    void unsetEncodingStyle();
    
    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();
    
    /**
     * True if has "namespace" attribute
     */
    boolean isSetNamespace();
    
    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);
    
    /**
     * Unsets the "namespace" attribute
     */
    void unsetNamespace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault newInstance() {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.wsdl.soap.THeaderFault parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.wsdl.soap.THeaderFault) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
