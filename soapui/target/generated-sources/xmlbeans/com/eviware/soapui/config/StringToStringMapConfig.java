/*
 * XML Type:  StringToStringMap
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.StringToStringMapConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML StringToStringMap(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface StringToStringMapConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StringToStringMapConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("stringtostringmapb4a3type");
    
    /**
     * Gets a List of "entry" elements
     */
    java.util.List<com.eviware.soapui.config.StringToStringMapConfig.Entry> getEntryList();
    
    /**
     * Gets array of all "entry" elements
     * @deprecated
     */
    com.eviware.soapui.config.StringToStringMapConfig.Entry[] getEntryArray();
    
    /**
     * Gets ith "entry" element
     */
    com.eviware.soapui.config.StringToStringMapConfig.Entry getEntryArray(int i);
    
    /**
     * Returns number of "entry" element
     */
    int sizeOfEntryArray();
    
    /**
     * Sets array of all "entry" element
     */
    void setEntryArray(com.eviware.soapui.config.StringToStringMapConfig.Entry[] entryArray);
    
    /**
     * Sets ith "entry" element
     */
    void setEntryArray(int i, com.eviware.soapui.config.StringToStringMapConfig.Entry entry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    com.eviware.soapui.config.StringToStringMapConfig.Entry insertNewEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    com.eviware.soapui.config.StringToStringMapConfig.Entry addNewEntry();
    
    /**
     * Removes the ith "entry" element
     */
    void removeEntry(int i);
    
    /**
     * An XML entry(@http://eviware.com/soapui/config).
     *
     * This is a complex type.
     */
    public interface Entry extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Entry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("entrya485elemtype");
        
        /**
         * Gets the "key" attribute
         */
        java.lang.String getKey();
        
        /**
         * Gets (as xml) the "key" attribute
         */
        org.apache.xmlbeans.XmlString xgetKey();
        
        /**
         * True if has "key" attribute
         */
        boolean isSetKey();
        
        /**
         * Sets the "key" attribute
         */
        void setKey(java.lang.String key);
        
        /**
         * Sets (as xml) the "key" attribute
         */
        void xsetKey(org.apache.xmlbeans.XmlString key);
        
        /**
         * Unsets the "key" attribute
         */
        void unsetKey();
        
        /**
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.config.StringToStringMapConfig.Entry newInstance() {
              return (com.eviware.soapui.config.StringToStringMapConfig.Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.StringToStringMapConfig.Entry newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.StringToStringMapConfig.Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.StringToStringMapConfig newInstance() {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.StringToStringMapConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.StringToStringMapConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.StringToStringMapConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.StringToStringMapConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
