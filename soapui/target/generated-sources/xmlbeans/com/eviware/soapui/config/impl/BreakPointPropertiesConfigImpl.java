/*
 * XML Type:  BreakPointProperties
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.BreakPointPropertiesConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML BreakPointProperties(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class BreakPointPropertiesConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.BreakPointPropertiesConfig
{
    private static final long serialVersionUID = 1L;
    
    public BreakPointPropertiesConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONENABLED$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "conditionEnabled");
    private static final javax.xml.namespace.QName CONDITION$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "condition");
    
    
    /**
     * Gets the "conditionEnabled" element
     */
    public boolean getConditionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITIONENABLED$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "conditionEnabled" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetConditionEnabled()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONDITIONENABLED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "conditionEnabled" element
     */
    public void setConditionEnabled(boolean conditionEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITIONENABLED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDITIONENABLED$0);
            }
            target.setBooleanValue(conditionEnabled);
        }
    }
    
    /**
     * Sets (as xml) the "conditionEnabled" element
     */
    public void xsetConditionEnabled(org.apache.xmlbeans.XmlBoolean conditionEnabled)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CONDITIONENABLED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CONDITIONENABLED$0);
            }
            target.set(conditionEnabled);
        }
    }
    
    /**
     * Gets the "condition" element
     */
    public com.eviware.soapui.config.ScriptConfig getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(CONDITION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(com.eviware.soapui.config.ScriptConfig condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().find_element_user(CONDITION$2, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(CONDITION$2);
            }
            target.set(condition);
        }
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public com.eviware.soapui.config.ScriptConfig addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.ScriptConfig target = null;
            target = (com.eviware.soapui.config.ScriptConfig)get_store().add_element_user(CONDITION$2);
            return target;
        }
    }
}
