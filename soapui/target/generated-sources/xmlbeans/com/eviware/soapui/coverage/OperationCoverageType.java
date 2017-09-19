/*
 * XML Type:  OperationCoverageType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.OperationCoverageType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage;


/**
 * An XML OperationCoverageType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public interface OperationCoverageType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OperationCoverageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("operationcoveragetype6c7ftype");
    
    /**
     * Gets the "interfaceName" element
     */
    java.lang.String getInterfaceName();
    
    /**
     * Gets (as xml) the "interfaceName" element
     */
    org.apache.xmlbeans.XmlString xgetInterfaceName();
    
    /**
     * Sets the "interfaceName" element
     */
    void setInterfaceName(java.lang.String interfaceName);
    
    /**
     * Sets (as xml) the "interfaceName" element
     */
    void xsetInterfaceName(org.apache.xmlbeans.XmlString interfaceName);
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "ref" element
     */
    java.lang.String getRef();
    
    /**
     * Gets (as xml) the "ref" element
     */
    org.apache.xmlbeans.XmlString xgetRef();
    
    /**
     * Sets the "ref" element
     */
    void setRef(java.lang.String ref);
    
    /**
     * Sets (as xml) the "ref" element
     */
    void xsetRef(org.apache.xmlbeans.XmlString ref);
    
    /**
     * Gets the "contractCoverage" element
     */
    com.eviware.soapui.coverage.CoverageType getContractCoverage();
    
    /**
     * Sets the "contractCoverage" element
     */
    void setContractCoverage(com.eviware.soapui.coverage.CoverageType contractCoverage);
    
    /**
     * Appends and returns a new empty "contractCoverage" element
     */
    com.eviware.soapui.coverage.CoverageType addNewContractCoverage();
    
    /**
     * Gets a List of "message" elements
     */
    java.util.List<com.eviware.soapui.coverage.MessageType> getMessageList();
    
    /**
     * Gets array of all "message" elements
     * @deprecated
     */
    com.eviware.soapui.coverage.MessageType[] getMessageArray();
    
    /**
     * Gets ith "message" element
     */
    com.eviware.soapui.coverage.MessageType getMessageArray(int i);
    
    /**
     * Returns number of "message" element
     */
    int sizeOfMessageArray();
    
    /**
     * Sets array of all "message" element
     */
    void setMessageArray(com.eviware.soapui.coverage.MessageType[] messageArray);
    
    /**
     * Sets ith "message" element
     */
    void setMessageArray(int i, com.eviware.soapui.coverage.MessageType message);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "message" element
     */
    com.eviware.soapui.coverage.MessageType insertNewMessage(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "message" element
     */
    com.eviware.soapui.coverage.MessageType addNewMessage();
    
    /**
     * Removes the ith "message" element
     */
    void removeMessage(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.coverage.OperationCoverageType newInstance() {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.coverage.OperationCoverageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.coverage.OperationCoverageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.coverage.OperationCoverageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.coverage.OperationCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
