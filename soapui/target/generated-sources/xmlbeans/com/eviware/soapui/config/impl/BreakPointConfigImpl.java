/*
 * XML Type:  BreakPoint
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BreakPointConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML BreakPoint(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class BreakPointConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.BreakPointConfig
{
    private static final long serialVersionUID = 1L;
    
    public BreakPointConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTSTEPID$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "testStepId");
    private static final javax.xml.namespace.QName STATUS$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "status");
    private static final javax.xml.namespace.QName PROPERTIES$4 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "properties");
    
    
    /**
     * Gets the "testStepId" element
     */
    public java.lang.String getTestStepId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTSTEPID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "testStepId" element
     */
    public org.apache.xmlbeans.XmlString xgetTestStepId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTSTEPID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "testStepId" element
     */
    public void setTestStepId(java.lang.String testStepId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTSTEPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTSTEPID$0);
            }
            target.setStringValue(testStepId);
        }
    }
    
    /**
     * Sets (as xml) the "testStepId" element
     */
    public void xsetTestStepId(org.apache.xmlbeans.XmlString testStepId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTSTEPID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TESTSTEPID$0);
            }
            target.set(testStepId);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" element
     */
    public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$2);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" element
     */
    public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$2);
            }
            target.set(status);
        }
    }
    
    /**
     * Gets the "properties" element
     */
    public com.eviware.soapui.config.BreakPointPropertiesConfig getProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.BreakPointPropertiesConfig target = null;
            target = (com.eviware.soapui.config.BreakPointPropertiesConfig)get_store().find_element_user(PROPERTIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "properties" element
     */
    public void setProperties(com.eviware.soapui.config.BreakPointPropertiesConfig properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.BreakPointPropertiesConfig target = null;
            target = (com.eviware.soapui.config.BreakPointPropertiesConfig)get_store().find_element_user(PROPERTIES$4, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.BreakPointPropertiesConfig)get_store().add_element_user(PROPERTIES$4);
            }
            target.set(properties);
        }
    }
    
    /**
     * Appends and returns a new empty "properties" element
     */
    public com.eviware.soapui.config.BreakPointPropertiesConfig addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.BreakPointPropertiesConfig target = null;
            target = (com.eviware.soapui.config.BreakPointPropertiesConfig)get_store().add_element_user(PROPERTIES$4);
            return target;
        }
    }
}
