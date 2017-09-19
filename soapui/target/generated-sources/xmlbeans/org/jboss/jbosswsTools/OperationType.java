/*
 * XML Type:  operationType
 * Namespace: http://www.jboss.org/jbossws-tools
 * Java type: org.jboss.jbosswsTools.OperationType
 *
 * Automatically generated - do not modify.
 */
package org.jboss.jbosswsTools;


/**
 * An XML operationType(@http://www.jboss.org/jbossws-tools).
 *
 * This is a complex type.
 */
public interface OperationType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("operationtype935etype");
    
    /**
     * Gets a List of "parameter" elements
     */
    java.util.List<org.jboss.jbosswsTools.ParameterType> getParameterList();
    
    /**
     * Gets array of all "parameter" elements
     * @deprecated
     */
    org.jboss.jbosswsTools.ParameterType[] getParameterArray();
    
    /**
     * Gets ith "parameter" element
     */
    org.jboss.jbosswsTools.ParameterType getParameterArray(int i);
    
    /**
     * Returns number of "parameter" element
     */
    int sizeOfParameterArray();
    
    /**
     * Sets array of all "parameter" element
     */
    void setParameterArray(org.jboss.jbosswsTools.ParameterType[] parameterArray);
    
    /**
     * Sets ith "parameter" element
     */
    void setParameterArray(int i, org.jboss.jbosswsTools.ParameterType parameter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "parameter" element
     */
    org.jboss.jbosswsTools.ParameterType insertNewParameter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "parameter" element
     */
    org.jboss.jbosswsTools.ParameterType addNewParameter();
    
    /**
     * Removes the ith "parameter" element
     */
    void removeParameter(int i);
    
    /**
     * Gets the "name" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(org.apache.xmlbeans.XmlAnySimpleType name);
    
    /**
     * Appends and returns a new empty "name" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewName();
    
    /**
     * Gets the "one-way" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getOneWay();
    
    /**
     * True if has "one-way" attribute
     */
    boolean isSetOneWay();
    
    /**
     * Sets the "one-way" attribute
     */
    void setOneWay(org.apache.xmlbeans.XmlAnySimpleType oneWay);
    
    /**
     * Appends and returns a new empty "one-way" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewOneWay();
    
    /**
     * Unsets the "one-way" attribute
     */
    void unsetOneWay();
    
    /**
     * Gets the "return-xml-name" attribute
     */
    javax.xml.namespace.QName getReturnXmlName();
    
    /**
     * Gets (as xml) the "return-xml-name" attribute
     */
    org.apache.xmlbeans.XmlQName xgetReturnXmlName();
    
    /**
     * True if has "return-xml-name" attribute
     */
    boolean isSetReturnXmlName();
    
    /**
     * Sets the "return-xml-name" attribute
     */
    void setReturnXmlName(javax.xml.namespace.QName returnXmlName);
    
    /**
     * Sets (as xml) the "return-xml-name" attribute
     */
    void xsetReturnXmlName(org.apache.xmlbeans.XmlQName returnXmlName);
    
    /**
     * Unsets the "return-xml-name" attribute
     */
    void unsetReturnXmlName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.jboss.jbosswsTools.OperationType newInstance() {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.jboss.jbosswsTools.OperationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.jboss.jbosswsTools.OperationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.jboss.jbosswsTools.OperationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.OperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.jboss.jbosswsTools.OperationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.jboss.jbosswsTools.OperationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
