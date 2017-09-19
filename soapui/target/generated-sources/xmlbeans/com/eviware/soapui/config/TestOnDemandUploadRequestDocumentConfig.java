/*
 * An XML document type.
 * Localname: TestOnDemandUploadRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * A document containing one TestOnDemandUploadRequest(@http://eviware.com/soapui/config) element.
 *
 * This is a complex type.
 */
public interface TestOnDemandUploadRequestDocumentConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestOnDemandUploadRequestDocumentConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testondemanduploadrequest63a0doctype");
    
    /**
     * Gets the "TestOnDemandUploadRequest" element
     */
    com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest getTestOnDemandUploadRequest();
    
    /**
     * Sets the "TestOnDemandUploadRequest" element
     */
    void setTestOnDemandUploadRequest(com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest testOnDemandUploadRequest);
    
    /**
     * Appends and returns a new empty "TestOnDemandUploadRequest" element
     */
    com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest addNewTestOnDemandUploadRequest();
    
    /**
     * An XML TestOnDemandUploadRequest(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public interface TestOnDemandUploadRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestOnDemandUploadRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("testondemanduploadrequest0722elemtype");
        
        /**
         * Gets the "Request" element
         */
        com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest.Request getRequest();
        
        /**
         * Sets the "Request" element
         */
        void setRequest(com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest.Request request);
        
        /**
         * Appends and returns a new empty "Request" element
         */
        com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest.Request addNewRequest();
        
        /**
         * An XML Request(@http://eviware.com/soapui/config).
         *
         * This is a complex type.
         */
        public interface Request extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Request.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("request14a7elemtype");
            
            /**
             * Gets the "Header" element
             */
            com.eviware.soapui.config.TestOnDemandHeaderConfig getHeader();
            
            /**
             * Sets the "Header" element
             */
            void setHeader(com.eviware.soapui.config.TestOnDemandHeaderConfig header);
            
            /**
             * Appends and returns a new empty "Header" element
             */
            com.eviware.soapui.config.TestOnDemandHeaderConfig addNewHeader();
            
            /**
             * Gets the "Body" element
             */
            com.eviware.soapui.config.TestOnDemandUploadBodyConfig getBody();
            
            /**
             * Sets the "Body" element
             */
            void setBody(com.eviware.soapui.config.TestOnDemandUploadBodyConfig body);
            
            /**
             * Appends and returns a new empty "Body" element
             */
            com.eviware.soapui.config.TestOnDemandUploadBodyConfig addNewBody();
            
            /**
             * Gets the "api_version" attribute
             */
            java.lang.String getApiVersion();
            
            /**
             * Gets (as xml) the "api_version" attribute
             */
            org.apache.xmlbeans.XmlString xgetApiVersion();
            
            /**
             * True if has "api_version" attribute
             */
            boolean isSetApiVersion();
            
            /**
             * Sets the "api_version" attribute
             */
            void setApiVersion(java.lang.String apiVersion);
            
            /**
             * Sets (as xml) the "api_version" attribute
             */
            void xsetApiVersion(org.apache.xmlbeans.XmlString apiVersion);
            
            /**
             * Unsets the "api_version" attribute
             */
            void unsetApiVersion();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest.Request newInstance() {
                  return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest.Request) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest newInstance() {
              return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig.TestOnDemandUploadRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig newInstance() {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.TestOnDemandUploadRequestDocumentConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
