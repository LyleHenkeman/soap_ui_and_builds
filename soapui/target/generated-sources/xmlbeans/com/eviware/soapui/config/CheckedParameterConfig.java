/*
 * XML Type:  CheckedParameter
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.CheckedParameterConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML CheckedParameter(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface CheckedParameterConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CheckedParameterConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("checkedparameter8e0etype");
    
    /**
     * Gets the "parameterName" attribute
     */
    java.lang.String getParameterName();
    
    /**
     * Gets (as xml) the "parameterName" attribute
     */
    org.apache.xmlbeans.XmlString xgetParameterName();
    
    /**
     * True if has "parameterName" attribute
     */
    boolean isSetParameterName();
    
    /**
     * Sets the "parameterName" attribute
     */
    void setParameterName(java.lang.String parameterName);
    
    /**
     * Sets (as xml) the "parameterName" attribute
     */
    void xsetParameterName(org.apache.xmlbeans.XmlString parameterName);
    
    /**
     * Unsets the "parameterName" attribute
     */
    void unsetParameterName();
    
    /**
     * Gets the "checked" attribute
     */
    boolean getChecked();
    
    /**
     * Gets (as xml) the "checked" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetChecked();
    
    /**
     * True if has "checked" attribute
     */
    boolean isSetChecked();
    
    /**
     * Sets the "checked" attribute
     */
    void setChecked(boolean checked);
    
    /**
     * Sets (as xml) the "checked" attribute
     */
    void xsetChecked(org.apache.xmlbeans.XmlBoolean checked);
    
    /**
     * Unsets the "checked" attribute
     */
    void unsetChecked();
    
    /**
     * Gets the "xpath" attribute
     */
    java.lang.String getXpath();
    
    /**
     * Gets (as xml) the "xpath" attribute
     */
    org.apache.xmlbeans.XmlString xgetXpath();
    
    /**
     * True if has "xpath" attribute
     */
    boolean isSetXpath();
    
    /**
     * Sets the "xpath" attribute
     */
    void setXpath(java.lang.String xpath);
    
    /**
     * Sets (as xml) the "xpath" attribute
     */
    void xsetXpath(org.apache.xmlbeans.XmlString xpath);
    
    /**
     * Unsets the "xpath" attribute
     */
    void unsetXpath();
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "label" attribute
     */
    java.lang.String getLabel();
    
    /**
     * Gets (as xml) the "label" attribute
     */
    org.apache.xmlbeans.XmlString xgetLabel();
    
    /**
     * True if has "label" attribute
     */
    boolean isSetLabel();
    
    /**
     * Sets the "label" attribute
     */
    void setLabel(java.lang.String label);
    
    /**
     * Sets (as xml) the "label" attribute
     */
    void xsetLabel(org.apache.xmlbeans.XmlString label);
    
    /**
     * Unsets the "label" attribute
     */
    void unsetLabel();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.CheckedParameterConfig newInstance() {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.CheckedParameterConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.CheckedParameterConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.CheckedParameterConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.CheckedParameterConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
