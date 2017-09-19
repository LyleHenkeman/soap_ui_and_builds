/*
 * XML Type:  configuration
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.Configuration
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig;


/**
 * An XML configuration(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public interface Configuration extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configuration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("configurationd0dbtype");
    
    /**
     * Gets the "comment" element
     */
    java.lang.String getComment();
    
    /**
     * Gets (as xml) the "comment" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.Comment xgetComment();
    
    /**
     * True if has "comment" element
     */
    boolean isSetComment();
    
    /**
     * Sets the "comment" element
     */
    void setComment(java.lang.String comment);
    
    /**
     * Sets (as xml) the "comment" element
     */
    void xsetComment(org.wsI.testing.x2003.x03.monitorConfig.Comment comment);
    
    /**
     * Unsets the "comment" element
     */
    void unsetComment();
    
    /**
     * Gets the "logFile" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.LogFile getLogFile();
    
    /**
     * Sets the "logFile" element
     */
    void setLogFile(org.wsI.testing.x2003.x03.monitorConfig.LogFile logFile);
    
    /**
     * Appends and returns a new empty "logFile" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.LogFile addNewLogFile();
    
    /**
     * Gets the "logDuration" element
     */
    int getLogDuration();
    
    /**
     * Gets (as xml) the "logDuration" element
     */
    org.apache.xmlbeans.XmlInt xgetLogDuration();
    
    /**
     * Sets the "logDuration" element
     */
    void setLogDuration(int logDuration);
    
    /**
     * Sets (as xml) the "logDuration" element
     */
    void xsetLogDuration(org.apache.xmlbeans.XmlInt logDuration);
    
    /**
     * Gets the "cleanupTimeoutSeconds" element
     */
    int getCleanupTimeoutSeconds();
    
    /**
     * Gets (as xml) the "cleanupTimeoutSeconds" element
     */
    org.apache.xmlbeans.XmlInt xgetCleanupTimeoutSeconds();
    
    /**
     * Sets the "cleanupTimeoutSeconds" element
     */
    void setCleanupTimeoutSeconds(int cleanupTimeoutSeconds);
    
    /**
     * Sets (as xml) the "cleanupTimeoutSeconds" element
     */
    void xsetCleanupTimeoutSeconds(org.apache.xmlbeans.XmlInt cleanupTimeoutSeconds);
    
    /**
     * Gets the "manInTheMiddle" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect getManInTheMiddle();
    
    /**
     * True if has "manInTheMiddle" element
     */
    boolean isSetManInTheMiddle();
    
    /**
     * Sets the "manInTheMiddle" element
     */
    void setManInTheMiddle(org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect manInTheMiddle);
    
    /**
     * Appends and returns a new empty "manInTheMiddle" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect addNewManInTheMiddle();
    
    /**
     * Unsets the "manInTheMiddle" element
     */
    void unsetManInTheMiddle();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration newInstance() {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.Configuration parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
