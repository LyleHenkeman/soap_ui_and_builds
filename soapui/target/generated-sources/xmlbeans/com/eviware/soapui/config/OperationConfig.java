/*
 * XML Type:  Operation
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OperationConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML Operation(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface OperationConfig extends com.eviware.soapui.config.ModelItemConfig
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("operationabbbtype");
    
    /**
     * Gets a List of "call" elements
     */
    java.util.List<com.eviware.soapui.config.WsdlRequestConfig> getCallList();
    
    /**
     * Gets array of all "call" elements
     * @deprecated
     */
    com.eviware.soapui.config.WsdlRequestConfig[] getCallArray();
    
    /**
     * Gets ith "call" element
     */
    com.eviware.soapui.config.WsdlRequestConfig getCallArray(int i);
    
    /**
     * Returns number of "call" element
     */
    int sizeOfCallArray();
    
    /**
     * Sets array of all "call" element
     */
    void setCallArray(com.eviware.soapui.config.WsdlRequestConfig[] callArray);
    
    /**
     * Sets ith "call" element
     */
    void setCallArray(int i, com.eviware.soapui.config.WsdlRequestConfig call);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "call" element
     */
    com.eviware.soapui.config.WsdlRequestConfig insertNewCall(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "call" element
     */
    com.eviware.soapui.config.WsdlRequestConfig addNewCall();
    
    /**
     * Removes the ith "call" element
     */
    void removeCall(int i);
    
    /**
     * Gets the "requestParts" element
     */
    com.eviware.soapui.config.PartsConfig getRequestParts();
    
    /**
     * True if has "requestParts" element
     */
    boolean isSetRequestParts();
    
    /**
     * Sets the "requestParts" element
     */
    void setRequestParts(com.eviware.soapui.config.PartsConfig requestParts);
    
    /**
     * Appends and returns a new empty "requestParts" element
     */
    com.eviware.soapui.config.PartsConfig addNewRequestParts();
    
    /**
     * Unsets the "requestParts" element
     */
    void unsetRequestParts();
    
    /**
     * Gets the "responseParts" element
     */
    com.eviware.soapui.config.PartsConfig getResponseParts();
    
    /**
     * True if has "responseParts" element
     */
    boolean isSetResponseParts();
    
    /**
     * Sets the "responseParts" element
     */
    void setResponseParts(com.eviware.soapui.config.PartsConfig responseParts);
    
    /**
     * Appends and returns a new empty "responseParts" element
     */
    com.eviware.soapui.config.PartsConfig addNewResponseParts();
    
    /**
     * Unsets the "responseParts" element
     */
    void unsetResponseParts();
    
    /**
     * Gets the "action" attribute
     */
    java.lang.String getAction();
    
    /**
     * Gets (as xml) the "action" attribute
     */
    org.apache.xmlbeans.XmlString xgetAction();
    
    /**
     * True if has "action" attribute
     */
    boolean isSetAction();
    
    /**
     * Sets the "action" attribute
     */
    void setAction(java.lang.String action);
    
    /**
     * Sets (as xml) the "action" attribute
     */
    void xsetAction(org.apache.xmlbeans.XmlString action);
    
    /**
     * Unsets the "action" attribute
     */
    void unsetAction();
    
    /**
     * Gets the "bindingOperationName" attribute
     */
    java.lang.String getBindingOperationName();
    
    /**
     * Gets (as xml) the "bindingOperationName" attribute
     */
    org.apache.xmlbeans.XmlString xgetBindingOperationName();
    
    /**
     * True if has "bindingOperationName" attribute
     */
    boolean isSetBindingOperationName();
    
    /**
     * Sets the "bindingOperationName" attribute
     */
    void setBindingOperationName(java.lang.String bindingOperationName);
    
    /**
     * Sets (as xml) the "bindingOperationName" attribute
     */
    void xsetBindingOperationName(org.apache.xmlbeans.XmlString bindingOperationName);
    
    /**
     * Unsets the "bindingOperationName" attribute
     */
    void unsetBindingOperationName();
    
    /**
     * Gets the "style" attribute
     */
    com.eviware.soapui.config.OperationStylesConfig.Enum getStyle();
    
    /**
     * Gets (as xml) the "style" attribute
     */
    com.eviware.soapui.config.OperationStylesConfig xgetStyle();
    
    /**
     * True if has "style" attribute
     */
    boolean isSetStyle();
    
    /**
     * Sets the "style" attribute
     */
    void setStyle(com.eviware.soapui.config.OperationStylesConfig.Enum style);
    
    /**
     * Sets (as xml) the "style" attribute
     */
    void xsetStyle(com.eviware.soapui.config.OperationStylesConfig style);
    
    /**
     * Unsets the "style" attribute
     */
    void unsetStyle();
    
    /**
     * Gets the "type" attribute
     */
    com.eviware.soapui.config.OperationTypesConfig.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    com.eviware.soapui.config.OperationTypesConfig xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(com.eviware.soapui.config.OperationTypesConfig.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(com.eviware.soapui.config.OperationTypesConfig type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * Gets the "inputName" attribute
     */
    java.lang.String getInputName();
    
    /**
     * Gets (as xml) the "inputName" attribute
     */
    org.apache.xmlbeans.XmlString xgetInputName();
    
    /**
     * True if has "inputName" attribute
     */
    boolean isSetInputName();
    
    /**
     * Sets the "inputName" attribute
     */
    void setInputName(java.lang.String inputName);
    
    /**
     * Sets (as xml) the "inputName" attribute
     */
    void xsetInputName(org.apache.xmlbeans.XmlString inputName);
    
    /**
     * Unsets the "inputName" attribute
     */
    void unsetInputName();
    
    /**
     * Gets the "outputName" attribute
     */
    java.lang.String getOutputName();
    
    /**
     * Gets (as xml) the "outputName" attribute
     */
    org.apache.xmlbeans.XmlString xgetOutputName();
    
    /**
     * True if has "outputName" attribute
     */
    boolean isSetOutputName();
    
    /**
     * Sets the "outputName" attribute
     */
    void setOutputName(java.lang.String outputName);
    
    /**
     * Sets (as xml) the "outputName" attribute
     */
    void xsetOutputName(org.apache.xmlbeans.XmlString outputName);
    
    /**
     * Unsets the "outputName" attribute
     */
    void unsetOutputName();
    
    /**
     * Gets the "isOneWay" attribute
     */
    boolean getIsOneWay();
    
    /**
     * Gets (as xml) the "isOneWay" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetIsOneWay();
    
    /**
     * True if has "isOneWay" attribute
     */
    boolean isSetIsOneWay();
    
    /**
     * Sets the "isOneWay" attribute
     */
    void setIsOneWay(boolean isOneWay);
    
    /**
     * Sets (as xml) the "isOneWay" attribute
     */
    void xsetIsOneWay(org.apache.xmlbeans.XmlBoolean isOneWay);
    
    /**
     * Unsets the "isOneWay" attribute
     */
    void unsetIsOneWay();
    
    /**
     * Gets the "sendsAttachments" attribute
     */
    boolean getSendsAttachments();
    
    /**
     * Gets (as xml) the "sendsAttachments" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSendsAttachments();
    
    /**
     * True if has "sendsAttachments" attribute
     */
    boolean isSetSendsAttachments();
    
    /**
     * Sets the "sendsAttachments" attribute
     */
    void setSendsAttachments(boolean sendsAttachments);
    
    /**
     * Sets (as xml) the "sendsAttachments" attribute
     */
    void xsetSendsAttachments(org.apache.xmlbeans.XmlBoolean sendsAttachments);
    
    /**
     * Unsets the "sendsAttachments" attribute
     */
    void unsetSendsAttachments();
    
    /**
     * Gets the "receivesAttachments" attribute
     */
    boolean getReceivesAttachments();
    
    /**
     * Gets (as xml) the "receivesAttachments" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetReceivesAttachments();
    
    /**
     * True if has "receivesAttachments" attribute
     */
    boolean isSetReceivesAttachments();
    
    /**
     * Sets the "receivesAttachments" attribute
     */
    void setReceivesAttachments(boolean receivesAttachments);
    
    /**
     * Sets (as xml) the "receivesAttachments" attribute
     */
    void xsetReceivesAttachments(org.apache.xmlbeans.XmlBoolean receivesAttachments);
    
    /**
     * Unsets the "receivesAttachments" attribute
     */
    void unsetReceivesAttachments();
    
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
        public static com.eviware.soapui.config.OperationConfig newInstance() {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.OperationConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.OperationConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.OperationConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.OperationConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.OperationConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.OperationConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
