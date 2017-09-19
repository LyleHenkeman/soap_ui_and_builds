/*
 * XML Type:  configurationType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.ConfigurationType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools;


/**
 * An XML configurationType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public interface ConfigurationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfigurationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("configurationtype446ftype");
    
    /**
     * Gets the "global" element
     */
    org.jboss.jbosswsTools.GlobalType getGlobal();
    
    /**
     * True if has "global" element
     */
    boolean isSetGlobal();
    
    /**
     * Sets the "global" element
     */
    void setGlobal(org.jboss.jbosswsTools.GlobalType global);
    
    /**
     * Appends and returns a new empty "global" element
     */
    org.jboss.jbosswsTools.GlobalType addNewGlobal();
    
    /**
     * Unsets the "global" element
     */
    void unsetGlobal();
    
    /**
     * Gets the "java-wsdl" element
     */
    org.jboss.jbosswsTools.JavaToWsdlType getJavaWsdl();
    
    /**
     * True if has "java-wsdl" element
     */
    boolean isSetJavaWsdl();
    
    /**
     * Sets the "java-wsdl" element
     */
    void setJavaWsdl(org.jboss.jbosswsTools.JavaToWsdlType javaWsdl);
    
    /**
     * Appends and returns a new empty "java-wsdl" element
     */
    org.jboss.jbosswsTools.JavaToWsdlType addNewJavaWsdl();
    
    /**
     * Unsets the "java-wsdl" element
     */
    void unsetJavaWsdl();
    
    /**
     * Gets the "wsdl-java" element
     */
    org.jboss.jbosswsTools.WsdlToJavaType getWsdlJava();
    
    /**
     * True if has "wsdl-java" element
     */
    boolean isSetWsdlJava();
    
    /**
     * Sets the "wsdl-java" element
     */
    void setWsdlJava(org.jboss.jbosswsTools.WsdlToJavaType wsdlJava);
    
    /**
     * Appends and returns a new empty "wsdl-java" element
     */
    org.jboss.jbosswsTools.WsdlToJavaType addNewWsdlJava();
    
    /**
     * Unsets the "wsdl-java" element
     */
    void unsetWsdlJava();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.jboss.jbosswsTools.ConfigurationType newInstance() {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.jboss.jbosswsTools.ConfigurationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.ConfigurationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.ConfigurationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.ConfigurationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
