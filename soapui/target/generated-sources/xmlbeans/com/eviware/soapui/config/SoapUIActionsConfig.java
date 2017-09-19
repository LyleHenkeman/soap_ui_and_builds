/*
 * XML Type:  SoapUIActions
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.SoapUIActionsConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML SoapUIActions(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface SoapUIActionsConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoapUIActionsConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("soapuiactionsd6e4type");
    
    /**
     * Gets a List of "action" elements
     */
    java.util.List<com.eviware.soapui.config.SoapUIActionConfig> getActionList();
    
    /**
     * Gets array of all "action" elements
     * @deprecated
     */
    com.eviware.soapui.config.SoapUIActionConfig[] getActionArray();
    
    /**
     * Gets ith "action" element
     */
    com.eviware.soapui.config.SoapUIActionConfig getActionArray(int i);
    
    /**
     * Returns number of "action" element
     */
    int sizeOfActionArray();
    
    /**
     * Sets array of all "action" element
     */
    void setActionArray(com.eviware.soapui.config.SoapUIActionConfig[] actionArray);
    
    /**
     * Sets ith "action" element
     */
    void setActionArray(int i, com.eviware.soapui.config.SoapUIActionConfig action);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "action" element
     */
    com.eviware.soapui.config.SoapUIActionConfig insertNewAction(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "action" element
     */
    com.eviware.soapui.config.SoapUIActionConfig addNewAction();
    
    /**
     * Removes the ith "action" element
     */
    void removeAction(int i);
    
    /**
     * Gets a List of "actionGroup" elements
     */
    java.util.List<com.eviware.soapui.config.SoapUIActionGroupConfig> getActionGroupList();
    
    /**
     * Gets array of all "actionGroup" elements
     * @deprecated
     */
    com.eviware.soapui.config.SoapUIActionGroupConfig[] getActionGroupArray();
    
    /**
     * Gets ith "actionGroup" element
     */
    com.eviware.soapui.config.SoapUIActionGroupConfig getActionGroupArray(int i);
    
    /**
     * Returns number of "actionGroup" element
     */
    int sizeOfActionGroupArray();
    
    /**
     * Sets array of all "actionGroup" element
     */
    void setActionGroupArray(com.eviware.soapui.config.SoapUIActionGroupConfig[] actionGroupArray);
    
    /**
     * Sets ith "actionGroup" element
     */
    void setActionGroupArray(int i, com.eviware.soapui.config.SoapUIActionGroupConfig actionGroup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "actionGroup" element
     */
    com.eviware.soapui.config.SoapUIActionGroupConfig insertNewActionGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "actionGroup" element
     */
    com.eviware.soapui.config.SoapUIActionGroupConfig addNewActionGroup();
    
    /**
     * Removes the ith "actionGroup" element
     */
    void removeActionGroup(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.SoapUIActionsConfig newInstance() {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.SoapUIActionsConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.SoapUIActionsConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
