/*
 * An XML attribute type.
 * Localname: mustUnderstand
 * Namespace: http://www.w3.org/2003/05/soap-envelope
 * Java type: org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2003.x05.soapEnvelope;


/**
 * A document containing one mustUnderstand(@http://www.w3.org/2003/05/soap-envelope) attribute.
 *
 * This is a complex type.
 */
public interface MustUnderstandAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MustUnderstandAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("mustunderstandd1b4attrtypetype");
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    boolean getMustUnderstand();
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMustUnderstand();
    
    /**
     * True if has "mustUnderstand" attribute
     */
    boolean isSetMustUnderstand();
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    void setMustUnderstand(boolean mustUnderstand);
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    void xsetMustUnderstand(org.apache.xmlbeans.XmlBoolean mustUnderstand);
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    void unsetMustUnderstand();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute newInstance() {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2003.x05.soapEnvelope.MustUnderstandAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
