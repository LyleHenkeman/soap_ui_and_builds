/*
 * XML Type:  RestParameter
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.RestParameterConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML RestParameter(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface RestParameterConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RestParameterConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("restparameter002dtype");
    
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
     * Gets the "value" element
     */
    java.lang.String getValue();
    
    /**
     * Gets (as xml) the "value" element
     */
    org.apache.xmlbeans.XmlString xgetValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(java.lang.String value);
    
    /**
     * Sets (as xml) the "value" element
     */
    void xsetValue(org.apache.xmlbeans.XmlString value);
    
    /**
     * Gets the "style" element
     */
    com.eviware.soapui.config.RestParameterConfig.Style.Enum getStyle();
    
    /**
     * Gets (as xml) the "style" element
     */
    com.eviware.soapui.config.RestParameterConfig.Style xgetStyle();
    
    /**
     * Sets the "style" element
     */
    void setStyle(com.eviware.soapui.config.RestParameterConfig.Style.Enum style);
    
    /**
     * Sets (as xml) the "style" element
     */
    void xsetStyle(com.eviware.soapui.config.RestParameterConfig.Style style);
    
    /**
     * Gets the "type" element
     */
    javax.xml.namespace.QName getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlQName xgetType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(javax.xml.namespace.QName type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlQName type);
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "default" element
     */
    java.lang.String getDefault();
    
    /**
     * Gets (as xml) the "default" element
     */
    org.apache.xmlbeans.XmlString xgetDefault();
    
    /**
     * True if has "default" element
     */
    boolean isSetDefault();
    
    /**
     * Sets the "default" element
     */
    void setDefault(java.lang.String xdefault);
    
    /**
     * Sets (as xml) the "default" element
     */
    void xsetDefault(org.apache.xmlbeans.XmlString xdefault);
    
    /**
     * Unsets the "default" element
     */
    void unsetDefault();
    
    /**
     * Gets the "path" element
     */
    java.lang.String getPath();
    
    /**
     * Gets (as xml) the "path" element
     */
    org.apache.xmlbeans.XmlString xgetPath();
    
    /**
     * True if has "path" element
     */
    boolean isSetPath();
    
    /**
     * Sets the "path" element
     */
    void setPath(java.lang.String path);
    
    /**
     * Sets (as xml) the "path" element
     */
    void xsetPath(org.apache.xmlbeans.XmlString path);
    
    /**
     * Unsets the "path" element
     */
    void unsetPath();
    
    /**
     * Gets the "link" element
     */
    java.lang.String getLink();
    
    /**
     * Gets (as xml) the "link" element
     */
    org.apache.xmlbeans.XmlString xgetLink();
    
    /**
     * True if has "link" element
     */
    boolean isSetLink();
    
    /**
     * Sets the "link" element
     */
    void setLink(java.lang.String link);
    
    /**
     * Sets (as xml) the "link" element
     */
    void xsetLink(org.apache.xmlbeans.XmlString link);
    
    /**
     * Unsets the "link" element
     */
    void unsetLink();
    
    /**
     * Gets a List of "option" elements
     */
    java.util.List<java.lang.String> getOptionList();
    
    /**
     * Gets array of all "option" elements
     * @deprecated
     */
    java.lang.String[] getOptionArray();
    
    /**
     * Gets ith "option" element
     */
    java.lang.String getOptionArray(int i);
    
    /**
     * Gets (as xml) a List of "option" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetOptionList();
    
    /**
     * Gets (as xml) array of all "option" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetOptionArray();
    
    /**
     * Gets (as xml) ith "option" element
     */
    org.apache.xmlbeans.XmlString xgetOptionArray(int i);
    
    /**
     * Returns number of "option" element
     */
    int sizeOfOptionArray();
    
    /**
     * Sets array of all "option" element
     */
    void setOptionArray(java.lang.String[] optionArray);
    
    /**
     * Sets ith "option" element
     */
    void setOptionArray(int i, java.lang.String option);
    
    /**
     * Sets (as xml) array of all "option" element
     */
    void xsetOptionArray(org.apache.xmlbeans.XmlString[] optionArray);
    
    /**
     * Sets (as xml) ith "option" element
     */
    void xsetOptionArray(int i, org.apache.xmlbeans.XmlString option);
    
    /**
     * Inserts the value as the ith "option" element
     */
    void insertOption(int i, java.lang.String option);
    
    /**
     * Appends the value as the last "option" element
     */
    void addOption(java.lang.String option);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "option" element
     */
    org.apache.xmlbeans.XmlString insertNewOption(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "option" element
     */
    org.apache.xmlbeans.XmlString addNewOption();
    
    /**
     * Removes the ith "option" element
     */
    void removeOption(int i);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "required" attribute
     */
    boolean getRequired();
    
    /**
     * Gets (as xml) the "required" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRequired();
    
    /**
     * True if has "required" attribute
     */
    boolean isSetRequired();
    
    /**
     * Sets the "required" attribute
     */
    void setRequired(boolean required);
    
    /**
     * Sets (as xml) the "required" attribute
     */
    void xsetRequired(org.apache.xmlbeans.XmlBoolean required);
    
    /**
     * Unsets the "required" attribute
     */
    void unsetRequired();
    
    /**
     * Gets the "repeating" attribute
     */
    boolean getRepeating();
    
    /**
     * Gets (as xml) the "repeating" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetRepeating();
    
    /**
     * True if has "repeating" attribute
     */
    boolean isSetRepeating();
    
    /**
     * Sets the "repeating" attribute
     */
    void setRepeating(boolean repeating);
    
    /**
     * Sets (as xml) the "repeating" attribute
     */
    void xsetRepeating(org.apache.xmlbeans.XmlBoolean repeating);
    
    /**
     * Unsets the "repeating" attribute
     */
    void unsetRepeating();
    
    /**
     * Gets the "disableUrlEncoding" attribute
     */
    boolean getDisableUrlEncoding();
    
    /**
     * Gets (as xml) the "disableUrlEncoding" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetDisableUrlEncoding();
    
    /**
     * True if has "disableUrlEncoding" attribute
     */
    boolean isSetDisableUrlEncoding();
    
    /**
     * Sets the "disableUrlEncoding" attribute
     */
    void setDisableUrlEncoding(boolean disableUrlEncoding);
    
    /**
     * Sets (as xml) the "disableUrlEncoding" attribute
     */
    void xsetDisableUrlEncoding(org.apache.xmlbeans.XmlBoolean disableUrlEncoding);
    
    /**
     * Unsets the "disableUrlEncoding" attribute
     */
    void unsetDisableUrlEncoding();
    
    /**
     * An XML style(@http://eviware.com/soapui/config).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.RestParameterConfig$Style.
     */
    public interface Style extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Style.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("style9db0elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum MATRIX = Enum.forString("MATRIX");
        static final Enum HEADER = Enum.forString("HEADER");
        static final Enum QUERY = Enum.forString("QUERY");
        static final Enum TEMPLATE = Enum.forString("TEMPLATE");
        static final Enum PLAIN = Enum.forString("PLAIN");
        
        static final int INT_MATRIX = Enum.INT_MATRIX;
        static final int INT_HEADER = Enum.INT_HEADER;
        static final int INT_QUERY = Enum.INT_QUERY;
        static final int INT_TEMPLATE = Enum.INT_TEMPLATE;
        static final int INT_PLAIN = Enum.INT_PLAIN;
        
        /**
         * Enumeration value class for com.eviware.soapui.config.RestParameterConfig$Style.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_MATRIX
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_MATRIX = 1;
            static final int INT_HEADER = 2;
            static final int INT_QUERY = 3;
            static final int INT_TEMPLATE = 4;
            static final int INT_PLAIN = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("MATRIX", INT_MATRIX),
                    new Enum("HEADER", INT_HEADER),
                    new Enum("QUERY", INT_QUERY),
                    new Enum("TEMPLATE", INT_TEMPLATE),
                    new Enum("PLAIN", INT_PLAIN),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.eviware.soapui.config.RestParameterConfig.Style newValue(java.lang.Object obj) {
              return (com.eviware.soapui.config.RestParameterConfig.Style) type.newValue( obj ); }
            
            public static com.eviware.soapui.config.RestParameterConfig.Style newInstance() {
              return (com.eviware.soapui.config.RestParameterConfig.Style) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.RestParameterConfig.Style newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.RestParameterConfig.Style) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.RestParameterConfig newInstance() {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.RestParameterConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.RestParameterConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.RestParameterConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestParameterConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.RestParameterConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.RestParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
