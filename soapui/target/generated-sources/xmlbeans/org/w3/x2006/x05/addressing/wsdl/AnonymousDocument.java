/*
 * An XML document type.
 * Localname: Anonymous
 * Namespace: http://www.w3.org/2006/05/addressing/wsdl
 * Java type: org.w3.x2006.x05.addressing.wsdl.AnonymousDocument
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2006.x05.addressing.wsdl;


/**
 * A document containing one Anonymous(@http://www.w3.org/2006/05/addressing/wsdl) element.
 *
 * This is a complex type.
 */
public interface AnonymousDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnonymousDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("anonymouse286doctype");
    
    /**
     * Gets the "Anonymous" element
     */
    org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous getAnonymous();
    
    /**
     * Sets the "Anonymous" element
     */
    void setAnonymous(org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous anonymous);
    
    /**
     * Appends and returns a new empty "Anonymous" element
     */
    org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous addNewAnonymous();
    
    /**
     * An XML Anonymous(@http://www.w3.org/2006/05/addressing/wsdl).
     *
     * This is an atomic type that is a restriction of org.w3.x2006.x05.addressing.wsdl.AnonymousDocument$Anonymous.
     */
    public interface Anonymous extends org.w3.x2006.x05.addressing.wsdl.AnonymousType
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Anonymous.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("anonymousb47felemtype");
        
        static final org.w3.x2006.x05.addressing.wsdl.AnonymousType.Enum OPTIONAL = org.w3.x2006.x05.addressing.wsdl.AnonymousType.OPTIONAL;
        static final org.w3.x2006.x05.addressing.wsdl.AnonymousType.Enum REQUIRED = org.w3.x2006.x05.addressing.wsdl.AnonymousType.REQUIRED;
        static final org.w3.x2006.x05.addressing.wsdl.AnonymousType.Enum PROHIBITED = org.w3.x2006.x05.addressing.wsdl.AnonymousType.PROHIBITED;
        
        static final int INT_OPTIONAL = org.w3.x2006.x05.addressing.wsdl.AnonymousType.INT_OPTIONAL;
        static final int INT_REQUIRED = org.w3.x2006.x05.addressing.wsdl.AnonymousType.INT_REQUIRED;
        static final int INT_PROHIBITED = org.w3.x2006.x05.addressing.wsdl.AnonymousType.INT_PROHIBITED;
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous newInstance() {
              return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument.Anonymous) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument newInstance() {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2006.x05.addressing.wsdl.AnonymousDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2006.x05.addressing.wsdl.AnonymousDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
