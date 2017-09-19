/*
 * XML Type:  MockResponse
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.MockResponseConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML MockResponse(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class MockResponseConfigImpl extends com.eviware.soapui.config.impl.BaseMockResponseConfigImpl implements com.eviware.soapui.config.MockResponseConfig
{
    private static final long serialVersionUID = 1L;
    
    public MockResponseConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WSACONFIG$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "wsaConfig");
    private static final javax.xml.namespace.QName OUTGOINGWSS$2 = 
        new javax.xml.namespace.QName("", "outgoingWss");
    private static final javax.xml.namespace.QName USEWSADDRESSING$4 = 
        new javax.xml.namespace.QName("", "useWsAddressing");
    
    
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
     * Gets the "outgoingWss" attribute
     */
    public java.lang.String getOutgoingWss()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$2);
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
            return get_store().find_attribute_user(OUTGOINGWSS$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OUTGOINGWSS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OUTGOINGWSS$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OUTGOINGWSS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OUTGOINGWSS$2);
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
            get_store().remove_attribute(OUTGOINGWSS$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWSADDRESSING$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEWSADDRESSING$4);
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
            return get_store().find_attribute_user(USEWSADDRESSING$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USEWSADDRESSING$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USEWSADDRESSING$4);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(USEWSADDRESSING$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(USEWSADDRESSING$4);
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
            get_store().remove_attribute(USEWSADDRESSING$4);
        }
    }
}
