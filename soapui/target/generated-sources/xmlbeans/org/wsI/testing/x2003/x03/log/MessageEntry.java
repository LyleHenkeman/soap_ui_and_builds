/*
 * XML Type:  messageEntry
 * Namespace: http://www.ws-i.org/testing/2003/03/log/
 * Java type: org.wsI.testing.x2003.x03.log.MessageEntry
 *
 * Automatically generated - do not modify.
 */
package org.wsI.testing.x2003.x03.log;


/**
 * An XML messageEntry(@http://www.ws-i.org/testing/2003/03/log/).
 *
 * This is a complex type.
 */
public interface MessageEntry extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageEntry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("messageentry954ctype");
    
    /**
     * Gets the "messageContent" element
     */
    org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent getMessageContent();
    
    /**
     * True if has "messageContent" element
     */
    boolean isSetMessageContent();
    
    /**
     * Sets the "messageContent" element
     */
    void setMessageContent(org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent messageContent);
    
    /**
     * Appends and returns a new empty "messageContent" element
     */
    org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent addNewMessageContent();
    
    /**
     * Unsets the "messageContent" element
     */
    void unsetMessageContent();
    
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
     * Gets the "conversationID" attribute
     */
    java.lang.String getConversationID();
    
    /**
     * Gets (as xml) the "conversationID" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetConversationID();
    
    /**
     * True if has "conversationID" attribute
     */
    boolean isSetConversationID();
    
    /**
     * Sets the "conversationID" attribute
     */
    void setConversationID(java.lang.String conversationID);
    
    /**
     * Sets (as xml) the "conversationID" attribute
     */
    void xsetConversationID(org.apache.xmlbeans.XmlNMTOKEN conversationID);
    
    /**
     * Unsets the "conversationID" attribute
     */
    void unsetConversationID();
    
    /**
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlString xgetID();
    
    /**
     * True if has "ID" attribute
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlString id);
    
    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
    
    /**
     * An XML messageContent(@http://www.ws-i.org/testing/2003/03/log/).
     *
     * This is an atomic type that is a restriction of org.wsI.testing.x2003.x03.log.MessageEntry$MessageContent.
     */
    public interface MessageContent extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageContent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("messagecontent385aelemtype");
        
        /**
         * Gets the "BOM" attribute
         */
        long getBOM();
        
        /**
         * Gets (as xml) the "BOM" attribute
         */
        org.apache.xmlbeans.XmlUnsignedInt xgetBOM();
        
        /**
         * True if has "BOM" attribute
         */
        boolean isSetBOM();
        
        /**
         * Sets the "BOM" attribute
         */
        void setBOM(long bom);
        
        /**
         * Sets (as xml) the "BOM" attribute
         */
        void xsetBOM(org.apache.xmlbeans.XmlUnsignedInt bom);
        
        /**
         * Unsets the "BOM" attribute
         */
        void unsetBOM();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent newInstance() {
              return (org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.wsI.testing.x2003.x03.log.MessageEntry.MessageContent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.wsI.testing.x2003.x03.log.MessageEntry newInstance() {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        /** @deprecated No need to be able to create instances of abstract types */
        public static org.wsI.testing.x2003.x03.log.MessageEntry newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.wsI.testing.x2003.x03.log.MessageEntry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.wsI.testing.x2003.x03.log.MessageEntry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
