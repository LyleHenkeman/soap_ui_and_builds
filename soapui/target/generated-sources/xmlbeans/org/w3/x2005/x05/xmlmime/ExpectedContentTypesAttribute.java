/*
 * An XML attribute type.
 * Localname: expectedContentTypes
 * Namespace: http://www.w3.org/2005/05/xmlmime
 * Java type: org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute
 *
 * Automatically generated - do not modify.
 */
package org.w3.x2005.x05.xmlmime;


/**
 * A document containing one expectedContentTypes(@http://www.w3.org/2005/05/xmlmime) attribute.
 *
 * This is a complex type.
 */
public interface ExpectedContentTypesAttribute extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExpectedContentTypesAttribute.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("expectedcontenttypes09dcattrtypetype");
    
    /**
     * Gets the "expectedContentTypes" attribute
     */
    java.lang.String getExpectedContentTypes();
    
    /**
     * Gets (as xml) the "expectedContentTypes" attribute
     */
    org.apache.xmlbeans.XmlString xgetExpectedContentTypes();
    
    /**
     * True if has "expectedContentTypes" attribute
     */
    boolean isSetExpectedContentTypes();
    
    /**
     * Sets the "expectedContentTypes" attribute
     */
    void setExpectedContentTypes(java.lang.String expectedContentTypes);
    
    /**
     * Sets (as xml) the "expectedContentTypes" attribute
     */
    void xsetExpectedContentTypes(org.apache.xmlbeans.XmlString expectedContentTypes);
    
    /**
     * Unsets the "expectedContentTypes" attribute
     */
    void unsetExpectedContentTypes();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute newInstance() {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.w3.x2005.x05.xmlmime.ExpectedContentTypesAttribute) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
