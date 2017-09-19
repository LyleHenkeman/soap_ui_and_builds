/*
 * XML Type:  OAuth1Profile
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.OAuth1ProfileConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML OAuth1Profile(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class OAuth1ProfileConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.OAuth1ProfileConfig
{
    private static final long serialVersionUID = 1L;
    
    public OAuth1ProfileConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "name");
    private static final javax.xml.namespace.QName AUTHORIZATIONURI$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "authorizationURI");
    private static final javax.xml.namespace.QName ACCESSTOKENURI$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenURI");
    private static final javax.xml.namespace.QName REDIRECTURI$6 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "redirectURI");
    private static final javax.xml.namespace.QName ACCESSTOKEN$8 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessToken");
    private static final javax.xml.namespace.QName ACCESSTOKENPOSITION$10 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenPosition");
    private static final javax.xml.namespace.QName ACCESSTOKENSTATUS$12 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenStatus");
    private static final javax.xml.namespace.QName ACCESSTOKENSTARTINGSTATUS$14 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenStartingStatus");
    private static final javax.xml.namespace.QName ACCESSTOKENISSUEDTIME$16 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "accessTokenIssuedTime");
    private static final javax.xml.namespace.QName MANUALACCESSTOKENEXPIRATIONTIME$18 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "manualAccessTokenExpirationTime");
    private static final javax.xml.namespace.QName USEMANUALACCESSTOKENEXPIRATIONTIME$20 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "useManualAccessTokenExpirationTime");
    private static final javax.xml.namespace.QName MANUALACCESSTOKENEXPIRATIONTIMEUNIT$22 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "manualAccessTokenExpirationTimeUnit");
    private static final javax.xml.namespace.QName TEMPORARYTOKENURI$24 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "temporaryTokenURI");
    private static final javax.xml.namespace.QName CONSUMERKEY$26 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "consumerKey");
    private static final javax.xml.namespace.QName CONSUMERSECRET$28 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "consumerSecret");
    private static final javax.xml.namespace.QName TOKENSECRET$30 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tokenSecret");
    private static final javax.xml.namespace.QName TOKENSECRETSTATUS$32 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tokenSecretStatus");
    private static final javax.xml.namespace.QName TOKENSECRETSTARTINGSTATUS$34 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "tokenSecretStartingStatus");
    
    
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
     * Gets the "authorizationURI" element
     */
    public java.lang.String getAuthorizationURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZATIONURI$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORIZATIONURI$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHORIZATIONURI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHORIZATIONURI$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHORIZATIONURI$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHORIZATIONURI$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENURI$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKENURI$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENURI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENURI$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKENURI$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCESSTOKENURI$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REDIRECTURI$6, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REDIRECTURI$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REDIRECTURI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REDIRECTURI$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REDIRECTURI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REDIRECTURI$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKEN$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKEN$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKEN$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKEN$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSTOKEN$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCESSTOKEN$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENPOSITION$10, 0);
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
            target = (com.eviware.soapui.config.AccessTokenPositionConfig)get_store().find_element_user(ACCESSTOKENPOSITION$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENPOSITION$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENPOSITION$10);
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
            target = (com.eviware.soapui.config.AccessTokenPositionConfig)get_store().find_element_user(ACCESSTOKENPOSITION$10, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenPositionConfig)get_store().add_element_user(ACCESSTOKENPOSITION$10);
            }
            target.set(accessTokenPosition);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTATUS$12, 0);
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
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTATUS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "accessTokenStatus" element
     */
    public boolean isSetAccessTokenStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCESSTOKENSTATUS$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTATUS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENSTATUS$12);
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
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTATUS$12, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().add_element_user(ACCESSTOKENSTATUS$12);
            }
            target.set(accessTokenStatus);
        }
    }
    
    /**
     * Unsets the "accessTokenStatus" element
     */
    public void unsetAccessTokenStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCESSTOKENSTATUS$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$14, 0);
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
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENSTARTINGSTATUS$14);
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
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(ACCESSTOKENSTARTINGSTATUS$14, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().add_element_user(ACCESSTOKENSTARTINGSTATUS$14);
            }
            target.set(accessTokenStartingStatus);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENISSUEDTIME$16, 0);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACCESSTOKENISSUEDTIME$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSTOKENISSUEDTIME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSTOKENISSUEDTIME$16);
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
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ACCESSTOKENISSUEDTIME$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ACCESSTOKENISSUEDTIME$16);
            }
            target.set(accessTokenIssuedTime);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$18, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$18, 0);
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
            return get_store().count_elements(MANUALACCESSTOKENEXPIRATIONTIME$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIME$18);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIME$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIME$18);
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
            get_store().remove_element(MANUALACCESSTOKENEXPIRATIONTIME$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$20, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$20);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(USEMANUALACCESSTOKENEXPIRATIONTIME$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$22, 0);
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
            target = (com.eviware.soapui.config.TimeUnitConfig)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$22);
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
            target = (com.eviware.soapui.config.TimeUnitConfig)get_store().find_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$22, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TimeUnitConfig)get_store().add_element_user(MANUALACCESSTOKENEXPIRATIONTIMEUNIT$22);
            }
            target.set(manualAccessTokenExpirationTimeUnit);
        }
    }
    
    /**
     * Gets the "temporaryTokenURI" element
     */
    public java.lang.String getTemporaryTokenURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPORARYTOKENURI$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "temporaryTokenURI" element
     */
    public org.apache.xmlbeans.XmlString xgetTemporaryTokenURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPORARYTOKENURI$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "temporaryTokenURI" element
     */
    public void setTemporaryTokenURI(java.lang.String temporaryTokenURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPORARYTOKENURI$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPORARYTOKENURI$24);
            }
            target.setStringValue(temporaryTokenURI);
        }
    }
    
    /**
     * Sets (as xml) the "temporaryTokenURI" element
     */
    public void xsetTemporaryTokenURI(org.apache.xmlbeans.XmlString temporaryTokenURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPORARYTOKENURI$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEMPORARYTOKENURI$24);
            }
            target.set(temporaryTokenURI);
        }
    }
    
    /**
     * Gets the "consumerKey" element
     */
    public java.lang.String getConsumerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERKEY$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "consumerKey" element
     */
    public org.apache.xmlbeans.XmlString xgetConsumerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERKEY$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "consumerKey" element
     */
    public void setConsumerKey(java.lang.String consumerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERKEY$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSUMERKEY$26);
            }
            target.setStringValue(consumerKey);
        }
    }
    
    /**
     * Sets (as xml) the "consumerKey" element
     */
    public void xsetConsumerKey(org.apache.xmlbeans.XmlString consumerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERKEY$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSUMERKEY$26);
            }
            target.set(consumerKey);
        }
    }
    
    /**
     * Gets the "consumerSecret" element
     */
    public java.lang.String getConsumerSecret()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERSECRET$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "consumerSecret" element
     */
    public org.apache.xmlbeans.XmlString xgetConsumerSecret()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERSECRET$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "consumerSecret" element
     */
    public void setConsumerSecret(java.lang.String consumerSecret)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONSUMERSECRET$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONSUMERSECRET$28);
            }
            target.setStringValue(consumerSecret);
        }
    }
    
    /**
     * Sets (as xml) the "consumerSecret" element
     */
    public void xsetConsumerSecret(org.apache.xmlbeans.XmlString consumerSecret)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONSUMERSECRET$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONSUMERSECRET$28);
            }
            target.set(consumerSecret);
        }
    }
    
    /**
     * Gets the "tokenSecret" element
     */
    public java.lang.String getTokenSecret()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENSECRET$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tokenSecret" element
     */
    public org.apache.xmlbeans.XmlString xgetTokenSecret()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENSECRET$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tokenSecret" element
     */
    public void setTokenSecret(java.lang.String tokenSecret)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENSECRET$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKENSECRET$30);
            }
            target.setStringValue(tokenSecret);
        }
    }
    
    /**
     * Sets (as xml) the "tokenSecret" element
     */
    public void xsetTokenSecret(org.apache.xmlbeans.XmlString tokenSecret)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKENSECRET$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKENSECRET$30);
            }
            target.set(tokenSecret);
        }
    }
    
    /**
     * Gets the "tokenSecretStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig.Enum getTokenSecretStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENSECRETSTATUS$32, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.AccessTokenStatusConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tokenSecretStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig xgetTokenSecretStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(TOKENSECRETSTATUS$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "tokenSecretStatus" element
     */
    public boolean isSetTokenSecretStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOKENSECRETSTATUS$32) != 0;
        }
    }
    
    /**
     * Sets the "tokenSecretStatus" element
     */
    public void setTokenSecretStatus(com.eviware.soapui.config.AccessTokenStatusConfig.Enum tokenSecretStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENSECRETSTATUS$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKENSECRETSTATUS$32);
            }
            target.setEnumValue(tokenSecretStatus);
        }
    }
    
    /**
     * Sets (as xml) the "tokenSecretStatus" element
     */
    public void xsetTokenSecretStatus(com.eviware.soapui.config.AccessTokenStatusConfig tokenSecretStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(TOKENSECRETSTATUS$32, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().add_element_user(TOKENSECRETSTATUS$32);
            }
            target.set(tokenSecretStatus);
        }
    }
    
    /**
     * Unsets the "tokenSecretStatus" element
     */
    public void unsetTokenSecretStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOKENSECRETSTATUS$32, 0);
        }
    }
    
    /**
     * Gets the "tokenSecretStartingStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig.Enum getTokenSecretStartingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENSECRETSTARTINGSTATUS$34, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.AccessTokenStatusConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "tokenSecretStartingStatus" element
     */
    public com.eviware.soapui.config.AccessTokenStatusConfig xgetTokenSecretStartingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(TOKENSECRETSTARTINGSTATUS$34, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tokenSecretStartingStatus" element
     */
    public void setTokenSecretStartingStatus(com.eviware.soapui.config.AccessTokenStatusConfig.Enum tokenSecretStartingStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKENSECRETSTARTINGSTATUS$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKENSECRETSTARTINGSTATUS$34);
            }
            target.setEnumValue(tokenSecretStartingStatus);
        }
    }
    
    /**
     * Sets (as xml) the "tokenSecretStartingStatus" element
     */
    public void xsetTokenSecretStartingStatus(com.eviware.soapui.config.AccessTokenStatusConfig tokenSecretStartingStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.AccessTokenStatusConfig target = null;
            target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().find_element_user(TOKENSECRETSTARTINGSTATUS$34, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.AccessTokenStatusConfig)get_store().add_element_user(TOKENSECRETSTARTINGSTATUS$34);
            }
            target.set(tokenSecretStartingStatus);
        }
    }
}
