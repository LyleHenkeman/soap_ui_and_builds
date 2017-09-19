/*
 * An XML document type.
 * Localname: configuration
 * Namespace: http://java.sun.com/xml/ns/jax-rpc/ri/config
 * Java type: com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.jaxRpc.ri.config;


/**
 * A document containing one configuration(@http://java.sun.com/xml/ns/jax-rpc/ri/config) element.
 *
 * This is a complex type.
 */
public interface ConfigurationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConfigurationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("configuration6bdfdoctype");
    
    /**
     * Gets the "configuration" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration getConfiguration();
    
    /**
     * Sets the "configuration" element
     */
    void setConfiguration(com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration configuration);
    
    /**
     * Appends and returns a new empty "configuration" element
     */
    com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration addNewConfiguration();
    
    /**
     * An XML configuration(@http://java.sun.com/xml/ns/jax-rpc/ri/config).
     *
     * This is a complex type.
     */
    public interface Configuration extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Configuration.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("configuratione3bdelemtype");
        
        /**
         * Gets the "service" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType getService();
        
        /**
         * True if has "service" element
         */
        boolean isSetService();
        
        /**
         * Sets the "service" element
         */
        void setService(com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType service);
        
        /**
         * Appends and returns a new empty "service" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.ServiceType addNewService();
        
        /**
         * Unsets the "service" element
         */
        void unsetService();
        
        /**
         * Gets the "wsdl" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType getWsdl();
        
        /**
         * True if has "wsdl" element
         */
        boolean isSetWsdl();
        
        /**
         * Sets the "wsdl" element
         */
        void setWsdl(com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType wsdl);
        
        /**
         * Appends and returns a new empty "wsdl" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.WsdlType addNewWsdl();
        
        /**
         * Unsets the "wsdl" element
         */
        void unsetWsdl();
        
        /**
         * Gets the "modelfile" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType getModelfile();
        
        /**
         * True if has "modelfile" element
         */
        boolean isSetModelfile();
        
        /**
         * Sets the "modelfile" element
         */
        void setModelfile(com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType modelfile);
        
        /**
         * Appends and returns a new empty "modelfile" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.ModelfileType addNewModelfile();
        
        /**
         * Unsets the "modelfile" element
         */
        void unsetModelfile();
        
        /**
         * Gets the "j2eeMappingFile" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType getJ2EeMappingFile();
        
        /**
         * True if has "j2eeMappingFile" element
         */
        boolean isSetJ2EeMappingFile();
        
        /**
         * Sets the "j2eeMappingFile" element
         */
        void setJ2EeMappingFile(com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType j2EeMappingFile);
        
        /**
         * Appends and returns a new empty "j2eeMappingFile" element
         */
        com.sun.java.xml.ns.jaxRpc.ri.config.J2EeMappingFileType addNewJ2EeMappingFile();
        
        /**
         * Unsets the "j2eeMappingFile" element
         */
        void unsetJ2EeMappingFile();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration newInstance() {
              return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument.Configuration) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument newInstance() {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.jaxRpc.ri.config.ConfigurationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
