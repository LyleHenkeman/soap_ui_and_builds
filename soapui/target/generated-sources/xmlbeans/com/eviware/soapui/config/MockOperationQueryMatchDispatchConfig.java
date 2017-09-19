/*
 * XML Type:  MockOperationQueryMatchDispatch
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MockOperationQueryMatchDispatch(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MockOperationQueryMatchDispatchConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MockOperationQueryMatchDispatchConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("mockoperationquerymatchdispatch6eaetype");
    
    /**
     * Gets a List of "query" elements
     */
    java.util.List<com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query> getQueryList();
    
    /**
     * Gets array of all "query" elements
     * @deprecated
     */
    com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query[] getQueryArray();
    
    /**
     * Gets ith "query" element
     */
    com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query getQueryArray(int i);
    
    /**
     * Returns number of "query" element
     */
    int sizeOfQueryArray();
    
    /**
     * Sets array of all "query" element
     */
    void setQueryArray(com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query[] queryArray);
    
    /**
     * Sets ith "query" element
     */
    void setQueryArray(int i, com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query query);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "query" element
     */
    com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query insertNewQuery(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "query" element
     */
    com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query addNewQuery();
    
    /**
     * Removes the ith "query" element
     */
    void removeQuery(int i);
    
    /**
     * An XML query(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public interface Query extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Query.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("querya2faelemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Gets the "query" element
         */
        java.lang.String getQuery();
        
        /**
         * Gets (as xml) the "query" element
         */
        org.apache.xmlbeans.XmlString xgetQuery();
        
        /**
         * Sets the "query" element
         */
        void setQuery(java.lang.String query);
        
        /**
         * Sets (as xml) the "query" element
         */
        void xsetQuery(org.apache.xmlbeans.XmlString query);
        
        /**
         * Gets the "match" element
         */
        java.lang.String getMatch();
        
        /**
         * Gets (as xml) the "match" element
         */
        org.apache.xmlbeans.XmlString xgetMatch();
        
        /**
         * Sets the "match" element
         */
        void setMatch(java.lang.String match);
        
        /**
         * Sets (as xml) the "match" element
         */
        void xsetMatch(org.apache.xmlbeans.XmlString match);
        
        /**
         * Gets the "response" element
         */
        java.lang.String getResponse();
        
        /**
         * Gets (as xml) the "response" element
         */
        org.apache.xmlbeans.XmlString xgetResponse();
        
        /**
         * Sets the "response" element
         */
        void setResponse(java.lang.String response);
        
        /**
         * Sets (as xml) the "response" element
         */
        void xsetResponse(org.apache.xmlbeans.XmlString response);
        
        /**
         * Gets the "disabled" element
         */
        boolean getDisabled();
        
        /**
         * Gets (as xml) the "disabled" element
         */
        org.apache.xmlbeans.XmlBoolean xgetDisabled();
        
        /**
         * Sets the "disabled" element
         */
        void setDisabled(boolean disabled);
        
        /**
         * Sets (as xml) the "disabled" element
         */
        void xsetDisabled(org.apache.xmlbeans.XmlBoolean disabled);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query newInstance() {
              return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig.Query) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig newInstance() {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MockOperationQueryMatchDispatchConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
