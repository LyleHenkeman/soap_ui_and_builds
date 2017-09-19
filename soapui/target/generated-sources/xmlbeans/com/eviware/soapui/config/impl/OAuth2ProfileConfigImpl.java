/*
 * XML Type:  OAuth2Profile
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OAuth2ProfileConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML OAuth2Profile(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class OAuth2ProfileConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.OAuth2ProfileConfig
{
    private static final long serialVersionUID = 1L;
    
    public OAuth2ProfileConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName CLIENTID$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "clientID");
    private static final javax.xml.namespace.QName CLIENTSECRET$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "clientSecret");
    private static final javax.xml.namespace.QName AUTHORIZATIONURI$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "authorizationURI");
    private static final javax.xml.namespace.QName ACCESSTOKENURI$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenURI");
    private static final javax.xml.namespace.QName REDIRECTURI$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "redirectURI");
    private static final javax.xml.namespace.QName ACCESSTOKEN$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessToken");
    private static final javax.xml.namespace.QName ACCESSTOKENPOSITION$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenPosition");
    private static final javax.xml.namespace.QName OAUTH2FLOW$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "oAuth2Flow");
    private static final javax.xml.namespace.QName REFRESHACCESSTOKENMETHOD$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "refreshAccessTokenMethod");
    private static final javax.xml.namespace.QName REFRESHTOKEN$20 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "refreshToken");
    private static final javax.xml.namespace.QName SCOPE$22 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "scope");
    private static final javax.xml.namespace.QName ACCESSTOKENSTATUS$24 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenStatus");
    private static final javax.xml.namespace.QName ACCESSTOKENSTARTINGSTATUS$26 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenStartingStatus");
    private static final javax.xml.namespace.QName ACCESSTOKENEXPIRATIONTIME$28 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenExpirationTime");
    private static final javax.xml.namespace.QName ACCESSTOKENISSUEDTIME$30 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenIssuedTime");
    private static final javax.xml.namespace.QName JAVASCRIPTS$32 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "javaScripts");
    private static final javax.xml.namespace.QName MANUALACCESSTOKENEXPIRATIONTIME$34 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "manualAccessTokenExpirationTime");
    private static final javax.xml.namespace.QName USEMANUALACCESSTOKENEXPIRATIONTIME$36 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "useManualAccessTokenExpirationTime");
    private static final javax.xml.namespace.QName MANUALACCESSTOKENEXPIRATIONTIMEUNIT$38 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "manualAccessTokenExpirationTimeUnit");
    private static final javax.xml.namespace.QName RESOURCEOWNERNAME$40 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "resourceOwnerName");
    private static final javax.xml.namespace.QName RESOURCEOWNERPASSWORD$42 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "resourceOwnerPassword");
    
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "clientID" element
     */
    public java.lang.String getClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clientID" element
     */
    public org.apache.xmlbeans.XmlString xgetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clientID" element
     */
    public void setClientID(java.lang.String clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTID$2);
            }
            target.setStringValue(clientID);
        }
    }
    
    /**
     * Sets (as xml) the "clientID" element
     */
    public void xsetClientID(org.apache.xmlbeans.XmlString clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTID$2);
            }
            target.set(clientID);
        }
    }
    
    /**
     * Gets the "clientSecret" element
     */
    public java.lang.String getClientSecret()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSECRET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "clientSecret" element
     */
    public org.apache.xmlbeans.XmlString xgetClientSecret()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSECRET$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "clientSecret" element
     */
    public void setClientSecret(java.lang.String clientSecret)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTSECRET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTSECRET$4);
            }
            target.setStringValue(clientSecret);
        }
    }
    
    /**
     * Sets (as xml) the "clientSecret" element
     */
    public void xsetClientSecret(org.apache.xmlbeans.XmlString clientSecret)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLIENTSECRET$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLIENTSECRET$4);
            }
            target.set(clientSecret);
        }
    }
    
    /**
     * Gets the "authorizationURI" element
     */
    public java.lang.String getAuthorizationURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZATIONURI$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "authorizationURI" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthorizationURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORIZATIONURI$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "authorizationURI" element
     */
    public void setAuthorizationURI(java.lang.String authorizationURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZATIONURI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORIZATIONURI$6);
            }
            target.setStringValue(authorizationURI);
        }
    }
    
    /**
     * Sets (as xml) the "authorizationURI" element
     */
    public void xsetAuthorizationURI(org.apache.xmlbeans.XmlString authorizationURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORIZATIONURI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHORIZATIONURI$6);
            }
            target.set(authorizationURI);
        }
    }
    
    /**
     * Gets the "accessTokenURI" element
     */
    public java.lang.String getAccessTokenURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENURI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessTokenURI" element
     */
    public org.apache.xmlbeans.XmlString xgetAccessTokenURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKENURI$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessTokenURI" element
     */
    public void setAccessTokenURI(java.lang.String accessTokenURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENURI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENURI$8);
            }
            target.setStringValue(accessTokenURI);
        }
    }
    
    /**
     * Sets (as xml) the "accessTokenURI" element
     */
    public void xsetAccessTokenURI(org.apache.xmlbeans.XmlString accessTokenURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKENURI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCESSTOKENURI$8);
            }
            target.set(accessTokenURI);
        }
    }
    
    /**
     * Gets the "redirectURI" element
     */
    public java.lang.String getRedirectURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REDIRECTURI$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "redirectURI" element
     */
    public org.apache.xmlbeans.XmlString xgetRedirectURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REDIRECTURI$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "redirectURI" element
     */
    public void setRedirectURI(java.lang.String redirectURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REDIRECTURI$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REDIRECTURI$10);
            }
            target.setStringValue(redirectURI);
        }
    }
    
    /**
     * Sets (as xml) the "redirectURI" element
     */
    public void xsetRedirectURI(org.apache.xmlbeans.XmlString redirectURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REDIRECTURI$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REDIRECTURI$10);
            }
            target.set(redirectURI);
        }
    }
    
    /**
     * Gets the "accessToken" element
     */
    public java.lang.String getAccessToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKEN$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessToken" element
     */
    public org.apache.xmlbeans.XmlString xgetAccessToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKEN$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessToken" element
     */
    public void setAccessToken(java.lang.String accessToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKEN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKEN$12);
            }
            target.setStringValue(accessToken);
        }
    }
    
    /**
     * Sets (as xml) the "accessToken" element
     */
    public void xsetAccessToken(org.apache.xmlbeans.XmlString accessToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKEN$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCESSTOKEN$12);
            }
            target.set(accessToken);
        }
    }
    
    /**
     * Gets the "accessTokenPosition" element
     */
    public com.eviware.soapui.config.AccessTokenPositionConfig.Enum getAccessTokenPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENPOSITION$14, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.AccessTokenPositionConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessTokenPosition" element
     */
    public com.eviware.soapui.config.AccessTokenPositionConfig xgetAccessTokenPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenPositionConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenPositionConfig)get_store().find_element_user(ACCESSTOKENPOSITION$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessTokenPosition" element
     */
    public void setAccessTokenPosition(com.eviware.soapui.config.AccessTokenPositionConfig.Enum accessTokenPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENPOSITION$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENPOSITION$14);
            }
            target.setEnumValue(accessTokenPosition);
        }
    }
    
    /**
     * Sets (as xml) the "accessTokenPosition" element
     */
    public void xsetAccessTokenPosition(com.eviware.soapui.config.AccessTokenPositionConfig accessTokenPosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenPositionConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenPositionConfig)get_store().find_element_user(ACCESSTOKENPOSITION$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenPositionConfig)get_store().add_element_user(ACCESSTOKENPOSITION$14);
            }
            target.set(accessTokenPosition);
        }
    }
    
    /**
     * Gets the "oAuth2Flow" element
     */
    public com.eviware.soapui.config.OAuth2FlowConfig.Enum getOAuth2Flow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OAUTH2FLOW$16, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.OAuth2FlowConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "oAuth2Flow" element
     */
    public com.eviware.soapui.config.OAuth2FlowConfig xgetOAuth2Flow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2FlowConfig target = null;
            target = (com.eviware.soapui.config.OAuth2FlowConfig)get_store().find_element_user(OAUTH2FLOW$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "oAuth2Flow" element
     */
    public void setOAuth2Flow(com.eviware.soapui.config.OAuth2FlowConfig.Enum oAuth2Flow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OAUTH2FLOW$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OAUTH2FLOW$16);
            }
            target.setEnumValue(oAuth2Flow);
        }
    }
    
    /**
     * Sets (as xml) the "oAuth2Flow" element
     */
    public void xsetOAuth2Flow(com.eviware.soapui.config.OAuth2FlowConfig oAuth2Flow)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.OAuth2FlowConfig target = null;
            target = (com.eviware.soapui.config.OAuth2FlowConfig)get_store().find_element_user(OAUTH2FLOW$16, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.OAuth2FlowConfig)get_store().add_element_user(OAUTH2FLOW$16);
            }
            target.set(oAuth2Flow);
        }
    }
    
    /**
     * Gets the "refreshAccessTokenMethod" element
     */
    public com.eviware.soapui.config.RefreshAccessTokenMethodConfig.Enum getRefreshAccessTokenMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFRESHACCESSTOKENMETHOD$18, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.RefreshAccessTokenMethodConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshAccessTokenMethod" element
     */
    public com.eviware.soapui.config.RefreshAccessTokenMethodConfig xgetRefreshAccessTokenMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RefreshAccessTokenMethodConfig target = null;
            target = (com.eviware.soapui.config.RefreshAccessTokenMethodConfig)get_store().find_element_user(REFRESHACCESSTOKENMETHOD$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "refreshAccessTokenMethod" element
     */
    public void setRefreshAccessTokenMethod(com.eviware.soapui.config.RefreshAccessTokenMethodConfig.Enum refreshAccessTokenMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFRESHACCESSTOKENMETHOD$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFRESHACCESSTOKENMETHOD$18);
            }
            target.setEnumValue(refreshAccessTokenMethod);
        }
    }
    
    /**
     * Sets (as xml) the "refreshAccessTokenMethod" element
     */
    public void xsetRefreshAccessTokenMethod(com.eviware.soapui.config.RefreshAccessTokenMethodConfig refreshAccessTokenMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.RefreshAccessTokenMethodConfig target = null;
            target = (com.eviware.soapui.config.RefreshAccessTokenMethodConfig)get_store().find_element_user(REFRESHACCESSTOKENMETHOD$18, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.RefreshAccessTokenMethodConfig)get_store().add_element_user(REFRESHACCESSTOKENMETHOD$18);
            }
            target.set(refreshAccessTokenMethod);
        }
    }
    
    /**
     * Gets the "refreshToken" element
     */
    public java.lang.String getRefreshToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFRESHTOKEN$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "refreshToken" element
     */
    public org.apache.xmlbeans.XmlString xgetRefreshToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFRESHTOKEN$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "refreshToken" element
     */
    public void setRefreshToken(java.lang.String refreshToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFRESHTOKEN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFRESHTOKEN$20);
            }
            target.setStringValue(refreshToken);
        }
    }
    
    /**
     * Sets (as xml) the "refreshToken" element
     */
    public void xsetRefreshToken(org.apache.xmlbeans.XmlString refreshToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFRESHTOKEN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFRESHTOKEN$20);
            }
            target.set(refreshToken);
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public java.lang.String getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    public void setScope(java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$22);
            }
            target.setStringValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" element
     */
    public void xsetScope(org.apache.xmlbeans.XmlString scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$22);
            }
            target.set(scope);
        }
    }
    
    /**
     * Gets the "accessTokenStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig.Enum getAccessTokenStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTATUS$24, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.AccessTokenStatusConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessTokenStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig xgetAccessTokenStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTATUS$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessTokenStatus" element
     */
    public void setAccessTokenStatus(com.eviware.soapui.config.AccessTokenStatusConfig.Enum accessTokenStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTATUS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENSTATUS$24);
            }
            target.setEnumValue(accessTokenStatus);
        }
    }
    
    /**
     * Sets (as xml) the "accessTokenStatus" element
     */
    public void xsetAccessTokenStatus(com.eviware.soapui.config.AccessTokenStatusConfig accessTokenStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTATUS$24, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().add_element_user(ACCESSTOKENSTATUS$24);
            }
            target.set(accessTokenStatus);
        }
    }
    
    /**
     * Gets the "accessTokenStartingStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig.Enum getAccessTokenStartingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$26, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.AccessTokenStatusConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessTokenStartingStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig xgetAccessTokenStartingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessTokenStartingStatus" element
     */
    public void setAccessTokenStartingStatus(com.eviware.soapui.config.AccessTokenStatusConfig.Enum accessTokenStartingStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENSTARTINGSTATUS$26);
            }
            target.setEnumValue(accessTokenStartingStatus);
        }
    }
    
    /**
     * Sets (as xml) the "accessTokenStartingStatus" element
     */
    public void xsetAccessTokenStartingStatus(com.eviware.soapui.config.AccessTokenStatusConfig accessTokenStartingStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$26, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().add_element_user(ACCESSTOKENSTARTINGSTATUS$26);
            }
            target.set(accessTokenStartingStatus);
        }
    }
    
    /**
     * Gets the "accessTokenExpirationTime" element
     */
    public long getAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENEXPIRATIONTIME$28, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessTokenExpirationTime" element
     */
    public org.apache.xmlbeans.XmlLong xgetAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACCESSTOKENEXPIRATIONTIME$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessTokenExpirationTime" element
     */
    public void setAccessTokenExpirationTime(long accessTokenExpirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENEXPIRATIONTIME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENEXPIRATIONTIME$28);
            }
            target.setLongValue(accessTokenExpirationTime);
        }
    }
    
    /**
     * Sets (as xml) the "accessTokenExpirationTime" element
     */
    public void xsetAccessTokenExpirationTime(org.apache.xmlbeans.XmlLong accessTokenExpirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACCESSTOKENEXPIRATIONTIME$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ACCESSTOKENEXPIRATIONTIME$28);
            }
            target.set(accessTokenExpirationTime);
        }
    }
    
    /**
     * Gets the "accessTokenIssuedTime" element
     */
    public long getAccessTokenIssuedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENISSUEDTIME$30, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessTokenIssuedTime" element
     */
    public org.apache.xmlbeans.XmlLong xgetAccessTokenIssuedTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACCESSTOKENISSUEDTIME$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessTokenIssuedTime" element
     */
    public void setAccessTokenIssuedTime(long accessTokenIssuedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENISSUEDTIME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENISSUEDTIME$30);
            }
            target.setLongValue(accessTokenIssuedTime);
        }
    }
    
    /**
     * Sets (as xml) the "accessTokenIssuedTime" element
     */
    public void xsetAccessTokenIssuedTime(org.apache.xmlbeans.XmlLong accessTokenIssuedTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACCESSTOKENISSUEDTIME$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ACCESSTOKENISSUEDTIME$30);
            }
            target.set(accessTokenIssuedTime);
        }
    }
    
    /**
     * Gets the "javaScripts" element
     */
    public com.eviware.soapui.config.StringListConfig getJavaScripts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(JAVASCRIPTS$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "javaScripts" element
     */
    public void setJavaScripts(com.eviware.soapui.config.StringListConfig javaScripts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().find_element_user(JAVASCRIPTS$32, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(JAVASCRIPTS$32);
            }
            target.set(javaScripts);
        }
    }
    
    /**
     * Appends and returns a new empty "javaScripts" element
     */
    public com.eviware.soapui.config.StringListConfig addNewJavaScripts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StringListConfig target = null;
            target = (com.eviware.soapui.config.StringListConfig)get_store().add_element_user(JAVASCRIPTS$32);
            return target;
        }
    }
    
    /**
     * Gets the "manualAccessTokenExpirationTime" element
     */
    public java.lang.String getManualAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "manualAccessTokenExpirationTime" element
     */
    public org.apache.xmlbeans.XmlString xgetManualAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "manualAccessTokenExpirationTime" element
     */
    public boolean isSetManualAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUALACCESSTOKENEXPIRATIONTIME$34) != 0;
        }
    }
    
    /**
     * Sets the "manualAccessTokenExpirationTime" element
     */
    public void setManualAccessTokenExpirationTime(java.lang.String manualAccessTokenExpirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIME$34);
            }
            target.setStringValue(manualAccessTokenExpirationTime);
        }
    }
    
    /**
     * Sets (as xml) the "manualAccessTokenExpirationTime" element
     */
    public void xsetManualAccessTokenExpirationTime(org.apache.xmlbeans.XmlString manualAccessTokenExpirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIME$34);
            }
            target.set(manualAccessTokenExpirationTime);
        }
    }
    
    /**
     * Unsets the "manualAccessTokenExpirationTime" element
     */
    public void unsetManualAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUALACCESSTOKENEXPIRATIONTIME$34, 0);
        }
    }
    
    /**
     * Gets the "useManualAccessTokenExpirationTime" element
     */
    public boolean getUseManualAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$36, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useManualAccessTokenExpirationTime" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseManualAccessTokenExpirationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "useManualAccessTokenExpirationTime" element
     */
    public void setUseManualAccessTokenExpirationTime(boolean useManualAccessTokenExpirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$36);
            }
            target.setBooleanValue(useManualAccessTokenExpirationTime);
        }
    }
    
    /**
     * Sets (as xml) the "useManualAccessTokenExpirationTime" element
     */
    public void xsetUseManualAccessTokenExpirationTime(org.apache.xmlbeans.XmlBoolean useManualAccessTokenExpirationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$36);
            }
            target.set(useManualAccessTokenExpirationTime);
        }
    }
    
    /**
     * Gets the "manualAccessTokenExpirationTimeUnit" element
     */
    public com.eviware.soapui.config.TimeUnitConfig.Enum getManualAccessTokenExpirationTimeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$38, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.TimeUnitConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "manualAccessTokenExpirationTimeUnit" element
     */
    public com.eviware.soapui.config.TimeUnitConfig xgetManualAccessTokenExpirationTimeUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TimeUnitConfig target = null;
            target = (com.eviware.soapui.config.TimeUnitConfig)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$38, 0);
            return target;
        }
    }
    
    /**
     * Sets the "manualAccessTokenExpirationTimeUnit" element
     */
    public void setManualAccessTokenExpirationTimeUnit(com.eviware.soapui.config.TimeUnitConfig.Enum manualAccessTokenExpirationTimeUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$38);
            }
            target.setEnumValue(manualAccessTokenExpirationTimeUnit);
        }
    }
    
    /**
     * Sets (as xml) the "manualAccessTokenExpirationTimeUnit" element
     */
    public void xsetManualAccessTokenExpirationTimeUnit(com.eviware.soapui.config.TimeUnitConfig manualAccessTokenExpirationTimeUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TimeUnitConfig target = null;
            target = (com.eviware.soapui.config.TimeUnitConfig)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$38, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TimeUnitConfig)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$38);
            }
            target.set(manualAccessTokenExpirationTimeUnit);
        }
    }
    
    /**
     * Gets the "resourceOwnerName" element
     */
    public java.lang.String getResourceOwnerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEOWNERNAME$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourceOwnerName" element
     */
    public org.apache.xmlbeans.XmlString xgetResourceOwnerName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEOWNERNAME$40, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resourceOwnerName" element
     */
    public void setResourceOwnerName(java.lang.String resourceOwnerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEOWNERNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEOWNERNAME$40);
            }
            target.setStringValue(resourceOwnerName);
        }
    }
    
    /**
     * Sets (as xml) the "resourceOwnerName" element
     */
    public void xsetResourceOwnerName(org.apache.xmlbeans.XmlString resourceOwnerName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEOWNERNAME$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCEOWNERNAME$40);
            }
            target.set(resourceOwnerName);
        }
    }
    
    /**
     * Gets the "resourceOwnerPassword" element
     */
    public java.lang.String getResourceOwnerPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEOWNERPASSWORD$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourceOwnerPassword" element
     */
    public org.apache.xmlbeans.XmlString xgetResourceOwnerPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEOWNERPASSWORD$42, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resourceOwnerPassword" element
     */
    public void setResourceOwnerPassword(java.lang.String resourceOwnerPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEOWNERPASSWORD$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEOWNERPASSWORD$42);
            }
            target.setStringValue(resourceOwnerPassword);
        }
    }
    
    /**
     * Sets (as xml) the "resourceOwnerPassword" element
     */
    public void xsetResourceOwnerPassword(org.apache.xmlbeans.XmlString resourceOwnerPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEOWNERPASSWORD$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCEOWNERPASSWORD$42);
            }
            target.set(resourceOwnerPassword);
        }
    }
}
