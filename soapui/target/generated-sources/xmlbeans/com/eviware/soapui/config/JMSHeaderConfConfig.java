/*
 * XML Type:  JMSHeaderConf
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.JMSHeaderConfConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML JMSHeaderConf(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface JMSHeaderConfConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(JMSHeaderConfConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("jmsheaderconf98e1type");
    
    /**
     * Gets the "JMSCorrelationID" attribute
     */
    java.lang.String getJMSCorrelationID();
    
    /**
     * Gets (as xml) the "JMSCorrelationID" attribute
     */
    org.apache.xmlbeans.XmlString xgetJMSCorrelationID();
    
    /**
     * True if has "JMSCorrelationID" attribute
     */
    boolean isSetJMSCorrelationID();
    
    /**
     * Sets the "JMSCorrelationID" attribute
     */
    void setJMSCorrelationID(java.lang.String jmsCorrelationID);
    
    /**
     * Sets (as xml) the "JMSCorrelationID" attribute
     */
    void xsetJMSCorrelationID(org.apache.xmlbeans.XmlString jmsCorrelationID);
    
    /**
     * Unsets the "JMSCorrelationID" attribute
     */
    void unsetJMSCorrelationID();
    
    /**
     * Gets the "JMSReplyTo" attribute
     */
    java.lang.String getJMSReplyTo();
    
    /**
     * Gets (as xml) the "JMSReplyTo" attribute
     */
    org.apache.xmlbeans.XmlString xgetJMSReplyTo();
    
    /**
     * True if has "JMSReplyTo" attribute
     */
    boolean isSetJMSReplyTo();
    
    /**
     * Sets the "JMSReplyTo" attribute
     */
    void setJMSReplyTo(java.lang.String jmsReplyTo);
    
    /**
     * Sets (as xml) the "JMSReplyTo" attribute
     */
    void xsetJMSReplyTo(org.apache.xmlbeans.XmlString jmsReplyTo);
    
    /**
     * Unsets the "JMSReplyTo" attribute
     */
    void unsetJMSReplyTo();
    
    /**
     * Gets the "JMSType" attribute
     */
    java.lang.String getJMSType();
    
    /**
     * Gets (as xml) the "JMSType" attribute
     */
    org.apache.xmlbeans.XmlString xgetJMSType();
    
    /**
     * True if has "JMSType" attribute
     */
    boolean isSetJMSType();
    
    /**
     * Sets the "JMSType" attribute
     */
    void setJMSType(java.lang.String jmsType);
    
    /**
     * Sets (as xml) the "JMSType" attribute
     */
    void xsetJMSType(org.apache.xmlbeans.XmlString jmsType);
    
    /**
     * Unsets the "JMSType" attribute
     */
    void unsetJMSType();
    
    /**
     * Gets the "JMSPriority" attribute
     */
    java.lang.String getJMSPriority();
    
    /**
     * Gets (as xml) the "JMSPriority" attribute
     */
    org.apache.xmlbeans.XmlString xgetJMSPriority();
    
    /**
     * True if has "JMSPriority" attribute
     */
    boolean isSetJMSPriority();
    
    /**
     * Sets the "JMSPriority" attribute
     */
    void setJMSPriority(java.lang.String jmsPriority);
    
    /**
     * Sets (as xml) the "JMSPriority" attribute
     */
    void xsetJMSPriority(org.apache.xmlbeans.XmlString jmsPriority);
    
    /**
     * Unsets the "JMSPriority" attribute
     */
    void unsetJMSPriority();
    
    /**
     * Gets the "JMSDeliveryMode" attribute
     */
    com.eviware.soapui.config.JMSDeliveryModeTypeConfig.Enum getJMSDeliveryMode();
    
    /**
     * Gets (as xml) the "JMSDeliveryMode" attribute
     */
    com.eviware.soapui.config.JMSDeliveryModeTypeConfig xgetJMSDeliveryMode();
    
    /**
     * True if has "JMSDeliveryMode" attribute
     */
    boolean isSetJMSDeliveryMode();
    
    /**
     * Sets the "JMSDeliveryMode" attribute
     */
    void setJMSDeliveryMode(com.eviware.soapui.config.JMSDeliveryModeTypeConfig.Enum jmsDeliveryMode);
    
    /**
     * Sets (as xml) the "JMSDeliveryMode" attribute
     */
    void xsetJMSDeliveryMode(com.eviware.soapui.config.JMSDeliveryModeTypeConfig jmsDeliveryMode);
    
    /**
     * Unsets the "JMSDeliveryMode" attribute
     */
    void unsetJMSDeliveryMode();
    
    /**
     * Gets the "TimeToLive" attribute
     */
    java.lang.String getTimeToLive();
    
    /**
     * Gets (as xml) the "TimeToLive" attribute
     */
    org.apache.xmlbeans.XmlString xgetTimeToLive();
    
    /**
     * True if has "TimeToLive" attribute
     */
    boolean isSetTimeToLive();
    
    /**
     * Sets the "TimeToLive" attribute
     */
    void setTimeToLive(java.lang.String timeToLive);
    
    /**
     * Sets (as xml) the "TimeToLive" attribute
     */
    void xsetTimeToLive(org.apache.xmlbeans.XmlString timeToLive);
    
    /**
     * Unsets the "TimeToLive" attribute
     */
    void unsetTimeToLive();
    
    /**
     * Gets the "durableSubscriptionName" attribute
     */
    java.lang.String getDurableSubscriptionName();
    
    /**
     * Gets (as xml) the "durableSubscriptionName" attribute
     */
    org.apache.xmlbeans.XmlString xgetDurableSubscriptionName();
    
    /**
     * True if has "durableSubscriptionName" attribute
     */
    boolean isSetDurableSubscriptionName();
    
    /**
     * Sets the "durableSubscriptionName" attribute
     */
    void setDurableSubscriptionName(java.lang.String durableSubscriptionName);
    
    /**
     * Sets (as xml) the "durableSubscriptionName" attribute
     */
    void xsetDurableSubscriptionName(org.apache.xmlbeans.XmlString durableSubscriptionName);
    
    /**
     * Unsets the "durableSubscriptionName" attribute
     */
    void unsetDurableSubscriptionName();
    
    /**
     * Gets the "clientID" attribute
     */
    java.lang.String getClientID();
    
    /**
     * Gets (as xml) the "clientID" attribute
     */
    org.apache.xmlbeans.XmlString xgetClientID();
    
    /**
     * True if has "clientID" attribute
     */
    boolean isSetClientID();
    
    /**
     * Sets the "clientID" attribute
     */
    void setClientID(java.lang.String clientID);
    
    /**
     * Sets (as xml) the "clientID" attribute
     */
    void xsetClientID(org.apache.xmlbeans.XmlString clientID);
    
    /**
     * Unsets the "clientID" attribute
     */
    void unsetClientID();
    
    /**
     * Gets the "messageSelector" attribute
     */
    java.lang.String getMessageSelector();
    
    /**
     * Gets (as xml) the "messageSelector" attribute
     */
    org.apache.xmlbeans.XmlString xgetMessageSelector();
    
    /**
     * True if has "messageSelector" attribute
     */
    boolean isSetMessageSelector();
    
    /**
     * Sets the "messageSelector" attribute
     */
    void setMessageSelector(java.lang.String messageSelector);
    
    /**
     * Sets (as xml) the "messageSelector" attribute
     */
    void xsetMessageSelector(org.apache.xmlbeans.XmlString messageSelector);
    
    /**
     * Unsets the "messageSelector" attribute
     */
    void unsetMessageSelector();
    
    /**
     * Gets the "sendAsBytesMessage" attribute
     */
    boolean getSendAsBytesMessage();
    
    /**
     * Gets (as xml) the "sendAsBytesMessage" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSendAsBytesMessage();
    
    /**
     * True if has "sendAsBytesMessage" attribute
     */
    boolean isSetSendAsBytesMessage();
    
    /**
     * Sets the "sendAsBytesMessage" attribute
     */
    void setSendAsBytesMessage(boolean sendAsBytesMessage);
    
    /**
     * Sets (as xml) the "sendAsBytesMessage" attribute
     */
    void xsetSendAsBytesMessage(org.apache.xmlbeans.XmlBoolean sendAsBytesMessage);
    
    /**
     * Unsets the "sendAsBytesMessage" attribute
     */
    void unsetSendAsBytesMessage();
    
    /**
     * Gets the "soapActionAdd" attribute
     */
    boolean getSoapActionAdd();
    
    /**
     * Gets (as xml) the "soapActionAdd" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetSoapActionAdd();
    
    /**
     * True if has "soapActionAdd" attribute
     */
    boolean isSetSoapActionAdd();
    
    /**
     * Sets the "soapActionAdd" attribute
     */
    void setSoapActionAdd(boolean soapActionAdd);
    
    /**
     * Sets (as xml) the "soapActionAdd" attribute
     */
    void xsetSoapActionAdd(org.apache.xmlbeans.XmlBoolean soapActionAdd);
    
    /**
     * Unsets the "soapActionAdd" attribute
     */
    void unsetSoapActionAdd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.JMSHeaderConfConfig newInstance() {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.JMSHeaderConfConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.JMSHeaderConfConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
