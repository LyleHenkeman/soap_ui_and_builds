/*
 * XML Type:  Parts
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.PartsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML Parts(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface PartsConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PartsConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("partsc5e2type");
    
    /**
     * Gets a List of "part" elements
     */
    java.util.List<com.eviware.soapui.config.PartsConfig.Part> getPartList();
    
    /**
     * Gets array of all "part" elements
     * @deprecated
     */
    com.eviware.soapui.config.PartsConfig.Part[] getPartArray();
    
    /**
     * Gets ith "part" element
     */
    com.eviware.soapui.config.PartsConfig.Part getPartArray(int i);
    
    /**
     * Returns number of "part" element
     */
    int sizeOfPartArray();
    
    /**
     * Sets array of all "part" element
     */
    void setPartArray(com.eviware.soapui.config.PartsConfig.Part[] partArray);
    
    /**
     * Sets ith "part" element
     */
    void setPartArray(int i, com.eviware.soapui.config.PartsConfig.Part part);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "part" element
     */
    com.eviware.soapui.config.PartsConfig.Part insertNewPart(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "part" element
     */
    com.eviware.soapui.config.PartsConfig.Part addNewPart();
    
    /**
     * Removes the ith "part" element
     */
    void removePart(int i);
    
    /**
     * An XML part(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public interface Part extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Part.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("part1233elemtype");
        
        /**
         * Gets a List of "contentType" elements
         */
        java.util.List<java.lang.String> getContentTypeList();
        
        /**
         * Gets array of all "contentType" elements
         * @deprecated
         */
        java.lang.String[] getContentTypeArray();
        
        /**
         * Gets ith "contentType" element
         */
        java.lang.String getContentTypeArray(int i);
        
        /**
         * Gets (as xml) a List of "contentType" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetContentTypeList();
        
        /**
         * Gets (as xml) array of all "contentType" elements
         * @deprecated
         */
        org.apache.xmlbeans.XmlString[] xgetContentTypeArray();
        
        /**
         * Gets (as xml) ith "contentType" element
         */
        org.apache.xmlbeans.XmlString xgetContentTypeArray(int i);
        
        /**
         * Returns number of "contentType" element
         */
        int sizeOfContentTypeArray();
        
        /**
         * Sets array of all "contentType" element
         */
        void setContentTypeArray(java.lang.String[] contentTypeArray);
        
        /**
         * Sets ith "contentType" element
         */
        void setContentTypeArray(int i, java.lang.String contentType);
        
        /**
         * Sets (as xml) array of all "contentType" element
         */
        void xsetContentTypeArray(org.apache.xmlbeans.XmlString[] contentTypeArray);
        
        /**
         * Sets (as xml) ith "contentType" element
         */
        void xsetContentTypeArray(int i, org.apache.xmlbeans.XmlString contentType);
        
        /**
         * Inserts the value as the ith "contentType" element
         */
        void insertContentType(int i, java.lang.String contentType);
        
        /**
         * Appends the value as the last "contentType" element
         */
        void addContentType(java.lang.String contentType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contentType" element
         */
        org.apache.xmlbeans.XmlString insertNewContentType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contentType" element
         */
        org.apache.xmlbeans.XmlString addNewContentType();
        
        /**
         * Removes the ith "contentType" element
         */
        void removeContentType(int i);
        
        /**
         * Gets the "name" attribute
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" attribute
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * True if has "name" attribute
         */
        boolean isSetName();
        
        /**
         * Sets the "name" attribute
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" attribute
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * Unsets the "name" attribute
         */
        void unsetName();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.config.PartsConfig.Part newInstance() {
              return (com.eviware.soapui.config.PartsConfig.Part) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.PartsConfig.Part newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.PartsConfig.Part) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.PartsConfig newInstance() {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.PartsConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.PartsConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.PartsConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.PartsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.PartsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.PartsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
