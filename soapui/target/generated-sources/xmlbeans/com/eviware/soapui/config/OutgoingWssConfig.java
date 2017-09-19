/*
 * XML Type:  OutgoingWss
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OutgoingWssConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML OutgoingWss(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface OutgoingWssConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OutgoingWssConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("outgoingwss9d57type");
    
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
     * Gets the "username" element
     */
    java.lang.String getUsername();
    
    /**
     * Gets (as xml) the "username" element
     */
    org.apache.xmlbeans.XmlString xgetUsername();
    
    /**
     * True if has "username" element
     */
    boolean isSetUsername();
    
    /**
     * Sets the "username" element
     */
    void setUsername(java.lang.String username);
    
    /**
     * Sets (as xml) the "username" element
     */
    void xsetUsername(org.apache.xmlbeans.XmlString username);
    
    /**
     * Unsets the "username" element
     */
    void unsetUsername();
    
    /**
     * Gets the "password" element
     */
    java.lang.String getPassword();
    
    /**
     * Gets (as xml) the "password" element
     */
    org.apache.xmlbeans.XmlString xgetPassword();
    
    /**
     * True if has "password" element
     */
    boolean isSetPassword();
    
    /**
     * Sets the "password" element
     */
    void setPassword(java.lang.String password);
    
    /**
     * Sets (as xml) the "password" element
     */
    void xsetPassword(org.apache.xmlbeans.XmlString password);
    
    /**
     * Unsets the "password" element
     */
    void unsetPassword();
    
    /**
     * Gets a List of "entry" elements
     */
    java.util.List<com.eviware.soapui.config.WSSEntryConfig> getEntryList();
    
    /**
     * Gets array of all "entry" elements
     * @deprecated
     */
    com.eviware.soapui.config.WSSEntryConfig[] getEntryArray();
    
    /**
     * Gets ith "entry" element
     */
    com.eviware.soapui.config.WSSEntryConfig getEntryArray(int i);
    
    /**
     * Returns number of "entry" element
     */
    int sizeOfEntryArray();
    
    /**
     * Sets array of all "entry" element
     */
    void setEntryArray(com.eviware.soapui.config.WSSEntryConfig[] entryArray);
    
    /**
     * Sets ith "entry" element
     */
    void setEntryArray(int i, com.eviware.soapui.config.WSSEntryConfig entry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    com.eviware.soapui.config.WSSEntryConfig insertNewEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    com.eviware.soapui.config.WSSEntryConfig addNewEntry();
    
    /**
     * Removes the ith "entry" element
     */
    void removeEntry(int i);
    
    /**
     * Gets the "enableSignatureConfirmation" attribute
     */
    boolean getEnableSignatureConfirmation();
    
    /**
     * Gets (as xml) the "enableSignatureConfirmation" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEnableSignatureConfirmation();
    
    /**
     * True if has "enableSignatureConfirmation" attribute
     */
    boolean isSetEnableSignatureConfirmation();
    
    /**
     * Sets the "enableSignatureConfirmation" attribute
     */
    void setEnableSignatureConfirmation(boolean enableSignatureConfirmation);
    
    /**
     * Sets (as xml) the "enableSignatureConfirmation" attribute
     */
    void xsetEnableSignatureConfirmation(org.apache.xmlbeans.XmlBoolean enableSignatureConfirmation);
    
    /**
     * Unsets the "enableSignatureConfirmation" attribute
     */
    void unsetEnableSignatureConfirmation();
    
    /**
     * Gets the "precisionInMilliSeconds" attribute
     */
    boolean getPrecisionInMilliSeconds();
    
    /**
     * Gets (as xml) the "precisionInMilliSeconds" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetPrecisionInMilliSeconds();
    
    /**
     * True if has "precisionInMilliSeconds" attribute
     */
    boolean isSetPrecisionInMilliSeconds();
    
    /**
     * Sets the "precisionInMilliSeconds" attribute
     */
    void setPrecisionInMilliSeconds(boolean precisionInMilliSeconds);
    
    /**
     * Sets (as xml) the "precisionInMilliSeconds" attribute
     */
    void xsetPrecisionInMilliSeconds(org.apache.xmlbeans.XmlBoolean precisionInMilliSeconds);
    
    /**
     * Unsets the "precisionInMilliSeconds" attribute
     */
    void unsetPrecisionInMilliSeconds();
    
    /**
     * Gets the "timeStampScript" attribute
     */
    boolean getTimeStampScript();
    
    /**
     * Gets (as xml) the "timeStampScript" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetTimeStampScript();
    
    /**
     * True if has "timeStampScript" attribute
     */
    boolean isSetTimeStampScript();
    
    /**
     * Sets the "timeStampScript" attribute
     */
    void setTimeStampScript(boolean timeStampScript);
    
    /**
     * Sets (as xml) the "timeStampScript" attribute
     */
    void xsetTimeStampScript(org.apache.xmlbeans.XmlBoolean timeStampScript);
    
    /**
     * Unsets the "timeStampScript" attribute
     */
    void unsetTimeStampScript();
    
    /**
     * Gets the "wsiBspCompliant" attribute
     */
    boolean getWsiBspCompliant();
    
    /**
     * Gets (as xml) the "wsiBspCompliant" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetWsiBspCompliant();
    
    /**
     * True if has "wsiBspCompliant" attribute
     */
    boolean isSetWsiBspCompliant();
    
    /**
     * Sets the "wsiBspCompliant" attribute
     */
    void setWsiBspCompliant(boolean wsiBspCompliant);
    
    /**
     * Sets (as xml) the "wsiBspCompliant" attribute
     */
    void xsetWsiBspCompliant(org.apache.xmlbeans.XmlBoolean wsiBspCompliant);
    
    /**
     * Unsets the "wsiBspCompliant" attribute
     */
    void unsetWsiBspCompliant();
    
    /**
     * Gets the "actor" attribute
     */
    java.lang.String getActor();
    
    /**
     * Gets (as xml) the "actor" attribute
     */
    org.apache.xmlbeans.XmlString xgetActor();
    
    /**
     * True if has "actor" attribute
     */
    boolean isSetActor();
    
    /**
     * Sets the "actor" attribute
     */
    void setActor(java.lang.String actor);
    
    /**
     * Sets (as xml) the "actor" attribute
     */
    void xsetActor(org.apache.xmlbeans.XmlString actor);
    
    /**
     * Unsets the "actor" attribute
     */
    void unsetActor();
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    boolean getMustUnderstand();
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMustUnderstand();
    
    /**
     * True if has "mustUnderstand" attribute
     */
    boolean isSetMustUnderstand();
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    void setMustUnderstand(boolean mustUnderstand);
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    void xsetMustUnderstand(org.apache.xmlbeans.XmlBoolean mustUnderstand);
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    void unsetMustUnderstand();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.OutgoingWssConfig newInstance() {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.OutgoingWssConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.OutgoingWssConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.OutgoingWssConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.OutgoingWssConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
