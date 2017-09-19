/*
 * XML Type:  wsxmlType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.WsxmlType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools;


/**
 * An XML wsxmlType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public interface WsxmlType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WsxmlType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("wsxmltype4b0atype");
    
    /**
     * Gets the "servlet-link" attribute
     */
    java.lang.String getServletLink();
    
    /**
     * Gets (as xml) the "servlet-link" attribute
     */
    org.jboss.jbosswsTools.WsxmlType.ServletLink xgetServletLink();
    
    /**
     * True if has "servlet-link" attribute
     */
    boolean isSetServletLink();
    
    /**
     * Sets the "servlet-link" attribute
     */
    void setServletLink(java.lang.String servletLink);
    
    /**
     * Sets (as xml) the "servlet-link" attribute
     */
    void xsetServletLink(org.jboss.jbosswsTools.WsxmlType.ServletLink servletLink);
    
    /**
     * Unsets the "servlet-link" attribute
     */
    void unsetServletLink();
    
    /**
     * Gets the "ejb-link" attribute
     */
    java.lang.String getEjbLink();
    
    /**
     * Gets (as xml) the "ejb-link" attribute
     */
    org.jboss.jbosswsTools.WsxmlType.EjbLink xgetEjbLink();
    
    /**
     * True if has "ejb-link" attribute
     */
    boolean isSetEjbLink();
    
    /**
     * Sets the "ejb-link" attribute
     */
    void setEjbLink(java.lang.String ejbLink);
    
    /**
     * Sets (as xml) the "ejb-link" attribute
     */
    void xsetEjbLink(org.jboss.jbosswsTools.WsxmlType.EjbLink ejbLink);
    
    /**
     * Unsets the "ejb-link" attribute
     */
    void unsetEjbLink();
    
    /**
     * Gets the "append" attribute
     */
    boolean getAppend();
    
    /**
     * Gets (as xml) the "append" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAppend();
    
    /**
     * True if has "append" attribute
     */
    boolean isSetAppend();
    
    /**
     * Sets the "append" attribute
     */
    void setAppend(boolean append);
    
    /**
     * Sets (as xml) the "append" attribute
     */
    void xsetAppend(org.apache.xmlbeans.XmlBoolean append);
    
    /**
     * Unsets the "append" attribute
     */
    void unsetAppend();
    
    /**
     * An XML servlet-link(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.WsxmlType$ServletLink.
     */
    public interface ServletLink extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServletLink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("servletlink5a28attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.jboss.jbosswsTools.WsxmlType.ServletLink newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.WsxmlType.ServletLink) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.WsxmlType.ServletLink newInstance() {
              return (org.jboss.jbosswsTools.WsxmlType.ServletLink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.WsxmlType.ServletLink newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.WsxmlType.ServletLink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ejb-link(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.WsxmlType$EjbLink.
     */
    public interface EjbLink extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EjbLink.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("ejblink8640attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.jboss.jbosswsTools.WsxmlType.EjbLink newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.WsxmlType.EjbLink) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.WsxmlType.EjbLink newInstance() {
              return (org.jboss.jbosswsTools.WsxmlType.EjbLink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.WsxmlType.EjbLink newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.WsxmlType.EjbLink) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.jboss.jbosswsTools.WsxmlType newInstance() {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.jboss.jbosswsTools.WsxmlType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.jboss.jbosswsTools.WsxmlType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.jboss.jbosswsTools.WsxmlType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.WsxmlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.WsxmlType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.WsxmlType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
