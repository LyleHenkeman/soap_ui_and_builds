/*
 * XML Type:  ReflectedXSSCheck
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ReflectedXSSCheckConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML ReflectedXSSCheck(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface ReflectedXSSCheckConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReflectedXSSCheckConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("reflectedxsscheck9976type");
    
    /**
     * Gets a List of "paramToCheck" elements
     */
    java.util.List<java.lang.String> getParamToCheckList();
    
    /**
     * Gets array of all "paramToCheck" elements
     * @deprecated
     */
    java.lang.String[] getParamToCheckArray();
    
    /**
     * Gets ith "paramToCheck" element
     */
    java.lang.String getParamToCheckArray(int i);
    
    /**
     * Gets (as xml) a List of "paramToCheck" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetParamToCheckList();
    
    /**
     * Gets (as xml) array of all "paramToCheck" elements
     * @deprecated
     */
    org.apache.xmlbeans.XmlString[] xgetParamToCheckArray();
    
    /**
     * Gets (as xml) ith "paramToCheck" element
     */
    org.apache.xmlbeans.XmlString xgetParamToCheckArray(int i);
    
    /**
     * Returns number of "paramToCheck" element
     */
    int sizeOfParamToCheckArray();
    
    /**
     * Sets array of all "paramToCheck" element
     */
    void setParamToCheckArray(java.lang.String[] paramToCheckArray);
    
    /**
     * Sets ith "paramToCheck" element
     */
    void setParamToCheckArray(int i, java.lang.String paramToCheck);
    
    /**
     * Sets (as xml) array of all "paramToCheck" element
     */
    void xsetParamToCheckArray(org.apache.xmlbeans.XmlString[] paramToCheckArray);
    
    /**
     * Sets (as xml) ith "paramToCheck" element
     */
    void xsetParamToCheckArray(int i, org.apache.xmlbeans.XmlString paramToCheck);
    
    /**
     * Inserts the value as the ith "paramToCheck" element
     */
    void insertParamToCheck(int i, java.lang.String paramToCheck);
    
    /**
     * Appends the value as the last "paramToCheck" element
     */
    void addParamToCheck(java.lang.String paramToCheck);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "paramToCheck" element
     */
    org.apache.xmlbeans.XmlString insertNewParamToCheck(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "paramToCheck" element
     */
    org.apache.xmlbeans.XmlString addNewParamToCheck();
    
    /**
     * Removes the ith "paramToCheck" element
     */
    void removeParamToCheck(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig newInstance() {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.ReflectedXSSCheckConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.ReflectedXSSCheckConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
