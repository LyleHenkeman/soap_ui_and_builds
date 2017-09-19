/*
 * XML Type:  log
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.Log
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log;


/**
 * An XML log(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public interface Log extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Log.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("log2285type");
    
    /**
     * Gets the "monitor" element
     */
    org.wsI.testing.x2003.x03.log.Monitor getMonitor();
    
    /**
     * Sets the "monitor" element
     */
    void setMonitor(org.wsI.testing.x2003.x03.log.Monitor monitor);
    
    /**
     * Appends and returns a new empty "monitor" element
     */
    org.wsI.testing.x2003.x03.log.Monitor addNewMonitor();
    
    /**
     * Gets a List of "messageEntry" elements
     */
    java.util.List<org.wsI.testing.x2003.x03.log.MessageEntry> getMessageEntryList();
    
    /**
     * Gets array of all "messageEntry" elements
     * @deprecated
     */
    org.wsI.testing.x2003.x03.log.MessageEntry[] getMessageEntryArray();
    
    /**
     * Gets ith "messageEntry" element
     */
    org.wsI.testing.x2003.x03.log.MessageEntry getMessageEntryArray(int i);
    
    /**
     * Returns number of "messageEntry" element
     */
    int sizeOfMessageEntryArray();
    
    /**
     * Sets array of all "messageEntry" element
     */
    void setMessageEntryArray(org.wsI.testing.x2003.x03.log.MessageEntry[] messageEntryArray);
    
    /**
     * Sets ith "messageEntry" element
     */
    void setMessageEntryArray(int i, org.wsI.testing.x2003.x03.log.MessageEntry messageEntry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "messageEntry" element
     */
    org.wsI.testing.x2003.x03.log.MessageEntry insertNewMessageEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "messageEntry" element
     */
    org.wsI.testing.x2003.x03.log.MessageEntry addNewMessageEntry();
    
    /**
     * Removes the ith "messageEntry" element
     */
    void removeMessageEntry(int i);
    
    /**
     * Gets the "timestamp" attribute
     */
    java.util.Calendar getTimestamp();
    
    /**
     * Gets (as xml) the "timestamp" attribute
     */
    org.apache.xmlbeans.XmlDateTime xgetTimestamp();
    
    /**
     * True if has "timestamp" attribute
     */
    boolean isSetTimestamp();
    
    /**
     * Sets the "timestamp" attribute
     */
    void setTimestamp(java.util.Calendar timestamp);
    
    /**
     * Sets (as xml) the "timestamp" attribute
     */
    void xsetTimestamp(org.apache.xmlbeans.XmlDateTime timestamp);
    
    /**
     * Unsets the "timestamp" attribute
     */
    void unsetTimestamp();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.wsI.testing.x2003.x03.log.Log newInstance() {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.log.Log parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.log.Log parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.Log parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.log.Log parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.log.Log parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.log.Log) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
