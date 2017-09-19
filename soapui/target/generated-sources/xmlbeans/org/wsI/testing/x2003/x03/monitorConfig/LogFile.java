/*
 * XML Type:  logFile
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.LogFile
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig;


/**
 * An XML logFile(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public interface LogFile extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LogFile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("logfileb971type");
    
    /**
     * Gets the "addStyleSheet" element
     */
    org.wsI.testing.x2003.x03.common.AddStyleSheet getAddStyleSheet();
    
    /**
     * True if has "addStyleSheet" element
     */
    boolean isSetAddStyleSheet();
    
    /**
     * Sets the "addStyleSheet" element
     */
    void setAddStyleSheet(org.wsI.testing.x2003.x03.common.AddStyleSheet addStyleSheet);
    
    /**
     * Appends and returns a new empty "addStyleSheet" element
     */
    org.wsI.testing.x2003.x03.common.AddStyleSheet addNewAddStyleSheet();
    
    /**
     * Unsets the "addStyleSheet" element
     */
    void unsetAddStyleSheet();
    
    /**
     * Gets the "location" attribute
     */
    java.lang.String getLocation();
    
    /**
     * Gets (as xml) the "location" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetLocation();
    
    /**
     * Sets the "location" attribute
     */
    void setLocation(java.lang.String location);
    
    /**
     * Sets (as xml) the "location" attribute
     */
    void xsetLocation(org.apache.xmlbeans.XmlAnyURI location);
    
    /**
     * Gets the "replace" attribute
     */
    boolean getReplace();
    
    /**
     * Gets (as xml) the "replace" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetReplace();
    
    /**
     * True if has "replace" attribute
     */
    boolean isSetReplace();
    
    /**
     * Sets the "replace" attribute
     */
    void setReplace(boolean replace);
    
    /**
     * Sets (as xml) the "replace" attribute
     */
    void xsetReplace(org.apache.xmlbeans.XmlBoolean replace);
    
    /**
     * Unsets the "replace" attribute
     */
    void unsetReplace();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile newInstance() {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.LogFile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.LogFile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
