/*
 * XML Type:  parameterType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.ParameterType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools;


/**
 * An XML parameterType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public interface ParameterType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("parametertype0edctype");
    
    /**
     * Gets the "type" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.apache.xmlbeans.XmlAnySimpleType type);
    
    /**
     * Appends and returns a new empty "type" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewType();
    
    /**
     * Gets the "xml-name" attribute
     */
    javax.xml.namespace.QName getXmlName();
    
    /**
     * Gets (as xml) the "xml-name" attribute
     */
    org.apache.xmlbeans.XmlQName xgetXmlName();
    
    /**
     * True if has "xml-name" attribute
     */
    boolean isSetXmlName();
    
    /**
     * Sets the "xml-name" attribute
     */
    void setXmlName(javax.xml.namespace.QName xmlName);
    
    /**
     * Sets (as xml) the "xml-name" attribute
     */
    void xsetXmlName(org.apache.xmlbeans.XmlQName xmlName);
    
    /**
     * Unsets the "xml-name" attribute
     */
    void unsetXmlName();
    
    /**
     * Gets the "mode" attribute
     */
    org.jboss.jbosswsTools.ParameterType.Mode.Enum getMode();
    
    /**
     * Gets (as xml) the "mode" attribute
     */
    org.jboss.jbosswsTools.ParameterType.Mode xgetMode();
    
    /**
     * True if has "mode" attribute
     */
    boolean isSetMode();
    
    /**
     * Sets the "mode" attribute
     */
    void setMode(org.jboss.jbosswsTools.ParameterType.Mode.Enum mode);
    
    /**
     * Sets (as xml) the "mode" attribute
     */
    void xsetMode(org.jboss.jbosswsTools.ParameterType.Mode mode);
    
    /**
     * Unsets the "mode" attribute
     */
    void unsetMode();
    
    /**
     * Gets the "header" attribute
     */
    boolean getHeader();
    
    /**
     * Gets (as xml) the "header" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetHeader();
    
    /**
     * True if has "header" attribute
     */
    boolean isSetHeader();
    
    /**
     * Sets the "header" attribute
     */
    void setHeader(boolean header);
    
    /**
     * Sets (as xml) the "header" attribute
     */
    void xsetHeader(org.apache.xmlbeans.XmlBoolean header);
    
    /**
     * Unsets the "header" attribute
     */
    void unsetHeader();
    
    /**
     * An XML mode(@).
     *
     * This is an atomic type that is a restriction of org.jboss.jbosswsTools.ParameterType$Mode.
     */
    public interface Mode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Mode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("modef239attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum IN = Enum.forString("IN");
        static final Enum OUT = Enum.forString("OUT");
        static final Enum INOUT = Enum.forString("INOUT");
        
        static final int INT_IN = Enum.INT_IN;
        static final int INT_OUT = Enum.INT_OUT;
        static final int INT_INOUT = Enum.INT_INOUT;
        
        /**
         * Enumeration value class for org.jboss.jbosswsTools.ParameterType$Mode.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_IN
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
            
            static final int INT_IN = 1;
            static final int INT_OUT = 2;
            static final int INT_INOUT = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("IN", INT_IN),
                    new Enum("OUT", INT_OUT),
                    new Enum("INOUT", INT_INOUT),
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
            public static org.jboss.jbosswsTools.ParameterType.Mode newValue(java.lang.Object obj) {
              return (org.jboss.jbosswsTools.ParameterType.Mode) type.newValue( obj ); }
            
            public static org.jboss.jbosswsTools.ParameterType.Mode newInstance() {
              return (org.jboss.jbosswsTools.ParameterType.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.jboss.jbosswsTools.ParameterType.Mode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.jboss.jbosswsTools.ParameterType.Mode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.jboss.jbosswsTools.ParameterType newInstance() {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.jboss.jbosswsTools.ParameterType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.jboss.jbosswsTools.ParameterType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.jboss.jbosswsTools.ParameterType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.ParameterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.ParameterType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.ParameterType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
