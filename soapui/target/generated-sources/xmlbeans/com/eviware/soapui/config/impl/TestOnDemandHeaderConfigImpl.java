/*
 * XML Type:  TestOnDemandHeader
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandHeaderConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestOnDemandHeader(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestOnDemandHeaderConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandHeaderConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandHeaderConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERAGENT$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "UserAgent");
    
    
    /**
     * Gets the "UserAgent" element
     */
    public java.lang.String getUserAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERAGENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserAgent" element
     */
    public org.apache.xmlbeans.XmlString xgetUserAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERAGENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "UserAgent" element
     */
    public void setUserAgent(java.lang.String userAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERAGENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERAGENT$0);
            }
            target.setStringValue(userAgent);
        }
    }
    
    /**
     * Sets (as xml) the "UserAgent" element
     */
    public void xsetUserAgent(org.apache.xmlbeans.XmlString userAgent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERAGENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERAGENT$0);
            }
            target.set(userAgent);
        }
    }
}
