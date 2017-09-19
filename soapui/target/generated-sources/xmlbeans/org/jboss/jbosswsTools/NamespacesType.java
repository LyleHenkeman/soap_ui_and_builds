/*
 * XML Type:  namespacesType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.NamespacesType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools;


/**
 * An XML namespacesType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public interface NamespacesType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NamespacesType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("namespacestype157btype");
    
    /**
     * Gets the "target-namespace" attribute
     */
    java.lang.String getTargetNamespace();
    
    /**
     * Gets (as xml) the "target-namespace" attribute
     */
    org.jboss.jbosswsTools.NamespacesType.TargetNamespace xgetTargetNamespace();
    
    /**
     * Sets the "target-namespace" attribute
     */
    void setTargetNamespace(java.lang.String targetNamespace);
    
    /**
     * Sets (as xml) the "target-namespace" attribute
     */
    void xsetTargetNamespace(org.jboss.jbosswsTools.NamespacesType.TargetNamespace targetNamespace);
    
    /**
     * Gets the "type-namespace" attribute
     */
    java.lang.String getTypeNamespace();
    
    /**
     * Gets (as xml) the "type-namespace" attribute
     */
    org.jboss.jbosswsTools.NamespacesType.TypeNamespace xgetTypeNamespace();
    
    /**
     * Sets the "type-namespace" attribute
     */
    void setTypeNamespace(java.lang.String typeNamespace);
    
    /**
     * Sets (as xml) the "type-namespace" attribute
     */
    void xsetTypeNamespace(org.jboss.jbosswsTools.NamespacesType.TypeNamespace typeNamespace);
    
    /**
     * An XML target-namespace(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.NamespacesType$TargetNamespace.
     */
    public interface TargetNamespace extends org.apache.xmlbeans.XmlAnyURI
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TargetNamespace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("targetnamespacebc3aattrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.jboss.jbosswsTools.NamespacesType.TargetNamespace newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.NamespacesType.TargetNamespace) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.NamespacesType.TargetNamespace newInstance() {
              return (org.jboss.jbosswsTools.NamespacesType.TargetNamespace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.NamespacesType.TargetNamespace newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.NamespacesType.TargetNamespace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML type-namespace(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.NamespacesType$TypeNamespace.
     */
    public interface TypeNamespace extends org.apache.xmlbeans.XmlAnyURI
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TypeNamespace.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("typenamespace3f23attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.jboss.jbosswsTools.NamespacesType.TypeNamespace newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.NamespacesType.TypeNamespace) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.NamespacesType.TypeNamespace newInstance() {
              return (org.jboss.jbosswsTools.NamespacesType.TypeNamespace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.NamespacesType.TypeNamespace newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.NamespacesType.TypeNamespace) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.jboss.jbosswsTools.NamespacesType newInstance() {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.jboss.jbosswsTools.NamespacesType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.jboss.jbosswsTools.NamespacesType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.jboss.jbosswsTools.NamespacesType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.NamespacesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.NamespacesType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.NamespacesType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
