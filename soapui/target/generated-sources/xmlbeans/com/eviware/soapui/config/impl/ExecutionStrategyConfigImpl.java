/*
 * XML Type:  ExecutionStrategy
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.ExecutionStrategyConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML ExecutionStrategy(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class ExecutionStrategyConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.ExecutionStrategyConfig
{
    private static final long serialVersionUID = 1L;
    
    public ExecutionStrategyConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRATEGY$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "strategy");
    private static final javax.xml.namespace.QName DELAY$2 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "delay");
    private static final javax.xml.namespace.QName IMMUTABLE$4 = 
        new javax.xml.namespace.QName("", "immutable");
    
    
    /**
     * Gets the "strategy" element
     */
    public com.eviware.soapui.config.StrategyTypeConfig.Enum getStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRATEGY$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.eviware.soapui.config.StrategyTypeConfig.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "strategy" element
     */
    public com.eviware.soapui.config.StrategyTypeConfig xgetStrategy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StrategyTypeConfig target = null;
            target = (com.eviware.soapui.config.StrategyTypeConfig)get_store().find_element_user(STRATEGY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "strategy" element
     */
    public void setStrategy(com.eviware.soapui.config.StrategyTypeConfig.Enum strategy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRATEGY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRATEGY$0);
            }
            target.setEnumValue(strategy);
        }
    }
    
    /**
     * Sets (as xml) the "strategy" element
     */
    public void xsetStrategy(com.eviware.soapui.config.StrategyTypeConfig strategy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.StrategyTypeConfig target = null;
            target = (com.eviware.soapui.config.StrategyTypeConfig)get_store().find_element_user(STRATEGY$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.StrategyTypeConfig)get_store().add_element_user(STRATEGY$0);
            }
            target.set(strategy);
        }
    }
    
    /**
     * Gets the "delay" element
     */
    public int getDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELAY$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "delay" element
     */
    public org.apache.xmlbeans.XmlInt xgetDelay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DELAY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "delay" element
     */
    public void setDelay(int delay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELAY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELAY$2);
            }
            target.setIntValue(delay);
        }
    }
    
    /**
     * Sets (as xml) the "delay" element
     */
    public void xsetDelay(org.apache.xmlbeans.XmlInt delay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DELAY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DELAY$2);
            }
            target.set(delay);
        }
    }
    
    /**
     * Gets the "immutable" attribute
     */
    public boolean getImmutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMMUTABLE$4);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "immutable" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetImmutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMMUTABLE$4);
            return target;
        }
    }
    
    /**
     * True if has "immutable" attribute
     */
    public boolean isSetImmutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMMUTABLE$4) != null;
        }
    }
    
    /**
     * Sets the "immutable" attribute
     */
    public void setImmutable(boolean immutable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMMUTABLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMMUTABLE$4);
            }
            target.setBooleanValue(immutable);
        }
    }
    
    /**
     * Sets (as xml) the "immutable" attribute
     */
    public void xsetImmutable(org.apache.xmlbeans.XmlBoolean immutable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(IMMUTABLE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(IMMUTABLE$4);
            }
            target.set(immutable);
        }
    }
    
    /**
     * Unsets the "immutable" attribute
     */
    public void unsetImmutable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMMUTABLE$4);
        }
    }
}
