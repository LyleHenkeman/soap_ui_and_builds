/*
 * XML Type:  ArrayOfRedirect
 * Namespace: http://www.ws-i.org/testing/2003/03/monitorConfig/
 * Java type: org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.monitorConfig;


/**
 * An XML ArrayOfRedirect(@http://www.ws-i.org/testing/2003/03/monitorConfig/).
 *
 * This is a complex type.
 */
public interface ArrayOfRedirect extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrayOfRedirect.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("arrayofredirect59e5type");
    
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
     * Gets a List of "redirect" elements
     */
    java.util.List<org.wsI.testing.x2003.x03.monitorConfig.Redirect> getRedirectList();
    
    /**
     * Gets array of all "redirect" elements
     * @deprecated
     */
    org.wsI.testing.x2003.x03.monitorConfig.Redirect[] getRedirectArray();
    
    /**
     * Gets ith "redirect" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.Redirect getRedirectArray(int i);
    
    /**
     * Tests for nil ith "redirect" element
     */
    boolean isNilRedirectArray(int i);
    
    /**
     * Returns number of "redirect" element
     */
    int sizeOfRedirectArray();
    
    /**
     * Sets array of all "redirect" element
     */
    void setRedirectArray(org.wsI.testing.x2003.x03.monitorConfig.Redirect[] redirectArray);
    
    /**
     * Sets ith "redirect" element
     */
    void setRedirectArray(int i, org.wsI.testing.x2003.x03.monitorConfig.Redirect redirect);
    
    /**
     * Nils the ith "redirect" element
     */
    void setNilRedirectArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "redirect" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.Redirect insertNewRedirect(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "redirect" element
     */
    org.wsI.testing.x2003.x03.monitorConfig.Redirect addNewRedirect();
    
    /**
     * Removes the ith "redirect" element
     */
    void removeRedirect(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect newInstance() {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.monitorConfig.ArrayOfRedirect) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
