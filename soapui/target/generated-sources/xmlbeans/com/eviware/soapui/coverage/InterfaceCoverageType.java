/*
 * XML Type:  InterfaceCoverageType
 * Namespace: http://eviware.com/soapui/coverage
 * Java type: com.eviware.soapui.coverage.InterfaceCoverageType
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.coverage;


/**
 * An XML InterfaceCoverageType(@http://eviware.com/soapui/coverage).
 *
 * This is a complex type.
 */
public interface InterfaceCoverageType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InterfaceCoverageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("interfacecoveragetypebe6dtype");
    
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
     * Gets a List of "operation" elements
     */
    java.util.List<com.eviware.soapui.coverage.OperationCoverageType> getOperationList();
    
    /**
     * Gets array of all "operation" elements
     * @deprecated
     */
    com.eviware.soapui.coverage.OperationCoverageType[] getOperationArray();
    
    /**
     * Gets ith "operation" element
     */
    com.eviware.soapui.coverage.OperationCoverageType getOperationArray(int i);
    
    /**
     * Returns number of "operation" element
     */
    int sizeOfOperationArray();
    
    /**
     * Sets array of all "operation" element
     */
    void setOperationArray(com.eviware.soapui.coverage.OperationCoverageType[] operationArray);
    
    /**
     * Sets ith "operation" element
     */
    void setOperationArray(int i, com.eviware.soapui.coverage.OperationCoverageType operation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "operation" element
     */
    com.eviware.soapui.coverage.OperationCoverageType insertNewOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "operation" element
     */
    com.eviware.soapui.coverage.OperationCoverageType addNewOperation();
    
    /**
     * Removes the ith "operation" element
     */
    void removeOperation(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.coverage.InterfaceCoverageType newInstance() {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.coverage.InterfaceCoverageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.coverage.InterfaceCoverageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
