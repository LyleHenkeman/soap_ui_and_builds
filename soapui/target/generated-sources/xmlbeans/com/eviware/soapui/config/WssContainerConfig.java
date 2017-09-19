/*
 * XML Type:  WssContainer
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WssContainerConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML WssContainer(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface WssContainerConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WssContainerConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("wsscontainer8526type");
    
    /**
     * Gets a List of "crypto" elements
     */
    java.util.List<com.eviware.soapui.config.KeyMaterialCryptoConfig> getCryptoList();
    
    /**
     * Gets array of all "crypto" elements
     * @deprecated
     */
    com.eviware.soapui.config.KeyMaterialCryptoConfig[] getCryptoArray();
    
    /**
     * Gets ith "crypto" element
     */
    com.eviware.soapui.config.KeyMaterialCryptoConfig getCryptoArray(int i);
    
    /**
     * Returns number of "crypto" element
     */
    int sizeOfCryptoArray();
    
    /**
     * Sets array of all "crypto" element
     */
    void setCryptoArray(com.eviware.soapui.config.KeyMaterialCryptoConfig[] cryptoArray);
    
    /**
     * Sets ith "crypto" element
     */
    void setCryptoArray(int i, com.eviware.soapui.config.KeyMaterialCryptoConfig crypto);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "crypto" element
     */
    com.eviware.soapui.config.KeyMaterialCryptoConfig insertNewCrypto(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "crypto" element
     */
    com.eviware.soapui.config.KeyMaterialCryptoConfig addNewCrypto();
    
    /**
     * Removes the ith "crypto" element
     */
    void removeCrypto(int i);
    
    /**
     * Gets a List of "incoming" elements
     */
    java.util.List<com.eviware.soapui.config.IncomingWssConfig> getIncomingList();
    
    /**
     * Gets array of all "incoming" elements
     * @deprecated
     */
    com.eviware.soapui.config.IncomingWssConfig[] getIncomingArray();
    
    /**
     * Gets ith "incoming" element
     */
    com.eviware.soapui.config.IncomingWssConfig getIncomingArray(int i);
    
    /**
     * Returns number of "incoming" element
     */
    int sizeOfIncomingArray();
    
    /**
     * Sets array of all "incoming" element
     */
    void setIncomingArray(com.eviware.soapui.config.IncomingWssConfig[] incomingArray);
    
    /**
     * Sets ith "incoming" element
     */
    void setIncomingArray(int i, com.eviware.soapui.config.IncomingWssConfig incoming);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "incoming" element
     */
    com.eviware.soapui.config.IncomingWssConfig insertNewIncoming(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "incoming" element
     */
    com.eviware.soapui.config.IncomingWssConfig addNewIncoming();
    
    /**
     * Removes the ith "incoming" element
     */
    void removeIncoming(int i);
    
    /**
     * Gets a List of "outgoing" elements
     */
    java.util.List<com.eviware.soapui.config.OutgoingWssConfig> getOutgoingList();
    
    /**
     * Gets array of all "outgoing" elements
     * @deprecated
     */
    com.eviware.soapui.config.OutgoingWssConfig[] getOutgoingArray();
    
    /**
     * Gets ith "outgoing" element
     */
    com.eviware.soapui.config.OutgoingWssConfig getOutgoingArray(int i);
    
    /**
     * Returns number of "outgoing" element
     */
    int sizeOfOutgoingArray();
    
    /**
     * Sets array of all "outgoing" element
     */
    void setOutgoingArray(com.eviware.soapui.config.OutgoingWssConfig[] outgoingArray);
    
    /**
     * Sets ith "outgoing" element
     */
    void setOutgoingArray(int i, com.eviware.soapui.config.OutgoingWssConfig outgoing);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outgoing" element
     */
    com.eviware.soapui.config.OutgoingWssConfig insertNewOutgoing(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outgoing" element
     */
    com.eviware.soapui.config.OutgoingWssConfig addNewOutgoing();
    
    /**
     * Removes the ith "outgoing" element
     */
    void removeOutgoing(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.WssContainerConfig newInstance() {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.WssContainerConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.WssContainerConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.WssContainerConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WssContainerConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.WssContainerConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.WssContainerConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
