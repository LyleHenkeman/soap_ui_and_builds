/*
 * XML Type:  uddiReference
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.UddiReference
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig;


/**
 * An XML uddiReference(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is a complex type.
 */
public interface UddiReference extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UddiReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("uddireferencea320type");
    
    /**
     * Gets the "uddiKey" element
     */
    org.wsI.testing.x2003.x03.analyzerConfig.UddiKey getUddiKey();
    
    /**
     * Sets the "uddiKey" element
     */
    void setUddiKey(org.wsI.testing.x2003.x03.analyzerConfig.UddiKey uddiKey);
    
    /**
     * Appends and returns a new empty "uddiKey" element
     */
    org.wsI.testing.x2003.x03.analyzerConfig.UddiKey addNewUddiKey();
    
    /**
     * Gets the "inquiryURL" element
     */
    java.lang.String getInquiryURL();
    
    /**
     * Gets (as xml) the "inquiryURL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetInquiryURL();
    
    /**
     * Sets the "inquiryURL" element
     */
    void setInquiryURL(java.lang.String inquiryURL);
    
    /**
     * Sets (as xml) the "inquiryURL" element
     */
    void xsetInquiryURL(org.apache.xmlbeans.XmlAnyURI inquiryURL);
    
    /**
     * Gets the "wsdlElement" element
     */
    org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference getWsdlElement();
    
    /**
     * True if has "wsdlElement" element
     */
    boolean isSetWsdlElement();
    
    /**
     * Sets the "wsdlElement" element
     */
    void setWsdlElement(org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference wsdlElement);
    
    /**
     * Appends and returns a new empty "wsdlElement" element
     */
    org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference addNewWsdlElement();
    
    /**
     * Unsets the "wsdlElement" element
     */
    void unsetWsdlElement();
    
    /**
     * Gets the "serviceLocation" element
     */
    java.lang.String getServiceLocation();
    
    /**
     * Gets (as xml) the "serviceLocation" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetServiceLocation();
    
    /**
     * True if has "serviceLocation" element
     */
    boolean isSetServiceLocation();
    
    /**
     * Sets the "serviceLocation" element
     */
    void setServiceLocation(java.lang.String serviceLocation);
    
    /**
     * Sets (as xml) the "serviceLocation" element
     */
    void xsetServiceLocation(org.apache.xmlbeans.XmlAnyURI serviceLocation);
    
    /**
     * Unsets the "serviceLocation" element
     */
    void unsetServiceLocation();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference newInstance() {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.analyzerConfig.UddiReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.UddiReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
