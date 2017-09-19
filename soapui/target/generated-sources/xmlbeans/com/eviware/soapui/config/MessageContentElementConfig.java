/*
 * XML Type:  MessageContentElement
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MessageContentElementConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML MessageContentElement(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface MessageContentElementConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageContentElementConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("messagecontentelement13d8type");
    
    /**
     * Gets the "xpath" element
     */
    java.lang.String getXpath();
    
    /**
     * Gets (as xml) the "xpath" element
     */
    org.apache.xmlbeans.XmlString xgetXpath();
    
    /**
     * Sets the "xpath" element
     */
    void setXpath(java.lang.String xpath);
    
    /**
     * Sets (as xml) the "xpath" element
     */
    void xsetXpath(org.apache.xmlbeans.XmlString xpath);
    
    /**
     * Gets the "element" element
     */
    java.lang.String getElement();
    
    /**
     * Gets (as xml) the "element" element
     */
    org.apache.xmlbeans.XmlString xgetElement();
    
    /**
     * Sets the "element" element
     */
    void setElement(java.lang.String element);
    
    /**
     * Sets (as xml) the "element" element
     */
    void xsetElement(org.apache.xmlbeans.XmlString element);
    
    /**
     * Gets the "type" element
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "type" element
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Gets the "operator" element
     */
    java.lang.String getOperator();
    
    /**
     * Gets (as xml) the "operator" element
     */
    org.apache.xmlbeans.XmlString xgetOperator();
    
    /**
     * Sets the "operator" element
     */
    void setOperator(java.lang.String operator);
    
    /**
     * Sets (as xml) the "operator" element
     */
    void xsetOperator(org.apache.xmlbeans.XmlString operator);
    
    /**
     * Gets the "enabled" element
     */
    boolean getEnabled();
    
    /**
     * Gets (as xml) the "enabled" element
     */
    org.apache.xmlbeans.XmlBoolean xgetEnabled();
    
    /**
     * Sets the "enabled" element
     */
    void setEnabled(boolean enabled);
    
    /**
     * Sets (as xml) the "enabled" element
     */
    void xsetEnabled(org.apache.xmlbeans.XmlBoolean enabled);
    
    /**
     * Gets the "expectedValue" element
     */
    java.lang.String getExpectedValue();
    
    /**
     * Gets (as xml) the "expectedValue" element
     */
    org.apache.xmlbeans.XmlString xgetExpectedValue();
    
    /**
     * Sets the "expectedValue" element
     */
    void setExpectedValue(java.lang.String expectedValue);
    
    /**
     * Sets (as xml) the "expectedValue" element
     */
    void xsetExpectedValue(org.apache.xmlbeans.XmlString expectedValue);
    
    /**
     * Gets the "hasValue" element
     */
    boolean getHasValue();
    
    /**
     * Gets (as xml) the "hasValue" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHasValue();
    
    /**
     * Sets the "hasValue" element
     */
    void setHasValue(boolean hasValue);
    
    /**
     * Sets (as xml) the "hasValue" element
     */
    void xsetHasValue(org.apache.xmlbeans.XmlBoolean hasValue);
    
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
     * Gets the "numberType" element
     */
    boolean getNumberType();
    
    /**
     * Gets (as xml) the "numberType" element
     */
    org.apache.xmlbeans.XmlBoolean xgetNumberType();
    
    /**
     * Sets the "numberType" element
     */
    void setNumberType(boolean numberType);
    
    /**
     * Sets (as xml) the "numberType" element
     */
    void xsetNumberType(org.apache.xmlbeans.XmlBoolean numberType);
    
    /**
     * Gets the "message" element
     */
    java.lang.String getMessage();
    
    /**
     * Gets (as xml) the "message" element
     */
    org.apache.xmlbeans.XmlString xgetMessage();
    
    /**
     * Sets the "message" element
     */
    void setMessage(java.lang.String message);
    
    /**
     * Sets (as xml) the "message" element
     */
    void xsetMessage(org.apache.xmlbeans.XmlString message);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.MessageContentElementConfig newInstance() {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.MessageContentElementConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MessageContentElementConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.MessageContentElementConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.MessageContentElementConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
