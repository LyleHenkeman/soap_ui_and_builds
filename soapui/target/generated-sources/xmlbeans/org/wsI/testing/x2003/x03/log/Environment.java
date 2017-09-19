/*
 * XML Type:  environment
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.Environment
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log;


/**
 * An XML environment(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public interface Environment extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Environment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("environment4f96type");
    
    /**
     * Gets the "runtime" element
     */
    org.wsI.testing.x2003.x03.log.NameVersionPair getRuntime();
    
    /**
     * Sets the "runtime" element
     */
    void setRuntime(org.wsI.testing.x2003.x03.log.NameVersionPair runtime);
    
    /**
     * Appends and returns a new empty "runtime" element
     */
    org.wsI.testing.x2003.x03.log.NameVersionPair addNewRuntime();
    
    /**
     * Gets the "operatingSystem" element
     */
    org.wsI.testing.x2003.x03.log.NameVersionPair getOperatingSystem();
    
    /**
     * Sets the "operatingSystem" element
     */
    void setOperatingSystem(org.wsI.testing.x2003.x03.log.NameVersionPair operatingSystem);
    
    /**
     * Appends and returns a new empty "operatingSystem" element
     */
    org.wsI.testing.x2003.x03.log.NameVersionPair addNewOperatingSystem();
    
    /**
     * Gets the "xmlParser" element
     */
    org.wsI.testing.x2003.x03.log.NameVersionPair getXmlParser();
    
    /**
     * Sets the "xmlParser" element
     */
    void setXmlParser(org.wsI.testing.x2003.x03.log.NameVersionPair xmlParser);
    
    /**
     * Appends and returns a new empty "xmlParser" element
     */
    org.wsI.testing.x2003.x03.log.NameVersionPair addNewXmlParser();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.log.Environment newInstance() {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Environment parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.log.Environment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.log.Environment parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.log.Environment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
