/*
 * XML Type:  WsdlInterface
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WsdlInterfaceConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML WsdlInterface(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface WsdlInterfaceConfig extends com.eviware.soapui.config.InterfaceConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WsdlInterfaceConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("wsdlinterface7d2dtype");
    
    /**
     * Gets a List of "operation" elements
     */
    java.util.List<com.eviware.soapui.config.OperationConfig> getOperationList();
    
    /**
     * Gets array of all "operation" elements
     * @deprecated
     */
    com.eviware.soapui.config.OperationConfig[] getOperationArray();
    
    /**
     * Gets ith "operation" element
     */
    com.eviware.soapui.config.OperationConfig getOperationArray(int i);
    
    /**
     * Returns number of "operation" element
     */
    int sizeOfOperationArray();
    
    /**
     * Sets array of all "operation" element
     */
    void setOperationArray(com.eviware.soapui.config.OperationConfig[] operationArray);
    
    /**
     * Sets ith "operation" element
     */
    void setOperationArray(int i, com.eviware.soapui.config.OperationConfig operation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    com.eviware.soapui.config.OperationConfig insertNewOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    com.eviware.soapui.config.OperationConfig addNewOperation();
    
    /**
     * Removes the ith "operation" element
     */
    void removeOperation(int i);
    
    /**
     * Gets the "definition" attribute
     */
    java.lang.String getDefinition();
    
    /**
     * Gets (as xml) the "definition" attribute
     */
    org.apache.xmlbeans.XmlString xgetDefinition();
    
    /**
     * True if has "definition" attribute
     */
    boolean isSetDefinition();
    
    /**
     * Sets the "definition" attribute
     */
    void setDefinition(java.lang.String definition);
    
    /**
     * Sets (as xml) the "definition" attribute
     */
    void xsetDefinition(org.apache.xmlbeans.XmlString definition);
    
    /**
     * Unsets the "definition" attribute
     */
    void unsetDefinition();
    
    /**
     * Gets the "bindingName" attribute
     */
    java.lang.String getBindingName();
    
    /**
     * Gets (as xml) the "bindingName" attribute
     */
    org.apache.xmlbeans.XmlString xgetBindingName();
    
    /**
     * True if has "bindingName" attribute
     */
    boolean isSetBindingName();
    
    /**
     * Sets the "bindingName" attribute
     */
    void setBindingName(java.lang.String bindingName);
    
    /**
     * Sets (as xml) the "bindingName" attribute
     */
    void xsetBindingName(org.apache.xmlbeans.XmlString bindingName);
    
    /**
     * Unsets the "bindingName" attribute
     */
    void unsetBindingName();
    
    /**
     * Gets the "soapVersion" attribute
     */
    com.eviware.soapui.config.SoapVersionTypesConfig.Enum getSoapVersion();
    
    /**
     * Gets (as xml) the "soapVersion" attribute
     */
    com.eviware.soapui.config.SoapVersionTypesConfig xgetSoapVersion();
    
    /**
     * True if has "soapVersion" attribute
     */
    boolean isSetSoapVersion();
    
    /**
     * Sets the "soapVersion" attribute
     */
    void setSoapVersion(com.eviware.soapui.config.SoapVersionTypesConfig.Enum soapVersion);
    
    /**
     * Sets (as xml) the "soapVersion" attribute
     */
    void xsetSoapVersion(com.eviware.soapui.config.SoapVersionTypesConfig soapVersion);
    
    /**
     * Unsets the "soapVersion" attribute
     */
    void unsetSoapVersion();
    
    /**
     * Gets the "wsaVersion" attribute
     */
    com.eviware.soapui.config.WsaVersionTypeConfig.Enum getWsaVersion();
    
    /**
     * Gets (as xml) the "wsaVersion" attribute
     */
    com.eviware.soapui.config.WsaVersionTypeConfig xgetWsaVersion();
    
    /**
     * True if has "wsaVersion" attribute
     */
    boolean isSetWsaVersion();
    
    /**
     * Sets the "wsaVersion" attribute
     */
    void setWsaVersion(com.eviware.soapui.config.WsaVersionTypeConfig.Enum wsaVersion);
    
    /**
     * Sets (as xml) the "wsaVersion" attribute
     */
    void xsetWsaVersion(com.eviware.soapui.config.WsaVersionTypeConfig wsaVersion);
    
    /**
     * Unsets the "wsaVersion" attribute
     */
    void unsetWsaVersion();
    
    /**
     * Gets the "anonymous" attribute
     */
    com.eviware.soapui.config.AnonymousTypeConfig.Enum getAnonymous();
    
    /**
     * Gets (as xml) the "anonymous" attribute
     */
    com.eviware.soapui.config.AnonymousTypeConfig xgetAnonymous();
    
    /**
     * True if has "anonymous" attribute
     */
    boolean isSetAnonymous();
    
    /**
     * Sets the "anonymous" attribute
     */
    void setAnonymous(com.eviware.soapui.config.AnonymousTypeConfig.Enum anonymous);
    
    /**
     * Sets (as xml) the "anonymous" attribute
     */
    void xsetAnonymous(com.eviware.soapui.config.AnonymousTypeConfig anonymous);
    
    /**
     * Unsets the "anonymous" attribute
     */
    void unsetAnonymous();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.WsdlInterfaceConfig newInstance() {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WsdlInterfaceConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WsdlInterfaceConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
