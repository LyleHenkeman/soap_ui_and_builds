/*
 * XML Type:  WsdlRequest
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.WsdlRequestConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML WsdlRequest(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class WsdlRequestConfigImpl extends com.eviware.soapui.config.impl.AbstractRequestConfigImpl implements com.eviware.soapui.config.WsdlRequestConfig
{
    private static final long serialVersionUID = 1L;
    
    public WsdlRequestConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WSACONFIG$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "wsaConfig");
    private static final javax.xml.namespace.QName WSRMCONFIG$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "wsrmConfig");
    private static final javax.xml.namespace.QName WSSPASSWORDTYPE$4 = 
        new javax.xml.namespace.QName("", "wssPasswordType");
    private static final javax.xml.namespace.QName OUTGOINGWSS$6 = 
        new javax.xml.namespace.QName("", "outgoingWss");
    private static final javax.xml.namespace.QName INCOMINGWSS$8 = 
        new javax.xml.namespace.QName("", "incomingWss");
    private static final javax.xml.namespace.QName USEWSADDRESSING$10 = 
        new javax.xml.namespace.QName("", "useWsAddressing");
    private static final javax.xml.namespace.QName USEWSRELIABLEMESSAGING$12 = 
        new javax.xml.namespace.QName("", "useWsReliableMessaging");
    
    
    /**
     * Gets the "wsaConfig" element
     */
    public com.eviware.soapui.config.WsaConfigConfig getWsaConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsaConfigConfig target = null;
            target = (com.eviware.soapui.config.WsaConfigConfig)get_store().find_element_user(WSACONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsaConfig" element
     */
    public boolean isSetWsaConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSACONFIG$0) != 0;
        }
    }
    
    /**
     * Sets the "wsaConfig" element
     */
    public void setWsaConfig(com.eviware.soapui.config.WsaConfigConfig wsaConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsaConfigConfig target = null;
            target = (com.eviware.soapui.config.WsaConfigConfig)get_store().find_element_user(WSACONFIG$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WsaConfigConfig)get_store().add_element_user(WSACONFIG$0);
            }
            target.set(wsaConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "wsaConfig" element
     */
    public com.eviware.soapui.config.WsaConfigConfig addNewWsaConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsaConfigConfig target = null;
            target = (com.eviware.soapui.config.WsaConfigConfig)get_store().add_element_user(WSACONFIG$0);
            return target;
        }
    }
    
    /**
     * Unsets the "wsaConfig" element
     */
    public void unsetWsaConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSACONFIG$0, 0);
        }
    }
    
    /**
     * Gets the "wsrmConfig" element
     */
    public com.eviware.soapui.config.WsrmConfigConfig getWsrmConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsrmConfigConfig target = null;
            target = (com.eviware.soapui.config.WsrmConfigConfig)get_store().find_element_user(WSRMCONFIG$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "wsrmConfig" element
     */
    public boolean isSetWsrmConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSRMCONFIG$2) != 0;
        }
    }
    
    /**
     * Sets the "wsrmConfig" element
     */
    public void setWsrmConfig(com.eviware.soapui.config.WsrmConfigConfig wsrmConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsrmConfigConfig target = null;
            target = (com.eviware.soapui.config.WsrmConfigConfig)get_store().find_element_user(WSRMCONFIG$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.WsrmConfigConfig)get_store().add_element_user(WSRMCONFIG$2);
            }
            target.set(wsrmConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "wsrmConfig" element
     */
    public com.eviware.soapui.config.WsrmConfigConfig addNewWsrmConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.WsrmConfigConfig target = null;
            target = (com.eviware.soapui.config.WsrmConfigConfig)get_store().add_element_user(WSRMCONFIG$2);
            return target;
        }
    }
    
    /**
     * Unsets the "wsrmConfig" element
     */
    public void unsetWsrmConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSRMCONFIG$2, 0);
        }
    }
    
    /**
     * Gets the "wssPasswordType" attribute
     */
    public java.lang.String getWssPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSSPASSWORDTYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "wssPasswordType" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWssPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSSPASSWORDTYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "wssPasswordType" attribute
     */
    public boolean isSetWssPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WSSPASSWORDTYPE$4) != null;
        }
    }
    
    /**
     * Sets the "wssPasswordType" attribute
     */
    public void setWssPasswordType(java.lang.String wssPasswordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WSSPASSWORDTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WSSPASSWORDTYPE$4);
            }
            target.setStringValue(wssPasswordType);
        }
    }
    
    /**
     * Sets (as xml) the "wssPasswordType" attribute
     */
    public void xsetWssPasswordType(org.apache.xmlbeans.XmlString wssPasswordType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WSSPASSWORDTYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WSSPASSWORDTYPE$4);
            }
            target.set(wssPasswordType);
        }
    }
    
    /**
     * Unsets the "wssPasswordType" attribute
     */
    public void unsetWssPasswordType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WSSPASSWORDTYPE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$6);
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
            return get_store().find_attribute_user(OUTGOINGWSS$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTGOINGWSS$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OUTGOINGWSS$6);
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
            get_store().remove_attribute(OUTGOINGWSS$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCOMINGWSS$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCOMINGWSS$8);
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
            return get_store().find_attribute_user(INCOMINGWSS$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCOMINGWSS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCOMINGWSS$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(INCOMINGWSS$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(INCOMINGWSS$8);
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
            get_store().remove_attribute(INCOMINGWSS$8);
        }
    }
    
    /**
     * Gets the "useWsAddressing" attribute
     */
    public boolean getUseWsAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWSADDRESSING$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useWsAddressing" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseWsAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEWSADDRESSING$10);
            return target;
        }
    }
    
    /**
     * True if has "useWsAddressing" attribute
     */
    public boolean isSetUseWsAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEWSADDRESSING$10) != null;
        }
    }
    
    /**
     * Sets the "useWsAddressing" attribute
     */
    public void setUseWsAddressing(boolean useWsAddressing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWSADDRESSING$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEWSADDRESSING$10);
            }
            target.setBooleanValue(useWsAddressing);
        }
    }
    
    /**
     * Sets (as xml) the "useWsAddressing" attribute
     */
    public void xsetUseWsAddressing(org.apache.xmlbeans.XmlBoolean useWsAddressing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEWSADDRESSING$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEWSADDRESSING$10);
            }
            target.set(useWsAddressing);
        }
    }
    
    /**
     * Unsets the "useWsAddressing" attribute
     */
    public void unsetUseWsAddressing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEWSADDRESSING$10);
        }
    }
    
    /**
     * Gets the "useWsReliableMessaging" attribute
     */
    public boolean getUseWsReliableMessaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWSRELIABLEMESSAGING$12);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "useWsReliableMessaging" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUseWsReliableMessaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEWSRELIABLEMESSAGING$12);
            return target;
        }
    }
    
    /**
     * True if has "useWsReliableMessaging" attribute
     */
    public boolean isSetUseWsReliableMessaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USEWSRELIABLEMESSAGING$12) != null;
        }
    }
    
    /**
     * Sets the "useWsReliableMessaging" attribute
     */
    public void setUseWsReliableMessaging(boolean useWsReliableMessaging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWSRELIABLEMESSAGING$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEWSRELIABLEMESSAGING$12);
            }
            target.setBooleanValue(useWsReliableMessaging);
        }
    }
    
    /**
     * Sets (as xml) the "useWsReliableMessaging" attribute
     */
    public void xsetUseWsReliableMessaging(org.apache.xmlbeans.XmlBoolean useWsReliableMessaging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEWSRELIABLEMESSAGING$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEWSRELIABLEMESSAGING$12);
            }
            target.set(useWsReliableMessaging);
        }
    }
    
    /**
     * Unsets the "useWsReliableMessaging" attribute
     */
    public void unsetUseWsReliableMessaging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USEWSRELIABLEMESSAGING$12);
        }
    }
}
