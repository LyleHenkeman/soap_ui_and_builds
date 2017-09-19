/*
 * XML Type:  method-paramsType
 * Namespace: http://java.sun.com/xml/ns/j2ee
 * Java type: com.sun.java.xml.ns.j2Ee.MethodParamsType
 *
 * Automatically generated - do not modify.
 */
package com.sun.java.xml.ns.j2Ee;


/**
 * An XML method-paramsType(@http://java.sun.com/xml/ns/j2ee).
 *
 * This is a complex type.
 */
public interface MethodParamsType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MethodParamsType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("methodparamstypef993type");
    
    /**
     * Gets a List of "method-param" elements
     */
    java.util.List<com.sun.java.xml.ns.j2Ee.JavaTypeType> getMethodParamList();
    
    /**
     * Gets array of all "method-param" elements
     * @deprecated
     */
    com.sun.java.xml.ns.j2Ee.JavaTypeType[] getMethodParamArray();
    
    /**
     * Gets ith "method-param" element
     */
    com.sun.java.xml.ns.j2Ee.JavaTypeType getMethodParamArray(int i);
    
    /**
     * Returns number of "method-param" element
     */
    int sizeOfMethodParamArray();
    
    /**
     * Sets array of all "method-param" element
     */
    void setMethodParamArray(com.sun.java.xml.ns.j2Ee.JavaTypeType[] methodParamArray);
    
    /**
     * Sets ith "method-param" element
     */
    void setMethodParamArray(int i, com.sun.java.xml.ns.j2Ee.JavaTypeType methodParam);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "method-param" element
     */
    com.sun.java.xml.ns.j2Ee.JavaTypeType insertNewMethodParam(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "method-param" element
     */
    com.sun.java.xml.ns.j2Ee.JavaTypeType addNewMethodParam();
    
    /**
     * Removes the ith "method-param" element
     */
    void removeMethodParam(int i);
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlID xgetId();
    
    /**
     * True if has "id" attribute
     */
    boolean isSetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "id" attribute
     */
    void unsetId();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType newInstance() {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.sun.java.xml.ns.j2Ee.MethodParamsType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.sun.java.xml.ns.j2Ee.MethodParamsType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
