/*
 * XML Type:  addStyleSheet
 * Namespace: http://www.ws-i.org/testing/2003/03/common/
 * Java type: org.wsI.testing.x2003.x03.common.AddStyleSheet
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.common;


/**
 * An XML addStyleSheet(@http://www.ws-i.org/testing/2003/03/common/).
 *
 * This is a complex type.
 */
public interface AddStyleSheet extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AddStyleSheet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("addstylesheet9d75type");
    
    /**
     * Gets the "href" attribute
     */
    java.lang.String getHref();
    
    /**
     * Gets (as xml) the "href" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetHref();
    
    /**
     * Sets the "href" attribute
     */
    void setHref(java.lang.String href);
    
    /**
     * Sets (as xml) the "href" attribute
     */
    void xsetHref(org.apache.xmlbeans.XmlAnyURI href);
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "title" attribute
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" attribute
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" attribute
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" attribute
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" attribute
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" attribute
     */
    void unsetTitle();
    
    /**
     * Gets the "media" attribute
     */
    java.lang.String getMedia();
    
    /**
     * Gets (as xml) the "media" attribute
     */
    org.apache.xmlbeans.XmlString xgetMedia();
    
    /**
     * True if has "media" attribute
     */
    boolean isSetMedia();
    
    /**
     * Sets the "media" attribute
     */
    void setMedia(java.lang.String media);
    
    /**
     * Sets (as xml) the "media" attribute
     */
    void xsetMedia(org.apache.xmlbeans.XmlString media);
    
    /**
     * Unsets the "media" attribute
     */
    void unsetMedia();
    
    /**
     * Gets the "charset" attribute
     */
    java.lang.String getCharset();
    
    /**
     * Gets (as xml) the "charset" attribute
     */
    org.apache.xmlbeans.XmlString xgetCharset();
    
    /**
     * True if has "charset" attribute
     */
    boolean isSetCharset();
    
    /**
     * Sets the "charset" attribute
     */
    void setCharset(java.lang.String charset);
    
    /**
     * Sets (as xml) the "charset" attribute
     */
    void xsetCharset(org.apache.xmlbeans.XmlString charset);
    
    /**
     * Unsets the "charset" attribute
     */
    void unsetCharset();
    
    /**
     * Gets the "alternate" attribute
     */
    boolean getAlternate();
    
    /**
     * Gets (as xml) the "alternate" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAlternate();
    
    /**
     * True if has "alternate" attribute
     */
    boolean isSetAlternate();
    
    /**
     * Sets the "alternate" attribute
     */
    void setAlternate(boolean alternate);
    
    /**
     * Sets (as xml) the "alternate" attribute
     */
    void xsetAlternate(org.apache.xmlbeans.XmlBoolean alternate);
    
    /**
     * Unsets the "alternate" attribute
     */
    void unsetAlternate();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet newInstance() {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.common.AddStyleSheet parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.common.AddStyleSheet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
