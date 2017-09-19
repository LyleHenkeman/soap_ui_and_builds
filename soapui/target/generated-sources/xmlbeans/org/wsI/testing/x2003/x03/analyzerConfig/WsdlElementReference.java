/*
 * XML Type:  wsdlElementReference
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig;


/**
 * An XML wsdlElementReference(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference.
 */
public interface WsdlElementReference extends org.apache.xmlbeans.XmlNCName
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WsdlElementReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("wsdlelementreference6daetype");
    
    /**
     * Gets the "type" attribute
     */
    org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementType type);
    
    /**
     * Gets the "namespace" attribute
     */
    java.lang.String getNamespace();
    
    /**
     * Gets (as xml) the "namespace" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetNamespace();
    
    /**
     * Sets the "namespace" attribute
     */
    void setNamespace(java.lang.String namespace);
    
    /**
     * Sets (as xml) the "namespace" attribute
     */
    void xsetNamespace(org.apache.xmlbeans.XmlAnyURI namespace);
    
    /**
     * Gets the "parentElementName" attribute
     */
    java.lang.String getParentElementName();
    
    /**
     * Gets (as xml) the "parentElementName" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetParentElementName();
    
    /**
     * True if has "parentElementName" attribute
     */
    boolean isSetParentElementName();
    
    /**
     * Sets the "parentElementName" attribute
     */
    void setParentElementName(java.lang.String parentElementName);
    
    /**
     * Sets (as xml) the "parentElementName" attribute
     */
    void xsetParentElementName(org.apache.xmlbeans.XmlNCName parentElementName);
    
    /**
     * Unsets the "parentElementName" attribute
     */
    void unsetParentElementName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference newInstance() {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.WsdlElementReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
