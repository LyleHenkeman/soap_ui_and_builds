/*
 * XML Type:  serviceType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.ServiceType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools;


/**
 * An XML serviceType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public interface ServiceType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("servicetypeec90type");
    
    /**
     * Gets a List of "operation" elements
     */
    java.util.List<org.jboss.jbosswsTools.OperationType> getOperationList();
    
    /**
     * Gets array of all "operation" elements
     * @deprecated
     */
    org.jboss.jbosswsTools.OperationType[] getOperationArray();
    
    /**
     * Gets ith "operation" element
     */
    org.jboss.jbosswsTools.OperationType getOperationArray(int i);
    
    /**
     * Returns number of "operation" element
     */
    int sizeOfOperationArray();
    
    /**
     * Sets array of all "operation" element
     */
    void setOperationArray(org.jboss.jbosswsTools.OperationType[] operationArray);
    
    /**
     * Sets ith "operation" element
     */
    void setOperationArray(int i, org.jboss.jbosswsTools.OperationType operation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    org.jboss.jbosswsTools.OperationType insertNewOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    org.jboss.jbosswsTools.OperationType addNewOperation();
    
    /**
     * Removes the ith "operation" element
     */
    void removeOperation(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.jboss.jbosswsTools.ServiceType.Name xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.jboss.jbosswsTools.ServiceType.Name name);
    
    /**
     * Gets the "endpoint" attribute
     */
    java.lang.String getEndpoint();
    
    /**
     * Gets (as xml) the "endpoint" attribute
     */
    org.jboss.jbosswsTools.ServiceType.Endpoint xgetEndpoint();
    
    /**
     * Sets the "endpoint" attribute
     */
    void setEndpoint(java.lang.String endpoint);
    
    /**
     * Sets (as xml) the "endpoint" attribute
     */
    void xsetEndpoint(org.jboss.jbosswsTools.ServiceType.Endpoint endpoint);
    
    /**
     * Gets the "style" attribute
     */
    org.jboss.jbosswsTools.ServiceType.Style.Enum getStyle();
    
    /**
     * Gets (as xml) the "style" attribute
     */
    org.jboss.jbosswsTools.ServiceType.Style xgetStyle();
    
    /**
     * True if has "style" attribute
     */
    boolean isSetStyle();
    
    /**
     * Sets the "style" attribute
     */
    void setStyle(org.jboss.jbosswsTools.ServiceType.Style.Enum style);
    
    /**
     * Sets (as xml) the "style" attribute
     */
    void xsetStyle(org.jboss.jbosswsTools.ServiceType.Style style);
    
    /**
     * Unsets the "style" attribute
     */
    void unsetStyle();
    
    /**
     * Gets the "parameter-style" attribute
     */
    org.jboss.jbosswsTools.ServiceType.ParameterStyle.Enum getParameterStyle();
    
    /**
     * Gets (as xml) the "parameter-style" attribute
     */
    org.jboss.jbosswsTools.ServiceType.ParameterStyle xgetParameterStyle();
    
    /**
     * True if has "parameter-style" attribute
     */
    boolean isSetParameterStyle();
    
    /**
     * Sets the "parameter-style" attribute
     */
    void setParameterStyle(org.jboss.jbosswsTools.ServiceType.ParameterStyle.Enum parameterStyle);
    
    /**
     * Sets (as xml) the "parameter-style" attribute
     */
    void xsetParameterStyle(org.jboss.jbosswsTools.ServiceType.ParameterStyle parameterStyle);
    
    /**
     * Unsets the "parameter-style" attribute
     */
    void unsetParameterStyle();
    
    /**
     * An XML name(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$Name.
     */
    public interface Name extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("name4f45attrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.jboss.jbosswsTools.ServiceType.Name newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.ServiceType.Name) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.ServiceType.Name newInstance() {
              return (org.jboss.jbosswsTools.ServiceType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.ServiceType.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.ServiceType.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML endpoint(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$Endpoint.
     */
    public interface Endpoint extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Endpoint.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("endpoint377battrtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.jboss.jbosswsTools.ServiceType.Endpoint newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.ServiceType.Endpoint) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.ServiceType.Endpoint newInstance() {
              return (org.jboss.jbosswsTools.ServiceType.Endpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.ServiceType.Endpoint newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.ServiceType.Endpoint) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML style(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$Style.
     */
    public interface Style extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Style.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("style3e97attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum RPC = Enum.forString("rpc");
        static final Enum DOCUMENT = Enum.forString("document");
        
        static final int INT_RPC = Enum.INT_RPC;
        static final int INT_DOCUMENT = Enum.INT_DOCUMENT;
        
        /**
         * Enumeration value class for org.jboss.jbosswsTools.ServiceType$Style.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_RPC
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
            
            static final int INT_RPC = 1;
            static final int INT_DOCUMENT = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("rpc", INT_RPC),
                    new Enum("document", INT_DOCUMENT),
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
            public static org.jboss.jbosswsTools.ServiceType.Style newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.ServiceType.Style) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.ServiceType.Style newInstance() {
              return (org.jboss.jbosswsTools.ServiceType.Style) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.ServiceType.Style newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.ServiceType.Style) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML parameter-style(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ServiceType$ParameterStyle.
     */
    public interface ParameterStyle extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterStyle.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("parameterstyleaa3battrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum BARE = Enum.forString("bare");
        static final Enum WRAPPED = Enum.forString("wrapped");
        
        static final int INT_BARE = Enum.INT_BARE;
        static final int INT_WRAPPED = Enum.INT_WRAPPED;
        
        /**
         * Enumeration value class for org.jboss.jbosswsTools.ServiceType$ParameterStyle.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_BARE
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
            
            static final int INT_BARE = 1;
            static final int INT_WRAPPED = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("bare", INT_BARE),
                    new Enum("wrapped", INT_WRAPPED),
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
            public static org.jboss.jbosswsTools.ServiceType.ParameterStyle newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.ServiceType.ParameterStyle) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.ServiceType.ParameterStyle newInstance() {
              return (org.jboss.jbosswsTools.ServiceType.ParameterStyle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.ServiceType.ParameterStyle newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.ServiceType.ParameterStyle) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.jboss.jbosswsTools.ServiceType newInstance() {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.jboss.jbosswsTools.ServiceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.jboss.jbosswsTools.ServiceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.jboss.jbosswsTools.ServiceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.ServiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.ServiceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.ServiceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
