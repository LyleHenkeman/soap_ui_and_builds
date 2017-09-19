/*
 * XML Type:  WorkspaceProject
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WorkspaceProjectConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML WorkspaceProject(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.WorkspaceProjectConfig.
 */
public interface WorkspaceProjectConfig extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WorkspaceProjectConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("workspaceprojectd14ctype");
    
    /**
     * Gets the "type" attribute
     */
    com.eviware.soapui.config.WorkspaceProjectConfig.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    com.eviware.soapui.config.WorkspaceProjectConfig.Type xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(com.eviware.soapui.config.WorkspaceProjectConfig.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.eviware.soapui.config.WorkspaceProjectConfig.Type type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "status" attribute
     */
    com.eviware.soapui.config.WorkspaceProjectConfig.Status.Enum getStatus();
    
    /**
     * Gets (as xml) the "status" attribute
     */
    com.eviware.soapui.config.WorkspaceProjectConfig.Status xgetStatus();
    
    /**
     * True if has "status" attribute
     */
    boolean isSetStatus();
    
    /**
     * Sets the "status" attribute
     */
    void setStatus(com.eviware.soapui.config.WorkspaceProjectConfig.Status.Enum status);
    
    /**
     * Sets (as xml) the "status" attribute
     */
    void xsetStatus(com.eviware.soapui.config.WorkspaceProjectConfig.Status status);
    
    /**
     * Unsets the "status" attribute
     */
    void unsetStatus();
    
    /**
     * Gets the "group" attribute
     */
    java.lang.String getGroup();
    
    /**
     * Gets (as xml) the "group" attribute
     */
    org.apache.xmlbeans.XmlString xgetGroup();
    
    /**
     * True if has "group" attribute
     */
    boolean isSetGroup();
    
    /**
     * Sets the "group" attribute
     */
    void setGroup(java.lang.String group);
    
    /**
     * Sets (as xml) the "group" attribute
     */
    void xsetGroup(org.apache.xmlbeans.XmlString group);
    
    /**
     * Unsets the "group" attribute
     */
    void unsetGroup();
    
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
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.WorkspaceProjectConfig$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("typee1a6attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum LOCAL = Enum.forString("LOCAL");
        static final Enum REMOTE = Enum.forString("REMOTE");
        
        static final int INT_LOCAL = Enum.INT_LOCAL;
        static final int INT_REMOTE = Enum.INT_REMOTE;
        
        /**
         * Enumeration value class for com.eviware.soapui.config.WorkspaceProjectConfig$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_LOCAL
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
            
            static final int INT_LOCAL = 1;
            static final int INT_REMOTE = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("LOCAL", INT_LOCAL),
                    new Enum("REMOTE", INT_REMOTE),
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
            public static com.eviware.soapui.config.WorkspaceProjectConfig.Type newValue(java.lang.Object obj) {
              return (com.eviware.soapui.config.WorkspaceProjectConfig.Type) type.newValue( obj ); }
            
            public static com.eviware.soapui.config.WorkspaceProjectConfig.Type newInstance() {
              return (com.eviware.soapui.config.WorkspaceProjectConfig.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.WorkspaceProjectConfig.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.WorkspaceProjectConfig.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of com.eviware.soapui.config.WorkspaceProjectConfig$Status.
     */
    public interface Status extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Status.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("status1f5eattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum OPEN = Enum.forString("OPEN");
        static final Enum CLOSED = Enum.forString("CLOSED");
        static final Enum CLOSED_AND_ENCRYPTED = Enum.forString("CLOSED_AND_ENCRYPTED");
        
        static final int INT_OPEN = Enum.INT_OPEN;
        static final int INT_CLOSED = Enum.INT_CLOSED;
        static final int INT_CLOSED_AND_ENCRYPTED = Enum.INT_CLOSED_AND_ENCRYPTED;
        
        /**
         * Enumeration value class for com.eviware.soapui.config.WorkspaceProjectConfig$Status.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_OPEN
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
            
            static final int INT_OPEN = 1;
            static final int INT_CLOSED = 2;
            static final int INT_CLOSED_AND_ENCRYPTED = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("OPEN", INT_OPEN),
                    new Enum("CLOSED", INT_CLOSED),
                    new Enum("CLOSED_AND_ENCRYPTED", INT_CLOSED_AND_ENCRYPTED),
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
            public static com.eviware.soapui.config.WorkspaceProjectConfig.Status newValue(java.lang.Object obj) {
              return (com.eviware.soapui.config.WorkspaceProjectConfig.Status) type.newValue( obj ); }
            
            public static com.eviware.soapui.config.WorkspaceProjectConfig.Status newInstance() {
              return (com.eviware.soapui.config.WorkspaceProjectConfig.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.eviware.soapui.config.WorkspaceProjectConfig.Status newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.eviware.soapui.config.WorkspaceProjectConfig.Status) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.WorkspaceProjectConfig newInstance() {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WorkspaceProjectConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WorkspaceProjectConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
