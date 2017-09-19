/*
 * XML Type:  assertionResults
 * Namespace: http://www.ws-i.org/testing/2003/03/analyzerConfig/
 * Java type: org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.analyzerConfig;


/**
 * An XML assertionResults(@http://www.ws-i.org/testing/2003/03/analyzerConfig/).
 *
 * This is a complex type.
 */
public interface AssertionResults extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AssertionResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("assertionresultsd60ftype");
    
    /**
     * Gets the "type" attribute
     */
    org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "messageEntry" attribute
     */
    boolean getMessageEntry();
    
    /**
     * Gets (as xml) the "messageEntry" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMessageEntry();
    
    /**
     * True if has "messageEntry" attribute
     */
    boolean isSetMessageEntry();
    
    /**
     * Sets the "messageEntry" attribute
     */
    void setMessageEntry(boolean messageEntry);
    
    /**
     * Sets (as xml) the "messageEntry" attribute
     */
    void xsetMessageEntry(org.apache.xmlbeans.XmlBoolean messageEntry);
    
    /**
     * Unsets the "messageEntry" attribute
     */
    void unsetMessageEntry();
    
    /**
     * Gets the "assertionDescription" attribute
     */
    boolean getAssertionDescription();
    
    /**
     * Gets (as xml) the "assertionDescription" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetAssertionDescription();
    
    /**
     * True if has "assertionDescription" attribute
     */
    boolean isSetAssertionDescription();
    
    /**
     * Sets the "assertionDescription" attribute
     */
    void setAssertionDescription(boolean assertionDescription);
    
    /**
     * Sets (as xml) the "assertionDescription" attribute
     */
    void xsetAssertionDescription(org.apache.xmlbeans.XmlBoolean assertionDescription);
    
    /**
     * Unsets the "assertionDescription" attribute
     */
    void unsetAssertionDescription();
    
    /**
     * Gets the "failureMessage" attribute
     */
    boolean getFailureMessage();
    
    /**
     * Gets (as xml) the "failureMessage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFailureMessage();
    
    /**
     * True if has "failureMessage" attribute
     */
    boolean isSetFailureMessage();
    
    /**
     * Sets the "failureMessage" attribute
     */
    void setFailureMessage(boolean failureMessage);
    
    /**
     * Sets (as xml) the "failureMessage" attribute
     */
    void xsetFailureMessage(org.apache.xmlbeans.XmlBoolean failureMessage);
    
    /**
     * Unsets the "failureMessage" attribute
     */
    void unsetFailureMessage();
    
    /**
     * Gets the "failureDetail" attribute
     */
    boolean getFailureDetail();
    
    /**
     * Gets (as xml) the "failureDetail" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetFailureDetail();
    
    /**
     * True if has "failureDetail" attribute
     */
    boolean isSetFailureDetail();
    
    /**
     * Sets the "failureDetail" attribute
     */
    void setFailureDetail(boolean failureDetail);
    
    /**
     * Sets (as xml) the "failureDetail" attribute
     */
    void xsetFailureDetail(org.apache.xmlbeans.XmlBoolean failureDetail);
    
    /**
     * Unsets the "failureDetail" attribute
     */
    void unsetFailureDetail();
    
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("type2375attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum ALL = Enum.forString("all");
        static final Enum ONLY_FAILED = Enum.forString("onlyFailed");
        static final Enum NOT_PASSED = Enum.forString("notPassed");
        
        static final int INT_ALL = Enum.INT_ALL;
        static final int INT_ONLY_FAILED = Enum.INT_ONLY_FAILED;
        static final int INT_NOT_PASSED = Enum.INT_NOT_PASSED;
        
        /**
         * Enumeration value class for org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_ALL
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
            
            static final int INT_ALL = 1;
            static final int INT_ONLY_FAILED = 2;
            static final int INT_NOT_PASSED = 3;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("all", INT_ALL),
                    new Enum("onlyFailed", INT_ONLY_FAILED),
                    new Enum("notPassed", INT_NOT_PASSED),
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
            public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type newValue(java.lang.Object obj) {
              return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type) type.newValue( obj ); }
            
            public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type newInstance() {
              return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults newInstance() {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.analyzerConfig.AssertionResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
