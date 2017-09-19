/*
 * XML Type:  EnvironmentEndpoint
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.EnvironmentEndpointConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML EnvironmentEndpoint(@http://eviware.com/soapui/config).
 *
 * This is an atomic type that is a restriction of com.eviware.soapui.config.EnvironmentEndpointConfig.
 */
public class EnvironmentEndpointConfigImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.eviware.soapui.config.EnvironmentEndpointConfig
{
    private static final long serialVersionUID = 1L;
    
    public EnvironmentEndpointConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected EnvironmentEndpointConfigImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName USERNAME$0 = 
        new javax.xml.namespace.QName("", "username");
    private static final javax.xml.namespace.QName PASSWORD$2 = 
        new javax.xml.namespace.QName("", "password");
    private static final javax.xml.namespace.QName DOMAIN$4 = 
        new javax.xml.namespace.QName("", "domain");
    private static final javax.xml.namespace.QName WSSTYPE$6 = 
        new javax.xml.namespace.QName("", "wssType");
    private static final javax.xml.namespace.QName WSSTIMETOLIVE$8 = 
        new javax.xml.namespace.QName("", "wssTimeToLive");
    private static final javax.xml.namespace.QName MODE$10 = 
        new javax.xml.namespace.QName("", "mode");
    private static final javax.xml.namespace.QName LABEL$12 = 
        new javax.xml.namespace.QName("", "label");
    private static final javax.xml.namespace.QName OUTGOINGWSS$14 = 
        new javax.xml.namespace.QName("", "outgoingWss");
    private static final javax.xml.namespace.QName INCOMINGWSS$16 = 
        new javax.xml.namespace.QName("", "incomingWss");
    private static final javax.xml.namespace.QName PROXYHOST$18 = 
        new javax.xml.namespace.QName("", "proxyHost");
    private static final javax.xml.namespace.QName PROXYPORT$20 = 
        new javax.xml.namespace.QName("", "proxyPort");
    private static final javax.xml.namespace.QName PROXYUSERNAME$22 = 
        new javax.xml.namespace.QName("", "proxyUsername");
    private static final javax.xml.namespace.QName PROXYPASSWORD$24 = 
        new javax.xml.namespace.QName("", "proxyPassword");
    
    
    /**
     * Gets the "username" attribute
     */
    public java.lang.String getUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "username" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERNAME$0);
            return target;
        }
    }
    
    /**
     * True if has "username" attribute
     */
    public boolean isSetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USERNAME$0) != null;
        }
    }
    
    /**
     * Sets the "username" attribute
     */
    public void setUsername(java.lang.String username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USERNAME$0);
            }
            target.setStringValue(username);
        }
    }
    
    /**
     * Sets (as xml) the "username" attribute
     */
    public void xsetUsername(org.apache.xmlbeans.XmlString username)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(USERNAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(USERNAME$0);
            }
            target.set(username);
        }
    }
    
    /**
     * Unsets the "username" attribute
     */
    public void unsetUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USERNAME$0);
        }
    }
    
    /**
     * Gets the "password" attribute
     */
    public java.lang.String getPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "password" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSWORD$2);
            return target;
        }
    }
    
    /**
     * True if has "password" attribute
     */
    public boolean isSetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PASSWORD$2) != null;
        }
    }
    
    /**
     * Sets the "password" attribute
     */
    public void setPassword(java.lang.String password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PASSWORD$2);
            }
            target.setStringValue(password);
        }
    }
    
    /**
     * Sets (as xml) the "password" attribute
     */
    public void xsetPassword(org.apache.xmlbeans.XmlString password)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PASSWORD$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PASSWORD$2);
            }
            target.set(password);
        }
    }
    
    /**
     * Unsets the "password" attribute
     */
    public void unsetPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PASSWORD$2);
        }
    }
    
    /**
     * Gets the "domain" attribute
     */
    public java.lang.String getDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "domain" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$4);
            return target;
        }
    }
    
    /**
     * True if has "domain" attribute
     */
    public boolean isSetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DOMAIN$4) != null;
        }
    }
    
    /**
     * Sets the "domain" attribute
     */
    public void setDomain(java.lang.String domain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DOMAIN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DOMAIN$4);
            }
            target.setStringValue(domain);
        }
    }
    
    /**
     * Sets (as xml) the "domain" attribute
     */
    public void xsetDomain(org.apache.xmlbeans.XmlString domain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DOMAIN$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DOMAIN$4);
            }
            target.set(domain);
        }
    }
    
    /**
     * Unsets the "domain" attribute
     */
    public void unsetDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DOMAIN$4);
        }
    }
    
    /**
     * Gets the "wssType" attribute
     */
    public java.lang.String getWssType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSSTYPE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wssType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWssType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSSTYPE$6);
            return target;
        }
    }
    
    /**
     * True if has "wssType" attribute
     */
    public boolean isSetWssType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSSTYPE$6) != null;
        }
    }
    
    /**
     * Sets the "wssType" attribute
     */
    public void setWssType(java.lang.String wssType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSSTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSSTYPE$6);
            }
            target.setStringValue(wssType);
        }
    }
    
    /**
     * Sets (as xml) the "wssType" attribute
     */
    public void xsetWssType(org.apache.xmlbeans.XmlString wssType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSSTYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WSSTYPE$6);
            }
            target.set(wssType);
        }
    }
    
    /**
     * Unsets the "wssType" attribute
     */
    public void unsetWssType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSSTYPE$6);
        }
    }
    
    /**
     * Gets the "wssTimeToLive" attribute
     */
    public java.lang.String getWssTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSSTIMETOLIVE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wssTimeToLive" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWssTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSSTIMETOLIVE$8);
            return target;
        }
    }
    
    /**
     * True if has "wssTimeToLive" attribute
     */
    public boolean isSetWssTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSSTIMETOLIVE$8) != null;
        }
    }
    
    /**
     * Sets the "wssTimeToLive" attribute
     */
    public void setWssTimeToLive(java.lang.String wssTimeToLive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSSTIMETOLIVE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSSTIMETOLIVE$8);
            }
            target.setStringValue(wssTimeToLive);
        }
    }
    
    /**
     * Sets (as xml) the "wssTimeToLive" attribute
     */
    public void xsetWssTimeToLive(org.apache.xmlbeans.XmlString wssTimeToLive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSSTIMETOLIVE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WSSTIMETOLIVE$8);
            }
            target.set(wssTimeToLive);
        }
    }
    
    /**
     * Unsets the "wssTimeToLive" attribute
     */
    public void unsetWssTimeToLive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSSTIMETOLIVE$8);
        }
    }
    
    /**
     * Gets the "mode" attribute
     */
    public com.eviware.soapui.config.EndpointConfig.Mode.Enum getMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$10);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.EndpointConfig.Mode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "mode" attribute
     */
    public com.eviware.soapui.config.EndpointConfig.Mode xgetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointConfig.Mode target = null;
            target = (com.eviware.soapui.config.EndpointConfig.Mode)get_store().find_attribute_user(MODE$10);
            return target;
        }
    }
    
    /**
     * True if has "mode" attribute
     */
    public boolean isSetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MODE$10) != null;
        }
    }
    
    /**
     * Sets the "mode" attribute
     */
    public void setMode(com.eviware.soapui.config.EndpointConfig.Mode.Enum mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MODE$10);
            }
            target.setEnumValue(mode);
        }
    }
    
    /**
     * Sets (as xml) the "mode" attribute
     */
    public void xsetMode(com.eviware.soapui.config.EndpointConfig.Mode mode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.EndpointConfig.Mode target = null;
            target = (com.eviware.soapui.config.EndpointConfig.Mode)get_store().find_attribute_user(MODE$10);
            if (target == null)
            {
                target = (com.eviware.soapui.config.EndpointConfig.Mode)get_store().add_attribute_user(MODE$10);
            }
            target.set(mode);
        }
    }
    
    /**
     * Unsets the "mode" attribute
     */
    public void unsetMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MODE$10);
        }
    }
    
    /**
     * Gets the "label" attribute
     */
    public java.lang.String getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$12);
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$12) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    public void setLabel(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$12);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" attribute
     */
    public void xsetLabel(org.apache.xmlbeans.XmlString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$12);
            }
            target.set(label);
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$12);
        }
    }
    
    /**
     * Gets the "outgoingWss" attribute
     */
    public java.lang.String getOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "outgoingWss" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$14);
            return target;
        }
    }
    
    /**
     * True if has "outgoingWss" attribute
     */
    public boolean isSetOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OUTGOINGWSS$14) != null;
        }
    }
    
    /**
     * Sets the "outgoingWss" attribute
     */
    public void setOutgoingWss(java.lang.String outgoingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTGOINGWSS$14);
            }
            target.setStringValue(outgoingWss);
        }
    }
    
    /**
     * Sets (as xml) the "outgoingWss" attribute
     */
    public void xsetOutgoingWss(org.apache.xmlbeans.XmlString outgoingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OUTGOINGWSS$14);
            }
            target.set(outgoingWss);
        }
    }
    
    /**
     * Unsets the "outgoingWss" attribute
     */
    public void unsetOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OUTGOINGWSS$14);
        }
    }
    
    /**
     * Gets the "incomingWss" attribute
     */
    public java.lang.String getIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCOMINGWSS$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "incomingWss" attribute
     */
    public org.apache.xmlbeans.XmlString xgetIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCOMINGWSS$16);
            return target;
        }
    }
    
    /**
     * True if has "incomingWss" attribute
     */
    public boolean isSetIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCOMINGWSS$16) != null;
        }
    }
    
    /**
     * Sets the "incomingWss" attribute
     */
    public void setIncomingWss(java.lang.String incomingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCOMINGWSS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCOMINGWSS$16);
            }
            target.setStringValue(incomingWss);
        }
    }
    
    /**
     * Sets (as xml) the "incomingWss" attribute
     */
    public void xsetIncomingWss(org.apache.xmlbeans.XmlString incomingWss)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCOMINGWSS$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INCOMINGWSS$16);
            }
            target.set(incomingWss);
        }
    }
    
    /**
     * Unsets the "incomingWss" attribute
     */
    public void unsetIncomingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCOMINGWSS$16);
        }
    }
    
    /**
     * Gets the "proxyHost" attribute
     */
    public java.lang.String getProxyHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYHOST$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "proxyHost" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProxyHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYHOST$18);
            return target;
        }
    }
    
    /**
     * True if has "proxyHost" attribute
     */
    public boolean isSetProxyHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROXYHOST$18) != null;
        }
    }
    
    /**
     * Sets the "proxyHost" attribute
     */
    public void setProxyHost(java.lang.String proxyHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYHOST$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROXYHOST$18);
            }
            target.setStringValue(proxyHost);
        }
    }
    
    /**
     * Sets (as xml) the "proxyHost" attribute
     */
    public void xsetProxyHost(org.apache.xmlbeans.XmlString proxyHost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYHOST$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROXYHOST$18);
            }
            target.set(proxyHost);
        }
    }
    
    /**
     * Unsets the "proxyHost" attribute
     */
    public void unsetProxyHost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROXYHOST$18);
        }
    }
    
    /**
     * Gets the "proxyPort" attribute
     */
    public java.lang.String getProxyPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYPORT$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "proxyPort" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProxyPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYPORT$20);
            return target;
        }
    }
    
    /**
     * True if has "proxyPort" attribute
     */
    public boolean isSetProxyPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROXYPORT$20) != null;
        }
    }
    
    /**
     * Sets the "proxyPort" attribute
     */
    public void setProxyPort(java.lang.String proxyPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYPORT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROXYPORT$20);
            }
            target.setStringValue(proxyPort);
        }
    }
    
    /**
     * Sets (as xml) the "proxyPort" attribute
     */
    public void xsetProxyPort(org.apache.xmlbeans.XmlString proxyPort)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYPORT$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROXYPORT$20);
            }
            target.set(proxyPort);
        }
    }
    
    /**
     * Unsets the "proxyPort" attribute
     */
    public void unsetProxyPort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROXYPORT$20);
        }
    }
    
    /**
     * Gets the "proxyUsername" attribute
     */
    public java.lang.String getProxyUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYUSERNAME$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "proxyUsername" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProxyUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYUSERNAME$22);
            return target;
        }
    }
    
    /**
     * True if has "proxyUsername" attribute
     */
    public boolean isSetProxyUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROXYUSERNAME$22) != null;
        }
    }
    
    /**
     * Sets the "proxyUsername" attribute
     */
    public void setProxyUsername(java.lang.String proxyUsername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYUSERNAME$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROXYUSERNAME$22);
            }
            target.setStringValue(proxyUsername);
        }
    }
    
    /**
     * Sets (as xml) the "proxyUsername" attribute
     */
    public void xsetProxyUsername(org.apache.xmlbeans.XmlString proxyUsername)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYUSERNAME$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROXYUSERNAME$22);
            }
            target.set(proxyUsername);
        }
    }
    
    /**
     * Unsets the "proxyUsername" attribute
     */
    public void unsetProxyUsername()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROXYUSERNAME$22);
        }
    }
    
    /**
     * Gets the "proxyPassword" attribute
     */
    public java.lang.String getProxyPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYPASSWORD$24);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "proxyPassword" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProxyPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYPASSWORD$24);
            return target;
        }
    }
    
    /**
     * True if has "proxyPassword" attribute
     */
    public boolean isSetProxyPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROXYPASSWORD$24) != null;
        }
    }
    
    /**
     * Sets the "proxyPassword" attribute
     */
    public void setProxyPassword(java.lang.String proxyPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROXYPASSWORD$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROXYPASSWORD$24);
            }
            target.setStringValue(proxyPassword);
        }
    }
    
    /**
     * Sets (as xml) the "proxyPassword" attribute
     */
    public void xsetProxyPassword(org.apache.xmlbeans.XmlString proxyPassword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROXYPASSWORD$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROXYPASSWORD$24);
            }
            target.set(proxyPassword);
        }
    }
    
    /**
     * Unsets the "proxyPassword" attribute
     */
    public void unsetProxyPassword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROXYPASSWORD$24);
        }
    }
}
