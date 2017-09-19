/*
 * XML Type:  tBindingOperation
 * Namespace: http://schemas.xmlsoap.org/wsdl/
 * Java type: org.xmlsoap.schemas.wsdl.TBindingOperation
 *
 * Automatically generated - do not modify.
 */
package org.xmlsoap.schemas.wsdl;


/**
 * An XML tBindingOperation(@http://schemas.xmlsoap.org/wsdl/).
 *
 * This is a complex type.
 */
public interface TBindingOperation extends org.xmlsoap.schemas.wsdl.TExtensibleDocumented
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TBindingOperation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("tbindingoperation64f9type");
    
    /**
     * Gets the "input" element
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationMessage getInput();
    
    /**
     * True if has "input" element
     */
    boolean isSetInput();
    
    /**
     * Sets the "input" element
     */
    void setInput(org.xmlsoap.schemas.wsdl.TBindingOperationMessage input);
    
    /**
     * Appends and returns a new empty "input" element
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationMessage addNewInput();
    
    /**
     * Unsets the "input" element
     */
    void unsetInput();
    
    /**
     * Gets the "output" element
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationMessage getOutput();
    
    /**
     * True if has "output" element
     */
    boolean isSetOutput();
    
    /**
     * Sets the "output" element
     */
    void setOutput(org.xmlsoap.schemas.wsdl.TBindingOperationMessage output);
    
    /**
     * Appends and returns a new empty "output" element
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationMessage addNewOutput();
    
    /**
     * Unsets the "output" element
     */
    void unsetOutput();
    
    /**
     * Gets a List of "fault" elements
     */
    java.util.List<org.xmlsoap.schemas.wsdl.TBindingOperationFault> getFaultList();
    
    /**
     * Gets array of all "fault" elements
     * @deprecated
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationFault[] getFaultArray();
    
    /**
     * Gets ith "fault" element
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationFault getFaultArray(int i);
    
    /**
     * Returns number of "fault" element
     */
    int sizeOfFaultArray();
    
    /**
     * Sets array of all "fault" element
     */
    void setFaultArray(org.xmlsoap.schemas.wsdl.TBindingOperationFault[] faultArray);
    
    /**
     * Sets ith "fault" element
     */
    void setFaultArray(int i, org.xmlsoap.schemas.wsdl.TBindingOperationFault fault);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "fault" element
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationFault insertNewFault(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "fault" element
     */
    org.xmlsoap.schemas.wsdl.TBindingOperationFault addNewFault();
    
    /**
     * Removes the ith "fault" element
     */
    void removeFault(int i);
    
    /**
     * Gets the "name" attribute
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetName();
    
    /**
     * Sets the "name" attribute
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" attribute
     */
    void xsetName(org.apache.xmlbeans.XmlNCName name);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.xmlsoap.schemas.wsdl.TBindingOperation newInstance() {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.xmlsoap.schemas.wsdl.TBindingOperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.xmlsoap.schemas.wsdl.TBindingOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
