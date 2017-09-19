/*
 * XML Type:  ParameterExposureCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ParameterExposureCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML ParameterExposureCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface ParameterExposureCheckConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ParameterExposureCheckConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("parameterexposurecheck7838type");
    
    /**
     * Gets a List of "parameterExposureStrings" elements
     */
    java.util.List<java.lang.String> getParameterExposureStringsList();
    
    /**
     * Gets array of all "parameterExposureStrings" elements
     * @deprecated
     */
    java.lang.String[] getParameterExposureStringsArray();
    
    /**
     * Gets ith "parameterExposureStrings" element
     */
    java.lang.String getParameterExposureStringsArray(int i);
    
    /**
     * Gets (as xml) a List of "parameterExposureStrings" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetParameterExposureStringsList();
    
    /**
     * Gets (as xml) array of all "parameterExposureStrings" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetParameterExposureStringsArray();
    
    /**
     * Gets (as xml) ith "parameterExposureStrings" element
     */
    org.apache.xmlbeans.XmlString xgetParameterExposureStringsArray(int i);
    
    /**
     * Returns number of "parameterExposureStrings" element
     */
    int sizeOfParameterExposureStringsArray();
    
    /**
     * Sets array of all "parameterExposureStrings" element
     */
    void setParameterExposureStringsArray(java.lang.String[] parameterExposureStringsArray);
    
    /**
     * Sets ith "parameterExposureStrings" element
     */
    void setParameterExposureStringsArray(int i, java.lang.String parameterExposureStrings);
    
    /**
     * Sets (as xml) array of all "parameterExposureStrings" element
     */
    void xsetParameterExposureStringsArray(org.apache.xmlbeans.XmlString[] parameterExposureStringsArray);
    
    /**
     * Sets (as xml) ith "parameterExposureStrings" element
     */
    void xsetParameterExposureStringsArray(int i, org.apache.xmlbeans.XmlString parameterExposureStrings);
    
    /**
     * Inserts the value as the ith "parameterExposureStrings" element
     */
    void insertParameterExposureStrings(int i, java.lang.String parameterExposureStrings);
    
    /**
     * Appends the value as the last "parameterExposureStrings" element
     */
    void addParameterExposureStrings(java.lang.String parameterExposureStrings);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameterExposureStrings" element
     */
    org.apache.xmlbeans.XmlString insertNewParameterExposureStrings(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameterExposureStrings" element
     */
    org.apache.xmlbeans.XmlString addNewParameterExposureStrings();
    
    /**
     * Removes the ith "parameterExposureStrings" element
     */
    void removeParameterExposureStrings(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.ParameterExposureCheckConfig newInstance() {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ParameterExposureCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ParameterExposureCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
