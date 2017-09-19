/*
 * XML Type:  PasswordString
 * Namespace: http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd
 * Java type: org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10;


/**
 * An XML PasswordString(@http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd).
 *
 * This is an atomic type that is a restriction of org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString.
 */
public interface PasswordString extends org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.AttributedString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PasswordString.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("passwordstring509etype");
    
    /**
     * Gets the "Type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetType();
    
    /**
     * True if has "Type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "Type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlAnyURI type);
    
    /**
     * Unsets the "Type" attribute
     */
    void unsetType();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString newInstance() {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wss.x2004.x01.oasis200401WssWssecuritySecext10.PasswordString) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
