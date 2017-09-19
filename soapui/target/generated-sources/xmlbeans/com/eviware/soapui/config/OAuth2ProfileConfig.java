/*
 * XML Type:  OAuth2Profile
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OAuth2ProfileConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config;


/**
 * An XML OAuth2Profile(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public interface OAuth2ProfileConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OAuth2ProfileConfig.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5D1810259B92CCC14368B111486E2FBA").resolveHandle("oauth2profile3cb4type");
    
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
     * Gets the "clientID" element
     */
    java.lang.String getClientID();
    
    /**
     * Gets (as xml) the "clientID" element
     */
    org.apache.xmlbeans.XmlString xgetClientID();
    
    /**
     * Sets the "clientID" element
     */
    void setClientID(java.lang.String clientID);
    
    /**
     * Sets (as xml) the "clientID" element
     */
    void xsetClientID(org.apache.xmlbeans.XmlString clientID);
    
    /**
     * Gets the "clientSecret" element
     */
    java.lang.String getClientSecret();
    
    /**
     * Gets (as xml) the "clientSecret" element
     */
    org.apache.xmlbeans.XmlString xgetClientSecret();
    
    /**
     * Sets the "clientSecret" element
     */
    void setClientSecret(java.lang.String clientSecret);
    
    /**
     * Sets (as xml) the "clientSecret" element
     */
    void xsetClientSecret(org.apache.xmlbeans.XmlString clientSecret);
    
    /**
     * Gets the "authorizationURI" element
     */
    java.lang.String getAuthorizationURI();
    
    /**
     * Gets (as xml) the "authorizationURI" element
     */
    org.apache.xmlbeans.XmlString xgetAuthorizationURI();
    
    /**
     * Sets the "authorizationURI" element
     */
    void setAuthorizationURI(java.lang.String authorizationURI);
    
    /**
     * Sets (as xml) the "authorizationURI" element
     */
    void xsetAuthorizationURI(org.apache.xmlbeans.XmlString authorizationURI);
    
    /**
     * Gets the "accessTokenURI" element
     */
    java.lang.String getAccessTokenURI();
    
    /**
     * Gets (as xml) the "accessTokenURI" element
     */
    org.apache.xmlbeans.XmlString xgetAccessTokenURI();
    
    /**
     * Sets the "accessTokenURI" element
     */
    void setAccessTokenURI(java.lang.String accessTokenURI);
    
    /**
     * Sets (as xml) the "accessTokenURI" element
     */
    void xsetAccessTokenURI(org.apache.xmlbeans.XmlString accessTokenURI);
    
    /**
     * Gets the "redirectURI" element
     */
    java.lang.String getRedirectURI();
    
    /**
     * Gets (as xml) the "redirectURI" element
     */
    org.apache.xmlbeans.XmlString xgetRedirectURI();
    
    /**
     * Sets the "redirectURI" element
     */
    void setRedirectURI(java.lang.String redirectURI);
    
    /**
     * Sets (as xml) the "redirectURI" element
     */
    void xsetRedirectURI(org.apache.xmlbeans.XmlString redirectURI);
    
    /**
     * Gets the "accessToken" element
     */
    java.lang.String getAccessToken();
    
    /**
     * Gets (as xml) the "accessToken" element
     */
    org.apache.xmlbeans.XmlString xgetAccessToken();
    
    /**
     * Sets the "accessToken" element
     */
    void setAccessToken(java.lang.String accessToken);
    
    /**
     * Sets (as xml) the "accessToken" element
     */
    void xsetAccessToken(org.apache.xmlbeans.XmlString accessToken);
    
    /**
     * Gets the "accessTokenPosition" element
     */
    com.eviware.soapui.config.AccessTokenPositionConfig.Enum getAccessTokenPosition();
    
    /**
     * Gets (as xml) the "accessTokenPosition" element
     */
    com.eviware.soapui.config.AccessTokenPositionConfig xgetAccessTokenPosition();
    
    /**
     * Sets the "accessTokenPosition" element
     */
    void setAccessTokenPosition(com.eviware.soapui.config.AccessTokenPositionConfig.Enum accessTokenPosition);
    
    /**
     * Sets (as xml) the "accessTokenPosition" element
     */
    void xsetAccessTokenPosition(com.eviware.soapui.config.AccessTokenPositionConfig accessTokenPosition);
    
    /**
     * Gets the "oAuth2Flow" element
     */
    com.eviware.soapui.config.OAuth2FlowConfig.Enum getOAuth2Flow();
    
    /**
     * Gets (as xml) the "oAuth2Flow" element
     */
    com.eviware.soapui.config.OAuth2FlowConfig xgetOAuth2Flow();
    
    /**
     * Sets the "oAuth2Flow" element
     */
    void setOAuth2Flow(com.eviware.soapui.config.OAuth2FlowConfig.Enum oAuth2Flow);
    
    /**
     * Sets (as xml) the "oAuth2Flow" element
     */
    void xsetOAuth2Flow(com.eviware.soapui.config.OAuth2FlowConfig oAuth2Flow);
    
    /**
     * Gets the "refreshAccessTokenMethod" element
     */
    com.eviware.soapui.config.RefreshAccessTokenMethodConfig.Enum getRefreshAccessTokenMethod();
    
    /**
     * Gets (as xml) the "refreshAccessTokenMethod" element
     */
    com.eviware.soapui.config.RefreshAccessTokenMethodConfig xgetRefreshAccessTokenMethod();
    
    /**
     * Sets the "refreshAccessTokenMethod" element
     */
    void setRefreshAccessTokenMethod(com.eviware.soapui.config.RefreshAccessTokenMethodConfig.Enum refreshAccessTokenMethod);
    
    /**
     * Sets (as xml) the "refreshAccessTokenMethod" element
     */
    void xsetRefreshAccessTokenMethod(com.eviware.soapui.config.RefreshAccessTokenMethodConfig refreshAccessTokenMethod);
    
    /**
     * Gets the "refreshToken" element
     */
    java.lang.String getRefreshToken();
    
    /**
     * Gets (as xml) the "refreshToken" element
     */
    org.apache.xmlbeans.XmlString xgetRefreshToken();
    
    /**
     * Sets the "refreshToken" element
     */
    void setRefreshToken(java.lang.String refreshToken);
    
    /**
     * Sets (as xml) the "refreshToken" element
     */
    void xsetRefreshToken(org.apache.xmlbeans.XmlString refreshToken);
    
    /**
     * Gets the "scope" element
     */
    java.lang.String getScope();
    
    /**
     * Gets (as xml) the "scope" element
     */
    org.apache.xmlbeans.XmlString xgetScope();
    
    /**
     * Sets the "scope" element
     */
    void setScope(java.lang.String scope);
    
    /**
     * Sets (as xml) the "scope" element
     */
    void xsetScope(org.apache.xmlbeans.XmlString scope);
    
    /**
     * Gets the "accessTokenStatus" element
     */
    com.eviware.soapui.config.AccessTokenStatusConfig.Enum getAccessTokenStatus();
    
    /**
     * Gets (as xml) the "accessTokenStatus" element
     */
    com.eviware.soapui.config.AccessTokenStatusConfig xgetAccessTokenStatus();
    
    /**
     * Sets the "accessTokenStatus" element
     */
    void setAccessTokenStatus(com.eviware.soapui.config.AccessTokenStatusConfig.Enum accessTokenStatus);
    
    /**
     * Sets (as xml) the "accessTokenStatus" element
     */
    void xsetAccessTokenStatus(com.eviware.soapui.config.AccessTokenStatusConfig accessTokenStatus);
    
    /**
     * Gets the "accessTokenStartingStatus" element
     */
    com.eviware.soapui.config.AccessTokenStatusConfig.Enum getAccessTokenStartingStatus();
    
    /**
     * Gets (as xml) the "accessTokenStartingStatus" element
     */
    com.eviware.soapui.config.AccessTokenStatusConfig xgetAccessTokenStartingStatus();
    
    /**
     * Sets the "accessTokenStartingStatus" element
     */
    void setAccessTokenStartingStatus(com.eviware.soapui.config.AccessTokenStatusConfig.Enum accessTokenStartingStatus);
    
    /**
     * Sets (as xml) the "accessTokenStartingStatus" element
     */
    void xsetAccessTokenStartingStatus(com.eviware.soapui.config.AccessTokenStatusConfig accessTokenStartingStatus);
    
    /**
     * Gets the "accessTokenExpirationTime" element
     */
    long getAccessTokenExpirationTime();
    
    /**
     * Gets (as xml) the "accessTokenExpirationTime" element
     */
    org.apache.xmlbeans.XmlLong xgetAccessTokenExpirationTime();
    
    /**
     * Sets the "accessTokenExpirationTime" element
     */
    void setAccessTokenExpirationTime(long accessTokenExpirationTime);
    
    /**
     * Sets (as xml) the "accessTokenExpirationTime" element
     */
    void xsetAccessTokenExpirationTime(org.apache.xmlbeans.XmlLong accessTokenExpirationTime);
    
    /**
     * Gets the "accessTokenIssuedTime" element
     */
    long getAccessTokenIssuedTime();
    
    /**
     * Gets (as xml) the "accessTokenIssuedTime" element
     */
    org.apache.xmlbeans.XmlLong xgetAccessTokenIssuedTime();
    
    /**
     * Sets the "accessTokenIssuedTime" element
     */
    void setAccessTokenIssuedTime(long accessTokenIssuedTime);
    
    /**
     * Sets (as xml) the "accessTokenIssuedTime" element
     */
    void xsetAccessTokenIssuedTime(org.apache.xmlbeans.XmlLong accessTokenIssuedTime);
    
    /**
     * Gets the "javaScripts" element
     */
    com.eviware.soapui.config.StringListConfig getJavaScripts();
    
    /**
     * Sets the "javaScripts" element
     */
    void setJavaScripts(com.eviware.soapui.config.StringListConfig javaScripts);
    
    /**
     * Appends and returns a new empty "javaScripts" element
     */
    com.eviware.soapui.config.StringListConfig addNewJavaScripts();
    
    /**
     * Gets the "manualAccessTokenExpirationTime" element
     */
    java.lang.String getManualAccessTokenExpirationTime();
    
    /**
     * Gets (as xml) the "manualAccessTokenExpirationTime" element
     */
    org.apache.xmlbeans.XmlString xgetManualAccessTokenExpirationTime();
    
    /**
     * True if has "manualAccessTokenExpirationTime" element
     */
    boolean isSetManualAccessTokenExpirationTime();
    
    /**
     * Sets the "manualAccessTokenExpirationTime" element
     */
    void setManualAccessTokenExpirationTime(java.lang.String manualAccessTokenExpirationTime);
    
    /**
     * Sets (as xml) the "manualAccessTokenExpirationTime" element
     */
    void xsetManualAccessTokenExpirationTime(org.apache.xmlbeans.XmlString manualAccessTokenExpirationTime);
    
    /**
     * Unsets the "manualAccessTokenExpirationTime" element
     */
    void unsetManualAccessTokenExpirationTime();
    
    /**
     * Gets the "useManualAccessTokenExpirationTime" element
     */
    boolean getUseManualAccessTokenExpirationTime();
    
    /**
     * Gets (as xml) the "useManualAccessTokenExpirationTime" element
     */
    org.apache.xmlbeans.XmlBoolean xgetUseManualAccessTokenExpirationTime();
    
    /**
     * Sets the "useManualAccessTokenExpirationTime" element
     */
    void setUseManualAccessTokenExpirationTime(boolean useManualAccessTokenExpirationTime);
    
    /**
     * Sets (as xml) the "useManualAccessTokenExpirationTime" element
     */
    void xsetUseManualAccessTokenExpirationTime(org.apache.xmlbeans.XmlBoolean useManualAccessTokenExpirationTime);
    
    /**
     * Gets the "manualAccessTokenExpirationTimeUnit" element
     */
    com.eviware.soapui.config.TimeUnitConfig.Enum getManualAccessTokenExpirationTimeUnit();
    
    /**
     * Gets (as xml) the "manualAccessTokenExpirationTimeUnit" element
     */
    com.eviware.soapui.config.TimeUnitConfig xgetManualAccessTokenExpirationTimeUnit();
    
    /**
     * Sets the "manualAccessTokenExpirationTimeUnit" element
     */
    void setManualAccessTokenExpirationTimeUnit(com.eviware.soapui.config.TimeUnitConfig.Enum manualAccessTokenExpirationTimeUnit);
    
    /**
     * Sets (as xml) the "manualAccessTokenExpirationTimeUnit" element
     */
    void xsetManualAccessTokenExpirationTimeUnit(com.eviware.soapui.config.TimeUnitConfig manualAccessTokenExpirationTimeUnit);
    
    /**
     * Gets the "resourceOwnerName" element
     */
    java.lang.String getResourceOwnerName();
    
    /**
     * Gets (as xml) the "resourceOwnerName" element
     */
    org.apache.xmlbeans.XmlString xgetResourceOwnerName();
    
    /**
     * Sets the "resourceOwnerName" element
     */
    void setResourceOwnerName(java.lang.String resourceOwnerName);
    
    /**
     * Sets (as xml) the "resourceOwnerName" element
     */
    void xsetResourceOwnerName(org.apache.xmlbeans.XmlString resourceOwnerName);
    
    /**
     * Gets the "resourceOwnerPassword" element
     */
    java.lang.String getResourceOwnerPassword();
    
    /**
     * Gets (as xml) the "resourceOwnerPassword" element
     */
    org.apache.xmlbeans.XmlString xgetResourceOwnerPassword();
    
    /**
     * Sets the "resourceOwnerPassword" element
     */
    void setResourceOwnerPassword(java.lang.String resourceOwnerPassword);
    
    /**
     * Sets (as xml) the "resourceOwnerPassword" element
     */
    void xsetResourceOwnerPassword(org.apache.xmlbeans.XmlString resourceOwnerPassword);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.eviware.soapui.config.OAuth2ProfileConfig newInstance() {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.eviware.soapui.config.OAuth2ProfileConfig parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.eviware.soapui.config.OAuth2ProfileConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
