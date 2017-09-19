/*
 * XML Type:  TestOnDemandLocationBody
 * Namespace: http://eviware.com/soapui/config
 * Java type: com.eviware.soapui.config.TestOnDemandLocationBodyConfig
 *
 * Automatically generated - do not modify.
 */
package com.eviware.soapui.config.impl;
/**
 * An XML TestOnDemandLocationBody(@http://eviware.com/soapui/config).
 *
 * This is a complex type.
 */
public class TestOnDemandLocationBodyConfigImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.eviware.soapui.config.TestOnDemandLocationBodyConfig
{
    private static final long serialVersionUID = 1L;
    
    public TestOnDemandLocationBodyConfigImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMAND$0 = 
        new javax.xml.namespace.QName("http://eviware.com/soapui/config", "Command");
    
    
    /**
     * Gets the "Command" element
     */
    public com.eviware.soapui.config.TestOnDemandCommandConfig getCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandCommandConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().find_element_user(COMMAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Command" element
     */
    public void setCommand(com.eviware.soapui.config.TestOnDemandCommandConfig command)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandCommandConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().find_element_user(COMMAND$0, 0);
            if (target == null)
            {
                target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().add_element_user(COMMAND$0);
            }
            target.set(command);
        }
    }
    
    /**
     * Appends and returns a new empty "Command" element
     */
    public com.eviware.soapui.config.TestOnDemandCommandConfig addNewCommand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.eviware.soapui.config.TestOnDemandCommandConfig target = null;
            target = (com.eviware.soapui.config.TestOnDemandCommandConfig)get_store().add_element_user(COMMAND$0);
            return target;
        }
    }
}
